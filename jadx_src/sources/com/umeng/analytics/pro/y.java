package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: SessionIdManager.java */
/* JADX INFO: loaded from: classes4.dex */
public class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile y f104981c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private w f104982a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f104983b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<a> f104984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f104985e;

    /* JADX INFO: compiled from: SessionIdManager.java */
    public interface a {
        void a(String str, long j10, long j11, long j12);

        void a(String str, String str2, long j10, long j11, long j12);
    }

    private y() {
    }

    private long a(Context context, String str) {
        long j10;
        try {
            j10 = PreferenceWrapper.getDefault(context).getLong(str, 0L);
        } catch (Exception unused) {
            j10 = 0;
        }
        return j10 <= 0 ? System.currentTimeMillis() : j10;
    }

    public static y a() {
        if (f104981c == null) {
            synchronized (y.class) {
                if (f104981c == null) {
                    f104981c = new y();
                }
            }
        }
        return f104981c;
    }

    private void a(long j10, long j11, long j12, String str, boolean z10) {
        List<a> list = this.f104984d;
        if (list != null) {
            for (a aVar : list) {
                if (z10) {
                    try {
                        aVar.a(str, this.f104983b, j10, j11, j12);
                    } catch (Exception unused) {
                    }
                } else {
                    aVar.a(this.f104983b, j10, j11, j12);
                }
            }
        }
    }

    private String f(Context context) {
        try {
            SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(context).edit();
            editorEdit.putString(u.f104963d, d(context));
            editorEdit.commit();
        } catch (Exception unused) {
        }
        long jH = h(context);
        long jI = i(context);
        String str = this.f104983b;
        long jA = u.a(context);
        long j10 = jA * 5000;
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>*** 读取 foreground count 值完成，count次数：" + jA);
        if (!FieldManager.allow(com.umeng.commonsdk.utils.b.E)) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>*** foreground count druation云控参数关闭。");
        } else if (UMWorkDispatch.eventHasExist()) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>*** 读取 foreground count druation值完成，终止checker timer.");
            UMWorkDispatch.removeEvent();
        } else {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>*** 读取 foreground count druation值完成，无未处理check timer事件。");
        }
        a(jI, jH, j10, str, false);
        this.f104983b = this.f104982a.a(context);
        a(jI, jH, j10, str, true);
        this.f104982a.a(context, this.f104983b);
        return this.f104983b;
    }

    private boolean g(Context context) {
        return !TextUtils.isEmpty(this.f104983b) && i.a(context).a(this.f104983b) > 0;
    }

    private long h(Context context) {
        return a(context, u.f104965f);
    }

    private long i(Context context) {
        return a(context, u.f104960a);
    }

    private boolean j(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(appContext);
            long j10 = sharedPreferences.getLong(u.f104964e, 0L);
            long j11 = sharedPreferences.getLong(u.f104965f, 0L);
            if (FieldManager.allow(com.umeng.commonsdk.utils.b.E) && j10 > 0 && j11 == 0) {
                long jA = u.a(appContext);
                if (jA > 0) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> last session end time stamp = 0, reconstruct it by foreground count value.");
                    j11 = j10 + (jA * 5000);
                }
            }
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> interval of last session is: " + (j11 - j10));
            return this.f104982a.a(j10, j11);
        } catch (Exception unused) {
            return false;
        }
    }

    public String a(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        String string = "";
        try {
            synchronized (y.class) {
                string = PreferenceWrapper.getDefault(appContext).getString(u.f104963d, "");
            }
        } catch (Exception unused) {
        }
        return string;
    }

    public String a(Context context, long j10) {
        if (TextUtils.isEmpty(this.f104985e)) {
            String str = "SUB" + j10;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(String.format("%0" + (32 - str.length()) + "d", 0));
            this.f104985e = sb2.toString();
        }
        return this.f104985e;
    }

    public void a(long j10) {
        this.f104982a.a(j10);
    }

    public void a(a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f104984d == null) {
            this.f104984d = new ArrayList();
        }
        if (this.f104984d.contains(aVar)) {
            return;
        }
        this.f104984d.add(aVar);
    }

    public long b() {
        return this.f104982a.a();
    }

    public synchronized String b(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        this.f104983b = d(appContext);
        if (e(appContext)) {
            try {
                this.f104983b = f(appContext);
            } catch (Exception unused) {
            }
        }
        return this.f104983b;
    }

    public void b(a aVar) {
        List<a> list;
        if (aVar == null || (list = this.f104984d) == null || list.size() == 0) {
            return;
        }
        this.f104984d.remove(aVar);
    }

    public String c(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        try {
            this.f104983b = f(appContext);
        } catch (Exception unused) {
        }
        return this.f104983b;
    }

    public String d(Context context) {
        if (TextUtils.isEmpty(this.f104983b)) {
            try {
                this.f104983b = PreferenceWrapper.getDefault(context).getString("session_id", null);
            } catch (Exception unused) {
            }
        }
        return this.f104983b;
    }

    public boolean e(Context context) {
        if (TextUtils.isEmpty(this.f104983b)) {
            this.f104983b = d(context);
        }
        return TextUtils.isEmpty(this.f104983b) || j(context) || g(context);
    }
}
