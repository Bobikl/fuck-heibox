package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.NetworkType;
import androidx.work.impl.model.u;
import androidx.work.n;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ConstraintProxy extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f28830a = n.i("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    ConstraintProxy() {
    }

    static void a(Context context, List<u> list) {
        Iterator<u> it = list.iterator();
        boolean requiresBatteryNotLow = false;
        boolean requiresCharging = false;
        boolean requiresStorageNotLow = false;
        boolean z10 = false;
        while (it.hasNext()) {
            androidx.work.c cVar = it.next().constraints;
            requiresBatteryNotLow |= cVar.getRequiresBatteryNotLow();
            requiresCharging |= cVar.getRequiresCharging();
            requiresStorageNotLow |= cVar.getRequiresStorageNotLow();
            z10 |= cVar.getRequiredNetworkType() != NetworkType.NOT_REQUIRED;
            if (requiresBatteryNotLow && requiresCharging && requiresStorageNotLow && z10) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, requiresBatteryNotLow, requiresCharging, requiresStorageNotLow, z10));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        n.e().a(f28830a, "onReceive : " + intent);
        context.startService(b.a(context));
    }
}
