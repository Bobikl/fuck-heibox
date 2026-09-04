package com.max.xiaoheihe.module.favour;

import android.view.View;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes10.dex */
public class FavourLinkListFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FavourLinkListFragment f83838b;

    @i1
    public FavourLinkListFragment_ViewBinding(FavourLinkListFragment favourLinkListFragment, View view) {
        this.f83838b = favourLinkListFragment;
        favourLinkListFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        favourLinkListFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31995, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FavourLinkListFragment favourLinkListFragment = this.f83838b;
        if (favourLinkListFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f83838b = null;
        favourLinkListFragment.mRefreshLayout = null;
        favourLinkListFragment.mRecyclerView = null;
    }
}
