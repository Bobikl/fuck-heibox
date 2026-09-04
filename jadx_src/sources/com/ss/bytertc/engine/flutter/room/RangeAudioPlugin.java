package com.ss.bytertc.engine.flutter.room;

import androidx.annotation.RestrictTo;
import androidx.annotation.i1;
import androidx.annotation.n0;
import com.google.android.exoplayer2.source.rtsp.k0;
import com.ss.bytertc.engine.RTCRoom;
import com.ss.bytertc.engine.audio.IRangeAudio;
import com.ss.bytertc.engine.flutter.base.RTCType;
import com.ss.bytertc.engine.flutter.base.RTCTypeBox;
import com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin;
import com.taobao.accs.common.Constants;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RangeAudioPlugin extends RTCFlutterPlugin {
    private final MethodChannel.MethodCallHandler callHandler = new MethodChannel.MethodCallHandler() { // from class: com.ss.bytertc.engine.flutter.room.RangeAudioPlugin.1
        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
        @i1
        public void onMethodCall(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
            RTCTypeBox rTCTypeBox = new RTCTypeBox(methodCall.arguments, methodCall.method);
            IRangeAudio rangeAudio = RangeAudioPlugin.this.mRTCRoom.getRangeAudio();
            String str = methodCall.method;
            str.hashCode();
            switch (str) {
                case "enableRangeAudio":
                    rangeAudio.enableRangeAudio(rTCTypeBox.optBoolean("enable"));
                    result.success(null);
                    break;
                case "updateReceiveRange":
                    result.success(Integer.valueOf(rangeAudio.updateReceiveRange(RTCType.toReceiveRange(rTCTypeBox.optBox(k0.f48802q)))));
                    break;
                case "setNoAttenuationFlags":
                    rangeAudio.setNoAttenuationFlags(rTCTypeBox.getList(Constants.KEY_FLAGS));
                    result.success(null);
                    break;
                case "setAttenuationModel":
                    result.success(Integer.valueOf(rangeAudio.setAttenuationModel(RTCType.toAttenuationType(rTCTypeBox.optInt("type")), rTCTypeBox.optFloat("coefficient"))));
                    break;
                case "updatePosition":
                    result.success(Integer.valueOf(rangeAudio.updatePosition(RTCType.toBytePosition(rTCTypeBox.optBox("pos")))));
                    break;
                default:
                    result.notImplemented();
                    break;
            }
        }
    };
    private final Integer mIns;

    @n0
    private final RTCRoom mRTCRoom;

    public RangeAudioPlugin(Integer num, @n0 RTCRoom rTCRoom) {
        this.mIns = num;
        this.mRTCRoom = rTCRoom;
    }

    @Override // com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin, io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        super.onAttachedToEngine(flutterPluginBinding);
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.bytedance.ve_rtc_range_audio" + this.mIns);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this.callHandler);
    }
}
