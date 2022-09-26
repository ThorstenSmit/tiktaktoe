package TikTakToe;

public class Spielstand {

    public static boolean isDrueckbar(Spielfeld spielfeld, int xPos, int yPos) {
        return spielfeld.getKaestechenListe()[xPos][yPos] == null;
    }

    public static boolean isFeldVoll(Spielfeld spielfeld) {
        return true;
    }

    public static boolean hatGewonnen(Spielfeld spielfeld) {
        return true;
    }

}
