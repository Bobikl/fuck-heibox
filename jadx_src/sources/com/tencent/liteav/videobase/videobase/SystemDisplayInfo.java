package com.tencent.liteav.videobase.videobase;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.j;
import com.tencent.liteav.base.util.l;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public class SystemDisplayInfo {
    private static final String TAG = "SystemDisplayInfo";

    private static Display getDefaultDisplayByWindowManager() {
        Context contextC = j.a().c();
        if (contextC == null) {
            contextC = ContextUtils.getApplicationContext();
        }
        if (contextC == null) {
            LiteavLog.e(TAG, "context is null.");
            return null;
        }
        try {
            return ((WindowManager) contextC.getSystemService("window")).getDefaultDisplay();
        } catch (Throwable th2) {
            LiteavLog.e(TAG, "error getting display from window service.", th2);
            return null;
        }
    }

    public static Display getDisplay() {
        if (nativeGetDisplayRotationObtainMethod() == 0) {
            Display displayByDisplayManager = getDisplayByDisplayManager();
            return displayByDisplayManager != null ? displayByDisplayManager : getDefaultDisplayByWindowManager();
        }
        Display defaultDisplayByWindowManager = getDefaultDisplayByWindowManager();
        return defaultDisplayByWindowManager != null ? defaultDisplayByWindowManager : getDisplayByDisplayManager();
    }

    private static Display getDisplayByDisplayManager() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 32) {
            return null;
        }
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            LiteavLog.e(TAG, "context is null.");
            return null;
        }
        try {
            return ((DisplayManager) applicationContext.getSystemService("display")).getDisplay(0);
        } catch (Throwable th2) {
            LiteavLog.e(TAG, "error getting display from display service.", th2);
            return null;
        }
    }

    public static l getDisplayRotation() {
        l displayRotationCorrection = getDisplayRotationCorrection();
        if (displayRotationCorrection != null) {
            return displayRotationCorrection;
        }
        try {
            Display display = getDisplay();
            if (display != null) {
                return surfaceRotationEnumToRotation(display.getRotation());
            }
        } catch (Exception e10) {
            LiteavLog.e(TAG, "error getting display rotation.", e10);
        }
        return l.NORMAL;
    }

    private static l getDisplayRotationCorrection() {
        int iNativeGetDisplayRotationCorrection = nativeGetDisplayRotationCorrection();
        if (l.b(iNativeGetDisplayRotationCorrection)) {
            return l.a(iNativeGetDisplayRotationCorrection);
        }
        return null;
    }

    public static int getDisplayRotationDegree() {
        return getDisplayRotation().mValue;
    }

    public static Size getDisplaySize() {
        try {
            Display display = getDisplay();
            if (display != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getRealMetrics(displayMetrics);
                return new Size(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        } catch (Exception e10) {
            LiteavLog.e(TAG, "error getting display size.", e10);
        }
        return new Size(720, 1280);
    }

    private static native synchronized int nativeGetDisplayRotationCorrection();

    private static native synchronized int nativeGetDisplayRotationObtainMethod();

    private static l surfaceRotationEnumToRotation(int i10) {
        if (i10 == 1) {
            return l.ROTATION_90;
        }
        if (i10 != 2) {
            return i10 != 3 ? l.NORMAL : l.ROTATION_270;
        }
        return l.ROTATION_180;
    }
}
