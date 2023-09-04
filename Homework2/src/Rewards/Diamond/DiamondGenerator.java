package Homework2.src.Rewards.Diamond;

import Homework2.src.Abstractions.IGameItem;
import Homework2.src.Abstractions.ItemGenerator;

public class DiamondGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new DiamondRewards();
    }
}