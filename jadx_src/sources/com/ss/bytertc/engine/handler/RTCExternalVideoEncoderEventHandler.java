package com.ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class RTCExternalVideoEncoderEventHandler {
    private static final String TAG = "RTCExternalVideoEncoderEventHandler";
    private WeakReference<RTCVideoImpl> mRtcVideoImpl;

    public RTCExternalVideoEncoderEventHandler(RTCVideoImpl rTCVideoImpl) {
        this.mRtcVideoImpl = new WeakReference<>(rTCVideoImpl);
    }

    @CalledByNative
    void OnActiveVideoLayer(int i10, int i11, boolean z10) {
        RTCVideoImpl rTCVideoImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler;
        RTCVideoImpl rTCVideoImpl2;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler2;
        WeakReference<RTCVideoImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference != null && (rTCVideoImpl2 = weakReference.get()) != null && (externalVideoEncoderEventHandler2 = rTCVideoImpl2.getExternalVideoEncoderEventHandler()) != null) {
            externalVideoEncoderEventHandler2.onActiveVideoLayer(StreamIndex.fromId(i10), i11, z10);
        }
        WeakReference<RTCVideoImpl> weakReference2 = this.mRtcVideoImpl;
        if (weakReference2 == null || (rTCVideoImpl = weakReference2.get()) == null || (externalVideoEncoderEventHandler = rTCVideoImpl.getExternalVideoEncoderEventHandler()) == null) {
            return;
        }
        externalVideoEncoderEventHandler.onActiveVideoLayer(StreamIndex.fromId(i10), i11, z10);
    }

    @CalledByNative
    void OnRateUpdate(int i10, int i11, int i12, int i13) {
        RTCVideoImpl rTCVideoImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler;
        WeakReference<RTCVideoImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference == null || (rTCVideoImpl = weakReference.get()) == null || (externalVideoEncoderEventHandler = rTCVideoImpl.getExternalVideoEncoderEventHandler()) == null) {
            return;
        }
        externalVideoEncoderEventHandler.onRateUpdate(StreamIndex.fromId(i10), i11, i12, i13);
    }

    @CalledByNative
    void OnRequestKeyFrame(int i10, int i11) {
        RTCVideoImpl rTCVideoImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler;
        WeakReference<RTCVideoImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference == null || (rTCVideoImpl = weakReference.get()) == null || (externalVideoEncoderEventHandler = rTCVideoImpl.getExternalVideoEncoderEventHandler()) == null) {
            return;
        }
        externalVideoEncoderEventHandler.onRequestKeyFrame(StreamIndex.fromId(i10), i11);
    }

    @CalledByNative
    void OnStart(int i10) {
        RTCVideoImpl rTCVideoImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler;
        WeakReference<RTCVideoImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference == null || (rTCVideoImpl = weakReference.get()) == null || (externalVideoEncoderEventHandler = rTCVideoImpl.getExternalVideoEncoderEventHandler()) == null) {
            return;
        }
        externalVideoEncoderEventHandler.onStart(StreamIndex.fromId(i10));
    }

    @CalledByNative
    void OnStop(int i10) {
        RTCVideoImpl rTCVideoImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler;
        WeakReference<RTCVideoImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference == null || (rTCVideoImpl = weakReference.get()) == null || (externalVideoEncoderEventHandler = rTCVideoImpl.getExternalVideoEncoderEventHandler()) == null) {
            return;
        }
        externalVideoEncoderEventHandler.onStop(StreamIndex.fromId(i10));
    }
}
