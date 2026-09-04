package com.max.hbwidget.hbdialog.gesture;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import bb.c;
import com.max.hbwidget.hbdialog.animator.AnimatorBottomDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GestureCustomDialogFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public class b extends AnimatorBottomDialogFragment {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: GestureCustomDialogFragment.kt */
    public static final class a implements com.max.hbwidget.hbdialog.gesture.a.InterfaceC0597a {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbwidget.hbdialog.gesture.a.InterfaceC0597a
        public void onBackPressed() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.G6, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            b.this.dismiss();
        }
    }

    @Override // androidx.fragment.app.j
    @d
    public Dialog onCreateDialog(@e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, c.l.F6, new Class[]{Bundle.class}, Dialog.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dialog) patchProxyResultProxy.result;
        }
        Context contextRequireContext = requireContext();
        f0.o(contextRequireContext, "requireContext(...)");
        com.max.hbwidget.hbdialog.gesture.a aVar = new com.max.hbwidget.hbdialog.gesture.a(contextRequireContext, getTheme());
        aVar.a(new a());
        return aVar;
    }
}
