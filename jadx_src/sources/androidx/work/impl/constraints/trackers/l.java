package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: StorageNotLowTracker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Landroidx/work/impl/constraints/trackers/l;", "Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", "", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Lkotlin/b2;", "l", "m", "()Ljava/lang/Boolean;", "initialState", "Landroid/content/IntentFilter;", "k", "()Landroid/content/IntentFilter;", "intentFilter", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/work/impl/utils/taskexecutor/c;", "taskExecutor", "<init>", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/c;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class l extends BroadcastReceiverConstraintTracker<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@dl.d Context context, @dl.d androidx.work.impl.utils.taskexecutor.c taskExecutor) {
        super(context, taskExecutor);
        f0.p(context, "context");
        f0.p(taskExecutor, "taskExecutor");
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    @dl.d
    public IntentFilter k() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public void l(@dl.d Intent intent) {
        f0.p(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        androidx.work.n.e().a(m.f28943a, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1181163412) {
                if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    h(Boolean.FALSE);
                }
            } else if (iHashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                h(Boolean.TRUE);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    @Override // androidx.work.impl.constraints.trackers.g
    @dl.d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Boolean e() {
        Intent intentRegisterReceiver = getAppContext().registerReceiver(null, k());
        boolean z10 = false;
        if (intentRegisterReceiver == null || intentRegisterReceiver.getAction() == null) {
            z10 = true;
        } else {
            String action = intentRegisterReceiver.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode == -1181163412) {
                    action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                } else if (iHashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    z10 = true;
                }
            }
        }
        return Boolean.valueOf(z10);
    }
}
