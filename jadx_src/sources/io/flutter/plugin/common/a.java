package io.flutter.plugin.common;

import androidx.annotation.i1;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: BinaryMessenger.java */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a {
    public static void a(BinaryMessenger binaryMessenger) {
        throw new UnsupportedOperationException("disableBufferingIncomingMessages not implemented.");
    }

    public static void b(BinaryMessenger binaryMessenger) {
        throw new UnsupportedOperationException("enableBufferingIncomingMessages not implemented.");
    }

    @i1
    public static BinaryMessenger.TaskQueue c(BinaryMessenger binaryMessenger) {
        return binaryMessenger.makeBackgroundTaskQueue(new BinaryMessenger.TaskQueueOptions());
    }

    @i1
    public static BinaryMessenger.TaskQueue d(BinaryMessenger binaryMessenger, BinaryMessenger.TaskQueueOptions taskQueueOptions) {
        throw new UnsupportedOperationException("makeBackgroundTaskQueue not implemented.");
    }

    @i1
    public static void e(BinaryMessenger binaryMessenger, @n0 String str, @p0 BinaryMessenger.BinaryMessageHandler binaryMessageHandler, @p0 BinaryMessenger.TaskQueue taskQueue) {
        if (taskQueue != null) {
            throw new UnsupportedOperationException("setMessageHandler called with nonnull taskQueue is not supported.");
        }
        binaryMessenger.setMessageHandler(str, binaryMessageHandler);
    }
}
