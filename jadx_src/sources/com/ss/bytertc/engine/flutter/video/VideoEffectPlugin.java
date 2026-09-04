package com.ss.bytertc.engine.flutter.video;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import com.ss.bytertc.engine.flutter.base.RTCType;
import com.ss.bytertc.engine.flutter.base.RTCTypeBox;
import com.ss.bytertc.engine.flutter.base.RTCVideoManager;
import com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin;
import com.ss.bytertc.engine.video.IVideoEffect;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class VideoEffectPlugin extends RTCFlutterPlugin {
    private final FaceDetectionEventProxy faceDetectionHandler = new FaceDetectionEventProxy();
    private final MethodChannel.MethodCallHandler callHandler = new MethodChannel.MethodCallHandler() { // from class: com.ss.bytertc.engine.flutter.video.e
        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
        public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
            this.f97968b.lambda$new$0(methodCall, result);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(MethodCall methodCall, MethodChannel.Result result) {
        RTCTypeBox rTCTypeBox = new RTCTypeBox(methodCall.arguments);
        IVideoEffect videoEffectInterface = RTCVideoManager.getRTCVideo().getVideoEffectInterface();
        String str = methodCall.method;
        str.hashCode();
        switch (str) {
            case "setColorFilter":
                result.success(Integer.valueOf(videoEffectInterface.setColorFilter(rTCTypeBox.optString("resFile"))));
                break;
            case "enableFaceDetection":
                result.success(Integer.valueOf(videoEffectInterface.enableFaceDetection(this.faceDetectionHandler, rTCTypeBox.optInt(ak.aT), rTCTypeBox.optString("modelPath"))));
                break;
            case "setColorFilterIntensity":
                result.success(Integer.valueOf(videoEffectInterface.setColorFilterIntensity(rTCTypeBox.optFloat("intensity"))));
                break;
            case "enableVirtualBackground":
                result.success(Integer.valueOf(videoEffectInterface.enableVirtualBackground(rTCTypeBox.optString("modelPath"), RTCType.toVirtualBackgroundSource(rTCTypeBox.optBox("source")))));
                break;
            case "setEffectNodes":
                result.success(Integer.valueOf(videoEffectInterface.setEffectNodes(rTCTypeBox.getList("effectNodes"))));
                break;
            case "disableVideoEffect":
                result.success(Integer.valueOf(videoEffectInterface.disableVideoEffect()));
                break;
            case "disableVirtualBackground":
                result.success(Integer.valueOf(videoEffectInterface.disableVirtualBackground()));
                break;
            case "updateEffectNode":
                result.success(Integer.valueOf(videoEffectInterface.updateEffectNode(rTCTypeBox.optString("effectNode"), rTCTypeBox.optString("key"), rTCTypeBox.optFloat("value"))));
                break;
            case "disableFaceDetection":
                result.success(Integer.valueOf(videoEffectInterface.disableFaceDetection()));
                break;
            case "initCVResource":
                result.success(Integer.valueOf(videoEffectInterface.initCVResource(rTCTypeBox.optString("licenseFile"), rTCTypeBox.optString("modelPath"))));
                break;
            case "enableVideoEffect":
                result.success(Integer.valueOf(videoEffectInterface.enableVideoEffect()));
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    @Override // com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin, io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        super.onAttachedToEngine(flutterPluginBinding);
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.bytedance.ve_rtc_video_effect");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this.callHandler);
        this.faceDetectionHandler.registerEvent(flutterPluginBinding.getBinaryMessenger(), "com.bytedance.ve_rtc_video_effect_face_detection");
    }

    @Override // com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin, io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        super.onDetachedFromEngine(flutterPluginBinding);
        this.faceDetectionHandler.destroy();
    }
}
