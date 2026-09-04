package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.n0;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.JSONMessageCodec;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class SystemChannel {
    private static final String TAG = "SystemChannel";

    @n0
    public final BasicMessageChannel<Object> channel;

    public SystemChannel(@n0 DartExecutor dartExecutor) {
        this.channel = new BasicMessageChannel<>(dartExecutor, "flutter/system", JSONMessageCodec.INSTANCE);
    }

    public void sendMemoryPressureWarning() {
        Log.v(TAG, "Sending memory pressure warning to Flutter.");
        HashMap map = new HashMap(1);
        map.put("type", "memoryPressure");
        this.channel.send(map);
    }
}
