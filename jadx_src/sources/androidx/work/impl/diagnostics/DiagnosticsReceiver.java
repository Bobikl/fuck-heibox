package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.work.WorkManager;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.n;
import androidx.work.o;

/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f28966a = n.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(@n0 Context context, @p0 Intent intent) {
        if (intent == null) {
            return;
        }
        n.e().a(f28966a, "Requesting diagnostics");
        try {
            WorkManager.q(context).j(o.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e10) {
            n.e().d(f28966a, "WorkManager is not initialized", e10);
        }
    }
}
