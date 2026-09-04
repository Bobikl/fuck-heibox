package com.max.xiaoheihe.module.bbs;

import android.view.View;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes10.dex */
public class UserAwardListActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private UserAwardListActivity f80157b;

    @i1
    public UserAwardListActivity_ViewBinding(UserAwardListActivity userAwardListActivity) {
        this(userAwardListActivity, userAwardListActivity.getWindow().getDecorView());
    }

    @i1
    public UserAwardListActivity_ViewBinding(UserAwardListActivity userAwardListActivity, View view) {
        this.f80157b = userAwardListActivity;
        userAwardListActivity.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        userAwardListActivity.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26956, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UserAwardListActivity userAwardListActivity = this.f80157b;
        if (userAwardListActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f80157b = null;
        userAwardListActivity.mRefreshLayout = null;
        userAwardListActivity.mRecyclerView = null;
    }
}
