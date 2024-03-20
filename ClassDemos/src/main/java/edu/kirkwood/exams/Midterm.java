package edu.kirkwood.exams;

public class Midterm {
    public static void main(String[] args) {


        String college = "Iowa North";
        if(college.equals("Kirkwood")){
            System.out.println("Go Eagles!");
        }
        else if(college.equals("Iowa")){
            System.out.println("Go Hawks!");
        }
        else if(college.equals("Iowa State")){
            System.out.println("Go Cyclones!");
        }
        else{
            System.out.println("Go Team!");
        }

        int temp = 85;
        String tempAdj = temp >= 80 ? "hot" : temp >= 60 ? "warm" : temp >= 40 ? "cold" : "very cold";
        System.out.println("It's " + tempAdj + " outside.");


        int min = 10;
        int max = 20;
        for(int div = min; div <= max; div++){
            if(div % 3 == 0 || div % 4 == 0){
                System.out.print(div + " ");
            }
        }


    }

}
