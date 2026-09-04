package com.ss.bytertc.engine.flutter.video;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import com.ss.bytertc.engine.IMediaPlayerEventHandler;
import com.ss.bytertc.engine.data.PlayerError;
import com.ss.bytertc.engine.data.PlayerState;
import com.ss.bytertc.engine.flutter.event.EventEmitter;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class MediaPlayerEventProxy implements IMediaPlayerEventHandler {
    private final EventEmitter emitter = new EventEmitter();

    public void destroy() {
        this.emitter.destroy();
    }

    @Override // com.ss.bytertc.engine.IMediaPlayerEventHandler
    public void onMediaPlayerPlayingProgress(int i10, long j10) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("playerId", Integer.valueOf(i10));
        map.put("progress", Long.valueOf(j10));
        this.emitter.emit("onMediaPlayerPlayingProgress", map);
    }

    @Override // com.ss.bytertc.engine.IMediaPlayerEventHandler
    public void onMediaPlayerStateChanged(int i10, PlayerState playerState, PlayerError playerError) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("playerId", Integer.valueOf(i10));
        map.put("state", Integer.valueOf(playerState.value()));
        map.put("error", Integer.valueOf(playerError.value()));
        this.emitter.emit("onMediaPlayerStateChanged", map);
    }

    public void registerEvent(@n0 BinaryMessenger binaryMessenger, @n0 String str) {
        this.emitter.registerEvent(binaryMessenger, str);
    }
}
