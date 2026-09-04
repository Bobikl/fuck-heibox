package com.google.common.io;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.hash.Funnels;
import com.google.common.hash.HashCode;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: ByteSource.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.c
public abstract class f {

    /* JADX INFO: compiled from: ByteSource.java */
    public class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Charset f58659a;

        a(Charset charset) {
            this.f58659a = (Charset) com.google.common.base.w.E(charset);
        }

        @Override // com.google.common.io.j
        public f a(Charset charset) {
            return charset.equals(this.f58659a) ? f.this : super.a(charset);
        }

        @Override // com.google.common.io.j
        public Reader m() throws IOException {
            return new InputStreamReader(f.this.m(), this.f58659a);
        }

        @Override // com.google.common.io.j
        public String n() throws IOException {
            return new String(f.this.o(), this.f58659a);
        }

        public String toString() {
            String string = f.this.toString();
            String strValueOf = String.valueOf(this.f58659a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 15 + strValueOf.length());
            sb2.append(string);
            sb2.append(".asCharSource(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: ByteSource.java */
    public static class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final byte[] f58661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f58662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f58663c;

        b(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        b(byte[] bArr, int i10, int i11) {
            this.f58661a = bArr;
            this.f58662b = i10;
            this.f58663c = i11;
        }

        @Override // com.google.common.io.f
        public long g(OutputStream outputStream) throws IOException {
            outputStream.write(this.f58661a, this.f58662b, this.f58663c);
            return this.f58663c;
        }

        @Override // com.google.common.io.f
        public HashCode j(com.google.common.hash.k kVar) throws IOException {
            return kVar.k(this.f58661a, this.f58662b, this.f58663c);
        }

        @Override // com.google.common.io.f
        public boolean k() {
            return this.f58663c == 0;
        }

        @Override // com.google.common.io.f
        public InputStream l() throws IOException {
            return m();
        }

        @Override // com.google.common.io.f
        public InputStream m() {
            return new ByteArrayInputStream(this.f58661a, this.f58662b, this.f58663c);
        }

        @Override // com.google.common.io.f
        @a0
        public <T> T n(com.google.common.io.d<T> dVar) throws IOException {
            dVar.a(this.f58661a, this.f58662b, this.f58663c);
            return dVar.getResult();
        }

        @Override // com.google.common.io.f
        public byte[] o() {
            byte[] bArr = this.f58661a;
            int i10 = this.f58662b;
            return Arrays.copyOfRange(bArr, i10, this.f58663c + i10);
        }

        @Override // com.google.common.io.f
        public long p() {
            return this.f58663c;
        }

        @Override // com.google.common.io.f
        public Optional<Long> q() {
            return Optional.f(Long.valueOf(this.f58663c));
        }

        @Override // com.google.common.io.f
        public f r(long j10, long j11) {
            com.google.common.base.w.p(j10 >= 0, "offset (%s) may not be negative", j10);
            com.google.common.base.w.p(j11 >= 0, "length (%s) may not be negative", j11);
            long jMin = Math.min(j10, this.f58663c);
            return new b(this.f58661a, this.f58662b + ((int) jMin), (int) Math.min(j11, ((long) this.f58663c) - jMin));
        }

        public String toString() {
            String strK = com.google.common.base.a.k(BaseEncoding.a().m(this.f58661a, this.f58662b, this.f58663c), 30, "...");
            StringBuilder sb2 = new StringBuilder(String.valueOf(strK).length() + 17);
            sb2.append("ByteSource.wrap(");
            sb2.append(strK);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: ByteSource.java */
    public static final class c extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterable<? extends f> f58664a;

        c(Iterable<? extends f> iterable) {
            this.f58664a = (Iterable) com.google.common.base.w.E(iterable);
        }

        @Override // com.google.common.io.f
        public boolean k() throws IOException {
            Iterator<? extends f> it = this.f58664a.iterator();
            while (it.hasNext()) {
                if (!it.next().k()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.f
        public InputStream m() throws IOException {
            return new y(this.f58664a.iterator());
        }

        @Override // com.google.common.io.f
        public long p() throws IOException {
            Iterator<? extends f> it = this.f58664a.iterator();
            long jP = 0;
            while (it.hasNext()) {
                jP += it.next().p();
                if (jP < 0) {
                    return Long.MAX_VALUE;
                }
            }
            return jP;
        }

        @Override // com.google.common.io.f
        public Optional<Long> q() {
            Iterable<? extends f> iterable = this.f58664a;
            if (!(iterable instanceof Collection)) {
                return Optional.a();
            }
            Iterator<? extends f> it = iterable.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                Optional<Long> optionalQ = it.next().q();
                if (!optionalQ.e()) {
                    return Optional.a();
                }
                jLongValue += optionalQ.d().longValue();
                if (jLongValue < 0) {
                    return Optional.f(Long.MAX_VALUE);
                }
            }
            return Optional.f(Long.valueOf(jLongValue));
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f58664a);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 19);
            sb2.append("ByteSource.concat(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: ByteSource.java */
    public static final class d extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final d f58665d = new d();

        d() {
            super(new byte[0]);
        }

        @Override // com.google.common.io.f
        public j a(Charset charset) {
            com.google.common.base.w.E(charset);
            return j.h();
        }

        @Override // com.google.common.io.f.b, com.google.common.io.f
        public byte[] o() {
            return this.f58661a;
        }

        @Override // com.google.common.io.f.b
        public String toString() {
            return "ByteSource.empty()";
        }
    }

    /* JADX INFO: compiled from: ByteSource.java */
    public final class e extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f58666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f58667b;

        e(long j10, long j11) {
            com.google.common.base.w.p(j10 >= 0, "offset (%s) may not be negative", j10);
            com.google.common.base.w.p(j11 >= 0, "length (%s) may not be negative", j11);
            this.f58666a = j10;
            this.f58667b = j11;
        }

        private InputStream t(InputStream inputStream) throws Throwable {
            long j10 = this.f58666a;
            if (j10 > 0) {
                try {
                    if (g.t(inputStream, j10) < this.f58666a) {
                        inputStream.close();
                        return new ByteArrayInputStream(new byte[0]);
                    }
                } catch (Throwable th2) {
                    m mVarA = m.a();
                    mVarA.b(inputStream);
                    try {
                        throw mVarA.c(th2);
                    } catch (Throwable th3) {
                        mVarA.close();
                        throw th3;
                    }
                }
            }
            return g.f(inputStream, this.f58667b);
        }

        @Override // com.google.common.io.f
        public boolean k() throws IOException {
            return this.f58667b == 0 || super.k();
        }

        @Override // com.google.common.io.f
        public InputStream l() throws IOException {
            return t(f.this.l());
        }

        @Override // com.google.common.io.f
        public InputStream m() throws IOException {
            return t(f.this.m());
        }

        @Override // com.google.common.io.f
        public Optional<Long> q() {
            Optional<Long> optionalQ = f.this.q();
            if (!optionalQ.e()) {
                return Optional.a();
            }
            long jLongValue = optionalQ.d().longValue();
            return Optional.f(Long.valueOf(Math.min(this.f58667b, jLongValue - Math.min(this.f58666a, jLongValue))));
        }

        @Override // com.google.common.io.f
        public f r(long j10, long j11) {
            com.google.common.base.w.p(j10 >= 0, "offset (%s) may not be negative", j10);
            com.google.common.base.w.p(j11 >= 0, "length (%s) may not be negative", j11);
            long j12 = this.f58667b - j10;
            return j12 <= 0 ? f.i() : f.this.r(this.f58666a + j10, Math.min(j11, j12));
        }

        public String toString() {
            String string = f.this.toString();
            long j10 = this.f58666a;
            long j11 = this.f58667b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 50);
            sb2.append(string);
            sb2.append(".slice(");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(j11);
            sb2.append(")");
            return sb2.toString();
        }
    }

    protected f() {
    }

    public static f b(Iterable<? extends f> iterable) {
        return new c(iterable);
    }

    public static f c(Iterator<? extends f> it) {
        return b(ImmutableList.w(it));
    }

    public static f d(f... fVarArr) {
        return b(ImmutableList.x(fVarArr));
    }

    private long h(InputStream inputStream) throws IOException {
        long j10 = 0;
        while (true) {
            long jT = g.t(inputStream, 2147483647L);
            if (jT <= 0) {
                return j10;
            }
            j10 += jT;
        }
    }

    public static f i() {
        return d.f58665d;
    }

    public static f s(byte[] bArr) {
        return new b(bArr);
    }

    public j a(Charset charset) {
        return new a(charset);
    }

    public boolean e(f fVar) throws Throwable {
        int iN;
        com.google.common.base.w.E(fVar);
        byte[] bArrD = g.d();
        byte[] bArrD2 = g.d();
        m mVarA = m.a();
        try {
            InputStream inputStream = (InputStream) mVarA.b(m());
            InputStream inputStream2 = (InputStream) mVarA.b(fVar.m());
            do {
                iN = g.n(inputStream, bArrD, 0, bArrD.length);
                if (iN == g.n(inputStream2, bArrD2, 0, bArrD2.length) && Arrays.equals(bArrD, bArrD2)) {
                }
                mVarA.close();
                return false;
            } while (iN == bArrD.length);
            mVarA.close();
            return true;
        } catch (Throwable th2) {
            try {
                throw mVarA.c(th2);
            } catch (Throwable th3) {
                mVarA.close();
                throw th3;
            }
        }
    }

    @s9.a
    public long f(com.google.common.io.e eVar) throws Throwable {
        com.google.common.base.w.E(eVar);
        m mVarA = m.a();
        try {
            long jB = g.b((InputStream) mVarA.b(m()), (OutputStream) mVarA.b(eVar.c()));
            mVarA.close();
            return jB;
        } catch (Throwable th2) {
            try {
                throw mVarA.c(th2);
            } catch (Throwable th3) {
                mVarA.close();
                throw th3;
            }
        }
    }

    @s9.a
    public long g(OutputStream outputStream) throws Throwable {
        com.google.common.base.w.E(outputStream);
        m mVarA = m.a();
        try {
            long jB = g.b((InputStream) mVarA.b(m()), outputStream);
            mVarA.close();
            return jB;
        } catch (Throwable th2) {
            try {
                throw mVarA.c(th2);
            } catch (Throwable th3) {
                mVarA.close();
                throw th3;
            }
        }
    }

    public HashCode j(com.google.common.hash.k kVar) throws Throwable {
        com.google.common.hash.m mVarI = kVar.i();
        g(Funnels.a(mVarI));
        return mVarI.n();
    }

    public boolean k() throws Throwable {
        Optional<Long> optionalQ = q();
        if (optionalQ.e()) {
            return optionalQ.d().longValue() == 0;
        }
        m mVarA = m.a();
        try {
            boolean z10 = ((InputStream) mVarA.b(m())).read() == -1;
            mVarA.close();
            return z10;
        } catch (Throwable th2) {
            try {
                throw mVarA.c(th2);
            } catch (Throwable th3) {
                mVarA.close();
                throw th3;
            }
        }
    }

    public InputStream l() throws IOException {
        InputStream inputStreamM = m();
        return inputStreamM instanceof BufferedInputStream ? (BufferedInputStream) inputStreamM : new BufferedInputStream(inputStreamM);
    }

    public abstract InputStream m() throws IOException;

    @o9.a
    @s9.a
    public <T> T n(com.google.common.io.d<T> dVar) throws Throwable {
        com.google.common.base.w.E(dVar);
        m mVarA = m.a();
        try {
            T t10 = (T) g.o((InputStream) mVarA.b(m()), dVar);
            mVarA.close();
            return t10;
        } catch (Throwable th2) {
            try {
                throw mVarA.c(th2);
            } catch (Throwable th3) {
                mVarA.close();
                throw th3;
            }
        }
    }

    public byte[] o() throws Throwable {
        m mVarA = m.a();
        try {
            InputStream inputStream = (InputStream) mVarA.b(m());
            Optional<Long> optionalQ = q();
            byte[] bArrV = optionalQ.e() ? g.v(inputStream, optionalQ.d().longValue()) : g.u(inputStream);
            mVarA.close();
            return bArrV;
        } catch (Throwable th2) {
            try {
                throw mVarA.c(th2);
            } catch (Throwable th3) {
                mVarA.close();
                throw th3;
            }
        }
    }

    public long p() throws Throwable {
        Optional<Long> optionalQ = q();
        if (optionalQ.e()) {
            return optionalQ.d().longValue();
        }
        m mVarA = m.a();
        try {
            long jH = h((InputStream) mVarA.b(m()));
            mVarA.close();
            return jH;
        } catch (IOException unused) {
            mVarA.close();
            m mVarA2 = m.a();
            try {
                long jE = g.e((InputStream) mVarA2.b(m()));
                mVarA2.close();
                return jE;
            } catch (Throwable th2) {
                try {
                    throw mVarA2.c(th2);
                } catch (Throwable th3) {
                    mVarA2.close();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            mVarA.close();
            throw th4;
        }
    }

    @o9.a
    public Optional<Long> q() {
        return Optional.a();
    }

    public f r(long j10, long j11) {
        return new e(j10, j11);
    }
}
