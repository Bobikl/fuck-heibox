package com.efs.sdk.net;

import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.net.a.a.f;
import com.efs.sdk.net.a.a.g;
import com.efs.sdk.net.a.a.h;
import dl.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.InflaterOutputStream;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.i;
import okhttp3.u;
import okhttp3.v;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

/* JADX INFO: loaded from: classes6.dex */
public class OkHttpInterceptor implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f42681a = g.c();

    public static final class a extends d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d0 f42682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final BufferedSource f42683b;

        public a(d0 d0Var, InputStream inputStream) {
            this.f42682a = d0Var;
            this.f42683b = Okio.buffer(Okio.source(inputStream));
        }

        @Override // okhttp3.d0
        /* JADX INFO: renamed from: contentLength */
        public final long getContentLength() {
            return this.f42682a.getContentLength();
        }

        @Override // okhttp3.d0
        /* JADX INFO: renamed from: contentType */
        public final v getF132480d() {
            return this.f42682a.getF132480d();
        }

        @Override // okhttp3.d0
        /* JADX INFO: renamed from: source */
        public final BufferedSource getBodySource() {
            return this.f42683b;
        }
    }

    public static final class b implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f42684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a0 f42685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h f42686c;

        public b(String str, a0 a0Var, h hVar) {
            this.f42684a = str;
            this.f42685b = a0Var;
            this.f42686c = hVar;
        }

        @Override // com.efs.sdk.net.a.a.f.b
        public final String a() {
            return this.f42684a;
        }

        @Override // com.efs.sdk.net.a.a.f.a
        public final String b() {
            return this.f42685b.q().getUrl();
        }

        @Override // com.efs.sdk.net.a.a.f.a
        public final String c() {
            return this.f42685b.m();
        }

        @Override // com.efs.sdk.net.a.a.f.a
        @e
        public final byte[] d() throws IOException {
            OutputStream inflaterOutputStream;
            b0 b0VarF = this.f42685b.f();
            if (b0VarF == null) {
                return null;
            }
            h hVar = this.f42686c;
            String strI = this.f42685b.i("Content-Encoding");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if ("gzip".equals(strI)) {
                inflaterOutputStream = com.efs.sdk.net.a.a.e.a(byteArrayOutputStream);
            } else {
                inflaterOutputStream = "deflate".equals(strI) ? new InflaterOutputStream(byteArrayOutputStream) : byteArrayOutputStream;
            }
            com.efs.sdk.net.a.a.a aVar = new com.efs.sdk.net.a.a.a(inflaterOutputStream);
            hVar.f42713c = aVar;
            hVar.f42712b = byteArrayOutputStream;
            BufferedSink bufferedSinkBuffer = Okio.buffer(Okio.sink(aVar));
            try {
                b0VarF.writeTo(bufferedSinkBuffer);
                bufferedSinkBuffer.close();
                h hVar2 = this.f42686c;
                hVar2.b();
                return hVar2.f42712b.toByteArray();
            } catch (Throwable th2) {
                bufferedSinkBuffer.close();
                throw th2;
            }
        }
    }

    public static final class c implements f.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f42687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a0 f42688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c0 f42689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @e
        private final i f42690d;

        public c(String str, a0 a0Var, c0 c0Var, @e i iVar) {
            this.f42687a = str;
            this.f42688b = a0Var;
            this.f42689c = c0Var;
            this.f42690d = iVar;
        }

        @Override // com.efs.sdk.net.a.a.f.d
        public final String a() {
            return this.f42687a;
        }

        @Override // com.efs.sdk.net.a.a.f.d
        public final int b() {
            return this.f42689c.x();
        }
    }

    @Override // okhttp3.u
    public c0 intercept(u.a aVar) throws IOException {
        String str;
        boolean z10;
        h hVar;
        h hVar2;
        boolean zEnableTracer;
        String strB;
        v f132480d;
        InputStream inputStreamByteStream;
        a0 a0VarRequest = aVar.request();
        try {
            Log.d("NetTrace-Interceptor", "begin intercept");
            zEnableTracer = NetManager.getNetConfigManager() != null ? NetManager.getNetConfigManager().enableTracer() : false;
            if (zEnableTracer || IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                if (a0VarRequest != null) {
                    Log.d("NetTrace-Interceptor", "intercept request is " + a0VarRequest.toString());
                } else {
                    Log.d("NetTrace-Interceptor", "intercept request is null~");
                }
                strB = this.f42681a.b();
                try {
                    Log.d("NetTrace-Interceptor", "intercept request id is ".concat(String.valueOf(strB)));
                    com.efs.sdk.net.a.a.a().a(strB).f42717c = a0VarRequest.q().getUrl();
                    hVar2 = new h(this.f42681a, strB);
                    try {
                        this.f42681a.a(new b(strB, a0VarRequest, hVar2));
                    } catch (Throwable th2) {
                        boolean z11 = zEnableTracer;
                        hVar = hVar2;
                        th = th2;
                        str = strB;
                        z10 = z11;
                        th.printStackTrace();
                        hVar2 = hVar;
                        zEnableTracer = z10;
                        strB = str;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = strB;
                    z10 = zEnableTracer;
                    hVar = null;
                }
            } else {
                Log.d("NetTrace-Interceptor", "net enable is false~");
                hVar2 = null;
                strB = null;
            }
        } catch (Throwable th4) {
            th = th4;
            str = null;
            z10 = false;
            hVar = null;
        }
        c0 c0VarProceed = aVar.proceed(a0VarRequest);
        if (!zEnableTracer) {
            try {
                if (!IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                    return c0VarProceed;
                }
            } catch (Throwable th5) {
                th5.printStackTrace();
                return c0VarProceed;
            }
        }
        if (hVar2 != null && hVar2.a()) {
            hVar2.b();
            f fVar = hVar2.f42711a;
            hVar2.f42712b.size();
            fVar.a();
        }
        i iVarConnection = aVar.connection();
        if (iVarConnection == null) {
            throw new IllegalStateException("No connection associated with this request; did you use addInterceptor instead of addNetworkInterceptor?");
        }
        this.f42681a.a(new c(strB, a0VarRequest, c0VarProceed, iVarConnection));
        d0 d0VarQ = c0VarProceed.q();
        if (d0VarQ != null) {
            f132480d = d0VarQ.getF132480d();
            inputStreamByteStream = d0VarQ.byteStream();
        } else {
            f132480d = null;
            inputStreamByteStream = null;
        }
        f fVar2 = this.f42681a;
        String mediaType = f132480d != null ? f132480d.getMediaType() : null;
        String strC = c0VarProceed.C("Content-Encoding");
        new com.efs.sdk.net.a.a.c(this.f42681a, strB);
        InputStream inputStreamA = fVar2.a(strB, mediaType, strC, inputStreamByteStream);
        return inputStreamA != null ? c0VarProceed.P().b(new a(d0VarQ, inputStreamA)).c() : c0VarProceed;
    }
}
