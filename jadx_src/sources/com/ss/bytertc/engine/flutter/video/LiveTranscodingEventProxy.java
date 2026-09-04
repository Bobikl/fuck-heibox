package com.ss.bytertc.engine.flutter.video;

import androidx.annotation.RestrictTo;
import com.bytedance.realx.video.VideoFrame;
import com.ss.bytertc.engine.flutter.event.EventEmitter;
import com.ss.bytertc.engine.live.ByteRTCStreamMixingEvent;
import com.ss.bytertc.engine.live.ByteRTCStreamMixingType;
import com.ss.bytertc.engine.live.ByteRTCTranscoderErrorCode;
import com.ss.bytertc.engine.live.ILiveTranscodingObserver;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class LiveTranscodingEventProxy implements ILiveTranscodingObserver {
    private final EventEmitter emitter = new EventEmitter();

    public void destroy() {
        this.emitter.destroy();
    }

    @Override // com.ss.bytertc.engine.live.ILiveTranscodingObserver
    public boolean isSupportClientPushStream() {
        return false;
    }

    @Override // com.ss.bytertc.engine.live.ILiveTranscodingObserver
    public void onCacheSyncVideoFrames(String str, String[] strArr, VideoFrame[] videoFrameArr, byte[][] bArr, int i10) {
    }

    @Override // com.ss.bytertc.engine.live.ILiveTranscodingObserver
    public void onMixingAudioFrame(String str, byte[] bArr, int i10, long j10) {
    }

    @Override // com.ss.bytertc.engine.live.ILiveTranscodingObserver
    public void onMixingDataFrame(String str, byte[] bArr, long j10) {
    }

    @Override // com.ss.bytertc.engine.live.ILiveTranscodingObserver
    public void onMixingVideoFrame(String str, VideoFrame videoFrame) {
    }

    @Override // com.ss.bytertc.engine.live.ILiveTranscodingObserver
    public void onStreamMixingEvent(ByteRTCStreamMixingEvent byteRTCStreamMixingEvent, String str, ByteRTCTranscoderErrorCode byteRTCTranscoderErrorCode, ByteRTCStreamMixingType byteRTCStreamMixingType) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("eventType", Integer.valueOf(byteRTCStreamMixingEvent.value()));
        map.put("taskId", str);
        map.put("error", Integer.valueOf(byteRTCTranscoderErrorCode.value()));
        map.put("mixType", Integer.valueOf(byteRTCStreamMixingType.value()));
        this.emitter.emit("onStreamMixingEvent", map);
    }

    public void registerEvent(BinaryMessenger binaryMessenger) {
        this.emitter.registerEvent(binaryMessenger, "com.bytedance.ve_rtc_live_transcoding");
    }
}
