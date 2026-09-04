package com.taobao.accs.client;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import com.umeng.analytics.pro.ak;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f98194a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f98197d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f98199f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentMap<String, Integer> f98195b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentMap<String, Set<String>> f98196c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f98198e = "ClientManager_";

    public b(Context context, String str) {
        this.f98199f = "ACCS_BIND";
        if (context == null) {
            throw new RuntimeException("Context is null!!");
        }
        this.f98198e += str;
        this.f98194a = context.getApplicationContext();
        this.f98199f = "ACCS_BIND" + str;
        a();
    }

    private void a() {
        try {
            String string = this.f98194a.getSharedPreferences(this.f98199f, 0).getString("bind_status", null);
            if (TextUtils.isEmpty(string)) {
                ALog.w(this.f98198e, "restoreClients break as packages null", new Object[0]);
                return;
            }
            JSONArray jSONArray = new JSONArray(string);
            this.f98197d = jSONArray.getLong(0);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = this.f98197d;
            if (jCurrentTimeMillis >= 86400000 + j10) {
                ALog.i(this.f98198e, "restoreClients expired", "lastFlushTime", Long.valueOf(j10));
                this.f98197d = 0L;
                return;
            }
            for (int i10 = 1; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                this.f98195b.put(jSONObject.getString("p"), Integer.valueOf(jSONObject.getInt(ak.aB)));
            }
            ALog.i(this.f98198e, "restoreClients success", "mBindStatus", this.f98195b);
        } catch (Exception e10) {
            ALog.w(this.f98198e, "restoreClients", e10, new Object[0]);
        }
    }

    public static void a(Context context, String str, long j10, Map<String, Integer> map) {
        try {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            JSONArray jSONArray = new JSONArray();
            if (j10 <= 0 || j10 >= System.currentTimeMillis()) {
                jSONArray.put(System.currentTimeMillis() - (Math.random() * 8.64E7d));
            } else {
                jSONArray.put(j10);
            }
            for (String str2 : strArr) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("p", str2);
                jSONObject.put(ak.aB, map.get(str2).intValue());
                jSONArray.put(jSONObject);
            }
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
            editorEdit.putString("bind_status", jSONArray.toString());
            editorEdit.apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(String str) {
        Integer num = this.f98195b.get(str);
        if (num == null || num.intValue() != 2) {
            this.f98195b.put(str, 2);
            a(this.f98194a, this.f98199f, this.f98197d, this.f98195b);
        }
    }

    public void a(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                Set<String> hashSet = this.f98196c.get(str);
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                }
                hashSet.add(str2);
                this.f98196c.put(str, hashSet);
            }
        } catch (Exception e10) {
            ALog.e(this.f98198e, this.f98198e + e10.toString(), new Object[0]);
            e10.printStackTrace();
        }
    }

    public void b(String str) {
        Integer num = this.f98195b.get(str);
        if (num == null || num.intValue() != 4) {
            this.f98195b.put(str, 4);
            a(this.f98194a, this.f98199f, this.f98197d, this.f98195b);
        }
    }

    public boolean b(String str, String str2) {
        Set<String> set;
        try {
            return (TextUtils.isEmpty(str) || (set = this.f98196c.get(str)) == null || !set.contains(str2)) ? false : true;
        } catch (Exception e10) {
            ALog.e(this.f98198e, this.f98198e + e10.toString(), new Object[0]);
            e10.printStackTrace();
        }
    }

    public boolean c(String str) {
        if (this.f98195b.isEmpty()) {
            a();
        }
        Integer num = this.f98195b.get(str);
        ALog.i(this.f98198e, "isAppBinded", "appStatus", num, "mBindStatus", this.f98195b);
        return num != null && num.intValue() == 2;
    }

    public boolean d(String str) {
        Integer num = this.f98195b.get(str);
        return num != null && num.intValue() == 4;
    }

    public void e(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f98196c.remove(str);
        } catch (Exception e10) {
            ALog.e(this.f98198e, this.f98198e + e10.toString(), new Object[0]);
            e10.printStackTrace();
        }
    }
}
