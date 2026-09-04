package com.max.hbstory.delegate;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import androidx.viewpager2.widget.ViewPager2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: StoryViewPage2Delegate.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class StoryViewPage2Delegate implements a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.hbstory.d f72861a;

    public StoryViewPage2Delegate(@dl.d com.max.hbstory.d storyContext) {
        f0.p(storyContext, "storyContext");
        this.f72861a = storyContext;
        c();
    }

    private final void c() {
        Fragment fragmentB;
        com.max.hbstory.g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Qf, new Class[0], Void.TYPE).isSupported || (fragmentB = this.f72861a.b()) == null || (gVarD = this.f72861a.d()) == null) {
            return;
        }
        LiveData<Boolean> liveDataV = gVarD.v();
        final l<Boolean, b2> lVar = new l<Boolean, b2>() { // from class: com.max.hbstory.delegate.StoryViewPage2Delegate$observeLockChangePage$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(Boolean bool) {
                if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, bb.c.k.Sf, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.m(bool);
                if (bool.booleanValue()) {
                    ViewPager2 viewPager2E = this.f72862b.f72861a.e();
                    if (viewPager2E != null) {
                        viewPager2E.setUserInputEnabled(false);
                        return;
                    }
                    return;
                }
                ViewPager2 viewPager2E2 = this.f72862b.f72861a.e();
                if (viewPager2E2 != null) {
                    viewPager2E2.setUserInputEnabled(true);
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Boolean bool) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, bb.c.k.Tf, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(bool);
                return b2.f124493a;
            }
        };
        liveDataV.k(fragmentB, new j0() { // from class: com.max.hbstory.delegate.g
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                StoryViewPage2Delegate.d(lVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(l tmp0, Object obj) {
        if (PatchProxy.proxy(new Object[]{tmp0, obj}, null, changeQuickRedirect, true, bb.c.k.Rf, new Class[]{l.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }
}
