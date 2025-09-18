package dev.ferdinandkeller.fixjunglesaplings;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class FixJungleSaplingsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(FixJungleSaplingsBlockLootTableProvider::new);
	}
}

class FixJungleSaplingsBlockLootTableProvider extends FabricBlockLootTableProvider {
    protected FixJungleSaplingsBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(
            Blocks.JUNGLE_LEAVES,
            leavesDrops(
                Blocks.JUNGLE_LEAVES,
                Blocks.JUNGLE_SAPLING,
                1/20f, 1/16f, 1/12f, 1/10f
            )
        );
    }
}
