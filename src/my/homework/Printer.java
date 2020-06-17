package my.homework;

public class Printer {

    /**
     * Create a printer
     * Printer can have max toner level 100
     * Printer can have max paper level 100
     * You should be able to add toner
     * You should be able to add paper
     * you should be able to get updated toner level
     * You should be able to print paper (When you print,toner level and paper level should decrease)
     * Have a print summery method to print all details status
     */

    int tonerLevel;
    int paperLevel;


    public Printer(int tonerLevel, int paperLevel) {
        if (tonerLevel>0 && tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        }else
            System.out.println("Please check toner level.");
        if (paperLevel>0 && paperLevel<=100){
            this.paperLevel = paperLevel;
        }else
            System.out.println("Please check paper level");

    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPaperLevel() {
        return paperLevel;
    }

    public void addToner(int inkRefill){
        if((tonerLevel + inkRefill) <= 100){
            tonerLevel  += inkRefill;
            System.out.println(inkRefill + " unit of ink added to toner and toner level is now " + tonerLevel + ".");
        } else
            System.out.println("Pls check refill quantity.");
    }

    public void addPaper(int newPaper){
        if ((paperLevel + newPaper) <= 100){
            paperLevel += newPaper;
            System.out.println("printer can accept " + newPaper + " new paper");
        }else
            System.out.println("please check refill quantity");
    }

    public void printPaper(int noOfPaper){
        if (paperLevel<noOfPaper){
            System.out.println("printer need to adding paper for print");
        }else {
            tonerLevel = tonerLevel - noOfPaper;
            paperLevel = paperLevel - noOfPaper;
           // System.out.println("printer will print");
            System.out.println(noOfPaper + " paper printed.");
        }



    }




}
