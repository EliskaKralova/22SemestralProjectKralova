package cz.tul.fm.alg1.semestralproject;

/**
 *
 * @author Eliška Králová
 */
public class tools {
    /**
     * method prints out matrix
     * @param mat 
     */
     public static void vypis(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
     
     /**
      * method compares 2 matrixes if they are the same via horizontal axis
      * @param mat1
      * @param mat2
      * @return 
      */
    public static boolean horizontalSym(int[][] mat1, int[][] mat2) {
        for (int i = 0; i < mat1.length / 2; i++) {
            for (int j = 0; j < mat1.length; j++) {
                if (mat1[i][j] != mat2[mat1.length - 1 - i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * method compares 2 matrixes if they are the same via vertical axis
     * @param mat
     * @param mat2
     * @return 
     */
    public static boolean verticalSym(int[][] mat, int[][] mat2) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length / 2; j++) {
                if (mat[i][j] != mat2[i][mat[i].length - 1 - j]) {
                    return false;
                }
            }

        }
        return true;
    }
    
    /**
     * method compares 2 matrixes if they are the same via main diagonal
     * @param mat
     * @param mat2
     * @return 
     */
    public static boolean mainDiagSym(int[][] mat, int[][] mat2) {
        for (int i = 1; i < mat.length; i++) {
            for (int j = 0; j < i; j++) {
                if (mat[i][j] != mat2[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     * method compares 2 matrixes if they are the same via side diagonal
     * @param mat
     * @param mat2
     * @return 
     */
    public static boolean antiDiagSym(int[][] mat, int[][] mat2) {
        for (int i = 0, k = mat2.length - 1; i < mat.length; i++, k--) {
            for (int j = 0, l = mat2[k].length - 1; j < mat.length; j++, l--) {
                if (mat[i][j] != mat2[l][k]) {
                    return false;
                }
            }

        }
        return true;
    }
    
}
