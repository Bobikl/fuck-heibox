package com.tencent.liteav.trtc;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.trtc.TRTCCloudDef;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::trtc")
public class AudioVodTrackJni {
    private long mNativeAudioVodTrackJni;

    public static class AudioFrame {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TRTCCloudDef.TRTCAudioFrame f99840a;

        public AudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
            this.f99840a = tRTCAudioFrame;
        }

        public int getChannel() {
            return this.f99840a.channel;
        }

        public byte[] getData() {
            return this.f99840a.data;
        }

        public int getSampleRate() {
            return this.f99840a.sampleRate;
        }

        public long getTimestamp() {
            return this.f99840a.timestamp;
        }
    }

    public AudioVodTrackJni() {
        this.mNativeAudioVodTrackJni = 0L;
        this.mNativeAudioVodTrackJni = nativeCreateAudioVodTrackJni(this);
    }

    private static native void nativeClean(long j10);

    private static native long nativeCreateAudioVodTrackJni(AudioVodTrackJni audioVodTrackJni);

    private static native void nativeEnablePlayout(long j10, boolean z10);

    private static native void nativePause(long j10);

    private static native void nativeResume(long j10);

    private static native void nativeSeek(long j10);

    private static native void nativeSetPlayoutVolume(long j10, int i10);

    private static native int nativeWriteData(long j10, AudioFrame audioFrame);

    public synchronized void clean() {
        long j10 = this.mNativeAudioVodTrackJni;
        if (j10 != 0) {
            nativeClean(j10);
        }
    }

    public synchronized void enablePlayout(boolean z10) {
        long j10 = this.mNativeAudioVodTrackJni;
        if (j10 != 0) {
            nativeEnablePlayout(j10, z10);
        }
    }

    public synchronized void pause() {
        long j10 = this.mNativeAudioVodTrackJni;
        if (j10 != 0) {
            nativePause(j10);
        }
    }

    public synchronized void resume() {
        long j10 = this.mNativeAudioVodTrackJni;
        if (j10 != 0) {
            nativeResume(j10);
        }
    }

    public synchronized void seek() {
        long j10 = this.mNativeAudioVodTrackJni;
        if (j10 != 0) {
            nativeSeek(j10);
        }
    }

    public synchronized void setPlayoutVolume(int i10) {
        long j10 = this.mNativeAudioVodTrackJni;
        if (j10 != 0) {
            nativeSetPlayoutVolume(j10, i10);
        }
    }

    public synchronized int writeData(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        long j10 = this.mNativeAudioVodTrackJni;
        if (j10 == 0) {
            return -1;
        }
        return nativeWriteData(j10, new AudioFrame(tRTCAudioFrame));
    }
}
