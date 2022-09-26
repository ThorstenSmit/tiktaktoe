package TikTakToe;

import javax.swing.Icon;


public class Kaestchen { 
     
    private boolean isKreis;
    private Icon icon;

    public Kaestchen(boolean isKreis) {
        this.isKreis = isKreis;
    }

    public Icon getIcon() {
        return icon;
    }

    public boolean isIsKreis() {
        return isKreis;
    }
    
}
