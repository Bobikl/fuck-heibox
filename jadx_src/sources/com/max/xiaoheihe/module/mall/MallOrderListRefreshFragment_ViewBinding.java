package com.max.xiaoheihe.module.mall;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class MallOrderListRefreshFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MallOrderListRefreshFragment f89671b;

    @i1
    public MallOrderListRefreshFragment_ViewBinding(MallOrderListRefreshFragment mallOrderListRefreshFragment, View view) {
        this.f89671b = mallOrderListRefreshFragment;
        mallOrderListRefreshFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        mallOrderListRefreshFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
        mallOrderListRefreshFragment.mEmptyView = butterknife.internal.f.e(view, R.id.rv_empty_view, "field 'mEmptyView'");
        mallOrderListRefreshFragment.tv_empty = (TextView) butterknife.internal.f.f(view, R.id.tv_empty, "field 'tv_empty'", TextView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40314, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallOrderListRefreshFragment mallOrderListRefreshFragment = this.f89671b;
        if (mallOrderListRefreshFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f89671b = null;
        mallOrderListRefreshFragment.mRefreshLayout = null;
        mallOrderListRefreshFragment.mRecyclerView = null;
        mallOrderListRefreshFragment.mEmptyView = null;
        mallOrderListRefreshFragment.tv_empty = null;
    }
}
