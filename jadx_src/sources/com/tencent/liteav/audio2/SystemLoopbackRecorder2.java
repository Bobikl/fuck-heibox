package com.tencent.liteav.audio2;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioPlaybackCaptureConfiguration$Builder;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;
import android.os.Process;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::audio")
public class SystemLoopbackRecorder2 {
    private static final String TAG = "SystemLoopbackRecorder2";
    private static final Object mLock = new Object();
    private static MediaProjection mMediaProjection;
    private static volatile long mNativeSystemLoopbackRecorder;

    public static class Recorder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AudioRecord f99529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AudioManager f99530b;

        public Recorder() {
            Context applicationContext = ContextUtils.getApplicationContext();
            ContextUtils.getApplicationContext();
            this.f99530b = (AudioManager) applicationContext.getSystemService("audio");
        }

        private static AudioRecord a(MediaProjection mediaProjection, int i10, int i11, int i12) {
            AudioPlaybackCaptureConfiguration$Builder audioPlaybackCaptureConfiguration$Builder = new AudioPlaybackCaptureConfiguration$Builder(mediaProjection);
            audioPlaybackCaptureConfiguration$Builder.addMatchingUsage(1);
            audioPlaybackCaptureConfiguration$Builder.addMatchingUsage(14);
            AudioPlaybackCaptureConfiguration audioPlaybackCaptureConfigurationBuild = audioPlaybackCaptureConfiguration$Builder.build();
            if (audioPlaybackCaptureConfigurationBuild == null) {
                return null;
            }
            int i13 = i11 == 1 ? 16 : 12;
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setEncoding(2).setSampleRate(i10).setChannelMask(i13).build();
            int minBufferSize = AudioRecord.getMinBufferSize(i10, i13, 2);
            AudioRecord audioRecordBuild = null;
            for (int i14 = 1; i14 <= 2 && audioRecordBuild == null; i14++) {
                int i15 = minBufferSize * i14;
                if (i15 >= i12 * 4 || i14 >= 2) {
                    try {
                        audioRecordBuild = new AudioRecord.Builder().setAudioFormat(audioFormatBuild).setBufferSizeInBytes(i15).setAudioPlaybackCaptureConfig(audioPlaybackCaptureConfigurationBuild).build();
                        if (audioRecordBuild.getState() != 1) {
                            Log.e(SystemLoopbackRecorder2.TAG, "Audio record state error", new Object[0]);
                            a(audioRecordBuild);
                            audioRecordBuild = null;
                        } else {
                            audioRecordBuild.startRecording();
                            Log.i(SystemLoopbackRecorder2.TAG, "Create audio record success", new Object[0]);
                        }
                    } catch (Throwable th2) {
                        Log.w(SystemLoopbackRecorder2.TAG, "Create record error " + th2.getMessage(), new Object[0]);
                        a(audioRecordBuild);
                    }
                }
            }
            return audioRecordBuild;
        }

        private void a(int i10) {
            try {
                AudioManager audioManager = this.f99530b;
                if (audioManager != null) {
                    audioManager.setMode(i10);
                }
            } catch (Throwable th2) {
                Log.e(SystemLoopbackRecorder2.TAG, "Set audio mode exception " + th2.getMessage(), new Object[0]);
            }
        }

        private static void a(AudioRecord audioRecord) {
            if (audioRecord == null) {
                return;
            }
            try {
                if (audioRecord.getRecordingState() == 3) {
                    audioRecord.stop();
                }
                audioRecord.release();
            } catch (Throwable th2) {
                Log.e(SystemLoopbackRecorder2.TAG, "Destroy AudioRecord failed." + th2.getMessage(), new Object[0]);
            }
        }

        public int read(ByteBuffer byteBuffer, int i10) {
            if (this.f99529a == null) {
                return -1;
            }
            byteBuffer.position(0);
            int i11 = this.f99529a.read(byteBuffer, i10);
            if (i11 > 0) {
                return i11;
            }
            Log.e(SystemLoopbackRecorder2.TAG, "Read failed ".concat(String.valueOf(i11)), new Object[0]);
            return -1;
        }

        public int startRecording(MediaProjection mediaProjection, int i10, int i11, int i12) {
            try {
                AudioManager audioManager = this.f99530b;
                if (audioManager != null) {
                    audioManager.setAllowedCapturePolicy(3);
                }
            } catch (Throwable th2) {
                Log.e(SystemLoopbackRecorder2.TAG, "ForbidCaptureAudioFromCurrentApp error " + th2.getMessage(), new Object[0]);
            }
            AudioManager audioManager2 = this.f99530b;
            int mode = audioManager2 != null ? audioManager2.getMode() : 0;
            a(0);
            this.f99529a = a(mediaProjection, i10, i11, i12);
            a(mode);
            if (this.f99529a == null) {
                return -1;
            }
            Process.setThreadPriority(-19);
            return 0;
        }

        public void stopRecording() {
            a(this.f99529a);
            this.f99529a = null;
        }
    }

    public SystemLoopbackRecorder2(long j10) {
        mNativeSystemLoopbackRecorder = j10;
    }

    private static native void nativeSetMediaProjectionSession(long j10, MediaProjection mediaProjection);

    public static void notifyMediaProjectionState(MediaProjection mediaProjection) {
        StringBuilder sb2 = new StringBuilder("Received MediaProjection state ");
        sb2.append(mediaProjection != null);
        Log.i(TAG, sb2.toString(), new Object[0]);
        synchronized (mLock) {
            mMediaProjection = mediaProjection;
            setMediaProjectionSession();
        }
    }

    public static void setMediaProjectionSession() {
        if (mMediaProjection == null) {
            Log.i(TAG, "MediaProjection is null.", new Object[0]);
        } else if (mNativeSystemLoopbackRecorder != 0) {
            nativeSetMediaProjectionSession(mNativeSystemLoopbackRecorder, mMediaProjection);
        }
    }

    public MediaProjection getMediaProjection() {
        return mMediaProjection;
    }

    public void releaseNativeSystemLoopbackRecorder() {
        mNativeSystemLoopbackRecorder = 0L;
    }
}
