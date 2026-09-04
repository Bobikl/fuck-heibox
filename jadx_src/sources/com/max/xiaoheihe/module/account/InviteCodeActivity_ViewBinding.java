package com.max.xiaoheihe.module.account;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.i1;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes9.dex */
public class InviteCodeActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InviteCodeActivity f77982b;

    @i1
    public InviteCodeActivity_ViewBinding(InviteCodeActivity inviteCodeActivity) {
        this(inviteCodeActivity, inviteCodeActivity.getWindow().getDecorView());
    }

    @i1
    public InviteCodeActivity_ViewBinding(InviteCodeActivity inviteCodeActivity, View view) {
        this.f77982b = inviteCodeActivity;
        inviteCodeActivity.ibIconBack = (ImageView) butterknife.internal.f.f(view, R.id.ib_icon_back, "field 'ibIconBack'", ImageView.class);
        inviteCodeActivity.tvSkip = (TextView) butterknife.internal.f.f(view, R.id.tv_skip, "field 'tvSkip'", TextView.class);
        inviteCodeActivity.tvNumber = (TextView) butterknife.internal.f.f(view, R.id.tv_number, "field 'tvNumber'", TextView.class);
        inviteCodeActivity.tvRules = (TextView) butterknife.internal.f.f(view, R.id.tv_rules, "field 'tvRules'", TextView.class);
        inviteCodeActivity.tvAction = (TextView) butterknife.internal.f.f(view, R.id.tv_action, "field 'tvAction'", TextView.class);
        inviteCodeActivity.ivDel = (ImageView) butterknife.internal.f.f(view, R.id.iv_del, "field 'ivDel'", ImageView.class);
        inviteCodeActivity.tvErrorMsg = (TextView) butterknife.internal.f.f(view, R.id.tv_error_message, "field 'tvErrorMsg'", TextView.class);
        inviteCodeActivity.etInviteCode = (EditText) butterknife.internal.f.f(view, R.id.et_invite_code, "field 'etInviteCode'", EditText.class);
        inviteCodeActivity.vg_bg = (LinearLayout) butterknife.internal.f.f(view, R.id.vg_bg, "field 'vg_bg'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23250, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        InviteCodeActivity inviteCodeActivity = this.f77982b;
        if (inviteCodeActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f77982b = null;
        inviteCodeActivity.ibIconBack = null;
        inviteCodeActivity.tvSkip = null;
        inviteCodeActivity.tvNumber = null;
        inviteCodeActivity.tvRules = null;
        inviteCodeActivity.tvAction = null;
        inviteCodeActivity.ivDel = null;
        inviteCodeActivity.tvErrorMsg = null;
        inviteCodeActivity.etInviteCode = null;
        inviteCodeActivity.vg_bg = null;
    }
}
