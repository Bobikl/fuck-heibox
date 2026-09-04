package com.max.xiaoheihe.module.bbs;

import android.view.View;
import androidx.annotation.i1;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes10.dex */
public class AddAtUserActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AddAtUserActivity f79521b;

    @i1
    public AddAtUserActivity_ViewBinding(AddAtUserActivity addAtUserActivity) {
        this(addAtUserActivity, addAtUserActivity.getWindow().getDecorView());
    }

    @i1
    public AddAtUserActivity_ViewBinding(AddAtUserActivity addAtUserActivity, View view) {
        this.f79521b = addAtUserActivity;
        addAtUserActivity.vp = (ViewPager) butterknife.internal.f.f(view, R.id.vp, "field 'vp'", ViewPager.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25703, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        AddAtUserActivity addAtUserActivity = this.f79521b;
        if (addAtUserActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f79521b = null;
        addAtUserActivity.vp = null;
    }
}
