package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogGameFilterBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n5 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f113671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f113672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ScrollView f113673c;

    private n5(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ScrollView scrollView) {
        this.f113671a = constraintLayout;
        this.f113672b = frameLayout;
        this.f113673c = scrollView;
    }

    @androidx.annotation.n0
    public static n5 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16916, new Class[]{View.class}, n5.class);
        if (patchProxyResultProxy.isSupported) {
            return (n5) patchProxyResultProxy.result;
        }
        int i10 = R.id.v_blank;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.v_blank);
        if (frameLayout != null) {
            i10 = R.id.vg_scroll;
            ScrollView scrollView = (ScrollView) l3.d.a(view, R.id.vg_scroll);
            if (scrollView != null) {
                return new n5((ConstraintLayout) view, frameLayout, scrollView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static n5 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16914, new Class[]{LayoutInflater.class}, n5.class);
        return patchProxyResultProxy.isSupported ? (n5) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static n5 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16915, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, n5.class);
        if (patchProxyResultProxy.isSupported) {
            return (n5) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_game_filter, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f113671a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16917, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
