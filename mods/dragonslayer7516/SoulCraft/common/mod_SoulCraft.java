package mods.dragonslayer7516.SoulCraft.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid="soulcraft", name="SoulCraft", version="0.0.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class mod_SoulCraft {

	@Instance("soulcraft")
	public static mod_SoulCraft instance;
	
	@SidedProxy(clientSide="mods.dragonslayer7516.SoulCraft.client.SoulCraftClientProxy", serverSide="mods.dragonslayer7516.SoulCraft.common.SoulCraftCommonProxy")
    public static SoulCraftCommonProxy proxy;
	
	 @EventHandler
	 public void preInit(FMLPreInitializationEvent event) {
         // Stub Method
 }
	 
	 @EventHandler
	 public void load(FMLInitializationEvent event) {
         proxy.registerRenderThings();
	 }
	 
	 @EventHandler
     public void postInit(FMLPostInitializationEvent event) {
     }
	
}
