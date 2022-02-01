public interface IFeld {

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

