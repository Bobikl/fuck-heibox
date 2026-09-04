package com.max.xiaoheihe.module.bbs;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes10.dex */
public class ChannelsNewsFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ChannelsNewsFragment f79739b;

    @i1
    public ChannelsNewsFragment_ViewBinding(ChannelsNewsFragment channelsNewsFragment, View view) {
        this.f79739b = channelsNewsFragment;
        channelsNewsFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        channelsNewsFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
        channelsNewsFragment.mUpdateTipsTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_update_tips, "field 'mUpdateTipsTextView'", TextView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26104, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ChannelsNewsFragment channelsNewsFragment = this.f79739b;
        if (channelsNewsFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f79739b = null;
        channelsNewsFragment.mRefreshLayout = null;
        channelsNewsFragment.mRecyclerView = null;
        channelsNewsFragment.mUpdateTipsTextView = null;
    }
}
