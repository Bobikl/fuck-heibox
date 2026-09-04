package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameOverviewAllStatsView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameOverviewAllStatBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kl implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final GameOverviewAllStatsView f112654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameOverviewAllStatsView f112655b;

    private kl(@androidx.annotation.n0 GameOverviewAllStatsView gameOverviewAllStatsView, @androidx.annotation.n0 GameOverviewAllStatsView gameOverviewAllStatsView2) {
        this.f112654a = gameOverviewAllStatsView;
        this.f112655b = gameOverviewAllStatsView2;
    }

    @androidx.annotation.n0
    public static kl a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18565, new Class[]{View.class}, kl.class);
        if (patchProxyResultProxy.isSupported) {
            return (kl) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        GameOverviewAllStatsView gameOverviewAllStatsView = (GameOverviewAllStatsView) view;
        return new kl(gameOverviewAllStatsView, gameOverviewAllStatsView);
    }

    @androidx.annotation.n0
    public static kl c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18563, new Class[]{LayoutInflater.class}, kl.class);
        return patchProxyResultProxy.isSupported ? (kl) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static kl d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18564, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, kl.class);
        if (patchProxyResultProxy.isSupported) {
            return (kl) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_overview_all_stat, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public GameOverviewAllStatsView b() {
        return this.f112654a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18566, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
