package br.com.amantikir.cardgame.domain;

import java.util.List;

public interface CastableCard extends Card {

    List<Territory> getCost();

    List<Territory> getTerritories();
}
