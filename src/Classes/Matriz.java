
package Classes;

import java.util.ArrayList;


public class Matriz {
    
    private static ArrayList<Quadrado> matriz = new ArrayList<Quadrado>();

    public ArrayList<Quadrado> getMatriz() {
        return matriz;
    }

    public void setMatriz(ArrayList<Quadrado> matriz) {
        this.matriz = matriz;
    }
    
    public void add(Quadrado quadrado) {
        this.matriz.add(quadrado);
    }
    
    public Quadrado getQuadrado(int x, int y) {
        
        for(Quadrado i : matriz) {
            if(i.getX() == x && i.getY() == y){
                return i;
            }
        }
        
        return null;
    }
    
    public int getIndex(int x, int y) {
        

        for(int i=0; i<matriz.size(); i++) {
            if(matriz.get(i).getX() == x && matriz.get(i).getY() == y){
                return i;
            }
        }
        
        return -1;
    }
}
