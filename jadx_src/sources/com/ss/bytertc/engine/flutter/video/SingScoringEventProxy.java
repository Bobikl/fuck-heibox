package com.ss.bytertc.engine.flutter.video;

import com.ss.bytertc.engine.ISingScoringEventHandler;
import com.ss.bytertc.engine.data.SingScoringRealtimeInfo;
import com.ss.bytertc.engine.flutter.base.RTCMap;
import com.ss.bytertc.engine.flutter.event.EventEmitter;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class SingScoringEventProxy implements ISingScoringEventHandler {
    private final EventEmitter emitter = new EventEmitter();

    public void destroy() {
        this.emitter.destroy();
    }

    @Override // com.ss.bytertc.engine.ISingScoringEventHandler
    public void onCurrentScoringInfo(SingScoringRealtimeInfo singScoringRealtimeInfo) {
        HashMap<String, Object> map = new HashMap<>();
        if (singScoringRealtimeInfo != null) {
            map.put("info", RTCMap.from(singScoringRealtimeInfo));
        }
        this.emitter.emit("onCurrentScoringInfo", map);
    }

    public void registerEvent(BinaryMessenger binaryMessenger) {
        this.emitter.registerEvent(binaryMessenger, "com.bytedance.ve_rtc_sing_scoring_event_handler");
    }
}
