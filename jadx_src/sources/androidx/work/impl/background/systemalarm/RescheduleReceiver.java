package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.g0;
import androidx.work.n;

/* JADX INFO: loaded from: classes6.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f28841a = n.i("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        n.e().a(f28841a, "Received intent " + intent);
        try {
            g0.J(context).W(goAsync());
        } catch (IllegalStateException e10) {
            n.e().d(f28841a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
