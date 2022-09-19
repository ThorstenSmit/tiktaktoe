package TikTakToe;

public class SpielCtr {
    
    private Spielfeld spielfeld;
    private Boolean spielerAmZug;

    public SpielCtr() {
        this.spielfeld = new Spielfeld();
    }
    
    public void starteSpiel(GUI gui){
        gui.resetGUI();
    }

    public Spielfeld getSpielfeld() {
        return spielfeld;
    }
    
    public boolean spielFeldButtonGedrueckt(int xPos, int yPos){
        return true;
    }
    
    public void wechselSpieler(){
        this.spielerAmZug = !this.spielerAmZug;
    }
    
    public void neuesSpielfeld(){
        
    }
    
}
