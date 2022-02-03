public class Feld implements IFeld {
    private Integer posX;
    private Integer posY;
    private final Boolean wandO;
    private final Boolean wandU;
    private final Boolean wandL;
    private final Boolean wandR;

    public Feld(Boolean wandO, Boolean wandU, Boolean wandL, Boolean wandR) {
        posX = 0;
        posY = 0;
        this.wandO = wandO;
        this.wandU = wandU;
        this.wandL = wandL;
        this.wandR = wandR;
    }

    @Override
    public int compareTo(Feld feld) {
        if (this.posY.equals(feld.getPosY()) && this.posX.equals(feld.getPosX()))
            return 0;
        if (this.posY < feld.getPosY()) return -1;
        return 1;
    }

    @Override
    public void setPosX(Integer x) {
        posX = x;
    }

    @Override
    public void setPosY(Integer y) {
        posY = y;
    }

    @Override
    public Integer getPosX() {
        return posX;
    }

    @Override
    public Integer getPosY() {
        return posY;
    }

    @Override
    public boolean hatWandO() {
        return wandO;
    }

    @Override
    public boolean hatWandU() {
        return wandU;
    }

    @Override
    public boolean hatWandL() {
        return wandL;
    }

    @Override
    public boolean hatWandR() {
        return wandR;
    }

}
