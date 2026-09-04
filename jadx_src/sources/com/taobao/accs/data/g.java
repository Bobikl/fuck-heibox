package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.IAppReceiverV1;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.t;
import com.vivo.push.PushClientConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.android.agoo.common.Config;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Set<String> f98262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile g f98263b;

    public static g a() {
        if (f98263b == null) {
            synchronized (g.class) {
                if (f98263b == null) {
                    f98263b = new g();
                }
            }
        }
        return f98263b;
    }

    public static void a(Context context, Intent intent) {
        try {
            String stringExtra = intent.getStringExtra(Constants.KEY_DATA_ID);
            String stringExtra2 = intent.getStringExtra(Constants.KEY_SERVICE_ID);
            if (ALog.isPrintLog(ALog.Level.D) || "accs-impaas".equals(stringExtra2)) {
                ALog.e("MsgDistribute", "distribMessage", Constants.KEY_DATA_ID, stringExtra);
            }
            ThreadPoolExecutorFactory.getScheduledExecutor().execute(new h(context, intent));
        } catch (Throwable th2) {
            ALog.e("MsgDistribute", "distribMessage", th2, new Object[0]);
            UTMini.getInstance().commitEvent(66001, "MsgToBuss8", "distribMessage" + th2.toString(), 221);
        }
    }

    private void a(Context context, Intent intent, String str, String str2, int i10, String str3, String str4, String str5, IAppReceiver iAppReceiver, int i11) {
        if (ALog.isPrintLog(ALog.Level.D)) {
            Object[] objArr = new Object[12];
            objArr[0] = Constants.KEY_CONFIG_TAG;
            objArr[1] = str;
            objArr[2] = Constants.KEY_DATA_ID;
            objArr[3] = str5;
            objArr[4] = Constants.KEY_SERVICE_ID;
            objArr[5] = str4;
            objArr[6] = "command";
            objArr[7] = Integer.valueOf(i10);
            objArr[8] = Constants.KEY_ERROR_CODE;
            objArr[9] = Integer.valueOf(i11);
            objArr[10] = "appReceiver";
            objArr[11] = iAppReceiver == null ? null : iAppReceiver.getClass().getName();
            ALog.d("MsgDistribute", "handleControlMsg", objArr);
        }
        if (iAppReceiver != null) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (i11 == 200) {
                        UtilityImpl.disableService(context);
                    }
                    iAppReceiver.onUnbindApp(i11);
                } else if (i10 == 3) {
                    iAppReceiver.onBindUser(str3, i11);
                } else if (i10 == 4) {
                    iAppReceiver.onUnbindUser(i11);
                } else if (i10 != 100) {
                    if (i10 == 101 && TextUtils.isEmpty(str4)) {
                        ALog.d("MsgDistribute", "handleControlMsg serviceId isEmpty", new Object[0]);
                        byte[] byteArrayExtra = intent.getByteArrayExtra("data");
                        if (byteArrayExtra != null) {
                            iAppReceiver.onData(str3, str5, byteArrayExtra);
                        }
                    }
                } else if (TextUtils.isEmpty(str4)) {
                    iAppReceiver.onSendData(str5, i11);
                }
            } else if (iAppReceiver instanceof IAppReceiverV1) {
                ((IAppReceiverV1) iAppReceiver).onBindApp(i11, null);
            } else {
                iAppReceiver.onBindApp(i11);
            }
        }
        if (i10 == 1 && GlobalClientInfo.f98172b != null && str2 != null && str2.equals(Config.a(context))) {
            ALog.d("MsgDistribute", "handleControlMsg agoo receiver onBindApp", new Object[0]);
            GlobalClientInfo.f98172b.onBindApp(i11, null);
            return;
        }
        if (iAppReceiver != null || i10 == 100 || i10 == 104 || i10 == 103) {
            return;
        }
        com.taobao.accs.utl.k.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, str4, "1", "appReceiver null return");
        UTMini.getInstance().commitEvent(66001, "MsgToBuss7", "commandId=" + i10, "serviceId=" + str4 + " errorCode=" + i11 + " dataId=" + str5, 221);
    }

    private boolean a(Context context, Intent intent, String str, String str2) {
        boolean z10;
        boolean booleanExtra = intent.getBooleanExtra("routingAck", false);
        boolean booleanExtra2 = intent.getBooleanExtra("routingMsg", false);
        if (booleanExtra) {
            ALog.e("MsgDistribute", "recieve routiong ack", Constants.KEY_DATA_ID, str, Constants.KEY_SERVICE_ID, str2);
            Set<String> set = f98262a;
            if (set != null) {
                set.remove(str);
            }
            com.taobao.accs.utl.k.a("accs", BaseMonitor.ALARM_MSG_ROUTING_RATE, "");
            z10 = true;
        } else {
            z10 = false;
        }
        if (booleanExtra2) {
            try {
                String stringExtra = intent.getStringExtra("packageName");
                ALog.e("MsgDistribute", "send routiong ack", Constants.KEY_DATA_ID, str, "to pkg", stringExtra, Constants.KEY_SERVICE_ID, str2);
                Intent intent2 = new Intent(Constants.ACTION_COMMAND);
                intent2.putExtra("command", 106);
                intent2.setClassName(stringExtra, com.taobao.accs.utl.j.channelService);
                intent2.putExtra("routingAck", true);
                intent2.putExtra("packageName", stringExtra);
                intent2.putExtra(Constants.KEY_DATA_ID, str);
                com.taobao.accs.a.a.a(context, intent2);
            } catch (Throwable th2) {
                ALog.e("MsgDistribute", "send routing ack", th2, Constants.KEY_SERVICE_ID, str2);
            }
        }
        return z10;
    }

    private boolean a(Context context, Intent intent, String str, String str2, String str3) {
        AccsClientConfig configByTag = !TextUtils.isEmpty(str3) ? AccsClientConfig.getConfigByTag(str3) : null;
        if (context.getPackageName().equals(intent.getPackage())) {
            return false;
        }
        if (configByTag != null && !configByTag.isPullUpEnable()) {
            return false;
        }
        try {
            ALog.e("MsgDistribute", "start MsgDistributeService", "receive pkg", context.getPackageName(), "target pkg", intent.getPackage(), Constants.KEY_SERVICE_ID, str2);
            intent.setClassName(intent.getPackage(), com.taobao.accs.utl.j.msgService);
            intent.putExtra("routingMsg", true);
            intent.putExtra("packageName", context.getPackageName());
            com.taobao.accs.a.a.a(context, intent);
            if (f98262a == null) {
                f98262a = new HashSet();
            }
            f98262a.add(str);
            ThreadPoolExecutorFactory.schedule(new i(this, str, str2, intent), 10L, TimeUnit.SECONDS);
        } catch (Throwable th2) {
            com.taobao.accs.utl.k.a("accs", BaseMonitor.ALARM_MSG_ROUTING_RATE, "", "exception", th2.toString());
            ALog.e("MsgDistribute", "routing msg error, try election", th2, Constants.KEY_SERVICE_ID, str2, Constants.KEY_DATA_ID, str);
        }
        return true;
    }

    protected void a(Context context, IAppReceiver iAppReceiver, Intent intent, String str, String str2, int i10, int i11) {
        ALog.Level level = ALog.Level.D;
        if (ALog.isPrintLog(level) || "accs-impaas".equals(str)) {
            ALog.e("MsgDistribute", "handleBusinessMsg start", Constants.KEY_DATA_ID, str2, Constants.KEY_SERVICE_ID, str, "command", Integer.valueOf(i10));
        }
        String service = GlobalClientInfo.getInstance(context).getService(intent.getStringExtra(Constants.KEY_CONFIG_TAG), str);
        if (TextUtils.isEmpty(service) && iAppReceiver != null) {
            service = iAppReceiver.getService(str);
        }
        if (TextUtils.isEmpty(service)) {
            service = GlobalClientInfo.getInstance(context).getService(str);
        }
        if (TextUtils.isEmpty(service)) {
            AccsDataListener listener = GlobalClientInfo.getInstance(context).getListener(str);
            if (listener != null) {
                if (ALog.isPrintLog(level) || "accs-impaas".equals(str)) {
                    ALog.e("MsgDistribute", "handleBusinessMsg getListener not null", new Object[0]);
                }
                com.taobao.accs.utl.a.a(context, intent, listener);
            } else {
                ALog.e("MsgDistribute", "handleBusinessMsg getListener also null", new Object[0]);
                com.taobao.accs.utl.k.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, str, "1", "service is null");
            }
        } else {
            if (ALog.isPrintLog(level) || "accs-impaas".equals(str)) {
                ALog.e("MsgDistribute", "handleBusinessMsg to start service", PushClientConstants.TAG_CLASS_NAME, service);
            }
            NetPerformanceMonitor netPerformanceMonitorA = com.taobao.accs.utl.a.a(intent);
            if (netPerformanceMonitorA != null) {
                netPerformanceMonitorA.start_service = System.currentTimeMillis();
            }
            intent.setClassName(context, service);
            com.taobao.accs.a.a.a(context, intent);
        }
        UTMini.getInstance().commitEvent(66001, "MsgToBuss", "commandId=" + i10, "serviceId=" + str + " errorCode=" + i11 + " dataId=" + str2, 221);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("2commandId=");
        sb2.append(i10);
        sb2.append("serviceId=");
        sb2.append(str);
        com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_POINT_TO_BUSS, sb2.toString(), 0.0d);
    }

    protected void a(Context context, Map<String, IAppReceiver> map, Intent intent, int i10, int i11) {
        ALog.e("MsgDistribute", "handBroadCastMsg", "command", Integer.valueOf(i10));
        HashMap map2 = new HashMap();
        if (map != null) {
            for (Map.Entry<String, IAppReceiver> entry : map.entrySet()) {
                Map<String, String> allService = GlobalClientInfo.getInstance(context).getAllService(entry.getKey());
                if (allService == null) {
                    allService = entry.getValue().getAllServices();
                }
                if (allService != null) {
                    map2.putAll(allService);
                }
            }
        }
        if (i10 != 103) {
            if (i10 != 104) {
                ALog.w("MsgDistribute", "handBroadCastMsg not handled command", new Object[0]);
                return;
            }
            for (String str : map2.keySet()) {
                String service = (String) map2.get(str);
                if (TextUtils.isEmpty(service)) {
                    service = GlobalClientInfo.getInstance(context).getService(str);
                }
                if (!TextUtils.isEmpty(service)) {
                    intent.setClassName(context, service);
                    com.taobao.accs.a.a.a(context, intent);
                }
            }
            return;
        }
        for (String str2 : map2.keySet()) {
            if ("accs".equals(str2) || "windvane".equals(str2) || "motu-remote".equals(str2)) {
                String service2 = (String) map2.get(str2);
                if (TextUtils.isEmpty(service2)) {
                    service2 = GlobalClientInfo.getInstance(context).getService(str2);
                }
                if (!TextUtils.isEmpty(service2)) {
                    intent.setClassName(context, service2);
                    com.taobao.accs.a.a.a(context, intent);
                }
            }
        }
        boolean booleanExtra = intent.getBooleanExtra(Constants.KEY_CONNECT_AVAILABLE, false);
        String stringExtra = intent.getStringExtra("host");
        String stringExtra2 = intent.getStringExtra(Constants.KEY_ERROR_DETAIL);
        boolean booleanExtra2 = intent.getBooleanExtra(Constants.KEY_TYPE_INAPP, false);
        boolean booleanExtra3 = intent.getBooleanExtra(Constants.KEY_CENTER_HOST, false);
        TaoBaseService.ConnectInfo connectInfo = null;
        if (!TextUtils.isEmpty(stringExtra)) {
            connectInfo = booleanExtra ? new TaoBaseService.ConnectInfo(stringExtra, booleanExtra2, booleanExtra3) : new TaoBaseService.ConnectInfo(stringExtra, booleanExtra2, booleanExtra3, i11, stringExtra2);
            connectInfo.connected = booleanExtra;
        }
        if (connectInfo == null) {
            ALog.e("MsgDistribute", "handBroadCastMsg connect info null, host empty", new Object[0]);
            return;
        }
        ALog.d("MsgDistribute", "handBroadCastMsg ACTION_CONNECT_INFO", connectInfo);
        Intent intent2 = new Intent(Constants.ACTION_CONNECT_INFO);
        intent2.setPackage(context.getPackageName());
        intent2.putExtra(Constants.KEY_CONNECT_INFO, connectInfo);
        context.sendBroadcast(intent2);
    }

    protected boolean a(int i10, String str) {
        if (i10 != 100 && !GlobalClientInfo.AGOO_SERVICE_ID.equals(str)) {
            long jE = UtilityImpl.e();
            if (jE != -1 && jE <= 5242880) {
                com.taobao.accs.utl.k.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, str, "1", "space low");
                ALog.e("MsgDistribute", "user space low, don't distribute", UiKitSpanObj.TYPE_SIZE, Long.valueOf(jE), Constants.KEY_SERVICE_ID, str);
                return true;
            }
        }
        return false;
    }

    protected boolean a(Context context, String str, String str2, Intent intent, IAppReceiver iAppReceiver) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String service = GlobalClientInfo.getInstance(context).getService(intent.getStringExtra(Constants.KEY_CONFIG_TAG), str);
            if (TextUtils.isEmpty(service) && iAppReceiver != null) {
                service = iAppReceiver.getService(str);
            }
            if (TextUtils.isEmpty(service)) {
                service = GlobalClientInfo.getInstance(context).getService(str);
            }
            if (!TextUtils.isEmpty(service) || UtilityImpl.isMainProcess(context)) {
                return false;
            }
            if ("accs".equals(str)) {
                ALog.e("MsgDistribute", "start MsgDistributeService", Constants.KEY_DATA_ID, str2);
            } else {
                ALog.i("MsgDistribute", "start MsgDistributeService", Constants.KEY_DATA_ID, str2);
            }
            intent.setClassName(intent.getPackage(), b());
            com.taobao.accs.a.a.a(context, intent);
            return true;
        } catch (Throwable th2) {
            ALog.e("MsgDistribute", "handleMsgInChannelProcess", th2, new Object[0]);
            return false;
        }
    }

    protected String b() {
        return com.taobao.accs.utl.j.msgService;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0248 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [com.taobao.accs.IAppReceiver] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r44v0, types: [com.taobao.accs.data.g] */
    public void b(Context context, Intent intent) {
        NetPerformanceMonitor netPerformanceMonitorA;
        int i10;
        char c10;
        String str;
        int intExtra;
        ?? r10;
        ?? r11;
        int i11;
        char c11;
        Object obj;
        String str2;
        String str3 = "accs";
        long jCurrentTimeMillis = System.currentTimeMillis();
        String stringExtra = intent.getStringExtra(Constants.KEY_DATA_ID);
        String str4 = Constants.KEY_SERVICE_ID;
        String stringExtra2 = intent.getStringExtra(Constants.KEY_SERVICE_ID);
        String action = intent.getAction();
        ALog.Level level = ALog.Level.D;
        IAppReceiver iAppReceiver = null;
        if (ALog.isPrintLog(level) || ("accs-impaas".equals(stringExtra2) && t.e())) {
            ALog.e("MsgDistribute", "distribute ready", "action", action, Constants.KEY_DATA_ID, stringExtra, Constants.KEY_SERVICE_ID, stringExtra2);
            netPerformanceMonitorA = com.taobao.accs.utl.a.a(intent);
        } else {
            netPerformanceMonitorA = null;
        }
        if (netPerformanceMonitorA != null) {
            netPerformanceMonitorA.thread_schedule_time = System.currentTimeMillis() - jCurrentTimeMillis;
        }
        if (TextUtils.isEmpty(action)) {
            ALog.e("MsgDistribute", "action null", new Object[0]);
            UTMini.getInstance().commitEvent(66001, "MsgToBuss9", "action null", 221);
            return;
        }
        try {
            if (TextUtils.equals(action, Constants.ACTION_RECEIVE)) {
                intExtra = intent.getIntExtra("command", -1);
                try {
                    String stringExtra3 = intent.getStringExtra(Constants.KEY_USER_ID);
                    int intExtra2 = intent.getIntExtra(Constants.KEY_ERROR_CODE, 0);
                    String stringExtra4 = intent.getStringExtra("appKey");
                    String stringExtra5 = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
                    if (intent.getPackage() == null) {
                        try {
                            intent.setPackage(context.getPackageName());
                        } catch (Throwable th2) {
                            th = th2;
                            i10 = 4;
                            c10 = 2;
                            r10 = "MsgDistribute";
                            Object[] objArr = new Object[i10];
                            objArr[0] = Constants.KEY_DATA_ID;
                            objArr[1] = stringExtra;
                            objArr[c10] = str4;
                            objArr[3] = stringExtra2;
                            ALog.e(r10, "distribMessage", th, objArr);
                            com.taobao.accs.utl.k.a(str3, BaseMonitor.ALARM_POINT_REQ_ERROR, stringExtra2, "1", "distribute error " + intExtra + UtilityImpl.a(th));
                        }
                    }
                    if ("accs".equals(stringExtra2) || "accs-impaas".equals(stringExtra2)) {
                        i11 = 4;
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[0] = "appkey";
                            objArr2[1] = stringExtra4;
                            c11 = 2;
                            try {
                                objArr2[2] = "config";
                                objArr2[3] = stringExtra5;
                                ALog.e("MsgDistribute", "distribute start", objArr2);
                            } catch (Throwable th3) {
                                th = th3;
                                c10 = c11;
                                r11 = "MsgDistribute";
                                i10 = i11;
                                intExtra = intExtra;
                                r10 = r11;
                                Object[] objArr3 = new Object[i10];
                                objArr3[0] = Constants.KEY_DATA_ID;
                                objArr3[1] = stringExtra;
                                objArr3[c10] = str4;
                                objArr3[3] = stringExtra2;
                                ALog.e(r10, "distribMessage", th, objArr3);
                                com.taobao.accs.utl.k.a(str3, BaseMonitor.ALARM_POINT_REQ_ERROR, stringExtra2, "1", "distribute error " + intExtra + UtilityImpl.a(th));
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            c10 = 2;
                            r11 = "MsgDistribute";
                            i10 = i11;
                            intExtra = intExtra;
                            r10 = r11;
                            Object[] objArr4 = new Object[i10];
                            objArr4[0] = Constants.KEY_DATA_ID;
                            objArr4[1] = stringExtra;
                            objArr4[c10] = str4;
                            objArr4[3] = stringExtra2;
                            ALog.e(r10, "distribMessage", th, objArr4);
                            com.taobao.accs.utl.k.a(str3, BaseMonitor.ALARM_POINT_REQ_ERROR, stringExtra2, "1", "distribute error " + intExtra + UtilityImpl.a(th));
                        }
                    } else {
                        try {
                            Object[] objArr5 = new Object[4];
                            objArr5[0] = "appkey";
                            objArr5[1] = stringExtra4;
                            try {
                                objArr5[2] = "config";
                                objArr5[3] = stringExtra5;
                                ALog.d("MsgDistribute", "distribute start", objArr5);
                                i11 = 4;
                            } catch (Throwable th5) {
                                th = th5;
                                c10 = 2;
                                i10 = 4;
                                r10 = "MsgDistribute";
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            c10 = 2;
                            i10 = 4;
                        }
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (a(context, intent, stringExtra, stringExtra2)) {
                        return;
                    }
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
                    long jCurrentTimeMillis4 = System.currentTimeMillis();
                    if (intExtra >= 0) {
                        c11 = 2;
                        long jCurrentTimeMillis5 = System.currentTimeMillis() - jCurrentTimeMillis4;
                        long jCurrentTimeMillis6 = System.currentTimeMillis();
                        if (a(intExtra, stringExtra2)) {
                            return;
                        }
                        long jCurrentTimeMillis7 = System.currentTimeMillis() - jCurrentTimeMillis6;
                        long jCurrentTimeMillis8 = System.currentTimeMillis();
                        c10 = 2;
                        try {
                            if (a(context, intent, stringExtra, stringExtra2, stringExtra5)) {
                                return;
                            }
                            long jCurrentTimeMillis9 = System.currentTimeMillis() - jCurrentTimeMillis8;
                            long jCurrentTimeMillis10 = System.currentTimeMillis();
                            Map<String, IAppReceiver> appReceiver = GlobalClientInfo.getInstance(context).getAppReceiver();
                            if (TextUtils.isEmpty(stringExtra5) || appReceiver == null) {
                                str2 = stringExtra5;
                            } else {
                                str2 = stringExtra5;
                                try {
                                    iAppReceiver = appReceiver.get(str2);
                                } catch (Throwable th7) {
                                    th = th7;
                                    intExtra = intExtra;
                                    str4 = Constants.KEY_SERVICE_ID;
                                    stringExtra = stringExtra;
                                    str3 = "accs";
                                    obj = "MsgDistribute";
                                    i10 = i11;
                                    r10 = obj;
                                }
                            }
                            String str5 = str2;
                            if (a(context, stringExtra2, stringExtra, intent, iAppReceiver)) {
                                return;
                            }
                            long jCurrentTimeMillis11 = System.currentTimeMillis() - jCurrentTimeMillis10;
                            long jCurrentTimeMillis12 = System.currentTimeMillis();
                            str3 = "accs";
                            i10 = i11;
                            intExtra = intExtra;
                            stringExtra2 = stringExtra;
                            str4 = Constants.KEY_SERVICE_ID;
                            r11 = iAppReceiver;
                            stringExtra = stringExtra;
                            try {
                                a(context, intent, str5, stringExtra4, intExtra, stringExtra3, stringExtra2, stringExtra2, r11, intExtra2);
                                long jCurrentTimeMillis13 = System.currentTimeMillis() - jCurrentTimeMillis12;
                                try {
                                    if (TextUtils.isEmpty(stringExtra2)) {
                                        a(context, appReceiver, intent, intExtra, intExtra2);
                                        return;
                                    }
                                    stringExtra2 = stringExtra2;
                                    if (ALog.isPrintLog(level)) {
                                        Object[] objArr6 = new Object[18];
                                        objArr6[0] = Constants.KEY_DATA_ID;
                                        objArr6[1] = stringExtra;
                                        objArr6[2] = str4;
                                        objArr6[3] = stringExtra2;
                                        objArr6[i10] = "command";
                                        objArr6[5] = Integer.valueOf(intExtra);
                                        objArr6[6] = "t1";
                                        objArr6[7] = Long.valueOf(jCurrentTimeMillis3);
                                        objArr6[8] = "t2";
                                        objArr6[9] = Long.valueOf(jCurrentTimeMillis5);
                                        objArr6[10] = "t3";
                                        objArr6[11] = Long.valueOf(jCurrentTimeMillis7);
                                        objArr6[12] = "t4";
                                        objArr6[13] = Long.valueOf(jCurrentTimeMillis9);
                                        objArr6[14] = "t5";
                                        objArr6[15] = Long.valueOf(jCurrentTimeMillis11);
                                        objArr6[16] = "t6";
                                        objArr6[17] = Long.valueOf(jCurrentTimeMillis13);
                                        ALog.e("MsgDistribute", "handleBusinessMsg start", objArr6);
                                    } else {
                                        try {
                                            if ("accs-impaas".equals(stringExtra2) && t.e()) {
                                                try {
                                                    Object[] objArr7 = new Object[18];
                                                    objArr7[0] = Constants.KEY_DATA_ID;
                                                    objArr7[1] = stringExtra;
                                                    objArr7[2] = str4;
                                                    objArr7[3] = stringExtra2;
                                                    objArr7[i10] = "command";
                                                    objArr7[5] = Integer.valueOf(intExtra);
                                                    objArr7[6] = "t1";
                                                    objArr7[7] = Long.valueOf(jCurrentTimeMillis3);
                                                    objArr7[8] = "t2";
                                                    objArr7[9] = Long.valueOf(jCurrentTimeMillis5);
                                                    objArr7[10] = "t3";
                                                    objArr7[11] = Long.valueOf(jCurrentTimeMillis7);
                                                    objArr7[12] = "t4";
                                                    objArr7[13] = Long.valueOf(jCurrentTimeMillis9);
                                                    objArr7[14] = "t5";
                                                    objArr7[15] = Long.valueOf(jCurrentTimeMillis11);
                                                    objArr7[16] = "t6";
                                                    objArr7[17] = Long.valueOf(jCurrentTimeMillis13);
                                                    ALog.e("MsgDistribute", "handleBusinessMsg start", objArr7);
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                }
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            intExtra = intExtra;
                                            r10 = "MsgDistribute";
                                        }
                                    }
                                    a(context, iAppReceiver, intent, stringExtra2, stringExtra, intExtra, intExtra2);
                                    return;
                                } catch (Throwable th10) {
                                    th = th10;
                                    intExtra = intExtra;
                                    r10 = r11;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                stringExtra2 = stringExtra2;
                            }
                            r11 = "MsgDistribute";
                        } catch (Throwable th12) {
                            th = th12;
                            intExtra = intExtra;
                            str4 = Constants.KEY_SERVICE_ID;
                            stringExtra = stringExtra;
                            str3 = "accs";
                            r11 = "MsgDistribute";
                            i10 = i11;
                        }
                        intExtra = intExtra;
                        r10 = r11;
                        Object[] objArr8 = new Object[i10];
                        objArr8[0] = Constants.KEY_DATA_ID;
                        objArr8[1] = stringExtra;
                        objArr8[c10] = str4;
                        objArr8[3] = stringExtra2;
                        ALog.e(r10, "distribMessage", th, objArr8);
                        com.taobao.accs.utl.k.a(str3, BaseMonitor.ALARM_POINT_REQ_ERROR, stringExtra2, "1", "distribute error " + intExtra + UtilityImpl.a(th));
                    }
                    try {
                        try {
                            ALog.e("MsgDistribute", "command error:" + intExtra, Constants.KEY_SERVICE_ID, stringExtra2);
                            return;
                        } catch (Throwable th13) {
                            th = th13;
                            c10 = 2;
                            obj = "MsgDistribute";
                            i10 = i11;
                            r10 = obj;
                            Object[] objArr9 = new Object[i10];
                            objArr9[0] = Constants.KEY_DATA_ID;
                            objArr9[1] = stringExtra;
                            objArr9[c10] = str4;
                            objArr9[3] = stringExtra2;
                            ALog.e(r10, "distribMessage", th, objArr9);
                            com.taobao.accs.utl.k.a(str3, BaseMonitor.ALARM_POINT_REQ_ERROR, stringExtra2, "1", "distribute error " + intExtra + UtilityImpl.a(th));
                        }
                    } catch (Throwable th14) {
                        th = th14;
                        c10 = 2;
                    }
                    i10 = i11;
                    r10 = obj;
                    Object[] objArr10 = new Object[i10];
                    objArr10[0] = Constants.KEY_DATA_ID;
                    objArr10[1] = stringExtra;
                    objArr10[c10] = str4;
                    objArr10[3] = stringExtra2;
                    ALog.e(r10, "distribMessage", th, objArr10);
                    com.taobao.accs.utl.k.a(str3, BaseMonitor.ALARM_POINT_REQ_ERROR, stringExtra2, "1", "distribute error " + intExtra + UtilityImpl.a(th));
                } catch (Throwable th15) {
                    th = th15;
                    intExtra = intExtra;
                    str4 = Constants.KEY_SERVICE_ID;
                    stringExtra = stringExtra;
                    str3 = "accs";
                    i10 = 4;
                    c10 = 2;
                    r11 = "MsgDistribute";
                }
            } else {
                i10 = 4;
                c10 = 2;
                str = "MsgDistribute";
                try {
                    ALog.e(str, "distribMessage action error", new Object[0]);
                    UTMini.getInstance().commitEvent(66001, "MsgToBuss10", action, 221);
                    return;
                } catch (Throwable th16) {
                    th = th16;
                }
            }
        } catch (Throwable th17) {
            th = th17;
            i10 = 4;
            c10 = 2;
            str = "MsgDistribute";
        }
        intExtra = 0;
        r10 = str;
        Object[] objArr11 = new Object[i10];
        objArr11[0] = Constants.KEY_DATA_ID;
        objArr11[1] = stringExtra;
        objArr11[c10] = str4;
        objArr11[3] = stringExtra2;
        ALog.e(r10, "distribMessage", th, objArr11);
        com.taobao.accs.utl.k.a(str3, BaseMonitor.ALARM_POINT_REQ_ERROR, stringExtra2, "1", "distribute error " + intExtra + UtilityImpl.a(th));
    }
}
