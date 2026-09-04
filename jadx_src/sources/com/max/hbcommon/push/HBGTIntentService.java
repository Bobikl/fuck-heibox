package com.max.hbcommon.push;

import android.content.Context;
import bb.c;
import com.igexin.sdk.GTIntentService;
import com.igexin.sdk.PushConsts;
import com.igexin.sdk.PushManager;
import com.igexin.sdk.message.BindAliasCmdMessage;
import com.igexin.sdk.message.GTCmdMessage;
import com.igexin.sdk.message.GTNotificationMessage;
import com.igexin.sdk.message.GTTransmitMessage;
import com.igexin.sdk.message.SetTagCmdMessage;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.k;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import pb.o;

/* JADX INFO: compiled from: HBGTIntentService.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class HBGTIntentService extends GTIntentService {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    public static final a f68178c = new a(null);
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f68179d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final String f68180b = "HBGTIntentService";

    /* JADX INFO: compiled from: HBGTIntentService.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public final boolean a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.Ue, new Class[0], Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : HBGTIntentService.f68179d;
        }

        public final void b(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.e.Ve, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            HBGTIntentService.f68179d = z10;
        }
    }

    @d
    public final String c() {
        return this.f68180b;
    }

    public final boolean d(@e Context context, @e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, this, changeQuickRedirect, false, c.e.Oe, new Class[]{Context.class, String.class, String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : PushManager.getInstance().sendFeedbackMessage(context, str, str2, 60002);
    }

    public final boolean e(@e Context context, @e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, this, changeQuickRedirect, false, c.e.Ne, new Class[]{Context.class, String.class, String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : PushManager.getInstance().sendFeedbackMessage(context, str, str2, PushConsts.MIN_OPEN_FEEDBACK_ACTION);
    }

    @Override // com.igexin.sdk.GTIntentService
    public void onNotificationMessageArrived(@e Context context, @e GTNotificationMessage gTNotificationMessage) {
        if (PatchProxy.proxy(new Object[]{context, gTNotificationMessage}, this, changeQuickRedirect, false, c.e.Se, new Class[]{Context.class, GTNotificationMessage.class}, Void.TYPE).isSupported) {
            return;
        }
        g.f74531b.M(this.f68180b + "  onNotificationMessageArrived: " + k.p(gTNotificationMessage));
    }

    @Override // com.igexin.sdk.GTIntentService
    public void onNotificationMessageClicked(@e Context context, @e GTNotificationMessage gTNotificationMessage) {
        if (PatchProxy.proxy(new Object[]{context, gTNotificationMessage}, this, changeQuickRedirect, false, c.e.Te, new Class[]{Context.class, GTNotificationMessage.class}, Void.TYPE).isSupported) {
            return;
        }
        g.f74531b.M(this.f68180b + "  onNotificationMessageClicked: " + k.p(gTNotificationMessage));
    }

    @Override // com.igexin.sdk.GTIntentService
    public void onReceiveClientId(@e Context context, @d String clientid) {
        String userId;
        if (PatchProxy.proxy(new Object[]{context, clientid}, this, changeQuickRedirect, false, c.e.Pe, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(clientid, "clientid");
        f68179d = true;
        g.f74531b.M(this.f68180b + "  onReceiveClientId " + clientid);
        o oVarO = ob.a.o();
        if (!oVarO.b() || (userId = oVarO.getUserId()) == null || f0.g(userId, "-1")) {
            return;
        }
        com.max.hbcommon.push.a.a(BaseApplication.a(), userId, true);
    }

    @Override // com.igexin.sdk.GTIntentService
    public void onReceiveCommandResult(@e Context context, @e GTCmdMessage gTCmdMessage) {
        if (PatchProxy.proxy(new Object[]{context, gTCmdMessage}, this, changeQuickRedirect, false, c.e.Re, new Class[]{Context.class, GTCmdMessage.class}, Void.TYPE).isSupported) {
            return;
        }
        g.a aVar = g.f74531b;
        aVar.M(this.f68180b + "  onReceiveCommandResult: " + k.p(gTCmdMessage));
        f0.m(gTCmdMessage);
        int action = gTCmdMessage.getAction();
        if (action == 10009) {
            SetTagCmdMessage setTagCmdMessage = (SetTagCmdMessage) gTCmdMessage;
            aVar.q(this.f68180b + "  settag result sn = " + setTagCmdMessage.getSn() + ", code = " + setTagCmdMessage.getCode());
            return;
        }
        if (action != 10010) {
            return;
        }
        BindAliasCmdMessage bindAliasCmdMessage = (BindAliasCmdMessage) gTCmdMessage;
        aVar.q(this.f68180b + "  bind alias result sn = " + bindAliasCmdMessage.getSn() + ", code = " + bindAliasCmdMessage.getCode());
    }

    @Override // com.igexin.sdk.GTIntentService
    public void onReceiveMessageData(@e Context context, @d GTTransmitMessage msg) {
        if (PatchProxy.proxy(new Object[]{context, msg}, this, changeQuickRedirect, false, c.e.Me, new Class[]{Context.class, GTTransmitMessage.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(msg, "msg");
        byte[] payload = msg.getPayload();
        f0.m(payload);
        new String(payload, kotlin.text.d.f128566b);
        String taskId = msg.getTaskId();
        String messageId = msg.getMessageId();
        g.f74531b.M(this.f68180b + "  onReceiveMessageData taskid: " + taskId + "  messageid: " + messageId);
    }

    @Override // com.igexin.sdk.GTIntentService
    public void onReceiveOnlineState(@e Context context, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.e.Qe, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        g.f74531b.M(this.f68180b + "  onReceiveOnlineState online: " + z10);
    }

    @Override // com.igexin.sdk.GTIntentService
    public void onReceiveServicePid(@e Context context, int i10) {
    }
}
