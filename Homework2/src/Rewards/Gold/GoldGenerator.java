package Homework2.src.Rewards.Gold;

import Homework2.src.Abstractions.IGameItem;
import Homework2.src.Abstractions.ItemGenerator;

public class GoldGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new GoldRewards();
    }
}
