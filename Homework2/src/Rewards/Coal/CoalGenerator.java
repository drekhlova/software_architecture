package Homework2.src.Rewards.Coal;

import Homework2.src.Abstractions.IGameItem;
import Homework2.src.Abstractions.ItemGenerator;

public class CoalGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new CoalRewards();
    }
}
