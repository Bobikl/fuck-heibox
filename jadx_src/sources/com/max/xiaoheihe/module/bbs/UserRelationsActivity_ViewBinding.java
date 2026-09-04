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
public class UserRelationsActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private UserRelationsActivity f80223b;

    @i1
    public UserRelationsActivity_ViewBinding(UserRelationsActivity userRelationsActivity) {
        this(userRelationsActivity, userRelationsActivity.getWindow().getDecorView());
    }

    @i1
    public UserRelationsActivity_ViewBinding(UserRelationsActivity userRelationsActivity, View view) {
        this.f80223b = userRelationsActivity;
        userRelationsActivity.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        userRelationsActivity.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27117, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UserRelationsActivity userRelationsActivity = this.f80223b;
        if (userRelationsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f80223b = null;
        userRelationsActivity.mRefreshLayout = null;
        userRelationsActivity.mRecyclerView = null;
    }
}
