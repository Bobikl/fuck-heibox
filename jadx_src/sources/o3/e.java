package o3;

import androidx.annotation.j1;
import androidx.work.impl.constraints.trackers.n;
import androidx.work.impl.model.u;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import p3.h;

/* JADX INFO: compiled from: WorkConstraintsTracker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0010\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016B\u001b\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0019J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u000e\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0016J\u0016\u0010\u000f\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0016¨\u0006\u001a"}, d2 = {"Lo3/e;", "Lo3/d;", "Lp3/c$a;", "", "Landroidx/work/impl/model/u;", "workSpecs", "Lkotlin/b2;", ak.av, "reset", "", "workSpecId", "", "d", "", "b", ak.aF, "Lo3/c;", "callback", "", "Lp3/c;", "constraintControllers", "<init>", "(Lo3/c;[Lp3/c;)V", "Landroidx/work/impl/constraints/trackers/n;", "trackers", "(Landroidx/work/impl/constraints/trackers/n;Lo3/c;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class e implements d, p3.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final c f132175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final p3.c<?>[] f132176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Object f132177c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@dl.d n trackers, @dl.e c cVar) {
        this(cVar, (p3.c<?>[]) new p3.c[]{new p3.a(trackers.a()), new p3.b(trackers.getBatteryNotLowTracker()), new h(trackers.d()), new p3.d(trackers.c()), new p3.g(trackers.c()), new p3.f(trackers.c()), new p3.e(trackers.c())});
        f0.p(trackers, "trackers");
    }

    @j1
    public e(@dl.e c cVar, @dl.d p3.c<?>[] constraintControllers) {
        f0.p(constraintControllers, "constraintControllers");
        this.f132175a = cVar;
        this.f132176b = constraintControllers;
        this.f132177c = new Object();
    }

    @Override // o3.d
    public void a(@dl.d Iterable<u> workSpecs) {
        f0.p(workSpecs, "workSpecs");
        synchronized (this.f132177c) {
            for (p3.c<?> cVar : this.f132176b) {
                cVar.h(null);
            }
            for (p3.c<?> cVar2 : this.f132176b) {
                cVar2.f(workSpecs);
            }
            for (p3.c<?> cVar3 : this.f132176b) {
                cVar3.h(this);
            }
            b2 b2Var = b2.f124493a;
        }
    }

    @Override // p3.c.a
    public void b(@dl.d List<u> workSpecs) {
        f0.p(workSpecs, "workSpecs");
        synchronized (this.f132177c) {
            ArrayList<u> arrayList = new ArrayList();
            for (Object obj : workSpecs) {
                if (d(((u) obj).id)) {
                    arrayList.add(obj);
                }
            }
            for (u uVar : arrayList) {
                androidx.work.n.e().a(f.f132178a, "Constraints met for " + uVar);
            }
            c cVar = this.f132175a;
            if (cVar != null) {
                cVar.e(arrayList);
                b2 b2Var = b2.f124493a;
            }
        }
    }

    @Override // p3.c.a
    public void c(@dl.d List<u> workSpecs) {
        f0.p(workSpecs, "workSpecs");
        synchronized (this.f132177c) {
            c cVar = this.f132175a;
            if (cVar != null) {
                cVar.a(workSpecs);
                b2 b2Var = b2.f124493a;
            }
        }
    }

    public final boolean d(@dl.d String workSpecId) {
        p3.c<?> cVar;
        boolean z10;
        f0.p(workSpecId, "workSpecId");
        synchronized (this.f132177c) {
            p3.c<?>[] cVarArr = this.f132176b;
            int length = cVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    cVar = null;
                    break;
                }
                cVar = cVarArr[i10];
                if (cVar.e(workSpecId)) {
                    break;
                }
                i10++;
            }
            if (cVar != null) {
                androidx.work.n.e().a(f.f132178a, "Work " + workSpecId + " constrained by " + cVar.getClass().getSimpleName());
            }
            z10 = cVar == null;
        }
        return z10;
    }

    @Override // o3.d
    public void reset() {
        synchronized (this.f132177c) {
            for (p3.c<?> cVar : this.f132176b) {
                cVar.g();
            }
            b2 b2Var = b2.f124493a;
        }
    }
}
