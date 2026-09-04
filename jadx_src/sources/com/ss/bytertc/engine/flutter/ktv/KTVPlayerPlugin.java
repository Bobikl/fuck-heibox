package com.ss.bytertc.engine.flutter.ktv;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import com.ss.bytertc.engine.flutter.base.RTCTypeBox;
import com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin;
import com.ss.bytertc.ktv.IKTVPlayer;
import com.ss.bytertc.ktv.data.AudioPlayType;
import com.ss.bytertc.ktv.data.AudioTrackType;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class KTVPlayerPlugin extends RTCFlutterPlugin {
    private final MethodChannel.MethodCallHandler callHandler;
    private IKTVPlayer mKTVPlayer;
    private final KTVPlayerEventProxy mPlayerEventProxy;

    KTVPlayerPlugin(@n0 IKTVPlayer iKTVPlayer) {
        KTVPlayerEventProxy kTVPlayerEventProxy = new KTVPlayerEventProxy();
        this.mPlayerEventProxy = kTVPlayerEventProxy;
        this.callHandler = new MethodChannel.MethodCallHandler() { // from class: com.ss.bytertc.engine.flutter.ktv.b
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                this.f97963b.lambda$new$0(methodCall, result);
            }
        };
        this.mKTVPlayer = iKTVPlayer;
        iKTVPlayer.setPlayerEventHandler(kTVPlayerEventProxy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(MethodCall methodCall, MethodChannel.Result result) {
        RTCTypeBox rTCTypeBox = new RTCTypeBox(methodCall.arguments, methodCall.method);
        String str = methodCall.method;
        str.hashCode();
        switch (str) {
            case "switchAudioTrackType":
                this.mKTVPlayer.switchAudioTrackType(rTCTypeBox.optString("musicId"));
                result.success(null);
                break;
            case "playMusic":
                this.mKTVPlayer.playMusic(rTCTypeBox.optString("musicId"), AudioTrackType.fromId(rTCTypeBox.optInt("trackType")), AudioPlayType.fromId(rTCTypeBox.optInt("playType")));
                result.success(null);
                break;
            case "setMusicVolume":
                this.mKTVPlayer.setMusicVolume(rTCTypeBox.optString("musicId"), rTCTypeBox.optInt(com.max.xiaoheihe.module.voice.component.a.f94101q));
                result.success(null);
                break;
            case "setMusicPitch":
                this.mKTVPlayer.setMusicPitch(rTCTypeBox.optString("musicId"), rTCTypeBox.optInt("pitch"));
                result.success(null);
                break;
            case "resumeMusic":
                this.mKTVPlayer.resumeMusic(rTCTypeBox.optString("musicId"));
                result.success(null);
                break;
            case "pauseMusic":
                this.mKTVPlayer.pauseMusic(rTCTypeBox.optString("musicId"));
                result.success(null);
                break;
            case "seekMusic":
                this.mKTVPlayer.seekMusic(rTCTypeBox.optString("musicId"), rTCTypeBox.optInt(CommonNetImpl.POSITION));
                result.success(null);
                break;
            case "stopMusic":
                this.mKTVPlayer.stopMusic(rTCTypeBox.optString("musicId"));
                result.success(null);
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    @Override // com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin, io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        super.onAttachedToEngine(flutterPluginBinding);
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.bytedance.ve_rtc_ktv_player");
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
