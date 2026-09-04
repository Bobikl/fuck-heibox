package com.ss.bytertc.audio.device.webrtc;

import android.media.AudioRecord;
import android.os.Process;
import androidx.annotation.p0;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class WebRtcAudioRecord {
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_AUDIO_SOURCE;
    private static final int INVALID_AUDIO_SESSION_ID = -1;
    private static final int INVALID_AUDIO_SOURCE = -1;
    private static final String TAG = "WebRtcAudioRecord";

    @p0
    private static WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback;
    private static int defaultMediaModeAudioSource;

    @p0
    private static WebRtcAudioRecordErrorCallback errorCallback;
    private static volatile boolean microphoneMute;
    private String apiResult = "";
    private AudioRecord audioRecord;
    private AudioRecordThread audioThread;
    private ByteBuffer byteBuffer;
    private WebRtcAudioEffects effects;
    private byte[] emptyBytes;
    private final long nativeAudioRecord;

    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    public class AudioRecordThread extends Thread {
        private volatile boolean keepAlive;

        public AudioRecordThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int i10;
            Process.setThreadPriority(-19);
            RXLogging.i(WebRtcAudioRecord.TAG, "AudioRecordThread" + WebRtcAudioUtils.getThreadInfo());
            if (WebRtcAudioRecord.this.audioRecord == null || WebRtcAudioRecord.this.audioRecord.getRecordingState() != 3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("AudioRecord.run failed: incorrect state :");
                sb2.append(WebRtcAudioRecord.this.audioRecord == null ? "null" : Integer.valueOf(WebRtcAudioRecord.this.audioRecord.getRecordingState()));
                String string = sb2.toString();
                RXLogging.e(WebRtcAudioRecord.TAG, string);
                this.keepAlive = false;
                WebRtcAudioRecord.this.reportWebRtcAudioRecordError(string);
            }
            System.nanoTime();
            while (this.keepAlive) {
                try {
                    i10 = WebRtcAudioRecord.this.audioRecord.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                } catch (Exception e10) {
                    RXLogging.e(WebRtcAudioRecord.TAG, "audioRecord.read failed: " + e10.getMessage());
                    i10 = -1;
                    this.keepAlive = false;
                }
                if (i10 == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    }
                    synchronized (this) {
                        if (this.keepAlive) {
                            WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                            webRtcAudioRecord.nativeDataIsRecorded(i10, webRtcAudioRecord.nativeAudioRecord);
                        }
                    }
                    if (WebRtcAudioRecord.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.this.audioRecord, Arrays.copyOf(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.capacity())));
                    }
                } else if (i10 == -3 || i10 == -6) {
                    this.keepAlive = false;
                    String str = "AudioRecord.read failed: " + i10;
                    RXLogging.e(WebRtcAudioRecord.TAG, str);
                    WebRtcAudioRecord.this.reportWebRtcAudioRecordError(str);
                }
            }
            try {
                if (WebRtcAudioRecord.this.audioRecord != null) {
                    WebRtcAudioRecord.this.audioRecord.stop();
                }
            } catch (Exception e11) {
                RXLogging.e(WebRtcAudioRecord.TAG, "AudioRecord.stop failed: " + e11.getMessage());
            }
        }

        public void stopThread() {
            synchronized (this) {
                RXLogging.i(WebRtcAudioRecord.TAG, "stopThread");
                this.keepAlive = false;
            }
        }
    }

    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        private AudioSamples(AudioRecord audioRecord, byte[] bArr) {
            this.audioFormat = audioRecord.getAudioFormat();
            this.channelCount = audioRecord.getChannelCount();
            this.sampleRate = audioRecord.getSampleRate();
            this.data = bArr;
        }

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }
    }

    public interface WebRtcAudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    public interface WebRtcAudioRecordSamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    static {
        int defaultAudioSource = getDefaultAudioSource();
        DEFAULT_AUDIO_SOURCE = defaultAudioSource;
        defaultMediaModeAudioSource = defaultAudioSource;
    }

    WebRtcAudioRecord(long j10) {
        RXLogging.i(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioRecord = j10;
        if (WebRtcAudioEffects.IsAudioEffectSupported()) {
            this.effects = WebRtcAudioEffects.create();
        }
    }

    private static void assertTrue(boolean z10) {
        if (!z10) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i10) {
        return i10 == 1 ? 16 : 12;
    }

    private int cvtNativeSetAudioSource(int i10, boolean z10) {
        int i11 = defaultMediaModeAudioSource;
        if (!z10) {
            i11 = 7;
        }
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 5) {
            return 5;
        }
        if (i10 == 6) {
            return 6;
        }
        if (i10 == 7) {
            return 7;
        }
        if (i10 == 9) {
            return 9;
        }
        if (i10 != 10) {
            return i11;
        }
        return 10;
    }

    private boolean enableBuiltInAEC(boolean z10) {
        RXLogging.i(TAG, "enableBuiltInAEC(" + z10 + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setAEC(z10);
        }
        RXLogging.e(TAG, "Built-in AEC is not supported on this platform");
        return false;
    }

    private boolean enableBuiltInNS(boolean z10) {
        RXLogging.i(TAG, "enableBuiltInNS(" + z10 + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setNS(z10);
        }
        RXLogging.e(TAG, "Built-in NS is not supported on this platform");
        return false;
    }

    private String getApiResult() {
        return this.apiResult;
    }

    private int getAudioSessionId() {
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord == null) {
            return -1;
        }
        return audioRecord.getAudioSessionId();
    }

    private int getAudioSource() {
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord == null) {
            return -1;
        }
        return audioRecord.getAudioSource();
    }

    private static int getDefaultAudioSource() {
        return 0;
    }

    private int initRecording(int i10, int i11, int i12, boolean z10, int i13) {
        AudioRecord audioRecord;
        String str = "InitRecording(sampleRate=" + i10 + ", channels=" + i11 + ", frameSizeMs=" + i12 + ", forbidVoip=" + z10 + ", preferredSource=" + i13 + "):";
        this.apiResult = str;
        RXLogging.w(TAG, str);
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i14 = i11 * 2;
        int i15 = i10 / 100;
        if (i12 > 0 && i12 % 10 == 0) {
            i15 = (i12 * i10) / 1000;
        }
        int i16 = i15;
        this.byteBuffer = ByteBuffer.allocateDirect(i14 * i16);
        RXLogging.i(TAG, "byteBuffer.capacity: " + this.byteBuffer.capacity());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
        int iChannelCountToConfiguration = channelCountToConfiguration(i11);
        int minBufferSize = AudioRecord.getMinBufferSize(i10, iChannelCountToConfiguration, 2);
        if (minBufferSize == -1 || minBufferSize == -2) {
            reportWebRtcAudioRecordInitError("AudioRecord.getMinBufferSize failed: " + minBufferSize);
            this.apiResult += "AudioRecord.getMinBufferSize failed: " + minBufferSize;
            return -1;
        }
        RXLogging.i(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
        int iMax = Math.max(minBufferSize, this.byteBuffer.capacity() * 2);
        RXLogging.i(TAG, "bufferSizeInBytes: " + iMax);
        try {
            synchronized (this) {
                int iCvtNativeSetAudioSource = cvtNativeSetAudioSource(i13, z10);
                this.apiResult += ",AudioSource:" + iCvtNativeSetAudioSource + ",MinBufferSize:" + minBufferSize + ",byteBuffer.capcity:" + this.byteBuffer.capacity() + ", bufferSizeInBytes:" + iMax;
                audioRecord = this.audioRecord;
                if (audioRecord == null) {
                    audioRecord = new AudioRecord(iCvtNativeSetAudioSource, i10, iChannelCountToConfiguration, 2, iMax);
                }
                this.audioRecord = audioRecord;
            }
            if (audioRecord != null && audioRecord.getState() == 1) {
                WebRtcAudioEffects webRtcAudioEffects = this.effects;
                if (webRtcAudioEffects != null) {
                    webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId());
                }
                logMainParameters();
                logMainParametersExtended();
                return i16;
            }
            reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
            releaseAudioResources();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.apiResult);
            sb2.append("Failed to create a new AudioRecord instance state:");
            AudioRecord audioRecord2 = this.audioRecord;
            sb2.append(audioRecord2 == null ? "null" : Integer.valueOf(audioRecord2.getState()));
            this.apiResult = sb2.toString();
            return -1;
        } catch (IllegalArgumentException e10) {
            reportWebRtcAudioRecordInitError("AudioRecord ctor error: " + e10.getMessage());
            releaseAudioResources();
            this.apiResult += "AudioRecord ctor error: " + e10.getMessage();
            return -1;
        }
    }

    private void logMainParameters() {
        RXLogging.w(TAG, "AudioRecord: session ID: " + this.audioRecord.getAudioSessionId() + ", channels: " + this.audioRecord.getChannelCount() + ", sample rate: " + this.audioRecord.getSampleRate() + ", source:" + this.audioRecord.getAudioSource());
    }

    private void logMainParametersExtended() {
        RXLogging.w(TAG, "AudioRecord: buffer size in frames: " + this.audioRecord.getBufferSizeInFrames());
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDataIsRecorded(int i10, long j10);

    private void releaseAudioResources() {
        RXLogging.i(TAG, "releaseAudioResources");
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioRecordError(String str) {
        RXLogging.e(TAG, "Run-time recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        RXLogging.e(TAG, "Init recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        RXLogging.e(TAG, "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        RXLogging.i(TAG, "Set error callback");
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    public static void setMicrophoneMute(boolean z10) {
        RXLogging.w(TAG, "setMicrophoneMute(" + z10 + ")");
        microphoneMute = z10;
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
    }

    private boolean startRecording() {
        this.apiResult = "StartRecording:";
        RXLogging.i(TAG, "StartRecording:");
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord == null) {
            RXLogging.e(TAG, "null audio record object");
            return false;
        }
        if (this.audioThread != null) {
            RXLogging.e(TAG, "the previous audio thread leak");
            return false;
        }
        try {
            audioRecord.startRecording();
            if (this.audioRecord.getRecordingState() == 3) {
                AudioRecordThread audioRecordThread = new AudioRecordThread("BaeRecordJavaThread");
                this.audioThread = audioRecordThread;
                audioRecordThread.start();
                return true;
            }
            reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state :" + this.audioRecord.getRecordingState());
            this.apiResult += "AudioRecord.startRecording failed - incorrect state :" + this.audioRecord.getRecordingState();
            WebRtcAudioEffects webRtcAudioEffects = this.effects;
            if (webRtcAudioEffects != null) {
                webRtcAudioEffects.release();
            }
            releaseAudioResources();
            return false;
        } catch (IllegalStateException e10) {
            reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e10.getMessage());
            this.apiResult += "AudioRecord.startRecording failed: " + e10.getMessage();
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopRecording() {
        this.apiResult = "StopRecording:";
        RXLogging.i(TAG, "StopRecording:");
        AudioRecordThread audioRecordThread = this.audioThread;
        if (audioRecordThread != null) {
            audioRecordThread.stopThread();
            if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
                RXLogging.e(TAG, "Join of AudioRecordJavaThread timed out");
                WebRtcAudioUtils.logAudioState(TAG);
                this.apiResult += "Join of AudioRecordJavaThread timed out";
            }
            this.audioThread = null;
        }
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            webRtcAudioEffects.release();
        }
        releaseAudioResources();
        RXLogging.i(TAG, "stopRecording release done.");
        return true;
    }
}
