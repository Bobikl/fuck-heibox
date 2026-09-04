package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.primitives.SignedBytes;
import com.max.xiaoheihe.bean.BizMessageObj;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.o;
import com.taobao.accs.utl.p;
import com.taobao.accs.utl.r;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class Message implements Serializable {
    public static int CONTROL_MAX_RETRY_TIMES = 5;
    public static final int EXT_HEADER_VALUE_MAX_LEN = 1023;
    public static final int FLAG_ACK_TYPE = 32;
    public static final int FLAG_BIZ_RET = 64;
    public static final int FLAG_DATA_TYPE = 32768;
    public static final int FLAG_ERR = 4096;
    public static final int FLAG_REQ_BIT1 = 16384;
    public static final int FLAG_REQ_BIT2 = 8192;
    public static final int FLAG_RET = 2048;
    public static final String KEY_BINDAPP = "ctrl_bindapp";
    public static final String KEY_BINDSERVICE = "ctrl_bindservice";
    public static final String KEY_BINDUSER = "ctrl_binduser";
    public static final String KEY_UNBINDAPP = "ctrl_unbindapp";
    public static final String KEY_UNBINDSERVICE = "ctrl_unbindservice";
    public static final String KEY_UNBINDUSER = "ctrl_unbinduser";
    public static final int MAX_RETRY_TIMES = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static long f98202a = 1;
    byte[] D;
    int E;
    long F;
    transient NetPerformanceMonitor G;
    Id I;
    public String cunstomDataId;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    short f98205d;
    public String dataId;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    short f98206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    short f98207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    byte f98208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    byte f98209h;
    public URL host;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f98210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f98211j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Map<Integer, String> f98213l;
    public long startSendTime;
    public boolean isAck = false;
    public boolean force = false;
    public boolean isCancel = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    byte f98203b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    byte f98204c = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f98212k = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    String f98214m = null;
    public Integer command = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Integer f98215n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    String f98216o = null;
    public String appSign = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    Integer f98217p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    String f98218q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    String f98219r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    String f98220s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    String f98221t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    String f98222u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    Integer f98223v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    String f98224w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    String f98225x = null;
    public String userinfo = null;
    public String serviceId = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    String f98226y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    String f98227z = null;
    String A = null;
    String B = null;
    String C = null;
    public long delyTime = 0;
    public int retryTimes = 0;
    public int timeout = 40000;
    public String bizId = null;
    String H = null;

    /* JADX INFO: compiled from: Taobao */
    public static class Id implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f98228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f98229b;

        public Id(int i10, String str) {
            this.f98228a = i10;
            this.f98229b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Id id2 = (Id) obj;
            return this.f98228a == id2.getId() || this.f98229b.equals(id2.getDataId());
        }

        public String getDataId() {
            return this.f98229b;
        }

        public int getId() {
            return this.f98228a;
        }

        public int hashCode() {
            return this.f98229b.hashCode();
        }
    }

    /* JADX INFO: compiled from: Taobao */
    public static class MsgResType implements Serializable {
        public static final int INVALID = -1;
        public static final int NEED_ACK = 1;
        public static final int NO_ACK = 0;

        public static String name(int i10) {
            if (i10 != 0) {
                return i10 != 1 ? "INVALID" : "NEED_ACK";
            }
            return "NO_ACK";
        }

        public static int valueOf(int i10) {
            return i10 != 0 ? 1 : 0;
        }
    }

    /* JADX INFO: compiled from: Taobao */
    public static class MsgType implements Serializable {
        public static final int CONTROL = 0;
        public static final int DATA = 1;
        public static final int HANDSHAKE = 3;
        public static final int INVALID = -1;
        public static final int PING = 2;

        public static String name(int i10) {
            if (i10 == 0) {
                return "CONTROL";
            }
            if (i10 == 1) {
                return "DATA";
            }
            if (i10 != 2) {
                return i10 != 3 ? "INVALID" : "HANDSHAKE";
            }
            return BizMessageObj.TYPE_PING;
        }

        public static int valueOf(int i10) {
            int i11 = 1;
            if (i10 != 1) {
                i11 = 2;
                if (i10 != 2) {
                    i11 = 3;
                    if (i10 != 3) {
                        return 0;
                    }
                }
            }
            return i11;
        }
    }

    /* JADX INFO: compiled from: Taobao */
    public enum ReqType {
        DATA,
        ACK,
        REQ,
        RES;

        public static ReqType valueOf(int i10) {
            if (i10 == 0) {
                return DATA;
            }
            if (i10 == 1) {
                return ACK;
            }
            if (i10 != 2) {
                return i10 != 3 ? DATA : RES;
            }
            return REQ;
        }
    }

    private Message() {
        synchronized (Message.class) {
            this.startSendTime = System.currentTimeMillis();
            String str = this.startSendTime + "." + f98202a;
            this.dataId = str;
            long j10 = f98202a;
            f98202a = 1 + j10;
            this.I = new Id((int) j10, str);
        }
    }

    public static Message BuildPing(boolean z10, int i10) {
        Message message = new Message();
        message.f98212k = 2;
        message.command = 201;
        message.force = z10;
        message.delyTime = i10;
        return message;
    }

    private void a(int i10, ReqType reqType, int i11) {
        this.f98212k = i10;
        if (i10 != 2) {
            this.f98207f = (short) (((((i10 & 1) << 4) | (reqType.ordinal() << 2)) | i11) << 11);
        }
    }

    private static void a(Message message, String str, String str2, String str3, String str4, String str5, String str6) {
        if (TextUtils.isEmpty(str5) && TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str6) && str4 == null) {
            return;
        }
        message.f98213l = new HashMap();
        if (str5 != null && UtilityImpl.a(str5) <= 1023) {
            message.f98213l.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_BUSINESS.ordinal()), str5);
        }
        if (str != null && UtilityImpl.a(str) <= 1023) {
            message.f98213l.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_SID.ordinal()), str);
        }
        if (str2 != null && UtilityImpl.a(str2) <= 1023) {
            message.f98213l.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_USERID.ordinal()), str2);
        }
        if (str6 != null && UtilityImpl.a(str6) <= 1023) {
            message.f98213l.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_TAG.ordinal()), str6);
        }
        if (str4 != null && UtilityImpl.a(str4) <= 1023) {
            message.f98213l.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_COOKIE.ordinal()), str4);
        }
        if (str3 == null || UtilityImpl.a(str3) > 1023) {
            return;
        }
        message.f98213l.put(19, str3);
    }

    private static void a(String str, Message message) {
        try {
            message.host = new URL(str);
        } catch (Exception e10) {
            ALog.e("Msg", "setControlHost", e10, new Object[0]);
        }
    }

    private static void a(String str, Message message, ACCSManager.AccsRequest accsRequest) {
        URL url = accsRequest.host;
        if (url != null) {
            message.host = url;
            return;
        }
        try {
            message.host = new URL(str);
        } catch (MalformedURLException e10) {
            ALog.e("Msg", "setUnit", e10, new Object[0]);
            e10.printStackTrace();
        }
    }

    private void a(short s10, boolean z10) {
        this.f98212k = 1;
        short s11 = (short) (((short) (((short) (((short) (s10 & (-16385))) | 8192)) & (-2049))) & (-65));
        this.f98207f = s11;
        if (z10) {
            this.f98207f = (short) (s11 | 32);
        }
    }

    public static Message buildBackground(String str) {
        Message message = new Message();
        message.a(1, ReqType.DATA, 0);
        message.command = 100;
        message.f98210i = Constants.TARGET_BACK;
        a(str, message);
        return message;
    }

    public static Message buildBindApp(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        Message message = new Message();
        message.E = 1;
        message.a(1, ReqType.DATA, 1);
        message.f98217p = 1;
        message.f98218q = Build.VERSION.SDK_INT + "";
        message.f98214m = str4;
        message.f98210i = Constants.TARGET_CONTROL;
        message.command = 1;
        message.f98216o = str2;
        message.appSign = UtilityImpl.a(str2, str3, UtilityImpl.j(context));
        message.f98223v = 221;
        message.f98222u = str6;
        message.f98214m = str4;
        message.f98224w = str5;
        message.f98226y = Build.MODEL;
        message.f98227z = Build.BRAND;
        message.cunstomDataId = KEY_BINDAPP;
        message.H = str;
        message.f98221t = new p.a().a("notifyEnable", UtilityImpl.o(context)).a("romInfo", new o().a()).a().toString();
        UtilityImpl.a(context, Constants.SP_FILE_NAME, UtilityImpl.o(context));
        return message;
    }

    @Deprecated
    public static Message buildBindApp(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        return buildBindApp(context, str, str2, str3, str4, str5, str6);
    }

    @Deprecated
    public static Message buildBindApp(com.taobao.accs.net.a aVar, Context context, Intent intent) {
        return buildBindApp(aVar.b((String) null), aVar.f98309m, context, intent);
    }

    public static Message buildBindApp(String str, String str2, Context context, Intent intent) {
        Message messageBuildBindApp = null;
        try {
            messageBuildBindApp = buildBindApp(context, str2, intent.getStringExtra("appKey"), intent.getStringExtra("app_sercet"), intent.getStringExtra("packageName"), intent.getStringExtra(Constants.KEY_TTID), intent.getStringExtra("appVersion"));
            a(str, messageBuildBindApp);
            return messageBuildBindApp;
        } catch (Exception e10) {
            ALog.e("Msg", "buildBindApp", e10.getMessage());
            return messageBuildBindApp;
        }
    }

    @Deprecated
    public static Message buildBindService(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        return buildBindService(str, str3);
    }

    @Deprecated
    public static Message buildBindService(com.taobao.accs.net.a aVar, Context context, Intent intent) {
        return buildBindService(aVar.b((String) null), aVar.f98309m, intent);
    }

    public static Message buildBindService(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Message message = new Message();
        message.E = 1;
        message.a(1, ReqType.DATA, 1);
        message.f98214m = str;
        message.serviceId = str2;
        message.f98210i = Constants.TARGET_CONTROL;
        message.command = 5;
        message.f98214m = str;
        message.serviceId = str2;
        message.f98223v = 221;
        message.cunstomDataId = KEY_BINDSERVICE;
        return message;
    }

    public static Message buildBindService(String str, String str2, Intent intent) {
        Message messageBuildBindService = null;
        try {
            messageBuildBindService = buildBindService(intent.getStringExtra("packageName"), intent.getStringExtra(Constants.KEY_SERVICE_ID));
            messageBuildBindService.H = str2;
            a(str, messageBuildBindService);
            return messageBuildBindService;
        } catch (Exception e10) {
            ALog.e("Msg", "buildBindService", e10, new Object[0]);
            e10.printStackTrace();
            return messageBuildBindService;
        }
    }

    @Deprecated
    public static Message buildBindUser(Context context, String str, String str2, String str3, String str4, String str5) {
        return buildBindUser(str, str4);
    }

    @Deprecated
    public static Message buildBindUser(com.taobao.accs.net.a aVar, Context context, Intent intent) {
        return buildBindUser(aVar.b((String) null), aVar.f98309m, intent);
    }

    public static Message buildBindUser(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Message message = new Message();
        message.E = 1;
        message.a(1, ReqType.DATA, 1);
        message.f98214m = str;
        message.userinfo = str2;
        message.f98210i = Constants.TARGET_CONTROL;
        message.command = 3;
        message.f98214m = str;
        message.userinfo = str2;
        message.f98223v = 221;
        message.cunstomDataId = KEY_BINDUSER;
        return message;
    }

    public static Message buildBindUser(String str, String str2, Intent intent) {
        Message messageBuildBindUser = null;
        try {
            messageBuildBindUser = buildBindUser(intent.getStringExtra("packageName"), intent.getStringExtra(Constants.KEY_USER_ID));
            if (messageBuildBindUser != null) {
                messageBuildBindUser.H = str2;
                a(str, messageBuildBindUser);
            }
        } catch (Exception e10) {
            ALog.e("Msg", "buildBindUser", e10, new Object[0]);
            e10.printStackTrace();
        }
        return messageBuildBindUser;
    }

    public static Message buildErrorReportMessage(String str, String str2, String str3, int i10) {
        Message message = new Message();
        try {
            message.host = new URL(str3);
        } catch (MalformedURLException e10) {
            e10.printStackTrace();
        }
        message.f98210i = Constants.TARGET_SERVICE_ST;
        message.a(1, ReqType.DATA, 0);
        message.command = 100;
        message.D = ("0|" + i10 + "|" + str + "|" + com.taobao.accs.utl.j.b(GlobalClientInfo.getContext()) + "|" + str2).getBytes();
        return message;
    }

    public static Message buildForeground(String str) {
        Message message = new Message();
        message.a(1, ReqType.DATA, 0);
        message.command = 100;
        message.f98210i = Constants.TARGET_FORE;
        a(str, message);
        return message;
    }

    public static Message buildHandshake(String str) {
        Message message = new Message();
        message.a(3, ReqType.DATA, 1);
        message.f98214m = str;
        message.f98210i = Constants.TARGET_CONTROL;
        message.command = 200;
        return message;
    }

    public static Message buildParameterError(String str, int i10) {
        Message message = new Message();
        message.a(1, ReqType.ACK, 0);
        message.command = Integer.valueOf(i10);
        message.f98214m = str;
        return message;
    }

    @Deprecated
    public static Message buildPushAck(com.taobao.accs.net.a aVar, String str, String str2, String str3, boolean z10, short s10, String str4, Map<Integer, String> map) {
        return buildPushAck(aVar.b((String) null), aVar.f98309m, str, str2, str3, z10, s10, str4, map);
    }

    public static Message buildPushAck(String str, String str2, String str3, String str4, String str5, boolean z10, short s10, String str6, Map<Integer, String> map) {
        Message message = new Message();
        message.E = 1;
        message.a(s10, z10);
        message.f98211j = str3;
        message.f98210i = str4;
        message.dataId = str5;
        message.isAck = true;
        message.f98213l = map;
        try {
            try {
                if (TextUtils.isEmpty(str6)) {
                    message.host = new URL(str);
                } else {
                    message.host = new URL(str6);
                }
                message.H = str2;
                if (message.host == null) {
                    message.host = new URL(str);
                }
            } catch (Throwable th2) {
                try {
                    ALog.e("Msg", "buildPushAck", th2, new Object[0]);
                    if (message.host == null) {
                        message.host = new URL(str);
                    }
                } catch (Throwable th3) {
                    if (message.host == null) {
                        try {
                            message.host = new URL(str);
                        } catch (MalformedURLException e10) {
                            e10.printStackTrace();
                        }
                    }
                    throw th3;
                }
            }
        } catch (MalformedURLException e11) {
            e11.printStackTrace();
        }
        return message;
    }

    public static Message buildRequest(Context context, String str, String str2, String str3, String str4, String str5, ACCSManager.AccsRequest accsRequest, boolean z10) {
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        Message message = new Message();
        message.E = 1;
        message.a(1, ReqType.REQ, 1);
        message.command = 100;
        message.f98214m = str4;
        message.serviceId = accsRequest.serviceId;
        message.userinfo = accsRequest.userId;
        message.D = accsRequest.data;
        String str6 = TextUtils.isEmpty(accsRequest.targetServiceName) ? accsRequest.serviceId : accsRequest.targetServiceName;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str5);
        sb2.append(str6);
        sb2.append("|");
        String str7 = accsRequest.target;
        if (str7 == null) {
            str7 = "";
        }
        sb2.append(str7);
        message.f98210i = sb2.toString();
        if (TextUtils.isEmpty(accsRequest.dataId)) {
            accsRequest.dataId = message.getMsgId().getDataId();
        }
        message.cunstomDataId = accsRequest.dataId;
        message.bizId = accsRequest.businessId;
        message.H = str2;
        int i10 = accsRequest.timeout;
        if (i10 > 0) {
            message.timeout = i10;
        }
        if (z10) {
            a(str, message, accsRequest);
        } else {
            message.host = accsRequest.host;
        }
        a(message, GlobalClientInfo.getInstance(context).getSid(str2), GlobalClientInfo.getInstance(context).getUserId(str2), str3, GlobalClientInfo.f98173c, accsRequest.businessId, accsRequest.tag);
        NetPerformanceMonitor netPerformanceMonitor = new NetPerformanceMonitor();
        message.G = netPerformanceMonitor;
        netPerformanceMonitor.setDataId(accsRequest.dataId);
        message.G.setServiceId(accsRequest.serviceId);
        message.G.setHost(message.host.toString());
        message.H = str2;
        return message;
    }

    @Deprecated
    public static Message buildRequest(com.taobao.accs.net.a aVar, Context context, String str, String str2, String str3, ACCSManager.AccsRequest accsRequest, boolean z10) {
        return buildRequest(context, aVar.b((String) null), aVar.f98309m, aVar.f98305i.getStoreId(), str, str2, accsRequest, z10);
    }

    @Deprecated
    public static Message buildSendData(com.taobao.accs.net.a aVar, Context context, String str, String str2, ACCSManager.AccsRequest accsRequest) {
        return buildSendData(aVar.b((String) null), aVar.f98309m, aVar.f98305i.getStoreId(), context, str, accsRequest, true);
    }

    @Deprecated
    public static Message buildSendData(com.taobao.accs.net.a aVar, Context context, String str, String str2, ACCSManager.AccsRequest accsRequest, boolean z10) {
        return buildSendData(aVar.b((String) null), aVar.f98309m, aVar.f98305i.getStoreId(), context, str, accsRequest, z10);
    }

    public static Message buildSendData(String str, String str2, String str3, Context context, String str4, ACCSManager.AccsRequest accsRequest) {
        return buildSendData(str, str2, str3, context, str4, accsRequest, true);
    }

    public static Message buildSendData(String str, String str2, String str3, Context context, String str4, ACCSManager.AccsRequest accsRequest, boolean z10) {
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        Message message = new Message();
        message.E = 1;
        message.a(1, ReqType.DATA, 1);
        message.command = 100;
        message.f98214m = str4;
        message.serviceId = accsRequest.serviceId;
        message.userinfo = accsRequest.userId;
        message.D = accsRequest.data;
        String str5 = TextUtils.isEmpty(accsRequest.targetServiceName) ? accsRequest.serviceId : accsRequest.targetServiceName;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Constants.TARGET_SERVICE_PRE);
        sb2.append(str5);
        sb2.append("|");
        String str6 = accsRequest.target;
        if (str6 == null) {
            str6 = "";
        }
        sb2.append(str6);
        message.f98210i = sb2.toString();
        if (TextUtils.isEmpty(accsRequest.dataId)) {
            accsRequest.dataId = message.getMsgId().getDataId();
        }
        message.cunstomDataId = accsRequest.dataId;
        message.bizId = accsRequest.businessId;
        int i10 = accsRequest.timeout;
        if (i10 > 0) {
            message.timeout = i10;
        }
        if (z10) {
            a(str, message, accsRequest);
        } else {
            message.host = accsRequest.host;
        }
        a(message, GlobalClientInfo.getInstance(context).getSid(str2), GlobalClientInfo.getInstance(context).getUserId(str2), str3, GlobalClientInfo.f98173c, accsRequest.businessId, accsRequest.tag);
        NetPerformanceMonitor netPerformanceMonitor = new NetPerformanceMonitor();
        message.G = netPerformanceMonitor;
        netPerformanceMonitor.setMsgType(0);
        message.G.setDataId(accsRequest.dataId);
        message.G.setServiceId(accsRequest.serviceId);
        message.G.setHost(message.host.toString());
        message.H = str2;
        return message;
    }

    @Deprecated
    public static Message buildUnbindApp(com.taobao.accs.net.a aVar, Context context, Intent intent) {
        return buildUnbindApp(aVar.b((String) null), intent);
    }

    @Deprecated
    public static Message buildUnbindApp(com.taobao.accs.net.a aVar, Context context, String str, String str2, String str3, String str4) {
        return buildUnbindApp(aVar.b((String) null), str);
    }

    public static Message buildUnbindApp(String str, Intent intent) {
        ALog.e("Msg", "buildUnbindApp1" + UtilityImpl.a(new Exception()), new Object[0]);
        Message messageBuildUnbindApp = null;
        try {
            messageBuildUnbindApp = buildUnbindApp(str, intent.getStringExtra("packageName"));
            a(str, messageBuildUnbindApp);
            return messageBuildUnbindApp;
        } catch (Exception e10) {
            ALog.e("Msg", "buildUnbindApp1", e10.getMessage());
            return messageBuildUnbindApp;
        }
    }

    public static Message buildUnbindApp(String str, String str2) {
        Message message = null;
        try {
            ALog.d("Msg", "buildUnbindApp", new Object[0]);
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            Message message2 = new Message();
            try {
                message2.E = 1;
                message2.a(1, ReqType.DATA, 1);
                message2.f98214m = str2;
                message2.f98210i = Constants.TARGET_CONTROL;
                message2.command = 2;
                message2.f98214m = str2;
                message2.f98223v = 221;
                message2.cunstomDataId = KEY_UNBINDAPP;
                a(str, message2);
                return message2;
            } catch (Exception e10) {
                e = e10;
                message = message2;
            }
        } catch (Exception e11) {
            e = e11;
        }
        ALog.e("Msg", "buildUnbindApp", e.getMessage());
        return message;
    }

    @Deprecated
    public static Message buildUnbindService(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        return buildUnbindService(str, str3);
    }

    @Deprecated
    public static Message buildUnbindService(com.taobao.accs.net.a aVar, Context context, Intent intent) {
        return buildUnbindService(aVar.b((String) null), aVar.f98309m, intent);
    }

    public static Message buildUnbindService(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Message message = new Message();
        message.E = 1;
        message.a(1, ReqType.DATA, 1);
        message.f98214m = str;
        message.serviceId = str2;
        message.f98210i = Constants.TARGET_CONTROL;
        message.command = 6;
        message.f98214m = str;
        message.serviceId = str2;
        message.f98223v = 221;
        message.cunstomDataId = KEY_UNBINDSERVICE;
        return message;
    }

    public static Message buildUnbindService(String str, String str2, Intent intent) {
        Message messageBuildUnbindService = null;
        try {
            messageBuildUnbindService = buildUnbindService(intent.getStringExtra("packageName"), intent.getStringExtra(Constants.KEY_SERVICE_ID));
            messageBuildUnbindService.H = str2;
            a(str, messageBuildUnbindService);
            return messageBuildUnbindService;
        } catch (Exception e10) {
            ALog.e("Msg", "buildUnbindService", e10, new Object[0]);
            e10.printStackTrace();
            return messageBuildUnbindService;
        }
    }

    @Deprecated
    public static Message buildUnbindUser(Context context, String str, String str2, String str3, String str4, String str5) {
        return buildUnbindUser(str);
    }

    @Deprecated
    public static Message buildUnbindUser(com.taobao.accs.net.a aVar, Context context, Intent intent) {
        return buildUnbindUser(aVar.b((String) null), aVar.f98309m, intent);
    }

    public static Message buildUnbindUser(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Message message = new Message();
        message.E = 1;
        message.a(1, ReqType.DATA, 1);
        message.f98214m = str;
        message.f98210i = Constants.TARGET_CONTROL;
        message.command = 4;
        message.f98223v = 221;
        message.cunstomDataId = KEY_UNBINDUSER;
        return message;
    }

    public static Message buildUnbindUser(String str, String str2, Intent intent) {
        Message messageBuildUnbindUser = null;
        try {
            messageBuildUnbindUser = buildUnbindUser(intent.getStringExtra("packageName"));
            messageBuildUnbindUser.H = str2;
            a(str, messageBuildUnbindUser);
            return messageBuildUnbindUser;
        } catch (Exception e10) {
            ALog.e("Msg", "buildUnbindUser", e10, new Object[0]);
            e10.printStackTrace();
            return messageBuildUnbindUser;
        }
    }

    private String c() {
        return "Msg" + lg.a.f131412e + this.H;
    }

    short a(Map<Integer, String> map) {
        short length = 0;
        if (map != null) {
            try {
                Iterator<Integer> it = map.keySet().iterator();
                while (it.hasNext()) {
                    String str = map.get(Integer.valueOf(it.next().intValue()));
                    if (!TextUtils.isEmpty(str)) {
                        length = (short) (length + ((short) (str.getBytes("utf-8").length & 1023)) + 2);
                    }
                }
            } catch (Exception e10) {
                e10.toString();
            }
        }
        return length;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004b A[Catch: Exception -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0051, blocks: (B:13:0x0029, B:14:0x002c, B:24:0x004b), top: B:46:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0051 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x005a A[Catch: Exception -> 0x005d, TRY_LEAVE, TryCatch #3 {Exception -> 0x005d, blocks: (B:30:0x0055, B:32:0x005a), top: B:42:0x0055 }] */
    void a() {
        GZIPOutputStream gZIPOutputStream;
        Throwable th2;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            try {
                try {
                    if (this.D == null) {
                        return;
                    }
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            gZIPOutputStream.write(this.D);
                            gZIPOutputStream.finish();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            if (byteArray != null && byteArray.length < this.D.length) {
                                this.D = byteArray;
                                this.f98203b = (byte) 1;
                            }
                            gZIPOutputStream.close();
                        } catch (Throwable th3) {
                            th2 = th3;
                            Log.e(c(), th2.toString());
                            th2.printStackTrace();
                            if (gZIPOutputStream != null) {
                                gZIPOutputStream.close();
                            }
                            if (byteArrayOutputStream == null) {
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        gZIPOutputStream = null;
                        th2 = th4;
                    }
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    gZIPOutputStream = null;
                    th2 = th5;
                    byteArrayOutputStream = null;
                }
                Log.e(c(), th2.toString());
                th2.printStackTrace();
                if (gZIPOutputStream != null) {
                    gZIPOutputStream.close();
                }
                if (byteArrayOutputStream == null) {
                    return;
                }
                byteArrayOutputStream.close();
            } catch (Throwable th6) {
                if (gZIPOutputStream != null) {
                    try {
                        gZIPOutputStream.close();
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                    } catch (Exception unused) {
                        throw th6;
                    }
                } else if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                throw th6;
            }
        } catch (Exception unused2) {
        }
    }

    void b() throws JSONException, UnsupportedEncodingException {
        Integer num = this.command;
        if (num == null || num.intValue() == 100 || this.command.intValue() == 102) {
            return;
        }
        this.D = new p.a().a("command", this.command.intValue() == 100 ? null : this.command).a("appKey", this.f98216o).a(Constants.KEY_OS_TYPE, this.f98217p).a("sign", this.appSign).a("sdkVersion", this.f98223v).a("appVersion", this.f98222u).a(Constants.KEY_TTID, this.f98224w).a(Constants.KEY_MODEL, this.f98226y).a("brand", this.f98227z).a("imei", this.A).a(Constants.KEY_IMSI, this.B).a(Constants.KYE_MAC_ADDRESS, this.f98225x).a("os", this.f98218q).a(Constants.KEY_EXTS, this.f98221t).a().toString().getBytes("utf-8");
    }

    public byte[] build(Context context, int i10) {
        byte[] bytes;
        try {
            b();
        } catch (UnsupportedEncodingException e10) {
            ALog.e(c(), "build2", e10, new Object[0]);
        } catch (JSONException e11) {
            ALog.e(c(), "build1", e11, new Object[0]);
        }
        byte[] bArr = this.D;
        String str = bArr != null ? new String(bArr) : "";
        a();
        if (!this.isAck) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(UtilityImpl.j(context));
            sb2.append("|");
            sb2.append(this.f98214m);
            sb2.append("|");
            String str2 = this.serviceId;
            if (str2 == null) {
                str2 = "";
            }
            sb2.append(str2);
            sb2.append("|");
            String str3 = this.userinfo;
            if (str3 == null) {
                str3 = "";
            }
            sb2.append(str3);
            this.f98211j = sb2.toString();
        }
        try {
            bytes = (this.dataId + "").getBytes("utf-8");
            this.f98209h = (byte) this.f98211j.getBytes("utf-8").length;
            this.f98208g = (byte) this.f98210i.getBytes("utf-8").length;
        } catch (Exception e12) {
            e12.printStackTrace();
            ALog.e(c(), "build3", e12, new Object[0]);
            bytes = (this.dataId + "").getBytes();
            this.f98209h = (byte) this.f98211j.getBytes().length;
            this.f98208g = (byte) this.f98210i.getBytes().length;
        }
        short sA = a(this.f98213l);
        int length = this.f98208g + 3 + 1 + this.f98209h + 1 + bytes.length;
        byte[] bArr2 = this.D;
        short length2 = (short) (length + (bArr2 == null ? 0 : bArr2.length) + sA + 2);
        this.f98206e = length2;
        this.f98205d = (short) (length2 + 2);
        r rVar = new r(this.f98205d + 2 + 4);
        ALog.Level level = ALog.Level.D;
        if (ALog.isPrintLog(level)) {
            ALog.d(c(), "Build Message", Constants.KEY_DATA_ID, new String(bytes));
        }
        try {
            rVar.a((byte) (this.f98203b | 32));
            if (ALog.isPrintLog(level)) {
                ALog.d(c(), "\tversion:2 compress:" + ((int) this.f98203b), new Object[0]);
            }
            if (i10 == 0) {
                rVar.a((byte) -128);
                if (ALog.isPrintLog(level)) {
                    ALog.d(c(), "\tflag: 0x80", new Object[0]);
                }
            } else {
                rVar.a(SignedBytes.f59068a);
                if (ALog.isPrintLog(level)) {
                    ALog.d(c(), "\tflag: 0x40", new Object[0]);
                }
            }
            rVar.a(this.f98205d);
            if (ALog.isPrintLog(level)) {
                ALog.d(c(), "\ttotalLength:" + ((int) this.f98205d), new Object[0]);
            }
            rVar.a(this.f98206e);
            if (ALog.isPrintLog(level)) {
                ALog.d(c(), "\tdataLength:" + ((int) this.f98206e), new Object[0]);
            }
            rVar.a(this.f98207f);
            if (ALog.isPrintLog(level)) {
                ALog.d(c(), "\tflags:" + Integer.toHexString(this.f98207f), new Object[0]);
            }
            rVar.a(this.f98208g);
            if (ALog.isPrintLog(level)) {
                ALog.d(c(), "\ttargetLength:" + ((int) this.f98208g), new Object[0]);
            }
            rVar.write(this.f98210i.getBytes("utf-8"));
            if (ALog.isPrintLog(level)) {
                ALog.d(c(), "\ttarget:" + this.f98210i, new Object[0]);
            }
            rVar.a(this.f98209h);
            if (ALog.isPrintLog(level)) {
                ALog.d(c(), "\tsourceLength:" + ((int) this.f98209h), new Object[0]);
            }
            rVar.write(this.f98211j.getBytes("utf-8"));
            if (ALog.isPrintLog(level)) {
                ALog.d(c(), "\tsource:" + this.f98211j, new Object[0]);
            }
            rVar.a((byte) bytes.length);
            if (ALog.isPrintLog(level)) {
                ALog.d(c(), "\tdataIdLength:" + bytes.length, new Object[0]);
            }
            rVar.write(bytes);
            if (ALog.isPrintLog(level)) {
                ALog.d(c(), "\tdataId:" + new String(bytes), new Object[0]);
            }
            rVar.a(sA);
            if (ALog.isPrintLog(level)) {
                ALog.d(c(), "\textHeader len:" + ((int) sA), new Object[0]);
            }
            Map<Integer, String> map = this.f98213l;
            if (map != null) {
                Iterator<Integer> it = map.keySet().iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    String str4 = this.f98213l.get(Integer.valueOf(iIntValue));
                    if (!TextUtils.isEmpty(str4)) {
                        rVar.a((short) ((((short) iIntValue) << 10) | ((short) (str4.getBytes("utf-8").length & 1023))));
                        rVar.write(str4.getBytes("utf-8"));
                        if (ALog.isPrintLog(ALog.Level.D)) {
                            ALog.d(c(), "\textHeader key:" + iIntValue + " value:" + str4, new Object[0]);
                        }
                    }
                }
            }
            byte[] bArr3 = this.D;
            if (bArr3 != null) {
                rVar.write(bArr3);
            }
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d(c(), "\toriData:" + str, new Object[0]);
            }
            rVar.flush();
        } catch (IOException e13) {
            ALog.e(c(), "build4", e13, new Object[0]);
        }
        byte[] byteArray = rVar.toByteArray();
        try {
            rVar.close();
        } catch (IOException e14) {
            ALog.e(c(), "build5", e14, new Object[0]);
        }
        return byteArray;
    }

    public String getDataId() {
        return this.dataId;
    }

    public long getDelyTime() {
        return this.delyTime;
    }

    public Id getMsgId() {
        return this.I;
    }

    public NetPerformanceMonitor getNetPermanceMonitor() {
        return this.G;
    }

    public int getNode() {
        return this.E;
    }

    public String getPackageName() {
        String str = this.f98214m;
        return str == null ? "" : str;
    }

    public int getRetryTimes() {
        return this.retryTimes;
    }

    public int getType() {
        return this.f98212k;
    }

    public boolean isControlFrame() {
        return Constants.TARGET_CONTROL.equals(this.f98210i);
    }

    public boolean isTimeOut() {
        boolean z10 = (System.currentTimeMillis() - this.startSendTime) + this.delyTime >= ((long) this.timeout);
        if (z10) {
            ALog.e(c(), "delay time:" + this.delyTime + " beforeSendTime:" + (System.currentTimeMillis() - this.startSendTime) + " timeout" + this.timeout, new Object[0]);
        }
        return z10;
    }

    public void setSendTime(long j10) {
        this.F = j10;
    }
}
