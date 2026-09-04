package com.igexin.push.core;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.igexin.assist.sdk.AssistPushConsts;
import com.igexin.assist.sdk.AssistPushManager;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.sdk.PushConsts;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public class b extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f63504a = b.class.getName();

    public b(Looper looper) {
        super(looper);
    }

    private void a() {
        if (d.f63678l || d.D <= 10000) {
            return;
        }
        int iRandom = (int) ((Math.random() * 100.0d) + 150.0d);
        com.igexin.a.a.c.b.a(f63504a + "|userPresent, reConnectDelayTime = " + d.D + ", resetDelay = " + iRandom, new Object[0]);
        d.D = (long) iRandom;
        com.igexin.push.f.b.f.i().j();
    }

    private void a(Intent intent) throws Throwable {
        String str;
        String stringExtra = intent.getStringExtra("action");
        com.igexin.a.a.c.b.a(f63504a + "|processIntentMsgService action：" + stringExtra, new Object[0]);
        if (stringExtra.equals(PushConsts.ACTION_SERVICE_INITIALIZE)) {
            com.igexin.push.core.a.e.a().a(intent);
            return;
        }
        if (stringExtra.equals(PushConsts.ACTION_SERVICE_ONRESUME)) {
            com.igexin.a.a.c.b.a(f63504a + "|handle onresume ~~~", new Object[0]);
            com.igexin.push.core.a.e.a().c("onResume");
            return;
        }
        if (stringExtra.equals(PushConsts.ACTION_SERVICE_INITIALIZE_SLAVE)) {
            com.igexin.push.core.a.e.a().b(intent);
            AssistPushManager.getInstance().turnOnPush(d.f63671e);
            return;
        }
        if (stringExtra.equals(PushConsts.ACTION_BROADCAST_PUSHMANAGER)) {
            String stringExtra2 = intent.getStringExtra("sc");
            if (TextUtils.isEmpty(d.f63670d) || d.f63670d.equals(stringExtra2)) {
                com.igexin.push.core.a.e.a().a(intent.getBundleExtra("bundle"));
                return;
            }
            com.igexin.a.a.c.b.a("safeCode not match!!" + d.f63670d + Constants.ACCEPT_TIME_SEPARATOR_SP + stringExtra2, new Object[0]);
            com.igexin.a.a.c.a.f.a().a("safeCode not match!!" + d.f63670d + Constants.ACCEPT_TIME_SEPARATOR_SP + stringExtra2);
            return;
        }
        if (stringExtra.equals(PushConsts.ACTION_BROADCAST_USER_PRESENT)) {
            a();
            return;
        }
        if (stringExtra.equals(PushConsts.ACTION_BROADCAST_NOTIFICATION_CLICK)) {
            Intent intent2 = (Intent) intent.getParcelableExtra("broadcast_intent");
            if (intent2 == null) {
                return;
            }
            String action = intent2.getAction();
            com.igexin.a.a.c.b.a(f63504a, "intent action = " + action);
            if (!TextUtils.isEmpty(action) && action.startsWith("pre_doaction.")) {
                str = CoreConsts.f63452b;
            } else {
                if (TextUtils.isEmpty(action) || !action.startsWith("pre_burypoint.")) {
                    d.f63671e.sendBroadcast(intent2, d.az);
                    return;
                }
                str = CoreConsts.f63451a;
            }
            intent2.setAction(str);
            com.igexin.push.core.a.e.a().c(intent2);
            return;
        }
        if (stringExtra.equals(PushConsts.ACTION_BROADCAST_NOTIFICATION_DELETE)) {
            PushTaskBean pushTaskBean = new PushTaskBean();
            pushTaskBean.setAppid(intent.getStringExtra("appid"));
            pushTaskBean.setMessageId(intent.getStringExtra("messageid"));
            pushTaskBean.setTaskId(intent.getStringExtra("taskid"));
            pushTaskBean.setId(intent.getStringExtra("id"));
            pushTaskBean.setAppKey(intent.getStringExtra("appkey"));
            try {
                int i10 = Integer.parseInt(intent.getStringExtra("feedbackid")) + 30040;
                pushTaskBean.setCurrentActionid(i10);
                String str2 = "notifyStyle:" + intent.getStringExtra("notifyStyle");
                com.igexin.push.core.a.e.a().a(pushTaskBean, i10 + "", str2);
            } catch (Exception unused) {
                com.igexin.push.core.a.e.a().b(pushTaskBean, "30040");
            }
            String strA = com.igexin.push.core.a.e.a().a(intent.getStringExtra("taskid"), intent.getStringExtra("messageid"));
            com.igexin.a.a.c.b.a(f63504a + "|notification delete = " + strA, new Object[0]);
            try {
                d.f63658ac.remove(strA);
                com.igexin.a.a.c.b.a(f63504a + "|del notification, pushMessageMap remove = " + strA, new Object[0]);
            } catch (Exception e10) {
                com.igexin.a.a.c.b.a("EndAction|" + e10.toString(), new Object[0]);
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            int i10 = message.what;
            if (i10 == CoreConsts.f63460j) {
                w.a().f();
                return;
            }
            Object obj = message.obj;
            if (obj == null) {
                return;
            }
            if (i10 == CoreConsts.f63456f) {
                Intent intent = (Intent) obj;
                if (intent.hasExtra("action")) {
                    a(intent);
                    return;
                }
                return;
            }
            if (i10 == CoreConsts.f63457g) {
                com.igexin.push.core.a.e.a().c((Intent) message.obj);
                return;
            }
            if (i10 == CoreConsts.f63458h) {
                Bundle bundle = (Bundle) obj;
                w.a().b(bundle.getString("taskid"), bundle.getString("messageid"));
                return;
            }
            if (i10 == CoreConsts.f63459i) {
                Bundle bundle2 = (Bundle) obj;
                String string = bundle2.getString("taskid");
                String string2 = bundle2.getString("messageid");
                String string3 = bundle2.getString("actionid");
                com.igexin.a.a.c.b.a(f63504a + "|hand execute_action taskid = " + string + ", actionid = " + string3, new Object[0]);
                w.a().b(string, string2, string3);
                return;
            }
            if (i10 == CoreConsts.f63461k) {
                com.igexin.push.core.b.i.a().c((String) message.obj);
                if (d.f63678l) {
                    com.igexin.push.core.a.e.a().e();
                    return;
                }
                return;
            }
            if (i10 == CoreConsts.f63462l && com.igexin.push.config.l.H && !"false".equals(d.f63692z)) {
                com.igexin.push.d.c.m mVar = new com.igexin.push.d.c.m();
                mVar.d();
                mVar.f63879e = message.obj;
                mVar.f63880f = message.getData().getByteArray(AssistPushConsts.MSG_TYPE_PAYLOAD);
                new com.igexin.push.core.a.j().a(mVar);
            }
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a(f63504a + "|" + th2.toString(), new Object[0]);
        }
    }
}
