package com.max.xiaoheihe.module.game;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class GetGameFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GetGameFragment f85328b;

    @androidx.annotation.i1
    public GetGameFragment_ViewBinding(GetGameFragment getGameFragment, View view) {
        this.f85328b = getGameFragment;
        getGameFragment.mRemindBubble = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_remind_bubble, "field 'mRemindBubble'", LinearLayout.class);
        getGameFragment.mConfirmView = (BottomButtonLeftItemView) butterknife.internal.f.f(view, R.id.ll_bottom_bar, "field 'mConfirmView'", BottomButtonLeftItemView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35010, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GetGameFragment getGameFragment = this.f85328b;
        if (getGameFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f85328b = null;
        getGameFragment.mRemindBubble = null;
        getGameFragment.mConfirmView = null;
    }
}
