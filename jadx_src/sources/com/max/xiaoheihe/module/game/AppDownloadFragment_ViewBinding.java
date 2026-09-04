package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class AppDownloadFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AppDownloadFragment f84035b;

    @androidx.annotation.i1
    public AppDownloadFragment_ViewBinding(AppDownloadFragment appDownloadFragment, View view) {
        this.f84035b = appDownloadFragment;
        appDownloadFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        appDownloadFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32224, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        AppDownloadFragment appDownloadFragment = this.f84035b;
        if (appDownloadFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84035b = null;
        appDownloadFragment.mRefreshLayout = null;
        appDownloadFragment.mRecyclerView = null;
    }
}
