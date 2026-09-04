package androidx.work.impl;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.annotation.p0;
import androidx.lifecycle.LiveData;
import androidx.work.ArrayCreatingInputMerger;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.workers.CombineContinuationsWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: WorkContinuationImpl.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class x extends androidx.work.w {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f29415j = androidx.work.n.i("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f29416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ExistingWorkPolicy f29418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<? extends androidx.work.y> f29419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f29420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f29421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<x> f29422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f29423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.work.q f29424i;

    public x(@androidx.annotation.n0 g0 g0Var, @p0 String str, @androidx.annotation.n0 ExistingWorkPolicy existingWorkPolicy, @androidx.annotation.n0 List<? extends androidx.work.y> list) {
        this(g0Var, str, existingWorkPolicy, list, null);
    }

    public x(@androidx.annotation.n0 g0 g0Var, @p0 String str, @androidx.annotation.n0 ExistingWorkPolicy existingWorkPolicy, @androidx.annotation.n0 List<? extends androidx.work.y> list, @p0 List<x> list2) {
        this.f29416a = g0Var;
        this.f29417b = str;
        this.f29418c = existingWorkPolicy;
        this.f29419d = list;
        this.f29422g = list2;
        this.f29420e = new ArrayList(list.size());
        this.f29421f = new ArrayList();
        if (list2 != null) {
            Iterator<x> it = list2.iterator();
            while (it.hasNext()) {
                this.f29421f.addAll(it.next().f29421f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String strB = list.get(i10).b();
            this.f29420e.add(strB);
            this.f29421f.add(strB);
        }
    }

    public x(@androidx.annotation.n0 g0 g0Var, @androidx.annotation.n0 List<? extends androidx.work.y> list) {
        this(g0Var, null, ExistingWorkPolicy.KEEP, list, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private static boolean p(@androidx.annotation.n0 x xVar, @androidx.annotation.n0 Set<String> set) {
        set.addAll(xVar.j());
        Set<String> setS = s(xVar);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (setS.contains(it.next())) {
                return true;
            }
        }
        List<x> listL = xVar.l();
        if (listL != null && !listL.isEmpty()) {
            Iterator<x> it2 = listL.iterator();
            while (it2.hasNext()) {
                if (p(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(xVar.j());
        return false;
    }

    @androidx.annotation.n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Set<String> s(@androidx.annotation.n0 x xVar) {
        HashSet hashSet = new HashSet();
        List<x> listL = xVar.l();
        if (listL != null && !listL.isEmpty()) {
            Iterator<x> it = listL.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().j());
            }
        }
        return hashSet;
    }

    @Override // androidx.work.w
    @androidx.annotation.n0
    protected androidx.work.w b(@androidx.annotation.n0 List<androidx.work.w> list) {
        androidx.work.o oVarB = new androidx.work.o.a(CombineContinuationsWorker.class).C(ArrayCreatingInputMerger.class).b();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<androidx.work.w> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((x) it.next());
        }
        return new x(this.f29416a, null, ExistingWorkPolicy.KEEP, Collections.singletonList(oVarB), arrayList);
    }

    @Override // androidx.work.w
    @androidx.annotation.n0
    public androidx.work.q c() {
        if (this.f29423h) {
            androidx.work.n.e().l(f29415j, "Already enqueued work ids (" + TextUtils.join(", ", this.f29420e) + ")");
        } else {
            androidx.work.impl.utils.e eVar = new androidx.work.impl.utils.e(this);
            this.f29416a.R().a(eVar);
            this.f29424i = eVar.d();
        }
        return this.f29424i;
    }

    @Override // androidx.work.w
    @androidx.annotation.n0
    public com.google.common.util.concurrent.p0<List<WorkInfo>> d() {
        androidx.work.impl.utils.x<List<WorkInfo>> xVarA = androidx.work.impl.utils.x.a(this.f29416a, this.f29421f);
        this.f29416a.R().a(xVarA);
        return xVarA.f();
    }

    @Override // androidx.work.w
    @androidx.annotation.n0
    public LiveData<List<WorkInfo>> e() {
        return this.f29416a.Q(this.f29421f);
    }

    @Override // androidx.work.w
    @androidx.annotation.n0
    public androidx.work.w g(@androidx.annotation.n0 List<androidx.work.o> list) {
        return list.isEmpty() ? this : new x(this.f29416a, this.f29417b, ExistingWorkPolicy.KEEP, list, Collections.singletonList(this));
    }

    @androidx.annotation.n0
    public List<String> h() {
        return this.f29421f;
    }

    @androidx.annotation.n0
    public ExistingWorkPolicy i() {
        return this.f29418c;
    }

    @androidx.annotation.n0
    public List<String> j() {
        return this.f29420e;
    }

    @p0
    public String k() {
        return this.f29417b;
    }

    @p0
    public List<x> l() {
        return this.f29422g;
    }

    @androidx.annotation.n0
    public List<? extends androidx.work.y> m() {
        return this.f29419d;
    }

    @androidx.annotation.n0
    public g0 n() {
        return this.f29416a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean o() {
        return p(this, new HashSet());
    }

    public boolean q() {
        return this.f29423h;
    }

    public void r() {
        this.f29423h = true;
    }
}
