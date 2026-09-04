package com.xiaomi.push;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference<a<bj>> f106867a = new AtomicReference<>(a());

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static final Pattern f212a = Pattern.compile("([^\\s;]+)(.*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f106868b = Pattern.compile("(.*?charset\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f106869c = Pattern.compile("(\\<\\?xml\\s+.*?encoding\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    public static class a<T> extends FutureTask<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f106870a;

        public a(Callable<T> callable) {
            super(callable);
        }

        public boolean a() {
            return j.m521a(C1339r.m655a()) || (isDone() && Math.abs(SystemClock.elapsedRealtime() - this.f106870a) > 1800000);
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            this.f106870a = SystemClock.elapsedRealtime();
            super.run();
        }
    }

    public static final class b extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f106871a;

        public b(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int i12;
            if (!this.f106871a && (i12 = super.read(bArr, i10, i11)) != -1) {
                return i12;
            }
            this.f106871a = true;
            return -1;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f106872a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public Map<String, String> f213a;

        public String toString() {
            return String.format("resCode = %1$d, headers = %2$s", Integer.valueOf(this.f106872a), this.f213a.toString());
        }
    }

    public static int a(Context context) {
        bj bjVarM172a = m172a();
        if (bjVarM172a == null) {
            return -1;
        }
        return bjVarM172a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static be a(Context context, String str, String str2, Map<String, String> map, String str3) {
        boolean zEqualsIgnoreCase;
        BufferedReader bufferedReader;
        be beVar = new be();
        try {
            try {
                try {
                    HttpURLConnection httpURLConnectionM176a = m176a(context, m177a(str));
                    httpURLConnectionM176a.setConnectTimeout(10000);
                    httpURLConnectionM176a.setReadTimeout(15000);
                    String str4 = str2;
                    if (str2 == 0) {
                        str4 = "GET";
                    }
                    httpURLConnectionM176a.setRequestMethod(str4);
                    int i10 = 0;
                    if (map != null) {
                        zEqualsIgnoreCase = "gzip".equalsIgnoreCase(map.get("Content-Encoding"));
                        for (String str5 : map.keySet()) {
                            httpURLConnectionM176a.setRequestProperty(str5, map.get(str5));
                        }
                    } else {
                        zEqualsIgnoreCase = false;
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        httpURLConnectionM176a.setDoOutput(true);
                        byte[] bytes = str3.getBytes();
                        OutputStream gZIPOutputStream = zEqualsIgnoreCase ? new GZIPOutputStream(httpURLConnectionM176a.getOutputStream()) : httpURLConnectionM176a.getOutputStream();
                        try {
                            gZIPOutputStream.write(bytes, 0, bytes.length);
                            gZIPOutputStream.flush();
                            gZIPOutputStream.close();
                        } catch (IOException e10) {
                            e = e10;
                        } catch (Throwable th2) {
                            th = th2;
                            throw new IOException(th.getMessage());
                        }
                    }
                    beVar.f106866a = httpURLConnectionM176a.getResponseCode();
                    com.xiaomi.channel.commonutils.logger.b.m62a("Http POST Response Code: " + beVar.f106866a);
                    while (true) {
                        String headerFieldKey = httpURLConnectionM176a.getHeaderFieldKey(i10);
                        String headerField = httpURLConnectionM176a.getHeaderField(i10);
                        if (headerFieldKey == null && headerField == null) {
                            try {
                                break;
                            } catch (IOException unused) {
                                bufferedReader = new BufferedReader(new InputStreamReader(new b(httpURLConnectionM176a.getErrorStream())));
                            }
                        } else {
                            beVar.f211a.put(headerFieldKey, headerField);
                            i10 = i10 + 1 + 1;
                        }
                        throw new IOException("err while request " + str + ":" + e.getClass().getSimpleName());
                    }
                    bufferedReader = new BufferedReader(new InputStreamReader(new b(httpURLConnectionM176a.getInputStream())));
                    try {
                        StringBuffer stringBuffer = new StringBuffer();
                        String property = System.getProperty("line.separator");
                        for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                            stringBuffer.append(line);
                            stringBuffer.append(property);
                        }
                        beVar.f210a = stringBuffer.toString();
                        bufferedReader.close();
                        x.a((Closeable) null);
                        x.a((Closeable) null);
                        return beVar;
                    } catch (IOException e11) {
                        e = e11;
                    } catch (Throwable th3) {
                        th = th3;
                        throw new IOException(th.getMessage());
                    }
                } catch (IOException e12) {
                    e = e12;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            x.a((Closeable) null);
            x.a((Closeable) str2);
            throw th5;
        }
    }

    public static be a(Context context, String str, Map<String, String> map) {
        return a(context, str, "POST", (Map<String, String>) null, a(map));
    }

    private static a<bj> a() {
        return new a<>(new bi());
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static bj m172a() {
        AtomicReference<a<bj>> atomicReference = f106867a;
        a<bj> aVarA = atomicReference.get();
        if (aVarA != null) {
            try {
                if (aVarA.a()) {
                    aVarA = a();
                    atomicReference.set(aVarA);
                }
                if (!aVarA.isDone()) {
                    aVarA.run();
                }
                return aVarA.get();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static bj m173a(Context context) {
        return m172a();
    }

    public static InputStream a(Context context, URL url, boolean z10, String str, String str2) {
        return a(context, url, z10, str, str2, null, null);
    }

    public static InputStream a(Context context, URL url, boolean z10, String str, String str2, Map<String, String> map, c cVar) throws IOException {
        if (context == null) {
            throw new IllegalArgumentException(com.umeng.analytics.pro.d.R);
        }
        if (url == null) {
            throw new IllegalArgumentException("url");
        }
        URL url2 = !z10 ? new URL(a(url.toString())) : url;
        try {
            HttpURLConnection.setFollowRedirects(true);
            HttpURLConnection httpURLConnectionM176a = m176a(context, url2);
            httpURLConnectionM176a.setConnectTimeout(10000);
            httpURLConnectionM176a.setReadTimeout(15000);
            if (!TextUtils.isEmpty(str)) {
                httpURLConnectionM176a.setRequestProperty("User-Agent", str);
            }
            if (str2 != null) {
                httpURLConnectionM176a.setRequestProperty("Cookie", str2);
            }
            if (map != null) {
                for (String str3 : map.keySet()) {
                    httpURLConnectionM176a.setRequestProperty(str3, map.get(str3));
                }
            }
            if (cVar != null && (url.getProtocol().equals("http") || url.getProtocol().equals("https"))) {
                cVar.f106872a = httpURLConnectionM176a.getResponseCode();
                if (cVar.f213a == null) {
                    cVar.f213a = new HashMap();
                }
                int i10 = 0;
                while (true) {
                    String headerFieldKey = httpURLConnectionM176a.getHeaderFieldKey(i10);
                    String headerField = httpURLConnectionM176a.getHeaderField(i10);
                    if (headerFieldKey == null && headerField == null) {
                        break;
                    }
                    if (!TextUtils.isEmpty(headerFieldKey) && !TextUtils.isEmpty(headerField)) {
                        cVar.f213a.put(headerFieldKey, headerField);
                    }
                    i10++;
                }
            }
            return new b(httpURLConnectionM176a.getInputStream());
        } catch (IOException e10) {
            throw new IOException("IOException:" + e10.getClass().getSimpleName());
        } catch (Throwable th2) {
            throw new IOException(th2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static Object m174a(Context context) {
        if (context == null) {
            context = C1339r.m655a();
        }
        if (context == null || j.m521a(context)) {
            return null;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().build();
            bh bhVar = new bh();
            try {
                connectivityManager.registerNetworkCallback(networkRequestBuild, bhVar);
            } catch (Exception unused) {
            }
            return bhVar;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static String m175a(Context context) {
        if (e(context)) {
            return "wifi";
        }
        bj bjVarM172a = m172a();
        if (bjVarM172a == null) {
            return "";
        }
        return (bjVarM172a.m182a() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + bjVarM172a.m184b() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + bjVarM172a.c()).toLowerCase();
    }

    public static String a(Context context, URL url) {
        return a(context, url, false, null, "UTF-8", null);
    }

    public static String a(Context context, URL url, boolean z10, String str, String str2, String str3) throws Throwable {
        InputStream inputStreamA;
        try {
            inputStreamA = a(context, url, z10, str, str3);
            try {
                StringBuilder sb2 = new StringBuilder(1024);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamA, str2));
                char[] cArr = new char[4096];
                while (true) {
                    int i10 = bufferedReader.read(cArr);
                    if (-1 == i10) {
                        x.a((Closeable) inputStreamA);
                        return sb2.toString();
                    }
                    sb2.append(cArr, 0, i10);
                }
            } catch (Throwable th2) {
                th = th2;
                x.a((Closeable) inputStreamA);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamA = null;
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new String();
        return String.format("%s&key=%s", str, bo.a(String.format("%sbe988a6134bc8254465424e5a70ef037", str)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(String str, Map<String, String> map, File file, String str2) {
        if (!file.exists()) {
            return null;
        }
        String name = file.getName();
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Connection", com.google.common.net.c.f58866u0);
                httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=*****");
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnection.setFixedLengthStreamingMode(name.length() + 77 + ((int) file.length()) + str2.length());
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.writeBytes("--*****\r\n");
                dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + str2 + "\";filename=\"" + file.getName() + "\"\r\n");
                dataOutputStream.writeBytes("\r\n");
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i10 = fileInputStream.read(bArr);
                        if (i10 == -1) {
                            break;
                        }
                        dataOutputStream.write(bArr, 0, i10);
                        dataOutputStream.flush();
                        throw new IOException("IOException:" + e.getClass().getSimpleName());
                    }
                    dataOutputStream.writeBytes("\r\n");
                    dataOutputStream.writeBytes("--");
                    dataOutputStream.writeBytes("*****");
                    dataOutputStream.writeBytes("--");
                    dataOutputStream.writeBytes("\r\n");
                    dataOutputStream.flush();
                    StringBuffer stringBuffer = new StringBuffer();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new b(httpURLConnection.getInputStream())));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                String string = stringBuffer.toString();
                                x.a((Closeable) fileInputStream);
                                x.a(bufferedReader);
                                return string;
                            }
                            stringBuffer.append(line);
                        } catch (IOException e10) {
                            e = e10;
                        } catch (Throwable th2) {
                            th = th2;
                            throw new IOException(th.getMessage());
                        }
                    }
                } catch (IOException e11) {
                    e = e11;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                x.a((Closeable) null);
                x.a((Closeable) file);
                throw th4;
            }
        } catch (IOException e12) {
            e = e12;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public static String a(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                try {
                    stringBuffer.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                    stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    stringBuffer.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                    stringBuffer.append("&");
                } catch (UnsupportedEncodingException e10) {
                    com.xiaomi.channel.commonutils.logger.b.m62a("Failed to convert from params map to string: " + e10);
                    com.xiaomi.channel.commonutils.logger.b.m62a("map: " + map.toString());
                    return null;
                }
            }
        }
        if (stringBuffer.length() > 0) {
            stringBuffer = stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static HttpURLConnection m176a(Context context, URL url) {
        if ("http".equals(url.getProtocol()) && m179a(context)) {
            return (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.200", 80)));
        }
        return (HttpURLConnection) url.openConnection();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static URL m177a(String str) {
        return new URL(str);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m178a() {
        b();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m179a(Context context) {
        bj bjVarM172a;
        if (!com.huawei.hms.feature.dynamic.f.e.f60734e.equalsIgnoreCase(((TelephonyManager) context.getSystemService(g0.a.f118921e)).getSimCountryIso()) || (bjVarM172a = m172a()) == null) {
            return false;
        }
        String strC = bjVarM172a.c();
        return !TextUtils.isEmpty(strC) && strC.length() >= 3 && strC.contains("ctwap");
    }

    public static void b() {
        f106867a.set(a());
    }

    public static boolean b(Context context) {
        return a(context) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public static boolean c(Context context) {
        boolean zHasCapability;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    zHasCapability = networkCapabilities.hasCapability(16);
                } else {
                    zHasCapability = false;
                }
            } catch (Exception unused) {
            }
        } else {
            zHasCapability = false;
        }
        return zHasCapability && d(context);
    }

    public static boolean d(Context context) {
        bj bjVarM172a = m172a();
        return bjVarM172a != null && bjVarM172a.m183a();
    }

    public static boolean e(Context context) {
        bj bjVarM172a = m172a();
        return bjVarM172a != null && 1 == bjVarM172a.a();
    }

    public static boolean f(Context context) {
        bj bjVarM173a = m173a(context);
        return bjVarM173a != null && bjVarM173a.a() == 0 && 20 == bjVarM173a.b();
    }

    public static boolean g(Context context) {
        bj bjVarM173a = m173a(context);
        return bjVarM173a != null && bjVarM173a.a() == 0 && 13 == bjVarM173a.b();
    }

    public static boolean h(Context context) {
        bj bjVarM173a = m173a(context);
        if (bjVarM173a == null || bjVarM173a.a() != 0) {
            return false;
        }
        String strM184b = bjVarM173a.m184b();
        if (!"TD-SCDMA".equalsIgnoreCase(strM184b) && !"CDMA2000".equalsIgnoreCase(strM184b) && !"WCDMA".equalsIgnoreCase(strM184b)) {
            switch (bjVarM173a.b()) {
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    break;
                case 4:
                case 7:
                case 11:
                case 13:
                default:
                    return false;
            }
        }
        return true;
    }

    public static boolean i(Context context) {
        bj bjVarM173a = m173a(context);
        if (bjVarM173a == null || bjVarM173a.a() != 0) {
            return false;
        }
        int iB = bjVarM173a.b();
        return iB == 1 || iB == 2 || iB == 4 || iB == 7 || iB == 11;
    }
}
