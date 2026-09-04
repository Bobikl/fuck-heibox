package com.ss.bytertc.engine.flutter.video;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import com.lzy.okgo.model.Progress;
import com.ss.bytertc.engine.audio.IAudioMixingManager;
import com.ss.bytertc.engine.data.AudioMixingDualMonoMode;
import com.ss.bytertc.engine.data.AudioMixingType;
import com.ss.bytertc.engine.flutter.base.RTCType;
import com.ss.bytertc.engine.flutter.base.RTCTypeBox;
import com.ss.bytertc.engine.flutter.base.RTCVideoManager;
import com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioMixingPlugin extends RTCFlutterPlugin {
    private final MethodChannel.MethodCallHandler callHandler = new MethodChannel.MethodCallHandler() { // from class: com.ss.bytertc.engine.flutter.video.b
        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
        public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
            this.f97965b.lambda$new$0(methodCall, result);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public /* synthetic */ void lambda$new$0(MethodCall methodCall, MethodChannel.Result result) {
        RTCTypeBox rTCTypeBox = new RTCTypeBox(methodCall.arguments);
        IAudioMixingManager audioMixingManager = RTCVideoManager.getRTCVideo().getAudioMixingManager();
        String str = methodCall.method;
        str.hashCode();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1947155185:
                if (str.equals("resumeAudioMixing")) {
                    b10 = 0;
                }
                break;
            case -1913177444:
                if (str.equals("setAudioMixingDualMonoMode")) {
                    b10 = 1;
                }
                break;
            case -1839980137:
                if (str.equals("setAllAudioMixingVolume")) {
                    b10 = 2;
                }
                break;
            case -1782899277:
                if (str.equals("preloadAudioMixing")) {
                    b10 = 3;
                }
                break;
            case -1758126170:
                if (str.equals("pauseAudioMixing")) {
                    b10 = 4;
                }
                break;
            case -1633966936:
                if (str.equals("resumeAllAudioMixing")) {
                    b10 = 5;
                }
                break;
            case -1556542531:
                if (str.equals("stopAllAudioMixing")) {
                    b10 = 6;
                }
                break;
            case -1475596029:
                if (str.equals("setAudioMixingPosition")) {
                    b10 = 7;
                }
                break;
            case -1459080565:
                if (str.equals("pushAudioMixingFrame")) {
                    b10 = 8;
                }
                break;
            case -1334176942:
                if (str.equals("setAudioMixingPlaybackSpeed")) {
                    b10 = 9;
                }
                break;
            case -1233574406:
                if (str.equals("getAudioMixingDuration")) {
                    b10 = 10;
                }
                break;
            case -1083520602:
                if (str.equals("setAudioMixingPitch")) {
                    b10 = 11;
                }
                break;
            case -972706127:
                if (str.equals("pauseAllAudioMixing")) {
                    b10 = 12;
                }
                break;
            case -960133702:
                if (str.equals("startAudioMixing")) {
                    b10 = 13;
                }
                break;
            case -947946300:
                if (str.equals("getAudioTrackCount")) {
                    b10 = 14;
                }
                break;
            case -834449611:
                if (str.equals("getAudioMixingPlaybackDuration")) {
                    b10 = 15;
                }
                break;
            case -728912916:
                if (str.equals("setAudioMixingProgressInterval")) {
                    b10 = 16;
                }
                break;
            case -242631142:
                if (str.equals("stopAudioMixing")) {
                    b10 = 17;
                }
                break;
            case -43469068:
                if (str.equals("enableAudioMixingFrame")) {
                    b10 = com.google.common.base.a.f56668u;
                }
                break;
            case 195555459:
                if (str.equals("setAudioMixingLoudness")) {
                    b10 = 19;
                }
                break;
            case 947694964:
                if (str.equals("setAudioMixingVolume")) {
                    b10 = com.google.common.base.a.f56671x;
                }
                break;
            case 1373391449:
                if (str.equals("disableAudioMixingFrame")) {
                    b10 = com.google.common.base.a.f56672y;
                }
                break;
            case 1690581660:
                if (str.equals("getAudioMixingCurrentPosition")) {
                    b10 = com.google.common.base.a.f56673z;
                }
                break;
            case 1866293553:
                if (str.equals("selectAudioTrack")) {
                    b10 = com.google.common.base.a.A;
                }
                break;
            case 1980143357:
                if (str.equals("unloadAudioMixing")) {
                    b10 = com.google.common.base.a.B;
                }
                break;
        }
        switch (b10) {
            case 0:
                audioMixingManager.resumeAudioMixing(rTCTypeBox.optInt("mixId"));
                result.success(null);
                break;
            case 1:
                audioMixingManager.setAudioMixingDualMonoMode(rTCTypeBox.optInt("mixId"), AudioMixingDualMonoMode.fromId(rTCTypeBox.optInt("mode")));
                result.success(null);
                break;
            case 2:
                audioMixingManager.setAllAudioMixingVolume(rTCTypeBox.optInt(com.max.xiaoheihe.module.voice.component.a.f94101q), AudioMixingType.fromId(rTCTypeBox.optInt("type")));
                result.success(null);
                break;
            case 3:
                audioMixingManager.preloadAudioMixing(rTCTypeBox.optInt("mixId"), rTCTypeBox.optString(Progress.E));
                result.success(null);
                break;
            case 4:
                audioMixingManager.pauseAudioMixing(rTCTypeBox.optInt("mixId"));
                result.success(null);
                break;
            case 5:
                audioMixingManager.resumeAllAudioMixing();
                result.success(null);
                break;
            case 6:
                audioMixingManager.stopAllAudioMixing();
                result.success(null);
                break;
            case 7:
                audioMixingManager.setAudioMixingPosition(rTCTypeBox.optInt("mixId"), rTCTypeBox.optInt(CommonNetImpl.POSITION));
                result.success(null);
                break;
            case 8:
                result.success(Integer.valueOf(audioMixingManager.pushAudioMixingFrame(rTCTypeBox.optInt("mixId"), RTCType.toAudioFrame(rTCTypeBox.optBox("audioFrame")))));
                break;
            case 9:
                result.success(Integer.valueOf(audioMixingManager.setAudioMixingPlaybackSpeed(rTCTypeBox.optInt("mixId"), rTCTypeBox.optInt("speed"))));
                break;
            case 10:
                result.success(Integer.valueOf(audioMixingManager.getAudioMixingDuration(rTCTypeBox.optInt("mixId"))));
                break;
            case 11:
                audioMixingManager.setAudioMixingPitch(rTCTypeBox.optInt("mixId"), rTCTypeBox.optInt("pitch"));
                result.success(null);
                break;
            case 12:
                audioMixingManager.pauseAllAudioMixing();
                result.success(null);
                break;
            case 13:
                audioMixingManager.startAudioMixing(rTCTypeBox.optInt("mixId"), rTCTypeBox.optString(Progress.E), RTCType.toAudioMixingConfig(rTCTypeBox.optBox("config")));
                result.success(null);
                break;
            case 14:
                result.success(Integer.valueOf(audioMixingManager.getAudioTrackCount(rTCTypeBox.optInt("mixId"))));
                break;
            case 15:
                result.success(Integer.valueOf(audioMixingManager.getAudioMixingPlaybackDuration(rTCTypeBox.optInt("mixId"))));
                break;
            case 16:
                audioMixingManager.setAudioMixingProgressInterval(rTCTypeBox.optInt("mixId"), rTCTypeBox.optLong(ak.aT));
                result.success(null);
                break;
            case 17:
                audioMixingManager.stopAudioMixing(rTCTypeBox.optInt("mixId"));
                result.success(null);
                break;
            case 18:
                audioMixingManager.enableAudioMixingFrame(rTCTypeBox.optInt("mixId"), AudioMixingType.fromId(rTCTypeBox.optInt("type")));
                result.success(null);
                break;
            case 19:
                audioMixingManager.setAudioMixingLoudness(rTCTypeBox.optInt("mixId"), rTCTypeBox.optFloat("loudness"));
                result.success(null);
                break;
            case 20:
                audioMixingManager.setAudioMixingVolume(rTCTypeBox.optInt("mixId"), rTCTypeBox.optInt(com.max.xiaoheihe.module.voice.component.a.f94101q), AudioMixingType.fromId(rTCTypeBox.optInt("type")));
                result.success(null);
                break;
            case 21:
                audioMixingManager.disableAudioMixingFrame(rTCTypeBox.optInt("mixId"));
                result.success(null);
                break;
            case 22:
                result.success(Integer.valueOf(audioMixingManager.getAudioMixingCurrentPosition(rTCTypeBox.optInt("mixId"))));
                break;
            case 23:
                audioMixingManager.selectAudioTrack(rTCTypeBox.optInt("mixId"), rTCTypeBox.optInt("audioTrackIndex"));
                result.success(null);
                break;
            case 24:
                audioMixingManager.unloadAudioMixing(rTCTypeBox.optInt("mixId"));
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
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.bytedance.ve_rtc_audio_mixing_manager");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this.callHandler);
    }
}
