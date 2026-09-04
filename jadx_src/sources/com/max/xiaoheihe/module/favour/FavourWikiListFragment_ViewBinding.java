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
public class FavourWikiListFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FavourWikiListFragment f83847b;

    @i1
    public FavourWikiListFragment_ViewBinding(FavourWikiListFragment favourWikiListFragment, View view) {
        this.f83847b = favourWikiListFragment;
        favourWikiListFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        favourWikiListFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32011, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FavourWikiListFragment favourWikiListFragment = this.f83847b;
        if (favourWikiListFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f83847b = null;
        favourWikiListFragment.mRefreshLayout = null;
        favourWikiListFragment.mRecyclerView = null;
    }
}
