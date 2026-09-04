package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemPopuplistMenuBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class et implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f110294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110297d;

    private et(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2) {
        this.f110294a = frameLayout;
        this.f110295b = textView;
        this.f110296c = view;
        this.f110297d = view2;
    }

    @androidx.annotation.n0
    public static et a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19372, new Class[]{View.class}, et.class);
        if (patchProxyResultProxy.isSupported) {
            return (et) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_menu;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_menu);
        if (textView != null) {
            i10 = R.id.v_divider_bottom;
            View viewA = l3.d.a(view, R.id.v_divider_bottom);
            if (viewA != null) {
                i10 = R.id.v_divider_right;
                View viewA2 = l3.d.a(view, R.id.v_divider_right);
                if (viewA2 != null) {
                    return new et((FrameLayout) view, textView, viewA, viewA2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static et c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19370, new Class[]{LayoutInflater.class}, et.class);
        return patchProxyResultProxy.isSupported ? (et) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static et d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19371, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, et.class);
        if (patchProxyResultProxy.isSupported) {
            return (et) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_popuplist_menu, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f110294a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19373, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
