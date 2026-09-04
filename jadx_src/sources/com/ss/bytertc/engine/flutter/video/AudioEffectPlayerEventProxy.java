package com.ss.bytertc.engine.flutter.video;

import androidx.annotation.RestrictTo;
import com.ss.bytertc.engine.IAudioEffectPlayerEventHandler;
import com.ss.bytertc.engine.data.PlayerError;
import com.ss.bytertc.engine.data.PlayerState;
import com.ss.bytertc.engine.flutter.event.EventEmitter;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioEffectPlayerEventProxy implements IAudioEffectPlayerEventHandler {
    private final EventEmitter emitter = new EventEmitter();

    public void destroy() {
        this.emitter.destroy();
    }

    @Override // com.ss.bytertc.engine.IAudioEffectPlayerEventHandler
    public void onAudioEffectPlayerStateChanged(int i10, PlayerState playerState, PlayerError playerError) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("effectId", Integer.valueOf(i10));
        map.put("state", Integer.valueOf(playerState.value()));
        map.put("error", Integer.valueOf(playerError.value()));
        this.emitter.emit("onAudioEffectPlayerStateChanged", map);
    }

    public void registerEvent(BinaryMessenger binaryMessenger) {
        this.emitter.registerEvent(binaryMessenger, "com.bytedance.ve_rtc_audio_effect_player_event");
    }
}
