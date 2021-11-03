package br.com.amantikir.cardgame.domain;

import lombok.Data;

@Data
public class Slot {

    private final int position;

    private Territory territory;

    private Card card;
}
