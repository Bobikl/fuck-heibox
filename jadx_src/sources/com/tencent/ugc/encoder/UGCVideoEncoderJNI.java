package com.tencent.ugc.encoder;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.l;
import com.tencent.ugc.videobase.common.EncodedVideoFrame;
import com.tencent.ugc.videobase.frame.PixelFrame;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public class UGCVideoEncoderJNI {
    private UGCVideoEncoderListener mListener;
    private long mNativeHandle = 0;

    public enum EncoderType {
        HARDWARE,
        SOFTWARE
    }

    public interface UGCVideoEncoderListener {
        void onEncodedFail();

        void onEncodedNAL(EncodedVideoFrame encodedVideoFrame);
    }

    private static native long nativeCreate(UGCVideoEncoderJNI uGCVideoEncoderJNI);

    private static native void nativeDestroy(long j10);

    private static native void nativeEncodeFrame(long j10, int i10, Object obj, int i11, int i12, int i13, long j11);

    private static native boolean nativeIsInputQueueFull(long j10);

    private static native void nativeSignalEndOfStream(long j10);

    private static native void nativeStart(long j10, boolean z10, VideoEncodeParams videoEncodeParams);

    private static native void nativeStopSync(long j10, int i10);

    private void onEncodedFailFromNative() {
        UGCVideoEncoderListener uGCVideoEncoderListener = this.mListener;
        if (uGCVideoEncoderListener != null) {
            uGCVideoEncoderListener.onEncodedFail();
        }
    }

    private void onEncodedNALFromNative(EncodedVideoFrame encodedVideoFrame) {
        UGCVideoEncoderListener uGCVideoEncoderListener = this.mListener;
        if (uGCVideoEncoderListener != null) {
            uGCVideoEncoderListener.onEncodedNAL(encodedVideoFrame);
        }
    }

    public void encodeFrame(PixelFrame pixelFrame) {
        if (this.mNativeHandle == 0) {
            return;
        }
        l encodeRotation = l.NORMAL;
        if (pixelFrame.getMetaData() != null) {
            encodeRotation = pixelFrame.getMetaData().getEncodeRotation();
        }
        nativeEncodeFrame(this.mNativeHandle, pixelFrame.getTextureId(), pixelFrame.getGLContext(), pixelFrame.getWidth(), pixelFrame.getHeight(), encodeRotation.mValue, pixelFrame.getTimestamp());
    }

    public boolean isInputQueueFull() {
        long j10 = this.mNativeHandle;
        if (j10 != 0) {
            return nativeIsInputQueueFull(j10);
        }
        return false;
    }

    public void signalEndOfStream() {
        long j10 = this.mNativeHandle;
        if (j10 != 0) {
            nativeSignalEndOfStream(j10);
        }
    }

    public void start(EncoderType encoderType, VideoEncodeParams videoEncodeParams, UGCVideoEncoderListener uGCVideoEncoderListener) {
        this.mListener = uGCVideoEncoderListener;
        if (this.mNativeHandle != 0) {
            return;
        }
        long jNativeCreate = nativeCreate(this);
        this.mNativeHandle = jNativeCreate;
        nativeStart(jNativeCreate, encoderType == EncoderType.HARDWARE, videoEncodeParams);
    }

    public void stopSync(long j10) {
        long j11 = this.mNativeHandle;
        if (j11 != 0) {
            nativeStopSync(j11, (int) j10);
            nativeDestroy(this.mNativeHandle);
            this.mNativeHandle = 0L;
        }
    }
}
