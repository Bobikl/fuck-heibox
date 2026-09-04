package com.max.xiaoheihe.module.account;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.i1;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes9.dex */
public class BindPhoneActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BindPhoneActivity f77530b;

    @i1
    public BindPhoneActivity_ViewBinding(BindPhoneActivity bindPhoneActivity) {
        this(bindPhoneActivity, bindPhoneActivity.getWindow().getDecorView());
    }

    @i1
    public BindPhoneActivity_ViewBinding(BindPhoneActivity bindPhoneActivity, View view) {
        this.f77530b = bindPhoneActivity;
        bindPhoneActivity.etPhone = (EditText) butterknife.internal.f.f(view, R.id.et_phone, "field 'etPhone'", EditText.class);
        bindPhoneActivity.etPwd = (EditText) butterknife.internal.f.f(view, R.id.et_pwd, "field 'etPwd'", EditText.class);
        bindPhoneActivity.etConfirm = (EditText) butterknife.internal.f.f(view, R.id.et_confirm, "field 'etConfirm'", EditText.class);
        bindPhoneActivity.etCode = (EditText) butterknife.internal.f.f(view, R.id.et_code, "field 'etCode'", EditText.class);
        bindPhoneActivity.tvGetCode = (TextView) butterknife.internal.f.f(view, R.id.tv_get_code, "field 'tvGetCode'", TextView.class);
        bindPhoneActivity.tvFinish = (TextView) butterknife.internal.f.f(view, R.id.tv_finish, "field 'tvFinish'", TextView.class);
        bindPhoneActivity.tvAreaCode = (TextView) butterknife.internal.f.f(view, R.id.tv_area_code, "field 'tvAreaCode'", TextView.class);
        bindPhoneActivity.vgAreaCode = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_area_code, "field 'vgAreaCode'", ViewGroup.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22513, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BindPhoneActivity bindPhoneActivity = this.f77530b;
        if (bindPhoneActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f77530b = null;
        bindPhoneActivity.etPhone = null;
        bindPhoneActivity.etPwd = null;
        bindPhoneActivity.etConfirm = null;
        bindPhoneActivity.etCode = null;
        bindPhoneActivity.tvGetCode = null;
        bindPhoneActivity.tvFinish = null;
        bindPhoneActivity.tvAreaCode = null;
        bindPhoneActivity.vgAreaCode = null;
    }
}
