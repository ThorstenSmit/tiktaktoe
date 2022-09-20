package TikTakToe;

public class Spielstand {

    public static boolean isDrueckbar(Spielfeld spielfeld, int xPos, int yPos) {
        if (spielfeld.getKaestechenListe()[xPos][yPos] == null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isFeldVoll(Spielfeld spielfeld) {
        return true;
    }

    public static boolean hatGewonnen(Spielfeld spielfeld) {
        return true;
    }

}
