package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.xiaomi.push.fo;
import com.xiaomi.push.fy;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class MessageHandleService extends BaseService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<a> f106734a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static ExecutorService f103a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Intent f106735a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private PushMessageReceiver f104a;

        public a(Intent intent, PushMessageReceiver pushMessageReceiver) {
            this.f104a = pushMessageReceiver;
            this.f106735a = intent;
        }

        public Intent a() {
            return this.f106735a;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public PushMessageReceiver m81a() {
            return this.f104a;
        }
    }

    protected static void a(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        b(context);
    }

    static void a(Context context, a aVar) {
        String[] stringArrayExtra;
        if (aVar == null) {
            return;
        }
        try {
            PushMessageReceiver pushMessageReceiverM81a = aVar.m81a();
            Intent intentA = aVar.a();
            int intExtra = intentA.getIntExtra("message_type", 1);
            if (intExtra != 1) {
                if (intExtra != 3) {
                    if (intExtra == 5 && PushMessageHelper.ERROR_TYPE_NEED_PERMISSION.equals(intentA.getStringExtra(PushMessageHelper.ERROR_TYPE)) && (stringArrayExtra = intentA.getStringArrayExtra(PushMessageHelper.ERROR_MESSAGE)) != null) {
                        com.xiaomi.channel.commonutils.logger.b.e("begin execute onRequirePermissions, lack of necessary permissions");
                        pushMessageReceiverM81a.onRequirePermissions(context, stringArrayExtra);
                        return;
                    }
                    return;
                }
                MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) intentA.getSerializableExtra(PushMessageHelper.KEY_COMMAND);
                com.xiaomi.channel.commonutils.logger.b.e("(Local) begin execute onCommandResult, command=" + miPushCommandMessage.getCommand() + ", resultCode=" + miPushCommandMessage.getResultCode() + ", reason=" + miPushCommandMessage.getReason());
                pushMessageReceiverM81a.onCommandResult(context, miPushCommandMessage);
                if (TextUtils.equals(miPushCommandMessage.getCommand(), fy.COMMAND_REGISTER.f447a)) {
                    pushMessageReceiverM81a.onReceiveRegisterResult(context, miPushCommandMessage);
                    PushMessageHandler.a(context, miPushCommandMessage);
                    if (miPushCommandMessage.getResultCode() == 0) {
                        i.b(context);
                        return;
                    }
                    return;
                }
                return;
            }
            PushMessageHandler.a aVarA = am.a(context).a(intentA);
            int intExtra2 = intentA.getIntExtra("eventMessageType", -1);
            if (aVarA == null) {
                com.xiaomi.channel.commonutils.logger.b.c("MessageHandleService", "no message from raw for receiver");
                return;
            }
            if (!(aVarA instanceof MiPushMessage)) {
                if (!(aVarA instanceof MiPushCommandMessage)) {
                    com.xiaomi.channel.commonutils.logger.b.c("MessageHandleService", "unknown raw message: " + aVarA);
                    return;
                }
                MiPushCommandMessage miPushCommandMessage2 = (MiPushCommandMessage) aVarA;
                com.xiaomi.channel.commonutils.logger.b.c("MessageHandleService", "begin execute onCommandResult, command=" + miPushCommandMessage2.getCommand() + ", resultCode=" + miPushCommandMessage2.getResultCode() + ", reason=" + miPushCommandMessage2.getReason());
                pushMessageReceiverM81a.onCommandResult(context, miPushCommandMessage2);
                if (TextUtils.equals(miPushCommandMessage2.getCommand(), fy.COMMAND_REGISTER.f447a)) {
                    pushMessageReceiverM81a.onReceiveRegisterResult(context, miPushCommandMessage2);
                    PushMessageHandler.a(context, miPushCommandMessage2);
                    if (miPushCommandMessage2.getResultCode() == 0) {
                        i.b(context);
                        return;
                    }
                    return;
                }
                return;
            }
            MiPushMessage miPushMessage = (MiPushMessage) aVarA;
            if (!miPushMessage.isArrivedMessage()) {
                pushMessageReceiverM81a.onReceiveMessage(context, miPushMessage);
            }
            if (miPushMessage.getPassThrough() == 1) {
                fo.a(context.getApplicationContext()).a(context.getPackageName(), intentA, 2004, (String) null);
                com.xiaomi.channel.commonutils.logger.b.c("MessageHandleService", "begin execute onReceivePassThroughMessage from " + miPushMessage.getMessageId());
                pushMessageReceiverM81a.onReceivePassThroughMessage(context, miPushMessage);
                return;
            }
            if (!miPushMessage.isNotified()) {
                com.xiaomi.channel.commonutils.logger.b.c("MessageHandleService", "begin execute onNotificationMessageArrived from " + miPushMessage.getMessageId());
                pushMessageReceiverM81a.onNotificationMessageArrived(context, miPushMessage);
                return;
            }
            if (intExtra2 == 1000) {
                fo.a(context.getApplicationContext()).a(context.getPackageName(), intentA, 1007, (String) null);
            } else {
                fo.a(context.getApplicationContext()).a(context.getPackageName(), intentA, bb.c.d.Qh, (String) null);
            }
            com.xiaomi.channel.commonutils.logger.b.c("MessageHandleService", "begin execute onNotificationMessageClicked from\u3000" + miPushMessage.getMessageId());
            pushMessageReceiverM81a.onNotificationMessageClicked(context, miPushMessage);
        } catch (RuntimeException e10) {
            com.xiaomi.channel.commonutils.logger.b.a("MessageHandleService", e10);
        }
    }

    public static void addJob(Context context, a aVar) {
        if (aVar != null) {
            f106734a.add(aVar);
            b(context);
            startService(context);
        }
    }

    private static void b(Context context) {
        if (f103a.isShutdown()) {
            return;
        }
        f103a.execute(new z(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context) {
        try {
            a(context, f106734a.poll());
        } catch (RuntimeException e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
        }
    }

    public static void startService(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) MessageHandleService.class));
        com.xiaomi.push.ah.a(context).a(new y(context, intent));
    }

    @Override // com.xiaomi.mipush.sdk.BaseService
    /* JADX INFO: renamed from: a */
    protected boolean mo87a() {
        ConcurrentLinkedQueue<a> concurrentLinkedQueue = f106734a;
        return concurrentLinkedQueue != null && concurrentLinkedQueue.size() > 0;
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public void onStart(Intent intent, int i10) {
        super.onStart(intent, i10);
    }
}
