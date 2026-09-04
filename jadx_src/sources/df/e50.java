package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutFilterRvBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e50 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f110042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f110043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110044d;

    private e50(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f110041a = linearLayout;
        this.f110042b = oVar;
        this.f110043c = recyclerView;
        this.f110044d = linearLayout2;
    }

    @androidx.annotation.n0
    public static e50 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20608, new Class[]{View.class}, e50.class);
        if (patchProxyResultProxy.isSupported) {
            return (e50) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider_top;
        View viewA = l3.d.a(view, R.id.divider_top);
        if (viewA != null) {
            mb.o oVarA = mb.o.a(viewA);
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_filter);
            if (recyclerView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new e50(linearLayout, oVarA, recyclerView, linearLayout);
            }
            i10 = R.id.rv_filter;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static e50 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20606, new Class[]{LayoutInflater.class}, e50.class);
        return patchProxyResultProxy.isSupported ? (e50) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static e50 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20607, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, e50.class);
        if (patchProxyResultProxy.isSupported) {
            return (e50) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_filter_rv, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110041a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20609, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
