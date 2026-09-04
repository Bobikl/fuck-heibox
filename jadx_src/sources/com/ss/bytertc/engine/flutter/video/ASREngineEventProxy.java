package com.ss.bytertc.engine.flutter.video;

import androidx.annotation.RestrictTo;
import com.ss.bytertc.engine.flutter.event.EventEmitter;
import com.ss.bytertc.engine.handler.IRTCASREngineEventHandler;
import com.taobao.accs.common.Constants;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ASREngineEventProxy implements IRTCASREngineEventHandler {
    private final EventEmitter emitter = new EventEmitter();

    public void destroy() {
        this.emitter.destroy();
    }

    @Override // com.ss.bytertc.engine.handler.IRTCASREngineEventHandler
    public void onError(int i10, String str) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(Constants.KEY_ERROR_CODE, Integer.valueOf(i10));
        map.put("errorMessage", str);
        this.emitter.emit("onError", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCASREngineEventHandler
    public void onMessage(String str) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("message", str);
        this.emitter.emit("onMessage", map);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCASREngineEventHandler
    public void onSuccess() {
        this.emitter.emit("onSuccess", new HashMap<>());
    }

    public void registerEvent(BinaryMessenger binaryMessenger) {
        this.emitter.registerEvent(binaryMessenger, "com.bytedance.ve_rtc_asr");
    }
}
