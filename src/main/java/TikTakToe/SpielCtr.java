package TikTakToe;

public class SpielCtr {
    
    private Spielfeld spielfeld;
    private Boolean spielerAmZug = false;
    private GUI gui;
    
    public SpielCtr(GUI gui) {
        this.gui = gui;
        this.spielfeld = new Spielfeld();
    }
    
    private void aktualisiereGUI() {
        
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
            this.gui.refreshButtonMatrix(this.getSpielfeld().getKaestechenListe());
            return true;
        }
        return false;
    }
    
    public void wechselSpieler() {
        this.spielerAmZug = !this.spielerAmZug;
    }
    
    public void neuesSpielfeld() {
        this.spielfeld = new Spielfeld();
        this.starteSpiel(gui);
    }
    
}
