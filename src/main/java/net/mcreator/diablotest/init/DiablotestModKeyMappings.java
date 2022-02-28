
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diablotest.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fmlclient.registry.ClientRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.diablotest.network.OakleykillMessage;
import net.mcreator.diablotest.DiablotestMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DiablotestModKeyMappings {
	public static final KeyMapping OAKLEYKILL = new KeyMapping("key.diablotest.oakleykill", GLFW.GLFW_KEY_Y, "key.categories.misc");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(OAKLEYKILL);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == OAKLEYKILL.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						DiablotestMod.PACKET_HANDLER.sendToServer(new OakleykillMessage(0, 0));
						OakleykillMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
