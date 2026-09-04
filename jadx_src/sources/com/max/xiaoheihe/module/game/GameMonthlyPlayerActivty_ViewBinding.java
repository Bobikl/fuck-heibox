package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class GameMonthlyPlayerActivty_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameMonthlyPlayerActivty f84561b;

    @androidx.annotation.i1
    public GameMonthlyPlayerActivty_ViewBinding(GameMonthlyPlayerActivty gameMonthlyPlayerActivty) {
        this(gameMonthlyPlayerActivty, gameMonthlyPlayerActivty.getWindow().getDecorView());
    }

    @androidx.annotation.i1
    public GameMonthlyPlayerActivty_ViewBinding(GameMonthlyPlayerActivty gameMonthlyPlayerActivty, View view) {
        this.f84561b = gameMonthlyPlayerActivty;
        gameMonthlyPlayerActivty.mRvList = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRvList'", RecyclerView.class);
        gameMonthlyPlayerActivty.mSmartRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mSmartRefreshLayout'", SmartRefreshLayout.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33332, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameMonthlyPlayerActivty gameMonthlyPlayerActivty = this.f84561b;
        if (gameMonthlyPlayerActivty == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84561b = null;
        gameMonthlyPlayerActivty.mRvList = null;
        gameMonthlyPlayerActivty.mSmartRefreshLayout = null;
    }
}
