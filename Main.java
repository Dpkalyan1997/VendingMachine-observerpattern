class Main {
    public static void main(String args[]) {
    TotalAmountDisplay totalAmountDisplay = new TotalAmountDisplay();
    DrinkData drinkData = new DrinkData();
    
    drinkData.registerObserver(totalAmountDisplay);
    
    drinkData.dataChanged(3, 1, 2);
    drinkData.dataChanged(4, 0, 0);
    
    }
    }