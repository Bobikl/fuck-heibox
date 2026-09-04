package com.max.hbcommon.component;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.e1;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: FilterDialog.java */
/* JADX INFO: loaded from: classes9.dex */
public class i extends com.max.hbcustomview.swipebacklayout.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected Context f67717i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected LayoutInflater f67718j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f67719k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected View f67720l;

    public i(@androidx.annotation.n0 Context context, @e1 int i10, View view) {
        super(context, i10);
        this.f67717i = context;
        this.f67718j = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f67720l = view;
    }

    public i(@androidx.annotation.n0 Context context, View view) {
        this(context, true, view);
    }

    public i(@androidx.annotation.n0 Context context, boolean z10, View view) {
        this(context, z10 ? R.style.FullScreenDialog : R.style.HeyBoxDialog, view);
        k(z10);
    }

    public View j() {
        return this.f67720l;
    }

    public void k(boolean z10) {
        this.f67719k = z10;
    }

    @Override // com.max.hbcustomview.swipebacklayout.a, android.app.Dialog
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.d.f31568u7, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        Window window = getWindow();
        if (!this.f67719k) {
            window.setGravity(17);
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        setContentView(this.f67720l);
    }

    @Override // com.max.hbcustomview.swipebacklayout.a, android.app.Dialog
    public void show() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31590v7, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f67719k) {
            com.max.hbutils.utils.t.h0(getWindow());
        }
        super.show();
    }
}
