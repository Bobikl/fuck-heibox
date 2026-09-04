package com.max.xiaoheihe.module.analytics;

import android.view.View;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcustomview.EZTabLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.umeng.analytics.MobclickAgent;
import xj.e;
import xj.f;
import xj.n;

/* JADX INFO: compiled from: TestAnnoAspect.java */
/* JADX INFO: loaded from: classes9.dex */
@f
public class d {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n("execution(@com.max.xiaoheihe.module.analytics.UnCatch * *(..))")
    public void a() {
    }

    @xj.d("execution(* com.flyco.tablayout.SlidingTabLayout.calcIndicatorRect(..))")
    public void b(org.aspectj.lang.c cVar) throws Throwable {
        if (!PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 25636, new Class[]{org.aspectj.lang.c.class}, Void.TYPE).isSupported && (cVar.getTarget() instanceof SlidingTabLayout)) {
            SlidingTabLayout slidingTabLayout = (SlidingTabLayout) cVar.getTarget();
            MobclickAgent.reportError(HeyBoxApplication.C(), new IllegalArgumentException("SlidingTabLayout screen==" + com.max.hbcommon.analytics.d.s(com.max.hbcommon.analytics.d.j(slidingTabLayout), slidingTabLayout) + "  view path==" + com.max.hbcommon.analytics.d.u(slidingTabLayout)));
        }
    }

    @e("pointcut()")
    public void c(org.aspectj.lang.e eVar) throws Throwable {
        if (PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, 25635, new Class[]{org.aspectj.lang.e.class}, Void.TYPE).isSupported) {
            return;
        }
        for (Object obj : eVar.e()) {
            if (obj instanceof View) {
                if (com.max.hbcommon.analytics.d.A((View) obj)) {
                    eVar.a();
                }
            } else if ((obj instanceof EZTabLayout.c) && com.max.hbcommon.analytics.d.A(((EZTabLayout.c) obj).f68461g)) {
                eVar.a();
            }
        }
    }

    @e("pointcutSlidngTabSet()")
    public void d(org.aspectj.lang.e eVar) throws Throwable {
        if (PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, 25637, new Class[]{org.aspectj.lang.e.class}, Void.TYPE).isSupported) {
            return;
        }
        eVar.a();
        if (eVar.getTarget() instanceof SlidingTabLayout) {
            SlidingTabLayout slidingTabLayout = (SlidingTabLayout) eVar.getTarget();
            if (slidingTabLayout.getId() == R.id.tab_title) {
                int tabCount = slidingTabLayout.getTabCount();
                if (tabCount < 3) {
                    slidingTabLayout.setTabPadding(20.0f);
                } else if (tabCount < 4) {
                    slidingTabLayout.setTabPadding(15.0f);
                } else {
                    slidingTabLayout.setTabPadding(10.0f);
                }
            }
        }
    }

    @n("pointcuttrue() &&! UnCatchMethod()")
    public void e() {
    }

    @n("execution(* android.view.View.OnClickListener.onClick(android.view.View))")
    public void f() {
    }

    @n("execution(* com.flyco.tablayout.SlidingTabLayout.setViewPager(..))")
    public void g() {
    }

    @n("execution(* com.max.xiaoheihe.view.EZTabLayout.EZTabLayoutOnTabSelectedListener.onTabSelected(com.max.xiaoheihe.view.EZTabLayout.EZTab))")
    public void h() {
    }

    @n("pointcutClick() || pointcutTab()")
    public void i() {
    }
}
