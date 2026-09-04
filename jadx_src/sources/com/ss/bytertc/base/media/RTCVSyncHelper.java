package com.ss.bytertc.base.media;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes10.dex */
public class RTCVSyncHelper {

    public static class ChoreographerFrameCallback implements Choreographer.FrameCallback {
        public long nativeCallbackHandle = 0;
        public String renderTaskUUID;

        ChoreographerFrameCallback() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            if (this.nativeCallbackHandle != 0) {
                Choreographer choreographer = Choreographer.getInstance();
                if (choreographer != null) {
                    choreographer.postFrameCallback(this);
                }
                RTCNativeFunctions.nativeNotifyVSyncDoFrame(this.nativeCallbackHandle, this.renderTaskUUID);
            }
        }

        public void resetCallback() {
            this.nativeCallbackHandle = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$registerVSyncCallback$0(ChoreographerFrameCallback choreographerFrameCallback) {
        Choreographer choreographer = Choreographer.getInstance();
        if (choreographer != null) {
            choreographer.postFrameCallback(choreographerFrameCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$unregisterVSyncCallback$1(Object obj) {
        ((ChoreographerFrameCallback) obj).resetCallback();
    }

    @CalledByNative
    public static Object registerVSyncCallback(long j10, String str) {
        if (j10 == 0) {
            return null;
        }
        final ChoreographerFrameCallback choreographerFrameCallback = new ChoreographerFrameCallback();
        choreographerFrameCallback.nativeCallbackHandle = j10;
        choreographerFrameCallback.renderTaskUUID = str;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ss.bytertc.base.media.l
            @Override // java.lang.Runnable
            public final void run() {
                RTCVSyncHelper.lambda$registerVSyncCallback$0(choreographerFrameCallback);
            }
        });
        return choreographerFrameCallback;
    }

    @CalledByNative
    public static void unregisterVSyncCallback(final Object obj) {
        if (obj instanceof ChoreographerFrameCallback) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ss.bytertc.base.media.k
                @Override // java.lang.Runnable
                public final void run() {
                    RTCVSyncHelper.lambda$unregisterVSyncCallback$1(obj);
                }
            });
        }
    }
}
