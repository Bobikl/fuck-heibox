package com.ss.bytertc.engine.flutter.video;

import androidx.annotation.RestrictTo;
import com.ss.bytertc.engine.flutter.base.RTCMap;
import com.ss.bytertc.engine.flutter.event.EventEmitter;
import com.ss.bytertc.engine.video.ExpressionDetectResult;
import com.ss.bytertc.engine.video.FaceDetectionResult;
import com.ss.bytertc.engine.video.IFaceDetectionObserver;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class FaceDetectionEventProxy implements IFaceDetectionObserver {
    private final EventEmitter emitter = new EventEmitter();

    public void destroy() {
        this.emitter.destroy();
    }

    @Override // com.ss.bytertc.engine.video.IFaceDetectionObserver
    public void onExpressionDetectResult(ExpressionDetectResult expressionDetectResult) {
    }

    @Override // com.ss.bytertc.engine.video.IFaceDetectionObserver
    public void onFaceDetectResult(FaceDetectionResult faceDetectionResult) {
        HashMap map = new HashMap();
        map.put("detectResult", Integer.valueOf(faceDetectionResult.detectResult));
        map.put(com.max.mediaselector.lib.config.b.f75075c, Integer.valueOf(faceDetectionResult.imageWidth));
        map.put(com.max.mediaselector.lib.config.b.f75076d, Integer.valueOf(faceDetectionResult.imageHeight));
        map.put("faces", RTCMap.from(faceDetectionResult.faces));
        map.put("frameTimestampUs", Long.valueOf(faceDetectionResult.frameTimestampUs));
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("result", map);
        this.emitter.emit("onFaceDetectResult", map2);
    }

    public void registerEvent(BinaryMessenger binaryMessenger, String str) {
        this.emitter.registerEvent(binaryMessenger, str);
    }
}
