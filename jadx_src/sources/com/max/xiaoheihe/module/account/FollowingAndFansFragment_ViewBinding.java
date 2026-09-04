package com.max.xiaoheihe.module.account;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.hbcommon.component.FilterButtonView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes9.dex */
public class FollowingAndFansFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FollowingAndFansFragment f77789b;

    @i1
    public FollowingAndFansFragment_ViewBinding(FollowingAndFansFragment followingAndFansFragment, View view) {
        this.f77789b = followingAndFansFragment;
        followingAndFansFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        followingAndFansFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
        followingAndFansFragment.rv_empty_view = butterknife.internal.f.e(view, R.id.rv_empty_view, "field 'rv_empty_view'");
        followingAndFansFragment.mSearchHeader = butterknife.internal.f.e(view, R.id.vg_search_header, "field 'mSearchHeader'");
        followingAndFansFragment.mSearchEditText = (EditText) butterknife.internal.f.f(view, R.id.et_search, "field 'mSearchEditText'", EditText.class);
        followingAndFansFragment.ivDel = (ImageView) butterknife.internal.f.f(view, R.id.iv_del, "field 'ivDel'", ImageView.class);
        followingAndFansFragment.mSortTextView = (FilterButtonView) butterknife.internal.f.f(view, R.id.fbv_sort, "field 'mSortTextView'", FilterButtonView.class);
        followingAndFansFragment.vDiv4dp = butterknife.internal.f.e(view, R.id.v_div_4dp, "field 'vDiv4dp'");
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22918, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FollowingAndFansFragment followingAndFansFragment = this.f77789b;
        if (followingAndFansFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f77789b = null;
        followingAndFansFragment.mRefreshLayout = null;
        followingAndFansFragment.mRecyclerView = null;
        followingAndFansFragment.rv_empty_view = null;
        followingAndFansFragment.mSearchHeader = null;
        followingAndFansFragment.mSearchEditText = null;
        followingAndFansFragment.ivDel = null;
        followingAndFansFragment.mSortTextView = null;
        followingAndFansFragment.vDiv4dp = null;
    }
}
