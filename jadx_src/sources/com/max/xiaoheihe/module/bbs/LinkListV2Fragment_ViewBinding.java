package com.max.xiaoheihe.module.bbs;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes10.dex */
public class LinkListV2Fragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinkListV2Fragment f80013b;

    @i1
    public LinkListV2Fragment_ViewBinding(LinkListV2Fragment linkListV2Fragment, View view) {
        this.f80013b = linkListV2Fragment;
        linkListV2Fragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        linkListV2Fragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
        linkListV2Fragment.mWritePostImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_write_post, "field 'mWritePostImageView'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26707, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinkListV2Fragment linkListV2Fragment = this.f80013b;
        if (linkListV2Fragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f80013b = null;
        linkListV2Fragment.mRefreshLayout = null;
        linkListV2Fragment.mRecyclerView = null;
        linkListV2Fragment.mWritePostImageView = null;
    }
}
