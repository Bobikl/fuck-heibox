package com.tencent.liteav.txcvodplayer.a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.ss.android.ttvecamera.TECameraSettings;
import com.tencent.liteav.LiveSettingJni;
import com.tencent.liteav.base.datareport.Event4XReporter;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.sdk.common.LicenseChecker;
import com.tencent.liteav.txcplayer.common.c;
import com.tencent.ugc.datereport.UGCDataReportDef;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public String A;
    public String B;
    private Context E;
    private int J;
    private int K;
    private int M;
    private String O;
    private Map<String, String> P;
    private Event4XReporter Q;
    private Event4XReporter R;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f100021o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f100007a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f100008b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f100009c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f100010d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f100011e = 0;
    private boolean F = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f100012f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f100013g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f100014h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f100015i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f100016j = 0;
    private int G = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f100017k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f100018l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f100019m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f100020n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f100022p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f100023q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f100024r = false;
    private int I = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f100025s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f100026t = "0";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f100027u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f100028v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f100029w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f100030x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f100031y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f100032z = 0;
    private float L = 1.0f;
    public int C = 0;
    public int D = 0;
    private String H = LiteavSystemInfo.getAppVersion();
    private String N = j();

    public a(Context context) {
        this.O = "";
        this.E = context;
        String appId = LicenseChecker.getInstance().getAppId();
        LiteavLog.i("VodLicenseCheck", "getLicenseAppId = ".concat(String.valueOf(appId)));
        this.O = appId;
        this.P = new HashMap();
        this.R = new Event4XReporter(UGCDataReportDef.COMMAND_ID_DAU, 1004, "", true, 1);
    }

    private static String a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        try {
            Class<?> cls = Class.forName("android.view.Display");
            if (LiteavSystemInfo.getSystemOSVersionInt() > 8) {
                cls.getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            }
            int i10 = displayMetrics.heightPixels;
            return displayMetrics.widthPixels + lg.a.f131412e + i10;
        } catch (Throwable unused) {
            return "";
        }
    }

    private void g() {
        this.Q.setEventStringValue("str_sdk_name", "liteavSdk");
        this.Q.setEventStringValue("str_brand_type", LiteavSystemInfo.getBrand());
        this.Q.setEventStringValue("str_device_resolution", a(this.E));
        this.Q.setEventStringValue("str_device_type", LiteavSystemInfo.getModel());
        this.Q.setEventIntValue("u32_network_type", LiteavSystemInfo.getNetworkType());
        String deviceUuid = LiteavSystemInfo.getDeviceUuid();
        this.Q.setEventStringValue(UGCDataReportDef.DR_KEY_DEV_UUID, deviceUuid);
        this.Q.setEventStringValue("str_app_version", this.H);
        this.Q.setEventStringValue("str_app_name", LiteavSystemInfo.getAppName());
        this.Q.setEventStringValue(UGCDataReportDef.DR_KEY_SYS_VER, String.valueOf(LiteavSystemInfo.getSystemOSVersionInt()));
        this.Q.setEventStringValue("str_stream_url", this.f100007a);
        this.Q.setEventStringValue("bytes_token", this.N);
        String userId = LiveSettingJni.getUserId();
        if (TextUtils.isEmpty(userId)) {
            userId = lg.a.f131412e.concat(String.valueOf(deviceUuid));
        }
        this.Q.setEventStringValue("str_user_id", userId);
        this.Q.setEventStringValue("str_package_name", LiteavSystemInfo.getAppPackageName());
        this.Q.setEventStringValue("u32_app_id", this.O);
        this.Q.setEventStringValue("custom_data", h());
    }

    private String h() {
        if (this.P.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : this.P.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                try {
                    jSONObject.put(key, value);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
        return jSONObject.toString();
    }

    private void i() {
        this.Q = new Event4XReporter(40304, 1011, "", true, 1);
        g();
        this.Q.setEventIntValue("u32_timeuse", this.G);
        this.Q.setEventIntValue("u32_videotime", this.f100015i);
        Event4XReporter event4XReporter = this.Q;
        int i10 = this.f100019m;
        event4XReporter.setEventIntValue("u32_avg_load", i10 == 0 ? 0L : this.f100020n / i10);
        this.Q.setEventIntValue("u32_load_cnt", this.f100019m);
        this.Q.setEventIntValue("u32_max_load", this.f100021o);
        this.Q.setEventIntValue("u32_avg_block_time", this.f100020n);
        this.Q.setEventIntValue("u32_player_type", this.f100025s);
        Event4XReporter event4XReporter2 = this.Q;
        int i11 = this.f100031y;
        event4XReporter2.setEventIntValue("u32_dns_time", i11 > 0 ? i11 : 0L);
        Event4XReporter event4XReporter3 = this.Q;
        int i12 = this.f100030x;
        event4XReporter3.setEventIntValue("u32_tcp_did_connect", i12 > 0 ? i12 : 0L);
        Event4XReporter event4XReporter4 = this.Q;
        int i13 = this.f100032z;
        event4XReporter4.setEventIntValue("u32_first_video_packet", i13 > 0 ? i13 : 0L);
        this.Q.setEventIntValue("u32_first_i_frame", this.f100018l);
        this.Q.setEventStringValue("u32_server_ip", this.A);
        this.Q.setEventStringValue("u32_drm_type", this.B);
        this.Q.setEventStringValue("str_fileid", this.f100027u);
        this.Q.setEventStringValue("u32_playmode", this.f100026t);
        this.Q.setEventIntValue("u64_err_code", this.J);
        this.Q.setEventStringValue("str_err_info", this.f100028v);
        this.Q.setEventIntValue("u32_video_decode_type", this.f100029w);
        this.Q.setEventIntValue("u32_speed", (int) (this.L * 100.0f));
        this.Q.setEventIntValue("vwidth", this.C);
        this.Q.setEventIntValue("vheight", this.D);
        this.Q.sendReport();
        StringBuilder sb2 = new StringBuilder("[reportEnd] evt 40304: token=");
        sb2.append(this.N);
        sb2.append(" ,dev_uuid=");
        sb2.append(LiteavSystemInfo.getDeviceUuid());
        sb2.append(" ,str_app_version=");
        sb2.append(this.H);
        sb2.append(" ,sys_version=");
        sb2.append(LiteavSystemInfo.getSystemOSVersionInt());
        sb2.append(" ,str_stream_url=");
        sb2.append(this.f100007a);
        sb2.append(" ,u32_timeuse=");
        sb2.append(this.G);
        sb2.append(" ,u32_videotime=");
        sb2.append(this.f100015i);
        sb2.append(" ,u32_avg_load=");
        int i14 = this.f100019m;
        sb2.append(i14 == 0 ? 0 : this.f100020n / i14);
        sb2.append(" ,u32_load_cnt=");
        sb2.append(this.f100019m);
        sb2.append(" ,u32_max_load=");
        sb2.append(this.f100021o);
        sb2.append(" ,u32_avg_block_time=");
        sb2.append(this.f100020n);
        sb2.append(" ,u32_player_type=");
        sb2.append(this.f100025s);
        sb2.append(" ,u32_dns_time=");
        sb2.append(this.f100031y);
        sb2.append(" ,u32_tcp_did_connect=");
        int i15 = this.f100030x;
        if (i15 <= 0) {
            i15 = -1;
        }
        sb2.append(i15);
        sb2.append(" ,u32_first_video_packet=");
        int i16 = this.f100032z;
        sb2.append(i16 > 0 ? i16 : -1);
        sb2.append(" ,u32_first_i_frame=");
        sb2.append(this.f100018l);
        sb2.append(" ,u32_server_ip=");
        sb2.append(this.A);
        sb2.append(" ,u32_drm_type=");
        sb2.append(this.B);
        sb2.append(" ,str_fileid=");
        sb2.append(this.f100027u);
        sb2.append(" ,u32_playmode=");
        sb2.append(this.f100026t);
        sb2.append(" ,u64_err_code=");
        sb2.append(this.J);
        sb2.append(" ,str_err_info=");
        sb2.append(this.f100028v);
        sb2.append(" ,u32_speed=");
        sb2.append(this.L * 100.0f);
        sb2.append(" ,u32_app_id=");
        sb2.append(this.O);
        sb2.append(" ,u32_video_decode_type=");
        sb2.append(this.f100029w);
        sb2.append(" ,custom_data=");
        sb2.append(h());
        sb2.append(" ,vwidth=");
        sb2.append(this.C);
        sb2.append(" ,vheight=");
        sb2.append(this.D);
        LiteavLog.i("TXCVodPlayCollection", sb2.toString());
    }

    private static String j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jUptimeMillis = SystemClock.uptimeMillis();
        String str = "";
        for (int i10 = 5; i10 >= 0; i10--) {
            str = str + String.format("%02x", Byte.valueOf((byte) (255 & (jCurrentTimeMillis >> (i10 * 8)))));
        }
        for (int i11 = 3; i11 >= 0; i11--) {
            str = str + String.format("%02x", Byte.valueOf((byte) ((jUptimeMillis >> (i11 * 8)) & 255)));
        }
        return str + com.tencent.liteav.txcplayer.a.a.b(str + LiteavSystemInfo.getDeviceUuid());
    }

    public final void a() {
        this.Q = new Event4XReporter(40303, 1011, "", true, 1);
        g();
        this.Q.setEventStringValue("str_fileid", this.f100027u);
        LicenseChecker.d dVarA = c.a();
        if (dVarA != LicenseChecker.d.OK) {
            int i10 = dVarA.value;
            this.J = i10;
            this.f100028v = "player_license_error";
            this.Q.setEventStringValue("u64_err_code", String.valueOf(i10));
            this.Q.setEventStringValue("str_err_info", this.f100028v);
        }
        this.Q.sendReport();
        LiteavLog.i("TXCVodPlayCollection", "[reportStart], report evt 40303: token=" + this.N + " ,u32_app_id=" + this.O + " ,str_fileid=" + this.f100027u + " ,str_stream_url=" + this.f100007a + " ,u64_err_code=" + this.J + " ,str_err_info=" + this.f100028v);
    }

    public final void a(float f10) {
        this.L = f10;
        this.R.reportDau(bb.c.b.Sq, 0, "");
        LiteavLog.i("TXCVodPlayCollection", "[changeSpeed], mSpeed = " + this.L);
    }

    public final void a(int i10, String str) {
        LiteavLog.i("TXCVodPlayCollection", "errorCode= " + i10 + " ，errorInfo= " + str);
        if (this.f100018l == -1) {
            this.J = i10;
            if (str == null) {
                str = "";
            }
            this.f100028v = str;
            this.f100018l = 0;
        } else {
            StringBuilder sb2 = new StringBuilder(TECameraSettings.r.f97180a);
            sb2.append(i10);
            sb2.append("_errorInfo=");
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            this.f100028v = sb2.toString();
        }
        if (this.F) {
            c();
        }
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(this.O)) {
            this.O = str;
        }
    }

    public final void a(String str, String str2) {
        LiteavLog.i("TXCVodPlayCollection", "[putCustomData]: <" + str + " ," + str2 + ">");
        this.P.put(str, str2);
    }

    public final void a(boolean z10) {
        this.F = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f100010d = jCurrentTimeMillis;
        this.f100008b = jCurrentTimeMillis;
        this.f100009c = System.currentTimeMillis();
        this.G = 0;
        this.f100017k = 0L;
        this.f100016j = 0;
        this.f100011e = 0L;
        this.f100019m = 0;
        this.f100020n = 0;
        this.f100021o = 0;
        if (z10) {
            this.f100012f = false;
        } else {
            this.f100013g = true;
        }
        LiteavLog.i("TXCVodPlayCollection", "[start] ,mBeginPlayTS = " + this.f100010d + ", mIsPaused = " + this.f100012f + " mIsPreLoading = " + this.f100013g);
    }

    public final void b() {
        if (0 == this.f100010d) {
            LiteavLog.i("TXCVodPlayCollection", "calculateSegmentPlayTime mBeginPlayTS == 0");
            return;
        }
        LiteavLog.i("TXCVodPlayCollection", "calculateSegmentPlayTime mCurIndexPlayTime= " + this.f100017k + ", mBeginPlayTS=" + this.f100010d);
        this.f100017k = this.f100017k + ((long) ((int) (System.currentTimeMillis() - this.f100010d)));
        this.f100010d = System.currentTimeMillis();
    }

    public final void b(boolean z10) {
        if (z10) {
            this.K = 1;
            this.R.reportDau(bb.c.b.Tq, 0, "");
        } else {
            this.K = 0;
        }
        LiteavLog.i("TXCVodPlayCollection", "mIsMirror= " + this.K);
    }

    public final void c() {
        LiteavLog.i("TXCVodPlayCollection", "[stop] mCurIndexPlayTime = " + this.f100017k + " ,mIsPaused = " + this.f100012f + " ,mIsPlaying = " + this.F + " ,mIsPreLoading =" + this.f100013g);
        if (this.f100012f) {
            this.f100010d = System.currentTimeMillis();
        }
        if (this.F && !this.f100013g) {
            b();
            this.G = (int) (((long) this.G) + (this.f100017k / 1000));
            LiteavLog.i("TXCVodPlayCollection", "[stop] mPlayTime = " + this.G + " s");
            this.f100017k = 0L;
            i();
            this.N = j();
            this.F = false;
        }
        this.f100022p = false;
        this.f100023q = false;
        this.f100012f = false;
        this.f100013g = false;
        this.f100014h = false;
        this.f100018l = -1;
        this.P.clear();
    }

    public final void c(boolean z10) {
        if (!z10) {
            this.f100014h = true;
        }
        this.M++;
        this.R.reportDau(bb.c.b.Uq, 0, "");
        LiteavLog.d("TXCVodPlayCollection", "mSetBitrateIndexCnt= " + this.M);
    }

    public final void d() {
        if (this.f100018l == -1) {
            this.f100018l = (int) (System.currentTimeMillis() - this.f100008b);
        }
    }

    public final void e() {
        LiteavLog.i("TXCVodPlayCollection", "setBitrateRenderStart");
        this.f100014h = false;
    }

    public final void f() {
        this.f100022p = true;
        this.I++;
        this.R.reportDau(bb.c.b.Rq, 0, "");
        LiteavLog.d("TXCVodPlayCollection", "mSeekCnt= " + this.I);
    }
}
