package com.max.mediaselector.lib.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;
import com.max.mediaselector.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: PictureLoadingDialog.java */
/* JADX INFO: loaded from: classes2.dex */
public class d extends Dialog {
    public static ChangeQuickRedirect changeQuickRedirect;

    public d(Context context) {
        super(context, R.style.Picture_Theme_AlertDialog);
        setCancelable(true);
        setCanceledOnTouchOutside(false);
    }

    private void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.wm, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setWindowAnimations(R.style.PictureThemeDialogWindowStyle);
        getWindow().setAttributes(attributes);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.l.vm, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.ps_alert_dialog);
        a();
    }
}
