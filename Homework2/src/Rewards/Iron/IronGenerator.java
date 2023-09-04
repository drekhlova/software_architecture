package Homework2.src.Rewards.Iron;

import Homework2.src.Abstractions.IGameItem;
import Homework2.src.Abstractions.ItemGenerator;

public class IronGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new IronRewards();
    }
}