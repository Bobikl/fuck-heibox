package com.ss.bytertc.audio.device.webrtc;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import androidx.annotation.p0;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.ExceptionUtils;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class WebRtcAudioTrack {
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_USAGE;
    private static final int INVALID_AUDIO_SESSION_ID = -1;
    private static final String TAG = "WebRtcAudioTrack";

    @p0
    private static ErrorCallback errorCallback;

    @p0
    private static WebRtcAudioTrackErrorCallback errorCallbackOld;
    private static boolean sForbidVoip;
    private static volatile boolean speakerMute;
    private static int usageAttribute;
    private String apiResult;
    private final AudioManager audioManager;

    @p0
    private AudioTrackThread audioThread;

    @p0
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private byte[] emptyBytes;
    private final long nativeAudioTrack;
    private final ThreadUtils.ThreadChecker threadChecker;

    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    public class AudioTrackThread extends Thread {
        private volatile boolean keepAlive;

        public AudioTrackThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        private int writeBytes(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
            if (audioTrack == null) {
                return -1;
            }
            return audioTrack.write(byteBuffer, i10, 0);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            if (WebRtcAudioTrack.this.audioTrack == null) {
                RXLogging.e(WebRtcAudioTrack.TAG, "null audio track instance");
                this.keepAlive = false;
            } else {
                RXLogging.i(WebRtcAudioTrack.TAG, "AudioTrackThread" + WebRtcAudioUtils.getThreadInfo());
                RXLogging.i(WebRtcAudioTrack.TAG, "AudioTrack state: " + WebRtcAudioTrack.this.audioTrack.getPlayState());
            }
            Process.setThreadPriority(-19);
            int iCapacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                synchronized (this) {
                    if (this.keepAlive) {
                        WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                        webRtcAudioTrack.nativeGetPlayoutData(iCapacity, webRtcAudioTrack.nativeAudioTrack);
                    }
                }
                if (WebRtcAudioTrack.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                int iWriteBytes = -1;
                try {
                    iWriteBytes = writeBytes(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, iCapacity);
                } catch (Exception e10) {
                    this.keepAlive = false;
                    RXLogging.e(WebRtcAudioTrack.TAG, "AudioTrack.write error, Exception: " + e10.getMessage());
                    WebRtcAudioTrack.this.reportWebRtcAudioTrackError("AudioTrack.write error, Exception: " + e10.getMessage());
                }
                if (iWriteBytes != iCapacity && iWriteBytes < 0) {
                    this.keepAlive = false;
                    RXLogging.e(WebRtcAudioTrack.TAG, "AudioTrack.write played invalid number of bytes: " + iWriteBytes);
                    WebRtcAudioTrack.this.reportWebRtcAudioTrackError("AudioTrack.write failed: " + iWriteBytes);
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
            }
            if (WebRtcAudioTrack.this.audioTrack != null) {
                RXLogging.i(WebRtcAudioTrack.TAG, "Calling AudioTrack.stop...");
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                    RXLogging.i(WebRtcAudioTrack.TAG, "AudioTrack.stop is done.");
                } catch (Exception e11) {
                    RXLogging.e(WebRtcAudioTrack.TAG, "AudioTrack.stop failed: " + e11.getMessage());
                }
            }
        }

        public void stopThread() {
            synchronized (this) {
                RXLogging.i(WebRtcAudioTrack.TAG, "stopThread");
                this.keepAlive = false;
            }
        }
    }

    public interface ErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    @Deprecated
    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(String str);
    }

    static {
        int defaultUsageAttribute = getDefaultUsageAttribute();
        DEFAULT_USAGE = defaultUsageAttribute;
        usageAttribute = defaultUsageAttribute;
    }

    WebRtcAudioTrack(long j10) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.apiResult = "";
        threadChecker.checkIsOnValidThread();
        RXLogging.i(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioTrack = j10;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
    }

    private static void assertTrue(boolean z10) {
        if (!z10) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i10) {
        return i10 == 1 ? 4 : 12;
    }

    @TargetApi(21)
    private static AudioTrack createAudioTrackOnLollipopOrHigher(int i10, int i11, int i12) {
        RXLogging.i(TAG, "createAudioTrackOnLollipopOrHigher");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(sForbidVoip ? 3 : 0);
        RXLogging.i(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i10 != nativeOutputSampleRate) {
            RXLogging.w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
        if (sForbidVoip) {
            usageAttribute = 1;
        } else {
            usageAttribute = DEFAULT_USAGE;
        }
        if (usageAttribute != DEFAULT_USAGE) {
            RXLogging.w(TAG, "A non default usage attribute is used: " + usageAttribute);
        }
        return new AudioTrack(new AudioAttributes.Builder().setUsage(usageAttribute).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i10).setChannelMask(i11).build(), i12, 1, 0);
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int i10, int i11, int i12) {
        return sForbidVoip ? new AudioTrack(3, i10, i11, 2, i12, 1) : new AudioTrack(0, i10, i11, 2, i12, 1);
    }

    private String getApiResult() {
        this.threadChecker.checkIsOnValidThread();
        return this.apiResult;
    }

    private int getAudioSessionId() {
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null) {
            return -1;
        }
        return audioTrack.getAudioSessionId();
    }

    private static int getDefaultUsageAttribute() {
        return 2;
    }

    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        RXLogging.i(TAG, "getStreamMaxVolume");
        AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            return -1;
        }
        return audioManager.getStreamMaxVolume(0);
    }

    private int getStreamType() {
        this.threadChecker.checkIsOnValidThread();
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null) {
            return -1;
        }
        return audioTrack.getStreamType();
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        RXLogging.i(TAG, "getStreamVolume");
        AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            return -1;
        }
        return audioManager.getStreamVolume(0);
    }

    private boolean initPlayout(int i10, int i11, boolean z10) {
        this.apiResult = "InitPlayout(sampleRate=" + i10 + ", channels=" + i11 + ", forbidVoip=" + z10 + "):";
        sForbidVoip = z10;
        try {
            this.threadChecker.checkIsOnValidThread();
            RXLogging.i(TAG, "initPlayout(sampleRate=" + i10 + ", channels=" + i11 + ")");
            this.byteBuffer = ByteBuffer.allocateDirect(i11 * 2 * (i10 / 100));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("byteBuffer.capacity: ");
            sb2.append(this.byteBuffer.capacity());
            RXLogging.i(TAG, sb2.toString());
            this.emptyBytes = new byte[this.byteBuffer.capacity()];
            nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
            int iChannelCountToConfiguration = channelCountToConfiguration(i11);
            int minBufferSize = AudioTrack.getMinBufferSize(i10, iChannelCountToConfiguration, 2);
            RXLogging.i(TAG, "AudioTrack.getMinBufferSize: " + minBufferSize);
            if (minBufferSize < this.byteBuffer.capacity()) {
                reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
                this.apiResult += "AudioTrack.getMinBufferSize returns an invalid value.";
                return false;
            }
            if (this.audioTrack != null) {
                reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
                this.apiResult += "Conflict with existing AudioTrack.";
                return false;
            }
            try {
                this.apiResult += "minBufferSizeInBytes: " + minBufferSize;
                AudioTrack audioTrackCreateAudioTrackOnLollipopOrHigher = createAudioTrackOnLollipopOrHigher(i10, iChannelCountToConfiguration, minBufferSize);
                this.audioTrack = audioTrackCreateAudioTrackOnLollipopOrHigher;
                if (audioTrackCreateAudioTrackOnLollipopOrHigher != null && audioTrackCreateAudioTrackOnLollipopOrHigher.getState() == 1) {
                    logMainParameters();
                    logMainParametersExtended();
                    return true;
                }
                reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                releaseAudioResources();
                this.apiResult += "Initialization of audio track failed.";
                return false;
            } catch (IllegalArgumentException e10) {
                reportWebRtcAudioTrackInitError(ExceptionUtils.stackTrace(e10) + e10.getMessage());
                releaseAudioResources();
                return false;
            }
        } catch (Exception e11) {
            RXLogging.w(TAG, "initPlayout exception", e11);
            reportWebRtcAudioTrackInitError(ExceptionUtils.stackTrace(e11));
            this.apiResult += "initPlayout exception";
            return false;
        }
    }

    private boolean isVolumeFixed() {
        return this.audioManager.isVolumeFixed();
    }

    private void logBufferCapacityInFrames() {
        if (Build.VERSION.SDK_INT >= 24) {
            RXLogging.i(TAG, "AudioTrack: buffer capacity in frames: " + this.audioTrack.getBufferCapacityInFrames());
        }
    }

    private void logBufferSizeInFrames() {
        RXLogging.i(TAG, "AudioTrack: buffer size in frames: " + this.audioTrack.getBufferSizeInFrames());
    }

    private void logMainParameters() {
        RXLogging.i(TAG, "AudioTrack: session ID: " + this.audioTrack.getAudioSessionId() + ", channels: " + this.audioTrack.getChannelCount() + ", sample rate: " + this.audioTrack.getSampleRate() + ", max gain: " + AudioTrack.getMaxVolume());
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    private void logUnderrunCount() {
        if (Build.VERSION.SDK_INT < 24 || this.audioTrack == null) {
            return;
        }
        RXLogging.i(TAG, "underrun count: " + this.audioTrack.getUnderrunCount());
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeGetPlayoutData(int i10, long j10);

    private void releaseAudioResources() {
        RXLogging.i(TAG, "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioTrackError(String str) {
        RXLogging.e(TAG, "Run-time playback error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        RXLogging.e(TAG, "Init playout error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        RXLogging.e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public static synchronized void setAudioTrackUsageAttribute(int i10) {
        RXLogging.w(TAG, "Default usage attribute is changed from: " + DEFAULT_USAGE + " to " + i10);
        usageAttribute = i10;
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        RXLogging.i(TAG, "Set extended error callback");
        errorCallback = errorCallback2;
    }

    @Deprecated
    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        RXLogging.i(TAG, "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }

    public static void setSpeakerMute(boolean z10) {
        RXLogging.w(TAG, "setSpeakerMute(" + z10 + ")");
        speakerMute = z10;
    }

    private boolean setStreamVolume(int i10) {
        this.threadChecker.checkIsOnValidThread();
        RXLogging.i(TAG, "setStreamVolume(" + i10 + ")");
        if (this.audioManager == null) {
            return false;
        }
        if (isVolumeFixed()) {
            RXLogging.e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i10, 0);
        return true;
    }

    private boolean startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        RXLogging.i(TAG, "startPlayout");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null) {
            RXLogging.e(TAG, "null audio track object");
            return false;
        }
        if (this.audioThread != null) {
            RXLogging.e(TAG, "the previous audio thread leak");
            return false;
        }
        this.apiResult = "StartPlayout:";
        try {
            audioTrack.play();
            if (this.audioTrack.getPlayState() == 3) {
                AudioTrackThread audioTrackThread = new AudioTrackThread("BaeTrackJavaThread");
                this.audioThread = audioTrackThread;
                audioTrackThread.start();
                return true;
            }
            reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
            this.apiResult += "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState();
            releaseAudioResources();
            return false;
        } catch (IllegalStateException e10) {
            reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, "AudioTrack.play failed: " + e10.getMessage());
            releaseAudioResources();
            this.apiResult += "AudioTrack.play failed: " + e10.getMessage();
            return false;
        }
    }

    private boolean stopPlayout() {
        this.threadChecker.checkIsOnValidThread();
        RXLogging.i(TAG, "stopPlayout");
        this.apiResult = "StopPlayout:";
        logUnderrunCount();
        if (this.audioThread != null) {
            RXLogging.i(TAG, "Stopping the AudioTrackThread...");
            this.audioThread.stopThread();
            RXLogging.i(TAG, "interrupt the AudioTrackThread...");
            this.audioThread.interrupt();
            if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
                RXLogging.e(TAG, "Join of AudioTrackThread timed out.");
                WebRtcAudioUtils.logAudioState(TAG);
                this.apiResult += "Join of AudioTrackThread timed out.";
            }
            RXLogging.i(TAG, "AudioTrackThread has now been stopped.");
            this.audioThread = null;
        }
        releaseAudioResources();
        RXLogging.i(TAG, "stopPlayout release done.");
        return true;
    }
}
