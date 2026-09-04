package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.m;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.d;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CombineContinuationsWorker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Landroidx/work/impl/workers/CombineContinuationsWorker;", "Landroidx/work/Worker;", "Landroidx/work/m$a;", RXScreenCaptureService.KEY_WIDTH, "Landroid/content/Context;", d.R, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class CombineContinuationsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(@dl.d Context context, @dl.d WorkerParameters workerParams) {
        super(context, workerParams);
        f0.p(context, "context");
        f0.p(workerParams, "workerParams");
    }

    @Override // androidx.work.Worker
    @dl.d
    public m.a w() {
        m.a aVarF = m.a.f(g());
        f0.o(aVarF, "success(inputData)");
        return aVarF;
    }
}
