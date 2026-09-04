package androidx.work.impl.utils;

import android.os.Build;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.umeng.analytics.pro.ak;
import com.vivo.push.PushClientConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: EnqueueUtils.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u001e\u0010\n\u001a\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\u000b"}, d2 = {"Landroidx/work/impl/model/u;", "workSpec", ak.av, "", "Landroidx/work/impl/t;", "schedulers", ak.aF, "", PushClientConstants.TAG_CLASS_NAME, "", "b", "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class f {
    @dl.d
    public static final androidx.work.impl.model.u a(@dl.d androidx.work.impl.model.u workSpec) throws Throwable {
        kotlin.jvm.internal.f0.p(workSpec, "workSpec");
        androidx.work.c cVar = workSpec.constraints;
        String str = workSpec.workerClassName;
        if (kotlin.jvm.internal.f0.g(str, ConstraintTrackingWorker.class.getName())) {
            return workSpec;
        }
        if (!cVar.getRequiresBatteryNotLow() && !cVar.getRequiresStorageNotLow()) {
            return workSpec;
        }
        androidx.work.e eVarA = new androidx.work.e.a().c(workSpec.input).q(q3.c.f138583b, str).a();
        kotlin.jvm.internal.f0.o(eVarA, "Builder().putAll(workSpe…ame)\n            .build()");
        String name = ConstraintTrackingWorker.class.getName();
        kotlin.jvm.internal.f0.o(name, "name");
        return workSpec.x((1048574 & 1) != 0 ? workSpec.id : null, (1048574 & 2) != 0 ? workSpec.state : null, (1048574 & 4) != 0 ? workSpec.workerClassName : name, (1048574 & 8) != 0 ? workSpec.inputMergerClassName : null, (1048574 & 16) != 0 ? workSpec.input : eVarA, (1048574 & 32) != 0 ? workSpec.output : null, (1048574 & 64) != 0 ? workSpec.initialDelay : 0L, (1048574 & 128) != 0 ? workSpec.intervalDuration : 0L, (1048574 & 256) != 0 ? workSpec.flexDuration : 0L, (1048574 & 512) != 0 ? workSpec.constraints : null, (1048574 & 1024) != 0 ? workSpec.runAttemptCount : 0, (1048574 & 2048) != 0 ? workSpec.backoffPolicy : null, (1048574 & 4096) != 0 ? workSpec.backoffDelayDuration : 0L, (1048574 & 8192) != 0 ? workSpec.lastEnqueueTime : 0L, (1048574 & 16384) != 0 ? workSpec.minimumRetentionDuration : 0L, (1048574 & 32768) != 0 ? workSpec.scheduleRequestedAt : 0L, (1048574 & 65536) != 0 ? workSpec.expedited : false, (131072 & 1048574) != 0 ? workSpec.outOfQuotaPolicy : null, (1048574 & 262144) != 0 ? workSpec.periodCount : 0, (1048574 & 524288) != 0 ? workSpec.generation : 0);
    }

    private static final boolean b(List<? extends androidx.work.impl.t> list, String str) {
        try {
            Class<?> cls = Class.forName(str);
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(((androidx.work.impl.t) it.next()).getClass())) {
                    return true;
                }
            }
            return false;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @dl.d
    public static final androidx.work.impl.model.u c(@dl.d List<? extends androidx.work.impl.t> schedulers, @dl.d androidx.work.impl.model.u workSpec) {
        kotlin.jvm.internal.f0.p(schedulers, "schedulers");
        kotlin.jvm.internal.f0.p(workSpec, "workSpec");
        return Build.VERSION.SDK_INT < 26 ? a(workSpec) : workSpec;
    }
}
