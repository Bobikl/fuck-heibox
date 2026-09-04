package com.tencent.liteav.audio2;

import android.media.AudioTrack;
import android.os.Process;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::audio")
public class LiteavAudioTrack2 {
    private static final String TAG = "LiteavAudioTrack2";
    private AudioTrack mAudioTrack;
    private byte[] mPlayBuffer;
    private int mBufferSize = 0;
    private int mSystemOSVersion = 0;

    private static AudioTrack createStartedAudioTrack(int i10, int i11, int i12, int i13) {
        AudioTrack audioTrack;
        try {
            audioTrack = new AudioTrack(i13, i10, i11, 2, i12, 1);
            try {
                if (audioTrack.getState() != 1) {
                    throw new RuntimeException("AudioTrack is not initialized.");
                }
                audioTrack.play();
                Log.i(TAG, "create AudioTrack success. sampleRate: %d, channelConfig: %d, bufferSize: %d, streamType: %s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), streamTypeToString(i13));
                return audioTrack;
            } catch (Throwable unused) {
                Log.w(TAG, "create AudioTrack failed. sampleRate: %d, channelConfig: %d, bufferSize: %d, streamType: %s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), streamTypeToString(i13));
                destroyAudioTrack(audioTrack);
                return null;
            }
        } catch (Throwable unused2) {
            audioTrack = null;
        }
    }

    private static void destroyAudioTrack(AudioTrack audioTrack) {
        if (audioTrack == null) {
            return;
        }
        try {
            if (audioTrack.getPlayState() == 3) {
                audioTrack.stop();
                audioTrack.flush();
            }
            audioTrack.release();
        } catch (Throwable th2) {
            Log.e(TAG, "stop AudioTrack failed.", th2);
        }
    }

    private static String streamTypeToString(int i10) {
        if (i10 == 0) {
            return "STREAM_VOICE_CALL";
        }
        if (i10 == 1) {
            return "STREAM_SYSTEM";
        }
        if (i10 == 2) {
            return "STREAM_RING";
        }
        if (i10 == 3) {
            return "STREAM_MUSIC";
        }
        if (i10 != 4) {
            return i10 != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION";
        }
        return "STREAM_ALARM";
    }

    public int getBufferSize() {
        return this.mBufferSize;
    }

    public int startPlayout(int i10, int i11, int i12, int i13) {
        int[] iArr = {i10, 0, 3, 1};
        int i14 = i12 == 1 ? 4 : 12;
        int minBufferSize = AudioTrack.getMinBufferSize(i11, i14, 2);
        if (minBufferSize <= 0) {
            Log.e(TAG, "AudioTrack.getMinBufferSize return error: ".concat(String.valueOf(minBufferSize)), new Object[0]);
            return -2;
        }
        for (int i15 = 0; i15 < 4 && this.mAudioTrack == null; i15++) {
            int i16 = iArr[i15];
            for (int i17 = 1; i17 <= 2 && this.mAudioTrack == null; i17++) {
                int i18 = minBufferSize * i17;
                this.mBufferSize = i18;
                if (i18 >= i13 * 4 || i17 >= 2) {
                    this.mAudioTrack = createStartedAudioTrack(i11, i14, i18, i16);
                }
            }
        }
        if (this.mAudioTrack == null) {
            return -1;
        }
        this.mSystemOSVersion = LiteavSystemInfo.getSystemOSVersionInt();
        Process.setThreadPriority(-19);
        return 0;
    }

    public void stopPlayout() {
        destroyAudioTrack(this.mAudioTrack);
        this.mAudioTrack = null;
    }

    public int write(ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        int iWrite;
        if (this.mAudioTrack == null) {
            return -1;
        }
        byteBuffer.position(i10);
        if (this.mSystemOSVersion >= 21) {
            iWrite = this.mAudioTrack.write(byteBuffer, i11, z10 ? 1 : 0);
        } else {
            byte[] bArr = this.mPlayBuffer;
            if (bArr == null || bArr.length < i11) {
                this.mPlayBuffer = new byte[i11];
            }
            byteBuffer.get(this.mPlayBuffer, 0, i11);
            iWrite = this.mAudioTrack.write(this.mPlayBuffer, 0, i11);
        }
        if (iWrite >= 0) {
            return iWrite;
        }
        Log.e(TAG, "write audio data to AudioTrack failed. ".concat(String.valueOf(iWrite)), new Object[0]);
        return -1;
    }
}
