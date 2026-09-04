package com.max.hbwidget.hbdialog.gesture;

import android.app.Dialog;
import android.content.Context;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.k;

/* JADX INFO: compiled from: CustomDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Dialog {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private InterfaceC0597a f74388b;

    /* JADX INFO: renamed from: com.max.hbwidget.hbdialog.gesture.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CustomDialog.kt */
    public interface InterfaceC0597a {
        void onBackPressed();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@d Context context, int i10) {
        super(context, i10);
        f0.p(context, "context");
    }

    public final void a(@d InterfaceC0597a listener) {
        if (PatchProxy.proxy(new Object[]{listener}, this, changeQuickRedirect, false, c.l.E6, new Class[]{InterfaceC0597a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(listener, "listener");
        this.f74388b = listener;
    }

    @Override // android.app.Dialog
    @k(message = "Android 13 引入了新机制 OnBackInvokedCallback")
    public void onBackPressed() {
        InterfaceC0597a interfaceC0597a = this.f74388b;
        if (interfaceC0597a != null) {
            interfaceC0597a.onBackPressed();
        }
    }
}
