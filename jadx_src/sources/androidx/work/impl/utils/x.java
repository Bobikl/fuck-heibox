package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.annotation.k1;
import androidx.annotation.n0;
import androidx.work.WorkInfo;
import com.google.common.util.concurrent.p0;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: StatusRunnable.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class x<T> implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.a<T> f29392b = androidx.work.impl.utils.futures.a.u();

    /* JADX INFO: compiled from: StatusRunnable.java */
    public class a extends x<List<WorkInfo>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.g0 f29393c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f29394d;

        a(androidx.work.impl.g0 g0Var, List list) {
            this.f29393c = g0Var;
            this.f29394d = list;
        }

        @Override // androidx.work.impl.utils.x
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public List<WorkInfo> g() {
            return androidx.work.impl.model.u.f29128x.apply(this.f29393c.P().X().J(this.f29394d));
        }
    }

    /* JADX INFO: compiled from: StatusRunnable.java */
    public class b extends x<WorkInfo> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.g0 f29395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ UUID f29396d;

        b(androidx.work.impl.g0 g0Var, UUID uuid) {
            this.f29395c = g0Var;
            this.f29396d = uuid;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.x
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public WorkInfo g() {
            androidx.work.impl.model.u.WorkInfoPojo workInfoPojoY = this.f29395c.P().X().y(this.f29396d.toString());
            if (workInfoPojoY != null) {
                return workInfoPojoY.w();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: StatusRunnable.java */
    public class c extends x<List<WorkInfo>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.g0 f29397c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29398d;

        c(androidx.work.impl.g0 g0Var, String str) {
            this.f29397c = g0Var;
            this.f29398d = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.x
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public List<WorkInfo> g() {
            return androidx.work.impl.model.u.f29128x.apply(this.f29397c.P().X().H(this.f29398d));
        }
    }

    /* JADX INFO: compiled from: StatusRunnable.java */
    public class d extends x<List<WorkInfo>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.g0 f29399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29400d;

        d(androidx.work.impl.g0 g0Var, String str) {
            this.f29399c = g0Var;
            this.f29400d = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.x
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public List<WorkInfo> g() {
            return androidx.work.impl.model.u.f29128x.apply(this.f29399c.P().X().k(this.f29400d));
        }
    }

    /* JADX INFO: compiled from: StatusRunnable.java */
    public class e extends x<List<WorkInfo>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.g0 f29401c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.work.x f29402d;

        e(androidx.work.impl.g0 g0Var, androidx.work.x xVar) {
            this.f29401c = g0Var;
            this.f29402d = xVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.x
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public List<WorkInfo> g() {
            return androidx.work.impl.model.u.f29128x.apply(this.f29401c.P().T().b(u.b(this.f29402d)));
        }
    }

    @n0
    public static x<List<WorkInfo>> a(@n0 androidx.work.impl.g0 g0Var, @n0 List<String> list) {
        return new a(g0Var, list);
    }

    @n0
    public static x<List<WorkInfo>> b(@n0 androidx.work.impl.g0 g0Var, @n0 String str) {
        return new c(g0Var, str);
    }

    @n0
    public static x<WorkInfo> c(@n0 androidx.work.impl.g0 g0Var, @n0 UUID uuid) {
        return new b(g0Var, uuid);
    }

    @n0
    public static x<List<WorkInfo>> d(@n0 androidx.work.impl.g0 g0Var, @n0 String str) {
        return new d(g0Var, str);
    }

    @n0
    public static x<List<WorkInfo>> e(@n0 androidx.work.impl.g0 g0Var, @n0 androidx.work.x xVar) {
        return new e(g0Var, xVar);
    }

    @n0
    public p0<T> f() {
        return this.f29392b;
    }

    @k1
    abstract T g();

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f29392b.p(g());
        } catch (Throwable th2) {
            this.f29392b.q(th2);
        }
    }
}
