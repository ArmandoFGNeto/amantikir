package br.com.amantikir.cardgame.domain;

import lombok.Data;

import java.util.Set;

@Data
public class BattleField {

    private Set<Slot> slots;
}
