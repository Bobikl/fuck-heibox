package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.view.c3;
import androidx.core.view.d3;
import androidx.core.view.e3;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: ViewPropertyAnimatorCompatSet.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Interpolator f2050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    d3 f2051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2052e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f2049b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e3 f2053f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList<c3> f2048a = new ArrayList<>();

    /* JADX INFO: compiled from: ViewPropertyAnimatorCompatSet.java */
    public class a extends e3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f2054a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f2055b = 0;

        a() {
        }

        @Override // androidx.core.view.e3, androidx.core.view.d3
        public void b(View view) {
            int i10 = this.f2055b + 1;
            this.f2055b = i10;
            if (i10 == h.this.f2048a.size()) {
                d3 d3Var = h.this.f2051d;
                if (d3Var != null) {
                    d3Var.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.e3, androidx.core.view.d3
        public void c(View view) {
            if (this.f2054a) {
                return;
            }
            this.f2054a = true;
            d3 d3Var = h.this.f2051d;
            if (d3Var != null) {
                d3Var.c(null);
            }
        }

        void d() {
            this.f2055b = 0;
            this.f2054a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f2052e) {
            Iterator<c3> it = this.f2048a.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            this.f2052e = false;
        }
    }

    void b() {
        this.f2052e = false;
    }

    public h c(c3 c3Var) {
        if (!this.f2052e) {
            this.f2048a.add(c3Var);
        }
        return this;
    }

    public h d(c3 c3Var, c3 c3Var2) {
        this.f2048a.add(c3Var);
        c3Var2.w(c3Var.e());
        this.f2048a.add(c3Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f2052e) {
            this.f2049b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f2052e) {
            this.f2050c = interpolator;
        }
        return this;
    }

    public h g(d3 d3Var) {
        if (!this.f2052e) {
            this.f2051d = d3Var;
        }
        return this;
    }

    public void h() {
        if (this.f2052e) {
            return;
        }
        for (c3 c3Var : this.f2048a) {
            long j10 = this.f2049b;
            if (j10 >= 0) {
                c3Var.s(j10);
            }
            Interpolator interpolator = this.f2050c;
            if (interpolator != null) {
                c3Var.t(interpolator);
            }
            if (this.f2051d != null) {
                c3Var.u(this.f2053f);
            }
            c3Var.y();
        }
        this.f2052e = true;
    }
}
