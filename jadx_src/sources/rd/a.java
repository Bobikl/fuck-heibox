package rd;

import androidx.viewpager2.widget.ViewPager2;
import bb.c;
import com.max.hbstory.g;
import com.max.hbstory.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: StoryPictureChangeCallBack.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class a extends ViewPager2.OnPageChangeCallback {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final g f138883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f138884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f138885c;

    public a(@d g viewModel, int i10) {
        f0.p(viewModel, "viewModel");
        this.f138883a = viewModel;
        this.f138884b = i10;
    }

    private final void b(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.k.Ji, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f138883a.X(i10);
    }

    private final void c(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.k.Ki, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f138883a.X(i10);
    }

    public final int a() {
        return this.f138884b;
    }

    public final void d(int i10) {
        this.f138884b = i10;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.k.Hi, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.onPageScrollStateChanged(i10);
        this.f138885c = i10 == 1;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.k.Ii, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.onPageSelected(i10);
        if (i.a(this.f138883a, this.f138884b)) {
            if (this.f138885c) {
                c(i10);
            } else {
                b(i10);
            }
        }
    }
}
