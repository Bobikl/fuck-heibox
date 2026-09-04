package com.max.xiaoheihe.module.account;

import android.view.View;
import androidx.annotation.i1;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes9.dex */
public class FollowingAndFansActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FollowingAndFansActivity f77739b;

    @i1
    public FollowingAndFansActivity_ViewBinding(FollowingAndFansActivity followingAndFansActivity) {
        this(followingAndFansActivity, followingAndFansActivity.getWindow().getDecorView());
    }

    @i1
    public FollowingAndFansActivity_ViewBinding(FollowingAndFansActivity followingAndFansActivity, View view) {
        this.f77739b = followingAndFansActivity;
        followingAndFansActivity.vp = (ViewPager) butterknife.internal.f.f(view, R.id.vp, "field 'vp'", ViewPager.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22842, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FollowingAndFansActivity followingAndFansActivity = this.f77739b;
        if (followingAndFansActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f77739b = null;
        followingAndFansActivity.vp = null;
    }
}
