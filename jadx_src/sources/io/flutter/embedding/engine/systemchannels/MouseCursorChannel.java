package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class MouseCursorChannel {
    private static final String TAG = "MouseCursorChannel";

    @n0
    public final MethodChannel channel;

    @p0
    private MouseCursorMethodHandler mouseCursorMethodHandler;

    @n0
    private final MethodChannel.MethodCallHandler parsingMethodCallHandler;

    public interface MouseCursorMethodHandler {
        void activateSystemCursor(@n0 String str);
    }

    public MouseCursorChannel(@n0 DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.MouseCursorChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
                if (MouseCursorChannel.this.mouseCursorMethodHandler == null) {
                    return;
                }
                String str = methodCall.method;
                Log.v(MouseCursorChannel.TAG, "Received '" + str + "' message.");
                byte b10 = -1;
                try {
                    if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                        b10 = 0;
                    }
                    if (b10 != 0) {
                        return;
                    }
                    try {
                        MouseCursorChannel.this.mouseCursorMethodHandler.activateSystemCursor((String) ((HashMap) methodCall.arguments).get("kind"));
                        result.success(Boolean.TRUE);
                    } catch (Exception e10) {
                        result.error("error", "Error when setting cursors: " + e10.getMessage(), null);
                    }
                } catch (Exception e11) {
                    result.error("error", "Unhandled error: " + e11.getMessage(), null);
                }
            }
        };
        this.parsingMethodCallHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/mousecursor", StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    public void setMethodHandler(@p0 MouseCursorMethodHandler mouseCursorMethodHandler) {
        this.mouseCursorMethodHandler = mouseCursorMethodHandler;
    }

    @j1
    public void synthesizeMethodCall(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
        this.parsingMethodCallHandler.onMethodCall(methodCall, result);
    }
}
