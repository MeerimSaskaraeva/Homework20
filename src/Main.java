import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        while (true)
        try {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            if (a<0 || b<0 || c<0){
                throw  new MyException1();
            }else if (a>20 || b>20 ||c>20) {
                throw new MyException2();
            }else {
                Parallelepiped p=new Parallelepiped(a,b,c);
                System.out.println(p.toString());
                System.out.println("Area = "+p.getArea());
                System.out.println(p.toString());
                System.out.println("Volume = "+p.getVolume());
            }
        }catch (MyException1 ex) {
            System.out.println("Num can't be negative");
        }catch (MyException2 r){
            System.out.println("Num can't be more 20");
        }catch (InputMismatchException e) {
                System.out.println("Wrong input");
                break;
        }

    }

}