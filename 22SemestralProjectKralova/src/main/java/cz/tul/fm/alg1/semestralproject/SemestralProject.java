package cz.tul.fm.alg1.semestralproject;

import java.util.Scanner;

/**
 *
 * @author Eliška Králová
 */
public class SemestralProject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej rozmer matice: ");
        int rozmerMatice = sc.nextInt();
        while (rozmerMatice > 0) {

            int[][] matrix1 = new int[rozmerMatice][rozmerMatice];
            int[][] matrix2 = new int[rozmerMatice][rozmerMatice];
            System.out.println("Prvni matice: ");
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    matrix1[i][j] = sc.nextInt(); //zapis matice 
                }
            }
            System.out.println("Druha matice: ");
            for (int i = 0; i < matrix2.length; i++) {
                for (int j = 0; j < matrix2[i].length; j++) {
                    matrix2[i][j] = sc.nextInt(); //zapis matice  2
                }
            }

            if (tools.sameMatrixes(matrix1, matrix2)) {
                System.out.println("Matice jsou stejné");
            } else if (tools.horizontalSym(matrix1, matrix2)) {
                System.out.println("Zrcadlení dle horizontální osy");
            } else if (tools.verticalSym(matrix1, matrix2)) {
                System.out.println("Zrcadlení dle vertikální osy");
            } else if (tools.mainDiagSym(matrix1, matrix2)) {
                System.out.println("Zrcadlení dle hlavní diagonály");
            } else if (tools.antiDiagSym(matrix1, matrix2)) {
                System.out.println("Zrcadlení dle vedlejší diagonály");
            } else {
                System.out.println("Nenalezena transformace");
            }

            System.out.println("Zadej rozmer matice: ");
            rozmerMatice = sc.nextInt();
        }
    }
}
