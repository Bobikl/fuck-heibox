package com.igexin.push.extension.distribution.basic.f;

import android.os.Process;
import android.util.Base64;
import com.igexin.push.extension.distribution.basic.g.h;
import com.tencent.cos.xml.common.COSRequestHeaderKey;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes6.dex */
public class a extends com.igexin.a.a.d.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f63982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HttpURLConnection f63983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f63984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f63985d;

    public a(d dVar) {
        super(0);
        this.f63982a = dVar;
        com.igexin.a.a.c.b.a("AsyncHttpTask|httpPlugin = " + dVar, new Object[0]);
    }

    private b a(String str) {
        try {
            HttpURLConnection httpURLConnectionB = b(str);
            this.f63983b = httpURLConnectionB;
            byte[] bArrA = a(httpURLConnectionB);
            if (bArrA != null) {
                b bVarB = b(this.f63983b, bArrA);
                i();
                return bVarB;
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            i();
            throw th2;
        }
        i();
        return new b(this, false, null);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v3 */
    private b a(String str, byte[] bArr) throws Throwable {
        DataOutputStream dataOutputStream;
        com.igexin.a.a.c.b.a("AsyncHttpTask|call httpPost start ###", new Object[0]);
        ?? r10 = 0;
        try {
            try {
                if (b(bArr)) {
                    b bVar = new b(this, false, null);
                    i();
                    return bVar;
                }
                this.f63983b = b(str, bArr);
                com.igexin.a.a.c.b.a("AsyncHttpTask|httpPost() src body len = " + bArr.length, new Object[0]);
                byte[] bArrA = a(bArr, this.f63983b);
                if (bArrA == null) {
                    com.igexin.a.a.c.b.a("AsyncHttpTask|httpPost() getEncHttpData body = null", new Object[0]);
                    b bVar2 = new b(this, true, null);
                    i();
                    return bVar2;
                }
                com.igexin.a.a.c.b.a("AsyncHttpTask|httpPost() getEncHttpData len = " + bArrA.length, new Object[0]);
                this.f63983b.connect();
                dataOutputStream = new DataOutputStream(this.f63983b.getOutputStream());
                try {
                    dataOutputStream.write(bArrA, 0, bArrA.length);
                    dataOutputStream.flush();
                    com.igexin.a.a.c.b.a("AsyncHttpTask|httpPost() write and flush", new Object[0]);
                    byte[] bArrA2 = a(this.f63983b);
                    if (bArrA2 == null) {
                        com.igexin.a.a.c.b.a("AsyncHttpTask|httpPost() server resp is null", new Object[0]);
                        try {
                            dataOutputStream.close();
                        } catch (Exception unused) {
                        }
                        i();
                        return new b(this, false, null);
                    }
                    com.igexin.a.a.c.b.a("AsyncHttpTask|httpPost() server resp len =" + bArrA2.length, new Object[0]);
                    b bVarB = b(this.f63983b, bArrA2);
                    try {
                        dataOutputStream.close();
                    } catch (Exception unused2) {
                    }
                    i();
                    return bVarB;
                } catch (Exception e10) {
                    e = e10;
                    com.igexin.a.a.c.b.a("AsyncHttpTask httpPost|error|" + e.getMessage(), new Object[0]);
                    if (dataOutputStream != null) {
                    }
                    i();
                    return new b(this, false, null);
                }
            } catch (Throwable th2) {
                th = th2;
                r10 = bArr;
                if (r10 != 0) {
                    try {
                        r10.close();
                    } catch (Exception unused3) {
                    }
                }
                i();
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            dataOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (r10 != 0) {
                r10.close();
            }
            i();
            throw th;
        }
    }

    private Method a(String str, Class<?>... clsArr) {
        try {
            return Class.forName("com.igexin.push.util.EncryptUtils").getMethod(str, clsArr);
        } catch (Exception unused) {
            com.igexin.a.a.c.b.a(this.f63210l + "invokeMethod error", new Object[0]);
            return null;
        }
    }

    private void a(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        if (httpURLConnection == null) {
            return;
        }
        byte[] bArr2 = new byte[0];
        if (bArr == null) {
            bArr = bArr2;
        }
        httpURLConnection.addRequestProperty("GT_C_T", String.valueOf(1));
        httpURLConnection.addRequestProperty("GT_C_K", new String((byte[]) a("getRSAKeyId", new Class[0]).invoke(null, new Object[0])));
        httpURLConnection.addRequestProperty("GT_C_V", (String) a("getHttpGTCV", new Class[0]).invoke(null, new Object[0]));
        String strValueOf = String.valueOf(System.currentTimeMillis());
        String str = (String) a("getHttpSignature", String.class, byte[].class).invoke(null, strValueOf, bArr);
        httpURLConnection.addRequestProperty("GT_T", strValueOf);
        httpURLConnection.addRequestProperty("GT_C_S", str);
    }

    private void a(byte[] bArr) throws Exception {
        this.f63982a.a(bArr);
        com.igexin.a.a.b.c.b().a(this.f63982a);
        com.igexin.a.a.b.c.b().c();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[SYNTHETIC] */
    private byte[] a(HttpURLConnection httpURLConnection) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream = null;
        try {
            InputStream inputStream2 = httpURLConnection.getInputStream();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    if (httpURLConnection.getResponseCode() != 200) {
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Exception unused) {
                            }
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused2) {
                        }
                        return null;
                    }
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i10 = inputStream2.read(bArr);
                        if (i10 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i10);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        inputStream2.close();
                    } catch (Exception unused3) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused4) {
                    }
                    return byteArray;
                } catch (Exception e10) {
                    e = e10;
                    inputStream = inputStream2;
                    try {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception unused5) {
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            throw th;
                        }
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (Exception unused6) {
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = inputStream2;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        throw th;
                    }
                    byteArrayOutputStream.close();
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
        } catch (Exception e12) {
            e = e12;
            byteArrayOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            byteArrayOutputStream = null;
        }
    }

    private byte[] a(byte[] bArr, HttpURLConnection httpURLConnection) {
        try {
            com.igexin.a.a.c.b.a("AsyncHttpTask|getEncHttpData|isUseAES = |" + this.f63984c, new Object[0]);
            if (!this.f63984c) {
                return h.a(bArr);
            }
            String requestProperty = httpURLConnection.getRequestProperty("GT_C_S");
            if (requestProperty != null) {
                return (byte[]) a("aesEncHttp", byte[].class, byte[].class).invoke(null, bArr, a("md5", byte[].class).invoke(null, requestProperty.getBytes()));
            }
            return null;
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("AsyncHttpTask|getEncHttpData|error|" + th2.getMessage(), new Object[0]);
        }
    }

    private b b(HttpURLConnection httpURLConnection, byte[] bArr) {
        com.igexin.a.a.c.b.a("AsyncHttpTask|authAndDecResp start ~~~", new Object[0]);
        try {
            if (!this.f63984c) {
                if (this.f63982a.e()) {
                    bArr = Base64.decode(bArr, 0);
                }
                if (this.f63982a.d()) {
                    bArr = h.b(bArr);
                }
                return new b(this, false, bArr);
            }
            String headerField = httpURLConnection.getHeaderField("GT_ERR");
            com.igexin.a.a.c.b.a(this.f63210l + "|GT_ERR = " + headerField, new Object[0]);
            if (headerField != null && headerField.equals("0")) {
                String headerField2 = httpURLConnection.getHeaderField("GT_T");
                if (headerField2 == null) {
                    com.igexin.a.a.c.b.a(this.f63210l + "|GT_T = null", new Object[0]);
                    return new b(this, true, null);
                }
                String headerField3 = httpURLConnection.getHeaderField("GT_C_S");
                if (headerField3 == null) {
                    com.igexin.a.a.c.b.a(this.f63210l + "|GT_C_S = null", new Object[0]);
                    return new b(this, true, null);
                }
                byte[] bArr2 = (byte[]) a("aesDecHttp", byte[].class, byte[].class).invoke(null, bArr, a("md5", byte[].class).invoke(null, headerField2.getBytes()));
                String str = (String) a("getHttpSignature", String.class, byte[].class).invoke(null, headerField2, bArr2);
                if (str != null && str.equals(headerField3)) {
                    return new b(this, false, bArr2);
                }
                com.igexin.a.a.c.b.a(this.f63210l + "|signature = null or error", new Object[0]);
                return new b(this, true, null);
            }
            return new b(this, true, null);
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("AsyncHttpTask|authAndDecResp|error|" + th2.getMessage(), new Object[0]);
            return new b(this, true, null);
        }
    }

    private HttpURLConnection b(String str) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f63983b = httpURLConnection;
        httpURLConnection.setConnectTimeout(20000);
        this.f63983b.setReadTimeout(20000);
        this.f63983b.setRequestMethod("GET");
        this.f63983b.setDoInput(true);
        if (this.f63984c) {
            a(this.f63983b, (byte[]) null);
        }
        return this.f63983b;
    }

    private HttpURLConnection b(String str, byte[] bArr) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f63983b = httpURLConnection;
        httpURLConnection.setDoInput(true);
        this.f63983b.setDoOutput(true);
        this.f63983b.setRequestMethod("POST");
        this.f63983b.setUseCaches(false);
        this.f63983b.setInstanceFollowRedirects(true);
        this.f63983b.setRequestProperty("Content-Type", COSRequestHeaderKey.APPLICATION_OCTET_STREAM);
        this.f63983b.setConnectTimeout(20000);
        this.f63983b.setReadTimeout(20000);
        if (this.f63984c) {
            a(this.f63983b, bArr);
        }
        return this.f63983b;
    }

    private boolean b(byte[] bArr) {
        if (bArr == null || bArr.length / 1024 <= com.igexin.push.extension.distribution.basic.c.e.f63970j) {
            return false;
        }
        com.igexin.a.a.c.b.a(this.f63210l + "|http body size exceed " + com.igexin.push.extension.distribution.basic.c.e.f63970j, new Object[0]);
        return true;
    }

    private void i() {
        com.igexin.a.a.c.b.a("AsyncHttpTask call closeHttpURLConnection", new Object[0]);
        HttpURLConnection httpURLConnection = this.f63983b;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
                this.f63983b = null;
            } catch (Exception unused) {
            }
        }
    }

    private boolean j() {
        return this.f63982a.f63998e && com.igexin.push.extension.distribution.basic.g.b.a();
    }

    @Override // com.igexin.a.a.d.e
    public final void b() throws Exception {
        String strB;
        super.b();
        try {
            if (this.f63985d) {
                p();
                return;
            }
            this.f63985d = true;
            Process.setThreadPriority(10);
            d dVar = this.f63982a;
            if (dVar == null || (strB = dVar.b()) == null) {
                return;
            }
            boolean zJ = j();
            this.f63984c = zJ;
            if (zJ && !((Boolean) a("isLoadSuccess", new Class[0]).invoke(null, new Object[0])).booleanValue()) {
                com.igexin.a.a.c.b.a(this.f63210l + "|so load failed! AsyncHttpTask return!", new Object[0]);
                return;
            }
            if (this.f63984c && this.f63982a.c() != null && this.f63982a.c().length > 0) {
                d dVar2 = this.f63982a;
                dVar2.b(com.igexin.a.a.b.e.a(dVar2.c()));
            }
            try {
                b bVarA = this.f63982a.c() == null ? a(strB) : a(strB, this.f63982a.c());
                if (bVarA.f63986a) {
                    Exception exc = new Exception("http server resp decode header error");
                    this.f63982a.a(exc);
                    throw exc;
                }
                byte[] bArr = bVarA.f63987b;
                if (bArr != null) {
                    a(bArr);
                } else {
                    Exception exc2 = new Exception("Http response exception");
                    this.f63982a.a(exc2);
                    throw exc2;
                }
            } catch (Exception e10) {
                com.igexin.a.a.c.b.a("AsyncHttpTask|run() post or get error = " + e10.getMessage(), new Object[0]);
                this.f63982a.a(e10);
                throw e10;
            }
        } catch (Exception e11) {
            com.igexin.a.a.c.b.a("AsyncHttpTask|run() error = " + e11.getMessage(), new Object[0]);
            throw e11;
        }
    }

    @Override // com.igexin.a.a.d.a.e
    public final int b_() {
        return -2147483639;
    }

    @Override // com.igexin.a.a.d.e
    public void d() {
        this.f63234m = true;
        com.igexin.a.a.c.b.a("AsyncHttpTask initTask()|isBloker = " + this.f63234m + "|isCycle = " + this.f63235n, new Object[0]);
    }

    @Override // com.igexin.a.a.d.e
    protected void e() {
    }

    @Override // com.igexin.a.a.d.e
    public void f() {
        com.igexin.a.a.c.b.a("AsyncHttpTask|dispose()|closeHttpURLConnection", new Object[0]);
        super.f();
        i();
    }
}
