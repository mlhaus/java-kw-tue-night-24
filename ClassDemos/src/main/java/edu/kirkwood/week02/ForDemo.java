package edu.kirkwood.week02;

public class ForDemo {
    public static void main(String[] args) {
//        for count in range(5):
//            print(count, end=" ")
//        print()
        for(int count = 0; count < 5; count += 1) {
            System.out.print(count + " ");
        }
        System.out.println();

//        for count in range(1, 6):
//            print(count, end=" ")
//        print()
        for(int count = 1; count < 6; count++) {
            System.out.print(count + " ");
        }
        System.out.println();

//        for count in range(1, 6, 2):
//            print(count, end=" ")
//        print()
        for(int count = 1; count < 6; count = count + 2) {
            System.out.print(count + " ");
        }
        System.out.println();

        int i = 0;
        for(;;) {
            System.out.println("Infinite loop!");
            if(i >= 10) {
                break;
            }
            i++;
        }



    }
}
