package zombicom.core.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import zombicom.ZombicomCore;

public class ClientProxy implements IProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {}

    @Override
    public void init(FMLInitializationEvent event) {}

    @Override
    public void postInit(FMLPostInitializationEvent event) {}

    @Override
    public EntityPlayer getPlayerEntityFromContext(MessageContext ctx) {
        return (ctx.side.isClient()
                ? Minecraft.getMinecraft().player
                : ZombicomCore.proxy.getPlayerEntityFromContext(ctx));
    }

    @Override
    public void serverStarting(FMLServerStartingEvent event) {}
}
