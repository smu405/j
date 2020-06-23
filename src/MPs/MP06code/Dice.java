public class Dice {
    int number;

    Dice() {
        number = 1;
    }

    int roll() {
        number = (int) Math.floor(Math.random() * 6) + 1;
        return number;
    }

    int getNumber() {
        return number;
    }
}
