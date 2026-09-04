package com.ss.bytertc.engine.flutter.room;

import androidx.annotation.RestrictTo;
import androidx.annotation.i1;
import androidx.annotation.n0;
import com.ss.bytertc.engine.RTCRoom;
import com.ss.bytertc.engine.audio.ISpatialAudio;
import com.ss.bytertc.engine.flutter.base.RTCType;
import com.ss.bytertc.engine.flutter.base.RTCTypeBox;
import com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class SpatialAudioPlugin extends RTCFlutterPlugin {
    private final MethodChannel.MethodCallHandler callHandler = new MethodChannel.MethodCallHandler() { // from class: com.ss.bytertc.engine.flutter.room.SpatialAudioPlugin.1
        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
        @i1
        public void onMethodCall(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
            RTCTypeBox rTCTypeBox = new RTCTypeBox(methodCall.arguments, methodCall.method);
            ISpatialAudio spatialAudio = SpatialAudioPlugin.this.mRTCRoom.getSpatialAudio();
            String str = methodCall.method;
            str.hashCode();
            switch (str) {
                case "updateRemotePosition":
                    result.success(Integer.valueOf(spatialAudio.updateRemotePosition(rTCTypeBox.optString("uid"), RTCType.toPositionInfo(rTCTypeBox.optBox("positionInfo")))));
                    break;
                case "updateListenerOrientation":
                    result.success(Integer.valueOf(spatialAudio.updateListenerOrientation(RTCType.toHumanOrientation(rTCTypeBox.optBox("orientation")))));
                    break;
                case "removeRemotePosition":
                    result.success(Integer.valueOf(spatialAudio.removeRemotePosition(rTCTypeBox.optString("uid"))));
                    break;
                case "enableSpatialAudio":
                    spatialAudio.enableSpatialAudio(rTCTypeBox.optBoolean("enable"));
                    result.success(null);
                    break;
                case "disableRemoteOrientation":
                    spatialAudio.disableRemoteOrientation();
                    result.success(null);
                    break;
                case "updateListenerPosition":
                    result.success(Integer.valueOf(spatialAudio.updateListenerPosition(RTCType.toBytePosition(rTCTypeBox.optBox("pos")))));
                    break;
                case "updateSelfPosition":
                    result.success(Integer.valueOf(spatialAudio.updateSelfPosition(RTCType.toPositionInfo(rTCTypeBox.optBox("positionInfo")))));
                    break;
                case "updatePosition":
                    result.success(Integer.valueOf(spatialAudio.updatePosition(RTCType.toBytePosition(rTCTypeBox.optBox("pos")))));
                    break;
                case "updateSelfOrientation":
                    result.success(Integer.valueOf(spatialAudio.updateSelfOrientation(RTCType.toHumanOrientation(rTCTypeBox.optBox("orientation")))));
                    break;
                case "removeAllRemotePosition":
                    result.success(Integer.valueOf(spatialAudio.removeAllRemotePosition()));
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

    public SpatialAudioPlugin(Integer num, @n0 RTCRoom rTCRoom) {
        this.mIns = num;
        this.mRTCRoom = rTCRoom;
    }

    @Override // com.ss.bytertc.engine.flutter.plugin.RTCFlutterPlugin, io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        super.onAttachedToEngine(flutterPluginBinding);
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.bytedance.ve_rtc_spatial_audio" + this.mIns);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this.callHandler);
    }
}
