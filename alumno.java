/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class alumno {
 

	public static void main(String[] ARGS)
	{
		Scanner obtener = new Scanner(System.in);
		int estudiantes,i,notaMayor,notaMenor,nota,sumaNotas;
 
		System.out.print("Ingrese la cantidad de estudiantes: ");
		estudiantes = obtener.nextInt();
 
		notaMayor = 0;
		notaMenor = 100;
		sumaNotas = 0;
 
 
		for(i = 1; i <= estudiantes; i++)
		{
			System.out.print("Ingrese la nota para el estudiante: " + i + " : ");
			nota = obtener.nextInt();
 
			sumaNotas = sumaNotas + nota;
			if(nota > notaMayor)
			{
				notaMayor=nota;
			}
			if(nota < notaMenor)
			{
				notaMenor=nota;
			}
		}
 
		System.out.print("La nota mayor es: " + notaMayor + "\n");
		System.out.print("La nota menor es: " + notaMenor + "\n");
 
		          DecimalFormat df = new DecimalFormat("#.00");
 
		System.out.print("El promedio es: " + df.format((double)sumaNotas/estudiantes) + "\n");
	}
}
    

