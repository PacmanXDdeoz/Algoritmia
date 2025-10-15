import java.util.Scanner;
class Edad{
public static void main (String [] args){
Scanner sca = new Scanner (System.in);
System.out.println("Da una edad: ");
int edad1 = sca.nextInt();
System.out.println("Da otra edad: ");
int edad2 = sca.nextInt();
if(edad1 >= 18){
System.out.println("edad 1 es mayor de edad  ");
} else {
System.out.println("edad 1 es menor de edad ");
}
if(edad2 >= 18){
System.out.println("edad 2 es mayor de edad ");
} else {
System.out.println("edad 2 es menor de edad ");
}
}
}
