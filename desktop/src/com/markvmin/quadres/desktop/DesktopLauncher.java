package com.markvmin.quadres.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.markvmin.quadres.Quadres;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Quadres";
		config.width = 1000;
		config.height = 680;
		new LwjglApplication(new Quadres(), config);
	}
}
