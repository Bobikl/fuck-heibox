package com.max.xiaoheihe.module.account;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes9.dex */
public class GameAchievementFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameAchievementFragment f77861b;

    @i1
    public GameAchievementFragment_ViewBinding(GameAchievementFragment gameAchievementFragment, View view) {
        this.f77861b = gameAchievementFragment;
        gameAchievementFragment.mVgGameInfo = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_fragment_game_achievement_game_info, "field 'mVgGameInfo'", ViewGroup.class);
        gameAchievementFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv_fragment_game_achievement_list, "field 'mRecyclerView'", RecyclerView.class);
        gameAchievementFragment.mVgTitle = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_fragment_game_achievement_title, "field 'mVgTitle'", ViewGroup.class);
        gameAchievementFragment.mSmartRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl_fragment_game_achievement, "field 'mSmartRefreshLayout'", SmartRefreshLayout.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23076, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameAchievementFragment gameAchievementFragment = this.f77861b;
        if (gameAchievementFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f77861b = null;
        gameAchievementFragment.mVgGameInfo = null;
        gameAchievementFragment.mRecyclerView = null;
        gameAchievementFragment.mVgTitle = null;
        gameAchievementFragment.mSmartRefreshLayout = null;
    }
}
