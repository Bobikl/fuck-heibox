package com.max.mediaselector.lib.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.max.mediaselector.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: PictureCommonDialog.java */
/* JADX INFO: loaded from: classes2.dex */
public class c extends Dialog implements View.OnClickListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f75187b;

    /* JADX INFO: compiled from: PictureCommonDialog.java */
    public interface a {
        void a();
    }

    public c(Context context, String str, String str2) {
        super(context, R.style.Picture_Theme_Dialog);
        setContentView(R.layout.ps_common_dialog);
        Button button = (Button) findViewById(R.id.btn_cancel);
        Button button2 = (Button) findViewById(R.id.btn_commit);
        TextView textView = (TextView) findViewById(R.id.tvTitle);
        TextView textView2 = (TextView) findViewById(R.id.tv_content);
        textView.setText(str);
        textView2.setText(str2);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        a();
    }

    private void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.tm, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setWindowAnimations(R.style.PictureThemeDialogWindowStyle);
        getWindow().setAttributes(attributes);
    }

    public static c c(Context context, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, bb.c.l.sm, new Class[]{Context.class, String.class, String.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        c cVar = new c(context, str, str2);
        cVar.show();
        return cVar;
    }

    public void b(a aVar) {
        this.f75187b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.um, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        int id2 = view.getId();
        if (id2 == R.id.btn_cancel) {
            dismiss();
            return;
        }
        if (id2 == R.id.btn_commit) {
            dismiss();
            a aVar = this.f75187b;
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
