package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSLinkListBottomBar;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.game.component.GameCard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemMomentsFollowGameBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zq implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f118427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final id0 f118428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f118429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSLinkListBottomBar f118430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameCard f118432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSUserSectionView f118433g;

    private zq(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 id0 id0Var, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 BBSLinkListBottomBar bBSLinkListBottomBar, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 GameCard gameCard, @androidx.annotation.n0 BBSUserSectionView bBSUserSectionView) {
        this.f118427a = cardView;
        this.f118428b = id0Var;
        this.f118429c = recyclerView;
        this.f118430d = bBSLinkListBottomBar;
        this.f118431e = linearLayout;
        this.f118432f = gameCard;
        this.f118433g = bBSUserSectionView;
    }

    @androidx.annotation.n0
    public static zq a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19144, new Class[]{View.class}, zq.class);
        if (patchProxyResultProxy.isSupported) {
            return (zq) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            id0 id0VarA = id0.a(viewA);
            i10 = R.id.rv_games;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_games);
            if (recyclerView != null) {
                i10 = R.id.vg_bottom_bar;
                BBSLinkListBottomBar bBSLinkListBottomBar = (BBSLinkListBottomBar) l3.d.a(view, R.id.vg_bottom_bar);
                if (bBSLinkListBottomBar != null) {
                    i10 = R.id.vg_item;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_item);
                    if (linearLayout != null) {
                        i10 = R.id.vg_single_game;
                        GameCard gameCard = (GameCard) l3.d.a(view, R.id.vg_single_game);
                        if (gameCard != null) {
                            i10 = R.id.vg_title;
                            BBSUserSectionView bBSUserSectionView = (BBSUserSectionView) l3.d.a(view, R.id.vg_title);
                            if (bBSUserSectionView != null) {
                                return new zq((CardView) view, id0VarA, recyclerView, bBSLinkListBottomBar, linearLayout, gameCard, bBSUserSectionView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static zq c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19142, new Class[]{LayoutInflater.class}, zq.class);
        return patchProxyResultProxy.isSupported ? (zq) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static zq d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19143, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, zq.class);
        if (patchProxyResultProxy.isSupported) {
            return (zq) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_moments_follow_game, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f118427a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19145, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
