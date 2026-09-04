package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b3;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public interface AudioSink {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f43952a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f43953b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f43954c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f43955d = Long.MIN_VALUE;

    public static final class ConfigurationException extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a2 f43956b;

        public ConfigurationException(String str, a2 a2Var) {
            super(str);
            this.f43956b = a2Var;
        }

        public ConfigurationException(Throwable th2, a2 a2Var) {
            super(th2);
            this.f43956b = a2Var;
        }
    }

    public static final class InitializationException extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f43957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f43958c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a2 f43959d;

        public InitializationException(int i10, int i11, int i12, int i13, a2 a2Var, boolean z10, @androidx.annotation.p0 Exception exc) {
            String str = z10 ? " (recoverable)" : "";
            StringBuilder sb2 = new StringBuilder(str.length() + 80);
            sb2.append("AudioTrack init failed ");
            sb2.append(i10);
            sb2.append(" ");
            sb2.append("Config(");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(i12);
            sb2.append(", ");
            sb2.append(i13);
            sb2.append(")");
            sb2.append(str);
            super(sb2.toString(), exc);
            this.f43957b = i10;
            this.f43958c = z10;
            this.f43959d = a2Var;
        }
    }

    public static final class UnexpectedDiscontinuityException extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f43960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f43961c;

        public UnexpectedDiscontinuityException(long j10, long j11) {
            StringBuilder sb2 = new StringBuilder(103);
            sb2.append("Unexpected audio track timestamp discontinuity: expected ");
            sb2.append(j11);
            sb2.append(", got ");
            sb2.append(j10);
            super(sb2.toString());
            this.f43960b = j10;
            this.f43961c = j11;
        }
    }

    public static final class WriteException extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f43962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f43963c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a2 f43964d;

        public WriteException(int i10, a2 a2Var, boolean z10) {
            StringBuilder sb2 = new StringBuilder(36);
            sb2.append("AudioTrack write failed: ");
            sb2.append(i10);
            super(sb2.toString());
            this.f43963c = z10;
            this.f43962b = i10;
            this.f43964d = a2Var;
        }
    }

    public interface a {
        void a(boolean z10);

        void b(long j10);

        void c(int i10, long j10, long j11);

        void d(long j10);

        void e();

        void f();

        void s(Exception exc);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    boolean a(a2 a2Var);

    boolean b();

    void c();

    boolean d();

    void e(b3 b3Var);

    void f(int i10);

    void flush();

    b3 g();

    void h(x xVar);

    void i(f fVar);

    void j(float f10);

    void k(boolean z10);

    void l();

    void m();

    boolean n();

    boolean o(ByteBuffer byteBuffer, long j10, int i10) throws WriteException, InitializationException;

    void p(a aVar);

    void pause();

    void play();

    int q(a2 a2Var);

    void r() throws WriteException;

    void reset();

    long s(boolean z10);

    void t();

    void u(a2 a2Var, int i10, @androidx.annotation.p0 int[] iArr) throws ConfigurationException;
}
