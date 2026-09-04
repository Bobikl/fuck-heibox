package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BatteryNotLowTracker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Landroidx/work/impl/constraints/trackers/c;", "Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", "", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Lkotlin/b2;", "l", "m", "()Ljava/lang/Boolean;", "initialState", "Landroid/content/IntentFilter;", "k", "()Landroid/content/IntentFilter;", "intentFilter", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/work/impl/utils/taskexecutor/c;", "taskExecutor", "<init>", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/c;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class c extends BroadcastReceiverConstraintTracker<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@dl.d Context context, @dl.d androidx.work.impl.utils.taskexecutor.c taskExecutor) {
        super(context, taskExecutor);
        f0.p(context, "context");
        f0.p(taskExecutor, "taskExecutor");
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    @dl.d
    public IntentFilter k() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public void l(@dl.d Intent intent) {
        f0.p(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        androidx.work.n.e().a(d.f28927a, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1980154005) {
                if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    h(Boolean.TRUE);
                }
            } else if (iHashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                h(Boolean.FALSE);
            }
        }
    }

    @Override // androidx.work.impl.constraints.trackers.g
    @dl.d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Boolean e() {
        Intent intentRegisterReceiver = getAppContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            androidx.work.n.e().c(d.f28927a, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        float intExtra2 = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
        boolean z10 = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
