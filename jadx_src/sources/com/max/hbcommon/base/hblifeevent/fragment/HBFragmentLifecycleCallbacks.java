package com.max.hbcommon.base.hblifeevent.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: HBFragmentLifecycleCallbacks.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class HBFragmentLifecycleCallbacks extends FragmentManager.m {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // androidx.fragment.app.FragmentManager.m
    public void b(@d final FragmentManager fm, @d final Fragment f10, @d final Context context) {
        if (PatchProxy.proxy(new Object[]{fm, f10, context}, this, changeQuickRedirect, false, c.d.f31475q2, new Class[]{FragmentManager.class, Fragment.class, Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fm, "fm");
        f0.p(f10, "f");
        f0.p(context, "context");
        a.b(f10, new l<FragmentManager.m, b2>() { // from class: com.max.hbcommon.base.hblifeevent.fragment.HBFragmentLifecycleCallbacks$onFragmentAttached$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d FragmentManager.m it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, c.d.B2, new Class[]{FragmentManager.m.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                it.b(fm, f10, context);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(FragmentManager.m mVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mVar}, this, changeQuickRedirect, false, c.d.C2, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(mVar);
                return b2.f124493a;
            }
        });
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public void c(@d final FragmentManager fm, @d final Fragment f10, @e final Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{fm, f10, bundle}, this, changeQuickRedirect, false, 2202, new Class[]{FragmentManager.class, Fragment.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fm, "fm");
        f0.p(f10, "f");
        a.b(f10, new l<FragmentManager.m, b2>() { // from class: com.max.hbcommon.base.hblifeevent.fragment.HBFragmentLifecycleCallbacks$onFragmentCreated$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d FragmentManager.m it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, c.d.D2, new Class[]{FragmentManager.m.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                it.c(fm, f10, bundle);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(FragmentManager.m mVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mVar}, this, changeQuickRedirect, false, c.d.E2, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(mVar);
                return b2.f124493a;
            }
        });
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public void d(@d final FragmentManager fm, @d final Fragment f10) {
        if (PatchProxy.proxy(new Object[]{fm, f10}, this, changeQuickRedirect, false, c.d.f31673z2, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fm, "fm");
        f0.p(f10, "f");
        a.b(f10, new l<FragmentManager.m, b2>() { // from class: com.max.hbcommon.base.hblifeevent.fragment.HBFragmentLifecycleCallbacks$onFragmentDestroyed$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d FragmentManager.m it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, c.d.F2, new Class[]{FragmentManager.m.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                it.d(fm, f10);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(FragmentManager.m mVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mVar}, this, changeQuickRedirect, false, c.d.G2, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(mVar);
                return b2.f124493a;
            }
        });
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public void e(@d final FragmentManager fm, @d final Fragment f10) {
        if (PatchProxy.proxy(new Object[]{fm, f10}, this, changeQuickRedirect, false, c.d.A2, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fm, "fm");
        f0.p(f10, "f");
        a.b(f10, new l<FragmentManager.m, b2>() { // from class: com.max.hbcommon.base.hblifeevent.fragment.HBFragmentLifecycleCallbacks$onFragmentDetached$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d FragmentManager.m it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, c.d.H2, new Class[]{FragmentManager.m.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                it.e(fm, f10);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(FragmentManager.m mVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mVar}, this, changeQuickRedirect, false, c.d.I2, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(mVar);
                return b2.f124493a;
            }
        });
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public void f(@d final FragmentManager fm, @d final Fragment f10) {
        if (PatchProxy.proxy(new Object[]{fm, f10}, this, changeQuickRedirect, false, c.d.f31585v2, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fm, "fm");
        f0.p(f10, "f");
        a.b(f10, new l<FragmentManager.m, b2>() { // from class: com.max.hbcommon.base.hblifeevent.fragment.HBFragmentLifecycleCallbacks$onFragmentPaused$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d FragmentManager.m it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, c.d.J2, new Class[]{FragmentManager.m.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                it.f(fm, f10);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(FragmentManager.m mVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mVar}, this, changeQuickRedirect, false, c.d.K2, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(mVar);
                return b2.f124493a;
            }
        });
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public void i(@d final FragmentManager fm, @d final Fragment f10) {
        if (PatchProxy.proxy(new Object[]{fm, f10}, this, changeQuickRedirect, false, c.d.f31563u2, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fm, "fm");
        f0.p(f10, "f");
        a.b(f10, new l<FragmentManager.m, b2>() { // from class: com.max.hbcommon.base.hblifeevent.fragment.HBFragmentLifecycleCallbacks$onFragmentResumed$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d FragmentManager.m it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, c.d.L2, new Class[]{FragmentManager.m.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                it.i(fm, f10);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(FragmentManager.m mVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mVar}, this, changeQuickRedirect, false, c.d.M2, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(mVar);
                return b2.f124493a;
            }
        });
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public void j(@d final FragmentManager fm, @d final Fragment f10, @d final Bundle outState) {
        if (PatchProxy.proxy(new Object[]{fm, f10, outState}, this, changeQuickRedirect, false, c.d.f31629x2, new Class[]{FragmentManager.class, Fragment.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fm, "fm");
        f0.p(f10, "f");
        f0.p(outState, "outState");
        a.b(f10, new l<FragmentManager.m, b2>() { // from class: com.max.hbcommon.base.hblifeevent.fragment.HBFragmentLifecycleCallbacks$onFragmentSaveInstanceState$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d FragmentManager.m it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, c.d.N2, new Class[]{FragmentManager.m.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                it.j(fm, f10, outState);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(FragmentManager.m mVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mVar}, this, changeQuickRedirect, false, c.d.O2, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(mVar);
                return b2.f124493a;
            }
        });
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public void k(@d final FragmentManager fm, @d final Fragment f10) {
        if (PatchProxy.proxy(new Object[]{fm, f10}, this, changeQuickRedirect, false, c.d.f31541t2, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fm, "fm");
        f0.p(f10, "f");
        a.b(f10, new l<FragmentManager.m, b2>() { // from class: com.max.hbcommon.base.hblifeevent.fragment.HBFragmentLifecycleCallbacks$onFragmentStarted$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d FragmentManager.m it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, c.d.P2, new Class[]{FragmentManager.m.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                it.k(fm, f10);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(FragmentManager.m mVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mVar}, this, changeQuickRedirect, false, c.d.Q2, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(mVar);
                return b2.f124493a;
            }
        });
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public void l(@d final FragmentManager fm, @d final Fragment f10) {
        if (PatchProxy.proxy(new Object[]{fm, f10}, this, changeQuickRedirect, false, c.d.f31607w2, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fm, "fm");
        f0.p(f10, "f");
        a.b(f10, new l<FragmentManager.m, b2>() { // from class: com.max.hbcommon.base.hblifeevent.fragment.HBFragmentLifecycleCallbacks$onFragmentStopped$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d FragmentManager.m it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, c.d.R2, new Class[]{FragmentManager.m.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                it.l(fm, f10);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(FragmentManager.m mVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mVar}, this, changeQuickRedirect, false, c.d.S2, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(mVar);
                return b2.f124493a;
            }
        });
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public void m(@d final FragmentManager fm, @d final Fragment f10, @d View v10, @e final Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{fm, f10, v10, bundle}, this, changeQuickRedirect, false, c.d.f31519s2, new Class[]{FragmentManager.class, Fragment.class, View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fm, "fm");
        f0.p(f10, "f");
        f0.p(v10, "v");
        a.b(f10, new l<FragmentManager.m, b2>() { // from class: com.max.hbcommon.base.hblifeevent.fragment.HBFragmentLifecycleCallbacks$onFragmentViewCreated$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d FragmentManager.m it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, c.d.T2, new Class[]{FragmentManager.m.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                it.c(fm, f10, bundle);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(FragmentManager.m mVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mVar}, this, changeQuickRedirect, false, c.d.U2, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(mVar);
                return b2.f124493a;
            }
        });
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public void n(@d final FragmentManager fm, @d final Fragment f10) {
        if (PatchProxy.proxy(new Object[]{fm, f10}, this, changeQuickRedirect, false, c.d.f31651y2, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fm, "fm");
        f0.p(f10, "f");
        a.b(f10, new l<FragmentManager.m, b2>() { // from class: com.max.hbcommon.base.hblifeevent.fragment.HBFragmentLifecycleCallbacks$onFragmentViewDestroyed$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d FragmentManager.m it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, c.d.V2, new Class[]{FragmentManager.m.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                it.n(fm, f10);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(FragmentManager.m mVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mVar}, this, changeQuickRedirect, false, c.d.W2, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(mVar);
                return b2.f124493a;
            }
        });
    }
}
