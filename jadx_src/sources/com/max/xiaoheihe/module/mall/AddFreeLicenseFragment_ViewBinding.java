package com.max.xiaoheihe.module.mall;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.i1;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class AddFreeLicenseFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AddFreeLicenseFragment f89396b;

    @i1
    public AddFreeLicenseFragment_ViewBinding(AddFreeLicenseFragment addFreeLicenseFragment, View view) {
        this.f89396b = addFreeLicenseFragment;
        addFreeLicenseFragment.mConfirmView = butterknife.internal.f.e(view, R.id.vg_confirm, "field 'mConfirmView'");
        addFreeLicenseFragment.mConfirmTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_confirm, "field 'mConfirmTextView'", TextView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39788, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        AddFreeLicenseFragment addFreeLicenseFragment = this.f89396b;
        if (addFreeLicenseFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f89396b = null;
        addFreeLicenseFragment.mConfirmView = null;
        addFreeLicenseFragment.mConfirmTextView = null;
    }
}
