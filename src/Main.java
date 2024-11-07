import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime de cuantos asteríscos quieres que tenga el cateto menor de tu triangulo");
        int rectangulo= sc.nextInt();
        int rectanguloOriginal= rectangulo;
        int original = rectangulo;
        int Contador= 0;
        if(rectangulo>=0){
            while(rectangulo != 0) {
                while(Contador != rectangulo) {
                    System.out.print("*");
                    Contador++;
                }
                rectangulo--;
                Contador=0;
                System.out.println();
            }
        }else{
            while(rectangulo != 0) {
                rectangulo++;
                while(original != rectangulo) {
                    System.out.print("*");
                    original++;
                }
                original = rectanguloOriginal;
                System.out.println();
            }
            System.out.println("Me puse gracioso");
        }
    }
}