package io.flutter.view;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.loader.FlutterLoader;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class FlutterMain {

    public static class Settings {
        private String logTag;

        @p0
        public String getLogTag() {
            return this.logTag;
        }

        public void setLogTag(String str) {
            this.logTag = str;
        }
    }

    public static void ensureInitializationComplete(@n0 Context context, @p0 String[] strArr) {
        FlutterInjector.instance().flutterLoader().ensureInitializationComplete(context, strArr);
    }

    public static void ensureInitializationCompleteAsync(@n0 Context context, @p0 String[] strArr, @n0 Handler handler, @n0 Runnable runnable) {
        FlutterInjector.instance().flutterLoader().ensureInitializationCompleteAsync(context, strArr, handler, runnable);
    }

    @n0
    public static String findAppBundlePath() {
        return FlutterInjector.instance().flutterLoader().findAppBundlePath();
    }

    @p0
    @Deprecated
    public static String findAppBundlePath(@n0 Context context) {
        return FlutterInjector.instance().flutterLoader().findAppBundlePath();
    }

    @n0
    public static String getLookupKeyForAsset(@n0 String str) {
        return FlutterInjector.instance().flutterLoader().getLookupKeyForAsset(str);
    }

    @n0
    public static String getLookupKeyForAsset(@n0 String str, @n0 String str2) {
        return FlutterInjector.instance().flutterLoader().getLookupKeyForAsset(str, str2);
    }

    public static void startInitialization(@n0 Context context) {
        FlutterInjector.instance().flutterLoader().startInitialization(context);
    }

    public static void startInitialization(@n0 Context context, @n0 Settings settings) {
        FlutterLoader.Settings settings2 = new FlutterLoader.Settings();
        settings2.setLogTag(settings.getLogTag());
        FlutterInjector.instance().flutterLoader().startInitialization(context, settings2);
    }
}
