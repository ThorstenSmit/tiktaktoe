package TikTakToe;

public class Spielfeld {

    private Kaestchen[][] kaestechenListe;

    public Spielfeld() {
        this.kaestechenListe = new Kaestchen[3][3];
    }

    public Kaestchen[][] getKaestechenListe() {
        return kaestechenListe;
    }

    public boolean setKaestchen(boolean spielerAmZug, int xPos, int yPos) {
        if (this.getKaestechenListe()[xPos][yPos] == null) {
            this.kaestechenListe[xPos][yPos] = new Kaestchen(spielerAmZug);
            return true;
        }
        return false;
    }

}
