/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author VICTOR SERRANO
 */
public class Pruebas {

    public static void Poker() {
        System.out.println("\n*****Prueba de Poker*****");
        ArrayList<Double> n = new ArrayList<>();
        
        double valoresLista[] = {0.64138, 0.55837, 0.81593, 0.04994, 0.61265, 0.06787, 0.30465, 0.54264, 0.81159, 0.61163, 0.47681, 0.52127, 0.69239, 0.92006, 0.37913, 0.32035,
            0.37248, 0.57836, 0.19180, 0.28920, 0.79302, 0.08124, 0.53401, 0.48201, 0.03268, 0.38087, 0.68054, 0.69251, 0.60284, 0.69351, 0.64264, 0.22409,
            0.80242, 0.58071, 0.31629, 0.03585, 0.46034, 0.57039, 0.15096, 0.15523, 0.64388, 0.83371, 0.04198, 0.49796, 0.16087, 0.68317, 0.39974, 0.48571,
            0.93409, 0.90760, 0.59867, 0.10238, 0.57576, 0.20976, 0.25934, 0.27937, 0.74035, 0.26204, 0.06659, 0.75064, 0.08396, 0.14600, 0.07700, 0.76808,
            0.90808, 0.19125, 0.71868, 0.31794, 0.81621, 0.47948, 0.93661, 0.72871, 0.96122, 0.52904, 0.18658, 0.81139, 0.71166, 0.92589, 0.23092, 0.92253,
            0.81515, 0.91642, 0.93912, 0.59072, 0.38699, 0.22783, 0.54638, 0.59725, 0.30204, 0.63166, 0.07339, 0.65144, 0.81809, 0.01614, 0.86034, 0.05137,
            0.50878, 0.98290, 0.41824, 0.97056};
        for (int i = 0; i < valoresLista.length; i++) {
            n.add(valoresLista[i]);
        }
        int diferentes = 0, par = 0, par2 = 0, tercia = 0, full = 0, poker = 0, quintilla = 0;
        String aux, numero;
        for (int i = 0; i < (n.size()); i++) {
            DecimalFormat df = new DecimalFormat("0.00000");
            String numeroaux = df.format(n.get(i));
            numero = numeroaux.substring(2, numeroaux.length());
            
            String x[] = numero.split("");
            int auxnum[] = new int[10];
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < x.length; k++) {
                    if (x[k].equals(String.valueOf(j))) {
                        auxnum[j]++;
                    }
                }
                if (j == 9) {
                    int paraux = 0, terciaux = 0, pokeraux = 0, quintillaaux = 0;
                    for (int k = 0; k < 10; k++) {
                        if (auxnum[k] == 2) {
                            paraux++;
                        }
                        if (auxnum[k] == 3) {
                            terciaux++;
                        }
                        if (auxnum[k] == 4) {
                            pokeraux++;
                        }
                        if (auxnum[k] == 5) {
                            quintillaaux++;
                        }
                    }
                    if (paraux != 0) {
                        if (paraux == 2) {
                            par2++;
                        } else if (terciaux == 1) {
                            full++;
                        } else {
                            par++;
                        }
                    } else if (terciaux == 1) {
                        tercia++;
                    } else if (pokeraux == 1) {
                        poker++;
                    } else if (quintillaaux == 1) {
                        quintilla++;
                    } else {
                        diferentes++;
                    }
                }
            }
        }
        double resultado = (Math.pow((diferentes - (n.size() * 0.3024)), 2) / (n.size() * 0.3024)) + (Math.pow((par - (n.size() * 0.504)), 2) / (n.size() * 0.504))
                + (Math.pow((par2 - (n.size() * 0.108)), 2) / (n.size() * 0.108)) + (Math.pow((tercia - (n.size() * 0.072)), 2) / (n.size() * 0.072))
                + (Math.pow((full - (n.size() * 0.009)), 2) / (n.size() * 0.009)) + (Math.pow((poker - (n.size() * 0.0045)), 2) / (n.size() * 0.0045))
                + (Math.pow((quintilla - (n.size() * 0.0001)), 2) / (n.size() * 0.0001));
        System.out.println("Diferentes: " + diferentes + "\nPares: " + par + "\nDoble Par:" + par2 + "\nTercia:" + tercia + "\nFull:" + full + "\nPoker:" + poker + "\nQuintilla:" + quintilla);
        System.out.println("\nResultado: " + resultado);
    }

    public static void Corridas() {
        System.out.println("\n*****Prueba de Corridas*****");
        ArrayList<Double> n = new ArrayList<>();
        double valoresLista[] = {0.64138, 0.55837, 0.81593, 0.04994, 0.61265, 0.06787, 0.30465, 0.54264, 0.81159, 0.61163, 0.47681, 0.52127, 0.69239, 0.92006, 0.37913, 0.32035,
            0.37248, 0.57836, 0.19180, 0.28920, 0.79302, 0.08124, 0.53401, 0.48201, 0.03268, 0.38087, 0.68054, 0.69251, 0.60284, 0.69351, 0.64264, 0.22409,
            0.80242, 0.58071, 0.31629, 0.03585, 0.46034, 0.57039, 0.15096, 0.15523, 0.64388, 0.83371, 0.04198, 0.49796, 0.16087, 0.68317, 0.39974, 0.48571,
            0.93409, 0.90760, 0.59867, 0.10238, 0.57576, 0.20976, 0.25934, 0.27937, 0.74035, 0.26204, 0.06659, 0.75064, 0.08396, 0.14600, 0.07700, 0.76808,
            0.90808, 0.19125, 0.71868, 0.31794, 0.81621, 0.47948, 0.93661, 0.72871, 0.96122, 0.52904, 0.18658, 0.81139, 0.71166, 0.92589, 0.23092, 0.92253,
            0.81515, 0.91642, 0.93912, 0.59072, 0.38699, 0.22783, 0.54638, 0.59725, 0.30204, 0.63166, 0.07339, 0.65144, 0.81809, 0.01614, 0.86034, 0.05137,
            0.50878, 0.98290, 0.41824, 0.97056};
        for (int i = 0; i < valoresLista.length; i++) {
            n.add(valoresLista[i]);
        }
        double n1 = 0, n2 = 0, cont = 1;
        double desv = 0.0, promedio = 0.0;
        int con[] = new int[n.size()];
        double suma = 0;
        for (int i = 0; i < n.size(); i++) {
            if (n.get(i) < 0.5) {
                n2++;
                con[i] = 1;
            } else {
                n1++;
                con[i] = 0;
            }
            suma = suma + n.get(i);
            if (i != 0) {
                if (con[i] != con[i - 1]) {
                    cont++;
                }
            }
        }
        promedio = ((2 * n1 * n2) / n.size()) + 1;
        desv = (((2 * n1 * n2) * (2 * n1 * n2 - n.size())) / ((Math.pow(n.size(), 2)) * (n.size() - 1)));
        double h = 0.00;
        if (cont < promedio) {
            h = 0.5;
        } else {
            h = -0.5;
        }
        double Sr = Math.sqrt(desv);
        double Zo = (cont + h - promedio) / Sr;
        System.out.println("N1: " + n1 + "\nN2: " + n2 + "\nSumatoria: " + suma + "\nCorridas: " + cont + "\nPromedio de Corridas: " + promedio + "\nDesviacion: " + desv + "\nH: " + h + "\nSr: " + Sr + "\nEstadistico Zo: " + Zo);
        if (Zo < 1.96 && Zo > -1.96) {
            System.out.println("\nLa muestra sigue una secuencia aleatoria");
        } else {
            System.out.println("\nLa muestra no sigue una secuencia aleatoria");
        }
    }

}
