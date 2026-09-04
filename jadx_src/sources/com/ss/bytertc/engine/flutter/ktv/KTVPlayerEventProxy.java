package com.ss.bytertc.engine.flutter.ktv;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import com.ss.bytertc.engine.flutter.event.EventEmitter;
import com.ss.bytertc.ktv.IKTVPlayerEventHandler;
import com.ss.bytertc.ktv.data.KTVPlayerErrorCode;
import com.ss.bytertc.ktv.data.PlayState;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class KTVPlayerEventProxy extends IKTVPlayerEventHandler {
    private final EventEmitter emitter = new EventEmitter();

    public void destroy() {
        this.emitter.destroy();
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayerEventHandler
    public void onPlayProgress(@n0 String str, long j10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("musicId", str);
        map.put("progress", Long.valueOf(j10));
        this.emitter.emit("onPlayProgress", map);
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayerEventHandler
    public void onPlayStateChanged(@n0 String str, @n0 PlayState playState, KTVPlayerErrorCode kTVPlayerErrorCode) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("musicId", str);
        map.put("playState", Integer.valueOf(playState.value()));
        map.put("error", Integer.valueOf(kTVPlayerErrorCode.value()));
        this.emitter.emit("onPlayStateChanged", map);
    }

    public void registerEvent(BinaryMessenger binaryMessenger) {
        this.emitter.registerEvent(binaryMessenger, "com.bytedance.ve_rtc_ktv_player_event");
    }
}
