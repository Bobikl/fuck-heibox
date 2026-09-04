package com.max.xiaoheihe.utils;

import android.app.Activity;
import com.max.hbcommon.component.inappnotification.InAppNotificationManager;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.NotifyMsgObj;
import com.max.xiaoheihe.module.notify.BottomClickToastNotification;
import com.max.xiaoheihe.module.notify.PushNotification;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: NotifyUtils.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final s f95742a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f95743b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private s() {
    }

    private final void c(NotifyMsgObj notifyMsgObj) {
        if (PatchProxy.proxy(new Object[]{notifyMsgObj}, this, changeQuickRedirect, false, 48784, new Class[]{NotifyMsgObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.analytics.l.f66572a.n(lb.d.U4, notifyMsgObj.getAddition());
    }

    public final void a(@dl.e String str, @dl.e String str2) {
        Activity activityE;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 48783, new Class[]{String.class, String.class}, Void.TYPE).isSupported || (activityE = HeyBoxApplication.C().E()) == null || activityE.isFinishing()) {
            return;
        }
        InAppNotificationManager.f67721a.s(new BottomClickToastNotification(activityE, str, str2, 0L, 8, null), 300L);
    }

    public final void b(@dl.d NotifyMsgObj notifyObj) {
        if (PatchProxy.proxy(new Object[]{notifyObj}, this, changeQuickRedirect, false, 48782, new Class[]{NotifyMsgObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(notifyObj, "notifyObj");
        Activity activityE = HeyBoxApplication.C().E();
        if (activityE == null || activityE.isFinishing()) {
            return;
        }
        InAppNotificationManager.f67721a.s(new PushNotification(activityE, notifyObj, ViewUtils.f(activityE, 14.0f) + com.max.hbutils.utils.t.p(activityE)), 300L);
        c(notifyObj);
    }
}
