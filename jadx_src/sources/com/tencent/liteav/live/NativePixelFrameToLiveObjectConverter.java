package com.tencent.liteav.live;

import android.os.Looper;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav")
public class NativePixelFrameToLiveObjectConverter {
    public static ByteBuffer createByteBuffer(int i10) {
        return ByteBuffer.allocateDirect(i10);
    }

    public static long getGLContextNativeHandle(Object obj) {
        return OpenGlUtils.getGLContextNativeHandle(obj);
    }

    public static boolean isInUIThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
