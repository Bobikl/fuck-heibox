package cn.fly.verify;

import com.tencent.cos.xml.common.COSRequestHeaderKey;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* JADX INFO: loaded from: classes6.dex */
public class fu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f36605a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f36606b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f36607d = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f36608c = f36607d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f36613b;
    }

    public static class b implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f36614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f36615b;

        private b(String str) {
            try {
                this.f36615b = str;
                Method declaredMethod = Class.forName(ec.a("033_fe;b3bb$bJcgbj_cdgZbjdgdgYeMbjdabhbedg*g$faIbcbFch:d3bheaFbag!bibhca")).getDeclaredMethod(ec.a("011 ch2dg8cc<c3dg7gbcad"), String.class);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, ec.a("004_eefgdffh"));
                Method method = objInvoke.getClass().getMethod(ec.a("004)bg cGbgCg"), Class.forName(ec.a("022=fePb9bbOb2bjdg0da_bebhbg<g+cabjga+d:cacjBg5bibh0d")));
                method.setAccessible(true);
                method.invoke(objInvoke, null);
                Method method2 = objInvoke.getClass().getMethod(ec.a("016Ych:dgOdabhbedgZg>fa2bcb<ch$d%bhdg"), new Class[0]);
                method2.setAccessible(true);
                Object[] objArr = (Object[]) method2.invoke(objInvoke, new Object[0]);
                if (objArr == null || objArr.length == 0) {
                    throw new NoSuchAlgorithmException("no trust manager found.");
                }
                this.f36614a = objArr[0];
            } catch (Exception e10) {
                es.a().a("failed to initialize the standard trust manager: " + e10.getMessage(), new Object[0]);
                this.f36614a = null;
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            if (name.equals(ec.a("018afdaZcfcbEeLbgGdcgNdabhbedg=gd?ba"))) {
                return null;
            }
            try {
                if (!name.equals(ec.a("018afdaMcfcjYd4bhbbHd5bhdabhbedgSgd8ba"))) {
                    if (name.equals(ec.a("018=ch.dg(db2aadhgd2baccdgdgbeEdXbhdg"))) {
                        return Array.newInstance(Class.forName(ec.a("034[fe<b5bb:b8bjdgNdaTbebhbg)gXcabj.adObh5g[bjeefgdffhcb1d!bh@gXbgcdbgEabgd")), 0);
                    }
                    if (name.equals(ec.a("008fbJdg?f5cbbibaId"))) {
                        return Integer.valueOf(hashCode());
                    }
                    if (name.equals("toString")) {
                        return toString();
                    }
                    return null;
                }
                Object[] objArr2 = (Object[]) objArr[0];
                String str = (String) objArr[1];
                if (objArr2 == null) {
                    throw new IllegalArgumentException("there were no certificates.");
                }
                if (objArr2.length == 1) {
                    Method declaredMethod = objArr2[0].getClass().getDeclaredMethod(ec.a("013afda'cfeiDbeXbgbabgMg.ca"), new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objArr2[0], new Object[0]);
                    return null;
                }
                if (this.f36614a == null) {
                    throw new CertificateException("there were one more certificates but no trust manager found.");
                }
                Object objNewInstance = Class.forName("android.net.http.X509TrustManagerExtensions").getConstructor(Class.forName(ec.a("0301feIbSbbEb>cgbj*cdgWbjdgdg e'bjeefgdffhdabhbedg4gJfa*bcb5ch7d5bh"))).newInstance(this.f36614a);
                Method declaredMethod2 = objNewInstance.getClass().getDeclaredMethod(ec.a("018afda5cfcj+d.bhbb*d bhdabhbedg7gd>ba"), Array.newInstance(Class.forName(ec.a("034,feWb5bb9b4bjdg+daDbebhbg<gXcabj$adDbhDg.bjeefgdffhcb,d?bh0g@bgcdbg%abgd")), 0).getClass(), String.class, String.class);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(objNewInstance, objArr2, str, this.f36615b);
                return null;
            } catch (Throwable th2) {
                es.a().c(th2);
                return null;
            }
        }
    }

    public static Object a(String str) throws Throwable {
        Class<?> cls = Class.forName(ec.a("030Ofe'bYbbMb@cgbjAcdg+bjdgdg5e$bjeefgdffhdabhbedgVg(faQbcbEchTdKbh"));
        return Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{cls}, new b(str));
    }

    private String a(HashMap<String, Object> map) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String strD = ga.d(entry.getKey(), "utf-8");
            String strD2 = entry.getValue() == null ? "" : ga.d(String.valueOf(entry.getValue()), "utf-8");
            if (sb2.length() > 0) {
                sb2.append(kotlin.text.y.f128595d);
            }
            sb2.append(strD);
            sb2.append(n5.a.f132013h);
            sb2.append(strD2);
        }
        return sb2.toString();
    }

    private HttpURLConnection a(String str, a aVar) throws Throwable {
        Object objC;
        boolean z10;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        String strA = ec.a("012KbdLdgf^bibadabicfPdcNdg");
        try {
            objC = gi.a(httpURLConnection, strA);
        } catch (Throwable unused) {
            objC = null;
        }
        if (objC == null) {
            strA = "PERMITTED_USER_METHODS";
            try {
                objC = gi.c("HttpURLConnection", "PERMITTED_USER_METHODS");
            } catch (Throwable unused2) {
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (objC != null) {
            String[] strArr = (String[]) objC;
            String[] strArr2 = new String[strArr.length + 1];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArr2[strArr.length] = ec.a("005!ejdbdacbdi");
            if (z10) {
                gi.a("HttpURLConnection", strA, (Object) strArr2);
            } else {
                gi.b(httpURLConnection, strA, strArr2);
            }
        }
        System.setProperty("http.keepAlive", "false");
        if (httpURLConnection instanceof HttpsURLConnection) {
            X509HostnameVerifier x509HostnameVerifier = SSLSocketFactory.STRICT_HOSTNAME_VERIFIER;
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            SSLContext sSLContext = SSLContext.getInstance(ec.a("0031dadccj"));
            TrustManager[] trustManagerArr = new TrustManager[0];
            try {
                trustManagerArr = new TrustManager[]{(TrustManager) a(httpsURLConnection.getURL().getHost())};
            } catch (Throwable th2) {
                es.a().c(th2);
            }
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            httpsURLConnection.setHostnameVerifier(x509HostnameVerifier);
        }
        int i10 = aVar == null ? f36605a : aVar.f36613b;
        if (i10 > 0) {
            httpURLConnection.setConnectTimeout(i10);
        }
        int i11 = aVar == null ? f36606b : aVar.f36612a;
        if (i11 > 0) {
            httpURLConnection.setReadTimeout(i11);
        }
        return httpURLConnection;
    }

    private void a(URLConnection uRLConnection, HashMap<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            uRLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    private static boolean a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode() == 301 || httpURLConnection.getResponseCode() == 302 || httpURLConnection.getResponseCode() == 304 || httpURLConnection.getResponseCode() == 307 || httpURLConnection.getResponseCode() == 308;
        } catch (Throwable th2) {
            es.a().a(th2);
            return false;
        }
    }

    public String a(String str, HashMap<String, Object> map, HashMap<String, String> map2) throws Throwable {
        a aVar = new a();
        aVar.f36612a = 30000;
        aVar.f36613b = 10000;
        return a(str, map, map2, aVar);
    }

    public String a(String str, HashMap<String, Object> map, HashMap<String, String> map2, a aVar) throws Throwable {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        es.a().a(String.format("hgt: %s", str) + "\n" + String.format("hd: %s", map2), new Object[0]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (map != null) {
            String strA = a(map);
            if (strA.length() > 0) {
                str = str + "?" + strA;
            }
        }
        HttpURLConnection httpURLConnectionA = a(str, aVar);
        a(httpURLConnectionA, map2);
        httpURLConnectionA.setInstanceFollowRedirects(this.f36608c);
        httpURLConnectionA.connect();
        int responseCode = httpURLConnectionA.getResponseCode();
        BufferedReader bufferedReader = null;
        if (responseCode == 200) {
            StringBuilder sb2 = new StringBuilder();
            try {
                inputStreamReader2 = new InputStreamReader(httpURLConnectionA.getInputStream(), Charset.forName("utf-8"));
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                el.a(bufferedReader2, inputStreamReader2);
                                httpURLConnectionA.disconnect();
                                String string = sb2.toString();
                                es.a().a("use time: " + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
                                return string;
                            }
                            if (sb2.length() > 0) {
                                sb2.append('\n');
                            }
                            sb2.append(line);
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            el.a(bufferedReader, inputStreamReader2);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStreamReader2 = null;
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            try {
                inputStreamReader = new InputStreamReader(httpURLConnectionA.getErrorStream(), Charset.forName("utf-8"));
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            String line2 = bufferedReader3.readLine();
                            if (line2 == null) {
                                el.a(bufferedReader3, inputStreamReader);
                                httpURLConnectionA.disconnect();
                                HashMap map3 = new HashMap();
                                map3.put(ec.a("005d.bhbhbibh"), sb3.toString());
                                map3.put(ec.a("006+dg[gbg!bedg"), Integer.valueOf(responseCode));
                                throw new Throwable(ge.a(map3));
                            }
                            if (sb3.length() > 0) {
                                sb3.append('\n');
                            }
                            sb3.append(line2);
                        } catch (Throwable th5) {
                            th = th5;
                            bufferedReader = bufferedReader3;
                            el.a(bufferedReader, inputStreamReader);
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                inputStreamReader = null;
            }
        }
    }

    public void a(String str, fw fwVar, a aVar) throws Throwable {
        a(str, new HashMap<>(), fwVar, aVar);
    }

    public void a(String str, final OutputStream outputStream, a aVar) throws Throwable {
        final byte[] bArr = new byte[1024];
        a(str, new fw() { // from class: cn.fly.verify.fu.1
            @Override // cn.fly.verify.fw
            public void a(InputStream inputStream) throws Throwable {
                int i10 = inputStream.read(bArr);
                while (i10 != -1) {
                    outputStream.write(bArr, 0, i10);
                    i10 = inputStream.read(bArr);
                }
            }
        }, aVar);
        outputStream.flush();
    }

    public void a(String str, HashMap<String, String> map, fp fpVar, int i10, fs fsVar, a aVar) throws Throwable {
        OutputStream outputStream;
        long jCurrentTimeMillis = System.currentTimeMillis();
        es.a().a("hptr: " + str, new Object[0]);
        HttpURLConnection httpURLConnectionA = a(str, aVar);
        httpURLConnectionA.setDoOutput(true);
        if (i10 >= 0) {
            httpURLConnectionA.setChunkedStreamingMode(0);
        }
        a(httpURLConnectionA, map);
        httpURLConnectionA.setInstanceFollowRedirects(this.f36608c);
        httpURLConnectionA.connect();
        InputStream inputStreamC = null;
        try {
            outputStream = httpURLConnectionA.getOutputStream();
            try {
                inputStreamC = fpVar.c();
                byte[] bArr = new byte[65536];
                while (true) {
                    int i11 = inputStreamC.read(bArr);
                    if (i11 <= 0) {
                        break;
                    } else {
                        outputStream.write(bArr, 0, i11);
                    }
                }
                outputStream.flush();
                el.a(inputStreamC, outputStream);
                if (fsVar != null) {
                    try {
                        fsVar.a(new fr(httpURLConnectionA));
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            httpURLConnectionA.disconnect();
                            throw th3;
                        }
                    }
                }
                httpURLConnectionA.disconnect();
                es.a().a("use time: " + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
            } catch (Throwable th4) {
                th = th4;
                el.a(inputStreamC, outputStream);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            outputStream = null;
        }
    }

    public void a(String str, HashMap<String, String> map, fw fwVar, a aVar) throws Throwable {
        InputStreamReader inputStreamReader;
        long jCurrentTimeMillis = System.currentTimeMillis();
        es.a().a("rawGet: " + str, new Object[0]);
        HttpURLConnection httpURLConnectionA = a(str, aVar);
        a(httpURLConnectionA, map);
        httpURLConnectionA.setInstanceFollowRedirects(this.f36608c);
        httpURLConnectionA.connect();
        int responseCode = httpURLConnectionA.getResponseCode();
        if (responseCode == 200) {
            if (fwVar != null) {
                InputStream inputStream = httpURLConnectionA.getInputStream();
                try {
                    fwVar.a(inputStream);
                    el.a(inputStream);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        el.a(inputStream);
                        httpURLConnectionA.disconnect();
                        throw th3;
                    }
                }
            }
            httpURLConnectionA.disconnect();
            es.a().a("use time: " + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
            return;
        }
        if (a(httpURLConnectionA)) {
            a(httpURLConnectionA.getHeaderField(ec.a("008WdcbiMabgZbgbi'c")), new HashMap<>(), fwVar, aVar);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            inputStreamReader = new InputStreamReader(httpURLConnectionA.getErrorStream(), Charset.forName("utf-8"));
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            el.a(bufferedReader2, inputStreamReader);
                            httpURLConnectionA.disconnect();
                            HashMap map2 = new HashMap();
                            map2.put(ec.a("005dTbhbhbibh"), sb2.toString());
                            map2.put(ec.a("006Wdg5gbg8bedg"), Integer.valueOf(responseCode));
                            throw new Throwable(ge.a(map2));
                        }
                        if (sb2.length() > 0) {
                            sb2.append('\n');
                        }
                        sb2.append(line);
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedReader = bufferedReader2;
                        el.a(bufferedReader, inputStreamReader);
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            inputStreamReader = null;
        }
    }

    public void a(String str, byte[] bArr, HashMap<String, String> map, int i10, fs fsVar, a aVar) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        OutputStream outputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        DataOutputStream dataOutputStream;
        long jCurrentTimeMillis = System.currentTimeMillis();
        es.a().a("hpt: " + str, new Object[0]);
        HttpURLConnection httpURLConnectionA = a(str, aVar);
        httpURLConnectionA.setDoOutput(true);
        if (i10 >= 0) {
            httpURLConnectionA.setChunkedStreamingMode(0);
        }
        a(httpURLConnectionA, map);
        httpURLConnectionA.setRequestProperty(ec.a("0106cbbi1ccdag,bgbi2c"), com.google.common.net.c.f58866u0);
        httpURLConnectionA.setRequestProperty("Content-Type", COSRequestHeaderKey.APPLICATION_OCTET_STREAM);
        httpURLConnectionA.setInstanceFollowRedirects(this.f36608c);
        httpURLConnectionA.connect();
        try {
            outputStream = httpURLConnectionA.getOutputStream();
            try {
                String strA = ek.a();
                if (strA == null) {
                    strA = "";
                }
                byte[] bytes = strA.getBytes("utf-8");
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    try {
                        dataOutputStream.writeInt(bytes.length);
                        dataOutputStream.write(bytes);
                        dataOutputStream.write(bArr);
                        dataOutputStream.flush();
                        byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                        try {
                            byte[] bArr2 = new byte[65536];
                            for (int i11 = byteArrayInputStream.read(bArr2); i11 > 0; i11 = byteArrayInputStream.read(bArr2)) {
                                outputStream.write(bArr2, 0, i11);
                            }
                            outputStream.flush();
                            if (fsVar != null) {
                                try {
                                    fsVar.a(new fr(httpURLConnectionA));
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        httpURLConnectionA.disconnect();
                                        throw th3;
                                    }
                                }
                            }
                            httpURLConnectionA.disconnect();
                            httpURLConnectionA.disconnect();
                            el.a(byteArrayInputStream, outputStream, dataOutputStream, byteArrayOutputStream);
                            es.a().a("use time: " + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
                        } catch (Throwable th4) {
                            th = th4;
                            httpURLConnectionA.disconnect();
                            el.a(byteArrayInputStream, outputStream, dataOutputStream, byteArrayOutputStream);
                            es.a().a("use time: " + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        byteArrayInputStream = null;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    byteArrayInputStream = null;
                    dataOutputStream = null;
                    httpURLConnectionA.disconnect();
                    el.a(byteArrayInputStream, outputStream, dataOutputStream, byteArrayOutputStream);
                    es.a().a("use time: " + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                byteArrayInputStream = null;
                byteArrayOutputStream = null;
                dataOutputStream = null;
                httpURLConnectionA.disconnect();
                el.a(byteArrayInputStream, outputStream, dataOutputStream, byteArrayOutputStream);
                es.a().a("use time: " + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            byteArrayInputStream = null;
            outputStream = null;
        }
    }

    public String b(String str, HashMap<String, Object> map, HashMap<String, String> map2, a aVar) throws Throwable {
        InputStream inputStream;
        OutputStream outputStream;
        Throwable th2;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        InputStreamReader inputStreamReader2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        es.a().a("hpt: " + str + "\nhd: " + map2, new Object[0]);
        HttpURLConnection httpURLConnectionA = a(str, aVar);
        httpURLConnectionA.setDoOutput(true);
        a(httpURLConnectionA, map2);
        httpURLConnectionA.setRequestProperty(ec.a("010(cbbiCccdagSbgbiPc"), com.google.common.net.c.f58866u0);
        httpURLConnectionA.setRequestProperty("Content-Type", ec.a("033bhhe9bg5abg*bgbiWcjKcgfidededeficdbibhbdfibebh9edcaNbibaRd)ba"));
        fx fxVar = new fx();
        if (map != null) {
            fxVar.a(a(map));
        }
        httpURLConnectionA.setFixedLengthStreamingMode((int) fxVar.b());
        httpURLConnectionA.setInstanceFollowRedirects(this.f36608c);
        httpURLConnectionA.connect();
        try {
            outputStream = httpURLConnectionA.getOutputStream();
            try {
                InputStream inputStreamC = fxVar.c();
                try {
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int i10 = inputStreamC.read(bArr);
                        if (i10 <= 0) {
                            break;
                        }
                        outputStream.write(bArr, 0, i10);
                    }
                    outputStream.flush();
                    int responseCode = httpURLConnectionA.getResponseCode();
                    if (responseCode == 200 || responseCode < 300) {
                        StringBuilder sb2 = new StringBuilder();
                        try {
                            InputStreamReader inputStreamReader3 = new InputStreamReader(httpURLConnectionA.getInputStream(), Charset.forName("utf-8"));
                            try {
                                BufferedReader bufferedReader3 = new BufferedReader(inputStreamReader3);
                                while (true) {
                                    try {
                                        String line = bufferedReader3.readLine();
                                        if (line == null) {
                                            el.a(bufferedReader3, inputStreamReader3);
                                            String string = sb2.toString();
                                            httpURLConnectionA.disconnect();
                                            el.a(inputStreamC, outputStream);
                                            es.a().a("use time: " + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
                                            return string;
                                        }
                                        if (sb2.length() > 0) {
                                            sb2.append('\n');
                                        }
                                        sb2.append(line);
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        inputStreamReader = inputStreamReader3;
                                        bufferedReader = bufferedReader3;
                                        el.a(bufferedReader, inputStreamReader);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                                inputStreamReader = inputStreamReader3;
                                bufferedReader = null;
                                el.a(bufferedReader, inputStreamReader);
                                throw th2;
                            }
                        } catch (Throwable th5) {
                            th2 = th5;
                            inputStreamReader = null;
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        try {
                            inputStreamReader2 = new InputStreamReader(httpURLConnectionA.getErrorStream(), Charset.forName("utf-8"));
                            try {
                                bufferedReader2 = new BufferedReader(inputStreamReader2);
                                while (true) {
                                    try {
                                        String line2 = bufferedReader2.readLine();
                                        if (line2 == null) {
                                            el.a(bufferedReader2, inputStreamReader2);
                                            HashMap map3 = new HashMap();
                                            map3.put(ec.a("005dDbhbhbibh"), sb3.toString());
                                            map3.put(ec.a("006<dgXgbgMbedg"), Integer.valueOf(responseCode));
                                            throw new Throwable(ge.a(map3));
                                        }
                                        if (sb3.length() > 0) {
                                            sb3.append('\n');
                                        }
                                        sb3.append(line2);
                                    } catch (Throwable th6) {
                                        th = th6;
                                        el.a(bufferedReader2, inputStreamReader2);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                bufferedReader2 = null;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            bufferedReader2 = null;
                            inputStreamReader2 = null;
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                    inputStream = inputStreamC;
                    httpURLConnectionA.disconnect();
                    el.a(inputStream, outputStream);
                    es.a().a("use time: " + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
                    throw th;
                }
            } catch (Throwable th10) {
                th = th10;
                inputStream = null;
            }
        } catch (Throwable th11) {
            th = th11;
            inputStream = null;
            outputStream = null;
        }
    }
}
