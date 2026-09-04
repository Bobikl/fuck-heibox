package com.igexin.push.core;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.igexin.assist.sdk.AssistPushConsts;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.sdk.PushConsts;
import com.igexin.sdk.message.BindAliasCmdMessage;
import com.igexin.sdk.message.FeedbackCmdMessage;
import com.igexin.sdk.message.GTNotificationMessage;
import com.igexin.sdk.message.GTTransmitMessage;
import com.igexin.sdk.message.SetTagCmdMessage;
import com.igexin.sdk.message.UnBindAliasCmdMessage;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public final class r extends Handler implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile r f63772b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentLinkedQueue<Intent> f63773a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f63774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f63775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Messenger f63776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final IBinder.DeathRecipient f63777f;

    private r() {
        super(Looper.getMainLooper());
        this.f63777f = new s(this);
        t tVar = new t(this);
        this.f63774c = tVar;
        this.f63773a = new ConcurrentLinkedQueue<>();
        Message.obtain(tVar.a(), 3, 1, 0).sendToTarget();
    }

    public static r a() {
        if (f63772b == null) {
            synchronized (r.class) {
                if (f63772b == null) {
                    f63772b = new r();
                }
            }
        }
        return f63772b;
    }

    private void a(String str, String str2, String str3, byte[] bArr) {
        Intent intent = new Intent();
        intent.addFlags(32);
        intent.setAction("com.igexin.sdk.action." + str3);
        Bundle bundle = new Bundle();
        bundle.putInt("action", 10001);
        bundle.putString("taskid", str);
        bundle.putString("messageid", str2);
        bundle.putString("appid", str3);
        bundle.putString("payloadid", str2 + ":" + str);
        bundle.putString("packagename", d.f63669c);
        bundle.putByteArray(AssistPushConsts.MSG_TYPE_PAYLOAD, bArr);
        intent.putExtras(bundle);
        intent.setPackage(d.f63671e.getPackageName());
        d.f63671e.sendBroadcast(intent, d.az);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        if (z10 && this.f63776e != null) {
            try {
                this.f63776e.getBinder().unlinkToDeath(this.f63777f, 0);
            } catch (Throwable unused) {
            }
            this.f63775d = false;
            this.f63776e = null;
        }
        if (this.f63775d) {
            return;
        }
        e();
        this.f63775d = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(IBinder iBinder) {
        if (iBinder == null) {
            return false;
        }
        this.f63776e = new Messenger(iBinder);
        try {
            iBinder.linkToDeath(this.f63777f, 0);
            return true;
        } catch (Exception e10) {
            com.igexin.a.a.c.b.a("MsgServerSender|linkToDeath to iservice ex = " + e10.toString(), new Object[0]);
            return true;
        }
    }

    private void b(Intent intent) {
        if (intent == null) {
            return;
        }
        if (this.f63776e == null) {
            com.igexin.a.a.c.b.a("MsgServerSender|realSend, remoteMessenger is null", new Object[0]);
        }
        Bundle extras = intent.getExtras();
        if (extras == null || extras.get("action") == null || !(extras.get("action") instanceof Integer)) {
            return;
        }
        com.igexin.a.a.c.b.a("MsgServerSender|realSend action = " + extras.getInt("action"), new Object[0]);
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = intent;
        try {
            this.f63776e.send(messageObtain);
        } catch (Exception e10) {
            com.igexin.a.a.c.b.a("MsgServerSender|realSend iservice error = " + e10.toString(), new Object[0]);
            if (e10 instanceof DeadObjectException) {
                Message.obtain(this.f63774c.a(), 2, 0, 0).sendToTarget();
            }
        }
    }

    private void e() {
        com.igexin.a.a.c.b.a("MsgServerSender|try to bind iservice", new Object[0]);
        try {
            Intent intent = new Intent(d.f63671e, (Class<?>) d());
            intent.setType(d.f63671e.getPackageName());
            d.f63671e.bindService(intent, this, 1);
        } catch (Exception e10) {
            Log.e("MsgServerSender", "bind iservice error = " + e10.toString());
            com.igexin.a.a.c.b.a("MsgServerSender|bind iservice error = " + e10.toString(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        while (!this.f63773a.isEmpty()) {
            Intent intentPoll = this.f63773a.poll();
            if (intentPoll != null) {
                b(intentPoll);
            }
        }
    }

    @TargetApi(12)
    private Intent g() {
        Intent intent = new Intent();
        intent.addFlags(32);
        intent.setAction("com.igexin.sdk.action." + d.f63655a);
        intent.setPackage(d.f63671e.getPackageName());
        return intent;
    }

    public void a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("action", 10008);
        bundle.putInt(PushConsts.KEY_SERVICE_PIT, i10);
        a(bundle);
    }

    public void a(Intent intent) {
        if (this.f63776e != null) {
            b(intent);
        } else {
            this.f63773a.add(intent);
        }
    }

    public void a(Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtras(bundle);
        a(intent);
    }

    public void a(String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("action", 10013);
        bundle.putString(PushConsts.KEY_DEVICE_TOKEN, str);
        a(bundle);
    }

    public void a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putInt("action", 10010);
        bundle.putSerializable(PushConsts.KEY_CMD_MSG, new SetTagCmdMessage(str, str2, 10009));
        a(bundle);
    }

    public void a(String str, String str2, String str3, String str4) {
        byte[] msgExtra;
        com.igexin.a.a.c.b.a("startapp|broadcastPayload", new Object[0]);
        if (str4 != null) {
            msgExtra = str4.getBytes();
        } else {
            PushTaskBean pushTaskBean = d.f63658ac.get(com.igexin.push.core.a.e.a().a(str, str2));
            msgExtra = pushTaskBean != null ? pushTaskBean.getMsgExtra() : null;
        }
        if (msgExtra == null) {
            com.igexin.a.a.c.b.a("startapp|broadcast|payload is empty!", new Object[0]);
            return;
        }
        com.igexin.a.a.c.b.a("startapp|broadcast|payload = " + new String(msgExtra), new Object[0]);
        String str5 = d.f63655a;
        if (str5 != null && str5.equals(str3)) {
            Bundle bundle = new Bundle();
            bundle.putInt("action", 10001);
            bundle.putSerializable(PushConsts.KEY_MESSAGE_DATA, new GTTransmitMessage(str, str2, str2 + ":" + str, msgExtra));
            a(bundle);
        }
        a(str, str2, str3, msgExtra);
    }

    public void a(String str, String str2, String str3, String str4, long j10) {
        String str5 = d.f63655a;
        if (str5 != null && str5.equals(str)) {
            Bundle bundle = new Bundle();
            bundle.putInt("action", 10010);
            bundle.putSerializable(PushConsts.KEY_CMD_MSG, new FeedbackCmdMessage(str2, str3, str4, j10, 10006));
            a(bundle);
        }
        Intent intentG = g();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("action", 10006);
        bundle2.putString("appid", str);
        bundle2.putString("taskid", str2);
        bundle2.putString("actionid", str3);
        bundle2.putString("result", str4);
        bundle2.putLong("timestamp", j10);
        intentG.putExtras(bundle2);
        d.f63671e.sendBroadcast(intentG, d.az);
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Bundle bundle = new Bundle();
        bundle.putInt("action", 10011);
        bundle.putSerializable(PushConsts.KEY_NOTIFICATION_ARRIVED, new GTNotificationMessage(str, str2, str3, str4, str5, str6, str7));
        a(bundle);
    }

    public void b() {
        Bundle bundle = new Bundle();
        bundle.putInt("action", 10007);
        bundle.putBoolean(PushConsts.KEY_ONLINE_STATE, d.f63678l);
        a(bundle);
        Intent intentG = g();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("action", 10007);
        bundle2.putBoolean(PushConsts.KEY_ONLINE_STATE, d.f63678l);
        intentG.putExtras(bundle2);
        d.f63671e.sendBroadcast(intentG, d.az);
    }

    public void b(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putInt("action", 10010);
        bundle.putSerializable(PushConsts.KEY_CMD_MSG, new BindAliasCmdMessage(str, str2, 10010));
        a(bundle);
    }

    public void b(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Bundle bundle = new Bundle();
        bundle.putInt("action", 10012);
        bundle.putSerializable(PushConsts.KEY_NOTIFICATION_CLICKED, new GTNotificationMessage(str, str2, str3, str4, str5, str6, str7));
        a(bundle);
    }

    public void c() {
        Log.d("PushService", "clientid is " + d.f63685s);
        com.igexin.a.a.c.b.a("broadcastClientId|" + d.f63685s, new Object[0]);
        Bundle bundle = new Bundle();
        bundle.putInt("action", 10002);
        bundle.putString(PushConsts.KEY_CLIENT_ID, d.f63685s);
        a(bundle);
        Intent intentG = g();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("action", 10002);
        bundle2.putString(PushConsts.KEY_CLIENT_ID, d.f63685s);
        intentG.putExtras(bundle2);
        d.f63671e.sendBroadcast(intentG, d.az);
    }

    public void c(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putInt("action", 10010);
        bundle.putSerializable(PushConsts.KEY_CMD_MSG, new UnBindAliasCmdMessage(str, str2, 10011));
        a(bundle);
    }

    public Class d() {
        return x.a().c(d.f63671e);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i10 = message.what;
        super.handleMessage(message);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.igexin.a.a.c.b.a("MsgServerSender|remote iservice connected ", new Object[0]);
        Message.obtain(this.f63774c.a(), 1, iBinder).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        com.igexin.a.a.c.b.a("MsgServerSender|remote iservice disConnected ~~~", new Object[0]);
        Message.obtain(this.f63774c.a(), 2, 0, 0).sendToTarget();
    }
}
