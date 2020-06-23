/*
 @startuml
 class CardDeck {
     numOfCards : int
     cards : Card[0..*]
     CardDeck()
     deal() : Card
     getNumOfCards() : int
 }
 @enduml
 */
public class CardDeck {
    int numOfCards;
    Card[] cards;

    CardDeck() {
        cards = new Card[3];
        int num = (int) Math.floor(Math.random() * 9) + 2;
        cards[0] = new Card("Diamond", "" + num);
        num = (int) Math.floor(Math.random() * 9) + 2;
        cards[1] = new Card("Diamond", "" + num);
        num = (int) Math.floor(Math.random() * 9) + 2;
        cards[2] = new Card("Diamond", "" + num);
        numOfCards = 3;
    }

    Card deal() {
        Card card = cards[numOfCards - 1];
        numOfCards--;
        return card;
    }

    int getNumofCards() {
        return numOfCards;
    }

    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        System.out.printf("%d장의 카드가 남았습니다\n", deck.getNumofCards());
        Card card = deck.deal();
        card.show();
        System.out.printf("%d장의 카드가 남았습니다\n", deck.getNumofCards());
        card = deck.deal();
        card.show();
        System.out.printf("%d장의 카드가 남았습니다\n", deck.getNumofCards());
    }
}
