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
public class LinkMomentsActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinkMomentsActivity f80016b;

    @i1
    public LinkMomentsActivity_ViewBinding(LinkMomentsActivity linkMomentsActivity) {
        this(linkMomentsActivity, linkMomentsActivity.getWindow().getDecorView());
    }

    @i1
    public LinkMomentsActivity_ViewBinding(LinkMomentsActivity linkMomentsActivity, View view) {
        this.f80016b = linkMomentsActivity;
        linkMomentsActivity.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        linkMomentsActivity.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26722, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinkMomentsActivity linkMomentsActivity = this.f80016b;
        if (linkMomentsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f80016b = null;
        linkMomentsActivity.mRefreshLayout = null;
        linkMomentsActivity.mRecyclerView = null;
    }
}
