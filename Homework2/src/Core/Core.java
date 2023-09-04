package Homework2.src.Core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Homework2.src.Abstractions.ItemGenerator;
import Homework2.src.Rewards.Coal.CoalGenerator;
import Homework2.src.Rewards.Diamond.DiamondGenerator;
import Homework2.src.Rewards.Gold.GoldGenerator;
import Homework2.src.Rewards.Iron.IronGenerator;

public class Core {
    // Логика игры
    public void run() {
        Random random = ThreadLocalRandom.current();

        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new IronGenerator());
        generatorList.add(new CoalGenerator());
        generatorList.add(new DiamondGenerator());

        for (int i = 0; i <10;i++) {
            int indx=Math.abs(random.nextInt()%4);
            ItemGenerator myGenerator = generatorList.get(indx);
            System.out.println(myGenerator.openReward());
        }




    }
}