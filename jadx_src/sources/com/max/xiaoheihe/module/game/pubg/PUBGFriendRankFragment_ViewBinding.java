package com.max.xiaoheihe.module.game.pubg;

import android.view.View;
import androidx.annotation.i;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class PUBGFriendRankFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PUBGFriendRankFragment f88115b;

    @i1
    public PUBGFriendRankFragment_ViewBinding(PUBGFriendRankFragment pUBGFriendRankFragment, View view) {
        this.f88115b = pUBGFriendRankFragment;
        pUBGFriendRankFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        pUBGFriendRankFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38284, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PUBGFriendRankFragment pUBGFriendRankFragment = this.f88115b;
        if (pUBGFriendRankFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f88115b = null;
        pUBGFriendRankFragment.mRefreshLayout = null;
        pUBGFriendRankFragment.mRecyclerView = null;
    }
}
