package TikTakToe;

public class Spielstand {

    public static boolean isDrueckbar(Spielfeld spielfeld, int xPos, int yPos) {
        return (spielfeld.getKaestechenListe()[xPos][yPos] == null);
    }

    public static boolean isFeldVoll(Spielfeld spielfeld) {
        for (Kaestchen[] boxW : spielfeld.getKaestechenListe()) {
            for (Kaestchen boxH : boxW) {
                if (boxH == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean hatGewonnen(Spielfeld spielfeld) {
        return true;
    }

}
