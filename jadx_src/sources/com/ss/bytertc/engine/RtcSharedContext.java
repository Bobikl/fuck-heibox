package com.ss.bytertc.engine;

import android.content.Context;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.a;
import com.ss.bytertc.base.utils.RtcContextUtils;
import com.ss.bytertc.engine.utils.TextureHelper;
import com.ss.bytertc.engine.utils.VideoFrameConverter;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes4.dex */
public class RtcSharedContext {
    private static String mPackageName;
    private static EglBase mRootEglBase;
    private static VideoFrameConverter mVideoFrameConverter;

    public static Context getApplicationContext() {
        return RtcContextUtils.getApplicationContext();
    }

    public static synchronized EglBase getEGLContext() {
        return mRootEglBase;
    }

    @CalledByNative
    public static synchronized long getNativeEGLContext() {
        long nativeEglContext;
        nativeEglContext = 0;
        TextureHelper textureHelper = getTextureHelper();
        if (textureHelper != null) {
            nativeEglContext = textureHelper.getNativeEglContext();
        } else {
            EglBase eglBase = mRootEglBase;
            if (eglBase != null) {
                nativeEglContext = eglBase.getEglBaseContext().getNativeEglContext();
            }
        }
        return nativeEglContext;
    }

    @CalledByNative
    public static String getRtcPackageName() {
        String str = mPackageName;
        return str != null ? str : "";
    }

    @CalledByNative
    public static TextureHelper getTextureHelper() {
        return mVideoFrameConverter.getTextureHelper();
    }

    @CalledByNative
    public static VideoFrameConverter getVideoFrameConverter() {
        return mVideoFrameConverter;
    }

    public static synchronized boolean initEglContext(Object obj) {
        try {
            if (obj == null) {
                mRootEglBase = a.a();
                return false;
            }
            if (obj instanceof EGLContext) {
                mRootEglBase = a.d((EGLContext) obj, EglBase.CONFIG_PLAIN);
            } else if (obj instanceof android.opengl.EGLContext) {
                mRootEglBase = a.f((android.opengl.EGLContext) obj, EglBase.CONFIG_PLAIN);
            } else if (obj instanceof EglBase) {
                mRootEglBase = a.c(((EglBase) obj).getEglBaseContext(), EglBase.CONFIG_PLAIN);
            } else {
                mRootEglBase = a.a();
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void initialize(Context context) {
        RtcContextUtils.initialize(context);
        mPackageName = context.getPackageName();
    }

    public static synchronized void releaseEglContext() {
        EglBase eglBase = mRootEglBase;
        if (eglBase != null) {
            eglBase.release();
            mRootEglBase = null;
        }
    }

    public static synchronized void setRootEglBase(EglBase eglBase) {
        mRootEglBase = eglBase;
    }

    public static synchronized void setVideoFrameConverter(VideoFrameConverter videoFrameConverter) {
        mVideoFrameConverter = videoFrameConverter;
    }
}
