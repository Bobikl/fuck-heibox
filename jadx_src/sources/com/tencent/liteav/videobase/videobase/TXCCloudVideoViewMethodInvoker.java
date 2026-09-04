package com.tencent.liteav.videobase.videobase;

import android.view.TextureView;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.rtmp.ui.AndroidViewEventListener;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public class TXCCloudVideoViewMethodInvoker {
    private static final String TAG = "TXCCloudVideoViewMethodInvoker";

    public static void addView(TXCloudVideoView tXCloudVideoView, TextureView textureView) {
        callMethod(tXCloudVideoView, "addViewInternal", new Class[]{TextureView.class}, textureView);
    }

    private static Object callMethod(TXCloudVideoView tXCloudVideoView, String str, Class<?>[] clsArr, Object... objArr) {
        if (tXCloudVideoView == null) {
            LiteavLog.w(TAG, str + ",TXCloudVideoView is null.");
            return null;
        }
        try {
            Method declaredMethod = TXCloudVideoView.class.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(tXCloudVideoView, objArr);
        } catch (Throwable th2) {
            LiteavLog.e(TAG, str + ",Exception:", th2);
            return null;
        }
    }

    public static Object getGLContextFromView(DisplayTarget displayTarget) {
        if (displayTarget == null || displayTarget.getTXCloudVideoView() == null) {
            return null;
        }
        return displayTarget.getTXCloudVideoView().getOpenGLContext();
    }

    public static TextureView getTextureViewSetByUser(TXCloudVideoView tXCloudVideoView) {
        Object objCallMethod = callMethod(tXCloudVideoView, "getTextureViewSetByUser", null, new Object[0]);
        if (objCallMethod instanceof TextureView) {
            return (TextureView) objCallMethod;
        }
        return null;
    }

    public static void removeDeprecatedViews(TXCloudVideoView tXCloudVideoView, TextureView textureView) {
        callMethod(tXCloudVideoView, "removeDeprecatedViews", new Class[]{TextureView.class}, textureView);
    }

    public static void removeView(TXCloudVideoView tXCloudVideoView, TextureView textureView, boolean z10) {
        callMethod(tXCloudVideoView, "removeViewInternal", new Class[]{TextureView.class, Boolean.TYPE}, textureView, Boolean.valueOf(z10));
    }

    public static void setAndroidViewEventListener(TXCloudVideoView tXCloudVideoView, AndroidViewEventListener androidViewEventListener) {
        callMethod(tXCloudVideoView, "setAndroidViewEventListener", new Class[]{AndroidViewEventListener.class}, androidViewEventListener);
    }

    public static void setBackgroundColorForInternalView(TXCloudVideoView tXCloudVideoView, int i10) {
        callMethod(tXCloudVideoView, "setBackgroundColorForInternalView", new Class[]{Integer.TYPE}, Integer.valueOf(i10));
    }

    public static void setTouchToFocusEnabled(TXCloudVideoView tXCloudVideoView, boolean z10) {
        callMethod(tXCloudVideoView, "setTouchToFocusEnabled", new Class[]{Boolean.TYPE}, Boolean.valueOf(z10));
    }

    public static void setZoomEnabled(TXCloudVideoView tXCloudVideoView, boolean z10) {
        callMethod(tXCloudVideoView, "setZoomEnabled", new Class[]{Boolean.TYPE}, Boolean.valueOf(z10));
    }

    public static void showFocusView(TXCloudVideoView tXCloudVideoView, int i10, int i11, int i12, int i13) {
        Class cls = Integer.TYPE;
        callMethod(tXCloudVideoView, "showFocusView", new Class[]{cls, cls, cls, cls}, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }
}
