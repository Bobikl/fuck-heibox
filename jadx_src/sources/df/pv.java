package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRecListHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class pv implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f114614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f114615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.f f114616c;

    private pv(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 mb.f fVar) {
        this.f114614a = constraintLayout;
        this.f114615b = recyclerView;
        this.f114616c = fVar;
    }

    @androidx.annotation.n0
    public static pv a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19620, new Class[]{View.class}, pv.class);
        if (patchProxyResultProxy.isSupported) {
            return (pv) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_container;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_container);
        if (recyclerView != null) {
            i10 = R.id.vg_title;
            View viewA = l3.d.a(view, R.id.vg_title);
            if (viewA != null) {
                return new pv((ConstraintLayout) view, recyclerView, mb.f.a(viewA));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static pv c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19618, new Class[]{LayoutInflater.class}, pv.class);
        return patchProxyResultProxy.isSupported ? (pv) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static pv d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19619, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, pv.class);
        if (patchProxyResultProxy.isSupported) {
            return (pv) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_rec_list_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f114614a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19621, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
