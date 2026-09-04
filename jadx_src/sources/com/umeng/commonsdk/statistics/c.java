package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.aw;
import com.umeng.analytics.pro.bl;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.idtracking.e;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.internal.d;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.statistics.proto.Response;
import java.io.File;

/* JADX INFO: compiled from: NetWorkManager.java */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f105287b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f105288c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f105289d = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f105290o = "thtstart";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f105291p = "gkvc";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f105292q = "ekvc";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f105293a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.umeng.commonsdk.statistics.internal.c f105295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImprintHandler f105296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private e f105297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImprintHandler.a f105298i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Defcon f105300k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f105301l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f105302m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f105303n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Context f105304r;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f105294e = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ABTest f105299j = null;

    public c(Context context) {
        this.f105297h = null;
        this.f105298i = null;
        this.f105300k = null;
        this.f105301l = 0L;
        this.f105302m = 0;
        this.f105303n = 0;
        this.f105293a = null;
        this.f105304r = context;
        this.f105298i = ImprintHandler.getImprintService(context).c();
        this.f105300k = Defcon.getService(this.f105304r);
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(this.f105304r);
        this.f105301l = sharedPreferences.getLong(f105290o, 0L);
        this.f105302m = sharedPreferences.getInt(f105291p, 0);
        this.f105303n = sharedPreferences.getInt(f105292q, 0);
        this.f105293a = UMEnvelopeBuild.imprintProperty(this.f105304r, "track_list", null);
        ImprintHandler imprintService = ImprintHandler.getImprintService(this.f105304r);
        this.f105296g = imprintService;
        imprintService.a(new d() { // from class: com.umeng.commonsdk.statistics.c.1
            @Override // com.umeng.commonsdk.statistics.internal.d
            public void onImprintChanged(ImprintHandler.a aVar) {
                c.this.f105300k.onImprintChanged(aVar);
                c cVar = c.this;
                cVar.f105293a = UMEnvelopeBuild.imprintProperty(cVar.f105304r, "track_list", null);
            }
        });
        if (!UMConfigure.needSendZcfgEnv(this.f105304r)) {
            this.f105297h = e.a(this.f105304r);
        }
        com.umeng.commonsdk.statistics.internal.c cVar = new com.umeng.commonsdk.statistics.internal.c(this.f105304r);
        this.f105295f = cVar;
        cVar.a(StatTracer.getInstance(this.f105304r));
    }

    private int a(byte[] bArr) {
        Response response = new Response();
        try {
            new aw(new bl.a()).a(response, bArr);
            if (response.resp_code == 1) {
                this.f105296g.b(response.getImprint());
                this.f105296g.d();
            }
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(this.f105304r, th2);
        }
        return response.resp_code == 1 ? 2 : 3;
    }

    public boolean a(File file) {
        String strC;
        if (file == null) {
            return false;
        }
        try {
            byte[] byteArray = UMFrUtils.toByteArray(file.getPath());
            if (byteArray == null) {
                return false;
            }
            String name = file.getName();
            if (TextUtils.isEmpty(name)) {
                return false;
            }
            com.umeng.commonsdk.statistics.internal.a aVarA = com.umeng.commonsdk.statistics.internal.a.a(this.f105304r);
            aVarA.d(name);
            boolean zA = aVarA.a(name);
            boolean zB = aVarA.b(name);
            boolean zC = aVarA.c(name);
            String strD = com.umeng.commonsdk.stateless.d.d(name);
            if (TextUtils.isEmpty(strD)) {
                strC = zC ? UMServerURL.ZCFG_PATH : UMServerURL.PATH_ANALYTICS;
            } else {
                strC = com.umeng.commonsdk.stateless.d.c(strD);
            }
            byte[] bArrA = this.f105295f.a(byteArray, zA, zC, strC);
            int iA = bArrA == null ? 1 : a(bArrA);
            if (UMConfigure.isDebugLog()) {
                if (zC && iA == 2) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "Zero req: succeed.");
                } else if (zB && iA == 2) {
                    MLog.d("本次启动数据: 发送成功!");
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "Send instant data: succeed.");
                } else if (zA && iA == 2) {
                    MLog.d("普通统计数据: 发送成功!");
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "Send analytics data: succeed.");
                } else {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "Inner req: succeed.");
                }
            }
            if (iA == 2) {
                e eVar = this.f105297h;
                if (eVar != null) {
                    eVar.e();
                }
                StatTracer.getInstance(this.f105304r).saveSate();
            } else if (iA == 3) {
                StatTracer.getInstance(this.f105304r).saveSate();
                if (zC) {
                    FieldManager.a().a(this.f105304r);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 零号报文应答内容报错!!! ，特殊处理!，继续正常流程。");
                    Context context = this.f105304r;
                    UMWorkDispatch.sendEvent(context, com.umeng.commonsdk.internal.a.f105209s, com.umeng.commonsdk.internal.b.a(context).a(), null);
                    return true;
                }
            }
            return iA == 2;
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(this.f105304r, th2);
            return false;
        }
    }
}
