package com.max.xiaoheihe.module.game;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbcommon.component.segmentfilters.SecondaryWindowSegmentFilterView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class GameBundlesActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameBundlesActivity f84128b;

    @androidx.annotation.i1
    public GameBundlesActivity_ViewBinding(GameBundlesActivity gameBundlesActivity) {
        this(gameBundlesActivity, gameBundlesActivity.getWindow().getDecorView());
    }

    @androidx.annotation.i1
    public GameBundlesActivity_ViewBinding(GameBundlesActivity gameBundlesActivity, View view) {
        this.f84128b = gameBundlesActivity;
        gameBundlesActivity.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        gameBundlesActivity.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
        gameBundlesActivity.fbv_filter = (FilterButtonView) butterknife.internal.f.f(view, R.id.fbv_filter, "field 'fbv_filter'", FilterButtonView.class);
        gameBundlesActivity.secondary_filter = (SecondaryWindowSegmentFilterView) butterknife.internal.f.f(view, R.id.secondary_filter, "field 'secondary_filter'", SecondaryWindowSegmentFilterView.class);
        gameBundlesActivity.vg_header = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_header, "field 'vg_header'", ViewGroup.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32501, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameBundlesActivity gameBundlesActivity = this.f84128b;
        if (gameBundlesActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84128b = null;
        gameBundlesActivity.mRefreshLayout = null;
        gameBundlesActivity.mRecyclerView = null;
        gameBundlesActivity.fbv_filter = null;
        gameBundlesActivity.secondary_filter = null;
        gameBundlesActivity.vg_header = null;
    }
}
