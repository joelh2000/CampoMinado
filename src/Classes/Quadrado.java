
package Classes;

import javax.swing.JLabel;

public class Quadrado {
    private JLabel label;
    private int x;
    private int y;
    private String icon;
    private int statusCliked;
    private int tipo;

    public Quadrado(JLabel label, int x, int y) {
        this.x = x;
        this.y = y;
        this.label = label;
        this.icon = "CampoVazio";
        this.label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/"+"CampoVazio"+".png")));
    }
    
    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String nome,JLabel label) {
        this.icon = nome;
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/"+nome+".png")));
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    
    public int getStatusCliked() {
        return statusCliked;
    }

    public void setStatusCliked(int statusCliked) {
        this.statusCliked = statusCliked;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    

    
  
    
    
            
}
