package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class GameMobileFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameMobileFragment f84496b;

    @androidx.annotation.i1
    public GameMobileFragment_ViewBinding(GameMobileFragment gameMobileFragment, View view) {
        this.f84496b = gameMobileFragment;
        gameMobileFragment.mViewPager = (ViewPager) butterknife.internal.f.f(view, R.id.vp, "field 'mViewPager'", ViewPager.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33224, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameMobileFragment gameMobileFragment = this.f84496b;
        if (gameMobileFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84496b = null;
        gameMobileFragment.mViewPager = null;
    }
}
