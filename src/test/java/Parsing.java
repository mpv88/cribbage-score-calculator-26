// choose a name for the Class which describes its behaviour

import org.junit.jupiter.api.Test;
import sdm.running.example.Card;
import sdm.running.example.CardParser;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class Parsing {

    @Test
    void card_with_rank_3() {
        // arrange
        CardParser parser = new CardParser();

        // act
        Card card = parser.parse("3♥");

        // assert
        assertEquals('3',card.rank());

    }

}
