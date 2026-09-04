package com.tencent.liteav.live;

import com.tencent.rtmp.ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f99766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f99767b;

    static {
        try {
            Method declaredMethod = TXCloudVideoView.class.getDeclaredMethod("setShowLogCallback", WeakReference.class);
            f99766a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = TXCloudVideoView.class.getDeclaredMethod("isShowLogEnabled", new Class[0]);
            f99767b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void a(TXCloudVideoView tXCloudVideoView, WeakReference<TXCloudVideoView.b> weakReference) {
        if (tXCloudVideoView == null) {
            return;
        }
        try {
            f99766a.invoke(tXCloudVideoView, weakReference);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static boolean a(TXCloudVideoView tXCloudVideoView) {
        if (tXCloudVideoView == null) {
            return false;
        }
        try {
            Object objInvoke = f99767b.invoke(tXCloudVideoView, new Object[0]);
            if (objInvoke == null || !(objInvoke instanceof Boolean)) {
                return false;
            }
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
