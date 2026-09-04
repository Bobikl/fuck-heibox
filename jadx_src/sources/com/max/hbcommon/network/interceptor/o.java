package com.max.hbcommon.network.interceptor;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import com.max.hbcommon.R;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PayVerifyDialogUtil.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final o f68157a = new o();
    public static ChangeQuickRedirect changeQuickRedirect;

    private o() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ErrorHandleInterceptor.b listener, DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{listener, dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.e.Ke, new Class[]{ErrorHandleInterceptor.b.class, DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(listener, "$listener");
        listener.b("pay_confirm", null);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ErrorHandleInterceptor.b listener, DialogInterface dialogInterface) {
        if (PatchProxy.proxy(new Object[]{listener, dialogInterface}, null, changeQuickRedirect, true, bb.c.e.Le, new Class[]{ErrorHandleInterceptor.b.class, DialogInterface.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(listener, "$listener");
        listener.a();
    }

    @dl.e
    public final String c(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.e.Je, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return !com.max.hbcommon.utils.c.u(str) ? com.max.hbutils.utils.n.f("##0.00").format(com.max.hbutils.utils.n.r(str) / 1000.0d) : str;
    }

    public final void d(@dl.e String str, @dl.e String str2, @dl.d final ErrorHandleInterceptor.b listener) {
        if (PatchProxy.proxy(new Object[]{str, str2, listener}, this, changeQuickRedirect, false, bb.c.e.Ie, new Class[]{String.class, String.class, ErrorHandleInterceptor.b.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(listener, "listener");
        Activity activityN = ob.a.b().n();
        if (activityN == null || activityN.isFinishing()) {
            listener.a();
            return;
        }
        SpannableString spannableString = new SpannableString((char) 65509 + c(str2));
        spannableString.setSpan(new AbsoluteSizeSpan(activityN.getResources().getDimensionPixelSize(R.dimen.text_size_13)), 0, 1, 33);
        com.max.hbcommon.view.a aVarF = new com.max.hbcommon.view.a.f(activityN).y(str).l(spannableString).u("确认支付", new DialogInterface.OnClickListener() { // from class: com.max.hbcommon.network.interceptor.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                o.e(listener, dialogInterface, i10);
            }
        }).w(true).r(new DialogInterface.OnDismissListener() { // from class: com.max.hbcommon.network.interceptor.n
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                o.f(listener, dialogInterface);
            }
        }).g(false).F();
        aVarF.o(17);
        aVarF.f().setTextSize(1, 24.0f);
        aVarF.f().setTextColor(com.max.hbcommon.utils.l.a(R.color.text_primary_1_color));
        aVarF.f().setPadding(0, ViewUtils.f(activityN, 24.0f), 0, 0);
        bb.d.d(aVarF.f(), 5);
    }
}
