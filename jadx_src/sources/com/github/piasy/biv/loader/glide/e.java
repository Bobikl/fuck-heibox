package com.github.piasy.biv.loader.glide;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.model.h;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.t;
import okhttp3.u;
import okhttp3.v;
import okhttp3.z;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

/* JADX INFO: compiled from: GlideProgressSupport.java */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: compiled from: GlideProgressSupport.java */
    public static final class a implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0368e f43436a;

        a(InterfaceC0368e interfaceC0368e) {
            this.f43436a = interfaceC0368e;
        }

        @Override // okhttp3.u
        public c0 intercept(u.a aVar) throws IOException {
            a0 a0VarRequest = aVar.request();
            c0 c0VarProceed = aVar.proceed(a0VarRequest);
            return c0VarProceed.P().b(new c(a0VarRequest.q(), c0VarProceed.q(), this.f43436a)).c();
        }
    }

    /* JADX INFO: compiled from: GlideProgressSupport.java */
    public static class b implements InterfaceC0368e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map<String, d> f43437a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Map<String, Integer> f43438b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f43439c = "\\?";

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        static void b(String str, d dVar) {
            f43437a.put(d(str), dVar);
        }

        static void c(String str) {
            f43437a.remove(d(str));
            f43438b.remove(d(str));
        }

        private static String d(String str) {
            return str.split(f43439c)[0];
        }

        @Override // com.github.piasy.biv.loader.glide.e.InterfaceC0368e
        public void a(t tVar, long j10, long j11) {
            String strD = d(tVar.getUrl());
            d dVar = f43437a.get(strD);
            if (dVar == null) {
                return;
            }
            Map<String, Integer> map = f43438b;
            Integer num = map.get(strD);
            if (num == null) {
                dVar.a();
            }
            if (j11 <= j10) {
                dVar.onDownloadFinish();
                c(strD);
                return;
            }
            int i10 = (int) ((j10 / j11) * 100.0f);
            if (num == null || i10 != num.intValue()) {
                map.put(strD, Integer.valueOf(i10));
                dVar.onProgress(i10);
            }
        }
    }

    /* JADX INFO: compiled from: GlideProgressSupport.java */
    public static class c extends d0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final t f43440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d0 f43441d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final InterfaceC0368e f43442e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private BufferedSource f43443f;

        /* JADX INFO: compiled from: GlideProgressSupport.java */
        public class a extends ForwardingSource {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f43444b;

            a(Source source) {
                super(source);
                this.f43444b = 0L;
            }

            @Override // okio.ForwardingSource, okio.Source
            public long read(Buffer buffer, long j10) throws IOException {
                long j11 = super.read(buffer, j10);
                long f132481e = c.this.f43441d.getF132481e();
                if (j11 == -1) {
                    this.f43444b = f132481e;
                } else {
                    this.f43444b += j11;
                }
                c.this.f43442e.a(c.this.f43440c, this.f43444b, f132481e);
                return j11;
            }
        }

        c(t tVar, d0 d0Var, InterfaceC0368e interfaceC0368e) {
            this.f43440c = tVar;
            this.f43441d = d0Var;
            this.f43442e = interfaceC0368e;
        }

        private Source d(Source source) {
            return new a(source);
        }

        @Override // okhttp3.d0
        /* JADX INFO: renamed from: contentLength */
        public long getF132481e() {
            return this.f43441d.getF132481e();
        }

        @Override // okhttp3.d0
        /* JADX INFO: renamed from: contentType */
        public v getF132480d() {
            return this.f43441d.getF132480d();
        }

        @Override // okhttp3.d0
        /* JADX INFO: renamed from: source */
        public BufferedSource getF132479c() {
            if (this.f43443f == null) {
                this.f43443f = Okio.buffer(d(this.f43441d.getF132479c()));
            }
            return this.f43443f;
        }
    }

    /* JADX INFO: compiled from: GlideProgressSupport.java */
    public interface d {
        void a();

        void onDownloadFinish();

        void onProgress(int i10);
    }

    /* JADX INFO: renamed from: com.github.piasy.biv.loader.glide.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GlideProgressSupport.java */
    public interface InterfaceC0368e {
        void a(t tVar, long j10, long j11);
    }

    private static u a(InterfaceC0368e interfaceC0368e) {
        return new a(interfaceC0368e);
    }

    public static void b(String str, d dVar) {
        b.b(str, dVar);
    }

    public static void c(String str) {
        b.c(str);
    }

    public static void d(Glide glide, z zVar) {
        z.a aVarE0 = zVar != null ? zVar.e0() : new z.a();
        aVarE0.d(a(new b(null)));
        glide.n().y(h.class, InputStream.class, new com.bumptech.glide.integration.okhttp3.b.a(aVarE0.f()));
    }
}
