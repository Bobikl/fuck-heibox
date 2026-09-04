package com.max.xiaoheihe.module.game;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.uc.crashsdk.export.LogType;

/* JADX INFO: loaded from: classes11.dex */
public class GameCenterActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameCenterActivity f84130b;

    @androidx.annotation.i1
    public GameCenterActivity_ViewBinding(GameCenterActivity gameCenterActivity) {
        this(gameCenterActivity, gameCenterActivity.getWindow().getDecorView());
    }

    @androidx.annotation.i1
    public GameCenterActivity_ViewBinding(GameCenterActivity gameCenterActivity, View view) {
        this.f84130b = gameCenterActivity;
        gameCenterActivity.rg_main = (RadioGroup) butterknife.internal.f.f(view, R.id.rg_main, "field 'rg_main'", RadioGroup.class);
        gameCenterActivity.rb_1 = (RadioButton) butterknife.internal.f.f(view, R.id.rb_1, "field 'rb_1'", RadioButton.class);
        gameCenterActivity.rb_2 = (RadioButton) butterknife.internal.f.f(view, R.id.rb_2, "field 'rb_2'", RadioButton.class);
        gameCenterActivity.rb_3 = (RadioButton) butterknife.internal.f.f(view, R.id.rb_3, "field 'rb_3'", RadioButton.class);
        gameCenterActivity.vg_fullscreen_video_container = (FrameLayout) butterknife.internal.f.f(view, R.id.vg_fullscreen_video_container, "field 'vg_fullscreen_video_container'", FrameLayout.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, LogType.UNEXP_ALL, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameCenterActivity gameCenterActivity = this.f84130b;
        if (gameCenterActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84130b = null;
        gameCenterActivity.rg_main = null;
        gameCenterActivity.rb_1 = null;
        gameCenterActivity.rb_2 = null;
        gameCenterActivity.rb_3 = null;
        gameCenterActivity.vg_fullscreen_video_container = null;
    }
}
