package cz.tul.fm.alg1.semestralproject;

/**
 *
 * @author Eliška Králová
 */
public class tools {
        
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
    public static boolean verticalSym(int[][] mat1, int[][] mat2) {
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length / 2; j++) {
                if (mat1[i][j] != mat2[i][mat1.length - 1 - j]) {
                    return false;
                }
            }

        }
        return true;
    }
    
    /**
     * method compares 2 matrixes if they are the same via main diagonal
     * @param mat1
     * @param mat2
     * @return 
     */
    public static boolean mainDiagSym(int[][] mat1, int[][] mat2) {
        for (int i = 1; i < mat1.length; i++) {
            for (int j = 0; j < i; j++) {
                if (mat1[i][j] != mat2[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     * method compares 2 matrixes if they are the same via side diagonal
     * @param mat1
     * @param mat2
     * @return 
     */
    public static boolean antiDiagSym(int[][] mat1, int[][] mat2) {
        for (int i = 0, k = mat2.length - 1; i < mat1.length; i++, k--) {
            for (int j = 0, l = mat2[k].length - 1; j < mat1.length; j++, l--) {
                if (mat1[i][j] != mat2[l][k]) {
                    return false;
                }
            }

        }
        return true;
    }
    
    /**
      * method compares 2 matrixes if they are the same
      * @param mat1
      * @param mat2
      * @return 
      */
    public static boolean sameMatrixes(int[][] mat1, int[][] mat2) {
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
    
}
