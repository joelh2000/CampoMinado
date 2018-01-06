
package model;

import Classes.Matriz;
import Classes.Quadrado;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class ControlMatriz {
    
    Matriz matriz = new Matriz();
    
    public ControlMatriz() {
        
    }

    public void calcularBombas(Quadrado quadrado) {

        int quantidadeBombas = 0;

        int pontoX = quadrado.getX();
        int pontoY = quadrado.getY();

        // pecorrer todos os campos que não tenha bomba
        if (quadrado.getTipo() != -1) {

            /*
                        0 1 2
                        3 C 4    C => Ponto central
                        5 6 7
                    
                        (2,3) (2,3) (2,3)
                        (3,2) (3,3) (3,4)    C => Ponto central
                        (4,3) (4,3) (4,3)
             */
            // Ponto 0 
            try {
                
                if(matriz.getQuadrado(pontoX - 1, pontoY - 1).getTipo() == -1){
                    quantidadeBombas += 1;
                }

                System.out.println("Ponto 0: " + matriz.getQuadrado(pontoX - 1, pontoY - 1).getTipo());

            } catch (NullPointerException e) {
                System.out.println("Posição não existe");

            }

            // Ponto 1
            try {
                
                if(matriz.getQuadrado(pontoX, pontoY - 1).getTipo() == -1){
                    quantidadeBombas += 1;
                }
                
                System.out.println("Ponto 0: " + matriz.getQuadrado(pontoX, pontoY - 1).getTipo());


            } catch (NullPointerException e) {
                System.out.println("Posição não existe");

            }

            // Ponto 2
            try {
                if(matriz.getQuadrado(pontoX + 1, pontoY - 1).getTipo() == -1){
                    quantidadeBombas += 1;
                }
                
                System.out.println("Ponto 0: " + matriz.getQuadrado(pontoX + 1, pontoY - 1).getTipo());

            } catch (NullPointerException e) {
                System.out.println("Posição não existe");

            }

            // Ponto 3
            try {
                if(matriz.getQuadrado(pontoX - 1, pontoY).getTipo() == -1){
                    quantidadeBombas += 1;
                }
                
                System.out.println("Ponto 0: " + matriz.getQuadrado(pontoX - 1, pontoY).getTipo());

            } catch (NullPointerException e) {
                System.out.println("Posição não existe");

            }

            // Ponto 4
            try {
                if(matriz.getQuadrado(pontoX + 1, pontoY).getTipo() == -1){
                    quantidadeBombas += 1;
                }
                
                System.out.println("Ponto 0: " + matriz.getQuadrado(pontoX + 1, pontoY ).getTipo());

            } catch (NullPointerException e) {
                System.out.println("Posição não existe");

            }

            // Ponto 5
            try {
                if(matriz.getQuadrado(pontoX - 1, pontoY + 1).getTipo() == -1){
                    quantidadeBombas += 1;
                }
                
                System.out.println("Ponto 0: " + matriz.getQuadrado(pontoX - 1, pontoY + 1).getTipo());


            } catch (NullPointerException e) {
                System.out.println("Posição não existe");

            }

            // Ponto 6
            try {
                if(matriz.getQuadrado(pontoX, pontoY + 1).getTipo() == -1){
                    quantidadeBombas += 1;
                }
                
                System.out.println("Ponto 0: " + matriz.getQuadrado(pontoX, pontoY + 1).getTipo());

            } catch (NullPointerException e) {
                System.out.println("Posição não existe");

            }

            // Ponto 7
            try {
                if(matriz.getQuadrado(pontoX + 1, pontoY + 1).getTipo() == -1){
                    quantidadeBombas += 1;
                }
                
                System.out.println("Ponto 0: " + matriz.getQuadrado(pontoX + 1, pontoY + 1).getTipo());

            } catch (NullPointerException e) {
                System.out.println("Posição não existe");

            }

            // Ponto Central
            try {
                matriz.getQuadrado(pontoX, pontoY).setTipo(quantidadeBombas);

                System.out.println("QUANTIDADE DE BOMBAS: "+quantidadeBombas);
                if (quantidadeBombas == 1) {
                    matriz.getQuadrado(pontoX, pontoY).setIcon("CampoUm");
                   // matriz.getQuadrado(pontoX, pontoY).setIcon("CampoUm", matriz.getQuadrado(pontoX, pontoY).getLabel());
                } else if (quantidadeBombas == 2) {
                    matriz.getQuadrado(pontoX, pontoY).setIcon("CampoDois");
                    //matriz.getQuadrado(pontoX, pontoY).setIcon("CampoDois", matriz.getQuadrado(pontoX, pontoY).getLabel());
                } else if (quantidadeBombas == 3) {
                    matriz.getQuadrado(pontoX, pontoY).setIcon("CampoTres");
                    //matriz.getQuadrado(pontoX, pontoY).setIcon("CampoTres", matriz.getQuadrado(pontoX, pontoY).getLabel());
                } else if (quantidadeBombas == 4) {
                    matriz.getQuadrado(pontoX, pontoY).setIcon("CampoQuatro");
                   // matriz.getQuadrado(pontoX, pontoY).setIcon("CampoQuatro", matriz.getQuadrado(pontoX, pontoY).getLabel());
                } else if (quantidadeBombas == 5) {
                    matriz.getQuadrado(pontoX, pontoY).setIcon("CampoCinco");
                   // matriz.getQuadrado(pontoX, pontoY).setIcon("CampoCinco", matriz.getQuadrado(pontoX, pontoY).getLabel());
                } else if (quantidadeBombas == 6) {
                    matriz.getQuadrado(pontoX, pontoY).setIcon("CampoSeis");
                    //matriz.getQuadrado(pontoX, pontoY).setIcon("CampoSeis", matriz.getQuadrado(pontoX, pontoY).getLabel());
                } else if (quantidadeBombas == 7) {
                    matriz.getQuadrado(pontoX, pontoY).setIcon("CampoSete");
                    ///matriz.getQuadrado(pontoX, pontoY).setIcon("CampoSete", matriz.getQuadrado(pontoX, pontoY).getLabel());
                } else if (quantidadeBombas == 8) {
                    matriz.getQuadrado(pontoX, pontoY).setIcon("CampoOito");
                    //matriz.getQuadrado(pontoX, pontoY).setIcon("CampoOito", matriz.getQuadrado(pontoX, pontoY).getLabel());
                }

            } catch (NullPointerException e) {
                System.out.println("Posição não existe");

            }
        }

    }
    
    // [OKAY]
    public void mostra(String t) {
        for(Quadrado quadrado : matriz.getMatriz()){
            quadrado.setIcon(t);
        }
    }
    
    // [OKAY]
    public void plantarDicasNumericas() {
        for(Quadrado q : matriz.getMatriz()){
            calcularBombas(q);
        }
    }
    
    // [OKAY]
    public void print() {
        for(Quadrado q : matriz.getMatriz()){

            System.out.println("                      Tipo: " + q.getTipo());
            //System.out.println("X: " + q.getX() + " Y: " + q.getY());
        }
    }
    
    // [OKAY]
    public void plantarBombaRandomizada() {
        
        int xRandom = 0;
        int yRandom = 0;
        int index = 0;
        
        LinkedHashSet<Integer> posicoesBombas = new LinkedHashSet<>();

        // enquanto não tiver
        while(posicoesBombas.size() < numeroBombas()) {
            
            xRandom = 1 + (int)(Math.random() * 10);
            yRandom = 1 + (int)(Math.random() * 10);
            
            // o index será o campo que vai ficar a bomba
            index = matriz.getIndex(xRandom, yRandom);
            
            //
            posicoesBombas.add(index);
            
            matriz.getMatriz().get(index).setTipo(-1); 
            matriz.getMatriz().get(index).setIcon("CampoBomba");
            //matriz.getMatriz().get(index).setIcon("CampoBomba", matriz.getQuadrado(xRandom, yRandom).getLabel());
        
        }
        
    }
    int index = 0;

    
    // [OKAY]
    public int numeroBombas() {
        return 10;
    }
    
    // [OKAY]
    public void inicializarMetodos() {
        
        // colocando bombas randomicas
        plantarBombaRandomizada();
        
        //calcularBombas();
        plantarDicasNumericas();
        
        // imprimindo os tipos de quadrado
        print();
        
    }
    
    // [OKAY]
    boolean clickedActive = true;
    public void eventMouseEsquerdoClicked(Quadrado quadrado) {
    
        System.out.println("Clicou no campo: ("+quadrado.getX()+","+quadrado.getY()+") com o botão esquerdo");
        
        if(clickedActive){
            
            if(quadrado.getTipo() >= 1 && quadrado.getTipo() <= 8) {

                if(quadrado.getTipo() == 1) {
                    quadrado.setIcon("CampoUm", quadrado.getLabel());
                }else if(quadrado.getTipo() == 2) { 
                    quadrado.setIcon("CampoDois", quadrado.getLabel());
                }else if(quadrado.getTipo() == 3) { 
                    quadrado.setIcon("CampoTres", quadrado.getLabel());
                }else if(quadrado.getTipo() == 4) { 
                    quadrado.setIcon("CampoQuatro", quadrado.getLabel());
                }else if(quadrado.getTipo() == 5) { 
                    quadrado.setIcon("CampoCinco", quadrado.getLabel());
                }else if(quadrado.getTipo() == 6) { 
                    quadrado.setIcon("CampoSeis", quadrado.getLabel());
                }else if(quadrado.getTipo() == 7) { 
                    quadrado.setIcon("CampoSete", quadrado.getLabel());
                }else if(quadrado.getTipo() == 8) { 
                    quadrado.setIcon("CampoOito", quadrado.getLabel());
                }
                
            }else if(quadrado.getTipo() == -1){
                
                mostrarBombas(quadrado);
                clickedActive = false; 
                
            }else if(quadrado.getTipo() == 0){
                
                mostrarCamposNaMatriz(quadrado);

                //if(liberaEspacoMouseClicked()) {
                
                //}else if(liberaEspacoMouseClicked() == false) {
                    quadrado.setIcon("CampoVazioClicked", quadrado.getLabel());
                //}
                

            }
            
        }

    }
    
    public int[] larguraMaxMin(Quadrado quadrado) {
    
        int XclickedAltura = quadrado.getX();
        int YclickedLargura = quadrado.getY();

        int YInicial = 1;
        int YFinal = 1;
        //int[] horizontal =
        
        // Descobrindo o inicio da linha horizontal
        for (int y = YclickedLargura; y > 0; y--) {
            if(matriz.getQuadrado(XclickedAltura, y).getTipo() == -1) {
                YInicial = y+1;
                break;
            }
        }
        
        // Descobrindo o fim da linha horizontal
        for (int y = YInicial; y <= 10; y++) {
            if(matriz.getQuadrado(XclickedAltura, y).getTipo() == -1) {
                YFinal = y-1;
                break;
            }
        }
    
        
        return new int[]{YInicial,YFinal};
    }
    
    public int[] alturaMaxMin(Quadrado quadrado, int PosicaoLarguraY) {
    
        int XclickedAltura = quadrado.getX();
        int YclickedLargura = quadrado.getY();

        int XInicial = 1;
        int XFinal = 1;
        //int[] horizontal =
        
        // Descobrindo o inicio da linha vertical
        for (int x = XclickedAltura; x > 0; x--) {
            if(matriz.getQuadrado(x, PosicaoLarguraY).getTipo() == -1) {
                XInicial = x+1;
                break;
            }
        }
        
        // Descobrindo o fim da linha vertical
        for (int x = XclickedAltura; x <= 10; x++) {
            if(matriz.getQuadrado(x, PosicaoLarguraY).getTipo() == -1) {
                XFinal = x-1;
                break;
            }
        }
    
        
        return new int[]{XInicial,XFinal};
    }
    
    public int mostrarCamposNaMatriz(Quadrado quadrado) {

        LinkedHashSet<int[]> pontos = new LinkedHashSet<>();

        int XclickedAltura = quadrado.getX();
        int YclickedLargura = quadrado.getY();

        int YInicial = larguraMaxMin(quadrado)[0];
        int YFinal = larguraMaxMin(quadrado)[1];

        
        // Mapeando as areas
        for(int y = YInicial; y<= YFinal; y++){

            // Mapeando os pontos
            for (int x = alturaMaxMin(quadrado,y)[0]; x <= alturaMaxMin(quadrado,y)[1]; x++) {
                pontos.add(new int[]{x,y});
            }
        }
        
        for (int[] i : pontos) {

            if (matriz.getQuadrado(i[0], i[1]).getTipo() == 1) {
                matriz.getQuadrado(i[0], i[1]).setIcon("CampoUm", matriz.getQuadrado(i[0], i[1]).getLabel());
            } else if (matriz.getQuadrado(i[0], i[1]).getTipo() == 2) {
                matriz.getQuadrado(i[0], i[1]).setIcon("CampoDois", matriz.getQuadrado(i[0], i[1]).getLabel());
            } else if (matriz.getQuadrado(i[0], i[1]).getTipo() == 3) {
                matriz.getQuadrado(i[0], i[1]).setIcon("CampoTres", matriz.getQuadrado(i[0], i[1]).getLabel());
            } else if (matriz.getQuadrado(i[0], i[1]).getTipo() == 4) {
                matriz.getQuadrado(i[0], i[1]).setIcon("CampoQuatro", matriz.getQuadrado(i[0], i[1]).getLabel());
            } else if (matriz.getQuadrado(i[0], i[1]).getTipo() == 5) {
                matriz.getQuadrado(i[0], i[1]).setIcon("CampoCinco", matriz.getQuadrado(i[0], i[1]).getLabel());
            } else if (matriz.getQuadrado(i[0], i[1]).getTipo() == 6) {
                matriz.getQuadrado(i[0], i[1]).setIcon("CampoSeis", matriz.getQuadrado(i[0], i[1]).getLabel());
            } else if (matriz.getQuadrado(i[0], i[1]).getTipo() == 7) {
                matriz.getQuadrado(i[0], i[1]).setIcon("CampoSete", matriz.getQuadrado(i[0], i[1]).getLabel());
            } else if (matriz.getQuadrado(i[0], i[1]).getTipo() == 8) {
                matriz.getQuadrado(i[0], i[1]).setIcon("CampoOito", matriz.getQuadrado(i[0], i[1]).getLabel());
            } else if (matriz.getQuadrado(i[0], i[1]).getTipo() == 0) {
                matriz.getQuadrado(i[0], i[1]).setIcon("CampoVazioClicked", matriz.getQuadrado(i[0], i[1]).getLabel());
            }

        }
       
        return 0;

    }
    
    // [OKAY]
    static int repertA = 0;
    public void eventMouseDireitoClicked(Quadrado quadrado) {
    
        System.out.println("Clicou no campo: ("+quadrado.getX()+","+quadrado.getY()+") com o botão direito");
        
        iconEventClickedCampo(quadrado);

    }
    
    // [OKAY]
    public  void mostrarBombas(Quadrado quadrado) {
        
        for(Quadrado quadradoFor : matriz.getMatriz()) {
            if(quadradoFor.getX() == quadrado.getX() && quadradoFor.getY() == quadrado.getY()){
                quadrado.setIcon("CampoBombaClicked", quadrado.getLabel());
            }else{
                if(quadradoFor.getTipo() == -1){
                    quadradoFor.setIcon("CampoBomba", quadradoFor.getLabel());
                }
            }
        }
    }
    
    // [OKAY]
    public int quantidadeDeMarcador() {
        
        int quantidade = 0;
        
        for(Quadrado i : matriz.getMatriz()) {
            
            if(i.getIcon().equals("Marcador")) {
                quantidade += 1;
            }
            
        }
 
        return quantidade;
        
    }
    
    // [OKAY]
    public void iconEventClickedCampo(Quadrado quadrado) {

        int clickedMouseNumero = quadrado.getStatusCliked();

        if(clickedActive){
        
            if (clickedMouseNumero == 0) {

                if (quantidadeDeMarcador() >= numeroBombas()) {

                    JOptionPane.showMessageDialog(null, "Você não pode adicionar mais marcadores, já que tem mais marcadores do que bomba");

                    quadrado.setIcon("Duvida", quadrado.getLabel());
                    quadrado.setStatusCliked(clickedMouseNumero += 1);
                } else {
                    quadrado.setIcon("Marcador", quadrado.getLabel());
                }

                quadrado.setStatusCliked(clickedMouseNumero += 1);

            } else if (clickedMouseNumero == 1) {

                quadrado.setIcon("Duvida", quadrado.getLabel());
                quadrado.setStatusCliked(clickedMouseNumero += 1);

            } else if (clickedMouseNumero == 2) {

                quadrado.setIcon("CampoVazio", quadrado.getLabel());
                quadrado.setStatusCliked(clickedMouseNumero += 1);

            }

            // Para garantir que tenha o loop, caso clickedMouseNumero não seja nem 0, 1 ou 2
            if (clickedMouseNumero >= 3) {
                quadrado.setStatusCliked(0);
            }
        } 
        }
    }

