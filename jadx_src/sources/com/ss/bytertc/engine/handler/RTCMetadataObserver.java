package com.ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.IMetadataObserver;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class RTCMetadataObserver {
    private static final String TAG = "RtcMetadataObserver";
    private WeakReference<RTCVideoImpl> mRtcVideoImpl;

    public RTCMetadataObserver(RTCVideoImpl rTCVideoImpl) {
        this.mRtcVideoImpl = new WeakReference<>(rTCVideoImpl);
    }

    @CalledByNative
    void onMetadataReceived(byte[] bArr, String str, long j10) {
        RTCVideoImpl rTCVideoImpl;
        IMetadataObserver metadataObserver;
        WeakReference<RTCVideoImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference == null || (rTCVideoImpl = weakReference.get()) == null || (metadataObserver = rTCVideoImpl.getMetadataObserver()) == null) {
            return;
        }
        metadataObserver.onMetadataReceived(bArr, str, j10);
    }

    @CalledByNative
    byte[] onReadyToSendMetadata(long j10) {
        RTCVideoImpl rTCVideoImpl;
        WeakReference<RTCVideoImpl> weakReference = this.mRtcVideoImpl;
        IMetadataObserver metadataObserver = (weakReference == null || (rTCVideoImpl = weakReference.get()) == null) ? null : rTCVideoImpl.getMetadataObserver();
        if (metadataObserver != null) {
            return metadataObserver.onReadyToSendMetadata(j10);
        }
        return null;
    }
}
