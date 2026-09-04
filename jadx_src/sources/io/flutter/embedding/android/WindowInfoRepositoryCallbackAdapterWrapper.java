package io.flutter.embedding.android;

import android.app.Activity;
import androidx.annotation.n0;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.sidecar.v;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class WindowInfoRepositoryCallbackAdapterWrapper {

    @n0
    final WindowInfoTrackerCallbackAdapter adapter;

    public WindowInfoRepositoryCallbackAdapterWrapper(@n0 WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter) {
        this.adapter = windowInfoTrackerCallbackAdapter;
    }

    public void addWindowLayoutInfoListener(@n0 Activity activity, @n0 Executor executor, @n0 androidx.core.util.d<v> dVar) {
        this.adapter.c(activity, executor, dVar);
    }

    public void removeWindowLayoutInfoListener(@n0 androidx.core.util.d<v> dVar) {
        this.adapter.e(dVar);
    }
}
