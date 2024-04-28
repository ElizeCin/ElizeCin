package org.example.DZ4_copy;

public class oneMoreCLass {
    public static void main(String[] args) {
        Cat_copy cat = new Cat_copy("meat", 4, false);
        cat.printCat();
        Cat_copy cat1 = new Cat_copy("meat", 4, false, "black");
        cat1.printCat();
        cat.printCat();
    }
    private static void printSomeInfo (Cat_copy anyCat) {
        anyCat.printCat();
    }
}
