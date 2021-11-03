package br.com.amantikir.cardgame.domain;

import java.util.Set;

public interface Territory extends Card {

    Set<TerritoryType> getTypes();
}
