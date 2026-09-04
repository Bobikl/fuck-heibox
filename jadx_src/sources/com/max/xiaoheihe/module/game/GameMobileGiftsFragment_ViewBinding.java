package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class GameMobileGiftsFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameMobileGiftsFragment f84510b;

    @androidx.annotation.i1
    public GameMobileGiftsFragment_ViewBinding(GameMobileGiftsFragment gameMobileGiftsFragment, View view) {
        this.f84510b = gameMobileGiftsFragment;
        gameMobileGiftsFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        gameMobileGiftsFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33254, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameMobileGiftsFragment gameMobileGiftsFragment = this.f84510b;
        if (gameMobileGiftsFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84510b = null;
        gameMobileGiftsFragment.mRefreshLayout = null;
        gameMobileGiftsFragment.mRecyclerView = null;
    }
}
