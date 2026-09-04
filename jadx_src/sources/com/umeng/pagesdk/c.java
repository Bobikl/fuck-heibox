package com.umeng.pagesdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.Choreographer;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f105969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f105970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f105971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f105972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f105973e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f105975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f105976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f105977i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f105978j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Context f105979k;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Map<String, Double> f105974f = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Choreographer.FrameCallback f105980l = new Choreographer.FrameCallback() { // from class: com.umeng.pagesdk.c.1
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            boolean z10 = PageManger.isDebug;
            c cVar = c.this;
            if (cVar.f105975g) {
                if (cVar.f105976h == 0) {
                    cVar.f105976h = System.currentTimeMillis();
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                c cVar2 = c.this;
                if (jCurrentTimeMillis - cVar2.f105976h > cVar2.f105977i) {
                    cVar2.b();
                    return;
                }
                if (cVar2.f105970b == 0) {
                    cVar2.f105970b = j10;
                }
                float f10 = (j10 - cVar2.f105970b) / 1000000.0f;
                if (f10 > cVar2.f105969a) {
                    double d10 = (((long) cVar2.f105971c) * 1000) / ((double) f10);
                    cVar2.f105971c = 0;
                    cVar2.f105970b = 0L;
                    if (PageManger.isDebug) {
                        Log.i("PageManger-PageFPSImpl", "doFrame: " + d10 + ", map size is " + c.this.f105974f.size() + ", page is " + c.this.f105978j);
                    }
                    Map<String, Double> map = c.this.f105974f;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(System.currentTimeMillis());
                    map.put(sb2.toString(), Double.valueOf(d10));
                    c cVar3 = c.this;
                    int i10 = cVar3.f105972d + 1;
                    cVar3.f105972d = i10;
                    if (i10 >= cVar3.f105973e) {
                        cVar3.c();
                        c cVar4 = c.this;
                        cVar4.f105972d = 0;
                        Map<String, Double> map2 = cVar4.f105974f;
                        if (map2 != null) {
                            map2.clear();
                        }
                    }
                } else {
                    cVar2.f105971c++;
                }
                Choreographer.getInstance().postFrameCallback(this);
            }
        }
    };

    public c(Context context) {
        SharedPreferences sharedPreferences;
        this.f105969a = 1000.0f;
        this.f105973e = 6;
        this.f105977i = 300000L;
        this.f105979k = context;
        if (context == null || (sharedPreferences = context.getSharedPreferences("efs_page", 0)) == null) {
            return;
        }
        this.f105969a = sharedPreferences.getFloat(PageConfigManger.APM_FPSPERF_COLLECT_INTERVAL, 1000.0f);
        this.f105973e = sharedPreferences.getInt(PageConfigManger.APM_FPSPERF_COLLECT_INTERVAL_TOGETHER, 6);
        this.f105977i = sharedPreferences.getLong(PageConfigManger.APM_FPSPERF_COLLECT_MAX_PERIOD_SEC, 300000L);
        if (PageManger.isDebug) {
            Log.i("PageManger-PageFPSImpl", "init fps. diff is " + this.f105969a + ", count diff is " + this.f105973e + ", dlealt time is " + this.f105977i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        a aVarA;
        Iterator<Map.Entry<String, Double>> it = this.f105974f.entrySet().iterator();
        if (it != null) {
            JSONArray jSONArray = null;
            boolean z10 = false;
            while (it.hasNext()) {
                Map.Entry<String, Double> next = it.next();
                if (next != null) {
                    if (jSONArray == null) {
                        jSONArray = new JSONArray();
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (PageManger.getRefreshRate() > 0.0f && next.getValue().doubleValue() < ((double) PageManger.getRefreshRate()) * 1.1d) {
                            jSONObject.put(next.getKey(), next.getValue());
                            if (next.getValue().doubleValue() < 40.0d) {
                                z10 = true;
                            }
                        }
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                    jSONArray.put(jSONObject);
                }
            }
            if (jSONArray != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("pN", this.f105978j);
                    jSONObject2.put("pF", jSONArray);
                    if (z10 && (aVarA = b.a(this.f105979k).a()) != null) {
                        jSONObject2.put("te", aVarA.f105959c);
                        jSONObject2.put("le", aVarA.f105957a);
                    }
                    EfsJSONLog efsJSONLog = new EfsJSONLog("fpsperf");
                    efsJSONLog.put("fps", jSONObject2);
                    EfsReporter reporter = PageManger.getReporter();
                    if (reporter != null) {
                        reporter.send(efsJSONLog);
                    }
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    public final void a() {
        if (this.f105975g) {
            if (PageManger.isDebug) {
                Log.i("PageManger-PageFPSImpl", "state is start!");
                return;
            }
            return;
        }
        this.f105975g = true;
        if (PageManger.isDebug) {
            Log.i("PageManger-PageFPSImpl", "start, page is " + this.f105978j);
        }
        Choreographer.getInstance().removeFrameCallback(this.f105980l);
        Choreographer.getInstance().postFrameCallback(this.f105980l);
    }

    public final void b() {
        if (PageManger.isDebug) {
            Log.i("PageManger-PageFPSImpl", "stop, page is " + this.f105978j);
        }
        c();
        this.f105975g = false;
        this.f105976h = 0L;
        this.f105970b = 0L;
        this.f105971c = 0;
        Map<String, Double> map = this.f105974f;
        if (map != null) {
            map.clear();
        }
        this.f105972d = 0;
    }
}
