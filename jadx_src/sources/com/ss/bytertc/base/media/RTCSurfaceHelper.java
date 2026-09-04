package com.ss.bytertc.base.media;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.realx.base.CalledByNative;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class RTCSurfaceHelper {
    ConcurrentHashMap<String, Object> mSurfaceCallbackMap = new ConcurrentHashMap<>();
    final Object mSurfaceCallbackMapLock = new Object();
    Long mSurfaceHelperHandle;

    @CalledByNative
    public RTCSurfaceHelper(long j10) {
        this.mSurfaceHelperHandle = 0L;
        this.mSurfaceHelperHandle = Long.valueOf(j10);
    }

    @CalledByNative
    public static boolean checkIsOnMainThread() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static native void nativeSetRenderTarget(long j10, Surface surface, String str);

    private Object registerSurfaceCallback(Object obj, String str) {
        if (obj instanceof SurfaceView) {
            SurfaceView surfaceView = (SurfaceView) obj;
            RTCSurfaceViewListener rTCSurfaceViewListener = new RTCSurfaceViewListener(surfaceView, this.mSurfaceHelperHandle.longValue(), str);
            surfaceView.getHolder().addCallback(rTCSurfaceViewListener);
            return rTCSurfaceViewListener;
        }
        if (!(obj instanceof TextureView)) {
            return null;
        }
        TextureView textureView = (TextureView) obj;
        RTCSurfaceTextureListener rTCSurfaceTextureListener = new RTCSurfaceTextureListener(textureView, this.mSurfaceHelperHandle.longValue(), str);
        textureView.setSurfaceTextureListener(rTCSurfaceTextureListener);
        return rTCSurfaceTextureListener;
    }

    @CalledByNative
    private void unRegisterSurfaceCallback(Object obj) {
        if (obj instanceof RTCSurfaceTextureListener) {
            ((RTCSurfaceTextureListener) obj).resetCallback();
        } else if (obj instanceof RTCSurfaceViewListener) {
            ((RTCSurfaceViewListener) obj).resetCallback();
        }
    }

    @CalledByNative
    void destroy() {
        synchronized (this.mSurfaceCallbackMapLock) {
            Iterator<Object> it = this.mSurfaceCallbackMap.values().iterator();
            while (it.hasNext()) {
                unRegisterSurfaceCallback(it.next());
            }
            this.mSurfaceCallbackMap.clear();
        }
    }

    @CalledByNative
    void registerRenderTargetView(View view, String str) {
        synchronized (this.mSurfaceCallbackMapLock) {
            if (this.mSurfaceCallbackMap.containsKey(str)) {
                unRegisterRenderTargetView(str);
            }
            Object objRegisterSurfaceCallback = registerSurfaceCallback(view, str);
            if (objRegisterSurfaceCallback != null) {
                this.mSurfaceCallbackMap.put(str, objRegisterSurfaceCallback);
            }
        }
    }

    @CalledByNative
    void unRegisterRenderTargetView(String str) {
        synchronized (this.mSurfaceCallbackMapLock) {
            if (this.mSurfaceCallbackMap.containsKey(str)) {
                unRegisterSurfaceCallback(this.mSurfaceCallbackMap.get(str));
                this.mSurfaceCallbackMap.remove(str);
            }
        }
    }
}
