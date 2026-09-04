package com.max.mediaselector.lib.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.max.mediaselector.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: RemindDialog.java */
/* JADX INFO: loaded from: classes2.dex */
public class e extends Dialog implements View.OnClickListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    public e(Context context, String str) {
        super(context, R.style.Picture_Theme_Dialog);
        setContentView(R.layout.ps_remind_dialog);
        TextView textView = (TextView) findViewById(R.id.btnOk);
        ((TextView) findViewById(R.id.tv_content)).setText(str);
        textView.setOnClickListener(this);
        a();
    }

    private void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.ym, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setWindowAnimations(R.style.PictureThemeDialogWindowStyle);
        getWindow().setAttributes(attributes);
    }

    public static Dialog b(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.l.xm, new Class[]{Context.class, String.class}, Dialog.class);
        return patchProxyResultProxy.isSupported ? (Dialog) patchProxyResultProxy.result : new e(context, str);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.zm, new Class[]{View.class}, Void.TYPE).isSupported && view.getId() == R.id.btnOk) {
            dismiss();
        }
    }
}
