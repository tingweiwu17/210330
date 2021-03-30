package box;


import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length");
        int length = Integer.parseInt(scan.next());
        System.out.println("Please enter width");
        int width = Integer.parseInt(scan.next());
        System.out.println("Please enter height");
        int height = Integer.parseInt(scan.next());

        if (Box3.validate(length,width,height)){
            System.out.println(Box3.getName()+Box3.getPrice());
        }else if (Box5.validate(length,width,height)){
            System.out.println(Box5.getName()+Box5.getPrice());
        }
    }
}
