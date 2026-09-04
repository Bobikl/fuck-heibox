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
public class SubjectListFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SubjectListFragment f91269b;

    @i1
    public SubjectListFragment_ViewBinding(SubjectListFragment subjectListFragment, View view) {
        this.f91269b = subjectListFragment;
        subjectListFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        subjectListFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42556, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SubjectListFragment subjectListFragment = this.f91269b;
        if (subjectListFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f91269b = null;
        subjectListFragment.mRefreshLayout = null;
        subjectListFragment.mRecyclerView = null;
    }
}
