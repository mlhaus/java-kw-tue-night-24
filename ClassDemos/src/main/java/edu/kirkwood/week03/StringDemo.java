package edu.kirkwood.week03;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String school = "Kirkwood";
        char firstLetter = school.charAt(0); // 'K'
        System.out.println(firstLetter);
        char secondLetter = school.charAt(1); // 'i'
        System.out.println(secondLetter);
        int difference = school.compareTo("Eagles"); // 75-69=6
        System.out.println(difference);
        difference = "Eagles".compareTo(school); // 69-75=-6
        System.out.println(difference);
        difference = school.compareTo("eagles"); // 75-101=-26
        System.out.println(difference);
        difference = school.compareToIgnoreCase("eagles"); // 6
        System.out.println(difference);
        String team = school.concat(" Eagles"); // Kirkwood Eagles
        System.out.println(team);
        team = school + " Eagles";
        System.out.println(team);
        boolean containsE = school.contains("E"); // false
        System.out.println(containsE);
        containsE = "Eagles".contains("E"); // true
        System.out.println(containsE);
        if(school.equals("Kirkwood")) {
            System.out.println("Go Eagles");
        } else {
            System.out.println("Boo!");
        }
        if(school.equals("kirkwood")) {
            System.out.println("Go Eagles");
        } else {
            System.out.println("Boo!");
        }
        if(school.equalsIgnoreCase("kirkwood")) {
            System.out.println("Go Eagles");
        } else {
            System.out.println("Boo!");
        }
        team = String.format("Go %s %s! Win that championship!", school, "Eagles");
        System.out.println(team);
        int indexOfo = school.indexOf("o"); // 5
        System.out.println(indexOfo);
        int lastIndexOfo = school.lastIndexOf("o"); // 6
        System.out.println(lastIndexOfo);
        int indexOfZ = school.indexOf("Z"); // -1
        System.out.println(indexOfZ);
        int numChars = school.length(); // 8
        System.out.println(numChars);
        char lastChar = school.charAt(school.length() - 1); // 'd'
        System.out.println(lastChar);
        String email = "   marc.hauschildt@kirkwood.edu   ";
        email = email.strip(); // also works with trim()
        // I asked chatgpt to generate this regex
        String regexEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if(email.matches(regexEmail)) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }
        String team2 = team.replace("Eagles", "Kittens");
        System.out.println(team2);
        team2 = team.replace("o", "0");
        System.out.println(team2);
        String[] emailParts = email.split("@");
        System.out.println(Arrays.toString(emailParts));
        String wood = school.substring(4, 8);
        System.out.println(wood);
        String kwood = school.substring(3);
        System.out.println(kwood);
        char[] letters = school.toCharArray();
        System.out.println(Arrays.toString(letters));
        String schoolLower = school.toLowerCase(); // "kirkwood"
        System.out.println(schoolLower);
        String schoolUpper = school.toUpperCase(); // "KIRKWOOD"
        System.out.println(schoolUpper);
        int ranking = 1;
        String rankingStr = String.valueOf(ranking);
        rankingStr = ranking + "";
        System.out.println(team + " #" + rankingStr);
    }
}
