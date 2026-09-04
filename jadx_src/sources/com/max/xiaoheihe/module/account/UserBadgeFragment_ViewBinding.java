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
public class UserBadgeFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private UserBadgeFragment f78523b;

    @i1
    public UserBadgeFragment_ViewBinding(UserBadgeFragment userBadgeFragment, View view) {
        this.f78523b = userBadgeFragment;
        userBadgeFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        userBadgeFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24435, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UserBadgeFragment userBadgeFragment = this.f78523b;
        if (userBadgeFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f78523b = null;
        userBadgeFragment.mRefreshLayout = null;
        userBadgeFragment.mRecyclerView = null;
    }
}
