package io.flutter.embedding.engine.dart;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.n0;
import io.flutter.util.HandlerCompat;

/* JADX INFO: loaded from: classes4.dex */
public class PlatformTaskQueue implements DartMessenger.DartMessengerTaskQueue {

    @n0
    private final Handler handler = HandlerCompat.createAsyncHandler(Looper.getMainLooper());

    @Override // io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue
    public void dispatch(@n0 Runnable runnable) {
        this.handler.post(runnable);
    }
}
