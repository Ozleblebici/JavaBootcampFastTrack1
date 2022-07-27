package day5;

public class TestStatic {


    public static void main(String[] args) {


        Printer model1 = new Printer();
        model1.brandName = "abc Model";
        System.out.println("model1.count = " + model1.count);
        System.out.println("Printer.count = " + Printer.count);

        Printer model2 = new Printer();
        model2.brandName = " ccc Model";
        System.out.println("model2.count = " + model2.count);
        System.out.println("Printer.count = " + Printer.count);
    }
}
