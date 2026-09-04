package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemHotLinkX3Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class to implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f116041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final so f116042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final so f116043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final so f116044d;

    private to(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 so soVar, @androidx.annotation.n0 so soVar2, @androidx.annotation.n0 so soVar3) {
        this.f116041a = linearLayout;
        this.f116042b = soVar;
        this.f116043c = soVar2;
        this.f116044d = soVar3;
    }

    @androidx.annotation.n0
    public static to a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18912, new Class[]{View.class}, to.class);
        if (patchProxyResultProxy.isSupported) {
            return (to) patchProxyResultProxy.result;
        }
        int i10 = R.id.item1;
        View viewA = l3.d.a(view, R.id.item1);
        if (viewA != null) {
            so soVarA = so.a(viewA);
            View viewA2 = l3.d.a(view, R.id.item2);
            if (viewA2 != null) {
                so soVarA2 = so.a(viewA2);
                View viewA3 = l3.d.a(view, R.id.item3);
                if (viewA3 != null) {
                    return new to((LinearLayout) view, soVarA, soVarA2, so.a(viewA3));
                }
                i10 = R.id.item3;
            } else {
                i10 = R.id.item2;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static to c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18910, new Class[]{LayoutInflater.class}, to.class);
        return patchProxyResultProxy.isSupported ? (to) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static to d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18911, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, to.class);
        if (patchProxyResultProxy.isSupported) {
            return (to) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_hot_link_x3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f116041a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18913, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
