package com.max.xiaoheihe.module.account;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.i1;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes9.dex */
public class GameBindingFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameBindingFragment f77926b;

    @i1
    public GameBindingFragment_ViewBinding(GameBindingFragment gameBindingFragment, View view) {
        this.f77926b = gameBindingFragment;
        gameBindingFragment.mBindGamesCardView = butterknife.internal.f.e(view, R.id.card_bind_card_games, "field 'mBindGamesCardView'");
        gameBindingFragment.mBindingTabLinearLayout = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_binding_tab, "field 'mBindingTabLinearLayout'", LinearLayout.class);
        gameBindingFragment.mBindingContainerFrameLayout = (FrameLayout) butterknife.internal.f.f(view, R.id.fl_binding_container, "field 'mBindingContainerFrameLayout'", FrameLayout.class);
        gameBindingFragment.mBindCardView = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_bind_card, "field 'mBindCardView'", ViewGroup.class);
        gameBindingFragment.llGameBinding = (ViewGroup) butterknife.internal.f.f(view, R.id.ll_game_binding, "field 'llGameBinding'", ViewGroup.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23134, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameBindingFragment gameBindingFragment = this.f77926b;
        if (gameBindingFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f77926b = null;
        gameBindingFragment.mBindGamesCardView = null;
        gameBindingFragment.mBindingTabLinearLayout = null;
        gameBindingFragment.mBindingContainerFrameLayout = null;
        gameBindingFragment.mBindCardView = null;
        gameBindingFragment.llGameBinding = null;
    }
}
