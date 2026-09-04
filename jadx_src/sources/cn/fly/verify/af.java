package cn.fly.verify;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.text.TextUtils;
import android.webkit.WebSettings;
import anet.channel.strategy.dispatch.DispatchConstants;
import cn.fly.verify.common.exception.VerifyException;
import com.taobao.accs.common.Constants;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, Object> f35702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, Object> f35703b;

    public af(HashMap<String, Object> map, HashMap<String, Object> map2) {
        this.f35702a = map;
        this.f35703b = map2;
    }

    private HashMap<String, Object> a(Network network, String str, HttpURLConnection httpURLConnection) {
        HashMap<String, Object> map = new HashMap<>();
        if (httpURLConnection != null) {
            try {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Charset", "UTF-8");
                httpURLConnection.setRequestProperty(com.alipay.zoloz.android.phone.mrpc.core.f.f39665q, "keep-alive");
                if ("POST".equals(str) && this.f35702a != null) {
                    httpURLConnection.setRequestMethod(str);
                    httpURLConnection.connect();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byteArrayOutputStream.write(ag.a(this.f35702a).getBytes("utf-8"));
                    httpURLConnection.getOutputStream().write(byteArrayOutputStream.toByteArray());
                }
            } catch (Throwable th2) {
                map.put("code", 1);
                map.put(Constants.SEND_TYPE_RES, th2.getMessage());
                return map;
            }
        }
        return b(network, str, httpURLConnection);
    }

    private String b(Context context) {
        String defaultUserAgent;
        try {
            defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        } catch (Exception unused) {
            defaultUserAgent = null;
        }
        StringBuilder sb2 = new StringBuilder();
        int length = defaultUserAgent.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = defaultUserAgent.charAt(i10);
            if (cCharAt <= 31 || cCharAt >= 127) {
                sb2.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
            } else {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    private HashMap<String, Object> b(Network network, String str, HttpURLConnection httpURLConnection) {
        HashMap<String, Object> map = new HashMap<>();
        int responseCode = -1;
        if (httpURLConnection != null) {
            try {
                responseCode = httpURLConnection.getResponseCode();
            } catch (Throwable unused) {
                Throwable th2 = new Throwable("CU_HTTP_REQUEST_FAILED");
                map.put("code", 1);
                map.put(Constants.SEND_TYPE_RES, th2.getMessage());
                return map;
            }
        }
        if (responseCode == 200) {
            String strA = a(httpURLConnection, "UTF-8");
            map.put("code", 0);
            map.put(Constants.SEND_TYPE_RES, strA);
            return map;
        }
        if (responseCode != 301 && responseCode != 302) {
            Throwable th3 = new Throwable("CU_SERVER_RESPONSE_CODE");
            map.put("code", 1);
            map.put(Constants.SEND_TYPE_RES, th3.getMessage());
            return map;
        }
        String headerField = httpURLConnection.getHeaderField("Location");
        String headerField2 = httpURLConnection.getHeaderField("Set-Cookie");
        String path = httpURLConnection.getURL().getPath();
        if (TextUtils.isEmpty(headerField)) {
            Throwable th4 = new Throwable("CU_NO_REDIRECT_ADDRESS_CODE");
            map.put("code", 1);
            map.put(Constants.SEND_TYPE_RES, th4.getMessage());
            return map;
        }
        HttpURLConnection httpURLConnectionA = a(network, headerField);
        if (TextUtils.isEmpty(headerField2)) {
            httpURLConnectionA.setRequestProperty("Cookie", "");
        } else {
            "/ctcnet/gctcmc.do".equals(path);
            httpURLConnectionA.setRequestProperty("Cookie", headerField2);
        }
        return a(network, "GET", httpURLConnectionA);
    }

    public String a(Context context) {
        String strB;
        if (context != null) {
            try {
                strB = b(context);
            } catch (Throwable unused) {
                strB = null;
            }
        } else {
            strB = null;
        }
        return TextUtils.isEmpty(strB) ? "Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 %sSafari/533.1" : strB;
    }

    public String a(HttpURLConnection httpURLConnection, String str) {
        StringBuilder sb2;
        if (httpURLConnection != null) {
            try {
                sb2 = new StringBuilder();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), str));
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line);
                        sb2.append('\n');
                    }
                } catch (UnsupportedEncodingException | IOException unused) {
                }
            } catch (UnsupportedEncodingException | IOException unused2) {
                sb2 = null;
            }
        } else {
            sb2 = null;
        }
        if (sb2 == null) {
            return null;
        }
        return sb2.toString().trim();
    }

    @SuppressLint({"DefaultLocale"})
    public HttpURLConnection a(Network network, String str) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            throw new Throwable("CU_HTTP_URL_EMPTY");
        }
        URL url = new URL(str);
        String strJ = al.j();
        URLConnection uRLConnectionOpenConnection = network != null ? (HttpURLConnection) network.openConnection(url) : null;
        if (uRLConnectionOpenConnection == null) {
            uRLConnectionOpenConnection = url.openConnection();
        } else if (strJ.equalsIgnoreCase("WIFI")) {
            strJ = "2";
        }
        if (uRLConnectionOpenConnection == null) {
            throw new Throwable("CU_HTTP_CHANNEL_OPEN_FAILED");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty("user-agent", a(ax.g()));
        httpURLConnection.setRequestProperty(DispatchConstants.NET_TYPE, String.valueOf(strJ));
        httpURLConnection.setRequestProperty("os", "android");
        HashMap<String, Object> map = this.f35703b;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, Object> entry : this.f35703b.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), (String) entry.getValue());
            }
        }
        return httpURLConnection;
    }

    public void a(Network network, String str, cn.fly.verify.common.callback.b bVar, String str2) {
        try {
            HashMap<String, Object> mapA = a(network, "POST", a(network, str));
            int iIntValue = -1;
            if (mapA != null && mapA.containsKey("code")) {
                iIntValue = ((Integer) mapA.get("code")).intValue();
            }
            String str3 = null;
            if (mapA != null && mapA.containsKey(Constants.SEND_TYPE_RES)) {
                str3 = (String) mapA.get(Constants.SEND_TYPE_RES);
            }
            if (iIntValue != 0 || str3 == null) {
                bVar.a(new VerifyException(302002, str3));
                return;
            }
            try {
                int iOptInt = new JSONObject(str3).optInt("code");
                if (iOptInt != 0) {
                    bVar.a(new VerifyException(iOptInt, str3));
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(ag.a(new JSONObject(str3).optString("obj"), str2));
                    String strOptString = jSONObject.optString("accessCode");
                    String strOptString2 = jSONObject.optString("fakeMobile");
                    long jOptLong = jSONObject.optLong("exp");
                    HashMap map = new HashMap();
                    map.put("optoken", strOptString);
                    map.put("expired", Long.valueOf(jOptLong));
                    map.put(g0.a.f118921e, strOptString2);
                    bVar.a(map);
                } catch (Throwable th2) {
                    bVar.a(new VerifyException(302001, as.a(th2)));
                }
            } catch (Throwable th3) {
                bVar.a(new VerifyException(302003, as.a(th3)));
            }
        } catch (Throwable th4) {
            bVar.a(new VerifyException(302002, as.a(th4)));
        }
    }
}
