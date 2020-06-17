package my.homework;

public class CannonPrinter {
    public static void main(String[] args) {
        Printer cannon = new Printer(100, 100);
        cannon.printPaper(20);
        cannon.addToner(20);
        System.out.println(cannon.getTonerLevel());
        System.out.println(cannon.getPaperLevel());
        cannon.printPaper(50);
        cannon.printPaper(45);
        cannon.printPaper(100);

    }
}
