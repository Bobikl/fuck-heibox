package com.igexin.push.f.a;

import android.os.Process;
import com.igexin.push.config.l;
import com.tencent.cos.xml.common.COSRequestHeaderKey;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes6.dex */
public class a extends com.igexin.a.a.d.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f64012a = "com.igexin.push.f.a.a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f64013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HttpURLConnection f64014c;

    public a(b bVar) {
        super(0);
        this.f64013b = bVar;
    }

    private byte[] a(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th2;
        InputStream inputStream;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            this.f64014c = httpURLConnection;
            httpURLConnection.setConnectTimeout(20000);
            this.f64014c.setReadTimeout(20000);
            this.f64014c.setRequestMethod("GET");
            this.f64014c.setDoInput(true);
            inputStream = this.f64014c.getInputStream();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    if (this.f64014c.getResponseCode() == 200) {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i10 = inputStream.read(bArr);
                            if (i10 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i10);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            inputStream.close();
                        } catch (Exception unused) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused2) {
                        }
                        i();
                        return byteArray;
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception unused3) {
                        }
                    }
                } catch (Exception unused4) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception unused5) {
                        }
                    }
                    if (byteArrayOutputStream != null) {
                    }
                    i();
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception unused6) {
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused7) {
                        }
                    }
                    i();
                    throw th2;
                }
            } catch (Exception unused8) {
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                byteArrayOutputStream = null;
                th2 = th4;
            }
        } catch (Exception unused9) {
            inputStream = null;
            byteArrayOutputStream = null;
        } catch (Throwable th5) {
            byteArrayOutputStream = null;
            th2 = th5;
            inputStream = null;
        }
        try {
            byteArrayOutputStream.close();
        } catch (Exception unused10) {
        }
        i();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private byte[] a(String str, byte[] bArr) throws Throwable {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th2;
        DataOutputStream dataOutputStream;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                this.f64014c = httpURLConnection;
                httpURLConnection.setDoInput(true);
                this.f64014c.setDoOutput(true);
                this.f64014c.setRequestMethod("POST");
                this.f64014c.setUseCaches(false);
                this.f64014c.setInstanceFollowRedirects(true);
                this.f64014c.setRequestProperty("Content-Type", COSRequestHeaderKey.APPLICATION_OCTET_STREAM);
                this.f64014c.setConnectTimeout(20000);
                this.f64014c.setReadTimeout(20000);
                this.f64014c.connect();
                dataOutputStream = new DataOutputStream(this.f64014c.getOutputStream());
                try {
                    dataOutputStream.write(bArr, 0, bArr.length);
                    dataOutputStream.flush();
                    if (this.f64014c.getResponseCode() != 200) {
                        dataOutputStream.close();
                        i();
                        return null;
                    }
                    inputStream = this.f64014c.getInputStream();
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr2 = new byte[1024];
                            while (true) {
                                int i10 = inputStream.read(bArr2);
                                if (i10 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, i10);
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            try {
                                dataOutputStream.close();
                            } catch (Exception unused) {
                            }
                            try {
                                inputStream.close();
                            } catch (Exception unused2) {
                            }
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused3) {
                            }
                            i();
                            return byteArray;
                        } catch (Exception unused4) {
                        } catch (Throwable th3) {
                            th2 = th3;
                            if (dataOutputStream != null) {
                                try {
                                    dataOutputStream.close();
                                } catch (Exception unused5) {
                                }
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Exception unused6) {
                                }
                            }
                            if (byteArrayOutputStream != 0) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception unused7) {
                                }
                            }
                            i();
                            throw th2;
                        }
                    } catch (Exception unused8) {
                        byteArrayOutputStream = 0;
                    } catch (Throwable th4) {
                        byteArrayOutputStream = 0;
                        th2 = th4;
                    }
                } catch (Exception unused9) {
                    inputStream = null;
                    byteArrayOutputStream = inputStream;
                } catch (Throwable th5) {
                    byteArrayOutputStream = 0;
                    th2 = th5;
                    inputStream = null;
                }
            } catch (Exception unused10) {
            }
        } catch (Exception unused11) {
            dataOutputStream = null;
            inputStream = null;
        } catch (Throwable th6) {
            inputStream = null;
            byteArrayOutputStream = 0;
            th2 = th6;
            dataOutputStream = null;
        }
        if (dataOutputStream != null) {
            try {
                dataOutputStream.close();
            } catch (Exception unused12) {
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused13) {
            }
        }
        if (byteArrayOutputStream != 0) {
            byteArrayOutputStream.close();
        }
        i();
        return null;
    }

    private void i() {
        HttpURLConnection httpURLConnection = this.f64014c;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
                this.f64014c = null;
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.igexin.a.a.d.e
    public final void b() throws Exception {
        String str;
        byte[] bArr;
        super.b();
        Process.setThreadPriority(10);
        b bVar = this.f64013b;
        if (bVar == null || (str = bVar.f64015c) == null || ((bArr = bVar.f64016d) != null && bArr.length > l.f63445w * 1024)) {
            p();
            com.igexin.a.a.c.b.a(f64012a + "|run return ###", new Object[0]);
            return;
        }
        try {
            byte[] bArrA = bArr == null ? a(str) : a(str, bArr);
            if (bArrA == null) {
                Exception exc = new Exception("Http response ＝＝ null");
                this.f64013b.a(exc);
                throw exc;
            }
            try {
                this.f64013b.a(bArrA);
                com.igexin.a.a.b.c.b().a(this.f64013b);
                com.igexin.a.a.b.c.b().c();
            } catch (Exception e10) {
                this.f64013b.a(e10);
                throw e10;
            }
        } catch (Exception e11) {
            this.f64013b.a(e11);
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
