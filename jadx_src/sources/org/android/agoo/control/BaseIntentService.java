package org.android.agoo.control;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.igexin.sdk.PushConsts;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.t;
import com.taobao.accs.utl.v;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.android.agoo.common.MsgDO;
import org.android.agoo.huawei.HuaweiRcvService;
import org.android.agoo.intent.IntentUtil;
import org.android.agoo.message.MessageService;
import org.android.agoo.xiaomi.MiPushBroadcastReceiver;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseIntentService extends Service {
    private static final String TAG = "BaseIntentService";
    private static boolean isBinded = false;
    private static final String msgStatus = "4";
    private AgooFactory agooFactory;
    private MessageService messageService;
    private NotifManager notifyManager;
    private Context mContext = null;
    private Messenger messenger = new Messenger(new g(this));

    private final String getTrace(Context context, long j10) {
        String str = TextUtils.isEmpty(null) ? "unknow" : null;
        String str2 = TextUtils.isEmpty(null) ? "unknow" : null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("appkey");
        stringBuffer.append("|");
        stringBuffer.append(j10);
        stringBuffer.append("|");
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append("|");
        stringBuffer.append(str);
        stringBuffer.append("|");
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0353 A[Catch: Exception -> 0x035e, all -> 0x036b, TRY_LEAVE, TryCatch #10 {Exception -> 0x035e, blocks: (B:110:0x0338, B:112:0x0353), top: B:149:0x0338, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cf A[Catch: all -> 0x036d, TryCatch #5 {all -> 0x036d, blocks: (B:35:0x00c1, B:37:0x00cf, B:38:0x010c, B:40:0x0135, B:42:0x013f, B:44:0x0151, B:46:0x015b, B:49:0x016d, B:54:0x0185, B:52:0x017c, B:34:0x00a2), top: B:141:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0135 A[Catch: all -> 0x036d, TryCatch #5 {all -> 0x036d, blocks: (B:35:0x00c1, B:37:0x00cf, B:38:0x010c, B:40:0x0135, B:42:0x013f, B:44:0x0151, B:46:0x015b, B:49:0x016d, B:54:0x0185, B:52:0x017c, B:34:0x00a2), top: B:141:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x013f A[Catch: all -> 0x036d, TryCatch #5 {all -> 0x036d, blocks: (B:35:0x00c1, B:37:0x00cf, B:38:0x010c, B:40:0x0135, B:42:0x013f, B:44:0x0151, B:46:0x015b, B:49:0x016d, B:54:0x0185, B:52:0x017c, B:34:0x00a2), top: B:141:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0151 A[Catch: all -> 0x036d, TryCatch #5 {all -> 0x036d, blocks: (B:35:0x00c1, B:37:0x00cf, B:38:0x010c, B:40:0x0135, B:42:0x013f, B:44:0x0151, B:46:0x015b, B:49:0x016d, B:54:0x0185, B:52:0x017c, B:34:0x00a2), top: B:141:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x015b A[Catch: all -> 0x036d, TRY_LEAVE, TryCatch #5 {all -> 0x036d, blocks: (B:35:0x00c1, B:37:0x00cf, B:38:0x010c, B:40:0x0135, B:42:0x013f, B:44:0x0151, B:46:0x015b, B:49:0x016d, B:54:0x0185, B:52:0x017c, B:34:0x00a2), top: B:141:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0185 A[Catch: all -> 0x036d, TRY_LEAVE, TryCatch #5 {all -> 0x036d, blocks: (B:35:0x00c1, B:37:0x00cf, B:38:0x010c, B:40:0x0135, B:42:0x013f, B:44:0x0151, B:46:0x015b, B:49:0x016d, B:54:0x0185, B:52:0x017c, B:34:0x00a2), top: B:141:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0204 A[Catch: all -> 0x036b, TryCatch #2 {all -> 0x036b, blocks: (B:68:0x01fc, B:70:0x0204, B:72:0x020c, B:73:0x022f, B:75:0x0237, B:77:0x023f, B:109:0x02f1, B:110:0x0338, B:112:0x0353, B:116:0x0367, B:115:0x035f, B:92:0x0293, B:94:0x029b, B:67:0x01e1), top: B:136:0x01e1, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x020c A[Catch: all -> 0x036b, TryCatch #2 {all -> 0x036b, blocks: (B:68:0x01fc, B:70:0x0204, B:72:0x020c, B:73:0x022f, B:75:0x0237, B:77:0x023f, B:109:0x02f1, B:110:0x0338, B:112:0x0353, B:116:0x0367, B:115:0x035f, B:92:0x0293, B:94:0x029b, B:67:0x01e1), top: B:136:0x01e1, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0237 A[Catch: all -> 0x036b, TryCatch #2 {all -> 0x036b, blocks: (B:68:0x01fc, B:70:0x0204, B:72:0x020c, B:73:0x022f, B:75:0x0237, B:77:0x023f, B:109:0x02f1, B:110:0x0338, B:112:0x0353, B:116:0x0367, B:115:0x035f, B:92:0x0293, B:94:0x029b, B:67:0x01e1), top: B:136:0x01e1, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x023f A[Catch: all -> 0x036b, TRY_LEAVE, TryCatch #2 {all -> 0x036b, blocks: (B:68:0x01fc, B:70:0x0204, B:72:0x020c, B:73:0x022f, B:75:0x0237, B:77:0x023f, B:109:0x02f1, B:110:0x0338, B:112:0x0353, B:116:0x0367, B:115:0x035f, B:92:0x0293, B:94:0x029b, B:67:0x01e1), top: B:136:0x01e1, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x026f  */
    /* JADX WARN: Code duplicated, block: B:89:0x028d  */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x020c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x023f, please report this as an issue */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    private final void handleRemoteMessage(Context context, Intent intent) {
        String str;
        String str2;
        String str3;
        TaoBaseService.ExtraInfo extraInfo;
        String stringExtra;
        String str4;
        String stringExtra2;
        MsgDO msgDO;
        String str5;
        CharSequence charSequence;
        String name;
        String stringExtra3;
        NetPerformanceMonitor netPerformanceMonitor;
        String stringExtra4;
        try {
            String stringExtra5 = intent.getStringExtra("id");
            String stringExtra6 = intent.getStringExtra("body");
            String stringExtra7 = intent.getStringExtra("type");
            String stringExtra8 = intent.getStringExtra(AgooConstants.MESSAGE_SOURCE);
            String stringExtra9 = intent.getStringExtra("report");
            String stringExtra10 = intent.getStringExtra(AgooConstants.MESSAGE_ENCRYPTED);
            String stringExtra11 = intent.getStringExtra(AgooConstants.MESSAGE_EXT);
            try {
                String stringExtra12 = intent.getStringExtra(AgooConstants.MESSAGE_ORI);
                try {
                    str3 = "messageId=";
                    try {
                        getTrace(context, Long.valueOf(intent.getLongExtra(AgooConstants.MESSAGE_TRACE, -1L)).longValue());
                        Bundle bundleExtra = intent.getBundleExtra(AgooConstants.MESSAGE_AGOO_BUNDLE);
                        extraInfo = bundleExtra != null ? (TaoBaseService.ExtraInfo) bundleExtra.getSerializable(AgooConstants.MESSAGE_ACCS_EXTRA) : null;
                        try {
                            stringExtra = intent.getStringExtra("source");
                            try {
                                if (TextUtils.isEmpty(stringExtra)) {
                                    stringExtra = "oldsdk";
                                }
                                stringExtra2 = intent.getStringExtra(AgooConstants.MESSAGE_FROM_APPKEY);
                                str4 = TAG;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    str4 = TAG;
                                    ALog.e(str4, "_trace,t=" + th, new Object[0]);
                                    stringExtra2 = null;
                                    extraInfo = extraInfo;
                                } catch (Throwable th3) {
                                    th = th3;
                                    str = BaseMonitor.COUNT_AGOO_ARRIVE;
                                    str2 = "accs";
                                    com.taobao.accs.utl.k.a(str2, str, "arrive_exception" + th.toString(), 0.0d);
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            stringExtra = null;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        extraInfo = null;
                        stringExtra = null;
                        str4 = TAG;
                        ALog.e(str4, "_trace,t=" + th, new Object[0]);
                        stringExtra2 = null;
                        extraInfo = extraInfo;
                        if (ALog.isPrintLog(ALog.Level.I)) {
                            ALog.i(str4, "handleRemoteMessage", "message", stringExtra6, "source", stringExtra8, RemoteMessageConst.MSGID, stringExtra5, "utdid", com.taobao.accs.utl.j.b(context), "fromPkg", stringExtra, AgooConstants.MESSAGE_FROM_APPKEY, stringExtra2);
                        }
                        msgDO = new MsgDO();
                        msgDO.msgIds = stringExtra5;
                        msgDO.extData = stringExtra11;
                        msgDO.messageSource = stringExtra8;
                        msgDO.msgStatus = "4";
                        msgDO.reportStr = stringExtra9;
                        msgDO.fromPkg = stringExtra;
                        msgDO.fromAppkey = stringExtra2;
                        msgDO.isStartProc = com.taobao.accs.client.a.c();
                        msgDO.notifyEnable = com.taobao.accs.utl.j.c(this.mContext);
                        if (!TextUtils.isEmpty(stringExtra6)) {
                            if (Integer.toString(4).equals(stringExtra10)) {
                                ALog.e(str4, "msg encrypted flag not exist~~", new Object[0]);
                                try {
                                    msgDO.errorCode = "24";
                                    this.notifyManager.report(msgDO, extraInfo);
                                    return;
                                } catch (Throwable unused) {
                                    return;
                                }
                            }
                            ALog.i(str4, "message is encrypted, attemp to decrypt msg", new Object[0]);
                            stringExtra6 = AgooFactory.parseEncryptedMsg(stringExtra6);
                            if (TextUtils.isEmpty(stringExtra6)) {
                                msgDO.errorCode = "22";
                                this.notifyManager.handlerACKMessage(msgDO, extraInfo);
                                return;
                            }
                        }
                        if (TextUtils.isEmpty(stringExtra6)) {
                            try {
                                msgDO.errorCode = "21";
                                this.notifyManager.report(msgDO, extraInfo);
                            } catch (Throwable unused2) {
                            }
                            ALog.e(str4, "handleMessage--->[null]", new Object[0]);
                            return;
                        }
                        intent.putExtra("body", stringExtra6);
                        try {
                            this.notifyManager.report(msgDO, extraInfo);
                            this.messageService.a(stringExtra5, stringExtra12, "0");
                            UTMini uTMini = UTMini.getInstance();
                            String[] strArr = new String[2];
                            strArr[0] = null;
                            StringBuilder sb2 = new StringBuilder();
                            str5 = str3;
                            try {
                                sb2.append(str5);
                                sb2.append(msgDO.msgIds);
                                strArr[1] = sb2.toString();
                                uTMini.commitEvent(UTMini.EVENTID_AGOO, UTMini.PAGE_AGOO, BaseMonitor.COUNT_AGOO_ARRIVE_ID, (Object) null, (Object) null, strArr);
                                str = BaseMonitor.COUNT_AGOO_ARRIVE;
                                str2 = "accs";
                                try {
                                    com.taobao.accs.utl.k.a(str2, str, "arrive", 0.0d);
                                } catch (Throwable th6) {
                                    th = th6;
                                    try {
                                        ALog.e(str4, "report message Throwable--->t=" + th.toString(), new Object[0]);
                                    } catch (Throwable th7) {
                                        th = th7;
                                        com.taobao.accs.utl.k.a(str2, str, "arrive_exception" + th.toString(), 0.0d);
                                        return;
                                    }
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                str = BaseMonitor.COUNT_AGOO_ARRIVE;
                                str2 = "accs";
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            str = BaseMonitor.COUNT_AGOO_ARRIVE;
                            str2 = "accs";
                            str5 = str3;
                        }
                        if (this.messageService.a(stringExtra5)) {
                            if (ALog.isPrintLog(ALog.Level.I)) {
                                ALog.i(str4, "handleRemoteMessage hasMessageDuplicate,messageId=" + stringExtra5 + ",utdid=" + com.taobao.accs.utl.j.b(context), new Object[0]);
                            }
                            com.taobao.accs.utl.k.a(str2, str, "arrive_dup", 0.0d);
                            return;
                        }
                        if (ALog.isPrintLog(ALog.Level.I)) {
                            ALog.i(str4, "handleMessage--->[" + stringExtra6 + "],[" + stringExtra8 + "]", new Object[0]);
                        }
                        try {
                            stringExtra4 = intent.getStringExtra(AgooConstants.MESSAGE_DUPLICATE);
                            if (TextUtils.isEmpty(stringExtra4)) {
                                charSequence = "1";
                            } else {
                                charSequence = "1";
                                try {
                                    if (TextUtils.equals(stringExtra4, charSequence)) {
                                        com.taobao.accs.utl.k.a(str2, str, "arrive_dupbody", 0.0d);
                                        return;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    if (ALog.isPrintLog(ALog.Level.E)) {
                                        ALog.e(str4, "hasMessageDuplicate message,e=" + th.toString(), new Object[0]);
                                    }
                                }
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            charSequence = "1";
                        }
                        int i10 = -1;
                        try {
                            i10 = Integer.parseInt(intent.getStringExtra("notify"));
                        } catch (Throwable unused3) {
                        }
                        name = "";
                        try {
                            stringExtra3 = intent.getStringExtra(AgooConstants.MESSAGE_HAS_TEST);
                            try {
                                if (TextUtils.isEmpty(stringExtra3)) {
                                }
                                stringExtra3 = stringExtra7;
                                name = getClass().getName();
                            } catch (Throwable unused4) {
                            }
                        } catch (Throwable unused5) {
                            stringExtra3 = stringExtra7;
                        }
                        this.messageService.a(stringExtra5, stringExtra6, stringExtra3, i10);
                        UTMini.getInstance().commitEvent(UTMini.EVENTID_AGOO, UTMini.PAGE_AGOO, BaseMonitor.COUNT_AGOO_ARRIVE_REAL_ID, (Object) null, (Object) null, null, str5 + msgDO.msgIds);
                        com.taobao.accs.utl.k.a(str2, str, "arrive_real_" + name, 0.0d);
                        try {
                            intent.getExtras().setClassLoader(NetPerformanceMonitor.class.getClassLoader());
                            netPerformanceMonitor = (NetPerformanceMonitor) intent.getExtras().getSerializable(Constants.KEY_MONIROT);
                            if (netPerformanceMonitor != null) {
                                netPerformanceMonitor.onToAgooTime();
                                AppMonitor.getInstance().commitStat(netPerformanceMonitor);
                            }
                        } catch (Exception e10) {
                            ALog.e(str4, "get NetPerformanceMonitor Error:", e10, new Object[0]);
                        }
                        onMessage(context, intent);
                    }
                } catch (Throwable th12) {
                    th = th12;
                    str3 = "messageId=";
                }
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.i(str4, "handleRemoteMessage", "message", stringExtra6, "source", stringExtra8, RemoteMessageConst.MSGID, stringExtra5, "utdid", com.taobao.accs.utl.j.b(context), "fromPkg", stringExtra, AgooConstants.MESSAGE_FROM_APPKEY, stringExtra2);
                }
                msgDO = new MsgDO();
                msgDO.msgIds = stringExtra5;
                msgDO.extData = stringExtra11;
                msgDO.messageSource = stringExtra8;
                msgDO.msgStatus = "4";
                msgDO.reportStr = stringExtra9;
                msgDO.fromPkg = stringExtra;
                msgDO.fromAppkey = stringExtra2;
                msgDO.isStartProc = com.taobao.accs.client.a.c();
                msgDO.notifyEnable = com.taobao.accs.utl.j.c(this.mContext);
                if (!TextUtils.isEmpty(stringExtra6)) {
                    if (Integer.toString(4).equals(stringExtra10)) {
                        ALog.e(str4, "msg encrypted flag not exist~~", new Object[0]);
                        msgDO.errorCode = "24";
                        this.notifyManager.report(msgDO, extraInfo);
                        return;
                    } else {
                        ALog.i(str4, "message is encrypted, attemp to decrypt msg", new Object[0]);
                        stringExtra6 = AgooFactory.parseEncryptedMsg(stringExtra6);
                        if (TextUtils.isEmpty(stringExtra6)) {
                            msgDO.errorCode = "22";
                            this.notifyManager.handlerACKMessage(msgDO, extraInfo);
                            return;
                        }
                    }
                }
                if (TextUtils.isEmpty(stringExtra6)) {
                    msgDO.errorCode = "21";
                    this.notifyManager.report(msgDO, extraInfo);
                    ALog.e(str4, "handleMessage--->[null]", new Object[0]);
                    return;
                }
                intent.putExtra("body", stringExtra6);
                this.notifyManager.report(msgDO, extraInfo);
                this.messageService.a(stringExtra5, stringExtra12, "0");
                UTMini uTMini2 = UTMini.getInstance();
                String[] strArr2 = new String[2];
                strArr2[0] = null;
                StringBuilder sb3 = new StringBuilder();
                str5 = str3;
                sb3.append(str5);
                sb3.append(msgDO.msgIds);
                strArr2[1] = sb3.toString();
                uTMini2.commitEvent(UTMini.EVENTID_AGOO, UTMini.PAGE_AGOO, BaseMonitor.COUNT_AGOO_ARRIVE_ID, (Object) null, (Object) null, strArr2);
                str = BaseMonitor.COUNT_AGOO_ARRIVE;
                str2 = "accs";
                com.taobao.accs.utl.k.a(str2, str, "arrive", 0.0d);
                if (this.messageService.a(stringExtra5)) {
                    if (ALog.isPrintLog(ALog.Level.I)) {
                        ALog.i(str4, "handleRemoteMessage hasMessageDuplicate,messageId=" + stringExtra5 + ",utdid=" + com.taobao.accs.utl.j.b(context), new Object[0]);
                    }
                    com.taobao.accs.utl.k.a(str2, str, "arrive_dup", 0.0d);
                    return;
                }
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.i(str4, "handleMessage--->[" + stringExtra6 + "],[" + stringExtra8 + "]", new Object[0]);
                }
                stringExtra4 = intent.getStringExtra(AgooConstants.MESSAGE_DUPLICATE);
                if (TextUtils.isEmpty(stringExtra4)) {
                    charSequence = "1";
                    if (TextUtils.equals(stringExtra4, charSequence) && this.messageService.a(stringExtra5, stringExtra6.hashCode())) {
                        com.taobao.accs.utl.k.a(str2, str, "arrive_dupbody", 0.0d);
                        return;
                    }
                } else {
                    charSequence = "1";
                }
                int i11 = -1;
                i11 = Integer.parseInt(intent.getStringExtra("notify"));
                name = "";
                stringExtra3 = intent.getStringExtra(AgooConstants.MESSAGE_HAS_TEST);
                if (TextUtils.isEmpty(stringExtra3) && TextUtils.equals(stringExtra3, charSequence)) {
                    this.messageService.a(stringExtra5, stringExtra6, stringExtra7, i11);
                    com.taobao.accs.utl.k.a(str2, str, "arrive_test", 0.0d);
                    return;
                } else {
                    stringExtra3 = stringExtra7;
                    name = getClass().getName();
                }
                this.messageService.a(stringExtra5, stringExtra6, stringExtra3, i11);
                UTMini.getInstance().commitEvent(UTMini.EVENTID_AGOO, UTMini.PAGE_AGOO, BaseMonitor.COUNT_AGOO_ARRIVE_REAL_ID, (Object) null, (Object) null, null, str5 + msgDO.msgIds);
                com.taobao.accs.utl.k.a(str2, str, "arrive_real_" + name, 0.0d);
                intent.getExtras().setClassLoader(NetPerformanceMonitor.class.getClassLoader());
                netPerformanceMonitor = (NetPerformanceMonitor) intent.getExtras().getSerializable(Constants.KEY_MONIROT);
                if (netPerformanceMonitor != null) {
                    netPerformanceMonitor.onToAgooTime();
                    AppMonitor.getInstance().commitStat(netPerformanceMonitor);
                }
                onMessage(context, intent);
            } catch (Throwable th13) {
                th = th13;
                str2 = "accs";
                str = BaseMonitor.COUNT_AGOO_ARRIVE;
            }
        } catch (Throwable th14) {
            th = th14;
            str = BaseMonitor.COUNT_AGOO_ARRIVE;
            str2 = "accs";
        }
    }

    private final void handleRemovePackage(Context context, Intent intent) {
        if (intent == null || context == null) {
            return;
        }
        Uri data = intent.getData();
        String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
        if (TextUtils.isEmpty(schemeSpecificPart)) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d(TAG, "handleRemovePackage---->[replacing:" + booleanExtra + "],uninstallPack=" + schemeSpecificPart, new Object[0]);
        }
        if (booleanExtra) {
            return;
        }
        this.notifyManager.doUninstall(schemeSpecificPart, booleanExtra);
    }

    public static void runIntentInService(Context context, Intent intent, String str) {
        try {
            intent.setClassName(context, str);
            context.startService(intent);
        } catch (Throwable th2) {
            ALog.w(TAG, "runIntentInService", th2, new Object[0]);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        getApplication();
        if (t.b() && v.a(this) && !isBinded) {
            isBinded = true;
            getApplicationContext().bindService(new Intent(getApplication(), getClass()), new i(this), 1);
        }
        return this.messenger.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        ThreadPoolExecutorFactory.execute(new j(this));
    }

    protected abstract void onError(Context context, String str);

    protected void onHandleIntent(Intent intent) {
        this.mContext = getApplicationContext();
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return;
        }
        String agooCommand = IntentUtil.getAgooCommand(this.mContext);
        String thirdPushCommand = IntentUtil.getThirdPushCommand(this.mContext);
        ALog.i(TAG, "onHandleIntent,action=" + action + ",agooCommand=" + agooCommand + ",mipushCommand=" + thirdPushCommand, new Object[0]);
        try {
            if (TextUtils.equals(action, agooCommand)) {
                String stringExtra = intent.getStringExtra("command");
                ALog.d(TAG, "actionCommand --->[" + stringExtra + "]", new Object[0]);
                if (TextUtils.equals(stringExtra, AgooConstants.AGOO_COMMAND_MESSAGE_READED) || TextUtils.equals(stringExtra, AgooConstants.AGOO_COMMAND_MESSAGE_DELETED)) {
                    onUserCommand(this.mContext, intent);
                }
            } else if (TextUtils.equals(action, thirdPushCommand)) {
                String stringExtra2 = intent.getStringExtra("command");
                String stringExtra3 = intent.getStringExtra(AgooConstants.THIRD_PUSH_ID);
                if (TextUtils.equals(stringExtra2, AgooConstants.AGOO_COMMAND_MIPUSHID_REPORT)) {
                    this.notifyManager.reportThirdPushToken(stringExtra3, MiPushBroadcastReceiver.MI_TOKEN, false);
                } else if (TextUtils.equals(stringExtra2, AgooConstants.AGOO_COMMAND_HUAWEIPUSHID_REPORT)) {
                    ALog.d(TAG, "HW_TOKEN report begin..regid=" + stringExtra3, new Object[0]);
                    this.notifyManager.reportThirdPushToken(stringExtra3, HuaweiRcvService.HUAWEI_TOKEN, false);
                } else if (TextUtils.equals(stringExtra2, AgooConstants.AGOO_COMMAND_GCMIPUSHID_REPORT)) {
                    ALog.i(TAG, "GCM_TOKEN report begin..regid=" + stringExtra3, new Object[0]);
                    this.notifyManager.reportThirdPushToken(stringExtra3, AgooConstants.MESSAGE_SYSTEM_SOURCE_GCM, false);
                }
            } else if (action.equals(AgooConstants.INTENT_FROM_AGOO_MESSAGE)) {
                handleRemoteMessage(this.mContext, intent);
            } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                handleRemovePackage(this.mContext, intent);
            } else if (TextUtils.equals(action, AgooConstants.INTENT_FROM_AGOO_REPORT) || TextUtils.equals(action, "android.net.conn.CONNECTIVITY_CHANGE") || TextUtils.equals(action, PushConsts.ACTION_BROADCAST_TO_BOOT) || TextUtils.equals(action, "android.intent.action.PACKAGE_ADDED") || TextUtils.equals(action, "android.intent.action.PACKAGE_REPLACED") || TextUtils.equals(action, PushConsts.ACTION_BROADCAST_USER_PRESENT) || TextUtils.equals(action, "android.intent.action.ACTION_POWER_CONNECTED") || TextUtils.equals(action, "android.intent.action.ACTION_POWER_DISCONNECTED")) {
                try {
                    ALog.i(TAG, "is report cache msg,Config.isReportCacheMsg(mContext)=" + Config.d(this.mContext), new Object[0]);
                    if (Config.d(this.mContext) && UtilityImpl.i(this.mContext)) {
                        Config.e(this.mContext);
                        this.agooFactory.reportCacheMsg();
                        this.messageService.a();
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (ALog.isPrintLog(ALog.Level.I)) {
                        ALog.i(TAG, "is clear all msg=" + Config.b(this.mContext, jCurrentTimeMillis), new Object[0]);
                    }
                    if (Config.b(this.mContext, jCurrentTimeMillis)) {
                        Config.a(this.mContext, jCurrentTimeMillis);
                        this.messageService.a();
                    }
                } catch (Throwable th2) {
                    ALog.e(TAG, "reportCacheMsg", th2, new Object[0]);
                }
            }
        } catch (Throwable th3) {
            try {
                if (ALog.isPrintLog(ALog.Level.E)) {
                    ALog.e(TAG, "onHandleIntent deal error", th3, new Object[0]);
                }
            } finally {
                com.taobao.accs.client.a.f98190f.incrementAndGet();
            }
        }
    }

    protected abstract void onMessage(Context context, Intent intent);

    protected abstract void onRegistered(Context context, String str);

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        ThreadPoolExecutorFactory.execute(new k(this, intent));
        return 2;
    }

    protected void onUserCommand(Context context, Intent intent) {
    }
}
