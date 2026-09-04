package io.flutter.embedding.engine.plugins.util;

import androidx.annotation.n0;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.GeneratedPluginRegistrant;

/* JADX INFO: loaded from: classes4.dex */
public class GeneratedPluginRegister {
    private static final String TAG = "GeneratedPluginsRegister";

    public static void registerGeneratedPlugins(@n0 FlutterEngine flutterEngine) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", FlutterEngine.class).invoke(null, flutterEngine);
        } catch (Exception e10) {
            Log.e(TAG, "Tried to automatically register plugins with FlutterEngine (" + flutterEngine + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e(TAG, "Received exception while registering", e10);
        }
    }
}
