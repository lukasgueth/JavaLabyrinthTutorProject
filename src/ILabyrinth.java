public interface ILabyrinth {

    /**
     * Fügt dem gesamten Spielfeld ein Feld hinzu. Sortiert das Feld nach gleichen Y- und jeweiligen aufsteigenden X-Koordinaten.
     * Fügt das Feld nur ein, wenn kleiner als die Anzahl der belegten Reihen ist (nicht "echt kleiner").
     * Setzt nach Einfügen die neue Y-Koordinate des Feldes.
     * @param feld Das hinzuzufügende Feld
     */
    void feldHinzufuegen(Feld feld) throws Exception;

    /**
     * Gibt das aktuelle Spielfeld in der Konsole aus.
     */
    void spielfeldAnzeigen();

    /**
     * Zählt die Reihen des Feldes, gibt die höchste Y-Koordinate +1 aus.
     * @return Anzahl der mit zmd. einem Feld belegten Reihen des Feldes
     */
    Integer getAnzahlReihen();

    /**
     * Zählt die Reihen des Feldes, gibt die höchste X-Koordinate +1 aus.
     * @return Anzahl der mit zmd. einem Feld belegten Spalten des Feldes
     */
    Integer getAnzahlSpalten();
}
