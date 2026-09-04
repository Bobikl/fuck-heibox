package com.ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.data.AudioChannel;
import com.ss.bytertc.engine.data.AudioSampleRate;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.utils.AudioFrameImpl;
import com.ss.bytertc.engine.utils.IAudioFrame;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class RTCAudioFrameObserver {
    @CalledByNative
    private static IAudioFrame createAudioFrameImpl(ByteBuffer byteBuffer, int i10, int i11, int i12) {
        byteBuffer.order(ByteOrder.nativeOrder());
        return new AudioFrameImpl(byteBuffer, i10, AudioSampleRate.fromId(i11), AudioChannel.fromId(i12));
    }

    @CalledByNative
    private static RemoteStreamKey createRemoteStreamKey(String str, String str2, int i10) {
        return new RemoteStreamKey(str, str2, StreamIndex.fromId(i10));
    }
}
