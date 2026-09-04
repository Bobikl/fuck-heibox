package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class GameRollPreviewFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameRollPreviewFragment f84734b;

    @androidx.annotation.i1
    public GameRollPreviewFragment_ViewBinding(GameRollPreviewFragment gameRollPreviewFragment, View view) {
        this.f84734b = gameRollPreviewFragment;
        gameRollPreviewFragment.mViewPager = (ViewPager) butterknife.internal.f.f(view, R.id.vp, "field 'mViewPager'", ViewPager.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33641, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameRollPreviewFragment gameRollPreviewFragment = this.f84734b;
        if (gameRollPreviewFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84734b = null;
        gameRollPreviewFragment.mViewPager = null;
    }
}
