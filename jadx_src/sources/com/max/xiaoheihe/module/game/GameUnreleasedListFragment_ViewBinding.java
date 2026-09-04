package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class GameUnreleasedListFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameUnreleasedListFragment f85267b;

    @androidx.annotation.i1
    public GameUnreleasedListFragment_ViewBinding(GameUnreleasedListFragment gameUnreleasedListFragment, View view) {
        this.f85267b = gameUnreleasedListFragment;
        gameUnreleasedListFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        gameUnreleasedListFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34590, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameUnreleasedListFragment gameUnreleasedListFragment = this.f85267b;
        if (gameUnreleasedListFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f85267b = null;
        gameUnreleasedListFragment.mRefreshLayout = null;
        gameUnreleasedListFragment.mRecyclerView = null;
    }
}
