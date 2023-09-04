package Homework2.src.Rewards.Gold;

import Homework2.src.Abstractions.IGameItem;

public class GoldRewards implements IGameItem {

    @Override
    public String open() {
        return "Gold";
    }
}