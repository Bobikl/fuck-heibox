package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class AppInstalledFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AppInstalledFragment f84049b;

    @androidx.annotation.i1
    public AppInstalledFragment_ViewBinding(AppInstalledFragment appInstalledFragment, View view) {
        this.f84049b = appInstalledFragment;
        appInstalledFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        appInstalledFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32258, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        AppInstalledFragment appInstalledFragment = this.f84049b;
        if (appInstalledFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84049b = null;
        appInstalledFragment.mRefreshLayout = null;
        appInstalledFragment.mRecyclerView = null;
    }
}
