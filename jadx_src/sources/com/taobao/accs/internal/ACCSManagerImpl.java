package com.taobao.accs.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import anet.channel.SessionCenter;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.ErrorCode;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.ILoginInfo;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.Message;
import com.taobao.accs.data.g;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.j;
import com.taobao.accs.utl.k;
import com.taobao.accs.utl.l;
import com.taobao.accs.utl.v;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.android.agoo.common.Config;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class ACCSManagerImpl implements com.taobao.accs.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f98276c = "ACCSMgrImpl_";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f98278b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.taobao.accs.c f98279d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f98277a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Random f98280e = new Random();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private l.b f98281f = new a(this);

    public ACCSManagerImpl(Context context, String str) {
        GlobalClientInfo.f98171a = context.getApplicationContext();
        this.f98278b = str;
        this.f98279d = new c(str);
        if (v.e(context)) {
            l.a().a(this.f98281f);
        }
        f98276c += this.f98278b;
    }

    private void a(Context context, int i10, String str, String str2) {
        Intent intent = new Intent(Constants.ACTION_RECEIVE);
        intent.setPackage(context.getPackageName());
        intent.putExtra("command", i10);
        intent.putExtra(Constants.KEY_SERVICE_ID, str);
        intent.putExtra(Constants.KEY_DATA_ID, str2);
        intent.putExtra("appKey", this.f98279d.c());
        intent.putExtra(Constants.KEY_CONFIG_TAG, this.f98278b);
        intent.putExtra(Constants.KEY_ERROR_CODE, i10 == 2 ? 200 : 300);
        g.a(context, intent);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00c8  */
    private void a(Context context, Message message, int i10, boolean z10) {
        boolean z11;
        this.f98279d.a();
        if (message == null) {
            ALog.e(f98276c, "message is null", new Object[0]);
            this.f98279d.a(Message.buildParameterError(context.getPackageName(), i10), -2);
            return;
        }
        if (i10 == 1) {
            String packageName = message.getPackageName();
            if (!this.f98279d.e(packageName) || z10) {
                z11 = true;
            } else {
                ALog.i(f98276c, "isAppBinded", "package", packageName);
                this.f98279d.a(message, 200);
                z11 = false;
            }
        } else if (i10 != 2) {
            if (i10 == 3 && this.f98279d.a(message.getPackageName(), message.userinfo) && !z10) {
                ALog.i(f98276c, message.getPackageName() + "/" + message.userinfo + " isUserBinded", "isForceBind", Boolean.valueOf(z10));
                this.f98279d.a(message, 200);
                z11 = false;
            } else {
                z11 = true;
            }
        } else if (this.f98279d.f(message.getPackageName())) {
            ALog.i(f98276c, message.getPackageName() + " isAppUnbinded", new Object[0]);
            this.f98279d.a(message, 200);
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            ALog.i(f98276c, "sendControlMessage", "command", Integer.valueOf(i10));
            this.f98279d.a(message, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.taobao.accs.c cVar) {
        ThreadPoolExecutorFactory.schedule(new b(this, cVar), this.f98280e.nextInt(6), TimeUnit.SECONDS);
    }

    private Intent b(Context context, int i10) {
        if (i10 == 1 || !UtilityImpl.d(context)) {
            Intent intent = new Intent();
            intent.setAction(Constants.ACTION_COMMAND);
            intent.setClassName(context.getPackageName(), j.channelService);
            intent.putExtra("packageName", context.getPackageName());
            intent.putExtra("command", i10);
            intent.putExtra("appKey", this.f98279d.c());
            intent.putExtra(Constants.KEY_CONFIG_TAG, this.f98278b);
            return intent;
        }
        ALog.e(f98276c, "getIntent null command:" + i10 + " accs enabled:" + UtilityImpl.d(context), new Object[0]);
        return null;
    }

    @Override // com.taobao.accs.b
    public String a(Context context, ACCSManager.AccsRequest accsRequest) {
        try {
            boolean zD = UtilityImpl.d(context);
            if (!UtilityImpl.isMainProcess(context)) {
                ALog.e(f98276c, "sendData not in mainprocess", new Object[0]);
                return null;
            }
            if (!zD && accsRequest != null) {
                if (TextUtils.isEmpty(this.f98279d.c())) {
                    k.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "data appkey null");
                    ALog.e(f98276c, "sendData appkey null", new Object[0]);
                    return null;
                }
                this.f98279d.a();
                Message messageBuildSendData = Message.buildSendData(this.f98279d.b((String) null), this.f98278b, this.f98279d.e(), context, context.getPackageName(), accsRequest);
                if (messageBuildSendData != null && messageBuildSendData.getNetPermanceMonitor() != null) {
                    messageBuildSendData.getNetPermanceMonitor().onSend();
                }
                if (ALog.isPrintLog(ALog.Level.D) || "accs-impaas".equals(messageBuildSendData.serviceId)) {
                    ALog.e(f98276c, "sendMessage", Constants.KEY_DATA_ID, messageBuildSendData.getDataId());
                }
                this.f98279d.a(messageBuildSendData, true);
                return accsRequest.dataId;
            }
            if (zD) {
                k.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "accs disable");
            } else {
                k.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", "data null");
            }
            ALog.e(f98276c, "sendData dataInfo null or disable:" + zD, new Object[0]);
            return null;
        } catch (Throwable th2) {
            k.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "data " + th2.toString());
            ALog.e(f98276c, "sendData", th2, "dataid", accsRequest.dataId);
        }
    }

    @Override // com.taobao.accs.b
    public String a(Context context, ACCSManager.AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo) {
        try {
            if (context == null || accsRequest == null) {
                ALog.e(f98276c, "sendPushResponse input null", com.umeng.analytics.pro.d.R, context, "response", accsRequest, "extraInfo", extraInfo);
                k.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", "sendPushResponse null");
                return null;
            }
            k.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "push response total");
            if (UtilityImpl.d(context)) {
                k.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "sendPushResponse accs disable");
                return null;
            }
            String strC = this.f98279d.c();
            if (TextUtils.isEmpty(strC)) {
                k.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "sendPushResponse appkey null");
                ALog.e(f98276c, "sendPushResponse appkey null", new Object[0]);
                return null;
            }
            if (extraInfo == null) {
                extraInfo = new TaoBaseService.ExtraInfo();
            }
            extraInfo.connType = 1;
            extraInfo.fromHost = "https://" + AccsClientConfig.getConfigByTag(Config.c(context)).getInappHost();
            extraInfo.fromPackage = context.getPackageName();
            ALog.i(f98276c, "sendPushResponse", "isMainProcess", Boolean.valueOf(UtilityImpl.isMainProcess(context)));
            accsRequest.host = new URL(extraInfo.fromHost);
            if (UtilityImpl.isMainProcess(context)) {
                a(context, accsRequest, context.getPackageName(), false);
            } else {
                Intent intent = new Intent(Constants.ACTION_SEND);
                intent.setClassName(extraInfo.fromPackage, j.msgService);
                intent.putExtra("packageName", context.getPackageName());
                intent.putExtra(Constants.KEY_SEND_REQDATA, accsRequest);
                intent.putExtra("appKey", strC);
                intent.putExtra(Constants.KEY_CONFIG_TAG, this.f98278b);
                com.taobao.accs.a.a.a(context, intent);
            }
            return null;
        } catch (Throwable th2) {
            k.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "push response " + th2.toString());
            ALog.e(f98276c, "sendPushResponse dataid:" + accsRequest.dataId, th2, new Object[0]);
        }
    }

    @Override // com.taobao.accs.b
    public String a(Context context, ACCSManager.AccsRequest accsRequest, String str, boolean z10) {
        try {
            if (accsRequest == null) {
                ALog.e(f98276c, "sendRequest request null", new Object[0]);
                k.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, null, "1", "request null");
                return null;
            }
            if (!UtilityImpl.isMainProcess(context)) {
                ALog.e(f98276c, "sendRequest not in mainprocess", new Object[0]);
                return null;
            }
            if (UtilityImpl.d(context)) {
                ALog.e(f98276c, "sendRequest disable", new Object[0]);
                k.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "accs disable");
                return null;
            }
            if (TextUtils.isEmpty(this.f98279d.c())) {
                k.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "request appkey null");
                ALog.e(f98276c, "sendRequest appkey null", new Object[0]);
                return null;
            }
            this.f98279d.a();
            Message messageBuildRequest = Message.buildRequest(context, this.f98279d.b((String) null), this.f98278b, "", str == null ? context.getPackageName() : str, Constants.TARGET_SERVICE_PRE, accsRequest, z10);
            if (messageBuildRequest != null && messageBuildRequest.getNetPermanceMonitor() != null) {
                messageBuildRequest.getNetPermanceMonitor().onSend();
            }
            this.f98279d.a(messageBuildRequest, true);
            return accsRequest.dataId;
        } catch (Throwable th2) {
            if (accsRequest != null) {
                k.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "request " + th2.toString());
                ALog.e(f98276c, "sendRequest", th2, Constants.KEY_DATA_ID, accsRequest.dataId);
            }
        }
    }

    @Override // com.taobao.accs.b
    public String a(Context context, String str, String str2, byte[] bArr, String str3) {
        return a(context, str, str2, bArr, str3, (String) null);
    }

    @Override // com.taobao.accs.b
    public String a(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        return a(context, str, str2, bArr, str3, str4, null);
    }

    @Override // com.taobao.accs.b
    public String a(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        return a(context, new ACCSManager.AccsRequest(str, str2, bArr, str3, str4, url, null));
    }

    @Override // com.taobao.accs.b
    public void a(Context context) {
        if (UtilityImpl.d(context) || UtilityImpl.d(context)) {
            return;
        }
        Intent intentB = b(context, 4);
        if (intentB == null) {
            a(context, 4, (String) null, (String) null);
            return;
        }
        String strC = this.f98279d.c();
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        intentB.putExtra("appKey", strC);
        if (UtilityImpl.isMainProcess(context)) {
            a(context, Message.buildUnbindUser(this.f98279d.b((String) null), this.f98278b, intentB), 4, false);
        }
    }

    @Override // com.taobao.accs.b
    @Deprecated
    public void a(Context context, int i10) {
        ACCSClient.setEnvironment(context, i10);
    }

    @Override // com.taobao.accs.b
    public void a(Context context, ILoginInfo iLoginInfo) {
        GlobalClientInfo.getInstance(context).setLoginInfoImpl(this.f98278b, iLoginInfo);
    }

    @Override // com.taobao.accs.b
    public void a(Context context, String str) {
        a(context, str, false);
    }

    @Override // com.taobao.accs.b
    public void a(Context context, String str, int i10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
        if (!TextUtils.isEmpty(str)) {
            editorEdit.putString(Constants.KEY_PROXY_HOST, str);
        }
        editorEdit.putInt(Constants.KEY_PROXY_PORT, i10);
        editorEdit.apply();
    }

    @Override // com.taobao.accs.b
    public void a(Context context, String str, AccsAbstractDataListener accsAbstractDataListener) {
        GlobalClientInfo.getInstance(context).registerListener(str, accsAbstractDataListener);
    }

    @Override // com.taobao.accs.b
    public void a(Context context, String str, String str2) {
        GlobalClientInfo.getInstance(context).registerService(str, str2);
    }

    @Override // com.taobao.accs.b
    public void a(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        GlobalClientInfo.getInstance(context).setAppReceiver(this.f98278b, iAppReceiver);
        if (!UtilityImpl.isMainProcess(context)) {
            ALog.d(f98276c, "inapp only init in main process!", new Object[0]);
            return;
        }
        ALog.d(f98276c, "startInAppConnection APPKEY:" + str, new Object[0]);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!TextUtils.equals(this.f98279d.c(), str)) {
            this.f98279d.c(str2);
            this.f98279d.d(str);
        }
        this.f98279d.a();
    }

    @Override // com.taobao.accs.b
    public void a(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver) {
        if (context == null) {
            return;
        }
        ALog.i(f98276c, "bindApp", "appKey", str);
        Message messageBuildParameterError = Message.buildParameterError(context.getPackageName(), 1);
        if (UtilityImpl.d(context)) {
            ALog.e(f98276c, "accs disabled, try enable", new Object[0]);
            UtilityImpl.focusEnableService(context);
        }
        if (TextUtils.isEmpty(str)) {
            this.f98279d.a(messageBuildParameterError, -14);
            return;
        }
        this.f98279d.c(str3);
        this.f98279d.d(str);
        if (iAppReceiver != null) {
            GlobalClientInfo.getInstance(context).setAppReceiver(this.f98278b, iAppReceiver);
        }
        UtilityImpl.enableService(context);
        Intent intentB = b(context, 1);
        if (intentB == null) {
            return;
        }
        try {
            String str4 = GlobalClientInfo.getInstance(context).getPackageInfo().versionName;
            boolean z10 = UtilityImpl.c(context) || UtilityImpl.a(Constants.SP_FILE_NAME, context) || UtilityImpl.b(Constants.SP_FILE_NAME, context);
            if (z10) {
                ALog.d(f98276c, "bindApp", "need force bind");
                intentB.putExtra(Constants.KEY_FOUCE_BIND, true);
            }
            intentB.putExtra("appKey", str);
            intentB.putExtra(Constants.KEY_TTID, str3);
            intentB.putExtra("appVersion", str4);
            if (TextUtils.isEmpty(str2)) {
                str2 = this.f98279d.d();
            }
            intentB.putExtra("app_sercet", str2);
            if (UtilityImpl.isMainProcess(context)) {
                Message messageBuildBindApp = Message.buildBindApp(this.f98279d.b((String) null), this.f98278b, context, intentB);
                if (messageBuildBindApp != null && messageBuildBindApp.getNetPermanceMonitor() != null) {
                    messageBuildBindApp.getNetPermanceMonitor().setDataId(messageBuildBindApp.dataId);
                    messageBuildBindApp.getNetPermanceMonitor().setMsgType(1);
                    messageBuildBindApp.getNetPermanceMonitor().setHost(messageBuildBindApp.host.toString());
                }
                a(context, messageBuildBindApp, 1, z10);
            } else {
                ALog.w(f98276c, "bindApp only allow in main process", new Object[0]);
            }
            this.f98279d.b();
        } catch (Throwable th2) {
            ALog.e(f98276c, "bindApp exception", th2, new Object[0]);
        }
    }

    @Override // com.taobao.accs.b
    public void a(Context context, String str, boolean z10) {
        try {
            ALog.i(f98276c, "bindUser", "userId", str);
            if (UtilityImpl.d(context)) {
                ALog.e(f98276c, "accs disabled", new Object[0]);
                return;
            }
            Intent intentB = b(context, 3);
            if (intentB == null) {
                ALog.e(f98276c, "intent null", new Object[0]);
                a(context, 3, (String) null, (String) null);
                return;
            }
            String strC = this.f98279d.c();
            if (TextUtils.isEmpty(strC)) {
                ALog.e(f98276c, "appKey null", new Object[0]);
                return;
            }
            if (UtilityImpl.c(context) || z10) {
                ALog.i(f98276c, "force bind User", new Object[0]);
                intentB.putExtra(Constants.KEY_FOUCE_BIND, true);
                z10 = true;
            }
            intentB.putExtra("appKey", strC);
            intentB.putExtra(Constants.KEY_USER_ID, str);
            if (UtilityImpl.isMainProcess(context)) {
                Message messageBuildBindUser = Message.buildBindUser(this.f98279d.b((String) null), this.f98278b, intentB);
                if (messageBuildBindUser != null && messageBuildBindUser.getNetPermanceMonitor() != null) {
                    messageBuildBindUser.getNetPermanceMonitor().setDataId(messageBuildBindUser.dataId);
                    messageBuildBindUser.getNetPermanceMonitor().setMsgType(2);
                    messageBuildBindUser.getNetPermanceMonitor().setHost(messageBuildBindUser.host.toString());
                }
                a(context, messageBuildBindUser, 3, z10);
            }
            this.f98279d.b();
        } catch (Throwable th2) {
            ALog.e(f98276c, "bindUser", th2, new Object[0]);
        }
    }

    @Override // com.taobao.accs.b
    public void a(AccsClientConfig accsClientConfig) {
        this.f98279d.a(accsClientConfig);
    }

    @Override // com.taobao.accs.b
    public void a(AccsConnectStateListener accsConnectStateListener) {
        if (accsConnectStateListener != null) {
            this.f98279d.a(accsConnectStateListener);
        }
    }

    @Override // com.taobao.accs.b
    public void a(String str, String str2, String str3, short s10, String str4, Map<Integer, String> map) {
        this.f98279d.a(Message.buildPushAck(this.f98279d.b((String) null), this.f98278b, str, str2, str3, true, s10, str4, map), true);
    }

    @Override // com.taobao.accs.b
    public boolean a() {
        try {
            com.taobao.accs.c cVar = this.f98279d;
            return cVar != null && cVar.f();
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // com.taobao.accs.b
    public boolean a(int i10) {
        return ErrorCode.isChannelError(i10);
    }

    @Override // com.taobao.accs.b
    public boolean a(String str) {
        return this.f98279d.a(str);
    }

    @Override // com.taobao.accs.b
    public String b(Context context, ACCSManager.AccsRequest accsRequest) {
        return a(context, accsRequest, (String) null, true);
    }

    @Override // com.taobao.accs.b
    public String b(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        return b(context, str, str2, bArr, str3, str4, null);
    }

    @Override // com.taobao.accs.b
    public String b(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        return b(context, new ACCSManager.AccsRequest(str, str2, bArr, str3, str4, url, null));
    }

    @Override // com.taobao.accs.b
    public Map<String, Boolean> b() throws Exception {
        String strB = this.f98279d.b((String) null);
        HashMap map = new HashMap();
        map.put(strB, Boolean.FALSE);
        if (SessionCenter.getInstance(this.f98279d.c()).getThrowsException(strB, 60000L) != null) {
            map.put(strB, Boolean.TRUE);
        }
        ALog.d(f98276c, "getChannelState " + map.toString(), new Object[0]);
        return map;
    }

    @Override // com.taobao.accs.b
    public void b(Context context, String str) {
        if (UtilityImpl.d(context) || UtilityImpl.d(context)) {
            return;
        }
        Intent intentB = b(context, 5);
        if (intentB == null) {
            a(context, 5, str, (String) null);
            return;
        }
        String strC = this.f98279d.c();
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        intentB.putExtra("appKey", strC);
        intentB.putExtra(Constants.KEY_SERVICE_ID, str);
        if (UtilityImpl.isMainProcess(context)) {
            Message messageBuildBindService = Message.buildBindService(this.f98279d.b((String) null), this.f98278b, intentB);
            if (messageBuildBindService != null && messageBuildBindService.getNetPermanceMonitor() != null) {
                messageBuildBindService.getNetPermanceMonitor().setDataId(messageBuildBindService.dataId);
                messageBuildBindService.getNetPermanceMonitor().setMsgType(3);
                messageBuildBindService.getNetPermanceMonitor().setHost(messageBuildBindService.host.toString());
            }
            a(context, messageBuildBindService, 5, false);
        }
        this.f98279d.b();
    }

    @Override // com.taobao.accs.b
    public void b(AccsConnectStateListener accsConnectStateListener) {
        if (accsConnectStateListener != null) {
            this.f98279d.b(accsConnectStateListener);
        }
    }

    @Override // com.taobao.accs.b
    public boolean b(Context context) {
        return UtilityImpl.i(context);
    }

    @Override // com.taobao.accs.b
    public Map<String, Boolean> c() throws Exception {
        SessionCenter.getInstance(this.f98279d.c()).forceRecreateAccsSession();
        return b();
    }

    @Override // com.taobao.accs.b
    public void c(Context context) {
        UtilityImpl.focusDisableService(context);
    }

    @Override // com.taobao.accs.b
    public void c(Context context, String str) {
        if (UtilityImpl.d(context)) {
            return;
        }
        Intent intentB = b(context, 6);
        if (intentB == null) {
            a(context, 6, str, (String) null);
            return;
        }
        String strC = this.f98279d.c();
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        intentB.putExtra("appKey", strC);
        intentB.putExtra(Constants.KEY_SERVICE_ID, str);
        if (UtilityImpl.isMainProcess(context)) {
            a(context, Message.buildUnbindService(this.f98279d.b((String) null), this.f98278b, intentB), 6, false);
        }
    }

    @Override // com.taobao.accs.b
    public void d(Context context) {
        UtilityImpl.focusEnableService(context);
    }

    @Override // com.taobao.accs.b
    public void d(Context context, String str) {
        GlobalClientInfo.getInstance(context).unRegisterService(str);
    }

    @Override // com.taobao.accs.b
    public void e(Context context) {
        GlobalClientInfo.getInstance(context).clearLoginInfoImpl();
    }

    @Override // com.taobao.accs.b
    public void e(Context context, String str) {
        GlobalClientInfo.getInstance(context).unregisterListener(str);
    }
}
