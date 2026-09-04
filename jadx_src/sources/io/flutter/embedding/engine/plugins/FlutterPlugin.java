package io.flutter.embedding.engine.plugins;

import android.content.Context;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineGroup;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformViewRegistry;
import io.flutter.view.TextureRegistry;

/* JADX INFO: loaded from: classes4.dex */
public interface FlutterPlugin {

    public interface FlutterAssets {
        String getAssetFilePathByName(@n0 String str);

        String getAssetFilePathByName(@n0 String str, @n0 String str2);

        String getAssetFilePathBySubpath(@n0 String str);

        String getAssetFilePathBySubpath(@n0 String str, @n0 String str2);
    }

    public static class FlutterPluginBinding {
        private final Context applicationContext;
        private final BinaryMessenger binaryMessenger;
        private final FlutterAssets flutterAssets;
        private final FlutterEngine flutterEngine;
        private final FlutterEngineGroup group;
        private final PlatformViewRegistry platformViewRegistry;
        private final TextureRegistry textureRegistry;

        public FlutterPluginBinding(@n0 Context context, @n0 FlutterEngine flutterEngine, @n0 BinaryMessenger binaryMessenger, @n0 TextureRegistry textureRegistry, @n0 PlatformViewRegistry platformViewRegistry, @n0 FlutterAssets flutterAssets, @p0 FlutterEngineGroup flutterEngineGroup) {
            this.applicationContext = context;
            this.flutterEngine = flutterEngine;
            this.binaryMessenger = binaryMessenger;
            this.textureRegistry = textureRegistry;
            this.platformViewRegistry = platformViewRegistry;
            this.flutterAssets = flutterAssets;
            this.group = flutterEngineGroup;
        }

        @n0
        public Context getApplicationContext() {
            return this.applicationContext;
        }

        @n0
        public BinaryMessenger getBinaryMessenger() {
            return this.binaryMessenger;
        }

        @p0
        public FlutterEngineGroup getEngineGroup() {
            return this.group;
        }

        @n0
        public FlutterAssets getFlutterAssets() {
            return this.flutterAssets;
        }

        @n0
        @Deprecated
        public FlutterEngine getFlutterEngine() {
            return this.flutterEngine;
        }

        @n0
        public PlatformViewRegistry getPlatformViewRegistry() {
            return this.platformViewRegistry;
        }

        @n0
        public TextureRegistry getTextureRegistry() {
            return this.textureRegistry;
        }
    }

    void onAttachedToEngine(@n0 FlutterPluginBinding flutterPluginBinding);

    void onDetachedFromEngine(@n0 FlutterPluginBinding flutterPluginBinding);
}
