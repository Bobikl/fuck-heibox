package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.dota2.Dota2MatchTitleView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutDota2MatchDetailTopShareBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d40 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f109613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f109614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2MatchTitleView f109615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2MatchTitleView f109616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.s0 f109617f;

    private d40(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 Dota2MatchTitleView dota2MatchTitleView, @androidx.annotation.n0 Dota2MatchTitleView dota2MatchTitleView2, @androidx.annotation.n0 mb.s0 s0Var) {
        this.f109612a = linearLayout;
        this.f109613b = recyclerView;
        this.f109614c = recyclerView2;
        this.f109615d = dota2MatchTitleView;
        this.f109616e = dota2MatchTitleView2;
        this.f109617f = s0Var;
    }

    @androidx.annotation.n0
    public static d40 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20502, new Class[]{View.class}, d40.class);
        if (patchProxyResultProxy.isSupported) {
            return (d40) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_tianhui;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_tianhui);
        if (recyclerView != null) {
            i10 = R.id.rv_yeyan;
            RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_yeyan);
            if (recyclerView2 != null) {
                i10 = R.id.v_match_title_tianhui;
                Dota2MatchTitleView dota2MatchTitleView = (Dota2MatchTitleView) l3.d.a(view, R.id.v_match_title_tianhui);
                if (dota2MatchTitleView != null) {
                    i10 = R.id.v_match_title_yeyan;
                    Dota2MatchTitleView dota2MatchTitleView2 = (Dota2MatchTitleView) l3.d.a(view, R.id.v_match_title_yeyan);
                    if (dota2MatchTitleView2 != null) {
                        i10 = R.id.vg_ban_pick;
                        View viewA = l3.d.a(view, R.id.vg_ban_pick);
                        if (viewA != null) {
                            return new d40((LinearLayout) view, recyclerView, recyclerView2, dota2MatchTitleView, dota2MatchTitleView2, mb.s0.a(viewA));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static d40 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20500, new Class[]{LayoutInflater.class}, d40.class);
        return patchProxyResultProxy.isSupported ? (d40) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static d40 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20501, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, d40.class);
        if (patchProxyResultProxy.isSupported) {
            return (d40) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_dota2_match_detail_top_share, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109612a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20503, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
