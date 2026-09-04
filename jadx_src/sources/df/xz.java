package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemTradeFilterCategoryBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class xz implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f117662d;

    private xz(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 FrameLayout frameLayout) {
        this.f117659a = linearLayout;
        this.f117660b = recyclerView;
        this.f117661c = textView;
        this.f117662d = frameLayout;
    }

    @androidx.annotation.n0
    public static xz a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20064, new Class[]{View.class}, xz.class);
        if (patchProxyResultProxy.isSupported) {
            return (xz) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_filter;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_filter);
        if (recyclerView != null) {
            i10 = R.id.tv_gourp_name;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_gourp_name);
            if (textView != null) {
                i10 = R.id.vg_arrow;
                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_arrow);
                if (frameLayout != null) {
                    return new xz((LinearLayout) view, recyclerView, textView, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static xz c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20062, new Class[]{LayoutInflater.class}, xz.class);
        return patchProxyResultProxy.isSupported ? (xz) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static xz d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20063, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, xz.class);
        if (patchProxyResultProxy.isSupported) {
            return (xz) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_trade_filter_category, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117659a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20065, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
