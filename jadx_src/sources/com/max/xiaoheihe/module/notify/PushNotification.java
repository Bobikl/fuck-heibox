package com.max.xiaoheihe.module.notify;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.analytics.l;
import com.max.hbcommon.component.inappnotification.a;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.NotifyMsgObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kb.c;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: PushNotification.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class PushNotification extends a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91532l = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @d
    private final NotifyMsgObj f91533j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f91534k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotification(@e Context context, @d NotifyMsgObj notifyMsgObj, int i10) {
        super(context, true, 4000L, false, null, 0, 0, false, false, 504, null);
        f0.p(notifyMsgObj, "notifyMsgObj");
        this.f91533j = notifyMsgObj;
        this.f91534k = i10;
    }

    public /* synthetic */ PushNotification(Context context, NotifyMsgObj notifyMsgObj, int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? null : context, notifyMsgObj, i10);
    }

    public static final /* synthetic */ void m(PushNotification pushNotification, NotifyMsgObj notifyMsgObj) {
        if (PatchProxy.proxy(new Object[]{pushNotification, notifyMsgObj}, null, changeQuickRedirect, true, 42824, new Class[]{PushNotification.class, NotifyMsgObj.class}, Void.TYPE).isSupported) {
            return;
        }
        pushNotification.n(notifyMsgObj);
    }

    private final void n(NotifyMsgObj notifyMsgObj) {
        if (PatchProxy.proxy(new Object[]{notifyMsgObj}, this, changeQuickRedirect, false, 42823, new Class[]{NotifyMsgObj.class}, Void.TYPE).isSupported) {
            return;
        }
        l.f66572a.l(lb.d.V4, notifyMsgObj.getAddition());
    }

    @Override // com.max.hbcommon.component.inappnotification.a
    @e
    public View g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42822, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        Context contextF = f();
        if (contextF == null) {
            return null;
        }
        View viewInflate = c.d(contextF).inflate(R.layout.layout_team_chat_inapp_push, (ViewGroup) new FrameLayout(contextF), false);
        k.f(r0.a(e1.e()), null, null, new PushNotification$getView$1$1$1(viewInflate, this, contextF, null), 3, null);
        return viewInflate;
    }
}
