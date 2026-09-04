package io.flutter.embedding.engine.plugins.broadcastreceiver;

import androidx.annotation.n0;

/* JADX INFO: loaded from: classes4.dex */
public interface BroadcastReceiverAware {
    void onAttachedToBroadcastReceiver(@n0 BroadcastReceiverPluginBinding broadcastReceiverPluginBinding);

    void onDetachedFromBroadcastReceiver();
}
