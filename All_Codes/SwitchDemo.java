
import java.util.Scanner;

class SwitchDemo {

    public static void main(String A[]) {
        Scanner sObj = new Scanner(System.in);

        int iStd = 0;
        System.out.println("Enter your Standard:");
        iStd = sObj.nextInt();

        switch (iStd) {
            case 1:
                System.out.println("Exam at 9am");
                break;

            case 2:
                System.out.println("Exam at 10am");
                break;

            case 3:
                System.out.println("Exam at 11am");
                break;

            case 4:
                System.out.println(" Exam at 12Noon");
                break;

            default:
                System.out.println(" Invalid Standard..");

        }
    }
}
