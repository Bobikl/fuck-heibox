package com.ss.bytertc.engine.flutter.video;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import com.lzy.okgo.model.Progress;
import com.ss.bytertc.engine.audio.IMediaPlayer;
import com.ss.bytertc.engine.data.AudioMixingDualMonoMode;
import com.ss.bytertc.engine.data.AudioMixingType;
import com.ss.bytertc.engine.flutter.base.RTCType;
import com.ss.bytertc.engine.flutter.base.RTCTypeBox;
import com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class MediaPlayerPlugin extends RTCFlutterPlugin {
    private final MethodChannel.MethodCallHandler callHandler;
    private IMediaPlayer mPlayer;
    private final MediaPlayerEventProxy mPlayerEventProxy;
    private final int mPlayerId;

    MediaPlayerPlugin(@n0 IMediaPlayer iMediaPlayer, int i10) {
        MediaPlayerEventProxy mediaPlayerEventProxy = new MediaPlayerEventProxy();
        this.mPlayerEventProxy = mediaPlayerEventProxy;
        this.callHandler = new MethodChannel.MethodCallHandler() { // from class: com.ss.bytertc.engine.flutter.video.c
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                this.f97966b.lambda$new$0(methodCall, result);
            }
        };
        this.mPlayer = iMediaPlayer;
        this.mPlayerId = i10;
        iMediaPlayer.setEventHandler(mediaPlayerEventProxy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(MethodCall methodCall, MethodChannel.Result result) {
        RTCTypeBox rTCTypeBox = new RTCTypeBox(methodCall.arguments, methodCall.method);
        String str = methodCall.method;
        str.hashCode();
        switch (str) {
            case "setProgressInterval":
                result.success(Integer.valueOf(this.mPlayer.setProgressInterval(rTCTypeBox.optLong(ak.aT))));
                break;
            case "setPosition":
                result.success(Integer.valueOf(this.mPlayer.setPosition(rTCTypeBox.optInt(CommonNetImpl.POSITION))));
                break;
            case "getPosition":
                result.success(Integer.valueOf(this.mPlayer.getPosition()));
                break;
            case "getAudioTrackCount":
                result.success(Integer.valueOf(this.mPlayer.getAudioTrackCount()));
                break;
            case "resume":
                result.success(Integer.valueOf(this.mPlayer.resume()));
                break;
            case "getPlaybackDuration":
                result.success(Integer.valueOf(this.mPlayer.getPlaybackDuration()));
                break;
            case "open":
                result.success(Integer.valueOf(this.mPlayer.open(rTCTypeBox.optString(Progress.E), RTCType.toMediaPlayerConfig(rTCTypeBox.optBox("config")))));
                break;
            case "stop":
                result.success(Integer.valueOf(this.mPlayer.stop()));
                break;
            case "pause":
                result.success(Integer.valueOf(this.mPlayer.pause()));
                break;
            case "start":
                result.success(Integer.valueOf(this.mPlayer.start()));
                break;
            case "setLoudness":
                result.success(Integer.valueOf(this.mPlayer.setLoudness(rTCTypeBox.optFloat("loudness"))));
                break;
            case "setPlaybackSpeed":
                result.success(Integer.valueOf(this.mPlayer.setPlaybackSpeed(rTCTypeBox.optInt("speed"))));
                break;
            case "setAudioDualMonoMode":
                result.success(Integer.valueOf(this.mPlayer.setAudioDualMonoMode(AudioMixingDualMonoMode.fromId(rTCTypeBox.optInt("mode")))));
                break;
            case "setVolume":
                result.success(Integer.valueOf(this.mPlayer.setVolume(rTCTypeBox.optInt(com.max.xiaoheihe.module.voice.component.a.f94101q), AudioMixingType.fromId(rTCTypeBox.optInt("type")))));
                break;
            case "getVolume":
                result.success(Integer.valueOf(this.mPlayer.getVolume(AudioMixingType.fromId(rTCTypeBox.optInt("type")))));
                break;
            case "getTotalDuration":
                result.success(Integer.valueOf(this.mPlayer.getTotalDuration()));
                break;
            case "selectAudioTrack":
                result.success(Integer.valueOf(this.mPlayer.selectAudioTrack(rTCTypeBox.optInt(UCropPlusActivity.ARG_INDEX))));
                break;
            case "setAudioPitch":
                result.success(Integer.valueOf(this.mPlayer.setAudioPitch(rTCTypeBox.optInt("pitch"))));
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    @Override // com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin, io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        super.onAttachedToEngine(flutterPluginBinding);
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.bytedance.ve_rtc_media_player_" + this.mPlayerId);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this.callHandler);
        this.mPlayerEventProxy.registerEvent(flutterPluginBinding.getBinaryMessenger(), "com.bytedance.ve_rtc_media_player_event_" + this.mPlayerId);
    }

    @Override // com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin, io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        super.onDetachedFromEngine(flutterPluginBinding);
        this.mPlayerEventProxy.destroy();
    }
}
