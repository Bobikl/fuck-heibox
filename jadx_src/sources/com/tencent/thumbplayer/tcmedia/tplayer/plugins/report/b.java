package com.tencent.thumbplayer.tcmedia.tplayer.plugins.report;

import android.app.UiModeManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.max.hbutils.utils.w;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr;
import com.tencent.thumbplayer.tcmedia.api.report.ITPBusinessReportManager;
import com.tencent.thumbplayer.tcmedia.api.report.TPDefaultReportInfo;
import com.tencent.thumbplayer.tcmedia.api.report.TPLiveReportInfo;
import com.tencent.thumbplayer.tcmedia.api.report.TPVodReportInfo;
import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyHelper;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import com.tencent.thumbplayer.tcmedia.utils.l;
import com.tencent.thumbplayer.tcmedia.utils.o;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b implements ITPBusinessReportManager, com.tencent.thumbplayer.tcmedia.tplayer.plugins.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f103070a = String.format("Android %s", TPSystemInfo.getOsVersion());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f103071b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f103072c = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static com.tencent.thumbplayer.tcmedia.utils.c f103073h = null;
    private Context I;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HandlerThread f103074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HandlerC1027b f103075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f103076f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f103077g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TPDefaultReportInfo f103078i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TPReportParams f103079j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f103080k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f103081l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f103082m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f103083n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f103084o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f103085p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f103086q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f103087r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f103088s = 81;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f103089t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f103090u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f103091v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f103092w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f103093x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f103094y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f103095z = "0";
    private String A = "";
    private String B = "";
    private String C = "";
    private int D = 0;
    private int E = 0;
    private String F = "";
    private int G = 0;
    private long H = 0;
    private int J = -1;
    private c K = new a();
    private double L = 1.0d;
    private boolean M = true;
    private TPReportParams.BufferingOnceParams N = null;
    private TPReportParams.UserSeekOnceParams O = null;
    private final e P = new e();
    private com.tencent.thumbplayer.tcmedia.utils.f.a Q = new com.tencent.thumbplayer.tcmedia.utils.f.a() { // from class: com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.b.1
        @Override // com.tencent.thumbplayer.tcmedia.utils.f.a
        public void a(int i10, int i11, int i12, Object obj) {
            int i13;
            TPLogUtil.i("TPReportManager", "OnGlobalEventChangeListener eventId: ".concat(String.valueOf(i10)));
            switch (i10) {
                case TPPlayerMgr.EVENT_ID_APP_ENTER_BACKGROUND /* 100001 */:
                    i13 = bb.c.d.f31539t0;
                    break;
                case TPPlayerMgr.EVENT_ID_APP_ENTER_FOREGROUND /* 100002 */:
                    i13 = 2101;
                    break;
                default:
                    return;
            }
            b.this.f103075e.obtainMessage(i13, null).sendToTarget();
        }
    };

    public class a implements c {
        a() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.b.c
        public void a(int i10, com.tencent.thumbplayer.tcmedia.common.a.a aVar) {
            b.this.a(aVar, i10, i10 <= 30);
            b.this.a(aVar);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.b$b, reason: collision with other inner class name */
    public class HandlerC1027b extends Handler {
        HandlerC1027b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj = message.obj;
            Map map = obj instanceof Map ? (Map) obj : null;
            int i10 = message.what;
            if (i10 == 100) {
                b.this.l();
                return;
            }
            if (i10 == 3000) {
                b.this.f();
                return;
            }
            if (i10 == 4000) {
                b.this.j();
                return;
            }
            if (i10 == 2100) {
                b.this.i();
                return;
            }
            if (i10 == 2101) {
                b.this.g();
                return;
            }
            switch (i10) {
                case 999:
                    b.this.a((Map<String, Object>) map);
                    break;
                case 1000:
                    b.this.b((Map<String, Object>) map);
                    break;
                case 1001:
                    b.this.c((Map<String, Object>) map);
                    break;
                case 1002:
                    b.this.d((Map<String, Object>) map);
                    break;
                case 1003:
                    b.this.e((Map<String, Object>) map);
                    break;
                case 1004:
                    b.this.g((Map<String, Object>) map);
                    break;
                case 1005:
                    b.this.h(map);
                    break;
                case 1006:
                    b.this.i(map);
                    break;
                case 1007:
                    b.this.j(map);
                    break;
                case 1008:
                    b.this.k(map);
                    break;
                case 1009:
                    b.this.n(map);
                    break;
                case 1010:
                    b.this.p(map);
                    break;
                case 1011:
                    b.this.o(map);
                    break;
                case 1012:
                    b.this.f((Map<String, Object>) map);
                    break;
                case 1013:
                    b.this.l(map);
                    break;
                case 1014:
                    b.this.m(map);
                    break;
                case 1015:
                    b.this.r(map);
                    break;
                case 1016:
                    if (obj instanceof String) {
                        b.this.a((String) obj);
                    }
                    break;
                case 1017:
                    b.this.C(map);
                    break;
                case 1018:
                    b.this.D(map);
                    break;
                case 1019:
                    b.this.A(map);
                    break;
                case 1020:
                    b.this.y(map);
                    break;
                case 1021:
                    b.this.z(map);
                    break;
                case 1022:
                    b.this.B(map);
                    break;
                case 1023:
                    b.this.E(map);
                    break;
                default:
                    switch (i10) {
                        case 2000:
                            b.this.s(map);
                            break;
                        case 2001:
                            b.this.t(map);
                            break;
                        case 2002:
                            b.this.v(map);
                            break;
                        case 2003:
                            b.this.u(map);
                            break;
                        case 2004:
                            b.this.w(map);
                            break;
                        case 2005:
                            b.this.x(map);
                            break;
                    }
                    break;
            }
        }
    }

    public interface c {
        void a(int i10, com.tencent.thumbplayer.tcmedia.common.a.a aVar);
    }

    public class d implements c {
        d() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.b.c
        public void a(int i10, com.tencent.thumbplayer.tcmedia.common.a.a aVar) {
            l lVar = new l();
            boolean z10 = i10 <= 30 || i10 == 263;
            if (i10 == 30) {
                i10 = 205;
            } else if (i10 == 50) {
                b.this.f103075e.removeMessages(3000);
                i10 = 263;
            } else if (i10 == 150) {
                b.this.f103075e.removeMessages(3000);
            } else {
                if (i10 != 263) {
                    return;
                }
                b.this.f103075e.removeMessages(3000);
                b.this.f103075e.sendEmptyMessageDelayed(3000, 60000L);
            }
            b.this.a(lVar, i10, z10);
            b.this.b(lVar, z10);
            if (i10 != 205) {
                lVar.a("loadingtime", 0);
            }
            TPLogUtil.i("TPReportManager", "liveExParam.prePlayLengthInt: " + b.this.f103079j.getLiveExParam().prePlayLengthInt);
            b.this.a(lVar);
        }
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f103100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f103101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f103102c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f103103d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f103104e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f103105f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f103106g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f103107h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f103108i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f103109j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f103110k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f103111l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f103112m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f103113n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f103114o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f103115p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        String f103116q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        String f103117r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        String f103118s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        String f103119t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        String f103120u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        String f103121v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        ArrayList<f> f103122w;

        private e() {
            this.f103100a = 0L;
            this.f103101b = 0;
            this.f103102c = 0L;
            this.f103103d = 0L;
            this.f103104e = 0;
            this.f103105f = 0;
            this.f103106g = 0L;
            this.f103107h = 0L;
            this.f103108i = 0;
            this.f103109j = 0;
            this.f103110k = 0;
            this.f103111l = 0;
            this.f103112m = false;
            this.f103113n = false;
            this.f103114o = false;
            this.f103115p = -1;
            this.f103116q = "";
            this.f103117r = "";
            this.f103118s = "";
            this.f103119t = "";
            this.f103120u = "";
            this.f103121v = "";
            this.f103122w = new ArrayList<>();
        }

        void a() {
            this.f103100a = 0L;
            this.f103101b = 0;
            this.f103102c = 0L;
            this.f103103d = 0L;
            this.f103104e = 0;
            this.f103105f = 0;
            this.f103106g = 0L;
            this.f103107h = 0L;
            this.f103108i = 0;
            this.f103109j = 0;
            this.f103110k = 0;
            this.f103111l = 0;
            this.f103112m = false;
            this.f103113n = false;
            this.f103114o = false;
            this.f103115p = -1;
            this.f103116q = "";
            this.f103117r = "";
            this.f103118s = "";
            this.f103119t = "";
            this.f103120u = "";
            this.f103121v = "";
            this.f103122w.clear();
        }
    }

    public class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f103124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f103125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f103126c = -1;

        f(String str, String str2) {
            this.f103124a = str;
            this.f103125b = str2;
        }
    }

    public class g implements c {
        g() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.b.c
        public void a(int i10, com.tencent.thumbplayer.tcmedia.common.a.a aVar) {
            boolean z10 = i10 <= 30;
            b.this.a(aVar, i10, z10);
            b.this.a(aVar, z10);
            b.this.a(aVar);
        }
    }

    public b(Context context) {
        this.I = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        TPReportParams.LiveExParam liveExParam = this.f103079j.getLiveExParam();
        long jA = a(map, "stime", System.currentTimeMillis());
        liveExParam.getSyncFrameDurationInt = (int) (jA - this.P.f103102c);
        this.f103079j.getFirstLoadParams().firstPacketReadTimeUnix = jA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f103079j.getFirstLoadParams().firstOpenTimeUnix = a(map, "stime", System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        int iA = a(map, "speed", 0);
        this.f103089t = iA;
        e eVar = this.P;
        eVar.f103110k += iA;
        eVar.f103111l++;
        if (iA > eVar.f103109j) {
            eVar.f103109j = iA;
        }
        String strA = a(map, "spanId", "");
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strA);
            if (jSONObject.has("spanId")) {
                this.P.f103120u = jSONObject.getString("spanId");
            }
        } catch (Exception e10) {
            TPLogUtil.e("TPReportManager", e10);
        }
        b(strA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.P.f103117r = a(map, "url", "");
        this.P.f103118s = a(map, "cdnip", "");
        this.P.f103119t = a(map, "cdnuip", "");
        if (TextUtils.isEmpty(this.P.f103117r) || !this.P.f103117r.contains("sid=")) {
            return;
        }
        int iIndexOf = this.P.f103117r.indexOf("sid=");
        int iIndexOf2 = this.P.f103117r.indexOf("&", iIndexOf);
        e eVar = this.P;
        eVar.f103121v = iIndexOf2 >= 0 ? eVar.f103117r.substring(iIndexOf + 4, iIndexOf2) : eVar.f103117r.substring(iIndexOf + 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(Map<String, Object> map) {
        this.A = a(map, "proto", "");
        this.B = a(map, "protover", "");
    }

    private float a(Map<String, Object> map, String str, float f10) {
        Object obj;
        return (map == null || (obj = map.get(str)) == null) ? f10 : ((Float) obj).floatValue();
    }

    private int a(Map<String, Object> map, String str, int i10) {
        Object obj;
        return (map == null || (obj = map.get(str)) == null) ? i10 : ((Integer) obj).intValue();
    }

    private long a(Map<String, Object> map, String str, long j10) {
        Object obj;
        return (map == null || (obj = map.get(str)) == null) ? j10 : ((Long) obj).longValue();
    }

    private static String a(int i10) {
        if (i10 == 5) {
            return "init_player";
        }
        if (i10 == 15) {
            return "get_cdn_url";
        }
        if (i10 == 30) {
            return "first_load";
        }
        if (i10 == 40) {
            return "user_seek";
        }
        if (i10 == 50) {
            return "play_done";
        }
        if (i10 == 150) {
            return "live_error";
        }
        if (i10 == 205) {
            return "live_loading";
        }
        if (i10 == 263) {
            return "live_period";
        }
        switch (i10) {
            case 32:
                return "first_rendering";
            case 33:
                return "load_subtitle";
            case 34:
                return "302_redirect";
            case 35:
                return "second_buffering";
            default:
                return "";
        }
    }

    private String a(Map<String, Object> map, String str, String str2) {
        Object obj;
        return (map == null || (obj = map.get(str)) == null) ? str2 : (String) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tencent.thumbplayer.tcmedia.common.a.a aVar) {
        String str;
        if (this.M) {
            HashMap map = new HashMap();
            aVar.a(map);
            if (!map.containsKey("step") || (str = map.get("step")) == null) {
                return;
            }
            String strA = a(Integer.parseInt(str));
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            com.tencent.thumbplayer.tcmedia.common.a.b.a(strA, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tencent.thumbplayer.tcmedia.common.a.a aVar, int i10, boolean z10) {
        TPReportParams.CommonParams commonParams = this.f103079j.getCommonParams();
        commonParams.stepInt = i10;
        commonParams.seqInt++;
        String str = this.C;
        commonParams.flowIdString = str;
        commonParams.playNoString = str;
        commonParams.signalStrengthInt = this.f103088s;
        commonParams.networkSpeedInt = this.f103089t;
        commonParams.networkTypeInt = n();
        commonParams.deviceNameString = TPSystemInfo.getDeviceName();
        commonParams.deviceResolutionString = m();
        commonParams.osVersionString = f103070a;
        commonParams.p2pVersionString = TPDownloadProxyHelper.getNativeLibVersion();
        commonParams.playerVersionString = TPPlayerConfig.VERSION;
        commonParams.playerTypeInt = this.D;
        commonParams.p2pInt = this.f103094y ? 1 : 0;
        commonParams.proto = this.A;
        commonParams.protover = this.B;
        commonParams.playTypeInt = this.J;
        TPDefaultReportInfo tPDefaultReportInfo = this.f103078i;
        if (tPDefaultReportInfo != null && z10) {
            commonParams.testIdInt = tPDefaultReportInfo.testId;
            commonParams.cdnIdInt = tPDefaultReportInfo.cdnId;
            commonParams.downloadTypeInt = tPDefaultReportInfo.dlType;
            commonParams.loginTypeInt = tPDefaultReportInfo.loginType;
            commonParams.mediaFormatInt = tPDefaultReportInfo.mediaFormat;
            commonParams.mediaRateInt = tPDefaultReportInfo.mediaRate;
            commonParams.platformLong = tPDefaultReportInfo.platform;
            commonParams.onlineInt = tPDefaultReportInfo.isOnline ? 1 : 0;
            commonParams.mediaDurationFloat = tPDefaultReportInfo.mediaDuration;
            commonParams.uinString = tPDefaultReportInfo.uin;
            commonParams.qqOpenIdString = tPDefaultReportInfo.qqOpenId;
            commonParams.wxOpenIdString = tPDefaultReportInfo.wxOpenId;
            commonParams.guidString = tPDefaultReportInfo.guid;
            commonParams.uipString = tPDefaultReportInfo.uip;
            commonParams.cdnUipString = tPDefaultReportInfo.cdnUip;
            commonParams.cdnIpString = tPDefaultReportInfo.cdnIp;
            commonParams.appVersionString = tPDefaultReportInfo.appVersion;
            commonParams.vidString = tPDefaultReportInfo.vid;
            commonParams.mediaResolutionString = tPDefaultReportInfo.mediaResolution;
            commonParams.scenesId = tPDefaultReportInfo.scenesId;
            Properties properties = tPDefaultReportInfo.reportInfoProperties;
            if (properties != null) {
                for (Map.Entry entry : properties.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        aVar.a(key.toString(), "");
                    } else {
                        aVar.a(key.toString(), value.toString());
                    }
                }
            }
            this.J = this.f103078i.getPlayType();
        }
        if (commonParams.platformLong <= 0) {
            commonParams.platformLong = TPPlayerConfig.getPlatform();
        }
        if (TextUtils.isEmpty(commonParams.uinString)) {
            commonParams.uinString = TPPlayerConfig.getUserUin();
        }
        if (TextUtils.isEmpty(commonParams.guidString)) {
            commonParams.guidString = TPPlayerConfig.getGuid();
        }
        if (TextUtils.isEmpty(commonParams.appVersionString)) {
            commonParams.appVersionString = TPPlayerConfig.getAppVersionName(this.I);
        }
        if (TextUtils.isEmpty(commonParams.uipString)) {
            commonParams.uipString = this.P.f103119t;
        }
        if (TextUtils.isEmpty(commonParams.cdnUipString)) {
            commonParams.cdnUipString = this.P.f103119t;
        }
        if (TextUtils.isEmpty(commonParams.cdnIpString)) {
            commonParams.cdnIpString = this.P.f103118s;
        }
        if (commonParams.downloadTypeInt <= 0) {
            commonParams.downloadTypeInt = this.E;
        }
        if (TextUtils.isEmpty(commonParams.mediaResolutionString)) {
            commonParams.mediaResolutionString = this.F;
        }
        if (commonParams.mediaDurationFloat <= 0.0f) {
            commonParams.mediaDurationFloat = this.H / 1000.0f;
        }
        if (commonParams.mediaRateInt <= 0) {
            commonParams.mediaRateInt = this.G;
        }
        commonParams.paramsToProperties(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tencent.thumbplayer.tcmedia.common.a.a aVar, boolean z10) {
        TPReportParams.VodExParam vodExParam = this.f103079j.getVodExParam();
        if (vodExParam == null) {
            return;
        }
        TPDefaultReportInfo tPDefaultReportInfo = this.f103078i;
        if (tPDefaultReportInfo != null && (tPDefaultReportInfo instanceof TPVodReportInfo) && z10) {
            vodExParam.currentPlayInt = ((TPVodReportInfo) tPDefaultReportInfo).currentPlayState;
            vodExParam.optimizedPlayInt = ((TPVodReportInfo) tPDefaultReportInfo).optimizedPlay;
            vodExParam.hasSubtitleInt = ((TPVodReportInfo) tPDefaultReportInfo).hasSubtitles ? 1 : 0;
            vodExParam.bizIdInt = ((TPVodReportInfo) tPDefaultReportInfo).bizId;
            vodExParam.clipInt = ((TPVodReportInfo) tPDefaultReportInfo).clipCount;
            vodExParam.statusInt = ((TPVodReportInfo) tPDefaultReportInfo).videoStatus;
            vodExParam.freeTypeInt = tPDefaultReportInfo.freeType;
        }
        e eVar = this.P;
        vodExParam.multiTrackInt = eVar.f103113n ? 1 : 0;
        vodExParam.isSelectedSubtitleInt = eVar.f103112m ? 1 : 0;
        vodExParam.hevcLcInt = 0;
        vodExParam.hitDownloaded = eVar.f103115p;
        vodExParam.paramsToProperties(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        String strReplace;
        if (TextUtils.isEmpty(str)) {
            TPLogUtil.i("TPReportManager", "onHandleHlsTag, tag is null");
            return;
        }
        if (!str.startsWith("#EXT-X-PROGRAM-DATE-TIME:")) {
            TPLogUtil.i("TPReportManager", "onHandleHlsTag, tag is not start with #EXT-X-PROGRAM-DATE-TIME:");
            return;
        }
        try {
            String strSubstring = str.substring(25);
            int iIndexOf = strSubstring.indexOf(43);
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            } else {
                TPLogUtil.i("TPReportManager", "handleOnPlayerPrivaterHlsM3u8Tag , player_m3u8_tag , tag do not contains time zone");
            }
            strReplace = strSubstring.replace('T', ' ');
        } catch (Exception e10) {
            TPLogUtil.e("TPReportManager", e10);
            strReplace = "";
        }
        if (TextUtils.isEmpty(strReplace)) {
            TPLogUtil.i("TPReportManager", "onHandleHlsTag , player_m3u8_tag , dataTime is null ");
            return;
        }
        long time = 0;
        try {
            Date date = new SimpleDateFormat(w.f73604k).parse(strReplace);
            if (date != null) {
                time = date.getTime();
            }
        } catch (Exception e11) {
            TPLogUtil.e("TPReportManager", e11);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("onHandleHlsTag , player_m3u8_tag , sysCurTime: ");
        sb2.append(jCurrentTimeMillis);
        sb2.append(", time:");
        sb2.append(time);
        sb2.append(", delay:");
        long j10 = jCurrentTimeMillis - time;
        sb2.append(j10);
        TPLogUtil.i("TPReportManager", sb2.toString());
        this.P.f103108i = (int) j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map) {
        TPLogUtil.i("TPReportManager", "onPlayerCreateStart");
        if (map == null) {
            return;
        }
        this.f103079j.getInitParams().playStarTimeUnix = a(map, "stime", System.currentTimeMillis());
    }

    private boolean a(Map<String, Object> map, String str, boolean z10) {
        Object obj;
        return (map == null || (obj = map.get(str)) == null) ? z10 : ((Boolean) obj).booleanValue();
    }

    private int b(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 3;
            case 13:
                return 4;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.tencent.thumbplayer.tcmedia.common.a.a aVar, boolean z10) {
        TPReportParams.LiveExParam liveExParam = this.f103079j.getLiveExParam();
        if (liveExParam == null) {
            return;
        }
        TPDefaultReportInfo tPDefaultReportInfo = this.f103078i;
        if (tPDefaultReportInfo != null && (tPDefaultReportInfo instanceof TPLiveReportInfo) && z10) {
            liveExParam.adPlayLengthInt = ((TPLiveReportInfo) tPDefaultReportInfo).adPlayLength;
            liveExParam.liveProgramIdInt = ((TPLiveReportInfo) tPDefaultReportInfo).programId;
            liveExParam.streamIdInt = ((TPLiveReportInfo) tPDefaultReportInfo).streamId;
            liveExParam.contentIdInt = ((TPLiveReportInfo) tPDefaultReportInfo).contentId;
            liveExParam.playTimeInt = ((TPLiveReportInfo) tPDefaultReportInfo).playTime;
            liveExParam.liveTypeInt = ((TPLiveReportInfo) tPDefaultReportInfo).liveType;
            liveExParam.isUserPayInt = ((TPLiveReportInfo) tPDefaultReportInfo).isUserPay ? 1 : 0;
            liveExParam.isLookBackInt = ((TPLiveReportInfo) tPDefaultReportInfo).isLookBack ? 1 : 0;
            liveExParam.cdnServerString = ((TPLiveReportInfo) tPDefaultReportInfo).cdnServer;
            liveExParam.freeTypeInt = tPDefaultReportInfo.freeType;
            liveExParam.userQQString = tPDefaultReportInfo.uin;
            liveExParam.userIpString = tPDefaultReportInfo.uip;
            liveExParam.isStreamP2PInt = tPDefaultReportInfo.enableP2p ? 1 : 0;
        }
        if (tPDefaultReportInfo != null && (tPDefaultReportInfo instanceof TPLiveReportInfo)) {
            liveExParam.liveDelayInt = ((TPLiveReportInfo) tPDefaultReportInfo).liveDelay;
        }
        liveExParam.isUseP2PInt = this.f103094y ? 1 : 0;
        String str = this.P.f103117r;
        liveExParam.downloadUrl = str;
        if (TextUtils.isEmpty(str)) {
            liveExParam.downloadUrl = this.f103079j.getFirstLoadParams().cdnUrlString;
        }
        liveExParam.downloadServerIpString = this.P.f103118s;
        liveExParam.reportTimeLong = System.currentTimeMillis();
        e eVar = this.P;
        if (eVar.f103100a > 0) {
            long j10 = eVar.f103101b;
            long jCurrentTimeMillis = System.currentTimeMillis();
            e eVar2 = this.P;
            eVar.f103101b = (int) (j10 + (jCurrentTimeMillis - eVar2.f103100a));
            if (this.f103082m || this.f103093x || eVar2.f103114o) {
                eVar2.f103100a = 0L;
            } else {
                eVar2.f103100a = System.currentTimeMillis();
            }
        }
        e eVar3 = this.P;
        liveExParam.prePlayLengthInt = eVar3.f103101b;
        eVar3.f103101b = 0;
        liveExParam.playerVersionString = TPPlayerConfig.VERSION;
        liveExParam.deviceTypeInt = o();
        liveExParam.networkTypeInt = n();
        e eVar4 = this.P;
        liveExParam.maxSpeedInt = eVar4.f103109j;
        eVar4.f103109j = 0;
        liveExParam.testSpeedInt = this.f103089t;
        int i10 = eVar4.f103111l;
        if (i10 > 0) {
            liveExParam.downSpeedInt = eVar4.f103110k / i10;
            eVar4.f103110k = 0;
            eVar4.f103111l = 0;
        }
        liveExParam.liveTagInt = 0;
        liveExParam.extraInfoString = "";
        liveExParam.reconnectCntInt = 0;
        liveExParam.connectTimeInt = 0;
        liveExParam.getUrlTimeInt = 0;
        liveExParam.defSwitchString = eVar4.f103116q;
        liveExParam.loadingTimeLong = eVar4.f103103d - eVar4.f103102c;
        liveExParam.blockTimeInt = eVar4.f103105f;
        liveExParam.blockCountInt = eVar4.f103104e;
        eVar4.f103104e = 0;
        eVar4.f103105f = 0;
        liveExParam.errCodeInt = 0;
        liveExParam.fullErrCodeString = this.f103095z;
        liveExParam.spanId = eVar4.f103120u;
        liveExParam.tuid = eVar4.f103121v;
        liveExParam.paramsToProperties(aVar);
    }

    private void b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("hitDownloaded")) {
                e eVar = this.P;
                if (eVar.f103115p == -1) {
                    eVar.f103115p = jSONObject.getInt("hitDownloaded");
                }
            }
        } catch (Exception e10) {
            TPLogUtil.e("TPReportManager", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map) {
        TPLogUtil.i("TPReportManager", "onPlayerCreateDone");
        if (map == null) {
            return;
        }
        l lVar = new l();
        TPReportParams.PlayerInitParams initParams = this.f103079j.getInitParams();
        initParams.playEndTimeUnix = a(map, "etime", System.currentTimeMillis());
        initParams.errCodeString = this.f103095z;
        initParams.paramsToProperties(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0070  */
    /* JADX WARN: Code duplicated, block: B:19:0x007d  */
    public void c(Map<String, Object> map) {
        c gVar;
        TPReportParams.FirstLoadParams firstLoadParams;
        String str;
        TPDefaultReportInfo tPDefaultReportInfo;
        if (this.f103084o) {
            return;
        }
        TPLogUtil.i("TPReportManager", "onStartPrepare");
        this.f103082m = false;
        this.C = a(map, "flowid", "");
        this.f103094y = a(map, "p2p", false);
        TPDefaultReportInfo tPDefaultReportInfo2 = this.f103078i;
        if (tPDefaultReportInfo2 != null) {
            this.J = tPDefaultReportInfo2.getPlayType();
        }
        int i10 = this.J;
        if (i10 != 1) {
            if (i10 == 0) {
                gVar = new g();
            }
            l lVar = new l();
            this.f103079j.getInitParams().paramsToProperties(lVar);
            this.K.a(5, lVar);
            this.P.f103102c = System.currentTimeMillis();
            firstLoadParams = this.f103079j.getFirstLoadParams();
            str = this.P.f103117r;
            firstLoadParams.cdnUrlString = str;
            if (TextUtils.isEmpty(str)) {
                firstLoadParams.cdnUrlString = a(map, "url", "");
            }
            tPDefaultReportInfo = this.f103078i;
            if (tPDefaultReportInfo != null) {
                firstLoadParams.cgiUrlIndex = tPDefaultReportInfo.cdnUrlIndex;
            }
            firstLoadParams.cgiUrlIndex = a(map, "urlindex", 0);
            firstLoadParams.starTimeUnix = a(map, "stime", 0L);
            this.f103079j.getFirstRenderParams().starTimeUnix = a(map, "stime", 0L);
            this.f103084o = true;
        }
        gVar = new d();
        this.K = gVar;
        l lVar2 = new l();
        this.f103079j.getInitParams().paramsToProperties(lVar2);
        this.K.a(5, lVar2);
        this.P.f103102c = System.currentTimeMillis();
        firstLoadParams = this.f103079j.getFirstLoadParams();
        str = this.P.f103117r;
        firstLoadParams.cdnUrlString = str;
        if (TextUtils.isEmpty(str)) {
            firstLoadParams.cdnUrlString = a(map, "url", "");
        }
        tPDefaultReportInfo = this.f103078i;
        if (tPDefaultReportInfo != null) {
            firstLoadParams.cgiUrlIndex = tPDefaultReportInfo.cdnUrlIndex;
        }
        firstLoadParams.cgiUrlIndex = a(map, "urlindex", 0);
        firstLoadParams.starTimeUnix = a(map, "stime", 0L);
        this.f103079j.getFirstRenderParams().starTimeUnix = a(map, "stime", 0L);
        this.f103084o = true;
    }

    private void d() {
        this.f103074d = o.a().a("TP-ReportThread");
        this.f103075e = new HandlerC1027b(this.f103074d.getLooper());
        this.f103079j = new TPReportParams();
        com.tencent.thumbplayer.tcmedia.utils.f.a(this.Q);
        synchronized (b.class) {
            if (f103073h == null) {
                f103073h = new com.tencent.thumbplayer.tcmedia.utils.c(this.I, "TPReportCache");
            }
            if (!f103072c) {
                this.f103075e.obtainMessage(4000).sendToTarget();
            }
            f103072c = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Map<String, Object> map) {
        if (this.f103084o) {
            this.f103084o = false;
            TPLogUtil.i("TPReportManager", "onPrepareDone");
            if (map == null) {
                return;
            }
            this.P.f103103d = System.currentTimeMillis();
            this.P.f103113n = a(map, "multitrack", false);
            l lVar = new l();
            if (a(map, "playertype", 0) == 1) {
                this.D = 0;
            } else {
                this.D = 1;
            }
            this.F = a(map, "definition", "");
            this.H = a(map, "duration", 0L);
            this.G = (int) a(map, "rate", 0L);
            String strA = a(map, "fmt", "");
            if (strA == null || !strA.contains("hls")) {
                this.E = 1;
            } else {
                this.E = 3;
            }
            TPReportParams.FirstLoadParams firstLoadParams = this.f103079j.getFirstLoadParams();
            firstLoadParams.endTimeUnix = a(map, "etime", 0L);
            firstLoadParams.errCodeString = this.f103095z;
            firstLoadParams.paramsToProperties(lVar);
            this.K.a(30, lVar);
            this.f103079j.getFirstLoadParams().reset();
        }
    }

    private void e() {
        TPLogUtil.i("TPReportManager", "release: ");
        com.tencent.thumbplayer.tcmedia.utils.f.b(this.Q);
        HandlerThread handlerThread = this.f103074d;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f103074d = null;
        }
        TPLogUtil.i("TPReportManager", "release: end!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Map<String, Object> map) {
        TPLogUtil.i("TPReportManager", "onStartPlayer");
        this.f103082m = false;
        if (map == null) {
            return;
        }
        this.P.f103100a = System.currentTimeMillis();
        long jA = a(map, "stime", 0L);
        if (this.f103086q > 0) {
            this.f103087r += System.currentTimeMillis() - jA;
        }
        this.f103086q = jA;
        if (this.J == 1) {
            this.f103075e.removeMessages(3000);
            this.f103075e.sendEmptyMessageDelayed(3000, 60000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        TPLogUtil.i("TPReportManager", "onLivePeriodReport");
        this.K.a(263, new l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Map<String, Object> map) {
        TPLogUtil.i("TPReportManager", "onRenderingStart");
        if (map == null) {
            return;
        }
        l lVar = new l();
        TPReportParams.FirstRenderParams firstRenderParams = this.f103079j.getFirstRenderParams();
        firstRenderParams.endTimeUnix = a(map, "etime", 0L);
        firstRenderParams.errCodeString = this.f103095z;
        firstRenderParams.paramsToProperties(lVar);
        this.K.a(32, lVar);
        this.f103079j.getFirstRenderParams().reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        TPLogUtil.i("TPReportManager", "onAppForeground");
        if (this.f103083n) {
            return;
        }
        this.f103083n = true;
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Map<String, Object> map) {
        TPLogUtil.i("TPReportManager", "onPlayerPause");
        if (map == null) {
            return;
        }
        if (this.f103086q > 0) {
            this.f103087r += a(map, "stime", System.currentTimeMillis()) - this.f103086q;
            this.f103086q = 0L;
        }
        e eVar = this.P;
        if (eVar.f103100a > 0) {
            int i10 = eVar.f103101b;
            long jCurrentTimeMillis = System.currentTimeMillis();
            e eVar2 = this.P;
            eVar.f103101b = i10 + ((int) (jCurrentTimeMillis - eVar2.f103100a));
            eVar2.f103100a = 0L;
        }
    }

    private void h() {
        TPLogUtil.i("TPReportManager", "removeCacheEvent: mFlowId: " + this.C);
        if (f103073h == null || TextUtils.isEmpty(this.C)) {
            return;
        }
        f103073h.a(this.C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(Map<String, Object> map) {
        TPLogUtil.i("TPReportManager", "onPlayerStop");
        if (map == null) {
            return;
        }
        if (this.f103086q > 0) {
            this.f103087r += a(map, "etime", System.currentTimeMillis()) - this.f103086q;
            this.f103086q = 0L;
        }
        e eVar = this.P;
        if (eVar.f103100a > 0) {
            int i10 = eVar.f103101b;
            long jCurrentTimeMillis = System.currentTimeMillis();
            e eVar2 = this.P;
            eVar.f103101b = i10 + ((int) (jCurrentTimeMillis - eVar2.f103100a));
            eVar2.f103100a = 0L;
        }
        map.put("reason", 1);
        q(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        TPLogUtil.i("TPReportManager", "onAppBackground");
        if (this.f103082m || this.J == 1 || !this.f103083n) {
            return;
        }
        this.f103083n = false;
        l lVar = new l();
        this.f103079j.getBufferingTotalParams().paramsToProperties(lVar);
        this.f103079j.getUserSeekTotalParams().paramsToProperties(lVar);
        TPReportParams.PlayDoneParams playDoneParams = this.f103079j.getPlayDoneParams();
        playDoneParams.endTimeUnix = System.currentTimeMillis();
        playDoneParams.reasonInt = 2;
        playDoneParams.errCodeString = this.f103095z;
        e eVar = this.P;
        if (eVar.f103100a > 0) {
            int i10 = eVar.f103101b;
            long jCurrentTimeMillis = System.currentTimeMillis();
            e eVar2 = this.P;
            eVar.f103101b = i10 + ((int) (jCurrentTimeMillis - eVar2.f103100a));
            eVar2.f103100a = 0L;
        }
        long j10 = this.f103086q;
        if (j10 > 0) {
            this.f103087r += playDoneParams.endTimeUnix - j10;
            this.f103086q = 0L;
        }
        playDoneParams.playDurationFloat = this.f103087r / 1000.0f;
        playDoneParams.paramsToProperties(lVar);
        TPReportParams.CommonParams commonParams = this.f103079j.getCommonParams();
        commonParams.stepInt = 50;
        commonParams.paramsToProperties(lVar);
        int i11 = this.J;
        if (i11 == 0) {
            a((com.tencent.thumbplayer.tcmedia.common.a.a) lVar, false);
        } else if (i11 == 1) {
            b((com.tencent.thumbplayer.tcmedia.common.a.a) lVar, false);
        }
        if (f103073h == null || TextUtils.isEmpty(this.C) || !this.M) {
            return;
        }
        TPLogUtil.i("TPReportManager", "Cache report event. mFlowId: " + this.C);
        f103073h.a(this.C, lVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Map<String, Object> map) {
        TPLogUtil.i("TPReportManager", "onPlayerError");
        if (map == null) {
            return;
        }
        e eVar = this.P;
        if (eVar.f103100a > 0) {
            int i10 = eVar.f103101b;
            long jCurrentTimeMillis = System.currentTimeMillis();
            e eVar2 = this.P;
            eVar.f103101b = i10 + ((int) (jCurrentTimeMillis - eVar2.f103100a));
            eVar2.f103100a = 0L;
        }
        this.f103095z = a(map, "code", "0");
        if (this.J == 1) {
            this.K.a(150, new l());
        } else {
            map.put("reason", 3);
            q(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        TPLogUtil.i("TPReportManager", "onReportLastEvent");
        com.tencent.thumbplayer.tcmedia.utils.c cVar = f103073h;
        if (cVar == null) {
            return;
        }
        try {
            ArrayList arrayList = (ArrayList) cVar.a();
            if (arrayList == null) {
                return;
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                try {
                    Properties properties = (Properties) arrayList.get(i10);
                    if (properties != null) {
                        a(new l(properties));
                    }
                } catch (Exception e10) {
                    TPLogUtil.e("TPReportManager", e10);
                }
            }
        } catch (Exception e11) {
            TPLogUtil.e("TPReportManager", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Map<String, Object> map) {
        TPLogUtil.i("TPReportManager", "onStartSeek");
        if (map == null) {
            return;
        }
        if (this.f103093x) {
            m(new com.tencent.thumbplayer.tcmedia.utils.g().a("etime", Long.valueOf(System.currentTimeMillis())).a());
        }
        if (this.f103092w) {
            k(new com.tencent.thumbplayer.tcmedia.utils.g().a("etime", Long.valueOf(System.currentTimeMillis())).a("petime", Long.valueOf(a(map, "pstime", 0L) / 1000)).a());
        }
        this.f103092w = true;
        this.f103081l = 1;
        TPReportParams.UserSeekOnceParams userSeekOnceParamsCreateUserSeekOnceParams = this.f103079j.createUserSeekOnceParams();
        this.O = userSeekOnceParamsCreateUserSeekOnceParams;
        userSeekOnceParamsCreateUserSeekOnceParams.seekStartTimeUnix = a(map, "stime", System.currentTimeMillis());
        TPReportParams.CommonParams commonParams = this.f103079j.getCommonParams();
        TPReportParams.UserSeekOnceParams userSeekOnceParams = this.O;
        userSeekOnceParams.formatInt = commonParams.mediaFormatInt;
        userSeekOnceParams.startPresentTimeLong = a(map, "pstime", 0L) / 1000;
    }

    private void k() {
        this.f103086q = 0L;
        this.f103087r = 0L;
        this.f103091v = 0;
        this.f103090u = 0;
        this.f103092w = false;
        this.f103093x = false;
        this.f103084o = false;
        this.f103085p = false;
        this.C = "";
        this.D = 0;
        this.E = 0;
        this.G = 0;
        this.H = 0L;
        this.f103089t = 0;
        this.f103094y = false;
        this.A = "";
        this.B = "";
        this.F = "";
        this.J = -1;
        this.f103095z = "0";
        this.P.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(Map<String, Object> map) {
        TPReportParams.UserSeekOnceParams userSeekOnceParams;
        TPLogUtil.i("TPReportManager", "onSeekComplete");
        this.f103092w = false;
        if (map == null || (userSeekOnceParams = this.O) == null) {
            return;
        }
        userSeekOnceParams.seekEndTimeUnix = a(map, "etime", System.currentTimeMillis());
        this.O.endPresentTimeLong = a(map, "petime", 0L) / 1000;
        TPReportParams.UserSeekOnceParams userSeekOnceParams2 = this.O;
        userSeekOnceParams2.errCodeString = this.f103095z;
        long j10 = userSeekOnceParams2.seekEndTimeUnix - userSeekOnceParams2.seekStartTimeUnix;
        if (j10 > 1200) {
            this.f103091v++;
            this.f103090u = (int) (((long) this.f103090u) + j10);
        }
        TPReportParams.UserSeekTotalParams userSeekTotalParams = this.f103079j.getUserSeekTotalParams();
        userSeekTotalParams.seekTotalCountInt++;
        userSeekTotalParams.seekBufferingDurationInt = this.f103090u;
        userSeekTotalParams.seekBufferingCountInt = this.f103091v;
        if (userSeekTotalParams.seekOnceParamsList.size() < 20) {
            userSeekTotalParams.seekOnceParamsList.add(this.O);
            l lVar = new l();
            this.O.paramsToProperties(lVar);
            this.K.a(40, lVar);
        }
        this.O = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        TPLogUtil.d("TPReportManager", "handleReportThreadExit");
        synchronized (this.f103076f) {
            this.f103077g = true;
            this.f103076f.notify();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(Map<String, Object> map) {
        TPLogUtil.i("TPReportManager", "onBufferingStart");
        if (map == null) {
            return;
        }
        this.f103093x = true;
        if (this.f103092w) {
            return;
        }
        e eVar = this.P;
        if (eVar.f103100a > 0) {
            int i10 = eVar.f103101b;
            long jCurrentTimeMillis = System.currentTimeMillis();
            e eVar2 = this.P;
            eVar.f103101b = i10 + ((int) (jCurrentTimeMillis - eVar2.f103100a));
            eVar2.f103100a = 0L;
        }
        this.P.f103106g = a(map, "stime", System.currentTimeMillis());
        TPReportParams.BufferingOnceParams bufferingOnceParamsCreateBufferingOnceParams = this.f103079j.createBufferingOnceParams();
        this.N = bufferingOnceParamsCreateBufferingOnceParams;
        bufferingOnceParamsCreateBufferingOnceParams.starTimeUnix = this.P.f103106g;
        bufferingOnceParamsCreateBufferingOnceParams.formatInt = a(map, "format", 0);
        TPReportParams.CommonParams commonParams = this.f103079j.getCommonParams();
        TPReportParams.BufferingOnceParams bufferingOnceParams = this.N;
        bufferingOnceParams.formatInt = commonParams.mediaFormatInt;
        bufferingOnceParams.reasonInt = a(map, "reason", 0);
        TPReportParams.BufferingOnceParams bufferingOnceParams2 = this.N;
        bufferingOnceParams2.lastEventInt = this.f103081l;
        bufferingOnceParams2.sceneInt = this.f103080k;
        bufferingOnceParams2.bufferingPresentTimeLong = a(map, "ptime", 0L) / 1000;
        this.N.urlString = a(map, "url", "");
    }

    private String m() {
        if (this.I == null) {
            return "0";
        }
        if (!TextUtils.isEmpty(f103071b)) {
            return f103071b;
        }
        int i10 = this.I.getResources().getDisplayMetrics().widthPixels;
        String str = this.I.getResources().getDisplayMetrics().heightPixels + androidx.webkit.b.f28327e + i10;
        f103071b = str;
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(Map<String, Object> map) {
        TPLogUtil.i("TPReportManager", "onBufferingEnd");
        this.f103093x = false;
        e eVar = this.P;
        if (!eVar.f103114o) {
            eVar.f103100a = System.currentTimeMillis();
        }
        if (map == null) {
            return;
        }
        long jA = a(map, "etime", System.currentTimeMillis());
        e eVar2 = this.P;
        long j10 = eVar2.f103106g;
        int i10 = (int) (jA - j10);
        if (i10 > 1200 && !this.f103092w) {
            eVar2.f103104e++;
            eVar2.f103107h = jA;
            eVar2.f103105f += (int) (jA - j10);
            TPReportParams.BufferingOnceParams bufferingOnceParams = this.N;
            if (bufferingOnceParams == null) {
                return;
            }
            bufferingOnceParams.endTimeUnix = a(map, "etime", 0L);
            this.N.errCodeString = this.f103095z;
            TPReportParams.BufferingTotalParams bufferingTotalParams = this.f103079j.getBufferingTotalParams();
            bufferingTotalParams.bufferingCountInt++;
            bufferingTotalParams.bufferingDurationInt += i10;
            if (bufferingTotalParams.bufferingOnceParamsList.size() < 20) {
                bufferingTotalParams.bufferingOnceParamsList.add(this.N);
                l lVar = new l();
                this.N.paramsToProperties(lVar);
                this.K.a(35, lVar);
            }
            this.N = null;
        }
    }

    private int n() {
        NetworkInfo activeNetworkInfo;
        Context context = this.I;
        if (context == null) {
            return 0;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
                return 0;
            }
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                return b(activeNetworkInfo.getSubtype());
            }
            if (type != 1) {
                return type != 9 ? 0 : 10;
            }
            return 1;
        } catch (Exception e10) {
            TPLogUtil.e("TPReportManager", e10);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(Map<String, Object> map) {
        TPLogUtil.i("TPReportManager", "onPlayComplete");
        if (map == null) {
            return;
        }
        map.put("reason", 0);
        q(map);
    }

    private int o() {
        UiModeManager uiModeManager = (UiModeManager) this.I.getSystemService("uimode");
        if (uiModeManager == null) {
            return 2;
        }
        if (uiModeManager.getCurrentModeType() == 4) {
            return 9;
        }
        return (this.I.getResources().getConfiguration().screenLayout & 15) >= 3 ? 5 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(Map<String, Object> map) {
        TPLogUtil.i("TPReportManager", "onPlayerReset");
        if (map == null) {
            return;
        }
        map.put("reason", 1);
        q(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Map<String, Object> map) {
        TPLogUtil.i("TPReportManager", "onPlayerRelease");
        if (map == null) {
            return;
        }
        map.put("reason", 1);
        q(map);
    }

    private void q(Map<String, Object> map) {
        TPLogUtil.i("TPReportManager", "onPlayEnd");
        if (map == null || this.f103082m) {
            return;
        }
        this.f103082m = true;
        if (this.J != 1 && this.f103084o) {
            d(new com.tencent.thumbplayer.tcmedia.utils.g().a("etime", Long.valueOf(System.currentTimeMillis())).a());
        }
        if (this.f103093x) {
            m(new com.tencent.thumbplayer.tcmedia.utils.g().a("etime", Long.valueOf(System.currentTimeMillis())).a());
        }
        if (this.f103092w) {
            k(new com.tencent.thumbplayer.tcmedia.utils.g().a("etime", Long.valueOf(System.currentTimeMillis())).a());
        }
        e eVar = this.P;
        if (eVar.f103100a > 0) {
            int i10 = eVar.f103101b;
            long jCurrentTimeMillis = System.currentTimeMillis();
            e eVar2 = this.P;
            eVar.f103101b = i10 + ((int) (jCurrentTimeMillis - eVar2.f103100a));
            eVar2.f103100a = 0L;
        }
        this.f103092w = false;
        l lVar = new l();
        this.f103079j.getBufferingTotalParams().paramsToProperties(lVar);
        this.f103079j.getBufferingTotalParams().reset();
        this.f103079j.getUserSeekTotalParams().paramsToProperties(lVar);
        this.f103079j.getUserSeekTotalParams().reset();
        TPReportParams.PlayDoneParams playDoneParams = this.f103079j.getPlayDoneParams();
        playDoneParams.endTimeUnix = a(map, "etime", System.currentTimeMillis());
        playDoneParams.reasonInt = a(map, "reason", 0);
        playDoneParams.errCodeString = this.f103095z;
        long j10 = this.f103086q;
        if (j10 > 0) {
            this.f103087r += playDoneParams.endTimeUnix - j10;
            this.f103086q = 0L;
        }
        playDoneParams.playDurationFloat = this.f103087r / 1000.0f;
        playDoneParams.paramsToProperties(lVar);
        this.K.a(50, lVar);
        this.f103095z = "0";
        this.f103079j.resetAllParam();
        h();
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f103080k = a(map, "scene", 1.0f) != 1.0f ? 2 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(Map<String, Object> map) {
        TPLogUtil.i("TPReportManager", "onGetCdn");
        if (map == null) {
            return;
        }
        l lVar = new l();
        TPReportParams.GetCdnUrlParams getCdnParams = this.f103079j.getGetCdnParams();
        getCdnParams.proxyIpString = a(map, "ip", "");
        getCdnParams.starTimeUnix = a(map, "stime", 0L);
        getCdnParams.endTimeUnix = a(map, "etime", 0L);
        getCdnParams.errCodeString = a(map, "code", "0");
        getCdnParams.paramsToProperties(lVar);
        this.K.a(15, lVar);
        if (TextUtils.isEmpty(getCdnParams.errCodeString) || getCdnParams.errCodeString.equals("0") || getCdnParams.errCodeString.equals("0.0")) {
            return;
        }
        this.f103095z = getCdnParams.errCodeString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(Map<String, Object> map) {
        TPLogUtil.i("TPReportManager", "on302Redirect");
        if (map == null) {
            return;
        }
        l lVar = new l();
        TPReportParams.RedirectParams redirectParams = this.f103079j.getRedirectParams();
        redirectParams.cdnTypeInt = a(map, "vt", 0);
        redirectParams.redirectCountInt = a(map, "t302", 0);
        redirectParams.redirectedUrlString = a(map, "url", "");
        redirectParams.starTimeUnix = a(map, "stime", 0L);
        redirectParams.endTimeUnix = a(map, "etime", 0L);
        redirectParams.errCodeString = a(map, "code", "0");
        redirectParams.paramsToProperties(lVar);
        this.K.a(34, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.C = UUID.randomUUID().toString() + System.nanoTime() + lg.a.f131412e + TPPlayerConfig.getPlatform();
        this.f103095z = a(map, "code", "0");
        TPDefaultReportInfo tPDefaultReportInfo = this.f103078i;
        if (tPDefaultReportInfo != null) {
            this.J = tPDefaultReportInfo.getPlayType();
        }
        if (this.J == 1) {
            this.K.a(150, new l());
        } else {
            map.put("reason", 3);
            this.f103082m = false;
            q(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(Map<String, Object> map) {
        TPLogUtil.i("TPReportManager", "onLoadSubtitle");
        if (map == null) {
            return;
        }
        this.P.f103122w.add(new f(a(map, "name", ""), a(map, "url", "")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(Map<String, Object> map) {
        TPLogUtil.i("TPReportManager", "onSelectTrack");
        if (map == null || this.P.f103122w.size() == 0 || a(map, "tracktype", 0) != 3) {
            return;
        }
        this.f103085p = true;
        this.P.f103112m = true;
        TPReportParams.LoadSubtitleParams loadSubtitleParams = this.f103079j.getLoadSubtitleParams();
        loadSubtitleParams.starTimeUnix = a(map, "stime", 0L);
        TPDefaultReportInfo tPDefaultReportInfo = this.f103078i;
        if (tPDefaultReportInfo != null) {
            loadSubtitleParams.cdnTypeInt = tPDefaultReportInfo.subtitleCdnType;
            loadSubtitleParams.cgiUrlIndex = tPDefaultReportInfo.subtitleUrlIndex;
        }
        long jA = a(map, "opaque", -1L);
        String strA = a(map, "name", "");
        for (f fVar : this.P.f103122w) {
            if (!TextUtils.isEmpty(strA) && fVar.f103124a.equals(strA)) {
                loadSubtitleParams.subtitleUrlString = fVar.f103125b;
                fVar.f103126c = jA;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(Map<String, Object> map) {
        TPLogUtil.i("TPReportManager", "onSelectTrackDone");
        if (!this.f103085p || map == null || this.P.f103122w.size() == 0) {
            return;
        }
        long jA = a(map, "opaque", -1L);
        if (jA == -1) {
            return;
        }
        Iterator<f> it = this.P.f103122w.iterator();
        while (it.hasNext()) {
            if (it.next().f103126c == jA) {
                TPReportParams.LoadSubtitleParams loadSubtitleParams = this.f103079j.getLoadSubtitleParams();
                loadSubtitleParams.endTimeUnix = a(map, "etime", 0L);
                loadSubtitleParams.errCodeString = a(map, "code", "0");
                loadSubtitleParams.bufferingDurationInt = (int) (loadSubtitleParams.endTimeUnix - loadSubtitleParams.starTimeUnix);
                l lVar = new l();
                loadSubtitleParams.paramsToProperties(lVar);
                this.K.a(33, lVar);
                this.f103085p = false;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(Map<String, Object> map) {
        TPLogUtil.i("TPReportManager", "onSwitchDef");
        if (map == null) {
            return;
        }
        this.P.f103116q = a(map, "switch", "");
        this.P.f103114o = true;
        if (this.J == 1) {
            this.f103075e.removeMessages(3000);
            f();
            e eVar = this.P;
            eVar.f103102c = 0L;
            eVar.f103103d = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(Map<String, Object> map) {
        TPLogUtil.i("TPReportManager", "onSwitchDefEnd");
        if (map == null) {
            return;
        }
        this.P.f103116q = a(map, "switch", "");
        this.P.f103114o = false;
        if (this.J == 1) {
            this.K.a(30, new l());
            this.f103075e.removeMessages(3000);
            this.f103075e.sendEmptyMessageDelayed(3000, 60000L);
            this.P.f103100a = System.currentTimeMillis();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.a
    public void a() {
        d();
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.a
    public void a(int i10, int i11, int i12, String str, Object obj) {
        int i13;
        switch (i10) {
            case 100:
                i13 = 999;
                break;
            case 101:
                i13 = 1000;
                break;
            case 102:
                i13 = 1001;
                break;
            case 103:
                i13 = 1002;
                break;
            case 104:
                i13 = 1003;
                break;
            case 105:
                i13 = 1012;
                break;
            case 106:
                i13 = 1004;
                break;
            case 107:
                i13 = 1005;
                break;
            case 108:
                i13 = 1006;
                break;
            case 109:
                i13 = 1007;
                break;
            case 110:
                i13 = 1008;
                break;
            case 111:
                i13 = 1009;
                break;
            case 112:
                i13 = 1010;
                break;
            case 113:
                i13 = 1011;
                break;
            case 114:
                i13 = 1013;
                break;
            case 115:
                i13 = 1014;
                break;
            case 116:
                i13 = 1015;
                break;
            case 117:
                i13 = 1016;
                break;
            case 118:
                i13 = 2002;
                break;
            case 119:
                i13 = 1019;
                break;
            case 120:
                i13 = 1020;
                break;
            case 121:
                i13 = 1021;
                break;
            case 122:
                i13 = 2004;
                break;
            case 123:
                i13 = 2005;
                break;
            case 124:
                i13 = 1022;
                break;
            default:
                switch (i10) {
                    case 200:
                        i13 = 1017;
                        break;
                    case 201:
                        i13 = 1018;
                        break;
                    case 202:
                        i13 = 1023;
                        break;
                    default:
                        return;
                }
                break;
        }
        this.f103075e.obtainMessage(i13, obj).sendToTarget();
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.a
    public void b() {
        e();
    }

    public boolean c() {
        boolean z10;
        if (Math.random() < this.L) {
            TPLogUtil.i("TPReportManager", "reports are sampled");
            z10 = true;
        } else {
            TPLogUtil.i("TPReportManager", "reports are not sampled");
            z10 = false;
        }
        this.M = z10;
        return this.M;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.report.ITPBusinessReportManager
    public void reportEvent(int i10, Map<String, Object> map) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.report.ITPBusinessReportManager
    public void setReportInfoGetter(TPDefaultReportInfo tPDefaultReportInfo) {
        this.f103078i = tPDefaultReportInfo;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.report.ITPBusinessReportManager
    public void setReportSamplingRate(double d10) {
        if (d10 < 0.0d) {
            d10 = 0.0d;
        }
        if (d10 > 1.0d) {
            d10 = 1.0d;
        }
        this.L = d10;
    }
}
