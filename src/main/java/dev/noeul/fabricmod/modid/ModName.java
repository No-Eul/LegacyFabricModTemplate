package dev.noeul.fabricmod.modid;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModName implements ModInitializer {
	public static final ModContainer mod = FabricLoader.getInstance()
			.getModContainer("modid")
			.orElseThrow(NullPointerException::new);
	public static final String ID = mod.getMetadata().getId();
	public static final String NAME = mod.getMetadata().getName();
	public static final Logger logger = LogManager.getLogger(NAME);

	@Override
	public void onInitialize() {
	}
}
