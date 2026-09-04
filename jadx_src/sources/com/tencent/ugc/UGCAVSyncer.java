package com.tencent.ugc;

import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public class UGCAVSyncer {
    protected long mNativeUGCAVSyncer;

    public enum SkipMode {
        NOOP(0),
        SKIP_CURRENT_FRAME(1);

        private final int mNativeValue;

        SkipMode(int i10) {
            this.mNativeValue = i10;
        }

        public static SkipMode valueOf(int i10) {
            return i10 == 1 ? SKIP_CURRENT_FRAME : NOOP;
        }

        public final int getNativeValue() {
            return this.mNativeValue;
        }
    }

    public enum SyncMode {
        OFF(0),
        CLOCK_MASTER(1),
        AUDIO_MASTER(2),
        VIDEO_MASTER(3),
        INTERLEAVE_OUTPUT_WITHOUT_SKIP(4);

        private final int mNativeValue;

        SyncMode(int i10) {
            this.mNativeValue = i10;
        }

        public final int getNativeValue() {
            return this.mNativeValue;
        }
    }

    public UGCAVSyncer() {
        this.mNativeUGCAVSyncer = 0L;
        this.mNativeUGCAVSyncer = nativeCreate();
    }

    private static native long nativeCreate();

    private static native void nativeDestroy(long j10);

    private static native void nativeResetClock(long j10);

    private static native void nativeSetAudioEos(long j10);

    private static native void nativeSetAudioExist(long j10, boolean z10);

    private static native void nativeSetSyncMode(long j10, int i10);

    private static native void nativeSetVideoEos(long j10);

    private static native void nativeSetVideoExist(long j10, boolean z10);

    private static native void nativeStart(long j10);

    private static native void nativeStop(long j10);

    private static native int nativeSyncAudio(long j10, long j11);

    private static native int nativeSyncVideo(long j10, long j11);

    protected void finalize() throws Throwable {
        long j10 = this.mNativeUGCAVSyncer;
        if (j10 != 0) {
            nativeDestroy(j10);
            this.mNativeUGCAVSyncer = 0L;
        }
    }

    public void resetClock() {
        long j10 = this.mNativeUGCAVSyncer;
        if (j10 != 0) {
            nativeResetClock(j10);
        }
    }

    public void setAudioEos() {
        long j10 = this.mNativeUGCAVSyncer;
        if (j10 != 0) {
            nativeSetAudioEos(j10);
        }
    }

    public void setAudioExist(boolean z10) {
        long j10 = this.mNativeUGCAVSyncer;
        if (j10 != 0) {
            nativeSetAudioExist(j10, z10);
        }
    }

    public void setSyncMode(SyncMode syncMode) {
        long j10 = this.mNativeUGCAVSyncer;
        if (j10 != 0) {
            nativeSetSyncMode(j10, syncMode.getNativeValue());
        }
    }

    public void setVideoEos() {
        long j10 = this.mNativeUGCAVSyncer;
        if (j10 != 0) {
            nativeSetVideoEos(j10);
        }
    }

    public void setVideoExist(boolean z10) {
        long j10 = this.mNativeUGCAVSyncer;
        if (j10 != 0) {
            nativeSetVideoExist(j10, z10);
        }
    }

    public void start() {
        long j10 = this.mNativeUGCAVSyncer;
        if (j10 != 0) {
            nativeStart(j10);
        }
    }

    public void stop() {
        long j10 = this.mNativeUGCAVSyncer;
        if (j10 != 0) {
            nativeStop(j10);
        }
    }

    public SkipMode syncAudio(long j10) {
        long j11 = this.mNativeUGCAVSyncer;
        return j11 == 0 ? SkipMode.NOOP : SkipMode.valueOf(nativeSyncAudio(j11, j10));
    }

    public SkipMode syncVideo(long j10) {
        long j11 = this.mNativeUGCAVSyncer;
        return j11 == 0 ? SkipMode.NOOP : SkipMode.valueOf(nativeSyncVideo(j11, j10));
    }
}
