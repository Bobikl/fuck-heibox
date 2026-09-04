package com.max.xiaoheihe.module.game;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class GameStoreSteamTradingActivityV2_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameStoreSteamTradingActivityV2 f85242b;

    @androidx.annotation.i1
    public GameStoreSteamTradingActivityV2_ViewBinding(GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2) {
        this(gameStoreSteamTradingActivityV2, gameStoreSteamTradingActivityV2.getWindow().getDecorView());
    }

    @androidx.annotation.i1
    public GameStoreSteamTradingActivityV2_ViewBinding(GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2, View view) {
        this.f85242b = gameStoreSteamTradingActivityV2;
        gameStoreSteamTradingActivityV2.mProgressBarView = butterknife.internal.f.e(view, R.id.vg_progress_bar, "field 'mProgressBarView'");
        gameStoreSteamTradingActivityV2.mProgressBarL0 = butterknife.internal.f.e(view, R.id.progress_bar_l_0, "field 'mProgressBarL0'");
        gameStoreSteamTradingActivityV2.mProgressBarR0 = butterknife.internal.f.e(view, R.id.progress_bar_r_0, "field 'mProgressBarR0'");
        gameStoreSteamTradingActivityV2.mProgressIndicator0 = (TextView) butterknife.internal.f.f(view, R.id.progress_indicator_0, "field 'mProgressIndicator0'", TextView.class);
        gameStoreSteamTradingActivityV2.mProgressDesc0 = (TextView) butterknife.internal.f.f(view, R.id.tv_progress_desc_0, "field 'mProgressDesc0'", TextView.class);
        gameStoreSteamTradingActivityV2.mProgressBarL1 = butterknife.internal.f.e(view, R.id.progress_bar_l_1, "field 'mProgressBarL1'");
        gameStoreSteamTradingActivityV2.mProgressBarR1 = butterknife.internal.f.e(view, R.id.progress_bar_r_1, "field 'mProgressBarR1'");
        gameStoreSteamTradingActivityV2.mProgressIndicator1 = (TextView) butterknife.internal.f.f(view, R.id.progress_indicator_1, "field 'mProgressIndicator1'", TextView.class);
        gameStoreSteamTradingActivityV2.mProgressDesc1 = (TextView) butterknife.internal.f.f(view, R.id.tv_progress_desc_1, "field 'mProgressDesc1'", TextView.class);
        gameStoreSteamTradingActivityV2.mProgressBarL2 = butterknife.internal.f.e(view, R.id.progress_bar_l_2, "field 'mProgressBarL2'");
        gameStoreSteamTradingActivityV2.mProgressBarR2 = butterknife.internal.f.e(view, R.id.progress_bar_r_2, "field 'mProgressBarR2'");
        gameStoreSteamTradingActivityV2.mProgressIndicator2 = (TextView) butterknife.internal.f.f(view, R.id.progress_indicator_2, "field 'mProgressIndicator2'", TextView.class);
        gameStoreSteamTradingActivityV2.mProgressDesc2 = (TextView) butterknife.internal.f.f(view, R.id.tv_progress_desc_2, "field 'mProgressDesc2'", TextView.class);
        gameStoreSteamTradingActivityV2.mStatusTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_status, "field 'mStatusTextView'", TextView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34546, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2 = this.f85242b;
        if (gameStoreSteamTradingActivityV2 == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f85242b = null;
        gameStoreSteamTradingActivityV2.mProgressBarView = null;
        gameStoreSteamTradingActivityV2.mProgressBarL0 = null;
        gameStoreSteamTradingActivityV2.mProgressBarR0 = null;
        gameStoreSteamTradingActivityV2.mProgressIndicator0 = null;
        gameStoreSteamTradingActivityV2.mProgressDesc0 = null;
        gameStoreSteamTradingActivityV2.mProgressBarL1 = null;
        gameStoreSteamTradingActivityV2.mProgressBarR1 = null;
        gameStoreSteamTradingActivityV2.mProgressIndicator1 = null;
        gameStoreSteamTradingActivityV2.mProgressDesc1 = null;
        gameStoreSteamTradingActivityV2.mProgressBarL2 = null;
        gameStoreSteamTradingActivityV2.mProgressBarR2 = null;
        gameStoreSteamTradingActivityV2.mProgressIndicator2 = null;
        gameStoreSteamTradingActivityV2.mProgressDesc2 = null;
        gameStoreSteamTradingActivityV2.mStatusTextView = null;
    }
}
