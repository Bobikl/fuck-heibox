package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemFeedsPreviousTipsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fj implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f110598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110599b;

    private fj(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f110598a = frameLayout;
        this.f110599b = linearLayout;
    }

    @androidx.annotation.n0
    public static fj a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18339, new Class[]{View.class}, fj.class);
        if (patchProxyResultProxy.isSupported) {
            return (fj) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_previous_tips);
        if (linearLayout != null) {
            return new fj((FrameLayout) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.vg_previous_tips)));
    }

    @androidx.annotation.n0
    public static fj c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18337, new Class[]{LayoutInflater.class}, fj.class);
        return patchProxyResultProxy.isSupported ? (fj) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static fj d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18338, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, fj.class);
        if (patchProxyResultProxy.isSupported) {
            return (fj) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_feeds_previous_tips, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f110598a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18340, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
