package com.max.xiaoheihe.module.account;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.i1;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes9.dex */
public class ChangePhoneBindActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ChangePhoneBindActivity f77585b;

    @i1
    public ChangePhoneBindActivity_ViewBinding(ChangePhoneBindActivity changePhoneBindActivity) {
        this(changePhoneBindActivity, changePhoneBindActivity.getWindow().getDecorView());
    }

    @i1
    public ChangePhoneBindActivity_ViewBinding(ChangePhoneBindActivity changePhoneBindActivity, View view) {
        this.f77585b = changePhoneBindActivity;
        changePhoneBindActivity.tvCurrentAccount = (TextView) butterknife.internal.f.f(view, R.id.tv_current_account, "field 'tvCurrentAccount'", TextView.class);
        changePhoneBindActivity.textView = (TextView) butterknife.internal.f.f(view, R.id.textView, "field 'textView'", TextView.class);
        changePhoneBindActivity.vgCurrentAccount = (RelativeLayout) butterknife.internal.f.f(view, R.id.vg_current_account, "field 'vgCurrentAccount'", RelativeLayout.class);
        changePhoneBindActivity.etNew = (EditText) butterknife.internal.f.f(view, R.id.et_new, "field 'etNew'", EditText.class);
        changePhoneBindActivity.vgNewPhone = (LinearLayout) butterknife.internal.f.f(view, R.id.vg_new_phone, "field 'vgNewPhone'", LinearLayout.class);
        changePhoneBindActivity.etCode = (EditText) butterknife.internal.f.f(view, R.id.et_code, "field 'etCode'", EditText.class);
        changePhoneBindActivity.tvGetCode = (TextView) butterknife.internal.f.f(view, R.id.tv_get_code, "field 'tvGetCode'", TextView.class);
        changePhoneBindActivity.llNumber = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_number, "field 'llNumber'", LinearLayout.class);
        changePhoneBindActivity.tvFinish = (TextView) butterknife.internal.f.f(view, R.id.tv_finish, "field 'tvFinish'", TextView.class);
        changePhoneBindActivity.tvAreaCode = (TextView) butterknife.internal.f.f(view, R.id.tv_area_code, "field 'tvAreaCode'", TextView.class);
        changePhoneBindActivity.vgAreaCode = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_area_code, "field 'vgAreaCode'", ViewGroup.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22615, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ChangePhoneBindActivity changePhoneBindActivity = this.f77585b;
        if (changePhoneBindActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f77585b = null;
        changePhoneBindActivity.tvCurrentAccount = null;
        changePhoneBindActivity.textView = null;
        changePhoneBindActivity.vgCurrentAccount = null;
        changePhoneBindActivity.etNew = null;
        changePhoneBindActivity.vgNewPhone = null;
        changePhoneBindActivity.etCode = null;
        changePhoneBindActivity.tvGetCode = null;
        changePhoneBindActivity.llNumber = null;
        changePhoneBindActivity.tvFinish = null;
        changePhoneBindActivity.tvAreaCode = null;
        changePhoneBindActivity.vgAreaCode = null;
    }
}
