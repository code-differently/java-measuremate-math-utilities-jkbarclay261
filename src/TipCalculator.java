import java.util.Scanner;
class tipCalculator {

    public static double calculateTax(double taxRate){
     return  taxRate/100;
    }
    public static double calculateTip(double rawBill, double tipRate){
        return rawBill * (tipRate/100);
    }
    public static double calculateTotalBill(double rawBill, double taxAmount,double tipAmount){
        return rawBill + taxAmount + tipAmount;
    }
    public static long calculateRoundedTotalBill(double totalBill){
        return Math.round(totalBill);
    }



 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //Creating my scanner

     System.out.println("Enter Bill amount: ");
     double rawBill = Double.parseDouble(scanner.nextLine());

     System.out.println("Enter Tax rate %: ");
     double taxRate = Double.parseDouble(scanner.nextLine());

     System.out.println("Enter Tip rate:");
     double tipRate = Double.parseDouble(scanner.nextLine());

    //Calling my method s to my main
     double taxAmount = calculateTax(taxRate);

     double tipAmount = calculateTip(rawBill, tipRate);

     double totalBill = calculateTotalBill(rawBill, taxAmount, tipAmount);

     long roundedTotalBill = calculateRoundedTotalBill(totalBill);

     //Output results
     System.out.println("Tax Amount: " + taxAmount);
     System.out.println("Tip Amount: " + tipAmount);
     System.out.println("Total Bill (Raw): " + totalBill);
     System.out.println("Total Bill (Rounded): " + roundedTotalBill);

}
}
