package com.tencent.beacon.base.net.adapter;

import com.tencent.beacon.base.net.a.m;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: HttpAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public class c extends a {
    private com.tencent.beacon.base.net.a a(String str, String str2, Map<String, String> map, byte[] bArr) throws Throwable {
        HttpURLConnection httpURLConnectionA = a(str, str2, map);
        httpURLConnectionA.connect();
        OutputStream outputStream = httpURLConnectionA.getOutputStream();
        if (outputStream != null && bArr != null) {
            outputStream.write(bArr);
            outputStream.close();
        }
        return new com.tencent.beacon.base.net.a(httpURLConnectionA.getHeaderFields(), httpURLConnectionA.getResponseCode(), httpURLConnectionA.getResponseMessage(), a(httpURLConnectionA.getInputStream()));
    }

    private HttpURLConnection a(String str, String str2, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        return httpURLConnection;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0045: MOVE (r7 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:22:0x0045 */
    private byte[] a(InputStream inputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        IOException e10;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int i10 = inputStream.read(bArr);
                        if (i10 == -1) {
                            byteArrayOutputStream.flush();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            inputStream.close();
                            com.tencent.beacon.base.util.b.a(inputStream, byteArrayOutputStream);
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr, 0, i10);
                    }
                } catch (IOException e11) {
                    e10 = e11;
                    com.tencent.beacon.base.util.c.a(e10);
                    com.tencent.beacon.base.util.b.a(inputStream, byteArrayOutputStream);
                    throw e10;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable2 = closeable;
                com.tencent.beacon.base.util.b.a(inputStream, closeable2);
                throw th;
            }
        } catch (IOException e12) {
            byteArrayOutputStream = null;
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            com.tencent.beacon.base.util.b.a(inputStream, closeable2);
            throw th;
        }
    }

    private byte[] buildBody(com.tencent.beacon.base.net.a.f fVar) throws UnsupportedEncodingException {
        int i10 = b.f98898a[fVar.a().ordinal()];
        if (i10 == 1) {
            return fVar.c();
        }
        if (i10 == 2) {
            return com.tencent.beacon.base.net.c.d.b(fVar.d()).getBytes("UTF-8");
        }
        if (i10 != 3) {
            return null;
        }
        return fVar.f().getBytes("UTF-8");
    }

    @Override // com.tencent.beacon.base.net.adapter.a
    public void request(com.tencent.beacon.base.net.a.f fVar, com.tencent.beacon.base.net.a.b<com.tencent.beacon.base.net.a> bVar) {
        String strH = fVar.h();
        try {
            com.tencent.beacon.base.net.a aVarA = a(fVar.i(), fVar.g().name(), fVar.e(), buildBody(fVar));
            int i10 = aVarA.f98847b;
            if (i10 != 200) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("response status code != 2XX. msg: ");
                sb2.append(aVarA.f98848c);
                bVar.a(new com.tencent.beacon.base.net.e(strH, "452", i10, sb2.toString()));
            } else {
                bVar.a(aVarA);
            }
        } catch (ConnectException e10) {
            com.tencent.beacon.base.util.c.a(e10);
            bVar.a(new com.tencent.beacon.base.net.e(strH, "451", -1, "https connect timeout: " + e10.getMessage(), e10));
        } catch (Throwable th2) {
            com.tencent.beacon.base.util.c.a(th2);
            bVar.a(new com.tencent.beacon.base.net.e(strH, "499", -1, "https connect error: " + th2.getMessage(), th2));
        }
    }

    @Override // com.tencent.beacon.base.net.adapter.a
    public void request(m mVar, com.tencent.beacon.base.net.a.b<byte[]> bVar) {
        String strName = mVar.g().name();
        try {
            com.tencent.beacon.base.net.a aVarA = a(mVar.h(), "POST", mVar.d(), mVar.b());
            int i10 = aVarA.f98847b;
            if (i10 != 200) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("response status code != 2XX. msg: ");
                sb2.append(aVarA.f98848c);
                bVar.a(new com.tencent.beacon.base.net.e(strName, "452", i10, sb2.toString()));
                return;
            }
            if (com.tencent.beacon.base.net.c.d.a(aVarA.f98846a)) {
                bVar.a(aVarA.f98849d);
            } else {
                bVar.a(new com.tencent.beacon.base.net.e(strName, "454", aVarA.f98847b, "server encrypt-status error!"));
            }
        } catch (ConnectException e10) {
            com.tencent.beacon.base.util.c.a(e10);
            bVar.a(new com.tencent.beacon.base.net.e(strName, "451", -1, "https connect timeout: " + e10.getMessage(), e10));
            com.tencent.beacon.base.net.d.c().b(this);
        } catch (Throwable th2) {
            com.tencent.beacon.base.util.c.a(th2);
            bVar.a(new com.tencent.beacon.base.net.e(strName, "499", -1, "https connect error: " + th2.getMessage(), th2));
            com.tencent.beacon.base.net.d.c().b(this);
        }
    }
}
