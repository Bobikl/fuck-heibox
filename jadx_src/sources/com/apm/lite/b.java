package com.apm.lite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.apm.lite.j.k;
import com.apm.lite.k.q;
import com.max.hbutils.utils.w;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.zip.GZIPOutputStream;
import org.apache.tools.ant.types.selectors.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    MonitorCrash.Config f39832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Map<String, String> f39833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile JSONObject f39834c;

    private static k a(String str, byte[] bArr, String str2, String str3) {
        HttpURLConnection httpURLConnection;
        DataOutputStream dataOutputStream;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                com.apm.lite.h.a.a(httpURLConnection);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                if (!TextUtils.isEmpty(str3)) {
                    httpURLConnection.setRequestProperty(CommonNetImpl.AID, str2);
                    httpURLConnection.setRequestProperty("x-auth-token", str3);
                }
                httpURLConnection.setRequestMethod("POST");
                if (bArr != null && bArr.length > 0) {
                    try {
                        dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                        try {
                            dataOutputStream.write(bArr);
                            dataOutputStream.flush();
                            com.apm.lite.k.k.a(dataOutputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            com.apm.lite.k.k.a(dataOutputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        dataOutputStream = null;
                    }
                }
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    k kVar = new k(responseCode, "http response code " + responseCode);
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception unused) {
                    }
                    com.apm.lite.k.k.a(null);
                    return kVar;
                }
                k kVar2 = new k(206, "http response code " + responseCode);
                try {
                    httpURLConnection.disconnect();
                } catch (Exception unused2) {
                }
                com.apm.lite.k.k.a(null);
                return kVar2;
            } catch (Throwable th4) {
                th = th4;
                try {
                    q.f(th);
                    return new k(207, th);
                } finally {
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception unused3) {
                        }
                    }
                    com.apm.lite.k.k.a(null);
                }
            }
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
        }
    }

    private JSONObject c(HashMap<String, String> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("magic_tag", "ss_app_log");
        if (this.f39834c == null) {
            Context contextM = e.m();
            try {
                this.f39834c = new JSONObject();
                if (this.f39833b != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, String> entry : this.f39833b.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                    this.f39834c.put("custom", jSONObject2);
                }
                this.f39834c.put("os", "Android");
                this.f39834c.put("platform", "Android");
                this.f39834c.put("os_version", com.apm.lite.d.c.k());
                this.f39834c.put("os_api", Build.VERSION.SDK_INT);
                this.f39834c.put("sdk_version", this.f39832a.f39811d);
                this.f39834c.put("sdk_version_code", this.f39832a.f39811d);
                this.f39834c.put("sdk_version_name", this.f39832a.f39812e);
                this.f39834c.put(CommonNetImpl.AID, this.f39832a.f39808a);
                String str = Build.MODEL;
                String str2 = Build.BRAND;
                if (str == null) {
                    str = str2;
                } else if (str2 != null && !str.contains(str2)) {
                    str = str2 + ' ' + str;
                }
                this.f39834c.put("device_model", str);
                this.f39834c.put(ak.F, str2);
                this.f39834c.put(ak.H, Build.MANUFACTURER);
                this.f39834c.put("channel", this.f39832a.f39810c);
                this.f39834c.put("app_version", this.f39832a.f39812e);
                this.f39834c.put("version_code", this.f39832a.f39811d);
                this.f39834c.put("update_version_code", this.f39832a.f39811d);
                this.f39834c.put("manifest_version_code", this.f39832a.f39811d);
                this.f39834c.put("bd_did", this.f39832a.getDeviceId());
                String packageName = contextM.getPackageName();
                this.f39834c.put("package", packageName);
                PackageInfo packageInfo = contextM.getPackageManager().getPackageInfo(packageName, 0);
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null) {
                    int i10 = applicationInfo.labelRes;
                    if (i10 > 0) {
                        this.f39834c.put("display_name", contextM.getString(i10));
                    } else {
                        this.f39834c.put("display_name", contextM.getPackageManager().getApplicationLabel(packageInfo.applicationInfo));
                    }
                }
            } catch (Exception unused) {
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        jSONObject.put("header", this.f39834c);
        jSONObject.put("local_time", jCurrentTimeMillis);
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject3 = new JSONObject();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        jSONObject3.put("local_time_ms", jCurrentTimeMillis2);
        jSONObject3.put("tea_event_index", 10001);
        jSONObject3.put("session_id", UUID.randomUUID().toString());
        jSONObject3.put(m.f136542q, new SimpleDateFormat(w.f73604k, Locale.US).format(new Date(jCurrentTimeMillis2)));
        if (map != null) {
            JSONObject jSONObject4 = new JSONObject();
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                jSONObject4.put(entry2.getKey(), entry2.getValue());
            }
            jSONObject3.put("pv_filters", jSONObject4);
        }
        jSONArray.put(jSONObject3);
        jSONObject.put("launch", jSONArray);
        return jSONObject;
    }

    public String b() {
        return null;
    }

    public void d(Context context, MonitorCrash.Config config, Map<String, String> map) {
        if (config == null) {
            return;
        }
        this.f39832a = config;
        this.f39833b = map;
    }

    public void e(String str) {
    }

    public void f(HashMap<String, String> map, IUploadCallback iUploadCallback) {
        MonitorCrash.Config config = this.f39832a;
        if (config == null && !TextUtils.isEmpty(config.getDeviceId())) {
            if (iUploadCallback != null) {
                iUploadCallback.afterUpload(false);
                return;
            }
            return;
        }
        try {
            JSONObject jSONObjectC = c(map);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = null;
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(jSONObjectC.toString().getBytes("UTF-8"));
                    com.apm.lite.k.k.a(gZIPOutputStream2);
                } catch (Throwable unused) {
                    gZIPOutputStream = gZIPOutputStream2;
                    com.apm.lite.k.k.a(gZIPOutputStream);
                }
            } catch (Throwable unused2) {
            }
            com.apm.lite.k.k.a(byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            String str = e.o().getPageViewUrl() + "?version_code=" + this.f39832a.f39811d + "&device_platform=android&aid=" + this.f39832a.f39808a + "&iid=iid";
            MonitorCrash.Config config2 = this.f39832a;
            k kVarA = a(str, byteArray, config2.f39808a, config2.f39809b);
            if (iUploadCallback != null) {
                iUploadCallback.afterUpload(kVarA.a());
            }
        } catch (Throwable unused3) {
        }
    }

    public void g(String str) {
    }
}
