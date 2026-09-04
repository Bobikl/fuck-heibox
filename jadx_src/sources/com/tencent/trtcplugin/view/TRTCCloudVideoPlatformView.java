package com.tencent.trtcplugin.view;

import android.content.Context;
import android.view.TextureView;
import android.view.View;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtcplugin.TRTCCloudPlugin;
import com.tencent.trtcplugin.TRTCCloudWrapper;
import com.tencent.trtcplugin.util.CommonUtil;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import io.flutter.plugin.platform.f;

/* JADX INFO: loaded from: classes4.dex */
public class TRTCCloudVideoPlatformView extends PlatformViewFactory implements PlatformView, MethodChannel.MethodCallHandler {
    public static final String SIGN = "trtcCloudChannelView";
    private MethodChannel mChannel;
    private BinaryMessenger mMessenger;
    private TXCloudVideoView mRemoteView;
    private TRTCCloud mTRTCCloud;

    public TRTCCloudVideoPlatformView(Context context, BinaryMessenger binaryMessenger) {
        super(StandardMessageCodec.INSTANCE);
        this.mMessenger = binaryMessenger;
        TXCloudVideoView tXCloudVideoView = new TXCloudVideoView(context);
        this.mRemoteView = tXCloudVideoView;
        tXCloudVideoView.addVideoView(new TextureView(context));
    }

    private void startLocalPreview(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.startLocalPreview(((Boolean) CommonUtil.getParam(methodCall, result, "frontCamera")).booleanValue(), this.mRemoteView);
        result.success(null);
    }

    private void startRemoteView(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.startRemoteView((String) CommonUtil.getParam(methodCall, result, "userId"), ((Integer) CommonUtil.getParam(methodCall, result, "streamType")).intValue(), this.mRemoteView);
        result.success(null);
    }

    private void updateLocalView(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.updateLocalView(this.mRemoteView);
        result.success(null);
    }

    private void updateRemoteView(MethodCall methodCall, MethodChannel.Result result) {
        this.mTRTCCloud.updateRemoteView((String) CommonUtil.getParam(methodCall, result, "userId"), ((Integer) CommonUtil.getParam(methodCall, result, "streamType")).intValue(), this.mRemoteView);
        result.success(null);
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public PlatformView create(Context context, int i10, Object obj) {
        TRTCCloudVideoPlatformView tRTCCloudVideoPlatformView = new TRTCCloudVideoPlatformView(context, this.mMessenger);
        TXCLog.i(TRTCCloudPlugin.TAG, "create a new TRTCCloudVideoPlatformView, viewId = " + i10);
        MethodChannel methodChannel = new MethodChannel(this.mMessenger, "trtcCloudChannelView_" + i10);
        this.mChannel = methodChannel;
        methodChannel.setMethodCallHandler(tRTCCloudVideoPlatformView);
        return tRTCCloudVideoPlatformView;
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public View getView() {
        return this.mRemoteView;
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public /* synthetic */ void onFlutterViewAttached(View view) {
        f.a(this, view);
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public /* synthetic */ void onFlutterViewDetached() {
        f.b(this);
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public /* synthetic */ void onInputConnectionLocked() {
        f.c(this);
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public /* synthetic */ void onInputConnectionUnlocked() {
        f.d(this);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) CommonUtil.getParam(methodCall, result, "channelName");
        TXCLog.i(TRTCCloudPlugin.TAG, "TRTCCloudVideoPlatformView|channel=" + str + "|method=" + methodCall.method + "|arguments=" + methodCall.arguments);
        this.mTRTCCloud = TRTCCloudWrapper.mTRTCManagerMap.get(str).getTRTCCloud();
        String str2 = methodCall.method;
        str2.hashCode();
        switch (str2) {
            case "startRemoteView":
                startRemoteView(methodCall, result);
                break;
            case "startLocalPreview":
                startLocalPreview(methodCall, result);
                break;
            case "updateRemoteView":
                updateRemoteView(methodCall, result);
                break;
            case "updateLocalView":
                updateLocalView(methodCall, result);
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
