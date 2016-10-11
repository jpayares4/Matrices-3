/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jpayares4
 */
public class Helper {

    public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }

    public static void limpiadoTabla(JTable tabla1) {
        int nf, nc;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla1.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    }

 public static int[][] pasoDeDatos(JTable tabla1) {
        int nf, nc;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        int m[][] = new int[nf][nc];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {

                m[i][j] = (int) tabla1.getValueAt(i, j);
            }

        }
        return m;
 }
   

     public static String recorridoArriba(int[][] m, int j) {
        int nf = m.length;
        String aux = "";
        for (int i = nf - 1; i >= 0; i--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoArriba(int[][] m, int j, int in, int fin) {
        int nf = m.length;
        String aux = "";
        for (int i = in; i >= fin; i--) {
            aux = aux + m[i][j] + " ,";
        }
        return aux;
    }

    public static String recorridoAbajo(int[][] m, int j) {
        int nf = m.length;
        String aux = "";
        for (int i = 0; i < nf; i++) {
            aux = aux + m[i][j] + " ,";
        }
        return aux;
    }

    public static String recorridoAbajo(int[][] m, int j, int in, int fin) {

        String aux = "";
        for (int i = in; i < fin; i++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    

    public static String recorridoDerecha(int[][] m, int i, int in, int fin) {
        int nc = m[0].length;
        String aux = "";
        for (int j = in; j <= fin; j++) {
            aux = aux + m[i][j] + " ,";
        }

        return aux;
    }

    public static String recorridoIzquierda(int[][] m, int i) {
        int nc = m[0].length;
        String aux = "";
        for (int j = nc - 1; j >= 0; j--) {
            aux = aux + m[i][j] + " ,";
        }

        return aux;
    }

    public static String recorridoIzquierdo(int[][] m, int i, int in, int fin) {
        int nc = m[0].length;
        String aux = "";
        for (int j = in; j >= fin; j--) {
            aux = aux + m[i][j] + " ,";
        }

        return aux;
    }

    public static String diagonalPrincipalAbajo(int[][] m) {
        int nf = m.length;
        String aux = "";
        for (int i = 0; i < nf; i++) {
            aux = aux + m[i][i] + " ,";
        }

        return aux;
    }

    public static String diagonalPrincipalArriba(int[][] m) {
        int nf = m.length;
        String aux = "";
        for (int i = nf - 1; i > 0; i--) {
            aux = aux + m[i][i] + " ,";
        }

        return aux;
    }
      public static String diagonalSecundariaArriba(int[][] m) {
        int nc = m[0].length;
        int nf = m.length;
        String aux = "";
        for (int i = nf - 1; i >= 0; i--) {
            aux = aux + m[i][nc - 1 - i] + ", ";
        }
           return aux;
           
      }
    public static String diagonalSecundariaAbajo(int[][] m) {
        int nc = m[0].length;
        int nf = m.length;
        String aux = "";
        for (int i = 0; i < nf; i++) {
            aux = aux + m[i][nc - 1 - i] + ", ";
        }

        return aux;
    }

    
    public static String diagonalSecundariaArriba(int[][] m, int in, int fin) {
        int nc = m[0].length;
        int nf = m.length;
        String aux = "";
        for (int i = in; i >= fin; i--) {
            aux = aux + m[i][nc - 1 - i] + ", ";
        }

        return aux;
    }

    public static String diagonalSecundariaAbajo(int[][] m, int in, int fin) {
        int nc = m[0].length;
        int nf = m.length;
        String aux = "";
        for (int i = in; i < fin; i++) {
            aux = aux + m[i][nc - 1 - i] + ",";
        }

        return aux;
    }

    public static String diagonalPrincipalArriba(int[][] m, int in, int fin) {
        int nf = m.length;
        String aux = "";
        for (int i = in; i >= fin; i--) {
            aux = aux + m[i][i] + ",";
        }

        return aux;
    }

    public static String diagonalPrincipalAbajo(int[][] m, int in, int fin) {
        int nf = m.length;
        String aux = "";
        for (int i = in; i < fin; i++) {
            aux = aux + m[i][i] + ",";
        }

        return aux;
    }

    public static String mostrar(int[][] m) {
        String aux = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                aux = aux + m[i][j] + "";
            }
            aux = aux + "\n";
        }
        return aux;
    }

    public static String recorridoUno(JTable tabla1) {
        int m[][] = pasoDeDatos(tabla1);
        int nf = m.length , nc = m[0].length ;
        String aux = "";
        aux = aux + Helper.recorridoDerecha(m,0,0,nf-2);
        aux = aux + Helper.recorridoAbajo(m,nc-1,0,nf/2+1);
        aux = aux + Helper.recorridoIzquierdo(m,nf/2,nc-2,1);
        aux = aux + Helper.recorridoAbajo(m,0,nc/2,nf-1+1);
        aux = aux + Helper.recorridoDerecha(m,nf-1,1,nc-1);
        return aux;
    }

    public static String recorridoDos(JTable tabla1) {
        int m[][] = pasoDeDatos(tabla1);
        int nf = m.length , nc = m[0].length ;
        String aux = "";
        aux = aux + Helper.recorridoArriba(m,0,nf-1,1);
        aux = aux + Helper.recorridoDerecha(m,0,0,nf/2);
        aux = aux + Helper.recorridoAbajo(m,nc/2,1,nf-1);
        aux = aux + Helper.recorridoDerecha(m,nf-1,nc/2,nc-1);
        aux = aux + Helper.recorridoArriba(m,nc-1,nf-2,0);
        return aux;
    }
    public static String recorridoTres(JTable tabla1) {
        int m[][] = pasoDeDatos(tabla1);
        int nf = m.length , nc = m[0].length ;
        String aux = "";     
        aux = aux + Helper.recorridoDerecha(m,nc/2-1,nf/2-1,nc/2-1);
        aux = aux + Helper.recorridoAbajo(m,nc/2,nf/2-1,nc/2);
        aux = aux + Helper.recorridoIzquierdo(m,nf/2,nc/2,2);
        aux = aux + Helper.recorridoArriba(m,1,nf/2,2);
        aux = aux + Helper.recorridoDerecha(m,nc/2-2,nf/2-2,nc/2 );
        aux = aux + Helper.recorridoAbajo(m,4,1,4);          
        return aux;

    }
    public static String recorridoCuatro(JTable tabla1) {
        int m[][] = pasoDeDatos(tabla1);
        int nf = m.length , nc = m[0].length ;
        String aux = "";
        aux = aux + Helper.recorridoDerecha(m,0,0,nc-2);
        aux = aux + Helper.diagonalSecundariaAbajo(m,0,nf-1);
        aux = aux + Helper.recorridoDerecha(m,nf-1,0,nc-1);
        return aux;
    }

    public static String recorridoCinco(JTable tabla1) {
        int m[][] = pasoDeDatos(tabla1);
        int nf = m.length , nc = m[0].length ;
        String aux = "";
        aux = aux + Helper.recorridoArriba(m,0,nf-1,1);
        aux = aux + Helper.diagonalPrincipalAbajo(m,0,nc/2+1);
        aux = aux + Helper.diagonalSecundariaArriba(m,nc/2-1,0);
        aux = aux + Helper.recorridoAbajo(m,nc-1,1,nf-1+1);
        return aux;
    }

    
}




