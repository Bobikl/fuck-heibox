package com.tencent.liteav.trtc;

import android.opengl.EGLContext;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::trtc")
public class TRTCDefConverter {
    public static long getGLContextNativeHandle(Object obj) {
        if (obj instanceof EGLContext) {
            return LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? ((EGLContext) obj).getNativeHandle() : ((EGLContext) obj).getHandle();
        }
        return 0L;
    }
}
