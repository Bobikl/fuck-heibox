package io.flutter.embedding.engine.plugins.broadcastreceiver;

import android.content.BroadcastReceiver;
import androidx.annotation.n0;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes4.dex */
public interface BroadcastReceiverControlSurface {
    void attachToBroadcastReceiver(@n0 BroadcastReceiver broadcastReceiver, @n0 Lifecycle lifecycle);

    void detachFromBroadcastReceiver();
}
