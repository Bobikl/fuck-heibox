package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.work.impl.g0;
import androidx.work.impl.utils.q;
import androidx.work.n;

/* JADX INFO: loaded from: classes6.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f28831a = n.i("ConstrntProxyUpdtRecvr");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f28832b = "androidx.work.impl.background.systemalarm.UpdateProxies";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f28833c = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f28834d = "KEY_BATTERY_CHARGING_PROXY_ENABLED";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f28835e = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f28836f = "KEY_NETWORK_STATE_PROXY_ENABLED";

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Intent f28837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f28838c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f28839d;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f28837b = intent;
            this.f28838c = context;
            this.f28839d = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f28837b.getBooleanExtra(ConstraintProxyUpdateReceiver.f28833c, false);
                boolean booleanExtra2 = this.f28837b.getBooleanExtra(ConstraintProxyUpdateReceiver.f28834d, false);
                boolean booleanExtra3 = this.f28837b.getBooleanExtra(ConstraintProxyUpdateReceiver.f28835e, false);
                boolean booleanExtra4 = this.f28837b.getBooleanExtra(ConstraintProxyUpdateReceiver.f28836f, false);
                n.e().a(ConstraintProxyUpdateReceiver.f28831a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                q.c(this.f28838c, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                q.c(this.f28838c, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                q.c(this.f28838c, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                q.c(this.f28838c, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f28839d.finish();
            }
        }
    }

    @n0
    public static Intent a(@n0 Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intent intent = new Intent(f28832b);
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra(f28833c, z10).putExtra(f28834d, z11).putExtra(f28835e, z12).putExtra(f28836f, z13);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@n0 Context context, @p0 Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (f28832b.equals(action)) {
            g0.J(context).R().a(new a(intent, context, goAsync()));
            return;
        }
        n.e().a(f28831a, "Ignoring unknown action " + action);
    }
}
