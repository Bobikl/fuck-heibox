package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.text.TextUtils;
import com.xiaomi.push.C1339r;
import com.xiaomi.push.fo;
import com.xiaomi.push.fy;
import com.xiaomi.push.ir;
import com.xiaomi.push.jx;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class PushMessageHandler extends BaseService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<MiPushClient.ICallbackResult> f106739a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static List<MiPushClient.MiPushClientCallback> f106740b = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static ThreadPoolExecutor f115a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public interface a extends Serializable {
    }

    protected static void a() {
        synchronized (f106740b) {
            f106740b.clear();
        }
    }

    public static void a(long j10, String str, String str2) {
        synchronized (f106740b) {
            Iterator<MiPushClient.MiPushClientCallback> it = f106740b.iterator();
            while (it.hasNext()) {
                it.next().onInitializeResult(j10, str, str2);
            }
        }
    }

    public static void a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) PushMessageHandler.class));
        try {
            context.startService(intent);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m63a("PushMessageHandler", e10.getMessage());
        }
    }

    public static void a(Context context, Intent intent) {
        com.xiaomi.channel.commonutils.logger.b.m68b("PushMessageHandler", "addjob PushMessageHandler " + intent);
        if (intent != null) {
            c(context, intent);
            a(context);
        }
    }

    private static void a(Context context, Intent intent, ResolveInfo resolveInfo, boolean z10) {
        try {
            MessageHandleService.a aVar = new MessageHandleService.a(intent, (PushMessageReceiver) C1339r.a(context, resolveInfo.activityInfo.name).newInstance());
            if (z10) {
                MessageHandleService.a(context.getApplicationContext(), aVar);
            } else {
                MessageHandleService.addJob(context.getApplicationContext(), aVar);
            }
            MessageHandleService.a(context, new Intent(context.getApplicationContext(), (Class<?>) MessageHandleService.class));
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.a(th2);
        }
    }

    protected static void a(Context context, MiPushCommandMessage miPushCommandMessage) {
        synchronized (f106739a) {
            for (MiPushClient.ICallbackResult iCallbackResult : f106739a) {
                if (iCallbackResult instanceof MiPushClient.UPSRegisterCallBack) {
                    MiPushClient.TokenResult tokenResult = new MiPushClient.TokenResult();
                    if (miPushCommandMessage != null && miPushCommandMessage.getCommandArguments() != null && miPushCommandMessage.getCommandArguments().size() > 0) {
                        tokenResult.setResultCode(miPushCommandMessage.getResultCode());
                        tokenResult.setToken(miPushCommandMessage.getCommandArguments().get(0));
                    }
                    iCallbackResult.onResult(tokenResult);
                }
            }
        }
    }

    public static void a(Context context, MiPushMessage miPushMessage) {
        synchronized (f106740b) {
            for (MiPushClient.MiPushClientCallback miPushClientCallback : f106740b) {
                if (a(miPushMessage.getCategory(), miPushClientCallback.getCategory())) {
                    miPushClientCallback.onReceiveMessage(miPushMessage.getContent(), miPushMessage.getAlias(), miPushMessage.getTopic(), miPushMessage.isNotified());
                    miPushClientCallback.onReceiveMessage(miPushMessage);
                }
            }
        }
    }

    public static void a(Context context, a aVar) {
        if (aVar instanceof MiPushMessage) {
            a(context, (MiPushMessage) aVar);
            return;
        }
        if (aVar instanceof MiPushCommandMessage) {
            MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) aVar;
            String command = miPushCommandMessage.getCommand();
            String str = null;
            if (fy.COMMAND_REGISTER.f447a.equals(command)) {
                List<String> commandArguments = miPushCommandMessage.getCommandArguments();
                if (commandArguments != null && !commandArguments.isEmpty()) {
                    str = commandArguments.get(0);
                }
                a(miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
                return;
            }
            if (fy.COMMAND_SET_ALIAS.f447a.equals(command) || fy.COMMAND_UNSET_ALIAS.f447a.equals(command) || fy.COMMAND_SET_ACCEPT_TIME.f447a.equals(command)) {
                a(context, miPushCommandMessage.getCategory(), command, miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), miPushCommandMessage.getCommandArguments());
                return;
            }
            if (fy.COMMAND_SUBSCRIBE_TOPIC.f447a.equals(command)) {
                List<String> commandArguments2 = miPushCommandMessage.getCommandArguments();
                if (commandArguments2 != null && !commandArguments2.isEmpty()) {
                    str = commandArguments2.get(0);
                }
                a(context, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
                return;
            }
            if (fy.COMMAND_UNSUBSCRIBE_TOPIC.f447a.equals(command)) {
                List<String> commandArguments3 = miPushCommandMessage.getCommandArguments();
                if (commandArguments3 != null && !commandArguments3.isEmpty()) {
                    str = commandArguments3.get(0);
                }
                b(context, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
            }
        }
    }

    protected static void a(Context context, String str, long j10, String str2, String str3) {
        synchronized (f106740b) {
            for (MiPushClient.MiPushClientCallback miPushClientCallback : f106740b) {
                if (a(str, miPushClientCallback.getCategory())) {
                    miPushClientCallback.onSubscribeResult(j10, str2, str3);
                }
            }
        }
    }

    protected static void a(Context context, String str, String str2, long j10, String str3, List<String> list) {
        synchronized (f106740b) {
            for (MiPushClient.MiPushClientCallback miPushClientCallback : f106740b) {
                if (a(str, miPushClientCallback.getCategory())) {
                    miPushClientCallback.onCommandResult(str2, j10, str3, list);
                }
            }
        }
    }

    protected static void a(MiPushClient.ICallbackResult iCallbackResult) {
        synchronized (f106739a) {
            if (!f106739a.contains(iCallbackResult)) {
                f106739a.add(iCallbackResult);
            }
        }
    }

    protected static void a(MiPushClient.MiPushClientCallback miPushClientCallback) {
        synchronized (f106740b) {
            if (!f106740b.contains(miPushClientCallback)) {
                f106740b.add(miPushClientCallback);
            }
        }
    }

    protected static boolean a(String str, String str2) {
        return (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.equals(str, str2);
    }

    protected static void b() {
        synchronized (f106739a) {
            f106739a.clear();
        }
    }

    private static void b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setPackage(context.getPackageName());
            intent.setAction("action_clicked_activity_finish");
            context.sendBroadcast(intent, d.a(context));
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m63a("PushMessageHandler", "callback sync error" + e10);
        }
    }

    protected static void b(Context context, Intent intent) {
        boolean booleanExtra;
        try {
            booleanExtra = intent.getBooleanExtra("is_clicked_activity_call", false);
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.m63a("PushMessageHandler", "intent unparcel error:" + th2);
            booleanExtra = false;
        }
        try {
            com.xiaomi.channel.commonutils.logger.b.m64a("PushMessageHandler", "-->onHandleIntent(): action=", intent.getAction());
            ResolveInfo resolveInfo = null;
            if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
                o.a(context, intent, null);
            } else if ("com.xiaomi.mipush.SEND_TINYDATA".equals(intent.getAction())) {
                ir irVar = new ir();
                jx.a(irVar, intent.getByteArrayExtra("mipush_payload"));
                com.xiaomi.channel.commonutils.logger.b.m68b("PushMessageHandler", "PushMessageHandler.onHandleIntent " + irVar.d());
                MiTinyDataClient.upload(context, irVar);
            } else if (1 == PushMessageHelper.getPushMode(context)) {
                if (m86b()) {
                    com.xiaomi.channel.commonutils.logger.b.m65a("PushMessageHandler", "receive a message before application calling initialize");
                    if (booleanExtra) {
                        b(context);
                        return;
                    }
                    return;
                }
                a aVarA = am.a(context).a(intent);
                if (aVarA != null) {
                    a(context, aVarA);
                }
            } else if (!"com.xiaomi.mipush.sdk.SYNC_LOG".equals(intent.getAction())) {
                Intent intent2 = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
                intent2.setPackage(context.getPackageName());
                intent2.putExtras(intent);
                try {
                    List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent2, 32);
                    if (listQueryBroadcastReceivers != null) {
                        for (ResolveInfo resolveInfo2 : listQueryBroadcastReceivers) {
                            ActivityInfo activityInfo = resolveInfo2.activityInfo;
                            if (activityInfo != null && activityInfo.packageName.equals(context.getPackageName()) && PushMessageReceiver.class.isAssignableFrom(C1339r.a(context, resolveInfo2.activityInfo.name))) {
                                resolveInfo = resolveInfo2;
                                break;
                            }
                        }
                    }
                    if (resolveInfo != null) {
                        a(context, intent2, resolveInfo, booleanExtra);
                    } else {
                        com.xiaomi.channel.commonutils.logger.b.m65a("PushMessageHandler", "cannot find the receiver to handler this message, check your manifest");
                        fo.a(context).a(context.getPackageName(), intent, "11");
                    }
                } catch (Exception e10) {
                    com.xiaomi.channel.commonutils.logger.b.a("PushMessageHandler", e10);
                    fo.a(context).a(context.getPackageName(), intent, "9");
                }
            }
            if (!booleanExtra) {
            }
        } catch (Throwable th3) {
            try {
                com.xiaomi.channel.commonutils.logger.b.a("PushMessageHandler", th3);
                fo.a(context).a(context.getPackageName(), intent, "10");
            } finally {
                if (booleanExtra) {
                    b(context);
                }
            }
        }
    }

    protected static void b(Context context, String str, long j10, String str2, String str3) {
        synchronized (f106740b) {
            for (MiPushClient.MiPushClientCallback miPushClientCallback : f106740b) {
                if (a(str, miPushClientCallback.getCategory())) {
                    miPushClientCallback.onUnsubscribeResult(j10, str2, str3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static boolean m86b() {
        return f106740b.isEmpty();
    }

    private static void c(Context context, Intent intent) {
        if (intent != null && !f115a.isShutdown()) {
            f115a.execute(new al(context, intent));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("-->scheduleJob() fail, case");
        sb2.append(intent == null ? "0" : "1");
        com.xiaomi.channel.commonutils.logger.b.c("PushMessageHandler", sb2.toString());
    }

    @Override // com.xiaomi.mipush.sdk.BaseService
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    protected boolean mo87a() {
        ThreadPoolExecutor threadPoolExecutor = f115a;
        return (threadPoolExecutor == null || threadPoolExecutor.getQueue() == null || f115a.getQueue().size() <= 0) ? false : true;
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public void onStart(Intent intent, int i10) {
        super.onStart(intent, i10);
        c(getApplicationContext(), intent);
    }
}
