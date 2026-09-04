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
public class AddAtUserFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AddAtUserFragment f79551b;

    @i1
    public AddAtUserFragment_ViewBinding(AddAtUserFragment addAtUserFragment, View view) {
        this.f79551b = addAtUserFragment;
        addAtUserFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        addAtUserFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
        addAtUserFragment.rv_empty_view = butterknife.internal.f.e(view, R.id.rv_empty_view, "field 'rv_empty_view'");
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25748, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        AddAtUserFragment addAtUserFragment = this.f79551b;
        if (addAtUserFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f79551b = null;
        addAtUserFragment.mRefreshLayout = null;
        addAtUserFragment.mRecyclerView = null;
        addAtUserFragment.rv_empty_view = null;
    }
}
