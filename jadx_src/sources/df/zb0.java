package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: LayoutUserMedalFragmentV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zb0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f118299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final NestedScrollView f118300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f118301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f118302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final t00 f118304f;

    private zb0(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 NestedScrollView nestedScrollView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 t00 t00Var) {
        this.f118299a = smartRefreshLayout;
        this.f118300b = nestedScrollView;
        this.f118301c = recyclerView;
        this.f118302d = smartRefreshLayout2;
        this.f118303e = linearLayout;
        this.f118304f = t00Var;
    }

    @androidx.annotation.n0
    public static zb0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21309, new Class[]{View.class}, zb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (zb0) patchProxyResultProxy.result;
        }
        int i10 = R.id.csl_container;
        NestedScrollView nestedScrollView = (NestedScrollView) l3.d.a(view, R.id.csl_container);
        if (nestedScrollView != null) {
            i10 = R.id.rv;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
            if (recyclerView != null) {
                SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view;
                i10 = R.id.vg_content;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_content);
                if (linearLayout != null) {
                    i10 = R.id.vg_header;
                    View viewA = l3.d.a(view, R.id.vg_header);
                    if (viewA != null) {
                        return new zb0(smartRefreshLayout, nestedScrollView, recyclerView, smartRefreshLayout, linearLayout, t00.a(viewA));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static zb0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21307, new Class[]{LayoutInflater.class}, zb0.class);
        return patchProxyResultProxy.isSupported ? (zb0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static zb0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21308, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, zb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (zb0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_user_medal_fragment_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f118299a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21310, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
