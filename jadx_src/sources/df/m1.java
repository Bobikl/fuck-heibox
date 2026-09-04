package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityMedalDetailBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f113209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f113210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final yb0 f113212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager2 f113213e;

    private m1(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 yb0 yb0Var, @androidx.annotation.n0 ViewPager2 viewPager2) {
        this.f113209a = constraintLayout;
        this.f113210b = bottomButtonLeftItemView;
        this.f113211c = imageView;
        this.f113212d = yb0Var;
        this.f113213e = viewPager2;
    }

    @androidx.annotation.n0
    public static m1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16496, new Class[]{View.class}, m1.class);
        if (patchProxyResultProxy.isSupported) {
            return (m1) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_button;
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.bottom_button);
        if (bottomButtonLeftItemView != null) {
            i10 = R.id.iv_back;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_back);
            if (imageView != null) {
                i10 = R.id.vg_detail;
                View viewA = l3.d.a(view, R.id.vg_detail);
                if (viewA != null) {
                    yb0 yb0VarA = yb0.a(viewA);
                    i10 = R.id.vp;
                    ViewPager2 viewPager2 = (ViewPager2) l3.d.a(view, R.id.vp);
                    if (viewPager2 != null) {
                        return new m1((ConstraintLayout) view, bottomButtonLeftItemView, imageView, yb0VarA, viewPager2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static m1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16494, new Class[]{LayoutInflater.class}, m1.class);
        return patchProxyResultProxy.isSupported ? (m1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static m1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16495, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, m1.class);
        if (patchProxyResultProxy.isSupported) {
            return (m1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_medal_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f113209a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16497, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
