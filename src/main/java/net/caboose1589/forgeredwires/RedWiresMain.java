package net.caboose1589.forgeredwires;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RedWiresMain.MOD_ID)
public class RedWiresMain
{
    public static final String MOD_ID = "forgeredwires";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public RedWiresMain()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
          RedItems.register(eventBus);
           RedBlock.register(eventBus);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

}
