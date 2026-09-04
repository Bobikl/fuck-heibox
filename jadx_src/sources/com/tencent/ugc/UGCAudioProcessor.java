package com.tencent.ugc;

import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public class UGCAudioProcessor {
    private static final String TAG = "UGCAudioProcessor";
    private UGCAVSyncer mAVSyncer;
    private long mNativeProcessor;
    private UGCMediaListSource mVideoSource;
    private AudioProgressListener mProgressListener = null;
    private AudioEncodedFrameListener mEncodeListener = null;
    private UGCMediaListSource mBGMSource = null;
    private final Object mBGMLock = new Object();

    public interface AudioEncodedFrameListener {
        void onAudioEncodingCompleted();

        void onAudioEncodingStarted();

        void onAudioFrameEncoded(AudioFrame audioFrame);
    }

    public interface AudioProgressListener {
        void onComplete(boolean z10);

        void onProgress(long j10);
    }

    public UGCAudioProcessor(UGCAVSyncer uGCAVSyncer, UGCMediaListSource uGCMediaListSource) {
        this.mNativeProcessor = 0L;
        this.mVideoSource = uGCMediaListSource;
        this.mAVSyncer = uGCAVSyncer;
        this.mNativeProcessor = nativeCreateProcessor(this);
    }

    private void destroyBGMSource() {
        synchronized (this.mBGMLock) {
            UGCMediaListSource uGCMediaListSource = this.mBGMSource;
            if (uGCMediaListSource != null) {
                uGCMediaListSource.uninitialize();
                this.mBGMSource = null;
            }
        }
    }

    private static native long nativeCreateProcessor(UGCAudioProcessor uGCAudioProcessor);

    private static native void nativeDestroyProcessor(long j10);

    private static native void nativeEnableBGM(long j10, boolean z10);

    private static native void nativeInitialize(long j10);

    private static native void nativeSetBGMAtVideoTime(long j10, long j11);

    private static native void nativeSetBGMLoop(long j10, boolean z10);

    private static native void nativeSetBGMStartTime(long j10, long j11, long j12);

    private static native void nativeSetBGMVolume(long j10, float f10);

    private static native void nativeSetEncodeParams(long j10, int i10, int i11, int i12, int i13);

    private static native void nativeSetFadeInOutDuration(long j10, long j11, long j12);

    private static native void nativeSetSpeedList(long j10, int[] iArr, long[] jArr, long[] jArr2);

    private static native void nativeSetVideoVolume(long j10, float f10);

    private static native void nativeSetVideoVolumes(long j10, float[] fArr);

    private static native void nativeStart(long j10, boolean z10);

    private static native void nativeStop(long j10);

    private static native void nativeUnInitialize(long j10);

    private AudioFrame[] readNextAudioFrame(boolean z10) {
        synchronized (this.mBGMLock) {
            try {
                UGCMediaListSource uGCMediaListSource = z10 ? this.mBGMSource : this.mVideoSource;
                if (uGCMediaListSource == null) {
                    StringBuilder sb2 = new StringBuilder("readNextAudioFrame failed for ");
                    sb2.append(z10 ? "BGM" : "video");
                    Log.w(TAG, sb2.toString(), new Object[0]);
                    return null;
                }
                List<AudioFrame> nextAudioFrame = uGCMediaListSource.readNextAudioFrame();
                if (nextAudioFrame != null && !nextAudioFrame.isEmpty()) {
                    return (AudioFrame[]) nextAudioFrame.toArray(new AudioFrame[0]);
                }
                StringBuilder sb3 = new StringBuilder("readNextAudioFrame eos for ");
                sb3.append(z10 ? "BGM" : "video");
                Log.i(TAG, sb3.toString(), new Object[0]);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public AudioFrame createAudioFrameFromNative(int i10, int i11, long j10, int i12, int i13) {
        AudioFrame audioFrame = new AudioFrame();
        audioFrame.setSampleRate(i10);
        audioFrame.setChannelCount(i11);
        audioFrame.setData(ByteBuffer.allocateDirect(i13));
        audioFrame.setTimestamp(j10);
        AudioFrame.AudioCodecFormat audioCodecFormat = AudioFrame.AudioCodecFormat.AAC;
        if (i12 != audioCodecFormat.getValue()) {
            audioCodecFormat = AudioFrame.AudioCodecFormat.PCM;
        }
        audioFrame.setCodecFormat(audioCodecFormat);
        return audioFrame;
    }

    public void destroy() {
        if (this.mNativeProcessor == 0) {
            return;
        }
        destroyBGMSource();
        nativeDestroyProcessor(this.mNativeProcessor);
        this.mNativeProcessor = 0L;
    }

    public void initialize() {
        long j10 = this.mNativeProcessor;
        if (j10 != 0) {
            nativeInitialize(j10);
        }
    }

    public void notifyEncodedDataFromNative(AudioFrame audioFrame) {
        AudioEncodedFrameListener audioEncodedFrameListener = this.mEncodeListener;
        if (audioEncodedFrameListener != null) {
            audioEncodedFrameListener.onAudioFrameEncoded(audioFrame);
        }
    }

    public void notifyEncodingCompletedFromNative() {
        AudioEncodedFrameListener audioEncodedFrameListener = this.mEncodeListener;
        if (audioEncodedFrameListener != null) {
            audioEncodedFrameListener.onAudioEncodingCompleted();
        }
        UGCAVSyncer uGCAVSyncer = this.mAVSyncer;
        if (uGCAVSyncer != null) {
            uGCAVSyncer.setAudioEos();
        }
    }

    public void notifyEncodingStartedFromNative() {
        AudioEncodedFrameListener audioEncodedFrameListener = this.mEncodeListener;
        if (audioEncodedFrameListener != null) {
            audioEncodedFrameListener.onAudioEncodingStarted();
        }
    }

    public void notifyPlayoutCompletedFromNative(boolean z10) {
        AudioProgressListener audioProgressListener = this.mProgressListener;
        if (audioProgressListener != null) {
            audioProgressListener.onComplete(z10);
        }
        UGCAVSyncer uGCAVSyncer = this.mAVSyncer;
        if (uGCAVSyncer != null) {
            uGCAVSyncer.setAudioEos();
        }
    }

    public void notifyProgressFromNative(long j10) {
        AudioProgressListener audioProgressListener = this.mProgressListener;
        if (audioProgressListener != null) {
            audioProgressListener.onProgress(j10);
        }
    }

    public AudioFrame[] requestAudioDataFromNative() {
        return readNextAudioFrame(false);
    }

    public AudioFrame[] requestBGMDataFromNative() {
        return readNextAudioFrame(true);
    }

    public boolean requestBGMSeekFromNative(long j10) {
        synchronized (this.mBGMLock) {
            UGCMediaListSource uGCMediaListSource = this.mBGMSource;
            if (uGCMediaListSource != null && uGCMediaListSource.hasAudioData() && this.mBGMSource.getDuration() >= j10) {
                this.mBGMSource.seekTo(j10);
                return true;
            }
            return false;
        }
    }

    public void setAudioEncodedFrameListener(AudioEncodedFrameListener audioEncodedFrameListener) {
        this.mEncodeListener = audioEncodedFrameListener;
    }

    public void setBGM(String str) {
        long duration;
        if (this.mNativeProcessor == 0) {
            return;
        }
        if (str == null) {
            destroyBGMSource();
            nativeEnableBGM(this.mNativeProcessor, false);
            return;
        }
        synchronized (this.mBGMLock) {
            destroyBGMSource();
            UGCMediaListSource uGCMediaListSource = new UGCMediaListSource();
            this.mBGMSource = uGCMediaListSource;
            uGCMediaListSource.initialize();
            this.mBGMSource.setVideoSources(Collections.singletonList(str));
            duration = this.mBGMSource.getDuration();
        }
        nativeEnableBGM(this.mNativeProcessor, true);
        if (duration > 0) {
            setBGMStartTime(0L, duration);
        }
    }

    public void setBGMAtVideoTime(long j10) {
        long j11 = this.mNativeProcessor;
        if (j11 != 0) {
            nativeSetBGMAtVideoTime(j11, j10);
        }
    }

    public void setBGMLoop(boolean z10) {
        long j10 = this.mNativeProcessor;
        if (j10 != 0) {
            nativeSetBGMLoop(j10, z10);
        }
    }

    public void setBGMStartTime(long j10, long j11) {
        long j12 = this.mNativeProcessor;
        if (j12 != 0) {
            nativeSetBGMStartTime(j12, j10, j11);
        }
    }

    public void setBGMVolume(float f10) {
        long j10 = this.mNativeProcessor;
        if (j10 != 0) {
            nativeSetBGMVolume(j10, f10);
        }
    }

    public void setEncodeParams(AudioEncodeParams audioEncodeParams) {
        long j10 = this.mNativeProcessor;
        if (j10 != 0) {
            nativeSetEncodeParams(j10, audioEncodeParams.getSampleRate(), audioEncodeParams.getChannels(), audioEncodeParams.getBitsPerChannel(), audioEncodeParams.getBitrate());
        }
    }

    public void setFadeInOutDuration(long j10, long j11) {
        long j12 = this.mNativeProcessor;
        if (j12 != 0) {
            nativeSetFadeInOutDuration(j12, j10, j11);
        }
    }

    public void setMediaListSource(UGCMediaListSource uGCMediaListSource) {
        this.mVideoSource = uGCMediaListSource;
    }

    public void setProgressListener(AudioProgressListener audioProgressListener) {
        this.mProgressListener = audioProgressListener;
    }

    public void setSpeedList(List<TXVideoEditConstants.TXSpeed> list) {
        long[] jArr;
        long[] jArr2;
        if (this.mNativeProcessor == 0) {
            return;
        }
        int[] iArr = null;
        if (list == null || list.isEmpty()) {
            jArr = null;
            jArr2 = null;
        } else {
            iArr = new int[list.size()];
            jArr = new long[list.size()];
            jArr2 = new long[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                TXVideoEditConstants.TXSpeed tXSpeed = list.get(i10);
                iArr[i10] = tXSpeed.speedLevel;
                jArr[i10] = tXSpeed.startTime;
                jArr2[i10] = tXSpeed.endTime;
            }
        }
        nativeSetSpeedList(this.mNativeProcessor, iArr, jArr, jArr2);
    }

    public void setVideoVolume(float f10) {
        long j10 = this.mNativeProcessor;
        if (j10 != 0) {
            nativeSetVideoVolume(j10, f10);
        }
    }

    public void setVideoVolumes(float[] fArr) {
        long j10 = this.mNativeProcessor;
        if (j10 != 0) {
            nativeSetVideoVolumes(j10, fArr);
        }
    }

    public void start(boolean z10) {
        long j10 = this.mNativeProcessor;
        if (j10 != 0) {
            nativeStart(j10, z10);
        }
    }

    public void stop() {
        long j10 = this.mNativeProcessor;
        if (j10 != 0) {
            nativeStop(j10);
        }
    }

    public int syncAudioFromNative(long j10) {
        UGCAVSyncer uGCAVSyncer = this.mAVSyncer;
        return uGCAVSyncer != null ? uGCAVSyncer.syncAudio(j10).getNativeValue() : UGCAVSyncer.SkipMode.NOOP.getNativeValue();
    }

    public void unInitialize() {
        long j10 = this.mNativeProcessor;
        if (j10 != 0) {
            nativeUnInitialize(j10);
        }
    }
}
