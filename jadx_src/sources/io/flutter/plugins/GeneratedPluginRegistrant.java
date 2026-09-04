package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.n0;
import ca.b;
import com.baseflow.permissionhandler.o;
import com.ss.bytertc.engine.flutter.plugin.ByteRTCPlugin;
import com.tekartik.sqflite.f0;
import com.tencent.trtcplugin.TRTCCloudPlugin;
import dev.fluttercommunity.plus.connectivity.f;
import gh.e;
import hh.c;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin;
import io.flutter.plugins.urllauncher.UrlLauncherPlugin;
import xyz.luan.audioplayers.AudioplayersPlugin;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(@n0 FlutterEngine flutterEngine) {
        try {
            flutterEngine.getPlugins().add(new AudioplayersPlugin());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin audioplayers_android, xyz.luan.audioplayers.AudioplayersPlugin", e10);
        }
        try {
            flutterEngine.getPlugins().add(new b());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin catcher, com.jhomlala.catcher.CatcherPlugin", e11);
        }
        try {
            flutterEngine.getPlugins().add(new f());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin", e12);
        }
        try {
            flutterEngine.getPlugins().add(new fh.b());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e13);
        }
        try {
            flutterEngine.getPlugins().add(new eh.b());
        } catch (Exception e14) {
            Log.e(TAG, "Error registering plugin flutter_icmp_ping, com.zuvola.flutter_icmp_ping.FlutterIcmpPingPlugin", e14);
        }
        try {
            flutterEngine.getPlugins().add(new da.b());
        } catch (Exception e15) {
            Log.e(TAG, "Error registering plugin flutter_keyboard_visibility, com.jrai.flutter_keyboard_visibility.FlutterKeyboardVisibilityPlugin", e15);
        }
        try {
            flutterEngine.getPlugins().add(new io.github.ponnamkarthik.toast.fluttertoast.b());
        } catch (Exception e16) {
            Log.e(TAG, "Error registering plugin fluttertoast, io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin", e16);
        }
        try {
            flutterEngine.getPlugins().add(new ie.b());
        } catch (Exception e17) {
            Log.e(TAG, "Error registering plugin heybox_okflutter, com.max.heybox.okflutter.HeyboxOkflutterPlugin", e17);
        }
        try {
            flutterEngine.getPlugins().add(new com.example.imagegallerysaver.b());
        } catch (Exception e18) {
            Log.e(TAG, "Error registering plugin image_gallery_saver, com.example.imagegallerysaver.ImageGallerySaverPlugin", e18);
        }
        try {
            flutterEngine.getPlugins().add(new e());
        } catch (Exception e19) {
            Log.e(TAG, "Error registering plugin network_info_plus, dev.fluttercommunity.plus.network_info.NetworkInfoPlusPlugin", e19);
        }
        try {
            flutterEngine.getPlugins().add(new c());
        } catch (Exception e20) {
            Log.e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e20);
        }
        try {
            flutterEngine.getPlugins().add(new PathProviderPlugin());
        } catch (Exception e21) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e21);
        }
        try {
            flutterEngine.getPlugins().add(new o());
        } catch (Exception e22) {
            Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e22);
        }
        try {
            flutterEngine.getPlugins().add(new SharedPreferencesPlugin());
        } catch (Exception e23) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e23);
        }
        try {
            flutterEngine.getPlugins().add(new f0());
        } catch (Exception e24) {
            Log.e(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e24);
        }
        try {
            flutterEngine.getPlugins().add(new TRTCCloudPlugin());
        } catch (Exception e25) {
            Log.e(TAG, "Error registering plugin tencent_trtc_cloud, com.tencent.trtcplugin.TRTCCloudPlugin", e25);
        }
        try {
            flutterEngine.getPlugins().add(new UrlLauncherPlugin());
        } catch (Exception e26) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e26);
        }
        try {
            flutterEngine.getPlugins().add(new ByteRTCPlugin());
        } catch (Exception e27) {
            Log.e(TAG, "Error registering plugin volc_engine_rtc, com.ss.bytertc.engine.flutter.plugin.ByteRTCPlugin", e27);
        }
    }
}
