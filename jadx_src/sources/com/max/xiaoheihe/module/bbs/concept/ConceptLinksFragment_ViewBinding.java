package com.max.xiaoheihe.module.bbs.concept;

import android.view.View;
import androidx.annotation.i;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.f;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes10.dex */
public class ConceptLinksFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConceptLinksFragment f81116b;

    @i1
    public ConceptLinksFragment_ViewBinding(ConceptLinksFragment conceptLinksFragment, View view) {
        this.f81116b = conceptLinksFragment;
        conceptLinksFragment.mRecyclerView = (RecyclerView) f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
        conceptLinksFragment.mRefreshLayout = (SmartRefreshLayout) f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        conceptLinksFragment.v_scroll_container_divier = f.e(view, R.id.v_scroll_container_divier, "field 'v_scroll_container_divier'");
        conceptLinksFragment.iv_write_post = f.e(view, R.id.iv_write_post, "field 'iv_write_post'");
        conceptLinksFragment.v_gradient = f.e(view, R.id.v_gradient, "field 'v_gradient'");
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28149, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ConceptLinksFragment conceptLinksFragment = this.f81116b;
        if (conceptLinksFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f81116b = null;
        conceptLinksFragment.mRecyclerView = null;
        conceptLinksFragment.mRefreshLayout = null;
        conceptLinksFragment.v_scroll_container_divier = null;
        conceptLinksFragment.iv_write_post = null;
        conceptLinksFragment.v_gradient = null;
    }
}
