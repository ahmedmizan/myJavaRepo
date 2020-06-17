package my.homework;

public class PrinterClass {

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

    String printerName;
    String color;
    int tonerLevel;
    int paperLevel;
    int usedTonerLevel=0;
    int usedPaperLevel=0;
    int updatedTonerLevel =(tonerLevel-usedTonerLevel);
    int updatedPaperLevel =(paperLevel-usedPaperLevel);

    public PrinterClass(String printerName,String color,int tonerLevel,int paperLevel){
        this.printerName=printerName;
        this.color=color;
        this.tonerLevel = tonerLevel;
        this.paperLevel = paperLevel;

    }
    public void addTonerLevel(int newToner){
        if ((updatedTonerLevel + newToner)==100){
            System.out.println("we can add  "+newToner+" new toner in the printer");
            updatedTonerLevel =updatedTonerLevel+newToner;
        }else {
            System.out.println("printer has no space adding the new toner");
        }

    }

    public void addPaper(int newPaper){
        if ((updatedPaperLevel+newPaper)==100){
            System.out.println("we can add "+newPaper+" new paper in the printer");
            updatedPaperLevel=(usedPaperLevel+newPaper);
        }else {
            System.out.println("printer has no space to add any paper");
        }


    }
    public void printSummary(){
        System.out.println("This printer name is "+printerName+ " and color is "+color);
        System.out.println("after printing  toner level is "+updatedTonerLevel);
        System.out.println("and paper level is "+updatedPaperLevel);
        System.out.println("now"+ updatedTonerLevel+ " we can add");
        System.out.println("and "+updatedPaperLevel+" we can add in the printer");
    }







}













