package xyz.merith.bakery.bakerstools;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import xyz.merith.bakery.bakerstools.datagen.RecipieGenerator;

public class DataGenEntrypoint  implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();
        pack.addProvider(RecipieGenerator)
    }

}