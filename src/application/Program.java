package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("entre com o numero de linhas: ");
		int m = scan.nextInt();
		
		System.out.println("entre com o numero de colunas: ");
		int n = scan.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i =0; i<mat.length; i++) {
			for(int j =0; j<mat[i].length; j++) {
				mat[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Digite o numero que quer achar no vetor: ");
		int x = scan.nextInt();
		
		for(int i =0; i<mat.length; i++) {
			for(int j =0; j<mat[i].length; j++) {
				if(x == mat[i][j]) {
					System.out.println("position "+ i+ ","+ j+ ": ");
					if(j>0) {
					System.out.println("left: " + mat[i][j-1]);
					}
					if(i>0) {
					System.out.println("up: " + mat[i-1][j] );
					}
					if(j< mat[i].length-1) {
					System.out.println("right: " + mat[i][j+1]);
					}
					if(i<mat.length-1) {
					System.out.println("down: " + mat[i+1][j] );
					}
		
				}
		
			}
		}
		
		
		
		scan.close();

	}

}
