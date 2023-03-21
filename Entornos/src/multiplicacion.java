//se usan la doble // para comentar el programa 
//y escribir indicaciones o explicaciones, el programa no lo lee, es decir no ifluye en la ejecucion

import java.util.Scanner; //importamos el packete que nos permite usar el scanner, ya que de base no se incluye

public class multiplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner	teclado=new Scanner(System.in); //iniciamos la variable teclado con el scanner
	
		System.out.println("Introduce 2 numeros a multiplicar :"); //para escribir lo que se requiera por pantalla de consola
		
int a,b, c;// iniciamos las 2 variables a la vez (se pueden iniciar por separado pero es menos optimo, ej, iniciar 200 variables)

	a=teclado.nextInt(); // aqui pedimos por teclado el valor
	b=teclado.nextInt();// " " " "
	
	c=a*b;//operamos la multiplicacion para que se ejecute
	
	System.out.println("La multiplicacion de "+a+" y "+b+" es "+c );
	}

}
