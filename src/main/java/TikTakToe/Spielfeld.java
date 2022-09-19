package TikTakToe;

public class Spielfeld { 
    
    private Kaestchen[][] kaestechenListe;

    public Spielfeld() {
        this.kaestechenListe = new Kaestchen[3][3];
    }

    public Kaestchen[][] getKaestechenListe() {
        return kaestechenListe;
    }
    
    public boolean setKaestchen(int xPos, int yPos){
        return true;
    }
    
}
