package com.ss.bytertc.engine.flutter.video;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import com.ss.bytertc.engine.audio.ISingScoringManager;
import com.ss.bytertc.engine.data.StandardPitchInfo;
import com.ss.bytertc.engine.flutter.base.RTCMap;
import com.ss.bytertc.engine.flutter.base.RTCType;
import com.ss.bytertc.engine.flutter.base.RTCTypeBox;
import com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class SingScoringPlugin extends RTCFlutterPlugin {
    private ISingScoringManager mSingScoringManager;
    private final SingScoringEventProxy mSingScoringEventProxy = new SingScoringEventProxy();
    private final MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: com.ss.bytertc.engine.flutter.video.d
        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
        public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
            this.f97967b.lambda$new$0(methodCall, result);
        }
    };

    SingScoringPlugin(@n0 ISingScoringManager iSingScoringManager) {
        this.mSingScoringManager = iSingScoringManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(MethodCall methodCall, MethodChannel.Result result) {
        RTCTypeBox rTCTypeBox = new RTCTypeBox(methodCall.arguments);
        String str = methodCall.method;
        str.hashCode();
        switch (str) {
            case "getAverageScore":
                result.success(Integer.valueOf(this.mSingScoringManager.getAverageScore()));
                break;
            case "getTotalScore":
                result.success(Integer.valueOf(this.mSingScoringManager.getTotalScore()));
                break;
            case "getLastSentenceScore":
                result.success(Integer.valueOf(this.mSingScoringManager.getLastSentenceScore()));
                break;
            case "initSingScoring":
                String strOptString = rTCTypeBox.optString("singScoringAppKey");
                String strOptString2 = rTCTypeBox.optString("singScoringToken");
                result.success(Integer.valueOf(rTCTypeBox.optBoolean("handler") ? this.mSingScoringManager.initSingScoring(strOptString, strOptString2, this.mSingScoringEventProxy) : this.mSingScoringManager.initSingScoring(strOptString, strOptString2, null)));
                break;
            case "startSingScoring":
                result.success(Integer.valueOf(this.mSingScoringManager.startSingScoring(rTCTypeBox.optInt(CommonNetImpl.POSITION), rTCTypeBox.optInt("scoringInfoInterval"))));
                break;
            case "setSingScoringConfig":
                result.success(Integer.valueOf(this.mSingScoringManager.setSingScoringConfig(RTCType.toSingScoringConfig(rTCTypeBox.optBox("config")))));
                break;
            case "getStandardPitchInfo":
                List<StandardPitchInfo> standardPitchInfo = this.mSingScoringManager.getStandardPitchInfo(rTCTypeBox.optString("midiFilepath"));
                if (standardPitchInfo != null && !standardPitchInfo.isEmpty()) {
                    result.success(RTCMap.from(standardPitchInfo));
                    break;
                } else {
                    result.success(null);
                    break;
                }
                break;
            case "stopSingScoring":
                result.success(Integer.valueOf(this.mSingScoringManager.stopSingScoring()));
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    @Override // com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin, io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        super.onAttachedToEngine(flutterPluginBinding);
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.bytedance.ve_rtc_sing_scoring_manager");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this.methodCallHandler);
        this.mSingScoringEventProxy.registerEvent(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin, io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        super.onDetachedFromEngine(flutterPluginBinding);
        this.mSingScoringEventProxy.destroy();
    }
}
