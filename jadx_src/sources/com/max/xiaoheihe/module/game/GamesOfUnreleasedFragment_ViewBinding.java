package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class GamesOfUnreleasedFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GamesOfUnreleasedFragment f85292b;

    @androidx.annotation.i1
    public GamesOfUnreleasedFragment_ViewBinding(GamesOfUnreleasedFragment gamesOfUnreleasedFragment, View view) {
        this.f85292b = gamesOfUnreleasedFragment;
        gamesOfUnreleasedFragment.mViewPager = (ViewPager) butterknife.internal.f.f(view, R.id.vp, "field 'mViewPager'", ViewPager.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34950, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GamesOfUnreleasedFragment gamesOfUnreleasedFragment = this.f85292b;
        if (gamesOfUnreleasedFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f85292b = null;
        gamesOfUnreleasedFragment.mViewPager = null;
    }
}
