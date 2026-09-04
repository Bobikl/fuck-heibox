package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import o3.NetworkState;

/* JADX INFO: compiled from: Trackers.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BS\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0002\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000e\u0010\u0006R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0018"}, d2 = {"Landroidx/work/impl/constraints/trackers/n;", "", "Landroidx/work/impl/constraints/trackers/g;", "", ak.av, "Landroidx/work/impl/constraints/trackers/g;", "()Landroidx/work/impl/constraints/trackers/g;", "batteryChargingTracker", "Landroidx/work/impl/constraints/trackers/c;", "b", "Landroidx/work/impl/constraints/trackers/c;", "()Landroidx/work/impl/constraints/trackers/c;", "batteryNotLowTracker", "Lo3/b;", ak.aF, "networkStateTracker", "d", "storageNotLowTracker", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/work/impl/utils/taskexecutor/c;", "taskExecutor", "<init>", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/c;Landroidx/work/impl/constraints/trackers/g;Landroidx/work/impl/constraints/trackers/c;Landroidx/work/impl/constraints/trackers/g;Landroidx/work/impl/constraints/trackers/g;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final g<Boolean> batteryChargingTracker;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final c batteryNotLowTracker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final g<NetworkState> networkStateTracker;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final g<Boolean> storageNotLowTracker;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public n(@dl.d Context context, @dl.d androidx.work.impl.utils.taskexecutor.c taskExecutor) {
        this(context, taskExecutor, null, null, null, null, 60, null);
        f0.p(context, "context");
        f0.p(taskExecutor, "taskExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public n(@dl.d Context context, @dl.d androidx.work.impl.utils.taskexecutor.c taskExecutor, @dl.d g<Boolean> batteryChargingTracker) {
        this(context, taskExecutor, batteryChargingTracker, null, null, null, 56, null);
        f0.p(context, "context");
        f0.p(taskExecutor, "taskExecutor");
        f0.p(batteryChargingTracker, "batteryChargingTracker");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public n(@dl.d Context context, @dl.d androidx.work.impl.utils.taskexecutor.c taskExecutor, @dl.d g<Boolean> batteryChargingTracker, @dl.d c batteryNotLowTracker) {
        this(context, taskExecutor, batteryChargingTracker, batteryNotLowTracker, null, null, 48, null);
        f0.p(context, "context");
        f0.p(taskExecutor, "taskExecutor");
        f0.p(batteryChargingTracker, "batteryChargingTracker");
        f0.p(batteryNotLowTracker, "batteryNotLowTracker");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public n(@dl.d Context context, @dl.d androidx.work.impl.utils.taskexecutor.c taskExecutor, @dl.d g<Boolean> batteryChargingTracker, @dl.d c batteryNotLowTracker, @dl.d g<NetworkState> networkStateTracker) {
        this(context, taskExecutor, batteryChargingTracker, batteryNotLowTracker, networkStateTracker, null, 32, null);
        f0.p(context, "context");
        f0.p(taskExecutor, "taskExecutor");
        f0.p(batteryChargingTracker, "batteryChargingTracker");
        f0.p(batteryNotLowTracker, "batteryNotLowTracker");
        f0.p(networkStateTracker, "networkStateTracker");
    }

    @xh.i
    public n(@dl.d Context context, @dl.d androidx.work.impl.utils.taskexecutor.c taskExecutor, @dl.d g<Boolean> batteryChargingTracker, @dl.d c batteryNotLowTracker, @dl.d g<NetworkState> networkStateTracker, @dl.d g<Boolean> storageNotLowTracker) {
        f0.p(context, "context");
        f0.p(taskExecutor, "taskExecutor");
        f0.p(batteryChargingTracker, "batteryChargingTracker");
        f0.p(batteryNotLowTracker, "batteryNotLowTracker");
        f0.p(networkStateTracker, "networkStateTracker");
        f0.p(storageNotLowTracker, "storageNotLowTracker");
        this.batteryChargingTracker = batteryChargingTracker;
        this.batteryNotLowTracker = batteryNotLowTracker;
        this.networkStateTracker = networkStateTracker;
        this.storageNotLowTracker = storageNotLowTracker;
    }

    public /* synthetic */ n(Context context, androidx.work.impl.utils.taskexecutor.c cVar, g gVar, c cVar2, g gVar2, g gVar3, int i10, u uVar) {
        g aVar;
        c cVar3;
        g gVarA;
        g lVar;
        if ((i10 & 4) != 0) {
            Context applicationContext = context.getApplicationContext();
            f0.o(applicationContext, "context.applicationContext");
            aVar = new a(applicationContext, cVar);
        } else {
            aVar = gVar;
        }
        if ((i10 & 8) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            f0.o(applicationContext2, "context.applicationContext");
            cVar3 = new c(applicationContext2, cVar);
        } else {
            cVar3 = cVar2;
        }
        if ((i10 & 16) != 0) {
            Context applicationContext3 = context.getApplicationContext();
            f0.o(applicationContext3, "context.applicationContext");
            gVarA = j.a(applicationContext3, cVar);
        } else {
            gVarA = gVar2;
        }
        if ((i10 & 32) != 0) {
            Context applicationContext4 = context.getApplicationContext();
            f0.o(applicationContext4, "context.applicationContext");
            lVar = new l(applicationContext4, cVar);
        } else {
            lVar = gVar3;
        }
        this(context, cVar, aVar, cVar3, gVarA, lVar);
    }

    @dl.d
    public final g<Boolean> a() {
        return this.batteryChargingTracker;
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getBatteryNotLowTracker() {
        return this.batteryNotLowTracker;
    }

    @dl.d
    public final g<NetworkState> c() {
        return this.networkStateTracker;
    }

    @dl.d
    public final g<Boolean> d() {
        return this.storageNotLowTracker;
    }
}
