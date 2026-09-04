package com.igexin.push.f.a;

import android.os.Process;
import com.igexin.push.config.l;
import com.igexin.push.util.EncryptUtils;
import com.tencent.cos.xml.common.COSRequestHeaderKey;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes6.dex */
public class c extends com.igexin.a.a.d.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f64018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HttpURLConnection f64019b;

    public c(b bVar) {
        super(0);
        this.f64018a = bVar;
    }

    private d a(String str) {
        try {
            HttpURLConnection httpURLConnectionB = b(str);
            this.f64019b = httpURLConnectionB;
            byte[] bArrA = a(httpURLConnectionB);
            if (bArrA != null) {
                d dVarB = b(this.f64019b, bArrA);
                i();
                return dVarB;
            }
        } catch (Throwable unused) {
        }
        i();
        return new d(this, false, null);
    }

    private d a(String str, byte[] bArr) {
        DataOutputStream dataOutputStream;
        try {
            HttpURLConnection httpURLConnectionB = b(str, bArr);
            this.f64019b = httpURLConnectionB;
            byte[] bArrA = a(bArr, httpURLConnectionB);
            if (bArrA == null) {
                d dVar = new d(this, true, null);
                i();
                return dVar;
            }
            this.f64019b.connect();
            dataOutputStream = new DataOutputStream(this.f64019b.getOutputStream());
            try {
                dataOutputStream.write(bArrA, 0, bArrA.length);
                dataOutputStream.flush();
                byte[] bArrA2 = a(this.f64019b);
                if (bArrA2 != null) {
                    d dVarB = b(this.f64019b, bArrA2);
                    try {
                        dataOutputStream.close();
                    } catch (Exception unused) {
                    }
                    i();
                    return dVarB;
                }
            } catch (Throwable unused2) {
                if (dataOutputStream != null) {
                }
                i();
                return new d(this, false, null);
            }
            try {
                dataOutputStream.close();
            } catch (Exception unused3) {
            }
            i();
            return new d(this, false, null);
        } catch (Throwable unused4) {
            dataOutputStream = null;
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
        httpURLConnection.addRequestProperty("GT_C_K", new String(EncryptUtils.getRSAKeyId()));
        httpURLConnection.addRequestProperty("GT_C_V", EncryptUtils.getHttpGTCV());
        String strValueOf = String.valueOf(System.currentTimeMillis());
        String httpSignature = EncryptUtils.getHttpSignature(strValueOf, bArr);
        httpURLConnection.addRequestProperty("GT_T", strValueOf);
        httpURLConnection.addRequestProperty("GT_C_S", httpSignature);
    }

    private void a(byte[] bArr) throws Exception {
        this.f64018a.a(bArr);
        com.igexin.a.a.b.c.b().a(this.f64018a);
        com.igexin.a.a.b.c.b().c();
    }

    private byte[] a(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        try {
            try {
                InputStream inputStream2 = httpURLConnection.getInputStream();
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    if (httpURLConnection.getResponseCode() != 200) {
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Exception unused) {
                            }
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
                    } catch (Exception unused2) {
                    }
                    return byteArray;
                } catch (Exception e10) {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStream2;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            throw e11;
        }
    }

    private byte[] a(byte[] bArr, HttpURLConnection httpURLConnection) {
        String requestProperty;
        try {
            if (!httpURLConnection.getRequestProperties().containsKey("GT_C_S") || (requestProperty = httpURLConnection.getRequestProperty("GT_C_S")) == null) {
                return null;
            }
            return EncryptUtils.aesEncHttp(bArr, EncryptUtils.md5(requestProperty.getBytes()));
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("_HttpTask|" + th2.toString(), new Object[0]);
            return null;
        }
    }

    private d b(HttpURLConnection httpURLConnection, byte[] bArr) {
        try {
            String headerField = httpURLConnection.getHeaderField("GT_ERR");
            com.igexin.a.a.c.b.a("_HttpTask|GT_ERR = " + headerField, new Object[0]);
            if (headerField != null && headerField.equals("0")) {
                String headerField2 = httpURLConnection.getHeaderField("GT_T");
                if (headerField2 == null) {
                    com.igexin.a.a.c.b.a("_HttpTask|GT_T = null", new Object[0]);
                    return new d(this, true, null);
                }
                String headerField3 = httpURLConnection.getHeaderField("GT_C_S");
                if (headerField3 == null) {
                    com.igexin.a.a.c.b.a("_HttpTask|GT_C_S = null", new Object[0]);
                    return new d(this, true, null);
                }
                byte[] bArrAesDecHttp = EncryptUtils.aesDecHttp(bArr, EncryptUtils.md5(headerField2.getBytes()));
                String httpSignature = EncryptUtils.getHttpSignature(headerField2, bArrAesDecHttp);
                if (httpSignature != null && httpSignature.equals(headerField3)) {
                    return new d(this, false, bArrAesDecHttp);
                }
                com.igexin.a.a.c.b.a("_HttpTask|signature = null or error", new Object[0]);
                return new d(this, true, null);
            }
            return new d(this, true, null);
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("_HttpTask|" + th2.toString(), new Object[0]);
            return new d(this, true, null);
        }
    }

    private HttpURLConnection b(String str) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f64019b = httpURLConnection;
        httpURLConnection.setConnectTimeout(20000);
        this.f64019b.setReadTimeout(20000);
        this.f64019b.setRequestMethod("GET");
        this.f64019b.setDoInput(true);
        a(this.f64019b, (byte[]) null);
        return this.f64019b;
    }

    private HttpURLConnection b(String str, byte[] bArr) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f64019b = httpURLConnection;
        httpURLConnection.setDoInput(true);
        this.f64019b.setDoOutput(true);
        this.f64019b.setRequestMethod("POST");
        this.f64019b.setUseCaches(false);
        this.f64019b.setInstanceFollowRedirects(true);
        this.f64019b.setRequestProperty("Content-Type", COSRequestHeaderKey.APPLICATION_OCTET_STREAM);
        this.f64019b.setConnectTimeout(20000);
        this.f64019b.setReadTimeout(20000);
        a(this.f64019b, bArr);
        return this.f64019b;
    }

    private void i() {
        HttpURLConnection httpURLConnection = this.f64019b;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
                this.f64019b = null;
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.igexin.a.a.d.e
    public final void b() throws Exception {
        byte[] bArr;
        super.b();
        Process.setThreadPriority(10);
        b bVar = this.f64018a;
        if (bVar == null || bVar.f64015c == null || ((bArr = bVar.f64016d) != null && bArr.length > l.f63445w * 1024)) {
            p();
            com.igexin.a.a.c.b.a("_HttpTask|run return ###", new Object[0]);
            return;
        }
        if (bArr != null && bArr.length > 0) {
            bVar.f64016d = com.igexin.a.a.b.e.c(bArr);
        }
        for (int i10 = 0; i10 < 3; i10++) {
            b bVar2 = this.f64018a;
            byte[] bArr2 = bVar2.f64016d;
            String str = bVar2.f64015c;
            d dVarA = bArr2 == null ? a(str) : a(str, bArr2);
            if (dVarA.f64020a) {
                throw new Exception("http server resp decode header error");
            }
            byte[] bArr3 = dVarA.f64021b;
            if (bArr3 != null) {
                a(bArr3);
                return;
            } else {
                if (i10 == 2) {
                    this.f64018a.a(new Exception("try up to limit"));
                    throw new Exception("http request exception, try times = " + (i10 + 1));
                }
            }
        }
    }

    @Override // com.igexin.a.a.d.a.e
    public final int b_() {
        return -2147483638;
    }

    @Override // com.igexin.a.a.d.e
    public void d() {
        this.f63234m = true;
    }

    @Override // com.igexin.a.a.d.e
    protected void e() {
    }

    @Override // com.igexin.a.a.d.e
    public void f() {
        super.f();
        i();
    }
}
