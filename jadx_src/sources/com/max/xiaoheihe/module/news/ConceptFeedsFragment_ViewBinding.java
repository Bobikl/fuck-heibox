package com.max.xiaoheihe.module.news;

import android.view.View;
import androidx.annotation.i;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes12.dex */
public class ConceptFeedsFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConceptFeedsFragment f91186b;

    @i1
    public ConceptFeedsFragment_ViewBinding(ConceptFeedsFragment conceptFeedsFragment, View view) {
        this.f91186b = conceptFeedsFragment;
        conceptFeedsFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
        conceptFeedsFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        conceptFeedsFragment.v_scroll_container_divier = butterknife.internal.f.e(view, R.id.v_scroll_container_divier, "field 'v_scroll_container_divier'");
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42401, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ConceptFeedsFragment conceptFeedsFragment = this.f91186b;
        if (conceptFeedsFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f91186b = null;
        conceptFeedsFragment.mRecyclerView = null;
        conceptFeedsFragment.mRefreshLayout = null;
        conceptFeedsFragment.v_scroll_container_divier = null;
    }
}
