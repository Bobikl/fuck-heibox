package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.vshelper.PageNameMonitor;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: ViewPageTracker.java */
/* JADX INFO: loaded from: classes4.dex */
public class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f104974c = 5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static JSONArray f104975d = new JSONArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Object f104976e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, Long> f104979f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Stack<String> f104977a = new Stack<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    com.umeng.analytics.vshelper.a f104978b = PageNameMonitor.getInstance();

    public static void a(Context context) {
        String string;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (f104976e) {
                    string = f104975d.toString();
                    f104975d = new JSONArray();
                }
                if (string.length() > 0) {
                    jSONObject.put("__a", new JSONArray(string));
                    if (jSONObject.length() > 0) {
                        i.a(context).a(u.a().c(), jSONObject, i.a.PAGE);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    protected int a() {
        return 2;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (UMConfigure.isDebugLog() && this.f104977a.size() != 0) {
            UMLog.aq(j.F, 0, "\\|", new String[]{"@"}, new String[]{this.f104977a.peek()}, null, null);
        }
        this.f104978b.customPageBegin(str);
        synchronized (this.f104979f) {
            this.f104979f.put(str, Long.valueOf(System.currentTimeMillis()));
            if (UMConfigure.isDebugLog()) {
                this.f104977a.push(str);
            }
        }
    }

    public void b() {
        String key;
        synchronized (this.f104979f) {
            key = null;
            long j10 = 0;
            for (Map.Entry<String, Long> entry : this.f104979f.entrySet()) {
                if (entry.getValue().longValue() > j10) {
                    long jLongValue = entry.getValue().longValue();
                    key = entry.getKey();
                    j10 = jLongValue;
                }
            }
        }
        if (key != null) {
            b(key);
        }
    }

    public void b(String str) {
        Long l10;
        Context appContext;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!this.f104979f.containsKey(str)) {
            if (UMConfigure.isDebugLog() && this.f104977a.size() == 0) {
                UMLog.aq(j.G, 0, "\\|", new String[]{"@"}, new String[]{str}, null, null);
                return;
            }
            return;
        }
        synchronized (this.f104979f) {
            l10 = this.f104979f.get(str);
        }
        if (l10 == null) {
            return;
        }
        if (UMConfigure.isDebugLog() && this.f104977a.size() > 0 && str.equals(this.f104977a.peek())) {
            this.f104977a.pop();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - l10.longValue();
        synchronized (f104976e) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(d.f104715v, str);
                jSONObject.put("duration", jCurrentTimeMillis);
                jSONObject.put(d.f104717x, l10);
                jSONObject.put("type", a());
                f104975d.put(jSONObject);
                if (f104975d.length() >= 5 && (appContext = UMGlobalContext.getAppContext(null)) != null) {
                    UMWorkDispatch.sendEvent(appContext, 4099, CoreProtocol.getInstance(appContext), null);
                }
            } catch (Throwable unused) {
            }
        }
        if (!UMConfigure.isDebugLog() || this.f104977a.size() == 0) {
            return;
        }
        UMLog.aq(j.E, 0, "\\|", new String[]{"@"}, new String[]{str}, null, null);
    }
}
