package com.max.xiaoheihe.module.account.verify;

import android.app.Activity;
import androidx.compose.runtime.internal.o;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import xh.m;

/* JADX INFO: compiled from: AliVerifyManager.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class AliVerifyManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final AliVerifyManager f79431a = new AliVerifyManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f79432b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private AliVerifyManager() {
    }

    @m
    public static final void a(@e final String str) {
        final Activity activityA;
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 25536, new Class[]{String.class}, Void.TYPE).isSupported || (activityA = com.max.hbutils.utils.e.b().a()) == null) {
            return;
        }
        final LoadingDialog loadingDialogR = new LoadingDialog(activityA, "").r();
    }
}
