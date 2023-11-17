package aceptaelreto;

import java.util.Arrays;
import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		// Creamos una variable
		int numMax, num1, num2;
		
		char cambio;
		
		// Creamos una variable para cada uno de los numeros introducidos y para llos  
		String num;
		
		char[] tabla;
		char[] ordenado = new char[4];
		
		// Creamos la varibale escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el número máximo de números que vamos a introducir
		numMax = sc.nextInt();
		
		
		//Creamos un bucle que realice las operaciones pertinentes el número de veces que sea necesario
		for (int i=1; i<=numMax ; i++) {
			
			// Recogemos el número pero en una cadena
			num = sc.next();
			
			// Metemos el numero en un array
			tabla = num.toCharArray();
			
			// Ordenamos el array de menor a mayor
			Arrays.sort(tabla);
			
			for (int a=0;a<=3;a++) {
				cambio = tabla[a] ; 
				ordenado[3-a] = cambio;
			}
			// cambiar de array char a string num=String.valueOf(ordenado);
			System.out.println(Arrays.toString(tabla));
			System.out.println(Arrays.toString(ordenado));
			
		}
		
		//Cerramos el Escaner
		sc.close();
	}

}
