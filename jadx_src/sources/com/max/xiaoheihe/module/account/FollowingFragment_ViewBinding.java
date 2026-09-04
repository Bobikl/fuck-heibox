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
public class FollowingFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FollowingFragment f77804b;

    @i1
    public FollowingFragment_ViewBinding(FollowingFragment followingFragment, View view) {
        this.f77804b = followingFragment;
        followingFragment.mRvFollowingList = (RecyclerView) butterknife.internal.f.f(view, R.id.rv_following_list, "field 'mRvFollowingList'", RecyclerView.class);
        followingFragment.mSmartRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl_following_list_wrapper, "field 'mSmartRefreshLayout'", SmartRefreshLayout.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22936, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FollowingFragment followingFragment = this.f77804b;
        if (followingFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f77804b = null;
        followingFragment.mRvFollowingList = null;
        followingFragment.mSmartRefreshLayout = null;
    }
}
