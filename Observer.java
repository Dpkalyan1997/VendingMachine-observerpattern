
interface Observer {
public void update( int pepsi, int coke, int fanta, double amount);
}

class TotalAmountDisplay implements Observer {
private int totalDrinks;
private double totalAmount;
int pepsi, coke, fanta;

public void update( int pepsi, int coke, int fanta, double amount) {
this.pepsi = pepsi;
this.coke = coke;
this.fanta = fanta ;
this.totalDrinks = pepsi + coke + fanta ;
this.totalAmount = amount;
display();
}

public void display() {
System.out.println("\n__________Lewies vending machine___________ \n" + "Type\t\t" + "Count\t" + "Amount(dollor)"
+ "\npepsi:\t " + pepsi + "\t" + ( 2 * pepsi) 
+ "\ncoke:\t\t " + coke +"\t" + ( 1.5 * coke) 
+ "\nfanta:\t " + fanta + "\t" +( 2.5 * fanta) 
+ "\n\nTotal Drinks: " + totalDrinks + "\n\nTotal Amount: $ " + totalAmount);
}
}


