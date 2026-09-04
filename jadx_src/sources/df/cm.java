package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameConsecutiveWinView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2MatchListTitleView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameOverviewMatchListAllBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cm implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f109456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TabLayout f109457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameConsecutiveWinView f109459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final x30 f109460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2MatchListTitleView f109461g;

    private cm(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TabLayout tabLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 GameConsecutiveWinView gameConsecutiveWinView, @androidx.annotation.n0 x30 x30Var, @androidx.annotation.n0 Dota2MatchListTitleView dota2MatchListTitleView) {
        this.f109455a = linearLayout;
        this.f109456b = recyclerView;
        this.f109457c = tabLayout;
        this.f109458d = textView;
        this.f109459e = gameConsecutiveWinView;
        this.f109460f = x30Var;
        this.f109461g = dota2MatchListTitleView;
    }

    @androidx.annotation.n0
    public static cm a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18636, new Class[]{View.class}, cm.class);
        if (patchProxyResultProxy.isSupported) {
            return (cm) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
        if (recyclerView != null) {
            i10 = R.id.tab;
            TabLayout tabLayout = (TabLayout) l3.d.a(view, R.id.tab);
            if (tabLayout != null) {
                i10 = R.id.tv_button;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_button);
                if (textView != null) {
                    i10 = R.id.v_game_consecutive_win;
                    GameConsecutiveWinView gameConsecutiveWinView = (GameConsecutiveWinView) l3.d.a(view, R.id.v_game_consecutive_win);
                    if (gameConsecutiveWinView != null) {
                        i10 = R.id.vg_follow_match_title;
                        View viewA = l3.d.a(view, R.id.vg_follow_match_title);
                        if (viewA != null) {
                            x30 x30VarA = x30.a(viewA);
                            i10 = R.id.vg_my_match_title;
                            Dota2MatchListTitleView dota2MatchListTitleView = (Dota2MatchListTitleView) l3.d.a(view, R.id.vg_my_match_title);
                            if (dota2MatchListTitleView != null) {
                                return new cm((LinearLayout) view, recyclerView, tabLayout, textView, gameConsecutiveWinView, x30VarA, dota2MatchListTitleView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static cm c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18634, new Class[]{LayoutInflater.class}, cm.class);
        return patchProxyResultProxy.isSupported ? (cm) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static cm d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18635, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, cm.class);
        if (patchProxyResultProxy.isSupported) {
            return (cm) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_overview_match_list_all, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109455a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18637, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
