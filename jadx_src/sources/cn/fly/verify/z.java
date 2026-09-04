package cn.fly.verify;

import android.text.TextUtils;
import com.tencent.qcloud.core.http.HttpConstants;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f37037b;

    private HashMap<String, Object> a(x xVar) {
        int i10;
        HashMap<String, String> mapN;
        OutputStream outputStream;
        String string;
        List<String> list;
        HashMap<String, String> mapO;
        z zVar = this;
        x xVar2 = xVar;
        String str = "resultcode";
        try {
            String strD = xVar.d();
            URL url = new URL(strD);
            f.a().a("CMCCSDK " + strD);
            HttpURLConnection httpURLConnection = (HttpURLConnection) (xVar.c() != null ? xVar.c().openConnection(url) : url.openConnection());
            int i11 = zVar.f37036a;
            if (i11 == 0 || i11 == 2) {
                mapN = xVar.n();
            } else if (i11 == 1 || i11 == 3) {
                mapN = xVar.o();
            } else {
                mapN = (i11 == 4 || i11 == 5) ? xVar.p() : null;
            }
            if (mapN != null) {
                for (String str2 : mapN.keySet()) {
                    httpURLConnection.addRequestProperty(str2, mapN.get(str2));
                }
            }
            if ((httpURLConnection instanceof HttpsURLConnection) && strD.contains("rcs.cmpassport.com")) {
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(zVar.a(zVar.f37036a));
            }
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.setDefaultUseCaches(false);
            String strB = xVar.b();
            httpURLConnection.setRequestMethod(strB);
            httpURLConnection.setDoOutput(true);
            if (zVar.f37036a == 0) {
                httpURLConnection.connect();
                xVar2.e(zVar.f37037b.a());
            }
            if (strB.endsWith("POST")) {
                outputStream = httpURLConnection.getOutputStream();
                int i12 = zVar.f37036a;
                if (i12 == 0) {
                    outputStream.write(xVar.f().getBytes("utf-8"));
                } else if (i12 == 1) {
                    outputStream.write(xVar.e().getBytes("utf-8"));
                } else if (i12 == 2) {
                    outputStream.write(xVar.g().getBytes("utf-8"));
                } else if (i12 == 3) {
                    outputStream.write(xVar.h().getBytes("utf-8"));
                } else if (i12 == 4) {
                    outputStream.write(xVar.j().getBytes("utf-8"));
                } else if (i12 == 5) {
                    outputStream.write(xVar.k().getBytes("utf-8"));
                }
                outputStream.flush();
            } else {
                outputStream = null;
            }
            int responseCode = httpURLConnection.getResponseCode();
            InputStream inputStream = httpURLConnection.getInputStream();
            StringBuilder sb2 = new StringBuilder();
            byte[] bArr = new byte[2048];
            String str3 = "utf-8";
            while (true) {
                int i13 = inputStream.read(bArr);
                byte[] bArr2 = bArr;
                if (i13 == -1) {
                    break;
                }
                try {
                    i10 = 102102;
                    String str4 = str;
                    String str5 = str3;
                    sb2.append(new String(bArr2, 0, i13, str5));
                    zVar = this;
                    bArr = bArr2;
                    str3 = str5;
                    str = str4;
                    xVar2 = xVar;
                } catch (Throwable th2) {
                    th = th2;
                    f.a().a(th);
                    HashMap<String, Object> map = new HashMap<>();
                    map.put("error", as.a(th));
                    map.put("code", Integer.valueOf(th instanceof EOFException ? 200050 : i10));
                    return map;
                }
            }
            u uVar = new u(responseCode, httpURLConnection.getHeaderFields(), sb2.toString());
            f.a().a("CMCCSDK " + responseCode + " " + uVar);
            if (outputStream != null) {
                outputStream.close();
            }
            inputStream.close();
            httpURLConnection.disconnect();
            if (responseCode != 200) {
                if (responseCode == 301 || responseCode == 302) {
                }
                HashMap<String, Object> map2 = new HashMap<>();
                map2.put("error", "responseCode is " + responseCode);
                map2.put("code", 102102);
                return map2;
            }
            JSONObject jSONObject = new JSONObject(uVar.b());
            try {
                if (!jSONObject.has(str)) {
                    str = com.taobao.agoo.a.a.b.JSON_ERRORCODE;
                }
                string = jSONObject.getString(str);
            } catch (Throwable unused) {
                string = null;
            }
            if (string != null) {
                return zVar.a(xVar2, string, jSONObject);
            }
            if (responseCode == 200) {
                xVar2.b("POST");
                int i14 = zVar.f37036a;
                if (i14 != 2) {
                    if (i14 == 3) {
                        mapO = xVar.o();
                    }
                    xVar2.g(uVar.b());
                    xVar2.c(xVar.q());
                    xVar2.h(null);
                    return a(xVar);
                }
                mapO = xVar.n();
                mapO.put("Content-Type", HttpConstants.ContentType.JSON);
                xVar2.g(uVar.b());
                xVar2.c(xVar.q());
                xVar2.h(null);
                return a(xVar);
            }
            Map<String, List<String>> mapA = uVar.a();
            if (mapA.containsKey("pplocation") && (list = mapA.get("pplocation")) != null && list.size() > 0) {
                xVar2.h(list.get(0));
            }
            if (mapA.containsKey("Location")) {
                List<String> list2 = mapA.get("Location");
                if (list2 == null || list2.isEmpty()) {
                    list2 = mapA.get("Location".toLowerCase());
                }
                if (list2 != null && list2.size() > 0) {
                    xVar2.c(list2.get(0));
                }
            }
            xVar2.b("GET");
            int i15 = zVar.f37036a;
            if (i15 == 0 || i15 == 2) {
                xVar.n().put("Content-Type", "application/x-www-form-urlencoded");
                return zVar.a(xVar2, 2);
            }
            if (i15 == 1) {
                xVar.o().put("Content-Type", "application/x-www-form-urlencoded");
                return zVar.a(xVar2, 3);
            }
            HashMap<String, Object> map3 = new HashMap<>();
            map3.put("error", "responseCode is " + responseCode);
            map3.put("code", 102102);
            return map3;
        } catch (Throwable th3) {
            th = th3;
            i10 = 102102;
        }
    }

    private HashMap<String, Object> a(String str) {
        return null;
    }

    private HashMap<String, Object> b(String str) {
        Long lValueOf;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("phonescrip");
            String strOptString2 = jSONObject.optString("securityphone");
            String strOptString3 = jSONObject.optString("scripExpiresIn");
            HashMap<String, Object> map = new HashMap<>();
            map.put("optoken", strOptString);
            map.put(g0.a.f118921e, strOptString2);
            if (as.b().equals("CMCC")) {
                lValueOf = Long.valueOf(System.currentTimeMillis() + 3600000);
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis() + 600000;
                if (strOptString3 != null) {
                    try {
                        jCurrentTimeMillis = (((long) Integer.parseInt(strOptString3)) * 1000) + System.currentTimeMillis();
                    } catch (Throwable unused) {
                    }
                }
                lValueOf = Long.valueOf(jCurrentTimeMillis);
            }
            map.put("expired", lValueOf);
            return map;
        } catch (JSONException e10) {
            f.a().a(e10);
            HashMap<String, Object> map2 = new HashMap<>();
            map2.put("error", as.a(e10));
            return map2;
        }
    }

    private HashMap<String, Object> c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("securityphone");
            String strOptString2 = jSONObject.optString("token");
            int iOptInt = jSONObject.optInt("tokenExpiresIn");
            HashMap<String, Object> map = new HashMap<>();
            map.put("optoken", strOptString2);
            map.put(g0.a.f118921e, strOptString);
            map.put("expired", Long.valueOf(System.currentTimeMillis() + (((long) iOptInt) * 1000)));
            return map;
        } catch (JSONException e10) {
            f.a().a(e10);
            HashMap<String, Object> map2 = new HashMap<>();
            map2.put("error", as.a(e10));
            return map2;
        }
    }

    private HashMap<String, Object> d(String str) {
        return null;
    }

    public HashMap<String, Object> a(x xVar, int i10) {
        this.f37036a = i10;
        return a(xVar);
    }

    public HashMap<String, Object> a(x xVar, String str, JSONObject jSONObject) {
        String strB;
        if ("103000".equals(str)) {
            String strOptString = jSONObject.optString("resultdata");
            if (TextUtils.isEmpty(strOptString)) {
                strB = jSONObject.toString();
            } else if (xVar != null) {
                strB = w.b(xVar.l(), strOptString, xVar.m());
            } else {
                strB = null;
                str = "200025";
            }
            int i10 = this.f37036a;
            if (i10 == 0 || i10 == 2) {
                return b(strB);
            }
            if (i10 == 1 || i10 == 3) {
                return c(strB);
            }
            if (i10 == 4) {
                return d(strB);
            }
            if (i10 == 5) {
                return a(strB);
            }
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("error", jSONObject != null ? jSONObject.toString() : "");
        try {
            map.put("code", Integer.valueOf(Integer.parseInt(str)));
        } catch (Throwable unused) {
        }
        return map;
    }

    public synchronized SSLSocketFactory a(int i10) {
        v vVar;
        try {
            if (i10 == 0) {
                vVar = new v(HttpsURLConnection.getDefaultSSLSocketFactory());
                if (this.f37037b == null) {
                    this.f37037b = vVar;
                }
            } else {
                if (this.f37037b == null) {
                    this.f37037b = new v(HttpsURLConnection.getDefaultSSLSocketFactory());
                }
                vVar = this.f37037b;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return vVar;
    }
}
