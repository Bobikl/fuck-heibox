package com.max.hbcustomview.viewpager2.widget;

import android.view.View;
import androidx.annotation.p0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Locale;

/* JADX INFO: compiled from: HBPageTransformerAdapter.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f extends HBViewPager2.i {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayoutManager f69786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HBViewPager2.l f69787b;

    f(LinearLayoutManager linearLayoutManager) {
        this.f69786a = linearLayoutManager;
    }

    @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.i
    public void a(int i10) {
    }

    @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.i
    public void b(int i10, float f10, int i11) {
        Object[] objArr = {new Integer(i10), new Float(f10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.sx, new Class[]{cls, Float.TYPE, cls}, Void.TYPE).isSupported || this.f69787b == null) {
            return;
        }
        float f11 = -f10;
        for (int i12 = 0; i12 < this.f69786a.getChildCount(); i12++) {
            View childAt = this.f69786a.getChildAt(i12);
            if (childAt == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i12), Integer.valueOf(this.f69786a.getChildCount())));
            }
            this.f69787b.transformPage(childAt, (this.f69786a.getPosition(childAt) - i10) + f11);
        }
    }

    @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.i
    public void c(int i10) {
    }

    HBViewPager2.l d() {
        return this.f69787b;
    }

    void e(@p0 HBViewPager2.l lVar) {
        this.f69787b = lVar;
    }
}
