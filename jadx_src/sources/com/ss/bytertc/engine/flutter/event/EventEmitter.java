package com.ss.bytertc.engine.flutter.event;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class EventEmitter {
    private static final String METHOD_NAME = "methodName";
    private static final String TAG = "EventEmitter";
    private EventChannel eventChannel;
    private EventChannel.EventSink eventSink;
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$emit$0(HashMap map) {
        EventChannel.EventSink eventSink = this.eventSink;
        if (eventSink != null) {
            eventSink.success(map);
        }
    }

    public void destroy() {
        this.eventChannel.setStreamHandler(null);
    }

    public void emit(@n0 String str, @n0 final HashMap<String, Object> map) {
        map.put(METHOD_NAME, str);
        this.mainThreadHandler.post(new Runnable() { // from class: com.ss.bytertc.engine.flutter.event.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f97960b.lambda$emit$0(map);
            }
        });
    }

    public void registerEvent(@n0 BinaryMessenger binaryMessenger, @n0 String str) {
        EventChannel eventChannel = new EventChannel(binaryMessenger, str);
        this.eventChannel = eventChannel;
        eventChannel.setStreamHandler(new EventChannel.StreamHandler() { // from class: com.ss.bytertc.engine.flutter.event.EventEmitter.1
            @Override // io.flutter.plugin.common.EventChannel.StreamHandler
            public void onCancel(Object obj) {
                EventEmitter.this.eventSink = null;
            }

            @Override // io.flutter.plugin.common.EventChannel.StreamHandler
            public void onListen(Object obj, EventChannel.EventSink eventSink) {
                EventEmitter.this.eventSink = eventSink;
            }
        });
    }
}
