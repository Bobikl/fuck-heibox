package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class NavigationChannel {
    private static final String TAG = "NavigationChannel";

    @n0
    public final MethodChannel channel;
    private final MethodChannel.MethodCallHandler defaultHandler;

    public NavigationChannel(@n0 DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.NavigationChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
                result.success(null);
            }
        };
        this.defaultHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/navigation", JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    public void popRoute() {
        Log.v(TAG, "Sending message to pop route.");
        this.channel.invokeMethod("popRoute", null);
    }

    public void pushRoute(@n0 String str) {
        Log.v(TAG, "Sending message to push route '" + str + "'");
        this.channel.invokeMethod("pushRoute", str);
    }

    public void pushRouteInformation(@n0 String str) {
        Log.v(TAG, "Sending message to push route information '" + str + "'");
        HashMap map = new HashMap();
        map.put("location", str);
        this.channel.invokeMethod("pushRouteInformation", map);
    }

    public void setInitialRoute(@n0 String str) {
        Log.v(TAG, "Sending message to set initial route to '" + str + "'");
        this.channel.invokeMethod("setInitialRoute", str);
    }

    public void setMethodCallHandler(@p0 MethodChannel.MethodCallHandler methodCallHandler) {
        this.channel.setMethodCallHandler(methodCallHandler);
    }
}
