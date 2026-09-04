package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.Callable;
import kotlin.Metadata;

/* JADX INFO: compiled from: IdGenerator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/work/impl/utils/j;", "", "", "minInclusive", "maxInclusive", "e", ak.aF, "Landroidx/work/impl/WorkDatabase;", ak.av, "Landroidx/work/impl/WorkDatabase;", "workDatabase", "<init>", "(Landroidx/work/impl/WorkDatabase;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final WorkDatabase workDatabase;

    public j(@dl.d WorkDatabase workDatabase) {
        kotlin.jvm.internal.f0.p(workDatabase, "workDatabase");
        this.workDatabase = workDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer d(j this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        return Integer.valueOf(k.d(this$0.workDatabase, k.f29358c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer f(j this$0, int i10, int i11) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        int iD = k.d(this$0.workDatabase, k.f29357b);
        boolean z10 = false;
        if (i10 <= iD && iD <= i11) {
            z10 = true;
        }
        if (z10) {
            i10 = iD;
        } else {
            k.e(this$0.workDatabase, k.f29357b, i10 + 1);
        }
        return Integer.valueOf(i10);
    }

    public final int c() {
        Object objL = this.workDatabase.L(new Callable() { // from class: androidx.work.impl.utils.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return j.d(this.f29351b);
            }
        });
        kotlin.jvm.internal.f0.o(objL, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) objL).intValue();
    }

    public final int e(final int minInclusive, final int maxInclusive) {
        Object objL = this.workDatabase.L(new Callable() { // from class: androidx.work.impl.utils.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return j.f(this.f29352b, minInclusive, maxInclusive);
            }
        });
        kotlin.jvm.internal.f0.o(objL, "workDatabase.runInTransa…            id\n        })");
        return ((Number) objL).intValue();
    }
}
