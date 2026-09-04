package com.taobao.agoo.a;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.android.agoo.common.Config;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static final String SP_AGOO_BIND_FILE_NAME = "AGOO_BIND";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentMap<String, Integer> f98526a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f98527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f98528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f98529d;

    public a(Context context) {
        if (context == null) {
            throw new RuntimeException("Context is null!!");
        }
        this.f98529d = context.getApplicationContext();
    }

    private void b() {
        try {
            String string = this.f98529d.getSharedPreferences("AGOO_BIND", 0).getString("bind_status", null);
            if (TextUtils.isEmpty(string)) {
                ALog.w("AgooBindCache", "restoreAgooClients packs null return", new Object[0]);
                return;
            }
            JSONArray jSONArray = new JSONArray(string);
            this.f98528c = jSONArray.getLong(0);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = this.f98528c;
            if (jCurrentTimeMillis >= 86400000 + j10) {
                ALog.i("AgooBindCache", "restoreAgooClients expired", "agooLastFlushTime", Long.valueOf(j10));
                this.f98528c = 0L;
                return;
            }
            for (int i10 = 1; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                this.f98526a.put(jSONObject.getString("p"), Integer.valueOf(jSONObject.getInt(ak.aB)));
            }
            ALog.i("AgooBindCache", "restoreAgooClients", "mAgooBindStatus", this.f98526a);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a() {
        this.f98527b = null;
    }

    public void a(String str) {
        Integer num = this.f98526a.get(str);
        if (num == null || num.intValue() != 2) {
            this.f98526a.put(str, 2);
            com.taobao.accs.client.b.a(this.f98529d, "AGOO_BIND", this.f98528c, this.f98526a);
        }
    }

    public boolean b(String str) {
        if (this.f98526a.isEmpty()) {
            b();
        }
        Integer num = this.f98526a.get(str);
        ALog.i("AgooBindCache", "isAgooRegistered", "packageName", str, "appStatus", num, "agooBindStatus", this.f98526a);
        return (UtilityImpl.a(Config.PREFERENCES, this.f98529d) || num == null || num.intValue() != 2) ? false : true;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f98527b = str;
    }

    public boolean d(String str) {
        String str2 = this.f98527b;
        return str2 != null && str2.equals(str);
    }
}
