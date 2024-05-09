package org.project;

public class App {
    public static void main( String[] args ) {
        Matrix m1 = new Matrix(2,2);
        Matrix m2 = new Matrix(2,2);
        System.out.println(m1);
        System.out.println(m2);
        Matrix m3 = Matrix.multiplyMatrix(m1,m2);
        System.out.println(m3);
    }
}
