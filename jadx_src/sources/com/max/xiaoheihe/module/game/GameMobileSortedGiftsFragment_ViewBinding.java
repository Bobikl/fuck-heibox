package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class GameMobileSortedGiftsFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameMobileSortedGiftsFragment f84557b;

    @androidx.annotation.i1
    public GameMobileSortedGiftsFragment_ViewBinding(GameMobileSortedGiftsFragment gameMobileSortedGiftsFragment, View view) {
        this.f84557b = gameMobileSortedGiftsFragment;
        gameMobileSortedGiftsFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        gameMobileSortedGiftsFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33315, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameMobileSortedGiftsFragment gameMobileSortedGiftsFragment = this.f84557b;
        if (gameMobileSortedGiftsFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84557b = null;
        gameMobileSortedGiftsFragment.mRefreshLayout = null;
        gameMobileSortedGiftsFragment.mRecyclerView = null;
    }
}
