package com.google.common.io;

import com.google.common.base.Optional;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: CharSource.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.c
public abstract class j {

    /* JADX INFO: compiled from: CharSource.java */
    public final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Charset f58682a;

        a(Charset charset) {
            this.f58682a = (Charset) com.google.common.base.w.E(charset);
        }

        @Override // com.google.common.io.f
        public j a(Charset charset) {
            return charset.equals(this.f58682a) ? j.this : super.a(charset);
        }

        @Override // com.google.common.io.f
        public InputStream m() throws IOException {
            return new c0(j.this.m(), this.f58682a, 8192);
        }

        public String toString() {
            String string = j.this.toString();
            String strValueOf = String.valueOf(this.f58682a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 15 + strValueOf.length());
            sb2.append(string);
            sb2.append(".asByteSource(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: CharSource.java */
    public static class b extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.common.base.z f58684b = com.google.common.base.z.m("\r\n|\n|\r");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final CharSequence f58685a;

        /* JADX INFO: compiled from: CharSource.java */
        public class a extends AbstractIterator<String> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Iterator<String> f58686d;

            a() {
                this.f58686d = b.f58684b.n(b.this.f58685a).iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public String a() {
                if (this.f58686d.hasNext()) {
                    String next = this.f58686d.next();
                    if (this.f58686d.hasNext() || !next.isEmpty()) {
                        return next;
                    }
                }
                return b();
            }
        }

        protected b(CharSequence charSequence) {
            this.f58685a = (CharSequence) com.google.common.base.w.E(charSequence);
        }

        private Iterator<String> t() {
            return new a();
        }

        @Override // com.google.common.io.j
        public boolean i() {
            return this.f58685a.length() == 0;
        }

        @Override // com.google.common.io.j
        public long j() {
            return this.f58685a.length();
        }

        @Override // com.google.common.io.j
        public Optional<Long> k() {
            return Optional.f(Long.valueOf(this.f58685a.length()));
        }

        @Override // com.google.common.io.j
        public Reader m() {
            return new h(this.f58685a);
        }

        @Override // com.google.common.io.j
        public String n() {
            return this.f58685a.toString();
        }

        @Override // com.google.common.io.j
        @CheckForNull
        public String o() {
            Iterator<String> itT = t();
            if (itT.hasNext()) {
                return itT.next();
            }
            return null;
        }

        @Override // com.google.common.io.j
        public ImmutableList<String> p() {
            return ImmutableList.w(t());
        }

        @Override // com.google.common.io.j
        @a0
        public <T> T q(u<T> uVar) throws IOException {
            Iterator<String> itT = t();
            while (itT.hasNext() && uVar.a(itT.next())) {
            }
            return uVar.getResult();
        }

        public String toString() {
            String strK = com.google.common.base.a.k(this.f58685a, 30, "...");
            StringBuilder sb2 = new StringBuilder(String.valueOf(strK).length() + 17);
            sb2.append("CharSource.wrap(");
            sb2.append(strK);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: CharSource.java */
    public static final class c extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterable<? extends j> f58688a;

        c(Iterable<? extends j> iterable) {
            this.f58688a = (Iterable) com.google.common.base.w.E(iterable);
        }

        @Override // com.google.common.io.j
        public boolean i() throws IOException {
            Iterator<? extends j> it = this.f58688a.iterator();
            while (it.hasNext()) {
                if (!it.next().i()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.j
        public long j() throws IOException {
            Iterator<? extends j> it = this.f58688a.iterator();
            long j10 = 0;
            while (it.hasNext()) {
                j10 += it.next().j();
            }
            return j10;
        }

        @Override // com.google.common.io.j
        public Optional<Long> k() {
            Iterator<? extends j> it = this.f58688a.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                Optional<Long> optionalK = it.next().k();
                if (!optionalK.e()) {
                    return Optional.a();
                }
                jLongValue += optionalK.d().longValue();
            }
            return Optional.f(Long.valueOf(jLongValue));
        }

        @Override // com.google.common.io.j
        public Reader m() throws IOException {
            return new z(this.f58688a.iterator());
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f58688a);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 19);
            sb2.append("CharSource.concat(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: CharSource.java */
    public static final class d extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final d f58689c = new d();

        private d() {
            super("");
        }

        @Override // com.google.common.io.j.b
        public String toString() {
            return "CharSource.empty()";
        }
    }

    /* JADX INFO: compiled from: CharSource.java */
    public static class e extends b {
        protected e(String str) {
            super(str);
        }

        @Override // com.google.common.io.j
        public long e(i iVar) throws Throwable {
            com.google.common.base.w.E(iVar);
            m mVarA = m.a();
            try {
                ((Writer) mVarA.b(iVar.b())).write((String) this.f58685a);
                long length = this.f58685a.length();
                mVarA.close();
                return length;
            } catch (Throwable th2) {
                try {
                    throw mVarA.c(th2);
                } catch (Throwable th3) {
                    mVarA.close();
                    throw th3;
                }
            }
        }

        @Override // com.google.common.io.j
        public long f(Appendable appendable) throws IOException {
            appendable.append(this.f58685a);
            return this.f58685a.length();
        }

        @Override // com.google.common.io.j.b, com.google.common.io.j
        public Reader m() {
            return new StringReader((String) this.f58685a);
        }
    }

    protected j() {
    }

    public static j b(Iterable<? extends j> iterable) {
        return new c(iterable);
    }

    public static j c(Iterator<? extends j> it) {
        return b(ImmutableList.w(it));
    }

    public static j d(j... jVarArr) {
        return b(ImmutableList.x(jVarArr));
    }

    private long g(Reader reader) throws IOException {
        long j10 = 0;
        while (true) {
            long jSkip = reader.skip(Long.MAX_VALUE);
            if (jSkip == 0) {
                return j10;
            }
            j10 += jSkip;
        }
    }

    public static j h() {
        return d.f58689c;
    }

    public static j r(CharSequence charSequence) {
        return charSequence instanceof String ? new e((String) charSequence) : new b(charSequence);
    }

    @o9.a
    public f a(Charset charset) {
        return new a(charset);
    }

    @s9.a
    public long e(i iVar) throws Throwable {
        com.google.common.base.w.E(iVar);
        m mVarA = m.a();
        try {
            long jB = k.b((Reader) mVarA.b(m()), (Writer) mVarA.b(iVar.b()));
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
    public long f(Appendable appendable) throws Throwable {
        com.google.common.base.w.E(appendable);
        m mVarA = m.a();
        try {
            long jB = k.b((Reader) mVarA.b(m()), appendable);
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

    public boolean i() throws Throwable {
        Optional<Long> optionalK = k();
        if (optionalK.e()) {
            return optionalK.d().longValue() == 0;
        }
        m mVarA = m.a();
        try {
            boolean z10 = ((Reader) mVarA.b(m())).read() == -1;
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

    @o9.a
    public long j() throws Throwable {
        Optional<Long> optionalK = k();
        if (optionalK.e()) {
            return optionalK.d().longValue();
        }
        m mVarA = m.a();
        try {
            long jG = g((Reader) mVarA.b(m()));
            mVarA.close();
            return jG;
        } catch (Throwable th2) {
            try {
                throw mVarA.c(th2);
            } catch (Throwable th3) {
                mVarA.close();
                throw th3;
            }
        }
    }

    @o9.a
    public Optional<Long> k() {
        return Optional.a();
    }

    public BufferedReader l() throws IOException {
        Reader readerM = m();
        return readerM instanceof BufferedReader ? (BufferedReader) readerM : new BufferedReader(readerM);
    }

    public abstract Reader m() throws IOException;

    public String n() throws Throwable {
        m mVarA = m.a();
        try {
            String strK = k.k((Reader) mVarA.b(m()));
            mVarA.close();
            return strK;
        } catch (Throwable th2) {
            try {
                throw mVarA.c(th2);
            } catch (Throwable th3) {
                mVarA.close();
                throw th3;
            }
        }
    }

    @CheckForNull
    public String o() throws Throwable {
        m mVarA = m.a();
        try {
            String line = ((BufferedReader) mVarA.b(l())).readLine();
            mVarA.close();
            return line;
        } catch (Throwable th2) {
            try {
                throw mVarA.c(th2);
            } catch (Throwable th3) {
                mVarA.close();
                throw th3;
            }
        }
    }

    public ImmutableList<String> p() throws Throwable {
        m mVarA = m.a();
        try {
            BufferedReader bufferedReader = (BufferedReader) mVarA.b(l());
            ArrayList arrayListQ = Lists.q();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    ImmutableList<String> immutableListV = ImmutableList.v(arrayListQ);
                    mVarA.close();
                    return immutableListV;
                }
                arrayListQ.add(line);
            }
        } catch (Throwable th2) {
            try {
                throw mVarA.c(th2);
            } catch (Throwable th3) {
                mVarA.close();
                throw th3;
            }
        }
    }

    @a0
    @s9.a
    @o9.a
    public <T> T q(u<T> uVar) throws Throwable {
        com.google.common.base.w.E(uVar);
        m mVarA = m.a();
        try {
            T t10 = (T) k.h((Reader) mVarA.b(m()), uVar);
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
}
