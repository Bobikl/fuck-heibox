package com.tencent.thumbplayer.tcmedia.tplayer.a;

import android.content.Context;
import com.tencent.thumbplayer.tcmedia.api.reportv2.ITPReportChannelListener;
import com.tencent.thumbplayer.tcmedia.api.reportv2.ITPReportInfoGetter;
import com.tencent.thumbplayer.tcmedia.api.reportv2.TPExtendCommonKey;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyHelper;
import com.tencent.thumbplayer.tcmedia.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class c implements a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static com.tencent.thumbplayer.tcmedia.utils.c f102940i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ITPReportInfoGetter f102941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected com.tencent.thumbplayer.tcmedia.tplayer.a.a.a f102942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected CopyOnWriteArrayList<WeakReference<ITPReportChannelListener>> f102943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Context f102944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected l f102945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected j f102946f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f102947g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected Map<String, Object> f102948h = new HashMap();

    private synchronized void a(Context context, String str) {
        if (f102940i != null) {
            return;
        }
        f102940i = new com.tencent.thumbplayer.tcmedia.utils.c(this.f102944d, str);
    }

    protected static void a(Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (c(entry.getKey())) {
                map2.put(entry.getKey(), entry.getValue());
            } else if (b(entry.getKey())) {
                map3.put(entry.getKey(), entry.getValue());
            } else {
                TPLogUtil.e("TPBaseReporter", "invalid extend info <" + entry.getKey() + ", " + entry.getValue() + "> from ITPReportInfoGetter, key valid!");
            }
        }
    }

    protected static boolean b(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("ext_");
    }

    private synchronized void c() {
        com.tencent.thumbplayer.tcmedia.utils.c cVar = f102940i;
        if (cVar == null) {
            return;
        }
        for (String str : cVar.b()) {
            String strD = d(str);
            com.tencent.thumbplayer.tcmedia.tplayer.a.b.a aVar = (com.tencent.thumbplayer.tcmedia.tplayer.a.b.a) f102940i.b(str);
            if (strD != null && aVar != null) {
                Map<String, String> mapB = aVar.b();
                b(strD, mapB);
                com.tencent.thumbplayer.tcmedia.common.a.b.a(strD, mapB);
            }
        }
        f102940i.c();
    }

    protected static boolean c(String str) {
        if (str == null) {
            return false;
        }
        for (Field field : TPExtendCommonKey.class.getDeclaredFields()) {
            try {
                field.setAccessible(true);
                String str2 = (String) field.get(TPExtendCommonKey.class);
                if (str2 != null && str2.equals(str)) {
                    return true;
                }
            } catch (IllegalAccessException e10) {
                TPLogUtil.e("TPBaseReporter", e10);
            }
        }
        return false;
    }

    private static String d(String str) {
        for (Field field : i.class.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.getType() == String.class) {
                try {
                    String str2 = (String) field.get(i.class);
                    if (str2 != null && str.endsWith(str2)) {
                        return str2;
                    }
                } catch (IllegalAccessException unused) {
                    TPLogUtil.w("TPBaseReporter", "fail to get value of field(" + field.getName() + ") in TPReportEventId.class)");
                }
            }
        }
        return null;
    }

    protected TPDynamicStatisticParams a(boolean z10) {
        com.tencent.thumbplayer.tcmedia.tplayer.a.a.a aVar = this.f102942b;
        if (aVar != null) {
            return aVar.a(z10);
        }
        TPLogUtil.e("TPBaseReporter", "getDynamicStatParamsFromCore failed, mPlayerInfoGetter is null, return default value");
        return new TPDynamicStatisticParams();
    }

    TPGeneralPlayFlowParams a(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        TPGeneralPlayFlowParams tPGeneralPlayFlowParamsF;
        if (aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.n) {
            tPGeneralPlayFlowParamsF = ((com.tencent.thumbplayer.tcmedia.d.b.n) aVar).d();
        } else if (aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.l) {
            tPGeneralPlayFlowParamsF = ((com.tencent.thumbplayer.tcmedia.d.b.l) aVar).d();
        } else if (aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.i) {
            tPGeneralPlayFlowParamsF = ((com.tencent.thumbplayer.tcmedia.d.b.i) aVar).f();
        } else {
            TPLogUtil.e("TPBaseReporter", "event info do not have generalPlayFlowParams");
            tPGeneralPlayFlowParamsF = null;
        }
        return tPGeneralPlayFlowParamsF == null ? new TPGeneralPlayFlowParams() : tPGeneralPlayFlowParamsF;
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.a.a
    public void a() {
        CopyOnWriteArrayList<WeakReference<ITPReportChannelListener>> copyOnWriteArrayList = this.f102943c;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
            this.f102943c = null;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.a.a
    public void a(int i10, com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.a.a
    public void a(Context context, l lVar) {
        this.f102944d = context;
        this.f102943c = new CopyOnWriteArrayList<>();
        this.f102945e = lVar;
        this.f102946f = new j(context);
        a(context, "TPReporterCache");
        c();
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.a.a
    public void a(ITPReportChannelListener iTPReportChannelListener) {
        CopyOnWriteArrayList<WeakReference<ITPReportChannelListener>> copyOnWriteArrayList = this.f102943c;
        if (copyOnWriteArrayList == null) {
            TPLogUtil.w("TPBaseReporter", "mReportChannelListenerList is null");
            return;
        }
        Iterator<WeakReference<ITPReportChannelListener>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (it.next().get() == iTPReportChannelListener) {
                TPLogUtil.w("TPBaseReporter", "mReportChannelListenerList has contain reportChannelListener");
                return;
            }
        }
        this.f102943c.add(new WeakReference<>(iTPReportChannelListener));
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.a.a
    public void a(ITPReportInfoGetter iTPReportInfoGetter) {
        this.f102941a = iTPReportInfoGetter;
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.a.a
    public void a(com.tencent.thumbplayer.tcmedia.tplayer.a.a.a aVar) {
        this.f102942b = aVar;
    }

    protected void a(b bVar) {
        com.tencent.thumbplayer.tcmedia.tplayer.a.a.a aVar = this.f102942b;
        if (aVar == null) {
            TPLogUtil.e("TPBaseReporter", "fillStreamInfoToCommonParams fail, not set mPlayerInfoGetter");
            return;
        }
        TPGeneralPlayFlowParams tPGeneralPlayFlowParamsA = aVar.a();
        bVar.f102800a.a(this.f102945e.f102991i);
        bVar.f102800a.a(tPGeneralPlayFlowParamsA.mPlayerBaseMediaParams.mDurationMs);
        bVar.f102800a.e(tPGeneralPlayFlowParamsA.mPlayerBaseMediaParams.mHlsSourceType);
        bVar.f102800a.f(this.f102945e.f102989g);
        bVar.f102800a.g(this.f102945e.f102988f);
        bVar.f102800a.i(tPGeneralPlayFlowParamsA.mPlayerBaseMediaParams.mFormatContainer);
        bVar.f102800a.h(tPGeneralPlayFlowParamsA.mPlayerBaseMediaParams.mVideoEncodeFormat);
        bVar.f102800a.i(tPGeneralPlayFlowParamsA.mPlayerBaseMediaParams.mAudioEncodeFormat);
        bVar.f102800a.j(tPGeneralPlayFlowParamsA.mPlayerBaseMediaParams.mSubtitleEncodeFormat);
        bVar.f102800a.b(tPGeneralPlayFlowParamsA.mPlayerBaseMediaParams.mVideoStreamBitrateKbps);
        bVar.f102800a.a(tPGeneralPlayFlowParamsA.mPlayerBaseMediaParams.mVideoFrameRate);
        bVar.f102800a.j(this.f102945e.f102987e);
        bVar.f102800a.k(tPGeneralPlayFlowParamsA.mPlayerBaseMediaParams.mVideoWidth + androidx.webkit.b.f28327e + tPGeneralPlayFlowParamsA.mPlayerBaseMediaParams.mVideoHeight);
        bVar.f102800a.l(TPDownloadProxyHelper.getNativeLibVersion());
        bVar.f102800a.k(bVar.f102801b);
        bVar.f102800a.o(bVar.f102804e);
        bVar.f102800a.m(bVar.f102803d);
        bVar.f102800a.n(bVar.f102802c);
        bVar.f102800a.l(this.f102945e.f102990h);
        this.f102948h.put("buffermintotaldurationms", Long.valueOf(tPGeneralPlayFlowParamsA.mPlayerConfigParams.mBufferMinTotalDurationMs));
        this.f102948h.put("buffermaxtotaldurationms", Long.valueOf(tPGeneralPlayFlowParamsA.mPlayerConfigParams.mBufferMaxTotalDurationMs));
        this.f102948h.put("preloadtotaldurationms", Long.valueOf(tPGeneralPlayFlowParamsA.mPlayerConfigParams.mPreloadTotalDurationMs));
        this.f102948h.put("minbufferingdurationms", Long.valueOf(tPGeneralPlayFlowParamsA.mPlayerConfigParams.mMinBufferingDurationMs));
        this.f102948h.put("minbufferingtimems", Long.valueOf(tPGeneralPlayFlowParamsA.mPlayerConfigParams.mMinBufferingTimeMs));
        this.f102948h.put("maxbufferingtimems", Long.valueOf(tPGeneralPlayFlowParamsA.mPlayerConfigParams.mMaxBufferingTimeMs));
        this.f102948h.put("reducelatencyaction", Integer.valueOf(tPGeneralPlayFlowParamsA.mPlayerConfigParams.mReduceLatencyAction));
        this.f102948h.put("reducelatencyspeed", Float.valueOf(tPGeneralPlayFlowParamsA.mPlayerConfigParams.mReduceLatencyPlaySpeed));
        this.f102948h.put("buffertype", Integer.valueOf(tPGeneralPlayFlowParamsA.mPlayerConfigParams.mBufferType));
        try {
            bVar.f102800a.p(new JSONObject(this.f102948h).toString());
        } catch (NullPointerException e10) {
            TPLogUtil.e("TPBaseReporter", e10);
        }
    }

    protected synchronized void a(String str) {
        com.tencent.thumbplayer.tcmedia.utils.c cVar = f102940i;
        if (cVar == null) {
            return;
        }
        for (String str2 : cVar.b()) {
            if (str2.startsWith(str)) {
                f102940i.a(str2);
                TPLogUtil.i("TPBaseReporter", "remove cache, key:".concat(str2));
            }
        }
    }

    protected synchronized void a(String str, com.tencent.thumbplayer.tcmedia.tplayer.a.b.a aVar) {
        if (f102940i != null && this.f102945e.f102992j.booleanValue()) {
            f102940i.a(aVar.a() + str, aVar);
            TPLogUtil.i("TPBaseReporter", "write cache, flowid:" + aVar.a() + ", reportId:" + str);
            return;
        }
        TPLogUtil.i("TPBaseReporter", "mCache is null or does not need to report to beacon, no caching!");
    }

    protected void a(String str, Map<String, String> map) {
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = ":{";
        while (true) {
            sb2.append(str2);
            if (!it.hasNext()) {
                sb2.append(z5.g.f141884d);
                TPLogUtil.i("TPBaseReporter", sb2.toString());
                return;
            }
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            sb2.append(key);
            sb2.append(":");
            sb2.append(value);
            str2 = Constants.ACCEPT_TIME_SEPARATOR_SP;
        }
    }

    TPDynamicStatisticParams b(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        TPDynamicStatisticParams tPDynamicStatisticParamsG;
        if (aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.n) {
            tPDynamicStatisticParamsG = ((com.tencent.thumbplayer.tcmedia.d.b.n) aVar).e();
        } else if (aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.l) {
            tPDynamicStatisticParamsG = ((com.tencent.thumbplayer.tcmedia.d.b.l) aVar).e();
        } else if (aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.i) {
            tPDynamicStatisticParamsG = ((com.tencent.thumbplayer.tcmedia.d.b.i) aVar).g();
        } else {
            TPLogUtil.e("TPBaseReporter", "event info do not have dynamicStatisticParams");
            tPDynamicStatisticParamsG = null;
        }
        return tPDynamicStatisticParamsG == null ? new TPDynamicStatisticParams() : tPDynamicStatisticParamsG;
    }

    protected TPGeneralPlayFlowParams b() {
        com.tencent.thumbplayer.tcmedia.tplayer.a.a.a aVar = this.f102942b;
        if (aVar != null) {
            return aVar.a();
        }
        TPLogUtil.e("TPBaseReporter", "getGeneralPlayFlowParams failed, mPlayerInfoGetter is null, return default value");
        return new TPGeneralPlayFlowParams();
    }

    protected void b(b bVar) {
        ITPReportInfoGetter iTPReportInfoGetter = this.f102941a;
        if (iTPReportInfoGetter == null) {
            return;
        }
        Map<String, String> initExtendReportInfo = iTPReportInfoGetter.getInitExtendReportInfo();
        if (initExtendReportInfo == null) {
            TPLogUtil.e("TPBaseReporter", "fillInitExtReportInfoToCommonParams fail, initExtendReportInfo is null");
            return;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        a(initExtendReportInfo, map, map2);
        bVar.f102800a.a(map);
        bVar.f102800a.b(map2);
    }

    protected void b(String str, Map<String, String> map) {
        if (this.f102943c.size() == 0) {
            return;
        }
        for (int i10 = 0; i10 < this.f102943c.size(); i10++) {
            ITPReportChannelListener iTPReportChannelListener = this.f102943c.get(i10).get();
            if (iTPReportChannelListener != null) {
                iTPReportChannelListener.reportEvent(str, map);
            }
        }
    }

    protected void c(String str, Map<String, String> map) {
        if (this.f102945e.f102992j.booleanValue()) {
            com.tencent.thumbplayer.tcmedia.common.a.b.a(str, map);
        }
    }
}
