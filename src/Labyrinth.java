import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Labyrinth implements ILabyrinth {
    private final HashMap<Integer, List<Feld>> spielFeld;

    private Feld zielFeld;

    public Labyrinth() {
        this.spielFeld = new HashMap<>();
        this.zielFeld = null;
    }

    @Override
    public void setZielFeld(Feld feld) {
        this.zielFeld = feld;
    }

    @Override
    public void feldHinzufuegen(Feld feld) throws Exception {
        int x = feld.getPosX();
        int y = feld.getPosY();

        if (x < 0) throw new Exception("X-Koordinate des Feldes wurde nicht gesetzt.");
        if (y < 0) throw new Exception("Y-Koordinate des Feldes wurde nicht gesetzt.");

        int anzahlReihen = this.getAnzahlReihen();
        List<Feld> lFelder;
        if (y < anzahlReihen) {
            // setze neue X-Koordinate des Feldes
            lFelder = this.spielFeld.get(y);
            feld.setPosX(lFelder.size());
            // wird unter bestehendem key der HashMap eingefügt
            this.spielFeld.get(y).add(feld);
        } else if (y == anzahlReihen) {
            // ein neuer key wird angelegt, um Feld zu speichern
            this.spielFeld.put(y, new ArrayList<>());
            this.spielFeld.get(y).add(feld);
        } else {
            throw new Exception("Wert für y ist zu hoch. Anzahl belegbarer Spalten beträgt " + anzahlReihen);
        }
    }

    @Override
    public void spielfeldAnzeigen() {
        StringBuilder outputString = new StringBuilder();

        List<Feld> lFelder;
        Feld feld;
        int localCharCounterToTop, localCharCounterToMid;
        int charStart;
        for (int x=0; x < this.spielFeld.size(); x++) {
            lFelder = this.spielFeld.get(x);
            localCharCounterToTop = 0;
            localCharCounterToMid = 0;
            for (Feld value : lFelder) {
                feld = value;
                charStart = outputString.length()-localCharCounterToTop;
                // potentielle Wand oben: ###
                if (feld.hatWandO()) {
                    outputString.insert(charStart, "###");
                } else {
                    outputString.insert(charStart, "# #");
                }
                charStart += 3;
                if (localCharCounterToTop == 0) {
                    outputString.insert(charStart, "\n");
                    localCharCounterToTop++;
                }
                charStart = outputString.length()-localCharCounterToMid;
                // potentielle Wand links: #
                if (feld.hatWandL()) {
                    outputString.insert(charStart, "#");
                } else {
                    outputString.insert(charStart, " ");
                }
                charStart++;
                localCharCounterToTop++;
                // freies Feld
                outputString.insert(charStart, " ");
                charStart++;
                localCharCounterToTop++;
                if (feld.hatWandR()) {
                    outputString.insert(charStart, "#");
                } else {
                    outputString.insert(charStart, " ");
                }
                charStart++;
                localCharCounterToTop++;
                if (localCharCounterToMid == 0) {
                    outputString.insert(charStart, "\n");
                    localCharCounterToTop++;
                    localCharCounterToMid++;
                }
                charStart = outputString.length();
                // potentielle Wand unten: ###
                if (feld.hatWandU()) {
                    outputString.insert(charStart, "###");
                } else {
                    outputString.insert(charStart, "# #");
                }
                localCharCounterToTop += 3;
                localCharCounterToMid += 3;
            }
            outputString.append("\n");
        }

        System.out.println(outputString);
    }

    @Override
    public Integer getAnzahlReihen() {
        return this.spielFeld.size();
    }

    @Override
    public Integer getAnzahlSpalten() {
        // nach höchster Spalten Anzahl suchen
        int maxSpalten = 0;

        List<Feld> lFelder;
        for (int x=0; x < this.spielFeld.size(); x++) {
            lFelder = this.spielFeld.get(x);
            if (lFelder.size() > maxSpalten)
                maxSpalten = lFelder.size();
        }

        return maxSpalten;
    }
}
