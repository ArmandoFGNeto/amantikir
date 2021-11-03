package br.com.amantikir.cardgame.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "position")
public class Slot {

    private final int position;

    private Territory territory;

    private Card card;
}
