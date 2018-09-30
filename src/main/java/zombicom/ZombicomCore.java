package zombicom;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import zombicom.core.proxy.IProxy;

@Mod(
        modid = ZombicomCore.MOD_ID,
        name = ZombicomCore.MOD_NAME,
        version = ZombicomCore.VERSION,
        acceptedMinecraftVersions = "[1.12,1.13)"
)
public class ZombicomCore
{
    public static final String MOD_ID = "zombicomcore";
    public static final String MOD_NAME = "Zombicom Core";

    public static final String VERSION = "0.0.1";
    public static final String CLIENT = "zombicom.core.proxy.ClientProxy";
    public static final String SERVER = "zombicom.core.proxy.ServerProxy";

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Mod.Instance(ZombicomCore.MOD_ID)
    public static ZombicomCore instance;

    @SidedProxy(clientSide = CLIENT, serverSide = SERVER)
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        proxy.postInit(event);
    }
}
