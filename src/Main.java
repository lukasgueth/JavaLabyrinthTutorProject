public class Main {
    public static void main(String[] args) throws Exception {
        Labyrinth lab = new Labyrinth();
        lab.feldHinzufuegen(new Feld(true, true, true, false));
        lab.feldHinzufuegen(new Feld(true, false, false, false));
        lab.feldHinzufuegen(new Feld(true, false, false, true));
        Feld feld2 = new Feld(true, true, true, false);
        feld2.setPosY(1);
        lab.feldHinzufuegen(feld2);
        Feld feld3 = new Feld(false, true, false, true);
        feld3.setPosY(1);
        lab.feldHinzufuegen(feld3);
        Feld feld4 = new Feld(false, true, true, false);
        feld4.setPosY(1);
        lab.feldHinzufuegen(feld4);
        Feld feld5 = new Feld(true, true, false, true);
        feld5.setPosY(1);
        lab.feldHinzufuegen(feld5);
        lab.spielfeldAnzeigen();
    }
}
