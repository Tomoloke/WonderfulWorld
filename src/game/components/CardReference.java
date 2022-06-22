package game.components;

import java.util.ArrayList;
import java.util.List;

public class CardReference {
    public int cardIndex;
    public boolean[] paid;

    CardReference(int index,Card card){

        cardIndex = index;
        paid = new boolean[card.cost.length()];
        for(boolean material: paid) {material = false;}
    }
}
