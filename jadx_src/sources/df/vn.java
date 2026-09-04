package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGoToGeneralSearchTipBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class vn implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f116889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final id0 f116890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final id0 f116891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116892d;

    private vn(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 id0 id0Var, @androidx.annotation.n0 id0 id0Var2, @androidx.annotation.n0 TextView textView) {
        this.f116889a = linearLayout;
        this.f116890b = id0Var;
        this.f116891c = id0Var2;
        this.f116892d = textView;
    }

    @androidx.annotation.n0
    public static vn a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18816, new Class[]{View.class}, vn.class);
        if (patchProxyResultProxy.isSupported) {
            return (vn) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            id0 id0VarA = id0.a(viewA);
            View viewA2 = l3.d.a(view, R.id.top_divider);
            if (viewA2 != null) {
                id0 id0VarA2 = id0.a(viewA2);
                TextView textView = (TextView) l3.d.a(view, R.id.tv_search_content);
                if (textView != null) {
                    return new vn((LinearLayout) view, id0VarA, id0VarA2, textView);
                }
                i10 = R.id.tv_search_content;
            } else {
                i10 = R.id.top_divider;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static vn c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18814, new Class[]{LayoutInflater.class}, vn.class);
        return patchProxyResultProxy.isSupported ? (vn) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static vn d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18815, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, vn.class);
        if (patchProxyResultProxy.isSupported) {
            return (vn) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_go_to_general_search_tip, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f116889a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18817, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
