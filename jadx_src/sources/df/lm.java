package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameOverviewRecentStatsView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameOverviewRecentStatBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class lm implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final GameOverviewRecentStatsView f113089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameOverviewRecentStatsView f113090b;

    private lm(@androidx.annotation.n0 GameOverviewRecentStatsView gameOverviewRecentStatsView, @androidx.annotation.n0 GameOverviewRecentStatsView gameOverviewRecentStatsView2) {
        this.f113089a = gameOverviewRecentStatsView;
        this.f113090b = gameOverviewRecentStatsView2;
    }

    @androidx.annotation.n0
    public static lm a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18672, new Class[]{View.class}, lm.class);
        if (patchProxyResultProxy.isSupported) {
            return (lm) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        GameOverviewRecentStatsView gameOverviewRecentStatsView = (GameOverviewRecentStatsView) view;
        return new lm(gameOverviewRecentStatsView, gameOverviewRecentStatsView);
    }

    @androidx.annotation.n0
    public static lm c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18670, new Class[]{LayoutInflater.class}, lm.class);
        return patchProxyResultProxy.isSupported ? (lm) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static lm d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18671, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, lm.class);
        if (patchProxyResultProxy.isSupported) {
            return (lm) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_overview_recent_stat, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public GameOverviewRecentStatsView b() {
        return this.f113089a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18673, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
