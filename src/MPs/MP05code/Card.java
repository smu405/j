class Card {
    String shape;
    String number;
    Card(String shape, String number) {
        this.shape = shape;
        this.number = number;
    }
    void show() {
        System.out.println("Shape = " + shape + ", " + "Number = " + number);
//        System.out.printf("Shape = %s, Number = %s\n", shape, number);
    }
}
