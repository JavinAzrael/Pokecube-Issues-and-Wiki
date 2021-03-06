package pokecube.legends.proxy;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import pokecube.legends.init.PlantsInit;
import pokecube.legends.worldgen.dimension.UltraSpaceConfig;
import thut.core.common.Proxy;

public class CommonProxy implements Proxy
{
    @Override
    public void setup(final FMLCommonSetupEvent event)
    {
        new UltraSpaceConfig().init(event);
        new PlantsInit().init(event);
    }
}
