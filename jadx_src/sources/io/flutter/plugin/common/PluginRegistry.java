package io.flutter.plugin.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.plugin.platform.PlatformViewRegistry;
import io.flutter.view.FlutterNativeView;
import io.flutter.view.FlutterView;
import io.flutter.view.TextureRegistry;

/* JADX INFO: loaded from: classes4.dex */
public interface PluginRegistry {

    public interface ActivityResultListener {
        boolean onActivityResult(int i10, int i11, @p0 Intent intent);
    }

    public interface NewIntentListener {
        boolean onNewIntent(@n0 Intent intent);
    }

    @Deprecated
    public interface PluginRegistrantCallback {
        void registerWith(@n0 PluginRegistry pluginRegistry);
    }

    @Deprecated
    public interface Registrar {
        @n0
        Context activeContext();

        @p0
        Activity activity();

        @n0
        Registrar addActivityResultListener(@n0 ActivityResultListener activityResultListener);

        @n0
        Registrar addNewIntentListener(@n0 NewIntentListener newIntentListener);

        @n0
        Registrar addRequestPermissionsResultListener(@n0 RequestPermissionsResultListener requestPermissionsResultListener);

        @n0
        Registrar addUserLeaveHintListener(@n0 UserLeaveHintListener userLeaveHintListener);

        @n0
        Registrar addViewDestroyListener(@n0 ViewDestroyListener viewDestroyListener);

        @n0
        Registrar addWindowFocusChangedListener(@n0 WindowFocusChangedListener windowFocusChangedListener);

        @n0
        Context context();

        @n0
        String lookupKeyForAsset(@n0 String str);

        @n0
        String lookupKeyForAsset(@n0 String str, @n0 String str2);

        @n0
        BinaryMessenger messenger();

        @n0
        PlatformViewRegistry platformViewRegistry();

        @n0
        Registrar publish(@p0 Object obj);

        @n0
        TextureRegistry textures();

        @n0
        FlutterView view();
    }

    public interface RequestPermissionsResultListener {
        boolean onRequestPermissionsResult(int i10, @n0 String[] strArr, @n0 int[] iArr);
    }

    public interface UserLeaveHintListener {
        void onUserLeaveHint();
    }

    @Deprecated
    public interface ViewDestroyListener {
        boolean onViewDestroy(@n0 FlutterNativeView flutterNativeView);
    }

    public interface WindowFocusChangedListener {
        void onWindowFocusChanged(boolean z10);
    }

    @Deprecated
    boolean hasPlugin(@n0 String str);

    @n0
    @Deprecated
    Registrar registrarFor(@n0 String str);

    @p0
    @Deprecated
    <T> T valuePublishedByPlugin(@n0 String str);
}
