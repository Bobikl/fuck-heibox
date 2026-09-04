package com.tencent.trtcplugin;

import android.content.Context;
import androidx.annotation.n0;
import com.tencent.live.beauty.custom.ITXCustomBeautyProcesserFactory;
import com.tencent.trtcplugin.view.TRTCCloudVideoPlatformView;
import com.tencent.trtcplugin.view.TRTCCloudVideoSurfaceView;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.platform.PlatformViewRegistry;
import io.flutter.view.TextureRegistry;

/* JADX INFO: loaded from: classes4.dex */
public class TRTCCloudPlugin implements FlutterPlugin {
    private static final String CHANNEL_SIGN = "trtcCloudChannel";
    public static final String TAG = "TRTCCloudPlugin";
    private static ITXCustomBeautyProcesserFactory sProcesserFactory;
    public TRTCCloudWrapper mCloudWrapper;

    public static ITXCustomBeautyProcesserFactory getBeautyProcesserFactory() {
        return sProcesserFactory;
    }

    public static void register(ITXCustomBeautyProcesserFactory iTXCustomBeautyProcesserFactory) {
        sProcesserFactory = iTXCustomBeautyProcesserFactory;
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        if (registrar.activity() == null) {
            return;
        }
        new TRTCCloudPlugin();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        FlutterPlugin.FlutterAssets flutterAssets = flutterPluginBinding.getFlutterAssets();
        TextureRegistry textureRegistry = flutterPluginBinding.getTextureRegistry();
        PlatformViewRegistry platformViewRegistry = flutterPluginBinding.getPlatformViewRegistry();
        this.mCloudWrapper = new TRTCCloudWrapper(applicationContext, CHANNEL_SIGN, platformViewRegistry, textureRegistry, flutterAssets, binaryMessenger);
        platformViewRegistry.registerViewFactory(TRTCCloudVideoPlatformView.SIGN, new TRTCCloudVideoPlatformView(applicationContext, binaryMessenger));
        platformViewRegistry.registerViewFactory(TRTCCloudVideoSurfaceView.SIGN, new TRTCCloudVideoSurfaceView(applicationContext, binaryMessenger));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }
}
