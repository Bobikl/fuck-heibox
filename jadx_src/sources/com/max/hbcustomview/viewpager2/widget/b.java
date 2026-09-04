package com.max.hbcustomview.viewpager2.widget;

import androidx.annotation.n0;
import androidx.annotation.t0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: HBCompositeOnPageChangeCallback.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends HBViewPager2.i {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final List<HBViewPager2.i> f69775a;

    b(int i10) {
        this.f69775a = new ArrayList(i10);
    }

    private void f(ConcurrentModificationException concurrentModificationException) {
        if (!PatchProxy.proxy(new Object[]{concurrentModificationException}, this, changeQuickRedirect, false, bb.c.f.gx, new Class[]{ConcurrentModificationException.class}, Void.TYPE).isSupported) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
        }
    }

    @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.i
    public void a(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.fx, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        try {
            Iterator<HBViewPager2.i> it = this.f69775a.iterator();
            while (it.hasNext()) {
                it.next().a(i10);
            }
        } catch (ConcurrentModificationException e10) {
            f(e10);
        }
    }

    @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.i
    public void b(int i10, float f10, @t0 int i11) {
        Object[] objArr = {new Integer(i10), new Float(f10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.dx, new Class[]{cls, Float.TYPE, cls}, Void.TYPE).isSupported) {
            return;
        }
        try {
            Iterator<HBViewPager2.i> it = this.f69775a.iterator();
            while (it.hasNext()) {
                it.next().b(i10, f10, i11);
            }
        } catch (ConcurrentModificationException e10) {
            f(e10);
        }
    }

    @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.i
    public void c(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.ex, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        try {
            Iterator<HBViewPager2.i> it = this.f69775a.iterator();
            while (it.hasNext()) {
                it.next().c(i10);
            }
        } catch (ConcurrentModificationException e10) {
            f(e10);
        }
    }

    void d(HBViewPager2.i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.f.bx, new Class[]{HBViewPager2.i.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69775a.add(iVar);
    }

    void e(HBViewPager2.i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.f.cx, new Class[]{HBViewPager2.i.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69775a.remove(iVar);
    }
}
