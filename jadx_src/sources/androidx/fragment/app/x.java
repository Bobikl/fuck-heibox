package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: FragmentLifecycleCallbacksDispatcher.java */
/* JADX INFO: loaded from: classes6.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CopyOnWriteArrayList<a> f23890a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    private final FragmentManager f23891b;

    /* JADX INFO: compiled from: FragmentLifecycleCallbacksDispatcher.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.n0
        final FragmentManager.m f23892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f23893b;

        a(@androidx.annotation.n0 FragmentManager.m mVar, boolean z10) {
            this.f23892a = mVar;
            this.f23893b = z10;
        }
    }

    x(@androidx.annotation.n0 FragmentManager fragmentManager) {
        this.f23891b = fragmentManager;
    }

    void a(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.p0 Bundle bundle, boolean z10) {
        Fragment fragmentN0 = this.f23891b.N0();
        if (fragmentN0 != null) {
            fragmentN0.getParentFragmentManager().M0().a(fragment, bundle, true);
        }
        for (a aVar : this.f23890a) {
            if (!z10 || aVar.f23893b) {
                aVar.f23892a.a(this.f23891b, fragment, bundle);
            }
        }
    }

    void b(@androidx.annotation.n0 Fragment fragment, boolean z10) {
        Context contextF = this.f23891b.K0().f();
        Fragment fragmentN0 = this.f23891b.N0();
        if (fragmentN0 != null) {
            fragmentN0.getParentFragmentManager().M0().b(fragment, true);
        }
        for (a aVar : this.f23890a) {
            if (!z10 || aVar.f23893b) {
                aVar.f23892a.b(this.f23891b, fragment, contextF);
            }
        }
    }

    void c(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.p0 Bundle bundle, boolean z10) {
        Fragment fragmentN0 = this.f23891b.N0();
        if (fragmentN0 != null) {
            fragmentN0.getParentFragmentManager().M0().c(fragment, bundle, true);
        }
        for (a aVar : this.f23890a) {
            if (!z10 || aVar.f23893b) {
                aVar.f23892a.c(this.f23891b, fragment, bundle);
            }
        }
    }

    void d(@androidx.annotation.n0 Fragment fragment, boolean z10) {
        Fragment fragmentN0 = this.f23891b.N0();
        if (fragmentN0 != null) {
            fragmentN0.getParentFragmentManager().M0().d(fragment, true);
        }
        for (a aVar : this.f23890a) {
            if (!z10 || aVar.f23893b) {
                aVar.f23892a.d(this.f23891b, fragment);
            }
        }
    }

    void e(@androidx.annotation.n0 Fragment fragment, boolean z10) {
        Fragment fragmentN0 = this.f23891b.N0();
        if (fragmentN0 != null) {
            fragmentN0.getParentFragmentManager().M0().e(fragment, true);
        }
        for (a aVar : this.f23890a) {
            if (!z10 || aVar.f23893b) {
                aVar.f23892a.e(this.f23891b, fragment);
            }
        }
    }

    void f(@androidx.annotation.n0 Fragment fragment, boolean z10) {
        Fragment fragmentN0 = this.f23891b.N0();
        if (fragmentN0 != null) {
            fragmentN0.getParentFragmentManager().M0().f(fragment, true);
        }
        for (a aVar : this.f23890a) {
            if (!z10 || aVar.f23893b) {
                aVar.f23892a.f(this.f23891b, fragment);
            }
        }
    }

    void g(@androidx.annotation.n0 Fragment fragment, boolean z10) {
        Context contextF = this.f23891b.K0().f();
        Fragment fragmentN0 = this.f23891b.N0();
        if (fragmentN0 != null) {
            fragmentN0.getParentFragmentManager().M0().g(fragment, true);
        }
        for (a aVar : this.f23890a) {
            if (!z10 || aVar.f23893b) {
                aVar.f23892a.g(this.f23891b, fragment, contextF);
            }
        }
    }

    void h(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.p0 Bundle bundle, boolean z10) {
        Fragment fragmentN0 = this.f23891b.N0();
        if (fragmentN0 != null) {
            fragmentN0.getParentFragmentManager().M0().h(fragment, bundle, true);
        }
        for (a aVar : this.f23890a) {
            if (!z10 || aVar.f23893b) {
                aVar.f23892a.h(this.f23891b, fragment, bundle);
            }
        }
    }

    void i(@androidx.annotation.n0 Fragment fragment, boolean z10) {
        Fragment fragmentN0 = this.f23891b.N0();
        if (fragmentN0 != null) {
            fragmentN0.getParentFragmentManager().M0().i(fragment, true);
        }
        for (a aVar : this.f23890a) {
            if (!z10 || aVar.f23893b) {
                aVar.f23892a.i(this.f23891b, fragment);
            }
        }
    }

    void j(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 Bundle bundle, boolean z10) {
        Fragment fragmentN0 = this.f23891b.N0();
        if (fragmentN0 != null) {
            fragmentN0.getParentFragmentManager().M0().j(fragment, bundle, true);
        }
        for (a aVar : this.f23890a) {
            if (!z10 || aVar.f23893b) {
                aVar.f23892a.j(this.f23891b, fragment, bundle);
            }
        }
    }

    void k(@androidx.annotation.n0 Fragment fragment, boolean z10) {
        Fragment fragmentN0 = this.f23891b.N0();
        if (fragmentN0 != null) {
            fragmentN0.getParentFragmentManager().M0().k(fragment, true);
        }
        for (a aVar : this.f23890a) {
            if (!z10 || aVar.f23893b) {
                aVar.f23892a.k(this.f23891b, fragment);
            }
        }
    }

    void l(@androidx.annotation.n0 Fragment fragment, boolean z10) {
        Fragment fragmentN0 = this.f23891b.N0();
        if (fragmentN0 != null) {
            fragmentN0.getParentFragmentManager().M0().l(fragment, true);
        }
        for (a aVar : this.f23890a) {
            if (!z10 || aVar.f23893b) {
                aVar.f23892a.l(this.f23891b, fragment);
            }
        }
    }

    void m(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 View view, @androidx.annotation.p0 Bundle bundle, boolean z10) {
        Fragment fragmentN0 = this.f23891b.N0();
        if (fragmentN0 != null) {
            fragmentN0.getParentFragmentManager().M0().m(fragment, view, bundle, true);
        }
        for (a aVar : this.f23890a) {
            if (!z10 || aVar.f23893b) {
                aVar.f23892a.m(this.f23891b, fragment, view, bundle);
            }
        }
    }

    void n(@androidx.annotation.n0 Fragment fragment, boolean z10) {
        Fragment fragmentN0 = this.f23891b.N0();
        if (fragmentN0 != null) {
            fragmentN0.getParentFragmentManager().M0().n(fragment, true);
        }
        for (a aVar : this.f23890a) {
            if (!z10 || aVar.f23893b) {
                aVar.f23892a.n(this.f23891b, fragment);
            }
        }
    }

    public void o(@androidx.annotation.n0 FragmentManager.m mVar, boolean z10) {
        this.f23890a.add(new a(mVar, z10));
    }

    public void p(@androidx.annotation.n0 FragmentManager.m mVar) {
        synchronized (this.f23890a) {
            int size = this.f23890a.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f23890a.get(i10).f23892a == mVar) {
                    this.f23890a.remove(i10);
                    break;
                }
            }
        }
    }
}
