package io.flutter.embedding.engine.systemchannels;

import android.content.pm.PackageManager;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ProcessTextChannel {
    private static final String CHANNEL_NAME = "flutter/processtext";
    private static final String METHOD_PROCESS_TEXT_ACTION = "ProcessText.processTextAction";
    private static final String METHOD_QUERY_TEXT_ACTIONS = "ProcessText.queryTextActions";
    private static final String TAG = "ProcessTextChannel";
    public final MethodChannel channel;
    public final PackageManager packageManager;

    @n0
    public final MethodChannel.MethodCallHandler parsingMethodHandler;
    private ProcessTextMethodHandler processTextMethodHandler;

    public interface ProcessTextMethodHandler {
        void processTextAction(@n0 String str, @n0 String str2, @n0 boolean z10, @n0 MethodChannel.Result result);

        Map<String, String> queryTextActions();
    }

    public ProcessTextChannel(@n0 DartExecutor dartExecutor, @n0 PackageManager packageManager) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.ProcessTextChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(@n0 MethodCall methodCall, @n0 MethodChannel.Result result) {
                if (ProcessTextChannel.this.processTextMethodHandler == null) {
                    return;
                }
                String str = methodCall.method;
                Object obj = methodCall.arguments;
                str.hashCode();
                if (!str.equals(ProcessTextChannel.METHOD_PROCESS_TEXT_ACTION)) {
                    if (!str.equals(ProcessTextChannel.METHOD_QUERY_TEXT_ACTIONS)) {
                        result.notImplemented();
                        return;
                    }
                    try {
                        result.success(ProcessTextChannel.this.processTextMethodHandler.queryTextActions());
                        return;
                    } catch (IllegalStateException e10) {
                        result.error("error", e10.getMessage(), null);
                        return;
                    }
                }
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    ProcessTextChannel.this.processTextMethodHandler.processTextAction((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), result);
                } catch (IllegalStateException e11) {
                    result.error("error", e11.getMessage(), null);
                }
            }
        };
        this.parsingMethodHandler = methodCallHandler;
        this.packageManager = packageManager;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, CHANNEL_NAME, StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    public void setMethodHandler(@p0 ProcessTextMethodHandler processTextMethodHandler) {
        this.processTextMethodHandler = processTextMethodHandler;
    }
}
