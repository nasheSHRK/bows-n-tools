package com.nasheshrk.bowsntools.world;

import com.nasheshrk.bowsntools.BowsnTools;
import com.nasheshrk.bowsntools.world.gen.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BowsnTools.MOD_ID)
public class ModWorldEvent {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
    }
}
