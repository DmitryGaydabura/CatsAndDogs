/*У вас есть 24 собаки и 8 котов. Порция обеда для каждого животного составляет 50 грамм и стоит 2 доллара. Животные кушают 3 раза в день.

        Сколько нужно корма для котов в месяц?

        Сколько нужно корма для собак в месяц?

        Сколько нужно денег в месяц на содержание приюта?*/

public class Main {

    public static int numberOfDogs = 24;
    public static int numberOfCats = 8;
    public static int amountOfFood = 50;
    public static int costOfOneDinner = 2;
    public static int numberOfDinnersPerDay = 3;

    public static String CalculateAmountOfFoodForCats(int numberOfCats, int amountOfFood, int costOfOneDinner, int numberOfDinnersPerDay) {
        return ("You will need " + (numberOfCats * amountOfFood * numberOfDinnersPerDay * 30) + " grams of food per month. " +
                "It is " + ((numberOfCats * amountOfFood * numberOfDinnersPerDay * 30) / 1000) + " kg. It will cost you "
                + (numberOfCats * costOfOneDinner * numberOfDinnersPerDay * 30) + " dollars per month.");
    }

    public static String CalculateAmountOfFoodForCats() {
        return ("You will need " + (numberOfCats * amountOfFood * numberOfDinnersPerDay * 30) + " grams of food per month. " +
                "It is " + ((numberOfCats * amountOfFood * numberOfDinnersPerDay * 30) / 1000) + " kg. It will cost you "
                + (numberOfCats * costOfOneDinner * numberOfDinnersPerDay * 30) + " dollars per month.");
    }

    public static String CalculateAmountOfFoodForDogs(int numberOfDogs, int amountOfFood, int costOfOneDinner, int numberOfDinnersPerDay) {
        return ("You will need " + (numberOfDogs * amountOfFood * numberOfDinnersPerDay * 30) + " grams of food per month. " +
                "It is " + ((numberOfDogs * amountOfFood * numberOfDinnersPerDay * 30) / 1000) + " kg. It will cost you "
                + (numberOfDogs * costOfOneDinner * numberOfDinnersPerDay * 30) + " dollars per month.");
    }

    public static String CalculateAmountOfFoodForDogs() {
        return ("You will need " + (numberOfDogs * amountOfFood * numberOfDinnersPerDay * 30) + " grams of food per month. " +
                "It is " + ((numberOfDogs * amountOfFood * numberOfDinnersPerDay * 30) / 1000) + " kg. It will cost you "
                + (numberOfDogs * costOfOneDinner * numberOfDinnersPerDay * 30) + " dollars per month.");
    }

    public static void main(String[] args) {
        System.out.println(CalculateAmountOfFoodForCats());
        System.out.println(CalculateAmountOfFoodForDogs());
        System.out.println(CalculateAmountOfFoodForCats(2,10,1,3));
        System.out.println(CalculateAmountOfFoodForDogs(10,10,12,3));

    }


}