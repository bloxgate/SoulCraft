package mods.dragonslayer7516.SoulCraft.client;

import mods.dragonslayer7516.SoulCraft.common.SoulCraftCommonProxy;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SoulCraftClientProxy extends SoulCraftCommonProxy{
	 @Override
	    public void registerRenderThings(){

	    }
	    @SideOnly(Side.CLIENT)
	    public static int addArmor(String armor){
	     return RenderingRegistry.addNewArmourRendererPrefix(armor);
	    }
}
