package com.ss.bytertc.engine.flutter.video;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import com.lzy.okgo.model.Progress;
import com.ss.bytertc.engine.audio.IAudioEffectPlayer;
import com.ss.bytertc.engine.flutter.base.RTCType;
import com.ss.bytertc.engine.flutter.base.RTCTypeBox;
import com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioEffectPlayerPlugin extends RTCFlutterPlugin {
    private final MethodChannel.MethodCallHandler callHandler;
    private IAudioEffectPlayer mPlayer;
    private final AudioEffectPlayerEventProxy mPlayerEventProxy;

    AudioEffectPlayerPlugin(@n0 IAudioEffectPlayer iAudioEffectPlayer) {
        AudioEffectPlayerEventProxy audioEffectPlayerEventProxy = new AudioEffectPlayerEventProxy();
        this.mPlayerEventProxy = audioEffectPlayerEventProxy;
        this.callHandler = new MethodChannel.MethodCallHandler() { // from class: com.ss.bytertc.engine.flutter.video.a
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                this.f97964b.lambda$new$0(methodCall, result);
            }
        };
        this.mPlayer = iAudioEffectPlayer;
        iAudioEffectPlayer.setEventHandler(audioEffectPlayerEventProxy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(MethodCall methodCall, MethodChannel.Result result) {
        RTCTypeBox rTCTypeBox = new RTCTypeBox(methodCall.arguments, methodCall.method);
        String str = methodCall.method;
        str.hashCode();
        switch (str) {
            case "stopAll":
                result.success(Integer.valueOf(this.mPlayer.stopAll()));
                break;
            case "resumeAll":
                result.success(Integer.valueOf(this.mPlayer.resumeAll()));
                break;
            case "setPosition":
                result.success(Integer.valueOf(this.mPlayer.setPosition(rTCTypeBox.optInt("effectId"), rTCTypeBox.optInt(CommonNetImpl.POSITION))));
                break;
            case "getPosition":
                result.success(Integer.valueOf(this.mPlayer.getPosition(rTCTypeBox.optInt("effectId"))));
                break;
            case "resume":
                result.success(Integer.valueOf(this.mPlayer.resume(rTCTypeBox.optInt("effectId"))));
                break;
            case "unload":
                result.success(Integer.valueOf(this.mPlayer.unload(rTCTypeBox.optInt("effectId"))));
                break;
            case "setVolumeAll":
                result.success(Integer.valueOf(this.mPlayer.setVolumeAll(rTCTypeBox.optInt(com.max.xiaoheihe.module.voice.component.a.f94101q))));
                break;
            case "preload":
                result.success(Integer.valueOf(this.mPlayer.preload(rTCTypeBox.optInt("effectId"), rTCTypeBox.optString(Progress.E))));
                break;
            case "stop":
                result.success(Integer.valueOf(this.mPlayer.stop(rTCTypeBox.optInt("effectId"))));
                break;
            case "getDuration":
                result.success(Integer.valueOf(this.mPlayer.getDuration(rTCTypeBox.optInt("effectId"))));
                break;
            case "pause":
                result.success(Integer.valueOf(this.mPlayer.pause(rTCTypeBox.optInt("effectId"))));
                break;
            case "start":
                result.success(Integer.valueOf(this.mPlayer.start(rTCTypeBox.optInt("effectId"), rTCTypeBox.optString(Progress.E), RTCType.toAudioEffectPlayerConfig(rTCTypeBox.optBox("config")))));
                break;
            case "setVolume":
                result.success(Integer.valueOf(this.mPlayer.setVolume(rTCTypeBox.optInt("effectId"), rTCTypeBox.optInt(com.max.xiaoheihe.module.voice.component.a.f94101q))));
                break;
            case "getVolume":
                result.success(Integer.valueOf(this.mPlayer.getVolume(rTCTypeBox.optInt("effectId"))));
                break;
            case "pauseAll":
                result.success(Integer.valueOf(this.mPlayer.pauseAll()));
                break;
            case "unloadAll":
                result.success(Integer.valueOf(this.mPlayer.unloadAll()));
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    @Override // com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin, io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        super.onAttachedToEngine(flutterPluginBinding);
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.bytedance.ve_rtc_audio_effect_player");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this.callHandler);
        this.mPlayerEventProxy.registerEvent(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin, io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        super.onDetachedFromEngine(flutterPluginBinding);
        this.mPlayerEventProxy.destroy();
    }
}
