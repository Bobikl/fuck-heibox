package com.max.hbcustomview.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.n0;
import androidx.annotation.t0;
import androidx.core.util.o;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HBMarginPageTransformer.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements HBViewPager2.l {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f69785a;

    public e(@t0 int i10) {
        o.j(i10, "Margin must be non-negative");
        this.f69785a = i10;
    }

    private HBViewPager2 a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.rx, new Class[]{View.class}, HBViewPager2.class);
        if (patchProxyResultProxy.isSupported) {
            return (HBViewPager2) patchProxyResultProxy.result;
        }
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof HBViewPager2)) {
            return (HBViewPager2) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }

    @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.l
    public void transformPage(@n0 View view, float f10) {
        if (PatchProxy.proxy(new Object[]{view, new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.qx, new Class[]{View.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        HBViewPager2 hBViewPager2A = a(view);
        float f11 = this.f69785a * f10;
        if (hBViewPager2A.getOrientation() != 0) {
            view.setTranslationY(f11);
            return;
        }
        if (hBViewPager2A.k()) {
            f11 = -f11;
        }
        view.setTranslationX(f11);
    }
}
