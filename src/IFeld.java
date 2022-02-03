public interface IFeld extends Comparable<Feld> {

    /**
     * Vergleicht das aktuelle Feld mit einem anderen Feld, basierend auf den X- und Y-Koordinaten des Feldes.
     * Sind die Koordinaten gleich, gibt die Methode 0 zurück, wenn die Y-Koordinaten kleiner sind, -1, sonst 1.
     * @param feld Das zu vergleichende Feld.
     */
    @Override
    int compareTo(Feld feld);

    /**
     * Setzt die aktuelle X-Koordinate des Feldes.
     * @param x Wert der X-Koordinate
     */
    void setPosX(Integer x);

    /**
     * Setzt die aktuelle Y-Koordinate des Feldes.
     * @param y Wert der Y-Koordinate
     */
    void setPosY(Integer y);

    /**
     * Gibt die aktuelle X-Koordinate des Feldes zurück.
     * @return Integer
     */
    Integer getPosX();

    /**
     * Gibt die aktuelle Y-Koordinate des Feldes zurück.
     * @return Integer
     */
    Integer getPosY();

    /**
     * Gibt zurück, ob das Feld oben eine Wand hat.
     * @return boolean
     */
    boolean hatWandO();

    /**
     * Gibt zurück, ob das Feld unten eine Wand hat.
     * @return boolean
     */
    boolean hatWandU();

    /**
     * Gibt zurück, ob das Feld links eine Wand hat.
     * @return boolean
     */
    boolean hatWandL();

    /**
     * Gibt zurück, ob das Feld rechts eine Wand hat.
     * @return boolean
     */
    boolean hatWandR();

}

