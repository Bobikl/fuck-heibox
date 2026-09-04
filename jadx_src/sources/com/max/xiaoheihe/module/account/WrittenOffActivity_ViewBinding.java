package com.max.xiaoheihe.module.account;

import android.view.View;
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
public class WrittenOffActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WrittenOffActivity f78711b;

    @i1
    public WrittenOffActivity_ViewBinding(WrittenOffActivity writtenOffActivity) {
        this(writtenOffActivity, writtenOffActivity.getWindow().getDecorView());
    }

    @i1
    public WrittenOffActivity_ViewBinding(WrittenOffActivity writtenOffActivity, View view) {
        this.f78711b = writtenOffActivity;
        writtenOffActivity.tvCurrentAccount = (TextView) butterknife.internal.f.f(view, R.id.tv_current_account, "field 'tvCurrentAccount'", TextView.class);
        writtenOffActivity.textView = (TextView) butterknife.internal.f.f(view, R.id.textView, "field 'textView'", TextView.class);
        writtenOffActivity.vgCurrentAccount = (RelativeLayout) butterknife.internal.f.f(view, R.id.vg_current_account, "field 'vgCurrentAccount'", RelativeLayout.class);
        writtenOffActivity.etNew = (EditText) butterknife.internal.f.f(view, R.id.et_new, "field 'etNew'", EditText.class);
        writtenOffActivity.vgNewPhone = (LinearLayout) butterknife.internal.f.f(view, R.id.vg_new_phone, "field 'vgNewPhone'", LinearLayout.class);
        writtenOffActivity.etCode = (EditText) butterknife.internal.f.f(view, R.id.et_code, "field 'etCode'", EditText.class);
        writtenOffActivity.tvGetCode = (TextView) butterknife.internal.f.f(view, R.id.tv_get_code, "field 'tvGetCode'", TextView.class);
        writtenOffActivity.llNumber = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_number, "field 'llNumber'", LinearLayout.class);
        writtenOffActivity.tvFinish = (TextView) butterknife.internal.f.f(view, R.id.tv_finish, "field 'tvFinish'", TextView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24748, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WrittenOffActivity writtenOffActivity = this.f78711b;
        if (writtenOffActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f78711b = null;
        writtenOffActivity.tvCurrentAccount = null;
        writtenOffActivity.textView = null;
        writtenOffActivity.vgCurrentAccount = null;
        writtenOffActivity.etNew = null;
        writtenOffActivity.vgNewPhone = null;
        writtenOffActivity.etCode = null;
        writtenOffActivity.tvGetCode = null;
        writtenOffActivity.llNumber = null;
        writtenOffActivity.tvFinish = null;
    }
}
