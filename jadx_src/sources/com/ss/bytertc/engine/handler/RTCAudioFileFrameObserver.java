package com.ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.IAudioFileFrameObserver;
import com.ss.bytertc.engine.data.AudioChannel;
import com.ss.bytertc.engine.data.AudioSampleRate;
import com.ss.bytertc.engine.utils.AudioFrameImpl;
import com.ss.bytertc.engine.utils.IAudioFrame;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class RTCAudioFileFrameObserver {
    private IAudioFileFrameObserver mAudioFileFrameObserver;

    @CalledByNative
    private static IAudioFrame createAudioFrameImpl(ByteBuffer byteBuffer, int i10, int i11, int i12) {
        byteBuffer.order(ByteOrder.nativeOrder());
        return new AudioFrameImpl(byteBuffer, i10, AudioSampleRate.fromId(i11), AudioChannel.fromId(i12));
    }

    @CalledByNative
    void onAudioFileFrame(int i10, IAudioFrame iAudioFrame) {
        IAudioFileFrameObserver iAudioFileFrameObserver = this.mAudioFileFrameObserver;
        if (iAudioFileFrameObserver != null) {
            iAudioFileFrameObserver.onAudioFileFrame(i10, iAudioFrame);
        }
    }

    public void setAudioFileFrameObserver(IAudioFileFrameObserver iAudioFileFrameObserver) {
        this.mAudioFileFrameObserver = iAudioFileFrameObserver;
    }
}
