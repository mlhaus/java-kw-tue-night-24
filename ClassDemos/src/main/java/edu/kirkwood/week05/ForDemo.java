package edu.kirkwood.week05;

public class ForDemo {
    public static void main(String[] args) {
        for(int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            System.out.print("Factors of " + i + ": ");
            for(int j = 2; j <= i / 2; j++) {
                if(i % j == 0) {
                    System.out.print(j + " ");
                    isPrime = false;
                }
            }
            System.out.println(isPrime ? "Prime Number" : "");
        }



        for (int i = 65; i <= 70; i++) {
            String letter1 = (char) i + "";
            if(i == 68) {
                continue;
            }
            System.out.println(letter1);
        }
        System.out.println();

        for (int i = 65; i <= 70; i++) {
            String letter1 = (char) i + "";
            for (int j = 65; j <= 70; j++) {
                if (j == 68) {
                    continue;
                }
                String letter2 = (char) j + "";
                System.out.println(letter1 + letter2);
            }
        }
        System.out.println();



        outer:
        {
            for (int i = 65; i <= 70; i++) {
                String letter1 = (char) i + "";
                inner:
                {
                    for (int j = 65; j <= 70; j++) {
                        if (j == 68) {
                            break outer;
                        }
                        String letter2 = (char) j + "";
                        System.out.println(letter1 + letter2);
                    }
                }
            }
        }

    }
}
