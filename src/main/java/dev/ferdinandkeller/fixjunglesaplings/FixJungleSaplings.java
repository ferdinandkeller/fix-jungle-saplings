package dev.ferdinandkeller.fixjunglesaplings;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FixJungleSaplings implements ModInitializer {
	public static final String MOD_ID = "fix-jungle-saplings";
	public static final Logger LOGGER = LoggerFactory.getLogger("Fix Jungle Saplings");

	@Override
	public void onInitialize() {
		LOGGER.info("Jungle Saplings fix enabled");
	}
}