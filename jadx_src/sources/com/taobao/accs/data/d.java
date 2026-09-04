package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import com.google.android.exoplayer2.source.rtsp.k0;
import com.taobao.accs.ErrorCode;
import com.taobao.accs.antibrush.AntiBrush;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.flowcontrol.FlowControl;
import com.taobao.accs.ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.ut.monitor.TrafficsMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.p;
import com.taobao.accs.utl.s;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f98244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected TrafficsMonitor f98245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FlowControl f98246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AntiBrush f98247e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Context f98251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.taobao.accs.ut.a.d f98252j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Message f98253k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.taobao.accs.net.a f98254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f98255m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ConcurrentMap<Message.Id, Message> f98249g = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentMap<String, ScheduledFuture<?>> f98243a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f98250h = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f98248f = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private LinkedHashMap<String, String> f98256n = new LinkedHashMap<String, String>() { // from class: com.taobao.accs.data.MessageHandler$1
        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<String, String> entry) {
            return size() > 50;
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Map<String, a> f98257o = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Runnable f98258p = new f(this);

    public d(Context context, com.taobao.accs.net.a aVar) {
        String str;
        this.f98255m = "MsgRecv_";
        this.f98251i = context;
        this.f98254l = aVar;
        this.f98245c = new TrafficsMonitor(context);
        this.f98246d = new FlowControl(this.f98251i);
        this.f98247e = new AntiBrush(this.f98251i);
        if (aVar == null) {
            str = this.f98255m;
        } else {
            str = this.f98255m + aVar.f98309m;
        }
        this.f98255m = str;
        i();
        h();
    }

    private Map<Integer, String> a(s sVar) {
        HashMap map = null;
        if (sVar == null) {
            return null;
        }
        try {
            int iB = sVar.b();
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d(this.f98255m, "extHeaderLen:" + iB, new Object[0]);
            }
            int i10 = 0;
            while (i10 < iB) {
                int iB2 = sVar.b();
                int i11 = (64512 & iB2) >> 10;
                int i12 = iB2 & 1023;
                String strA = sVar.a(i12);
                i10 = i10 + 2 + i12;
                if (map == null) {
                    map = new HashMap();
                }
                map.put(Integer.valueOf(i11), strA);
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.d(this.f98255m, "", "extHeaderType", Integer.valueOf(i11), "value", strA);
                }
            }
        } catch (Exception e10) {
            ALog.e(this.f98255m, "parseExtHeader", e10, new Object[0]);
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0130  */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: TypeSearchVarInfo not found in map for var: r13v0 java.lang.Object
    	at jadx.core.dex.visitors.typeinference.TypeSearchState.getVarInfo(TypeSearchState.java:34)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.lambda$resolveIndependentVariables$1(TypeSearch.java:173)
    	at java.base/java.util.stream.MatchOps$1MatchSink.accept(MatchOps.java:90)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1602)
    	at java.base/java.util.stream.ReferencePipeline$7$1.accept(ReferencePipeline.java:280)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1602)
    	at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
    	at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.allMatch(ReferencePipeline.java:637)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.resolveIndependentVariables(TypeSearch.java:173)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:63)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Type inference failed for: r3v111 */
    /* JADX WARN: Type inference failed for: r3v112 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v46, types: [com.taobao.accs.utl.ALog$Level] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference failed for: r47v0, types: [com.taobao.accs.data.d] */
    /* JADX WARN: Type inference failed for: r4v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    private void a(int i10, byte[] bArr, String str, int i11) throws IOException {
        Map<Integer, String> mapA;
        byte[] bArr2;
        boolean z10;
        String str2;
        ?? r10;
        String str3;
        ?? r11;
        ?? A;
        Map<Integer, String> map;
        String str4;
        char c10;
        int i12;
        char c11;
        int i13;
        Map<Integer, String> map2;
        int i14;
        int i15;
        byte[] bArrA;
        Map<Integer, String> map3;
        String str5;
        String str6;
        long j10;
        Map<Integer, String> map4;
        String str7;
        Object obj;
        long j11;
        boolean z11;
        boolean z12;
        Map<Integer, String> map5;
        Message message;
        boolean z13;
        byte[] bArrC;
        String str8 = "accs";
        s sVar = new s(bArr);
        long jB = sVar.b();
        ALog.Level level = ALog.Level.D;
        if (ALog.isPrintLog(level)) {
            ALog.d(this.f98255m, "flag:" + Integer.toHexString((int) jB), new Object[0]);
        }
        String strA = sVar.a(sVar.a());
        if (ALog.isPrintLog(level)) {
            ALog.d(this.f98255m, "target:" + strA, new Object[0]);
        }
        String strA2 = sVar.a(sVar.a());
        if (ALog.isPrintLog(level)) {
            ALog.d(this.f98255m, "source:" + strA2, new Object[0]);
        }
        try {
            String strA3 = sVar.a(sVar.a());
            if (ALog.isPrintLog(level)) {
                ALog.d(this.f98255m, "dataId:" + strA3, new Object[0]);
            }
            if (strA2.contains(Constants.TARGET_SERVICE_ST) || strA2.contains(Constants.TARGET_FORE) || strA2.contains(Constants.TARGET_BACK)) {
                ALog.e(this.f98255m, "ignore source 4|sal|sg/fg/bg message dataId:" + strA3, new Object[0]);
                this.f98249g.remove(new Message.Id(0, strA3));
                return;
            }
            String str9 = strA2 + strA3;
            if (sVar.available() > 0) {
                if (i11 == 2) {
                    mapA = a(sVar);
                    if (mapA != null && mapA.containsKey(16) && mapA.containsKey(17)) {
                        z13 = true;
                    }
                    if (i10 != 0 || z13) {
                        bArrC = sVar.c();
                    } else if (i10 == 1) {
                        bArrC = a(sVar);
                    } else {
                        z10 = z13;
                        bArr2 = null;
                    }
                    byte[] bArr3 = bArrC;
                    z10 = z13;
                    bArr2 = bArr3;
                } else {
                    mapA = null;
                }
                z13 = false;
                if (i10 != 0) {
                    bArrC = sVar.c();
                    byte[] bArr4 = bArrC;
                    z10 = z13;
                    bArr2 = bArr4;
                } else {
                    bArrC = sVar.c();
                    byte[] bArr5 = bArrC;
                    z10 = z13;
                    bArr2 = bArr5;
                }
            } else {
                mapA = null;
                bArr2 = null;
                z10 = false;
            }
            sVar.close();
            try {
                if (bArr2 == null) {
                    try {
                        map = mapA;
                        str4 = "accs";
                        ALog.d(this.f98255m, "oriData is null", new Object[0]);
                    } catch (Exception e10) {
                        e = e10;
                        str2 = "handleMessage";
                        A = str8;
                        r10 = r13;
                        str3 = r14;
                        r11 = r12;
                        ALog.e(this.f98255m, str2, e, new Object[0]);
                        com.taobao.accs.utl.k.a(A, r10, r11, str3, this.f98244b + e.toString());
                        return;
                    }
                } else {
                    map = mapA;
                    str4 = "accs";
                    if (ALog.isPrintLog(level)) {
                        ALog.d(this.f98255m, "oriData:" + String.valueOf(bArr2), new Object[0]);
                    }
                }
                int iValueOf = Message.MsgType.valueOf((int) ((jB >> 15) & 1));
                Message.ReqType reqTypeValueOf = Message.ReqType.valueOf((int) ((jB >> 13) & 3));
                int i16 = (int) ((jB >> 12) & 1);
                int iValueOf2 = Message.MsgResType.valueOf((int) ((jB >> 11) & 1));
                boolean z14 = ((int) ((jB >> 6) & 1)) == 1;
                String str10 = "accs-impaas";
                String str11 = "target";
                if (ALog.isPrintLog(ALog.Level.I) || strA.contains("accs-impaas")) {
                    c10 = 2;
                    i12 = 4;
                    c11 = 6;
                    ALog.e(this.f98255m, "handleMessage", Constants.KEY_DATA_ID, strA3, "type", Message.MsgType.name(iValueOf), "reqType", reqTypeValueOf.name(), "resType", Message.MsgResType.name(iValueOf2), "target", strA);
                    i13 = 1;
                } else {
                    i13 = 1;
                    c10 = 2;
                    i12 = 4;
                    c11 = 6;
                }
                try {
                    if (iValueOf == i13 && (reqTypeValueOf == Message.ReqType.ACK || reqTypeValueOf == Message.ReqType.RES)) {
                        try {
                            Message messageRemove = this.f98249g.remove(new Message.Id(0, strA3));
                            if (messageRemove != null) {
                                if (ALog.isPrintLog(level)) {
                                    try {
                                        z12 = false;
                                        ALog.d(this.f98255m, "handleMessage reqMessage not null", new Object[0]);
                                    } catch (Exception e11) {
                                        e = e11;
                                        r10 = r13;
                                        str3 = r14;
                                        r11 = "";
                                        A = str4;
                                        str2 = "handleMessage";
                                        ALog.e(this.f98255m, str2, e, new Object[0]);
                                        com.taobao.accs.utl.k.a(A, r10, r11, str3, this.f98244b + e.toString());
                                        return;
                                    }
                                } else {
                                    z12 = false;
                                }
                                int i17 = 200;
                                if (i16 == 1) {
                                    try {
                                        i17 = new JSONObject(new String(bArr2)).getInt("code");
                                    } catch (Exception unused) {
                                        i17 = -3;
                                    }
                                }
                                int i18 = i17;
                                if (messageRemove.getNetPermanceMonitor() != null) {
                                    messageRemove.getNetPermanceMonitor().onRecAck();
                                }
                                if (reqTypeValueOf == Message.ReqType.RES) {
                                    str2 = "handleMessage";
                                    Map<Integer, String> map6 = map;
                                    message = messageRemove;
                                    i14 = iValueOf2;
                                    a(messageRemove, i18, reqTypeValueOf, bArr2, map6);
                                    map5 = map6;
                                } else {
                                    i14 = iValueOf2;
                                    str2 = "handleMessage";
                                    map5 = map;
                                    message = messageRemove;
                                    a(message, i18, map5);
                                }
                                map2 = map5;
                                a(new TrafficsMonitor.a(message.serviceId, GlobalAppRuntimeInfo.isAppBackground(), str, bArr.length));
                                i15 = 0;
                            } else {
                                map2 = map;
                                strA = strA;
                                bArr2 = bArr2;
                                str10 = "accs-impaas";
                                i14 = iValueOf2;
                                z14 = z14;
                                str2 = "handleMessage";
                                str11 = "target";
                                i15 = 0;
                                ALog.e(this.f98255m, "handleMessage data ack/res reqMessage is null", Constants.KEY_DATA_ID, strA3);
                            }
                        } catch (Exception e12) {
                            e = e12;
                            str2 = "handleMessage";
                            r10 = r13;
                            str3 = r14;
                            r11 = r12;
                            A = str4;
                            ALog.e(this.f98255m, str2, e, new Object[0]);
                            com.taobao.accs.utl.k.a(A, r10, r11, str3, this.f98244b + e.toString());
                            return;
                        }
                    } else {
                        map2 = map;
                        str2 = "handleMessage";
                        strA = strA;
                        bArr2 = bArr2;
                        str10 = "accs-impaas";
                        i14 = iValueOf2;
                        z14 = z14;
                        i15 = 0;
                        str11 = "target";
                    }
                    if (iValueOf == 0 && reqTypeValueOf == Message.ReqType.RES) {
                        Message messageRemove2 = this.f98249g.remove(new Message.Id(i15, strA3));
                        if (messageRemove2 != null) {
                            a(messageRemove2, bArr2, bArr, str);
                            return;
                        }
                        bArrA = bArr2;
                        String str12 = this.f98255m;
                        Object[] objArr = new Object[2];
                        objArr[i15] = Constants.KEY_DATA_ID;
                        objArr[1] = strA3;
                        ALog.e(str12, "handleMessage contorl ACK reqMessage is null", objArr);
                        if (ALog.isPrintLog(ALog.Level.D)) {
                            String str13 = this.f98255m;
                            Object[] objArr2 = new Object[2];
                            objArr2[i15] = "body";
                            objArr2[1] = new String(bArrA);
                            ALog.d(str13, "handleMessage not handled", objArr2);
                        }
                    } else {
                        bArrA = bArr2;
                    }
                    if (iValueOf != 1 || reqTypeValueOf != Message.ReqType.DATA) {
                        return;
                    }
                    String str14 = strA;
                    if (str14 == null) {
                        ALog.e(this.f98255m, "handleMessage target is null", new Object[i15]);
                        return;
                    }
                    String[] strArrSplit = str14.split("\\|");
                    if (strArrSplit.length < 2) {
                        ALog.e(this.f98255m, "handleMessage target length is invalid", new Object[i15]);
                        return;
                    }
                    r10 = ALog.Level.D;
                    if (ALog.isPrintLog(r10)) {
                        String str15 = this.f98255m;
                        Object[] objArr3 = new Object[2];
                        objArr3[i15] = "isBurstData";
                        objArr3[1] = Boolean.valueOf(z10);
                        ALog.d(str15, "handleMessage onPush", objArr3);
                    }
                    com.taobao.accs.ut.a.d dVar = this.f98252j;
                    if (dVar != null) {
                        dVar.a();
                    }
                    com.taobao.accs.ut.a.d dVar2 = new com.taobao.accs.ut.a.d();
                    this.f98252j = dVar2;
                    dVar2.f98417c = String.valueOf(System.currentTimeMillis());
                    r11 = 1;
                    A = UtilityImpl.a(this.f98251i, strArrSplit[1]);
                    try {
                        if (A != 0) {
                            String str16 = strArrSplit.length >= 3 ? strArrSplit[2] : null;
                            this.f98252j.f98419e = str16;
                            if (c(str9)) {
                                String str17 = this.f98255m;
                                Object[] objArr4 = new Object[2];
                                objArr4[i15] = Constants.KEY_DATA_ID;
                                objArr4[1] = strA3;
                                ALog.e(str17, "handleMessage msg duplicate", objArr4);
                                this.f98252j.f98422h = true;
                                obj = Constants.KEY_DATA_ID;
                                str7 = r12;
                                str6 = strA2;
                                str8 = str4;
                                j11 = jB;
                                map4 = map2;
                            } else {
                                if (z10) {
                                    map3 = map2;
                                    bArrA = a(str9, map3, bArrA);
                                    if (bArrA == null) {
                                        ALog.e(this.f98255m, "handleMessage completeOriData is null", new Object[i15]);
                                        return;
                                    }
                                    int i19 = i12;
                                    if (i10 == 1) {
                                        s sVar2 = new s(bArrA);
                                        bArrA = a(sVar2);
                                        if (ALog.isPrintLog(r10)) {
                                            String str18 = this.f98255m;
                                            Object[] objArr5 = new Object[i19];
                                            objArr5[0] = Constants.KEY_DATA_ID;
                                            objArr5[1] = str9;
                                            objArr5[2] = k0.f48801p;
                                            objArr5[3] = Integer.valueOf(bArrA.length);
                                            ALog.d(str18, "handleMessage gzip completeOriData", objArr5);
                                        }
                                        sVar2.close();
                                    }
                                } else {
                                    map3 = map2;
                                }
                                byte[] bArr6 = bArrA;
                                d(str9);
                                str8 = str4;
                                try {
                                    if (str8.equals(str16)) {
                                        ALog.e(this.f98255m, "handleMessage try deliverMsg", Constants.KEY_DATA_ID, strA3, str11, strArrSplit[1], Constants.KEY_SERVICE_ID, str16);
                                    } else if (ALog.isPrintLog(ALog.Level.I)) {
                                        ALog.i(this.f98255m, "handleMessage try deliverMsg", Constants.KEY_DATA_ID, strA3, str11, strArrSplit[1], Constants.KEY_SERVICE_ID, str16);
                                    }
                                    Intent intent = new Intent(Constants.ACTION_RECEIVE);
                                    intent.setPackage(strArrSplit[1]);
                                    intent.putExtra("command", 101);
                                    if (strArrSplit.length >= 3) {
                                        intent.putExtra(Constants.KEY_SERVICE_ID, strArrSplit[2]);
                                    }
                                    if (strArrSplit.length >= 4) {
                                        str5 = strArrSplit[3];
                                        intent.putExtra(Constants.KEY_USER_ID, str5);
                                    } else {
                                        str5 = r12;
                                    }
                                    intent.putExtra("data", bArr6);
                                    intent.putExtra(Constants.KEY_DATA_ID, strA3);
                                    intent.putExtra("packageName", this.f98251i.getPackageName());
                                    intent.putExtra("host", str);
                                    intent.putExtra(Constants.KEY_CONN_TYPE, this.f98244b);
                                    z14 = z14;
                                    intent.putExtra(Constants.KEY_NEED_BUSINESS_ACK, z14);
                                    intent.putExtra("appKey", this.f98254l.i());
                                    intent.putExtra(Constants.KEY_CONFIG_TAG, this.f98254l.f98309m);
                                    NetPerformanceMonitor netPerformanceMonitor = new NetPerformanceMonitor();
                                    netPerformanceMonitor.setMsgType(4);
                                    netPerformanceMonitor.onReceiveData();
                                    intent.putExtra(Constants.KEY_MONIROT, netPerformanceMonitor);
                                    a(map3, intent);
                                    if (z14) {
                                        j10 = jB;
                                        str6 = strA2;
                                        a(intent, str6, str14, (short) j10);
                                    } else {
                                        str6 = strA2;
                                        j10 = jB;
                                    }
                                    g.a().b(this.f98251i, intent);
                                    UTMini.getInstance().commitEvent(66001, "MsgToBussPush", "commandId=101", "serviceId=" + str16 + " dataId=" + strA3, 221);
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("1commandId=101serviceId=");
                                    sb2.append(str16);
                                    map4 = map3;
                                    com.taobao.accs.utl.k.a(str8, BaseMonitor.COUNT_POINT_TO_BUSS, sb2.toString(), 0.0d);
                                    com.taobao.accs.ut.a.d dVar3 = this.f98252j;
                                    dVar3.f98416b = strA3;
                                    dVar3.f98423i = str5;
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(bArr6 == null ? 0 : bArr6.length);
                                    str7 = r12;
                                    try {
                                        sb3.append(str7);
                                        dVar3.f98420f = sb3.toString();
                                        this.f98252j.f98415a = UtilityImpl.j(this.f98251i);
                                        this.f98252j.f98418d = String.valueOf(System.currentTimeMillis());
                                        boolean zIsAppBackground = GlobalAppRuntimeInfo.isAppBackground();
                                        long length = bArr.length;
                                        obj = Constants.KEY_DATA_ID;
                                        j11 = j10;
                                        a(new TrafficsMonitor.a(str16, zIsAppBackground, str, length));
                                    } catch (Exception e13) {
                                        e = e13;
                                        r11 = str7;
                                        A = str8;
                                        r10 = r13;
                                        str3 = r14;
                                        ALog.e(this.f98255m, str2, e, new Object[0]);
                                        com.taobao.accs.utl.k.a(A, r10, r11, str3, this.f98244b + e.toString());
                                        return;
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                    A = str8;
                                    r10 = r13;
                                    str3 = r14;
                                    r11 = r12;
                                    ALog.e(this.f98255m, str2, e, new Object[0]);
                                    com.taobao.accs.utl.k.a(A, r10, r11, str3, this.f98244b + e.toString());
                                    return;
                                }
                            }
                            if (i14 != 1) {
                                return;
                            }
                            if (str8.equals(str16) || str10.equals(str16)) {
                                z11 = true;
                                ALog.e(this.f98255m, "handleMessage try sendAck dataId", obj, strA3);
                            } else {
                                ALog.i(this.f98255m, "handleMessage try sendAck dataId", obj, strA3);
                                z11 = true;
                            }
                            String str19 = str8;
                            String str20 = str7;
                            boolean z15 = z14;
                            boolean z16 = z11;
                            String str21 = str16;
                            Object obj2 = r13;
                            str3 = r14;
                            Message messageBuildPushAck = Message.buildPushAck(this.f98254l.b((String) null), this.f98254l.d(), str14, str6, strA3, false, (short) j11, str, map4);
                            this.f98254l.b(messageBuildPushAck, z16);
                            a(messageBuildPushAck.dataId, str21);
                            r10 = obj2;
                            A = str19;
                            r11 = str20;
                            if (z15) {
                                com.taobao.accs.utl.k.a(str19, BaseMonitor.COUNT_ACK, str20, 0.0d);
                                r10 = obj2;
                                A = str19;
                                r11 = str20;
                            }
                        } else {
                            r10 = r13;
                            str3 = r14;
                            r11 = r12;
                            A = str4;
                            ALog.e(this.f98255m, "handleMessage not exist, unbind it", "package", strArrSplit[1]);
                            com.taobao.accs.net.a aVar = this.f98254l;
                            aVar.b(Message.buildUnbindApp(aVar.b((String) null), strArrSplit[1]), true);
                        }
                    } catch (Exception e15) {
                        e = e15;
                    }
                } catch (Exception e16) {
                    e = e16;
                }
            } catch (Exception e17) {
                e = e17;
                str2 = "handleMessage";
            }
        } catch (Exception e18) {
            ALog.e(this.f98255m, "dataId read error " + e18.toString(), new Object[0]);
            sVar.close();
            com.taobao.accs.utl.k.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", this.f98244b + "data id read error" + e18.toString());
        }
    }

    private void a(Intent intent, String str, String str2, short s10) {
        if (intent != null) {
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("source", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("target", str2);
            }
            intent.putExtra(Constants.KEY_FLAGS, s10);
        }
    }

    private void a(Message message, int i10, boolean z10) {
        boolean z11;
        try {
            NetPerformanceMonitor netPermanceMonitor = message.getNetPermanceMonitor();
            if (netPermanceMonitor == null) {
                return;
            }
            netPermanceMonitor.onToBizDate();
            URL url = message.host;
            String string = url == null ? null : url.toString();
            if (i10 == 200) {
                z11 = true;
                if (message.retryTimes > 0) {
                    com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_POINT_RESEND, "succ", 0.0d);
                    com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_POINT_RESEND, "succ_" + message.retryTimes, 0.0d);
                } else {
                    com.taobao.accs.utl.k.a("accs", BaseMonitor.ALARM_POINT_REQUEST, string);
                }
            } else {
                if (message.retryTimes > 0) {
                    com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_POINT_RESEND, "fail＿" + i10, 0.0d);
                    com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_POINT_RESEND, "fail", 0.0d);
                } else if (i10 != -13) {
                    com.taobao.accs.utl.k.a("accs", BaseMonitor.ALARM_POINT_REQUEST, string, UtilityImpl.a(i10), this.f98244b + message.serviceId + message.timeout);
                }
                netPermanceMonitor.setFailReason(i10);
                z11 = false;
            }
            netPermanceMonitor.setRet(z11);
            if (z10) {
                if (message.isCancel) {
                    netPermanceMonitor.setRet(false);
                    netPermanceMonitor.setFailReason("msg cancel");
                }
                AppMonitor.getInstance().commitStat(message.getNetPermanceMonitor());
            }
        } catch (Throwable th2) {
            ALog.e(this.f98255m, "monitorPerf", th2, new Object[0]);
        }
    }

    private void a(Message message, byte[] bArr, byte[] bArr2, String str) {
        JSONArray jSONArray;
        int i10 = -8;
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.d(this.f98255m, "handleControlMessage parse", "json", jSONObject.toString());
                }
                i10 = message.command.intValue() == 100 ? 200 : jSONObject.getInt("code");
                if (i10 == 200) {
                    int iIntValue = message.command.intValue();
                    if (iIntValue == 1) {
                        UtilityImpl.c(Constants.SP_FILE_NAME, this.f98251i);
                        try {
                            this.f98254l.j().a(this.f98251i.getPackageName());
                            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                            this.f98248f = p.a(jSONObject2, Constants.KEY_DEVICE_TOKEN, null);
                            if (jSONObject2 != null && (jSONArray = jSONObject2.getJSONArray(Constants.KEY_PACKAGE_NAMES)) != null) {
                                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                    String string = jSONArray.getString(i11);
                                    if (UtilityImpl.a(this.f98251i, string)) {
                                        this.f98254l.j().a(message.f98214m);
                                    } else {
                                        ALog.d(this.f98255m, "unbind app", "pkg", string);
                                        com.taobao.accs.net.a aVar = this.f98254l;
                                        aVar.b(Message.buildUnbindApp(aVar.b((String) null), string), true);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            ALog.i(this.f98255m, "no token/invalid app", th2);
                        }
                    } else if (iIntValue == 2) {
                        this.f98254l.j().b(message.f98214m);
                    } else if (iIntValue == 3) {
                        this.f98254l.j().a(message.f98214m, message.userinfo);
                    } else if (iIntValue == 4) {
                        this.f98254l.j().e(message.f98214m);
                    } else if (iIntValue == 100 && (this.f98254l instanceof com.taobao.accs.net.k) && "4|sal|accs-iot".equals(message.f98210i)) {
                        ((com.taobao.accs.net.k) this.f98254l).a(jSONObject);
                    }
                } else if (message.command.intValue() == 3 && i10 == 300) {
                    this.f98254l.j().b(message.f98214m);
                }
            } catch (Throwable th3) {
                th = th3;
                ALog.e(this.f98255m, "handleControlMessage", th, new Object[0]);
                com.taobao.accs.utl.k.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "handleControlMessage", "", this.f98244b + th.toString());
            }
        } catch (Throwable th4) {
            th = th4;
        }
        a(message, i10, null, bArr, null);
        a(new TrafficsMonitor.a(message.serviceId, GlobalAppRuntimeInfo.isAppBackground(), str, bArr2.length));
    }

    private void a(String str, String str2) {
        com.taobao.accs.ut.a.e eVar = new com.taobao.accs.ut.a.e();
        eVar.f98426a = UtilityImpl.j(this.f98251i);
        eVar.f98428c = str;
        eVar.f98429d = "" + System.currentTimeMillis();
        eVar.f98431f = "";
        eVar.f98430e = str2;
        eVar.f98427b = "";
        eVar.a();
    }

    private void a(Map<Integer, String> map, Intent intent) {
        if (map == null || intent == null) {
            return;
        }
        intent.putExtra(TaoBaseService.ExtraInfo.EXT_HEADER, (HashMap) map);
    }

    private byte[] a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = gZIPInputStream.read(bArr);
                if (i10 <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
                try {
                    gZIPInputStream.close();
                    byteArrayOutputStream.close();
                } catch (Exception unused) {
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            ALog.e(this.f98255m, "uncompress data error " + e10.toString(), new Object[0]);
            com.taobao.accs.utl.k.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", this.f98244b + " uncompress data error " + e10.toString());
            return null;
        } finally {
            gZIPInputStream.close();
            byteArrayOutputStream.close();
        }
    }

    private byte[] a(String str, Map<Integer, String> map, byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    int i10 = Integer.parseInt(map.get(17));
                    int i11 = Integer.parseInt(map.get(16));
                    if (i11 <= 1) {
                        throw new RuntimeException("burstNums <= 1");
                    }
                    if (i10 < 0 || i10 >= i11) {
                        throw new RuntimeException(String.format("burstNums:%s burstIndex:%s", Integer.valueOf(i11), Integer.valueOf(i10)));
                    }
                    String str2 = map.get(18);
                    long j10 = 0;
                    try {
                        String str3 = map.get(15);
                        if (!TextUtils.isEmpty(str3)) {
                            j10 = Long.parseLong(str3);
                        }
                    } catch (Throwable th2) {
                        ALog.w(this.f98255m, "putBurstMessage", th2, new Object[0]);
                    }
                    a aVar = this.f98257o.get(str);
                    if (aVar == null) {
                        if (ALog.isPrintLog(ALog.Level.I)) {
                            ALog.i(this.f98255m, "putBurstMessage", Constants.KEY_DATA_ID, str, "burstLength", Integer.valueOf(i11));
                        }
                        aVar = new a(str, i11, str2);
                        aVar.a(j10);
                        this.f98257o.put(str, aVar);
                    }
                    return aVar.a(i10, i11, bArr);
                }
            } catch (Throwable th3) {
                ALog.w(this.f98255m, "putBurstMessage", th3, new Object[0]);
                return null;
            }
        }
        throw new RuntimeException("burstLength == 0");
    }

    private void b(Message message, int i10) {
        if (message == null) {
            return;
        }
        String strJ = UtilityImpl.j(this.f98251i);
        String str = System.currentTimeMillis() + "";
        boolean z10 = i10 == 200;
        int iIntValue = message.command.intValue();
        if (iIntValue == 1) {
            com.taobao.accs.ut.a.a aVar = new com.taobao.accs.ut.a.a();
            aVar.f98391a = strJ;
            aVar.f98392b = str;
            aVar.f98393c = z10;
            aVar.a(i10);
            aVar.a();
            return;
        }
        if (iIntValue != 3) {
            return;
        }
        com.taobao.accs.ut.a.b bVar = new com.taobao.accs.ut.a.b();
        bVar.f98397a = strJ;
        bVar.f98398b = str;
        bVar.f98399c = z10;
        bVar.f98401e = message.userinfo;
        bVar.a(i10);
        bVar.a();
    }

    private boolean b(int i10) {
        return i10 == -1 || i10 == -9 || i10 == -10 || i10 == -11;
    }

    private Intent c(Message message) {
        Intent intent = new Intent(Constants.ACTION_RECEIVE);
        intent.setPackage(message.f98214m);
        intent.putExtra("command", message.command);
        intent.putExtra(Constants.KEY_SERVICE_ID, message.serviceId);
        intent.putExtra(Constants.KEY_USER_ID, message.userinfo);
        Integer num = message.command;
        if (num != null && num.intValue() == 100) {
            intent.putExtra(Constants.KEY_DATA_ID, message.cunstomDataId);
        }
        NetPerformanceMonitor netPerformanceMonitor = message.G;
        if (netPerformanceMonitor != null) {
            intent.putExtra(Constants.KEY_MONIROT, netPerformanceMonitor);
        }
        return intent;
    }

    private boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f98256n.containsKey(str);
    }

    private void d(String str) {
        if (TextUtils.isEmpty(str) || this.f98256n.containsKey(str)) {
            return;
        }
        this.f98256n.put(str, str);
        j();
    }

    private void i() {
        try {
            File file = new File(this.f98251i.getDir("accs", 0), "message" + this.f98254l.i());
            if (!file.exists()) {
                ALog.d(this.f98255m, "message file not exist", new Object[0]);
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return;
                }
                this.f98256n.put(line, line);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void j() {
        try {
            FileWriter fileWriter = new FileWriter(new File(this.f98251i.getDir("accs", 0), "message" + this.f98254l.i()));
            fileWriter.write("");
            Iterator<String> it = this.f98256n.keySet().iterator();
            while (it.hasNext()) {
                fileWriter.append((CharSequence) it.next()).append((CharSequence) "\r\n");
            }
            fileWriter.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public Message a(String str) {
        return this.f98249g.get(new Message.Id(0, str));
    }

    public void a() {
        ALog.d(this.f98255m, "onSendPing", new Object[0]);
        synchronized (d.class) {
            this.f98250h = true;
        }
    }

    public void a(int i10) {
        this.f98250h = false;
        Message.Id[] idArr = (Message.Id[]) this.f98249g.keySet().toArray(new Message.Id[0]);
        if (idArr.length > 0) {
            ALog.d(this.f98255m, "onNetworkFail", new Object[0]);
            for (Message.Id id2 : idArr) {
                Message messageRemove = this.f98249g.remove(id2);
                if (messageRemove != null) {
                    a(messageRemove, i10);
                }
            }
        }
    }

    public void a(Message message) {
        String str;
        Message message2 = this.f98253k;
        if (message2 != null && (str = message.cunstomDataId) != null && message.serviceId != null && message2.cunstomDataId.equals(str) && this.f98253k.serviceId.equals(message.serviceId)) {
            UTMini.getInstance().commitEvent(66001, "SEND_REPEAT", message.serviceId, message.cunstomDataId, Long.valueOf(Thread.currentThread().getId()));
        }
        if (message.getType() == -1 || message.getType() == 2 || message.isAck) {
            return;
        }
        this.f98249g.put(message.getMsgId(), message);
    }

    public void a(Message message, int i10) {
        a(message, i10, null, null, null);
    }

    public void a(Message message, int i10, Message.ReqType reqType, byte[] bArr, Map<Integer, String> map) {
        if (message.command == null || message.getType() < 0 || message.getType() == 2) {
            ALog.d(this.f98255m, "onError, skip ping/ack", new Object[0]);
            return;
        }
        String str = message.cunstomDataId;
        if (str != null) {
            this.f98243a.remove(str);
        }
        Message.ReqType reqType2 = null;
        if (this.f98247e.checkAntiBrush(message.host, map)) {
            i10 = ErrorCode.SERVIER_ANTI_BRUSH;
            reqType = null;
            bArr = null;
            map = null;
        }
        int iA = this.f98246d.a(map, message.serviceId);
        if (iA != 0) {
            if (iA == 2) {
                i10 = ErrorCode.SERVIER_HIGH_LIMIT;
            } else {
                i10 = iA == 3 ? ErrorCode.SERVIER_HIGH_LIMIT_BRUSH : ErrorCode.SERVIER_LOW_LIMIT;
            }
            bArr = null;
            map = null;
        } else {
            reqType2 = reqType;
        }
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d(this.f98255m, "onResult", "command", message.command, "erorcode", Integer.valueOf(i10));
        }
        if (message.command.intValue() == 102) {
            return;
        }
        if (message.isCancel) {
            ALog.e(this.f98255m, "onResult message is cancel", "command", message.command);
            a(message, i10, true);
        } else if (!b(i10) || message.command.intValue() == 100 || message.retryTimes > Message.CONTROL_MAX_RETRY_TIMES) {
            a(message, i10, false);
            Intent intentC = c(message);
            intentC.putExtra(Constants.KEY_ERROR_CODE, i10);
            Message.ReqType reqTypeValueOf = Message.ReqType.valueOf((message.f98207f >> 13) & 3);
            if (reqType2 == Message.ReqType.RES || reqTypeValueOf == Message.ReqType.REQ) {
                intentC.putExtra(Constants.KEY_SEND_TYPE, Constants.SEND_TYPE_RES);
            }
            if (i10 == 200) {
                intentC.putExtra("data", bArr);
            }
            intentC.putExtra("appKey", this.f98254l.f98298b);
            intentC.putExtra(Constants.KEY_CONFIG_TAG, this.f98254l.f98309m);
            a(map, intentC);
            g.a().b(this.f98251i, intentC);
            if (!TextUtils.isEmpty(message.serviceId)) {
                UTMini.getInstance().commitEvent(66001, "MsgToBuss0", "commandId=" + message.command, "serviceId=" + message.serviceId + " errorCode=" + i10 + " dataId=" + message.dataId, 221);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("1commandId=");
                sb2.append(message.command);
                sb2.append("serviceId=");
                sb2.append(message.serviceId);
                com.taobao.accs.utl.k.a("accs", BaseMonitor.COUNT_POINT_TO_BUSS, sb2.toString(), 0.0d);
            }
        } else {
            message.startSendTime = System.currentTimeMillis();
            int i11 = message.retryTimes + 1;
            message.retryTimes = i11;
            ALog.d(this.f98255m, "onResult", "retryTimes", Integer.valueOf(i11));
            this.f98254l.b(message, true);
            a(message, i10, true);
        }
        b(message, i10);
    }

    public void a(Message message, int i10, Map<Integer, String> map) {
        a(message, i10, null, null, map);
    }

    public void a(TrafficsMonitor.a aVar) {
        try {
            ThreadPoolExecutorFactory.getScheduledExecutor().execute(new e(this, aVar));
        } catch (Throwable th2) {
            ALog.e(this.f98255m, "addTrafficsInfo", th2, new Object[0]);
        }
    }

    public void a(byte[] bArr) throws IOException {
        a(bArr, (String) null);
    }

    public void a(byte[] bArr, String str) throws IOException {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i(this.f98255m, "onMessage", "host", str);
        }
        s sVar = new s(bArr);
        try {
            int iA = sVar.a();
            int i10 = (iA & 240) >> 4;
            ALog.Level level = ALog.Level.D;
            if (ALog.isPrintLog(level)) {
                ALog.d(this.f98255m, "version:" + i10, new Object[0]);
            }
            int i11 = iA & 15;
            if (ALog.isPrintLog(level)) {
                ALog.d(this.f98255m, "compress:" + i11, new Object[0]);
            }
            sVar.a();
            int iB = sVar.b();
            if (ALog.isPrintLog(level)) {
                ALog.d(this.f98255m, "totalLen:" + iB, new Object[0]);
            }
            int i12 = 0;
            while (i12 < iB) {
                int iB2 = sVar.b();
                int i13 = i12 + 2;
                if (iB2 <= 0) {
                    throw new IOException("data format error");
                }
                byte[] bArr2 = new byte[iB2];
                sVar.read(bArr2);
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.d(this.f98255m, "buf len:" + iB2, new Object[0]);
                }
                i12 = i13 + iB2;
                a(i11, bArr2, str, i10);
            }
        } catch (Throwable th2) {
            try {
                com.taobao.accs.utl.k.a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", this.f98244b + th2.toString());
                ALog.e(this.f98255m, "", th2, new Object[0]);
            } finally {
                sVar.close();
            }
        }
    }

    public Message b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f98249g.remove(new Message.Id(0, str));
    }

    public void b() {
        ALog.d(this.f98255m, "onRcvPing", new Object[0]);
        synchronized (d.class) {
            this.f98250h = false;
        }
    }

    public void b(Message message) {
        if (this.f98249g.keySet().size() > 0) {
            Iterator<Message.Id> it = this.f98249g.keySet().iterator();
            while (it.hasNext()) {
                Message message2 = this.f98249g.get(it.next());
                if (message2 != null && message2.command != null && message2.getPackageName().equals(message.getPackageName())) {
                    switch (message.command.intValue()) {
                        case 1:
                        case 2:
                            if (message2.command.intValue() == 1 || message2.command.intValue() == 2) {
                                message2.isCancel = true;
                            }
                            break;
                        case 3:
                        case 4:
                            if (message2.command.intValue() == 3 || message2.command.intValue() == 4) {
                                message2.isCancel = true;
                            }
                            break;
                        case 5:
                        case 6:
                            if (message2.command.intValue() == 5 || message2.command.intValue() == 6) {
                                message2.isCancel = true;
                            }
                            break;
                    }
                }
                if (message2 != null && message2.isCancel) {
                    ALog.e(this.f98255m, "cancelControlMessage", "command", message2.command);
                }
            }
        }
    }

    public boolean c() {
        return this.f98250h;
    }

    public int d() {
        return this.f98249g.size();
    }

    public Collection<Message> e() {
        return this.f98249g.values();
    }

    public Set<Message.Id> f() {
        return this.f98249g.keySet();
    }

    public com.taobao.accs.ut.a.d g() {
        return this.f98252j;
    }

    public void h() {
        try {
            ThreadPoolExecutorFactory.getScheduledExecutor().execute(this.f98258p);
        } catch (Throwable th2) {
            ALog.e(this.f98255m, "restoreTraffics", th2, new Object[0]);
        }
    }
}
