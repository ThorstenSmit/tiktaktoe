package TikTakToe;

public class SpielCtr {

    private Spielfeld spielfeld;
    private Boolean spielerAmZug = false;

    public SpielCtr() {
        this.spielfeld = new Spielfeld();
    }

    public void starteSpiel(GUI gui) {
        gui.resetGUI();
    }

    public Spielfeld getSpielfeld() {
        return spielfeld;
    }

    public boolean spielFeldButtonGedrueckt(int xPos, int yPos) {
        if (this.spielfeld.setKaestchen(this.spielerAmZug, xPos, yPos)) {
            System.out.println("Eins");
            this.wechselSpieler();
            return true;
        }
        return false;
    }

    public void wechselSpieler() {
        this.spielerAmZug = !this.spielerAmZug;
    }

    public void neuesSpielfeld() {

    }

}
