package com.ss.bytertc.engine.flutter.render;

import android.content.Context;
import android.util.Log;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import com.google.android.exoplayer2.text.ttml.d;
import com.ss.bytertc.engine.VideoCanvas;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.flutter.base.RTCTypeBox;
import com.ss.bytertc.engine.flutter.base.RTCVideoManager;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.f;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RTCSurfaceView implements PlatformView, MethodChannel.MethodCallHandler {
    private static final String TAG = "RTCSurfaceView";
    public static final int VIEW_TYPE_SURFACE = 0;
    public static final int VIEW_TYPE_TEXTURE = 1;

    @n0
    private final View mRenderView;

    @n0
    private final VideoCanvas mVideoCanvas;

    public RTCSurfaceView(BinaryMessenger binaryMessenger, Context context, int i10, Object obj) {
        RTCTypeBox rTCTypeBox = new RTCTypeBox(obj, TAG);
        View viewCreateRenderView = createRenderView(context, rTCTypeBox);
        this.mRenderView = viewCreateRenderView;
        VideoCanvas videoCanvas = new VideoCanvas();
        this.mVideoCanvas = videoCanvas;
        videoCanvas.renderView = viewCreateRenderView;
        new MethodChannel(binaryMessenger, "com.bytedance.ve_rtc_surfaceView" + i10).setMethodCallHandler(this);
        int iOptInt = rTCTypeBox.optInt("canvasType", -1);
        if (iOptInt == 0) {
            setupLocalVideo(rTCTypeBox);
            return;
        }
        if (iOptInt == 1) {
            setupRemoteVideo(rTCTypeBox);
            return;
        }
        if (iOptInt == 2) {
            setupPublicStreamVideo(rTCTypeBox);
            return;
        }
        if (iOptInt == 3) {
            setupEchoTestVideo(rTCTypeBox);
            return;
        }
        Log.e(TAG, "Unknown canvasType: " + iOptInt);
    }

    @n0
    private static View createRenderView(Context context, RTCTypeBox rTCTypeBox) {
        return rTCTypeBox.optInt("viewType", 1) == 1 ? new TextureView(context) : new SurfaceView(context);
    }

    private void setupEchoTestVideo(RTCTypeBox rTCTypeBox) {
        int iOptInt = rTCTypeBox.optInt("renderMode");
        int iOptInt2 = rTCTypeBox.optInt(d.H);
        VideoCanvas videoCanvas = this.mVideoCanvas;
        videoCanvas.renderMode = iOptInt;
        videoCanvas.backgroundColor = iOptInt2;
        EchoTestViewHolder.setView(videoCanvas);
    }

    private int setupLocalVideo(RTCTypeBox rTCTypeBox) {
        StreamIndex streamIndexFromId = StreamIndex.fromId(rTCTypeBox.optInt("streamType"));
        int iOptInt = rTCTypeBox.optInt("renderMode");
        int iOptInt2 = rTCTypeBox.optInt(d.H);
        VideoCanvas videoCanvas = this.mVideoCanvas;
        videoCanvas.renderMode = iOptInt;
        videoCanvas.backgroundColor = iOptInt2;
        return RTCVideoManager.getRTCVideo().setLocalVideoCanvas(streamIndexFromId, this.mVideoCanvas);
    }

    private int setupPublicStreamVideo(RTCTypeBox rTCTypeBox) {
        String strOptString = rTCTypeBox.optString("uid");
        int iOptInt = rTCTypeBox.optInt("renderMode");
        int iOptInt2 = rTCTypeBox.optInt(d.H);
        VideoCanvas videoCanvas = this.mVideoCanvas;
        videoCanvas.renderMode = iOptInt;
        videoCanvas.backgroundColor = iOptInt2;
        return RTCVideoManager.getRTCVideo().setPublicStreamVideoCanvas(strOptString, this.mVideoCanvas);
    }

    private void setupRemoteVideo(RTCTypeBox rTCTypeBox) {
        String strOptString = rTCTypeBox.optString("roomId");
        String strOptString2 = rTCTypeBox.optString("uid");
        StreamIndex streamIndexFromId = StreamIndex.fromId(rTCTypeBox.optInt("streamType"));
        int iOptInt = rTCTypeBox.optInt("renderMode");
        int iOptInt2 = rTCTypeBox.optInt(d.H);
        VideoCanvas videoCanvas = this.mVideoCanvas;
        videoCanvas.renderMode = iOptInt;
        videoCanvas.backgroundColor = iOptInt2;
        RTCVideoManager.getRTCVideo().setRemoteVideoCanvas(new RemoteStreamKey(strOptString, strOptString2, streamIndexFromId), this.mVideoCanvas);
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        EchoTestViewHolder.setView(null);
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public View getView() {
        return this.mRenderView;
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
    public void onMethodCall(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
        RTCTypeBox rTCTypeBox = new RTCTypeBox(methodCall.arguments, methodCall.method);
        String str = methodCall.method;
        str.hashCode();
        switch (str) {
            case "setZOrderMediaOverlay":
                View view = this.mRenderView;
                if (view instanceof SurfaceView) {
                    ((SurfaceView) view).setZOrderMediaOverlay(rTCTypeBox.optBoolean("isMediaOverlay"));
                }
                result.success(null);
                break;
            case "setupPublicStreamVideo":
                result.success(Integer.valueOf(setupPublicStreamVideo(rTCTypeBox)));
                break;
            case "setupLocalVideo":
                result.success(Integer.valueOf(setupLocalVideo(rTCTypeBox)));
                break;
            case "updateLocalVideo":
                RTCVideoManager.getRTCVideo().updateLocalVideoCanvas(StreamIndex.fromId(rTCTypeBox.optInt("streamType")), rTCTypeBox.optInt("renderMode"), rTCTypeBox.optInt(d.H));
                result.success(null);
                break;
            case "setZOrderOnTop":
                View view2 = this.mRenderView;
                if (view2 instanceof SurfaceView) {
                    ((SurfaceView) view2).setZOrderOnTop(rTCTypeBox.optBoolean("onTop"));
                }
                result.success(null);
                break;
            case "setupEchoTestVideo":
                setupEchoTestVideo(rTCTypeBox);
                result.success(null);
                break;
            case "updateRemoteVideo":
                String strOptString = rTCTypeBox.optString("roomId");
                String strOptString2 = rTCTypeBox.optString("uid");
                StreamIndex streamIndexFromId = StreamIndex.fromId(rTCTypeBox.optInt("streamType"));
                RTCVideoManager.getRTCVideo().updateRemoteStreamVideoCanvas(new RemoteStreamKey(strOptString, strOptString2, streamIndexFromId), rTCTypeBox.optInt("renderMode"), rTCTypeBox.optInt(d.H));
                result.success(null);
                break;
            case "setupRemoteVideo":
                setupRemoteVideo(rTCTypeBox);
                result.success(null);
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
