package com.apm.lite.j;

import android.text.TextUtils;
import com.apm.lite.Npth;
import com.apm.lite.k.q;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.tencent.connect.common.Constants;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f40011a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f40012b;

    public enum a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f40017d;

        a(int i10) {
            this.f40017d = i10;
        }
    }

    public enum b {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);


        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final int f40030l;

        b(int i10) {
            this.f40030l = i10;
        }
    }

    public static k a(long j10, String str, byte[] bArr, a aVar, String str2, boolean z10) {
        return b(j10, str, bArr, aVar, str2, z10, false);
    }

    public static k b(long j10, String str, byte[] bArr, a aVar, String str2, boolean z10, boolean z11) throws IOException {
        String str3;
        StringBuilder sb2;
        if (!Npth.isStopUpload() && str != null) {
            if (bArr == null) {
                bArr = new byte[0];
            }
            int length = bArr.length;
            String str4 = null;
            if (a.GZIP == aVar && length > 128) {
                bArr = r(bArr);
                str4 = "gzip";
            } else if (a.DEFLATER == aVar && length > 128) {
                bArr = m(bArr);
                str4 = "deflate";
            }
            String str5 = str4;
            byte[] bArr2 = bArr;
            if (bArr2 == null) {
                return new k(202);
            }
            if (!z10) {
                return f(str, bArr2, str2, str5, "POST", true, false, z11);
            }
            byte[] bArrA = com.apm.lite.k.g.a(bArr2);
            if (bArrA != null) {
                if (TextUtils.isEmpty(new URL(str).getQuery())) {
                    str3 = "?";
                    if (!str.endsWith("?")) {
                        sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(str3);
                        str = sb2.toString();
                    }
                } else {
                    str3 = "&";
                    if (!str.endsWith("&")) {
                        sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(str3);
                        str = sb2.toString();
                    }
                }
                str = str + "tt_data=a";
                str2 = "application/octet-stream;tt-data=a";
                bArr2 = bArrA;
            }
            return f(str, bArr2, str2, str5, "POST", true, true, z11);
        }
        return new k(201);
    }

    public static k c(String str, String str2, boolean z10) {
        return d(str, str2, i(), z10);
    }

    public static k d(String str, String str2, boolean z10, boolean z11) {
        try {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                return b(2097152L, str, str2.getBytes(), a.GZIP, "application/json; charset=utf-8", z10, z11);
            }
            return new k(201);
        } catch (Throwable th2) {
            q.g(th2);
            return new k(207, th2);
        }
    }

    public static k e(String str, String str2, File... fileArr) {
        return n(str, str2, fileArr);
    }

    private static k f(String str, byte[] bArr, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12) {
        return o(str, bArr, str2, str3, str4, z10, z11, z12);
    }

    private static String g(String str, String str2) {
        try {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = str + "?";
                }
            } else if (!str.endsWith("&")) {
                str = str + "&";
            }
            return str + str2;
        } catch (Throwable unused) {
            return str;
        }
    }

    private static String h(String str, Map map) {
        if (TextUtils.isDigitsOnly(str) || map == null || map.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (!str.contains("?")) {
            sb2.append("?");
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    if (!sb2.toString().endsWith("?")) {
                        sb2.append("&");
                    }
                    sb2.append(p(entry.getKey().toString(), "UTF-8"));
                    sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb2.append(p(entry.getValue().toString(), "UTF-8"));
                }
            }
            return sb2.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static boolean i() {
        return TextUtils.equals("sdk", Constants.JumpUrlConstants.SRC_TYPE_APP);
    }

    public static boolean j(String str, String str2, String str3, String str4, List<String> list) {
        if (Npth.isStopUpload()) {
            return false;
        }
        try {
            HashMap map = new HashMap();
            map.put(CommonNetImpl.AID, str2);
            String strL = com.apm.lite.d.l(str2);
            if (!TextUtils.isEmpty(strL)) {
                map.put("x-auth-token", strL);
            }
            i iVar = new i(str, "UTF-8", map, false);
            iVar.c(CommonNetImpl.AID, str2);
            iVar.c("device_id", str3);
            iVar.c("os", "Android");
            iVar.c("process_name", str4);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                File file = new File(it.next());
                if (file.exists()) {
                    HashMap map2 = new HashMap();
                    map2.put("logtype", "alog");
                    map2.put("scene", CrashHianalyticsData.EVENT_ID_CRASH);
                    iVar.b(file.getName(), file, map2);
                }
            }
            try {
                return new JSONObject(iVar.a()).optInt("errno", -1) == 200;
            } catch (JSONException unused) {
            }
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private static byte[] k(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (-1 == i10) {
                inputStream.close();
                try {
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    com.apm.lite.k.k.a(byteArrayOutputStream);
                }
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static byte[] l(String str, Map<String, String> map, byte[] bArr) {
        try {
            return a(2097152L, h(str, map), bArr, a.GZIP, "application/json; charset=utf-8", false).b();
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static byte[] m(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[8192];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        deflater.end();
        return byteArrayOutputStream.toByteArray();
    }

    public static k n(String str, String str2, File... fileArr) {
        if (Npth.isStopUpload()) {
            return new k(201);
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("have_dump=true");
            sb2.append(i() ? "&encrypt=true" : "");
            i iVar = new i(g(str, sb2.toString()), "UTF-8", true);
            iVar.d("json", str2, true);
            iVar.f("file", fileArr);
            try {
                return new k(0, new JSONObject(iVar.a()));
            } catch (JSONException e10) {
                return new k(0, e10);
            }
        } catch (IOException e11) {
            e11.printStackTrace();
            return new k(207);
        }
    }

    private static k o(String str, byte[] bArr, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12) {
        InputStream inputStream;
        byte[] bArrK;
        DataOutputStream dataOutputStream;
        HttpURLConnection httpURLConnection = null;
        GZIPInputStream gZIPInputStream = null;
        try {
            g gVar = f40012b;
            if (gVar != null) {
                try {
                    str = gVar.a(str, bArr);
                } catch (Throwable unused) {
                }
            }
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                com.apm.lite.h.a.a(httpURLConnection2);
                if (z10) {
                    httpURLConnection2.setDoOutput(true);
                } else {
                    httpURLConnection2.setDoOutput(false);
                }
                if (str2 != null) {
                    httpURLConnection2.setRequestProperty("Content-Type", str2);
                }
                if (str3 != null) {
                    httpURLConnection2.setRequestProperty("Content-Encoding", str3);
                }
                httpURLConnection2.setRequestProperty("Accept-Encoding", "gzip");
                if (str4 == null) {
                    throw new IllegalArgumentException("request method is not null");
                }
                if (z12) {
                    String strQ = com.apm.lite.d.q();
                    if (!TextUtils.isEmpty(strQ)) {
                        httpURLConnection2.setRequestProperty(CommonNetImpl.AID, strQ);
                        String strL = com.apm.lite.d.l(strQ);
                        if (!TextUtils.isEmpty(strL)) {
                            httpURLConnection2.setRequestProperty("x-auth-token", strL);
                        }
                    }
                }
                httpURLConnection2.setRequestMethod(str4);
                if (bArr != null && bArr.length > 0) {
                    try {
                        dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
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
                int responseCode = httpURLConnection2.getResponseCode();
                if (responseCode != 200) {
                    k kVar = new k(206, "http response code " + responseCode);
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Exception unused2) {
                    }
                    com.apm.lite.k.k.a(null);
                    return kVar;
                }
                InputStream inputStream2 = httpURLConnection2.getInputStream();
                try {
                    if ("gzip".equalsIgnoreCase(httpURLConnection2.getContentEncoding())) {
                        try {
                            GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream2);
                            try {
                                bArrK = k(gZIPInputStream2);
                                com.apm.lite.k.k.a(gZIPInputStream2);
                            } catch (Throwable th4) {
                                th = th4;
                                gZIPInputStream = gZIPInputStream2;
                                com.apm.lite.k.k.a(gZIPInputStream);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } else {
                        bArrK = k(inputStream2);
                    }
                    k kVarS = s(bArrK);
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Exception unused3) {
                    }
                    com.apm.lite.k.k.a(inputStream2);
                    return kVarS;
                } catch (Throwable th6) {
                    httpURLConnection = httpURLConnection2;
                    inputStream = inputStream2;
                    th = th6;
                    try {
                        q.f(th);
                        return new k(207, th);
                    } finally {
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception unused4) {
                            }
                        }
                        com.apm.lite.k.k.a(inputStream);
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                httpURLConnection = httpURLConnection2;
                inputStream = null;
            }
        } catch (Throwable th8) {
            th = th8;
            inputStream = null;
        }
    }

    private static String p(String str, String str2) {
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static boolean q() {
        return TextUtils.equals("sdk", Constants.JumpUrlConstants.SRC_TYPE_APP);
    }

    private static byte[] r(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            try {
                q.g(th2);
                return null;
            } finally {
                gZIPOutputStream.close();
            }
        }
    }

    private static k s(byte[] bArr) {
        return new k(204, bArr);
    }

    public static String t() {
        return com.apm.lite.e.o().getJavaCrashUploadUrl();
    }

    public static String u() {
        return com.apm.lite.e.o().getAlogUploadUrl();
    }

    public static String v() {
        return com.apm.lite.e.o().getLaunchCrashUploadUrl();
    }

    public static String w() {
        return com.apm.lite.e.o().getNativeCrashUploadUrl();
    }
}
