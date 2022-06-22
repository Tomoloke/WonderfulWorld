package game;

import game.components.Card;
import game.components.CardReference;
import game.components.Faction;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Player {

    public String name;
    public int playerID;
    public Image playerIcon;


    public Integer faction;
    public List<Integer> hand;
    public List<Integer> draftArea;
    public List<CardReference> constructionArea;
    public List<Integer> builtCards;

    public int[] resources; //BNVDARGF -> Blanco, Negro; Verde, Dorado, Azul, Rojo, General, Financiero
    public List<Character> resourcesOnFaction;

    public Player(){

        hand = new ArrayList<>();
        draftArea = new ArrayList<>();
        constructionArea = new ArrayList<>();
        builtCards = new ArrayList<>();

        resources = new int[8];
        for(int resource: resources){resource = 0;}
        resourcesOnFaction = new ArrayList<>();

    }





}
