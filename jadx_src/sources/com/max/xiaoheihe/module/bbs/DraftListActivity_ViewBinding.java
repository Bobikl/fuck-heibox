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
public class DraftListActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DraftListActivity f79788b;

    @i1
    public DraftListActivity_ViewBinding(DraftListActivity draftListActivity) {
        this(draftListActivity, draftListActivity.getWindow().getDecorView());
    }

    @i1
    public DraftListActivity_ViewBinding(DraftListActivity draftListActivity, View view) {
        this.f79788b = draftListActivity;
        draftListActivity.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
        draftListActivity.mSmartRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mSmartRefreshLayout'", SmartRefreshLayout.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26240, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        DraftListActivity draftListActivity = this.f79788b;
        if (draftListActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f79788b = null;
        draftListActivity.mRecyclerView = null;
        draftListActivity.mSmartRefreshLayout = null;
    }
}
