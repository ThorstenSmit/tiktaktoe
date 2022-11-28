package TikTakToe;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Kaestchen {

    private boolean isKreis;
    private final ImageIcon xIcon = new ImageIcon("src/main/java/TikTakToe/Xicon.png");
    private final ImageIcon oIcon = new ImageIcon("src/main/java/TikTakToe/Oicon.png");
    private Icon icon;

    public Kaestchen(boolean isKreis) {
        this.isKreis = isKreis;
        icon = this.isKreis ? (Icon) oIcon : (Icon) xIcon;
    }

    public Icon getIcon() {
        return icon;
    }

    public boolean isIsKreis() {
        return isKreis;
    }

}
