package org.project;

import java.util.Arrays;

public class Matrix {
    private final int rows;
    private final int cols;
    private final int[][] matrix;

    public Matrix(int row, int col){
        rows = row;
        cols = col;
        matrix = new int[(int)row][(int)col];
        for (int i = 0; i < matrix.length; i++){
            for (int i2 = 0; i2 < matrix[i].length; i2++){
                matrix[i][i2] = (int) (Math.random()*10)+1;
            }
        }
    }

    public Matrix(int row, int col, int[][] m){
        rows = row;
        cols = col;
        matrix = m;
    }

    public int getCols() {
        return cols;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public String toString(){
        String str = "";
        for (int[] i : matrix){
            str += Arrays.toString(i) + "\n";
        }
        return str;
    }

    public int getRows() {
        return rows;
    }

    public static Matrix multiplyMatrix(Matrix m1, Matrix m2)
    {
        int i, j, k;

        // Check if multiplication is Possible
        if (m2.getRows() != m1.getCols()) {

            System.out.println("Multiplication Not Possible");
            return new Matrix(0,0);
        }


        int[][] matrix = new int[m1.getRows()][m2.getCols()];

        for (i = 0; i < m1.getRows(); i++) {
            for (j = 0; j < m2.getCols(); j++) {
                for (k = 0; k < m2.getRows(); k++)
                    matrix[i][j] += m1.getMatrix()[i][k] * m2.getMatrix()[k][j];
            }
        }

        return new Matrix(m1.getRows(), m2.getCols(),matrix);
    }


}
