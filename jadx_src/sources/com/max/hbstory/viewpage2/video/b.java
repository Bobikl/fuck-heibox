package com.max.hbstory.viewpage2.video;

import androidx.viewpager2.widget.ViewPager2;
import com.max.hbstory.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: StoryPageChangeCallBack.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class b extends ViewPager2.OnPageChangeCallback {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.hbstory.d f73034a;

    public b(@dl.d com.max.hbstory.d storyContext) {
        f0.p(storyContext, "storyContext");
        this.f73034a = storyContext;
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Ui, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ViewPager2 viewPager2E = this.f73034a.e();
        int currentItem = viewPager2E != null ? viewPager2E.getCurrentItem() : 0;
        g gVarD = this.f73034a.d();
        if (gVarD != null) {
            gVarD.W(currentItem);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Ti, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.onPageScrollStateChanged(i10);
        if (i10 == 0) {
            a();
        }
    }
}
