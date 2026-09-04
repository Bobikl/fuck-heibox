package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.n0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: TsPayloadReader.java */
/* JADX INFO: loaded from: classes7.dex */
public interface i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f45882a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f45883b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f45884c = 4;

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f45885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f45886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f45887c;

        public a(String str, int i10, byte[] bArr) {
            this.f45885a = str;
            this.f45886b = i10;
            this.f45887c = bArr;
        }
    }

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f45888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        public final String f45889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<a> f45890c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f45891d;

        public b(int i10, @p0 String str, @p0 List<a> list, byte[] bArr) {
            this.f45888a = i10;
            this.f45889b = str;
            this.f45890c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f45891d = bArr;
        }
    }

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public interface c {
        @p0
        i0 a(int i10, b bVar);

        SparseArray<i0> b();
    }

    /* JADX INFO: compiled from: TsPayloadReader.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f45892f = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f45893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f45894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f45895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f45896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f45897e;

        public e(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public e(int i10, int i11, int i12) {
            String string;
            if (i10 != Integer.MIN_VALUE) {
                StringBuilder sb2 = new StringBuilder(12);
                sb2.append(i10);
                sb2.append("/");
                string = sb2.toString();
            } else {
                string = "";
            }
            this.f45893a = string;
            this.f45894b = i11;
            this.f45895c = i12;
            this.f45896d = Integer.MIN_VALUE;
            this.f45897e = "";
        }

        private void d() {
            if (this.f45896d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10 = this.f45896d;
            int i11 = i10 == Integer.MIN_VALUE ? this.f45894b : i10 + this.f45895c;
            this.f45896d = i11;
            String str = this.f45893a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11);
            sb2.append(str);
            sb2.append(i11);
            this.f45897e = sb2.toString();
        }

        public String b() {
            d();
            return this.f45897e;
        }

        public int c() {
            d();
            return this.f45896d;
        }
    }

    void a(n0 n0Var, com.google.android.exoplayer2.extractor.m mVar, e eVar);

    void b();

    void c(com.google.android.exoplayer2.util.e0 e0Var, int i10) throws ParserException;
}
