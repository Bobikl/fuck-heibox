package com.huawei.hms.framework.network.grs.g;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.taobao.accs.common.Constants;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f60813o = "d";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, List<String>> f60814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f60815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f60816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f60817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f60818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f60819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f60820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f60821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f60822i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f60823j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f60824k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f60825l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Exception f60826m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f60827n;

    public d(int i10, Map<String, List<String>> map, byte[] bArr, long j10) {
        this.f60821h = 2;
        this.f60822i = 9001;
        this.f60823j = "";
        this.f60824k = 0L;
        this.f60825l = "";
        this.f60816c = i10;
        this.f60814a = map;
        this.f60815b = ByteBuffer.wrap(bArr).array();
        this.f60817d = j10;
        s();
    }

    public d(Exception exc, long j10) {
        this.f60816c = 0;
        this.f60821h = 2;
        this.f60822i = 9001;
        this.f60823j = "";
        this.f60824k = 0L;
        this.f60825l = "";
        this.f60826m = exc;
        this.f60817d = j10;
    }

    private void a(Map<String, String> map) {
        String str;
        String str2;
        if (map.containsKey("ETag")) {
            String str3 = map.get("ETag");
            if (!TextUtils.isEmpty(str3)) {
                Logger.i(f60813o, "success get Etag from server");
                a(str3);
                return;
            } else {
                str = f60813o;
                str2 = "The Response Heads Etag is Empty";
            }
        } else {
            str = f60813o;
            str2 = "Response Heads has not Etag";
        }
        Logger.i(str, str2);
    }

    private void b(int i10) {
        this.f60822i = i10;
    }

    private void b(Map<String, String> map) {
        long time;
        if (map.containsKey("Cache-Control")) {
            String str = map.get("Cache-Control");
            if (TextUtils.isEmpty(str) || !str.contains("max-age=")) {
                time = 0;
            } else {
                try {
                    time = Long.parseLong(str.substring(str.indexOf("max-age=") + 8));
                    try {
                        Logger.v(f60813o, "Cache-Control value{%s}", Long.valueOf(time));
                    } catch (NumberFormatException e10) {
                        e = e10;
                        Logger.w(f60813o, "getExpireTime addHeadersToResult NumberFormatException", e);
                    }
                } catch (NumberFormatException e11) {
                    e = e11;
                    time = 0;
                }
            }
        } else {
            if (map.containsKey("Expires")) {
                String str2 = map.get("Expires");
                Logger.v(f60813o, "expires is{%s}", str2);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.ROOT);
                String str3 = map.containsKey("Date") ? map.get("Date") : null;
                try {
                    time = (simpleDateFormat.parse(str2).getTime() - (TextUtils.isEmpty(str3) ? new Date() : simpleDateFormat.parse(str3)).getTime()) / 1000;
                } catch (ParseException e12) {
                    Logger.w(f60813o, "getExpireTime ParseException.", e12);
                    time = 0;
                }
            } else {
                Logger.i(f60813o, "response headers neither contains Cache-Control nor Expires.");
            }
            time = 0;
        }
        if (time <= 0 || time > 2592000) {
            time = 86400;
        }
        long j10 = time * 1000;
        Logger.i(f60813o, "convert expireTime{%s}", Long.valueOf(j10));
        c(String.valueOf(j10 + System.currentTimeMillis()));
    }

    private void c(int i10) {
        this.f60821h = i10;
    }

    private void c(long j10) {
        this.f60824k = j10;
    }

    private void c(String str) {
        this.f60823j = str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    private void c(Map<String, String> map) {
        long j10;
        if (map.containsKey(com.google.common.net.c.A0)) {
            String str = map.get(com.google.common.net.c.A0);
            if (TextUtils.isEmpty(str)) {
                j10 = 0;
            } else {
                try {
                    j10 = Long.parseLong(str);
                } catch (NumberFormatException e10) {
                    Logger.w(f60813o, "getRetryAfter addHeadersToResult NumberFormatException", e10);
                    j10 = 0;
                }
            }
        } else {
            j10 = 0;
        }
        long j11 = j10 * 1000;
        Logger.v(f60813o, "convert retry-afterTime{%s}", Long.valueOf(j11));
        c(j11);
    }

    private void d(String str) {
    }

    private void e(String str) {
    }

    private void f(String str) {
        this.f60820g = str;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    private void p() {
        if (m()) {
            Logger.i(f60813o, "GRSSDK get httpcode{304} not any changed.");
            c(1);
            return;
        }
        if (!o()) {
            Logger.i(f60813o, "GRSSDK parse server body all failed.");
            c(2);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(StringUtils.byte2Str(this.f60815b));
            int i10 = -1;
            if (jSONObject.has("isSuccess")) {
                if (jSONObject.getInt("isSuccess") == 1) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
            } else if (!jSONObject.has(com.taobao.agoo.a.a.b.JSON_ERRORCODE)) {
                Logger.e(f60813o, "sth. wrong because server errorcode's key.");
            } else if (jSONObject.getInt(com.taobao.agoo.a.a.b.JSON_ERRORCODE) == 0) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            if (i10 != 1 && jSONObject.has("services")) {
                i10 = 0;
            }
            c(i10);
            if (i10 == 1 || i10 == 0) {
                f(jSONObject.has("services") ? jSONObject.getJSONObject("services").toString() : "");
                e(jSONObject.has("errorList") ? jSONObject.getJSONObject("errorList").toString() : "");
            } else {
                b(jSONObject.has(Constants.KEY_ERROR_CODE) ? jSONObject.getInt(Constants.KEY_ERROR_CODE) : 9001);
                d(jSONObject.has("errorDesc") ? jSONObject.getString("errorDesc") : "");
            }
        } catch (JSONException e10) {
            Logger.w(f60813o, "GrsResponse GrsResponse(String result) JSONException: %s", StringUtils.anonymizeMessage(e10.getMessage()));
            c(2);
        }
    }

    private void q() {
        if (o() || n() || m()) {
            Map<String, String> mapR = r();
            if (mapR.size() <= 0) {
                Logger.w(f60813o, "parseHeader {headers.size() <= 0}");
                return;
            }
            try {
                if (o() || m()) {
                    b(mapR);
                    a(mapR);
                }
                if (n()) {
                    c(mapR);
                }
            } catch (JSONException e10) {
                Logger.w(f60813o, "parseHeader catch JSONException: %s", StringUtils.anonymizeMessage(e10.getMessage()));
            }
        }
    }

    private Map<String, String> r() {
        HashMap map = new HashMap(16);
        Map<String, List<String>> map2 = this.f60814a;
        if (map2 == null || map2.size() <= 0) {
            Logger.v(f60813o, "parseRespHeaders {respHeaders == null} or {respHeaders.size() <= 0}");
            return map;
        }
        for (Map.Entry<String, List<String>> entry : this.f60814a.entrySet()) {
            String key = entry.getKey();
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                map.put(key, it.next());
            }
        }
        return map;
    }

    private void s() {
        q();
        p();
    }

    public String a() {
        return this.f60823j;
    }

    public void a(int i10) {
    }

    public void a(long j10) {
        this.f60819f = j10;
    }

    public void a(String str) {
        this.f60825l = str;
    }

    public int b() {
        return this.f60816c;
    }

    public void b(long j10) {
        this.f60818e = j10;
    }

    public void b(String str) {
        this.f60827n = str;
    }

    public int c() {
        return this.f60822i;
    }

    public Exception d() {
        return this.f60826m;
    }

    public String e() {
        return this.f60825l;
    }

    public int f() {
        return this.f60821h;
    }

    public long g() {
        return this.f60819f;
    }

    public long h() {
        return this.f60818e;
    }

    public long i() {
        return this.f60817d;
    }

    public String j() {
        return this.f60820g;
    }

    public long k() {
        return this.f60824k;
    }

    public String l() {
        return this.f60827n;
    }

    public boolean m() {
        return this.f60816c == 304;
    }

    public boolean n() {
        return this.f60816c == 503;
    }

    public boolean o() {
        return this.f60816c == 200;
    }
}
