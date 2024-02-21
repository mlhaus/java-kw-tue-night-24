package edu.kirkwood.week04;

public class LogicalOpTable {
    public static void main(String[] args) {

        boolean p, q;

        System.out.println("P\t\tQ\t\tP&&Q\tP||Q\tP^Q\t\t!P");

        p = true; q = true;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = true; q = false;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = true;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = false;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));


        boolean a = true;
        boolean b = false;
        boolean f = (!a && b) || (a && !b);
        // true
        System.out.println("!a&&b||a&&!b = " + f);
    }
}
