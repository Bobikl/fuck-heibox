package com.max.xiaoheihe.module.chat;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.i;
import androidx.annotation.i1;
import butterknife.Unbinder;
import butterknife.internal.f;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes10.dex */
public class StrangerMsgSettingActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StrangerMsgSettingActivity f83532b;

    @i1
    public StrangerMsgSettingActivity_ViewBinding(StrangerMsgSettingActivity strangerMsgSettingActivity) {
        this(strangerMsgSettingActivity, strangerMsgSettingActivity.getWindow().getDecorView());
    }

    @i1
    public StrangerMsgSettingActivity_ViewBinding(StrangerMsgSettingActivity strangerMsgSettingActivity, View view) {
        this.f83532b = strangerMsgSettingActivity;
        strangerMsgSettingActivity.tvLevel = (TextView) f.f(view, R.id.tv_level, "field 'tvLevel'", TextView.class);
        strangerMsgSettingActivity.rlMsgLevel = (RelativeLayout) f.f(view, R.id.rl_msg_level, "field 'rlMsgLevel'", RelativeLayout.class);
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31418, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        StrangerMsgSettingActivity strangerMsgSettingActivity = this.f83532b;
        if (strangerMsgSettingActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f83532b = null;
        strangerMsgSettingActivity.tvLevel = null;
        strangerMsgSettingActivity.rlMsgLevel = null;
    }
}
