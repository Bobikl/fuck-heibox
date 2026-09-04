package com.tencent.liteav.audio2;

import android.media.AudioRecord;
import android.os.Process;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::audio")
public class LiteavAudioRecord3 {
    private static final String TAG = "LiteavAudioRecord";
    private AudioRecord mAudioRecord;
    private int mBufferSize = 0;

    private static String audioSourceToString(int i10) {
        switch (i10) {
            case 0:
                return "DEFAULT";
            case 1:
                return "MIC";
            case 2:
                return "VOICE_UPLINK";
            case 3:
                return "VOICE_DOWNLINK";
            case 4:
                return "VOICE_CALL";
            case 5:
                return "CAMCORDER";
            case 6:
                return "VOICE_RECOGNITION";
            case 7:
                return "VOICE_COMMUNICATION";
            case 8:
            default:
                return "INVALID";
            case 9:
                return "UNPROCESSED";
            case 10:
                return "VOICE_PERFORMANCE";
        }
    }

    private static AudioRecord createStartedAudioRecord(int i10, int i11, int i12, int i13) {
        AudioRecord audioRecord;
        try {
            audioRecord = new AudioRecord(i10, i11, i12, 2, i13);
            try {
                if (audioRecord.getState() != 1) {
                    throw new RuntimeException("AudioRecord is not initialized.");
                }
                audioRecord.startRecording();
                Log.i(TAG, "create AudioRecord success. sampleRate: %d, channelConfig: %d, bufferSize: %d, audio source: %s", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), audioSourceToString(i10));
                return audioRecord;
            } catch (Throwable unused) {
                Log.w(TAG, "create AudioRecord failed. source: %s, sampleRate: %d, channelConfig: %d, bufferSize: %d", audioSourceToString(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
                destroyAudioRecord(audioRecord);
                return null;
            }
        } catch (Throwable unused2) {
            audioRecord = null;
        }
    }

    private static void destroyAudioRecord(AudioRecord audioRecord) {
        if (audioRecord == null) {
            return;
        }
        try {
            if (audioRecord.getRecordingState() == 3) {
                audioRecord.stop();
            }
            audioRecord.release();
        } catch (Throwable th2) {
            Log.e(TAG, "stop AudioRecord failed.", th2);
        }
    }

    public int getSessionId() {
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -1;
        }
        return audioRecord.getAudioSessionId();
    }

    public int read(ByteBuffer byteBuffer, int i10) {
        if (this.mAudioRecord == null) {
            return -1;
        }
        byteBuffer.position(0);
        int i11 = this.mAudioRecord.read(byteBuffer, i10);
        if (i11 >= 0) {
            return i11;
        }
        Log.e(TAG, "read failed, %d", Integer.valueOf(i11));
        return -1;
    }

    public int startRecording(int i10, int i11, int i12, int i13) {
        int[] iArr = {i10, 1, 5, 0};
        int i14 = i12 == 1 ? 16 : 12;
        int minBufferSize = AudioRecord.getMinBufferSize(i11, i14, 2);
        if (minBufferSize <= 0) {
            Log.e(TAG, "AudioRecord.getMinBufferSize return error: ".concat(String.valueOf(minBufferSize)), new Object[0]);
            return -2;
        }
        for (int i15 = 0; i15 < 4 && this.mAudioRecord == null; i15++) {
            int i16 = iArr[i15];
            for (int i17 = 1; i17 <= 2 && this.mAudioRecord == null; i17++) {
                int i18 = minBufferSize * i17;
                this.mBufferSize = i18;
                if (i18 >= i13 * 4 || i17 >= 2) {
                    this.mAudioRecord = createStartedAudioRecord(i16, i11, i14, i18);
                }
            }
        }
        if (this.mAudioRecord == null) {
            return -1;
        }
        Process.setThreadPriority(-19);
        return 0;
    }

    public void stopRecording() {
        destroyAudioRecord(this.mAudioRecord);
        this.mAudioRecord = null;
    }
}
