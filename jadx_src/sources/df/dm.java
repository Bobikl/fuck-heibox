package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameConsecutiveWinView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2MatchListTitleView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameOverviewMatchListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dm implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameConsecutiveWinView f109833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2MatchListTitleView f109834d;

    private dm(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 GameConsecutiveWinView gameConsecutiveWinView, @androidx.annotation.n0 Dota2MatchListTitleView dota2MatchListTitleView) {
        this.f109831a = linearLayout;
        this.f109832b = textView;
        this.f109833c = gameConsecutiveWinView;
        this.f109834d = dota2MatchListTitleView;
    }

    @androidx.annotation.n0
    public static dm a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18640, new Class[]{View.class}, dm.class);
        if (patchProxyResultProxy.isSupported) {
            return (dm) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_title;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_title);
        if (textView != null) {
            i10 = R.id.v_game_consecutive_win;
            GameConsecutiveWinView gameConsecutiveWinView = (GameConsecutiveWinView) l3.d.a(view, R.id.v_game_consecutive_win);
            if (gameConsecutiveWinView != null) {
                i10 = R.id.v_match_list_title;
                Dota2MatchListTitleView dota2MatchListTitleView = (Dota2MatchListTitleView) l3.d.a(view, R.id.v_match_list_title);
                if (dota2MatchListTitleView != null) {
                    return new dm((LinearLayout) view, textView, gameConsecutiveWinView, dota2MatchListTitleView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static dm c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18638, new Class[]{LayoutInflater.class}, dm.class);
        return patchProxyResultProxy.isSupported ? (dm) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static dm d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18639, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, dm.class);
        if (patchProxyResultProxy.isSupported) {
            return (dm) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_overview_match_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109831a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18641, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
