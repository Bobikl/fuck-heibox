package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.os.PersistableBundle;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: ExoMediaDrm.java */
/* JADX INFO: loaded from: classes7.dex */
public interface b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f44674a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f44675b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44676c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f44677d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f44678e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f44679f = 3;

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b0 f44680a;

        public a(b0 b0Var) {
            this.f44680a = b0Var;
        }

        @Override // com.google.android.exoplayer2.drm.b0.g
        public b0 a(UUID uuid) {
            this.f44680a.a();
            return this.f44680a;
        }
    }

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f44681d = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f44682e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f44683f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f44684g = 2;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f44685h = 3;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f44686i = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f44687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f44688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f44689c;

        /* JADX INFO: compiled from: ExoMediaDrm.java */
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public b(byte[] bArr, String str) {
            this(bArr, str, Integer.MIN_VALUE);
        }

        public b(byte[] bArr, String str, int i10) {
            this.f44687a = bArr;
            this.f44688b = str;
            this.f44689c = i10;
        }

        public byte[] a() {
            return this.f44687a;
        }

        public String b() {
            return this.f44688b;
        }

        public int c() {
            return this.f44689c;
        }
    }

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f44690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f44691b;

        public c(int i10, byte[] bArr) {
            this.f44690a = i10;
            this.f44691b = bArr;
        }

        public byte[] a() {
            return this.f44691b;
        }

        public int b() {
            return this.f44690a;
        }
    }

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public interface d {
        void a(b0 b0Var, @androidx.annotation.p0 byte[] bArr, int i10, int i11, @androidx.annotation.p0 byte[] bArr2);
    }

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public interface e {
        void a(b0 b0Var, byte[] bArr, long j10);
    }

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public interface f {
        void a(b0 b0Var, byte[] bArr, List<c> list, boolean z10);
    }

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public interface g {
        b0 a(UUID uuid);
    }

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f44692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f44693b;

        public h(byte[] bArr, String str) {
            this.f44692a = bArr;
            this.f44693b = str;
        }

        public byte[] a() {
            return this.f44692a;
        }

        public String b() {
            return this.f44693b;
        }
    }

    void a();

    void b(@androidx.annotation.p0 d dVar);

    void c(String str, byte[] bArr);

    void closeSession(byte[] bArr);

    void d(@androidx.annotation.p0 f fVar);

    void e(@androidx.annotation.p0 e eVar);

    int f();

    com.google.android.exoplayer2.decoder.c g(byte[] bArr) throws MediaCryptoException;

    @androidx.annotation.p0
    PersistableBundle getMetrics();

    String getPropertyString(String str);

    h getProvisionRequest();

    boolean h(byte[] bArr, String str);

    byte[] i(String str);

    b j(byte[] bArr, @androidx.annotation.p0 List<DrmInitData.SchemeData> list, int i10, @androidx.annotation.p0 HashMap<String, String> map) throws NotProvisionedException;

    byte[] openSession() throws MediaDrmException;

    @androidx.annotation.p0
    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    void provideProvisionResponse(byte[] bArr) throws DeniedByServerException;

    Map<String, String> queryKeyStatus(byte[] bArr);

    void release();

    void restoreKeys(byte[] bArr, byte[] bArr2);

    void setPropertyString(String str, String str2);
}
