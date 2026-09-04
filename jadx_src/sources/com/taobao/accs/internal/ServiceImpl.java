package com.taobao.accs.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.exoplayer2.audio.q0;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.igexin.sdk.PushConsts;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.Message;
import com.taobao.accs.data.g;
import com.taobao.accs.net.v;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.k;
import com.taobao.accs.utl.q;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.android.agoo.service.IMessageService;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class ServiceImpl extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Service f98282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f98283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f98284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f98285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final IMessageService.Stub f98286f;

    /* JADX INFO: renamed from: com.taobao.accs.internal.ServiceImpl$1, reason: invalid class name */
    /* JADX INFO: compiled from: Taobao */
    public class AnonymousClass1 extends IMessageService.Stub {
        AnonymousClass1() {
        }

        @Override // org.android.agoo.service.IMessageService
        public boolean ping() throws RemoteException {
            return true;
        }

        @Override // org.android.agoo.service.IMessageService
        public void probe() throws RemoteException {
            ALog.d("ServiceImpl", "ReceiverImpl probeTaoBao begin......messageServiceBinder [probe]", new Object[0]);
            ThreadPoolExecutorFactory.execute(new e(this));
        }
    }

    public ServiceImpl(Service service) {
        super(service);
        this.f98282b = null;
        this.f98285e = "unknown";
        this.f98286f = new AnonymousClass1();
        this.f98282b = service;
        this.f98283c = service.getApplicationContext();
    }

    private void a() {
        ALog.d("ServiceImpl", "init start", new Object[0]);
        GlobalClientInfo.getInstance(this.f98283c);
        com.taobao.accs.client.a.f98190f.incrementAndGet();
        this.f98284d = System.currentTimeMillis();
        this.f98285e = UtilityImpl.h(this.f98283c);
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i("ServiceImpl", lg.a.f131415h, "sdkVersion", 221, "procStart", Integer.valueOf(com.taobao.accs.client.a.f98190f.intValue()));
        }
        UTMini.getInstance().commitEvent(66001, "START", UtilityImpl.h(), "PROXY");
        long jK = UtilityImpl.k(this.f98283c);
        ALog.d("ServiceImpl", "getServiceAliveTime", "aliveTime", Long.valueOf(jK));
        if (jK > q0.f44202v) {
            k.a("accs", BaseMonitor.COUNT_SERVICE_ALIVE, "", jK / 1000);
        }
        UtilityImpl.a(this.f98283c, Constants.SP_KEY_SERVICE_START, System.currentTimeMillis());
        UTMini.getInstance().commitEvent(66001, "NOTIFY", UtilityImpl.o(this.f98283c));
    }

    private void a(Intent intent, String str) {
        ALog.d("ServiceImpl", "handleAction", "action", str);
        try {
            if (!TextUtils.isEmpty(str) && "org.agoo.android.intent.action.PING_V4".equals(str)) {
                String stringExtra = intent.getStringExtra("source");
                ALog.i("ServiceImpl", "org.agoo.android.intent.action.PING_V4,start channel by brothers", "serviceStart", Integer.valueOf(com.taobao.accs.client.a.f98190f.intValue()), "source" + stringExtra);
                k.a("accs", "startChannel", stringExtra, 0.0d);
                if (com.taobao.accs.client.a.c()) {
                    k.a("accs", "createChannel", stringExtra, 0.0d);
                }
            }
            b();
            if (TextUtils.equals(str, "android.intent.action.PACKAGE_REMOVED")) {
                return;
            }
            if (!TextUtils.equals(str, "android.net.conn.CONNECTIVITY_CHANGE")) {
                if (TextUtils.equals(str, PushConsts.ACTION_BROADCAST_TO_BOOT)) {
                    a(true, false);
                    return;
                }
                if (TextUtils.equals(str, PushConsts.ACTION_BROADCAST_USER_PRESENT)) {
                    ALog.d("ServiceImpl", "action android.intent.action.USER_PRESENT", new Object[0]);
                    a(true, false);
                    return;
                } else if (str.equals(Constants.ACTION_COMMAND)) {
                    b(intent);
                    return;
                } else {
                    if (str.equals(Constants.ACTION_START_FROM_AGOO)) {
                        ALog.i("ServiceImpl", "ACTION_START_FROM_AGOO", new Object[0]);
                        return;
                    }
                    return;
                }
            }
            String strH = UtilityImpl.h(this.f98283c);
            boolean zI = UtilityImpl.i(this.f98283c);
            ALog.i("ServiceImpl", "network change:" + this.f98285e + " to " + strH, new Object[0]);
            if (zI) {
                this.f98285e = strH;
                c();
                a(true, false);
                UTMini.getInstance().commitEvent(66001, "CONNECTIVITY_CHANGE", strH, UtilityImpl.h(), "0");
            }
            if (strH.equals("unknown")) {
                c();
                this.f98285e = strH;
            }
        } catch (Throwable th2) {
            ALog.e("ServiceImpl", "handleAction", th2, new Object[0]);
        }
    }

    private void a(Message message, boolean z10) {
        ConcurrentHashMap<String, com.taobao.accs.net.a> concurrentHashMap = d.f98291a;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return;
        }
        Iterator<Map.Entry<String, com.taobao.accs.net.a>> it = d.f98291a.entrySet().iterator();
        while (it.hasNext()) {
            com.taobao.accs.net.a value = it.next().getValue();
            if (value instanceof com.taobao.accs.net.k) {
                value.a(true, false);
            } else {
                value.b(message, z10);
            }
        }
    }

    private void a(boolean z10, boolean z11) {
        ConcurrentHashMap<String, com.taobao.accs.net.a> concurrentHashMap = d.f98291a;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return;
        }
        Iterator<Map.Entry<String, com.taobao.accs.net.a>> it = d.f98291a.entrySet().iterator();
        while (it.hasNext()) {
            com.taobao.accs.net.a value = it.next().getValue();
            value.a(z10, z11);
            ALog.i("ServiceImpl", "ping connection", "appkey", value.i());
        }
    }

    private synchronized void b() {
        ConcurrentHashMap<String, com.taobao.accs.net.a> concurrentHashMap = d.f98291a;
        if (concurrentHashMap != null && concurrentHashMap.size() != 0) {
            for (Map.Entry<String, com.taobao.accs.net.a> entry : d.f98291a.entrySet()) {
                com.taobao.accs.net.a value = entry.getValue();
                if (value == null) {
                    ALog.e("ServiceImpl", "tryConnect connection null", "appkey", value.i());
                    return;
                }
                ALog.i("ServiceImpl", "tryConnect", "appkey", value.i(), Constants.KEY_CONFIG_TAG, entry.getKey());
                if (value.l() && TextUtils.isEmpty(value.f98305i.getAppSecret())) {
                    ALog.e("ServiceImpl", "tryConnect secret is null", new Object[0]);
                } else {
                    value.a();
                }
            }
            return;
        }
        ALog.w("ServiceImpl", "tryConnect no connections", new Object[0]);
    }

    private void b(Intent intent) {
        Message.ReqType reqType;
        URL url;
        Message messageBuildRequest;
        int intExtra = intent.getIntExtra("command", -1);
        ALog.i("ServiceImpl", "handleCommand", "command", Integer.valueOf(intExtra));
        String stringExtra = intent.getStringExtra("packageName");
        String stringExtra2 = intent.getStringExtra(Constants.KEY_SERVICE_ID);
        String stringExtra3 = intent.getStringExtra(Constants.KEY_USER_ID);
        String stringExtra4 = intent.getStringExtra("appKey");
        String stringExtra5 = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
        String stringExtra6 = intent.getStringExtra(Constants.KEY_TTID);
        intent.getStringExtra("sid");
        intent.getStringExtra(Constants.KEY_ANTI_BRUSH_COOKIE);
        if (intExtra == 201) {
            a(Message.BuildPing(true, 0), true);
            d();
        }
        if (intExtra <= 0 || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        com.taobao.accs.net.a aVarB = d.b(this.f98283c, stringExtra5, true);
        if (aVarB == null) {
            ALog.e("ServiceImpl", "no connection", Constants.KEY_CONFIG_TAG, stringExtra5, "command", Integer.valueOf(intExtra));
            return;
        }
        aVarB.a();
        Message messageBuildUnbindUser = null;
        if (intExtra == 1) {
            if (!stringExtra.equals(this.f98283c.getPackageName())) {
                ALog.e("ServiceImpl", "handleCommand bindapp pkg error", new Object[0]);
                return;
            }
            Message messageBuildBindApp = Message.buildBindApp(this.f98283c, stringExtra5, stringExtra4, intent.getStringExtra("app_sercet"), stringExtra, stringExtra6, intent.getStringExtra("appVersion"));
            aVarB.f98297a = stringExtra6;
            if (aVarB.j().c(stringExtra) && !intent.getBooleanExtra(Constants.KEY_FOUCE_BIND, false)) {
                ALog.i("ServiceImpl", stringExtra + " isAppBinded", new Object[0]);
                aVarB.b(messageBuildBindApp, 200);
                return;
            }
            messageBuildUnbindUser = messageBuildBindApp;
        } else if (intExtra == 2) {
            ALog.e("ServiceImpl", "onHostStartCommand COMMAND_UNBIND_APP", new Object[0]);
            if (aVarB.j().d(stringExtra)) {
                Message messageBuildUnbindApp = Message.buildUnbindApp(aVarB.b((String) null), stringExtra);
                ALog.i("ServiceImpl", stringExtra + " isAppUnbinded", new Object[0]);
                aVarB.b(messageBuildUnbindApp, 200);
                return;
            }
        } else if (intExtra == 5) {
            messageBuildUnbindUser = Message.buildBindService(aVarB.b((String) null), stringExtra2);
        } else if (intExtra == 6) {
            messageBuildUnbindUser = Message.buildUnbindService(stringExtra, stringExtra2);
        } else if (intExtra == 3) {
            messageBuildUnbindUser = Message.buildBindUser(stringExtra, stringExtra3);
            if (aVarB.j().b(stringExtra, stringExtra3) && !intent.getBooleanExtra(Constants.KEY_FOUCE_BIND, false)) {
                ALog.i("ServiceImpl", stringExtra + "/" + stringExtra3 + " isUserBinded", new Object[0]);
                if (messageBuildUnbindUser != null) {
                    aVarB.b(messageBuildUnbindUser, 200);
                    return;
                }
                return;
            }
        } else if (intExtra == 4) {
            messageBuildUnbindUser = Message.buildUnbindUser(stringExtra);
        } else if (intExtra == 100) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("data");
            String stringExtra7 = intent.getStringExtra(Constants.KEY_DATA_ID);
            String stringExtra8 = intent.getStringExtra("target");
            String stringExtra9 = intent.getStringExtra(Constants.KEY_BUSINESSID);
            String stringExtra10 = intent.getStringExtra(Constants.KEY_EXT_TAG);
            try {
                reqType = (Message.ReqType) intent.getSerializableExtra(Constants.KEY_SEND_TYPE);
            } catch (Exception unused) {
                reqType = null;
            }
            if (byteArrayExtra != null) {
                try {
                    url = new URL("https://" + ((v) aVarB).p());
                } catch (MalformedURLException e10) {
                    e10.printStackTrace();
                    url = null;
                }
                Message.ReqType reqType2 = reqType;
                ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(stringExtra3, stringExtra2, byteArrayExtra, stringExtra7, stringExtra8, url, stringExtra9);
                accsRequest.setTag(stringExtra10);
                if (reqType2 == null) {
                    messageBuildRequest = Message.buildSendData(aVarB.b((String) null), stringExtra5, aVarB.f98305i.getStoreId(), this.f98283c, stringExtra, accsRequest, false);
                } else if (reqType2 == Message.ReqType.REQ) {
                    messageBuildRequest = Message.buildRequest(this.f98283c, aVarB.b((String) null), stringExtra5, aVarB.f98305i.getStoreId(), stringExtra, Constants.TARGET_SERVICE_PRE, accsRequest, false);
                }
                messageBuildUnbindUser = messageBuildRequest;
            }
        } else if (intExtra == 106) {
            intent.setAction(Constants.ACTION_RECEIVE);
            intent.putExtra("command", -1);
            g.a().b(this.f98283c, intent);
            return;
        }
        if (messageBuildUnbindUser == null) {
            ALog.e("ServiceImpl", "message is null", new Object[0]);
            aVarB.b(Message.buildParameterError(stringExtra, intExtra), -2);
        } else {
            ALog.d("ServiceImpl", "try send message", new Object[0]);
            if (messageBuildUnbindUser.getNetPermanceMonitor() != null) {
                messageBuildUnbindUser.getNetPermanceMonitor().onSend();
            }
            aVarB.b(messageBuildUnbindUser, true);
        }
    }

    private void c() {
        ConcurrentHashMap<String, com.taobao.accs.net.a> concurrentHashMap = d.f98291a;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return;
        }
        Iterator<Map.Entry<String, com.taobao.accs.net.a>> it = d.f98291a.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    private void d() {
        ConcurrentHashMap<String, com.taobao.accs.net.a> concurrentHashMap = d.f98291a;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return;
        }
        Iterator<Map.Entry<String, com.taobao.accs.net.a>> it = d.f98291a.entrySet().iterator();
        while (it.hasNext()) {
            com.taobao.accs.ut.a.c cVarC = it.next().getValue().c();
            if (cVarC != null) {
                cVarC.f98411h = this.f98284d;
                cVarC.a();
            }
        }
    }

    private void e() {
        ConcurrentHashMap<String, com.taobao.accs.net.a> concurrentHashMap = d.f98291a;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return;
        }
        Iterator<Map.Entry<String, com.taobao.accs.net.a>> it = d.f98291a.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().e();
        }
    }

    @Override // com.taobao.accs.internal.d
    public int a(Intent intent) {
        Bundle extras;
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i("ServiceImpl", "onHostStartCommand", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent);
        }
        try {
            if (ALog.isPrintLog(ALog.Level.D) && intent != null && (extras = intent.getExtras()) != null) {
                for (String str : extras.keySet()) {
                    ALog.d("ServiceImpl", "onHostStartCommand", "key", str, " value", extras.get(str));
                }
            }
            int iC = q.c();
            if (iC > 3) {
                ALog.e("ServiceImpl", "onHostStartCommand load SO fail 4 times, don't auto restart", new Object[0]);
                k.a("accs", BaseMonitor.COUNT_POINT_SOFAIL, UtilityImpl.a(iC), 0.0d);
            }
            String action = intent == null ? null : intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                a(intent, action);
                return 2;
            }
            b();
            a(false, false);
            com.taobao.accs.client.a.f98190f.incrementAndGet();
            return 2;
        } catch (Throwable th2) {
            try {
                ALog.e("ServiceImpl", "onHostStartCommand", th2, new Object[0]);
            } finally {
                com.taobao.accs.client.a.f98190f.incrementAndGet();
            }
        }
    }

    @Override // com.taobao.accs.internal.d, com.taobao.accs.base.IBaseService
    public IBinder onBind(Intent intent) {
        String action = intent.getAction();
        ALog.d("ServiceImpl", "accs probeTaoBao begin......action=" + action, new Object[0]);
        if (TextUtils.isEmpty(action) || !TextUtils.equals(action, "org.agoo.android.intent.action.PING_V4")) {
            return null;
        }
        UTMini.getInstance().commitEvent(66001, "probeChannelService", UtilityImpl.j(this.f98283c), intent.getStringExtra("source"));
        return this.f98286f;
    }

    @Override // com.taobao.accs.internal.d, com.taobao.accs.base.IBaseService
    public void onCreate() {
        super.onCreate();
        a();
    }

    @Override // com.taobao.accs.internal.d, com.taobao.accs.base.IBaseService
    public void onDestroy() {
        super.onDestroy();
        ALog.e("ServiceImpl", "Service onDestroy", new Object[0]);
        UtilityImpl.a(this.f98283c, Constants.SP_KEY_SERVICE_END, System.currentTimeMillis());
        this.f98282b = null;
        this.f98283c = null;
        e();
        Process.killProcess(Process.myPid());
    }

    @Override // com.taobao.accs.internal.d, com.taobao.accs.base.IBaseService
    public boolean onUnbind(Intent intent) {
        return false;
    }
}
