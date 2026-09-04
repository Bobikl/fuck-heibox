package com.max.xiaoheihe.module.account;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.i1;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import butterknife.Unbinder;
import com.max.hbcustomview.PinEntryEditText;
import com.max.hbview.AutoOffsettingBackgroundLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes9.dex */
public class RegisterOrLoginActivityV2_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RegisterOrLoginActivityV2 f78295b;

    @i1
    public RegisterOrLoginActivityV2_ViewBinding(RegisterOrLoginActivityV2 registerOrLoginActivityV2) {
        this(registerOrLoginActivityV2, registerOrLoginActivityV2.getWindow().getDecorView());
    }

    @i1
    public RegisterOrLoginActivityV2_ViewBinding(RegisterOrLoginActivityV2 registerOrLoginActivityV2, View view) {
        this.f78295b = registerOrLoginActivityV2;
        registerOrLoginActivityV2.ibIconBack = (ImageView) butterknife.internal.f.f(view, R.id.ib_icon_back, "field 'ibIconBack'", ImageView.class);
        registerOrLoginActivityV2.tvTitle = (TextView) butterknife.internal.f.f(view, R.id.tv_title, "field 'tvTitle'", TextView.class);
        registerOrLoginActivityV2.etNumber = (EditText) butterknife.internal.f.f(view, R.id.et_number, "field 'etNumber'", EditText.class);
        registerOrLoginActivityV2.tvNumber = (TextView) butterknife.internal.f.f(view, R.id.tv_number, "field 'tvNumber'", TextView.class);
        registerOrLoginActivityV2.etPwd = (EditText) butterknife.internal.f.f(view, R.id.et_pwd, "field 'etPwd'", EditText.class);
        registerOrLoginActivityV2.tvAction = (TextView) butterknife.internal.f.f(view, R.id.tv_action, "field 'tvAction'", TextView.class);
        registerOrLoginActivityV2.tvPrivacy = (TextView) butterknife.internal.f.f(view, R.id.tv_privacy, "field 'tvPrivacy'", TextView.class);
        registerOrLoginActivityV2.vg_privacy = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_privacy, "field 'vg_privacy'", ViewGroup.class);
        registerOrLoginActivityV2.cb_privacy = (CheckBox) butterknife.internal.f.f(view, R.id.cb_privacy, "field 'cb_privacy'", CheckBox.class);
        registerOrLoginActivityV2.iv_tips_privacy = (ImageView) butterknife.internal.f.f(view, R.id.iv_tips_privacy, "field 'iv_tips_privacy'", ImageView.class);
        registerOrLoginActivityV2.vg_privacy_check = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_privacy_check, "field 'vg_privacy_check'", ViewGroup.class);
        registerOrLoginActivityV2.tvWechatLogin = (TextView) butterknife.internal.f.f(view, R.id.tv_wechat_login, "field 'tvWechatLogin'", TextView.class);
        registerOrLoginActivityV2.clRoot = (ConstraintLayout) butterknife.internal.f.f(view, R.id.cl_root, "field 'clRoot'", ConstraintLayout.class);
        registerOrLoginActivityV2.petVerificationCode = (PinEntryEditText) butterknife.internal.f.f(view, R.id.pet_verification_code, "field 'petVerificationCode'", PinEntryEditText.class);
        registerOrLoginActivityV2.tvAreaCode = (TextView) butterknife.internal.f.f(view, R.id.tv_area_code, "field 'tvAreaCode'", TextView.class);
        registerOrLoginActivityV2.ivAreaCodeArrow = (ImageView) butterknife.internal.f.f(view, R.id.iv_area_code_arrow, "field 'ivAreaCodeArrow'", ImageView.class);
        registerOrLoginActivityV2.vgAreaCode = (LinearLayout) butterknife.internal.f.f(view, R.id.vg_area_code, "field 'vgAreaCode'", LinearLayout.class);
        registerOrLoginActivityV2.vEtLine = butterknife.internal.f.e(view, R.id.v_et_line, "field 'vEtLine'");
        registerOrLoginActivityV2.vInviteLine = butterknife.internal.f.e(view, R.id.v_invite_line, "field 'vInviteLine'");
        registerOrLoginActivityV2.ivDel = (ImageView) butterknife.internal.f.f(view, R.id.iv_del, "field 'ivDel'", ImageView.class);
        registerOrLoginActivityV2.tvForgetPwd = (TextView) butterknife.internal.f.f(view, R.id.tv_forget_pwd, "field 'tvForgetPwd'", TextView.class);
        registerOrLoginActivityV2.tvToggleLogin = (TextView) butterknife.internal.f.f(view, R.id.tv_toggle_login, "field 'tvToggleLogin'", TextView.class);
        registerOrLoginActivityV2.tvErrorMsg = (TextView) butterknife.internal.f.f(view, R.id.tv_error_message, "field 'tvErrorMsg'", TextView.class);
        registerOrLoginActivityV2.lineEtTop = (Guideline) butterknife.internal.f.f(view, R.id.line_et_top, "field 'lineEtTop'", Guideline.class);
        registerOrLoginActivityV2.lineEtBottom = (Guideline) butterknife.internal.f.f(view, R.id.line_et_bottom, "field 'lineEtBottom'", Guideline.class);
        registerOrLoginActivityV2.line_et_number_bottom = (Guideline) butterknife.internal.f.f(view, R.id.line_et_number_bottom, "field 'line_et_number_bottom'", Guideline.class);
        registerOrLoginActivityV2.line_et_number_right = (Guideline) butterknife.internal.f.f(view, R.id.line_et_number_right, "field 'line_et_number_right'", Guideline.class);
        registerOrLoginActivityV2.etInviteCode = (EditText) butterknife.internal.f.f(view, R.id.et_invite_code, "field 'etInviteCode'", EditText.class);
        registerOrLoginActivityV2.groupInviteCode = (Group) butterknife.internal.f.f(view, R.id.group_invite_code, "field 'groupInviteCode'", Group.class);
        registerOrLoginActivityV2.ivBottomLogo = (ImageView) butterknife.internal.f.f(view, R.id.iv_bottom_logo, "field 'ivBottomLogo'", ImageView.class);
        registerOrLoginActivityV2.vg_login_way = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_login_way, "field 'vg_login_way'", ViewGroup.class);
        registerOrLoginActivityV2.vg_login_by_max = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_login_by_max, "field 'vg_login_by_max'", ViewGroup.class);
        registerOrLoginActivityV2.vg_login_by_wx = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_login_by_wx, "field 'vg_login_by_wx'", ViewGroup.class);
        registerOrLoginActivityV2.mask_background = butterknife.internal.f.e(view, R.id.mask_background, "field 'mask_background'");
        registerOrLoginActivityV2.auto_offset_background = (AutoOffsettingBackgroundLayout) butterknife.internal.f.f(view, R.id.auto_offset_background, "field 'auto_offset_background'", AutoOffsettingBackgroundLayout.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23987, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        RegisterOrLoginActivityV2 registerOrLoginActivityV2 = this.f78295b;
        if (registerOrLoginActivityV2 == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f78295b = null;
        registerOrLoginActivityV2.ibIconBack = null;
        registerOrLoginActivityV2.tvTitle = null;
        registerOrLoginActivityV2.etNumber = null;
        registerOrLoginActivityV2.tvNumber = null;
        registerOrLoginActivityV2.etPwd = null;
        registerOrLoginActivityV2.tvAction = null;
        registerOrLoginActivityV2.tvPrivacy = null;
        registerOrLoginActivityV2.vg_privacy = null;
        registerOrLoginActivityV2.cb_privacy = null;
        registerOrLoginActivityV2.iv_tips_privacy = null;
        registerOrLoginActivityV2.vg_privacy_check = null;
        registerOrLoginActivityV2.tvWechatLogin = null;
        registerOrLoginActivityV2.clRoot = null;
        registerOrLoginActivityV2.petVerificationCode = null;
        registerOrLoginActivityV2.tvAreaCode = null;
        registerOrLoginActivityV2.ivAreaCodeArrow = null;
        registerOrLoginActivityV2.vgAreaCode = null;
        registerOrLoginActivityV2.vEtLine = null;
        registerOrLoginActivityV2.vInviteLine = null;
        registerOrLoginActivityV2.ivDel = null;
        registerOrLoginActivityV2.tvForgetPwd = null;
        registerOrLoginActivityV2.tvToggleLogin = null;
        registerOrLoginActivityV2.tvErrorMsg = null;
        registerOrLoginActivityV2.lineEtTop = null;
        registerOrLoginActivityV2.lineEtBottom = null;
        registerOrLoginActivityV2.line_et_number_bottom = null;
        registerOrLoginActivityV2.line_et_number_right = null;
        registerOrLoginActivityV2.etInviteCode = null;
        registerOrLoginActivityV2.groupInviteCode = null;
        registerOrLoginActivityV2.ivBottomLogo = null;
        registerOrLoginActivityV2.vg_login_way = null;
        registerOrLoginActivityV2.vg_login_by_max = null;
        registerOrLoginActivityV2.vg_login_by_wx = null;
        registerOrLoginActivityV2.mask_background = null;
        registerOrLoginActivityV2.auto_offset_background = null;
    }
}
