package com.ss.bytertc.engine.live;

import android.opengl.EGL14;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.VideoFrame;
import com.ss.bytertc.engine.video.impl.WebrtcWrapperVideoFrame;

/* JADX INFO: loaded from: classes4.dex */
public class ChorusCacheSyncObserver {
    private IChorusCacheSyncObserver observer = null;

    @CalledByNative
    public void onSyncEvent(ChorusCacheSyncEvent chorusCacheSyncEvent, ChorusCacheSyncError chorusCacheSyncError) {
        IChorusCacheSyncObserver iChorusCacheSyncObserver = this.observer;
        if (iChorusCacheSyncObserver != null) {
            iChorusCacheSyncObserver.onSyncEvent(chorusCacheSyncEvent, chorusCacheSyncError);
        }
    }

    @CalledByNative
    public void onSyncedUsersChanged(int i10, String[] strArr) {
        IChorusCacheSyncObserver iChorusCacheSyncObserver = this.observer;
        if (iChorusCacheSyncObserver != null) {
            iChorusCacheSyncObserver.onSyncedUsersChanged(i10, strArr);
        }
    }

    @CalledByNative
    public void onSyncedVideoFrames(int i10, String[] strArr, VideoFrame[] videoFrameArr) {
        if (this.observer != null) {
            WebrtcWrapperVideoFrame[] webrtcWrapperVideoFrameArr = new WebrtcWrapperVideoFrame[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                VideoFrame videoFrame = videoFrameArr[i11];
                if (videoFrame != null) {
                    webrtcWrapperVideoFrameArr[i11] = videoFrame.getBuffer().getBufferType() == 4 ? new WebrtcWrapperVideoFrame(videoFrameArr[i11], EGL14.eglGetCurrentContext()) : new WebrtcWrapperVideoFrame(videoFrameArr[i11], null);
                    videoFrameArr[i11].release();
                }
            }
            this.observer.onSyncedVideoFrames(i10, strArr, webrtcWrapperVideoFrameArr);
        }
    }

    public void setUserObserver(IChorusCacheSyncObserver iChorusCacheSyncObserver) {
        if (iChorusCacheSyncObserver != null) {
            this.observer = iChorusCacheSyncObserver;
        }
    }
}
