package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import o3.NetworkState;

/* JADX INFO: compiled from: NetworkStateTracker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Landroidx/work/impl/constraints/trackers/k;", "Landroidx/work/impl/constraints/trackers/BroadcastReceiverConstraintTracker;", "Lo3/b;", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Lkotlin/b2;", "l", "Landroid/net/ConnectivityManager;", "g", "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/content/IntentFilter;", "k", "()Landroid/content/IntentFilter;", "getIntentFilter$annotations", "()V", "intentFilter", "m", "()Lo3/b;", "initialState", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/work/impl/utils/taskexecutor/c;", "taskExecutor", "<init>", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/c;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class k extends BroadcastReceiverConstraintTracker<NetworkState> {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ConnectivityManager connectivityManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@dl.d Context context, @dl.d androidx.work.impl.utils.taskexecutor.c taskExecutor) {
        super(context, taskExecutor);
        f0.p(context, "context");
        f0.p(taskExecutor, "taskExecutor");
        Object systemService = getAppContext().getSystemService("connectivity");
        f0.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService;
    }

    public static /* synthetic */ void n() {
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    @dl.d
    public IntentFilter k() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public void l(@dl.d Intent intent) {
        f0.p(intent, "intent");
        if (f0.g(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            androidx.work.n.e().a(j.f28941a, "Network broadcast received");
            h(j.c(this.connectivityManager));
        }
    }

    @Override // androidx.work.impl.constraints.trackers.g
    @dl.d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public NetworkState e() {
        return j.c(this.connectivityManager);
    }
}
