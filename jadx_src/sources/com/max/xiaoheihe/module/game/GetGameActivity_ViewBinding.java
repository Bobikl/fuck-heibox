package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class GetGameActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GetGameActivity f85294b;

    @androidx.annotation.i1
    public GetGameActivity_ViewBinding(GetGameActivity getGameActivity) {
        this(getGameActivity, getGameActivity.getWindow().getDecorView());
    }

    @androidx.annotation.i1
    public GetGameActivity_ViewBinding(GetGameActivity getGameActivity, View view) {
        this.f85294b = getGameActivity;
        getGameActivity.mViewPager = (ViewPager) butterknife.internal.f.f(view, R.id.vp, "field 'mViewPager'", ViewPager.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34954, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GetGameActivity getGameActivity = this.f85294b;
        if (getGameActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f85294b = null;
        getGameActivity.mViewPager = null;
    }
}
