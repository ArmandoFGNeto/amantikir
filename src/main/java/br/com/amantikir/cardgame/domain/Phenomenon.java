package br.com.amantikir.cardgame.domain;

import java.util.Set;

public interface Phenomenon extends CastableCard {

    Set<Effect> getEffects();

    void setEffects(Effect ...effects);
}
