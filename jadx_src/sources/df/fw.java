package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRecommendUserHsvBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fw implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f110720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f110721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final id0 f110722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ListSectionHeader f110723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f110724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110725f;

    private fw(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 id0 id0Var, @androidx.annotation.n0 ListSectionHeader listSectionHeader, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f110720a = cardView;
        this.f110721b = cardView2;
        this.f110722c = id0Var;
        this.f110723d = listSectionHeader;
        this.f110724e = recyclerView;
        this.f110725f = relativeLayout;
    }

    @androidx.annotation.n0
    public static fw a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19684, new Class[]{View.class}, fw.class);
        if (patchProxyResultProxy.isSupported) {
            return (fw) patchProxyResultProxy.result;
        }
        CardView cardView = (CardView) view;
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            id0 id0VarA = id0.a(viewA);
            i10 = R.id.lsh;
            ListSectionHeader listSectionHeader = (ListSectionHeader) l3.d.a(view, R.id.lsh);
            if (listSectionHeader != null) {
                i10 = R.id.rv_recommend;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_recommend);
                if (recyclerView != null) {
                    i10 = R.id.vg_item;
                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_item);
                    if (relativeLayout != null) {
                        return new fw(cardView, cardView, id0VarA, listSectionHeader, recyclerView, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static fw c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19682, new Class[]{LayoutInflater.class}, fw.class);
        return patchProxyResultProxy.isSupported ? (fw) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static fw d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19683, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, fw.class);
        if (patchProxyResultProxy.isSupported) {
            return (fw) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_recommend_user_hsv, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f110720a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19685, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
