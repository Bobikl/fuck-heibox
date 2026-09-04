package com.max.xiaoheihe.module.game;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class GameStoreSteamTradingActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameStoreSteamTradingActivity f85243b;

    @androidx.annotation.i1
    public GameStoreSteamTradingActivity_ViewBinding(GameStoreSteamTradingActivity gameStoreSteamTradingActivity) {
        this(gameStoreSteamTradingActivity, gameStoreSteamTradingActivity.getWindow().getDecorView());
    }

    @androidx.annotation.i1
    public GameStoreSteamTradingActivity_ViewBinding(GameStoreSteamTradingActivity gameStoreSteamTradingActivity, View view) {
        this.f85243b = gameStoreSteamTradingActivity;
        gameStoreSteamTradingActivity.mProgressBarView = butterknife.internal.f.e(view, R.id.vg_progress_bar, "field 'mProgressBarView'");
        gameStoreSteamTradingActivity.mProgressBarL0 = butterknife.internal.f.e(view, R.id.progress_bar_l_0, "field 'mProgressBarL0'");
        gameStoreSteamTradingActivity.mProgressBarR0 = butterknife.internal.f.e(view, R.id.progress_bar_r_0, "field 'mProgressBarR0'");
        gameStoreSteamTradingActivity.mProgressIndicator0 = (TextView) butterknife.internal.f.f(view, R.id.progress_indicator_0, "field 'mProgressIndicator0'", TextView.class);
        gameStoreSteamTradingActivity.mProgressDesc0 = (TextView) butterknife.internal.f.f(view, R.id.tv_progress_desc_0, "field 'mProgressDesc0'", TextView.class);
        gameStoreSteamTradingActivity.mProgressBarL1 = butterknife.internal.f.e(view, R.id.progress_bar_l_1, "field 'mProgressBarL1'");
        gameStoreSteamTradingActivity.mProgressBarR1 = butterknife.internal.f.e(view, R.id.progress_bar_r_1, "field 'mProgressBarR1'");
        gameStoreSteamTradingActivity.mProgressIndicator1 = (TextView) butterknife.internal.f.f(view, R.id.progress_indicator_1, "field 'mProgressIndicator1'", TextView.class);
        gameStoreSteamTradingActivity.mProgressDesc1 = (TextView) butterknife.internal.f.f(view, R.id.tv_progress_desc_1, "field 'mProgressDesc1'", TextView.class);
        gameStoreSteamTradingActivity.mProgressBarL2 = butterknife.internal.f.e(view, R.id.progress_bar_l_2, "field 'mProgressBarL2'");
        gameStoreSteamTradingActivity.mProgressBarR2 = butterknife.internal.f.e(view, R.id.progress_bar_r_2, "field 'mProgressBarR2'");
        gameStoreSteamTradingActivity.mProgressIndicator2 = (TextView) butterknife.internal.f.f(view, R.id.progress_indicator_2, "field 'mProgressIndicator2'", TextView.class);
        gameStoreSteamTradingActivity.mProgressDesc2 = (TextView) butterknife.internal.f.f(view, R.id.tv_progress_desc_2, "field 'mProgressDesc2'", TextView.class);
        gameStoreSteamTradingActivity.mStatusTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_status, "field 'mStatusTextView'", TextView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34547, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameStoreSteamTradingActivity gameStoreSteamTradingActivity = this.f85243b;
        if (gameStoreSteamTradingActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f85243b = null;
        gameStoreSteamTradingActivity.mProgressBarView = null;
        gameStoreSteamTradingActivity.mProgressBarL0 = null;
        gameStoreSteamTradingActivity.mProgressBarR0 = null;
        gameStoreSteamTradingActivity.mProgressIndicator0 = null;
        gameStoreSteamTradingActivity.mProgressDesc0 = null;
        gameStoreSteamTradingActivity.mProgressBarL1 = null;
        gameStoreSteamTradingActivity.mProgressBarR1 = null;
        gameStoreSteamTradingActivity.mProgressIndicator1 = null;
        gameStoreSteamTradingActivity.mProgressDesc1 = null;
        gameStoreSteamTradingActivity.mProgressBarL2 = null;
        gameStoreSteamTradingActivity.mProgressBarR2 = null;
        gameStoreSteamTradingActivity.mProgressIndicator2 = null;
        gameStoreSteamTradingActivity.mProgressDesc2 = null;
        gameStoreSteamTradingActivity.mStatusTextView = null;
    }
}
