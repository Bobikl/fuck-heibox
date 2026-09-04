package io.flutter.embedding.engine.systemchannels;

import android.annotation.TargetApi;
import android.window.BackEvent;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class BackGestureChannel {
    private static final String TAG = "BackGestureChannel";

    @n0
    public final MethodChannel channel;
    private final MethodChannel.MethodCallHandler defaultHandler;

    public BackGestureChannel(@n0 DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.BackGestureChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
                result.success(null);
            }
        };
        this.defaultHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/backgesture", StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    @w0(34)
    @TargetApi(34)
    private Map<String, Object> backEventToJsonMap(@n0 BackEvent backEvent) {
        HashMap map = new HashMap(3);
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        map.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        map.put("progress", Float.valueOf(backEvent.getProgress()));
        map.put("swipeEdge", Integer.valueOf(backEvent.getSwipeEdge()));
        return map;
    }

    @w0(34)
    @TargetApi(34)
    public void cancelBackGesture() {
        Log.v(TAG, "Sending message to cancel back gesture");
        this.channel.invokeMethod("cancelBackGesture", null);
    }

    @w0(34)
    @TargetApi(34)
    public void commitBackGesture() {
        Log.v(TAG, "Sending message to commit back gesture");
        this.channel.invokeMethod("commitBackGesture", null);
    }

    public void setMethodCallHandler(@p0 MethodChannel.MethodCallHandler methodCallHandler) {
        this.channel.setMethodCallHandler(methodCallHandler);
    }

    @w0(34)
    @TargetApi(34)
    public void startBackGesture(@n0 BackEvent backEvent) {
        Log.v(TAG, "Sending message to start back gesture");
        this.channel.invokeMethod("startBackGesture", backEventToJsonMap(backEvent));
    }

    @w0(34)
    @TargetApi(34)
    public void updateBackGestureProgress(@n0 BackEvent backEvent) {
        Log.v(TAG, "Sending message to update back gesture progress");
        this.channel.invokeMethod("updateBackGestureProgress", backEventToJsonMap(backEvent));
    }
}
