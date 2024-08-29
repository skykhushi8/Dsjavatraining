import java.util.Scanner;

public class calcs{
    public static void main(String[] args){
        System.out.println("Enter a and b");
        Scanner scanner=new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Choose the number\n 1 for addition\n 2 for subtraction\n 3 for multiplication\n 4 for division");
        int c = Integer.parseInt(scanner.nextLine());
        Calc calc = new Calc(a,b,c);

    }

}

class Calc{
    public Calc(int a, int b, int choice) {
        this.a = a;
        this.c = b;
        this.b = choice;

        switch (choice){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("you choose wrong option");
        }
    }

    int a,b,c;
}

