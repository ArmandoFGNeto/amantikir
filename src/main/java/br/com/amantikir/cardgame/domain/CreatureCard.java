package br.com.amantikir.cardgame.domain;

import java.util.Set;

public interface CreatureCard extends CastableCard {

    int getPower();

    int getHealth();

    int getMovement();

    int getPowerBonus();

    int getHealthBonus();

    int getMovementBonus();

    void setPowerBonus();

    void setHealthBonus();

    void setMovementBonus();

    int getPowerPenalty();

    int getHealthPenalty();

    int getMovementPenalty();

    void setPowerPenalty();

    void setHealthPenalty();

    void setMovementPenalty();

    Set<Integer> getPosition();

    Set<Ability> getAbilities();

    void setAbilities(Ability ...abilities);
}
