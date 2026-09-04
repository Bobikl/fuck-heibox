package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class AppMgrActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AppMgrActivity f84051b;

    @androidx.annotation.i1
    public AppMgrActivity_ViewBinding(AppMgrActivity appMgrActivity) {
        this(appMgrActivity, appMgrActivity.getWindow().getDecorView());
    }

    @androidx.annotation.i1
    public AppMgrActivity_ViewBinding(AppMgrActivity appMgrActivity, View view) {
        this.f84051b = appMgrActivity;
        appMgrActivity.mViewPager = (ViewPager) butterknife.internal.f.f(view, R.id.vp, "field 'mViewPager'", ViewPager.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32262, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        AppMgrActivity appMgrActivity = this.f84051b;
        if (appMgrActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84051b = null;
        appMgrActivity.mViewPager = null;
    }
}
