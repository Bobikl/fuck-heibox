package com.ss.bytertc.engine.flutter.plugin;

import androidx.annotation.n0;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.flutter.base.RTCType;
import com.ss.bytertc.engine.flutter.base.RTCTypeBox;
import com.ss.bytertc.engine.flutter.base.RTCVideoManager;
import com.ss.bytertc.engine.flutter.render.RTCSurfaceViewFactory;
import com.ss.bytertc.engine.flutter.video.RTCVideoPlugin;
import com.ss.bytertc.engine.flutter.video.VideoEventProxy;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ByteRTCPlugin implements FlutterPlugin {
    private static final String TAG = "ByteRTCPlugin";
    public FlutterPlugin.FlutterPluginBinding binding;
    public MethodChannel channel;
    private RTCVideoPlugin mVideoPlugin;
    private final VideoEventProxy videoEventHandler = new VideoEventProxy();
    private final MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: tg.a
        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
        public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
            this.f140721b.lambda$new$0(methodCall, result);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(MethodCall methodCall, MethodChannel.Result result) {
        RTCTypeBox rTCTypeBox = new RTCTypeBox(methodCall.arguments, methodCall.method);
        String str = methodCall.method;
        str.hashCode();
        switch (str) {
            case "setLogConfig":
                result.success(Integer.valueOf(RTCVideo.setLogConfig(RTCType.toLogConfig(rTCTypeBox.optBox("logConfig")))));
                break;
            case "getSDKVersion":
                result.success(RTCVideo.getSDKVersion());
                break;
            case "getErrorDescription":
                result.success(RTCVideo.getErrorDescription(rTCTypeBox.optInt("code")));
                break;
            case "eventHandlerSwitches":
                this.videoEventHandler.setSwitches(rTCTypeBox);
                result.success(null);
                break;
            case "destroyRTCVideo":
                RTCVideoPlugin rTCVideoPlugin = this.mVideoPlugin;
                if (rTCVideoPlugin != null) {
                    rTCVideoPlugin.onDetachedFromEngine(this.binding);
                    this.mVideoPlugin = null;
                }
                RTCVideoManager.destroy();
                result.success(null);
                break;
            case "createRTCVideo":
                if (!RTCVideoManager.hasRTCVideo()) {
                    String strOptString = rTCTypeBox.optString("appId");
                    JSONObject jSONObjectOptJSONObject = rTCTypeBox.optJSONObject("parameters");
                    try {
                        jSONObjectOptJSONObject.put("rtc.platform", 6);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                    RTCVideoManager.create(strOptString, this.videoEventHandler, jSONObjectOptJSONObject);
                    break;
                }
                RTCVideoPlugin rTCVideoPlugin2 = new RTCVideoPlugin();
                this.mVideoPlugin = rTCVideoPlugin2;
                rTCVideoPlugin2.onAttachedToEngine(this.binding);
                result.success(Boolean.valueOf(RTCVideoManager.hasRTCVideo()));
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.binding = flutterPluginBinding;
        RTCVideoManager.setAppContext(flutterPluginBinding.getApplicationContext());
        flutterPluginBinding.getPlatformViewRegistry().registerViewFactory("ByteRTCSurfaceView", new RTCSurfaceViewFactory(flutterPluginBinding.getBinaryMessenger()));
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.bytedance.ve_rtc_plugin");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this.methodCallHandler);
        this.videoEventHandler.registerEvent(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@n0 FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        RTCVideoPlugin rTCVideoPlugin = this.mVideoPlugin;
        if (rTCVideoPlugin != null) {
            rTCVideoPlugin.onDetachedFromEngine(flutterPluginBinding);
            this.mVideoPlugin = null;
        }
        RTCVideoManager.destroy();
        this.videoEventHandler.destroy();
    }
}
