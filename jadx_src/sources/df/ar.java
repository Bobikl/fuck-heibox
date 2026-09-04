package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSLinkListBottomBar;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.game.component.GameCard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemMomentsGameCommentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ar implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f108613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final id0 f108614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSLinkListBottomBar f108616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameCard f108619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSUserSectionView f108620h;

    private ar(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 id0 id0Var, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 BBSLinkListBottomBar bBSLinkListBottomBar, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 GameCard gameCard, @androidx.annotation.n0 BBSUserSectionView bBSUserSectionView) {
        this.f108613a = cardView;
        this.f108614b = id0Var;
        this.f108615c = textView;
        this.f108616d = bBSLinkListBottomBar;
        this.f108617e = linearLayout;
        this.f108618f = relativeLayout;
        this.f108619g = gameCard;
        this.f108620h = bBSUserSectionView;
    }

    @androidx.annotation.n0
    public static ar a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19148, new Class[]{View.class}, ar.class);
        if (patchProxyResultProxy.isSupported) {
            return (ar) patchProxyResultProxy.result;
        }
        int i10 = R.id.div;
        View viewA = l3.d.a(view, R.id.div);
        if (viewA != null) {
            id0 id0VarA = id0.a(viewA);
            i10 = R.id.tv_game_comments;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_game_comments);
            if (textView != null) {
                i10 = R.id.vg_bottom_bar;
                BBSLinkListBottomBar bBSLinkListBottomBar = (BBSLinkListBottomBar) l3.d.a(view, R.id.vg_bottom_bar);
                if (bBSLinkListBottomBar != null) {
                    i10 = R.id.vg_bottom_sub;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bottom_sub);
                    if (linearLayout != null) {
                        i10 = R.id.vg_item;
                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_item);
                        if (relativeLayout != null) {
                            i10 = R.id.vg_single_game;
                            GameCard gameCard = (GameCard) l3.d.a(view, R.id.vg_single_game);
                            if (gameCard != null) {
                                i10 = R.id.vg_title;
                                BBSUserSectionView bBSUserSectionView = (BBSUserSectionView) l3.d.a(view, R.id.vg_title);
                                if (bBSUserSectionView != null) {
                                    return new ar((CardView) view, id0VarA, textView, bBSLinkListBottomBar, linearLayout, relativeLayout, gameCard, bBSUserSectionView);
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
    public static ar c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19146, new Class[]{LayoutInflater.class}, ar.class);
        return patchProxyResultProxy.isSupported ? (ar) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ar d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19147, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ar.class);
        if (patchProxyResultProxy.isSupported) {
            return (ar) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_moments_game_comment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f108613a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19149, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
