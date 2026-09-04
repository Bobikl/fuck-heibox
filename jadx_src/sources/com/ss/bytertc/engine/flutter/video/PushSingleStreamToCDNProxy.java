package com.ss.bytertc.engine.flutter.video;

import androidx.annotation.RestrictTo;
import com.ss.bytertc.engine.flutter.event.EventEmitter;
import com.ss.bytertc.engine.live.ByteRTCStreamSinglePushEvent;
import com.ss.bytertc.engine.live.IPushSingleStreamToCDNObserver;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class PushSingleStreamToCDNProxy implements IPushSingleStreamToCDNObserver {
    private final EventEmitter emitter = new EventEmitter();

    public void destroy() {
        this.emitter.destroy();
    }

    @Override // com.ss.bytertc.engine.live.IPushSingleStreamToCDNObserver
    public void onStreamPushEvent(ByteRTCStreamSinglePushEvent byteRTCStreamSinglePushEvent, String str, int i10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("eventType", Integer.valueOf(byteRTCStreamSinglePushEvent.value()));
        map.put("taskId", str);
        map.put("error", Integer.valueOf(i10));
        this.emitter.emit("onStreamPushEvent", map);
    }

    public void registerEvent(BinaryMessenger binaryMessenger) {
        this.emitter.registerEvent(binaryMessenger, "com.bytedance.ve_rtc_push_single_stream_to_cdn");
    }
}
