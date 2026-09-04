package com.max.xiaoheihe.module.account;

import android.view.View;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes9.dex */
public class UserGameFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private UserGameFragment f78540b;

    @i1
    public UserGameFragment_ViewBinding(UserGameFragment userGameFragment, View view) {
        this.f78540b = userGameFragment;
        userGameFragment.mRvGameList = (RecyclerView) butterknife.internal.f.f(view, R.id.rv_game_list, "field 'mRvGameList'", RecyclerView.class);
        userGameFragment.mSmartRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl_game_list_wrapper, "field 'mSmartRefreshLayout'", SmartRefreshLayout.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24460, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UserGameFragment userGameFragment = this.f78540b;
        if (userGameFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f78540b = null;
        userGameFragment.mRvGameList = null;
        userGameFragment.mSmartRefreshLayout = null;
    }
}
