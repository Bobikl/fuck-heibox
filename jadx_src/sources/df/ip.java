package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemLinkCollectionBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ip implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f111849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f111850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final o40 f111852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final s40 f111853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final z40 f111854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111856h;

    private ip(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 o40 o40Var, @androidx.annotation.n0 s40 s40Var, @androidx.annotation.n0 z40 z40Var, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f111849a = linearLayout;
        this.f111850b = recyclerView;
        this.f111851c = textView;
        this.f111852d = o40Var;
        this.f111853e = s40Var;
        this.f111854f = z40Var;
        this.f111855g = linearLayout2;
        this.f111856h = linearLayout3;
    }

    @androidx.annotation.n0
    public static ip a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18972, new Class[]{View.class}, ip.class);
        if (patchProxyResultProxy.isSupported) {
            return (ip) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_link;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_link);
        if (recyclerView != null) {
            i10 = R.id.tv_title;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_title);
            if (textView != null) {
                i10 = R.id.v_link_bottom;
                View viewA = l3.d.a(view, R.id.v_link_bottom);
                if (viewA != null) {
                    o40 o40VarA = o40.a(viewA);
                    i10 = R.id.v_link_content;
                    View viewA2 = l3.d.a(view, R.id.v_link_content);
                    if (viewA2 != null) {
                        s40 s40VarA = s40.a(viewA2);
                        i10 = R.id.v_link_top;
                        View viewA3 = l3.d.a(view, R.id.v_link_top);
                        if (viewA3 != null) {
                            z40 z40VarA = z40.a(viewA3);
                            i10 = R.id.vg_title;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_title);
                            if (linearLayout != null) {
                                i10 = R.id.vg_top_link;
                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_top_link);
                                if (linearLayout2 != null) {
                                    return new ip((LinearLayout) view, recyclerView, textView, o40VarA, s40VarA, z40VarA, linearLayout, linearLayout2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ip c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18970, new Class[]{LayoutInflater.class}, ip.class);
        return patchProxyResultProxy.isSupported ? (ip) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ip d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18971, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ip.class);
        if (patchProxyResultProxy.isSupported) {
            return (ip) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_link_collection, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f111849a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18973, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
