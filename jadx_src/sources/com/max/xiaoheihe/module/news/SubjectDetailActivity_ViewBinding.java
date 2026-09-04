package com.max.xiaoheihe.module.news;

import android.view.View;
import androidx.annotation.i;
import androidx.annotation.i1;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes12.dex */
public class SubjectDetailActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SubjectDetailActivity f91257b;

    @i1
    public SubjectDetailActivity_ViewBinding(SubjectDetailActivity subjectDetailActivity) {
        this(subjectDetailActivity, subjectDetailActivity.getWindow().getDecorView());
    }

    @i1
    public SubjectDetailActivity_ViewBinding(SubjectDetailActivity subjectDetailActivity, View view) {
        this.f91257b = subjectDetailActivity;
        subjectDetailActivity.tabSubject = (SlidingTabLayout) butterknife.internal.f.f(view, R.id.tab, "field 'tabSubject'", SlidingTabLayout.class);
        subjectDetailActivity.vpComponent = (ViewPager) butterknife.internal.f.f(view, R.id.vp, "field 'vpComponent'", ViewPager.class);
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42535, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SubjectDetailActivity subjectDetailActivity = this.f91257b;
        if (subjectDetailActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f91257b = null;
        subjectDetailActivity.tabSubject = null;
        subjectDetailActivity.vpComponent = null;
    }
}
