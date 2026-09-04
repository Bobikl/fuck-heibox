package com.max.xiaoheihe.module.news;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.p0;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes12.dex */
public class SubjectListActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    private SubjectListFragment L;

    public static Intent M1(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 42536, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) SubjectListActivity.class);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42537, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        this.f66616q.a0();
        this.f66616q.setTitle("新闻专题");
        SubjectListFragment subjectListFragmentV3 = SubjectListFragment.V3();
        this.L = subjectListFragmentV3;
        subjectListFragmentV3.setMenuVisibility(true);
        this.L.setUserVisibleHint(true);
        p0 p0VarU = getSupportFragmentManager().u();
        p0VarU.y(R.id.fragment_container, this.L);
        p0VarU.m();
    }
}
