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
public class BansSettingsActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BansSettingsActivity f77519b;

    @i1
    public BansSettingsActivity_ViewBinding(BansSettingsActivity bansSettingsActivity) {
        this(bansSettingsActivity, bansSettingsActivity.getWindow().getDecorView());
    }

    @i1
    public BansSettingsActivity_ViewBinding(BansSettingsActivity bansSettingsActivity, View view) {
        this.f77519b = bansSettingsActivity;
        bansSettingsActivity.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        bansSettingsActivity.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22483, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BansSettingsActivity bansSettingsActivity = this.f77519b;
        if (bansSettingsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f77519b = null;
        bansSettingsActivity.mRefreshLayout = null;
        bansSettingsActivity.mRecyclerView = null;
    }
}
