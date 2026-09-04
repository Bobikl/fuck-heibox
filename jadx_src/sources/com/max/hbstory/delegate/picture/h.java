package com.max.hbstory.delegate.picture;

import androidx.viewpager2.widget.ViewPager2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PictureViewPager2Delegate.kt */
/* JADX INFO: loaded from: classes13.dex */
public class h implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final ViewPager2 f72914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f72915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f72916d;

    public h(@dl.d ViewPager2 viewPager, boolean z10) {
        f0.p(viewPager, "viewPager");
        this.f72914b = viewPager;
        this.f72915c = z10;
        this.f72916d = z10 ? 800L : 3000L;
    }

    public final long a() {
        return this.f72916d;
    }

    public final void b(long j10) {
        this.f72916d = j10;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Kg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int currentItem = this.f72914b.getCurrentItem();
        if (this.f72914b.isFakeDragging()) {
            return;
        }
        this.f72914b.setCurrentItem(currentItem + 1, true);
        this.f72916d = this.f72915c ? 800L : 3000L;
    }
}
