package com.max.hbcustomview.viewpager2.widget;

import android.view.View;
import androidx.annotation.n0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: HBCompositePageTransformer.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements HBViewPager2.l {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<HBViewPager2.l> f69776a = new ArrayList();

    public void a(@n0 HBViewPager2.l lVar) {
        if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, bb.c.f.hx, new Class[]{HBViewPager2.l.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69776a.add(lVar);
    }

    public void b(@n0 HBViewPager2.l lVar) {
        if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, bb.c.f.ix, new Class[]{HBViewPager2.l.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69776a.remove(lVar);
    }

    @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.l
    public void transformPage(@n0 View view, float f10) {
        if (PatchProxy.proxy(new Object[]{view, new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.jx, new Class[]{View.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Iterator<HBViewPager2.l> it = this.f69776a.iterator();
        while (it.hasNext()) {
            it.next().transformPage(view, f10);
        }
    }
}
