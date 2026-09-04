package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemNewsListHsvBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class pr implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f114599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f114600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final id0 f114601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f114602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final p3 f114604f;

    private pr(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 id0 id0Var, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 p3 p3Var) {
        this.f114599a = cardView;
        this.f114600b = cardView2;
        this.f114601c = id0Var;
        this.f114602d = recyclerView;
        this.f114603e = linearLayout;
        this.f114604f = p3Var;
    }

    @androidx.annotation.n0
    public static pr a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19208, new Class[]{View.class}, pr.class);
        if (patchProxyResultProxy.isSupported) {
            return (pr) patchProxyResultProxy.result;
        }
        CardView cardView = (CardView) view;
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            id0 id0VarA = id0.a(viewA);
            i10 = R.id.rv;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
            if (recyclerView != null) {
                i10 = R.id.vg_item;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_item);
                if (linearLayout != null) {
                    i10 = R.id.vg_layout_all;
                    View viewA2 = l3.d.a(view, R.id.vg_layout_all);
                    if (viewA2 != null) {
                        return new pr(cardView, cardView, id0VarA, recyclerView, linearLayout, p3.a(viewA2));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static pr c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19206, new Class[]{LayoutInflater.class}, pr.class);
        return patchProxyResultProxy.isSupported ? (pr) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static pr d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19207, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, pr.class);
        if (patchProxyResultProxy.isSupported) {
            return (pr) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_news_list_hsv, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f114599a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19209, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
