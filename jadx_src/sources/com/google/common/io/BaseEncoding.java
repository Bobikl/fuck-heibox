package com.google.common.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@p
@o9.b(emulated = true)
public abstract class BaseEncoding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final BaseEncoding f58594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final BaseEncoding f58595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final BaseEncoding f58596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final BaseEncoding f58597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final BaseEncoding f58598e;

    public static final class DecodingException extends IOException {
        DecodingException(String str) {
            super(str);
        }

        DecodingException(Throwable th2) {
            super(th2);
        }
    }

    public class a extends com.google.common.io.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.io.i f58599a;

        a(com.google.common.io.i iVar) {
            this.f58599a = iVar;
        }

        @Override // com.google.common.io.e
        public OutputStream c() throws IOException {
            return BaseEncoding.this.p(this.f58599a.b());
        }
    }

    public class b extends com.google.common.io.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.io.j f58601a;

        b(com.google.common.io.j jVar) {
            this.f58601a = jVar;
        }

        @Override // com.google.common.io.f
        public InputStream m() throws IOException {
            return BaseEncoding.this.k(this.f58601a.m());
        }
    }

    public class c extends Reader {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Reader f58603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f58604c;

        c(Reader reader, String str) {
            this.f58603b = reader;
            this.f58604c = str;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f58603b.close();
        }

        @Override // java.io.Reader
        public int read() throws IOException {
            int i10;
            do {
                i10 = this.f58603b.read();
                if (i10 == -1) {
                    break;
                }
            } while (this.f58604c.indexOf((char) i10) >= 0);
            return i10;
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    public class d implements Appendable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f58605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f58606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Appendable f58607d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f58608e;

        d(int i10, Appendable appendable, String str) {
            this.f58606c = i10;
            this.f58607d = appendable;
            this.f58608e = str;
            this.f58605b = i10;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) throws IOException {
            if (this.f58605b == 0) {
                this.f58607d.append(this.f58608e);
                this.f58605b = this.f58606c;
            }
            this.f58607d.append(c10);
            this.f58605b--;
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@CheckForNull CharSequence charSequence) {
            throw new UnsupportedOperationException();
        }

        @Override // java.lang.Appendable
        public Appendable append(@CheckForNull CharSequence charSequence, int i10, int i11) {
            throw new UnsupportedOperationException();
        }
    }

    public class e extends Writer {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Appendable f58609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Writer f58610c;

        e(Appendable appendable, Writer writer) {
            this.f58609b = appendable;
            this.f58610c = writer;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f58610c.close();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            this.f58610c.flush();
        }

        @Override // java.io.Writer
        public void write(int i10) throws IOException {
            this.f58609b.append((char) i10);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f58611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char[] f58612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f58613c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f58614d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f58615e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f58616f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f58617g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean[] f58618h;

        f(String str, char[] cArr) {
            this.f58611a = (String) com.google.common.base.w.E(str);
            this.f58612b = (char[]) com.google.common.base.w.E(cArr);
            try {
                int iP = com.google.common.math.f.p(cArr.length, RoundingMode.UNNECESSARY);
                this.f58614d = iP;
                int iMin = Math.min(8, Integer.lowestOneBit(iP));
                try {
                    this.f58615e = 8 / iMin;
                    this.f58616f = iP / iMin;
                    this.f58613c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i10 = 0; i10 < cArr.length; i10++) {
                        char c10 = cArr[i10];
                        com.google.common.base.w.f(c10 < 128, "Non-ASCII character: %s", c10);
                        com.google.common.base.w.f(bArr[c10] == -1, "Duplicate character: %s", c10);
                        bArr[c10] = (byte) i10;
                    }
                    this.f58617g = bArr;
                    boolean[] zArr = new boolean[this.f58615e];
                    for (int i11 = 0; i11 < this.f58616f; i11++) {
                        zArr[com.google.common.math.f.g(i11 * 8, this.f58614d, RoundingMode.CEILING)] = true;
                    }
                    this.f58618h = zArr;
                } catch (ArithmeticException e10) {
                    String str2 = new String(cArr);
                    throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e10);
                }
            } catch (ArithmeticException e11) {
                int length = cArr.length;
                StringBuilder sb2 = new StringBuilder(35);
                sb2.append("Illegal alphabet length ");
                sb2.append(length);
                throw new IllegalArgumentException(sb2.toString(), e11);
            }
        }

        private boolean e() {
            for (char c10 : this.f58612b) {
                if (com.google.common.base.a.c(c10)) {
                    return true;
                }
            }
            return false;
        }

        private boolean f() {
            for (char c10 : this.f58612b) {
                if (com.google.common.base.a.d(c10)) {
                    return true;
                }
            }
            return false;
        }

        boolean b(char c10) {
            return c10 <= 127 && this.f58617g[c10] != -1;
        }

        int c(char c10) throws DecodingException {
            if (c10 > 127) {
                String strValueOf = String.valueOf(Integer.toHexString(c10));
                throw new DecodingException(strValueOf.length() != 0 ? "Unrecognized character: 0x".concat(strValueOf) : new String("Unrecognized character: 0x"));
            }
            byte b10 = this.f58617g[c10];
            if (b10 != -1) {
                return b10;
            }
            if (c10 <= ' ' || c10 == 127) {
                String strValueOf2 = String.valueOf(Integer.toHexString(c10));
                throw new DecodingException(strValueOf2.length() != 0 ? "Unrecognized character: 0x".concat(strValueOf2) : new String("Unrecognized character: 0x"));
            }
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Unrecognized character: ");
            sb2.append(c10);
            throw new DecodingException(sb2.toString());
        }

        char d(int i10) {
            return this.f58612b[i10];
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof f) {
                return Arrays.equals(this.f58612b, ((f) obj).f58612b);
            }
            return false;
        }

        boolean g(int i10) {
            return this.f58618h[i10 % this.f58615e];
        }

        f h() {
            if (!f()) {
                return this;
            }
            com.google.common.base.w.h0(!e(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f58612b.length];
            int i10 = 0;
            while (true) {
                char[] cArr2 = this.f58612b;
                if (i10 >= cArr2.length) {
                    return new f(String.valueOf(this.f58611a).concat(".lowerCase()"), cArr);
                }
                cArr[i10] = com.google.common.base.a.e(cArr2[i10]);
                i10++;
            }
        }

        public int hashCode() {
            return Arrays.hashCode(this.f58612b);
        }

        public boolean i(char c10) {
            byte[] bArr = this.f58617g;
            return c10 < bArr.length && bArr[c10] != -1;
        }

        f j() {
            if (!e()) {
                return this;
            }
            com.google.common.base.w.h0(!f(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f58612b.length];
            int i10 = 0;
            while (true) {
                char[] cArr2 = this.f58612b;
                if (i10 >= cArr2.length) {
                    return new f(String.valueOf(this.f58611a).concat(".upperCase()"), cArr);
                }
                cArr[i10] = com.google.common.base.a.h(cArr2[i10]);
                i10++;
            }
        }

        public String toString() {
            return this.f58611a;
        }
    }

    public static final class g extends j {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final char[] f58619j;

        private g(f fVar) {
            super(fVar, null);
            this.f58619j = new char[512];
            com.google.common.base.w.d(fVar.f58612b.length == 16);
            for (int i10 = 0; i10 < 256; i10++) {
                this.f58619j[i10] = fVar.d(i10 >>> 4);
                this.f58619j[i10 | 256] = fVar.d(i10 & 15);
            }
        }

        g(String str, String str2) {
            this(new f(str, str2.toCharArray()));
        }

        @Override // com.google.common.io.BaseEncoding.j
        BaseEncoding D(f fVar, @CheckForNull Character ch2) {
            return new g(fVar);
        }

        @Override // com.google.common.io.BaseEncoding.j, com.google.common.io.BaseEncoding
        int i(byte[] bArr, CharSequence charSequence) throws DecodingException {
            com.google.common.base.w.E(bArr);
            if (charSequence.length() % 2 == 1) {
                int length = charSequence.length();
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Invalid input length ");
                sb2.append(length);
                throw new DecodingException(sb2.toString());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequence.length()) {
                bArr[i11] = (byte) ((this.f58623f.c(charSequence.charAt(i10)) << 4) | this.f58623f.c(charSequence.charAt(i10 + 1)));
                i10 += 2;
                i11++;
            }
            return i11;
        }

        @Override // com.google.common.io.BaseEncoding.j, com.google.common.io.BaseEncoding
        void n(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            com.google.common.base.w.E(appendable);
            com.google.common.base.w.f0(i10, i10 + i11, bArr.length);
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = bArr[i10 + i12] & 255;
                appendable.append(this.f58619j[i13]);
                appendable.append(this.f58619j[i13 | 256]);
            }
        }
    }

    public static final class h extends j {
        private h(f fVar, @CheckForNull Character ch2) {
            super(fVar, ch2);
            com.google.common.base.w.d(fVar.f58612b.length == 64);
        }

        h(String str, String str2, @CheckForNull Character ch2) {
            this(new f(str, str2.toCharArray()), ch2);
        }

        @Override // com.google.common.io.BaseEncoding.j
        BaseEncoding D(f fVar, @CheckForNull Character ch2) {
            return new h(fVar, ch2);
        }

        @Override // com.google.common.io.BaseEncoding.j, com.google.common.io.BaseEncoding
        int i(byte[] bArr, CharSequence charSequence) throws DecodingException {
            com.google.common.base.w.E(bArr);
            CharSequence charSequenceY = y(charSequence);
            if (!this.f58623f.g(charSequenceY.length())) {
                int length = charSequenceY.length();
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Invalid input length ");
                sb2.append(length);
                throw new DecodingException(sb2.toString());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequenceY.length()) {
                int i12 = i10 + 1;
                int i13 = i12 + 1;
                int iC = (this.f58623f.c(charSequenceY.charAt(i10)) << 18) | (this.f58623f.c(charSequenceY.charAt(i12)) << 12);
                int i14 = i11 + 1;
                bArr[i11] = (byte) (iC >>> 16);
                if (i13 < charSequenceY.length()) {
                    int i15 = i13 + 1;
                    int iC2 = iC | (this.f58623f.c(charSequenceY.charAt(i13)) << 6);
                    i11 = i14 + 1;
                    bArr[i14] = (byte) ((iC2 >>> 8) & 255);
                    if (i15 < charSequenceY.length()) {
                        i13 = i15 + 1;
                        i14 = i11 + 1;
                        bArr[i11] = (byte) ((iC2 | this.f58623f.c(charSequenceY.charAt(i15))) & 255);
                    } else {
                        i10 = i15;
                    }
                }
                i11 = i14;
                i10 = i13;
            }
            return i11;
        }

        @Override // com.google.common.io.BaseEncoding.j, com.google.common.io.BaseEncoding
        void n(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            com.google.common.base.w.E(appendable);
            int i12 = i10 + i11;
            com.google.common.base.w.f0(i10, i12, bArr.length);
            while (i11 >= 3) {
                int i13 = i10 + 1;
                int i14 = i13 + 1;
                int i15 = ((bArr[i10] & 255) << 16) | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                appendable.append(this.f58623f.d(i15 >>> 18));
                appendable.append(this.f58623f.d((i15 >>> 12) & 63));
                appendable.append(this.f58623f.d((i15 >>> 6) & 63));
                appendable.append(this.f58623f.d(i15 & 63));
                i11 -= 3;
                i10 = i14 + 1;
            }
            if (i10 < i12) {
                C(appendable, bArr, i10, i12 - i10);
            }
        }
    }

    public static final class i extends BaseEncoding {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final BaseEncoding f58620f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f58621g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f58622h;

        i(BaseEncoding baseEncoding, String str, int i10) {
            this.f58620f = (BaseEncoding) com.google.common.base.w.E(baseEncoding);
            this.f58621g = (String) com.google.common.base.w.E(str);
            this.f58622h = i10;
            com.google.common.base.w.k(i10 > 0, "Cannot add a separator after every %s chars", i10);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding A(char c10) {
            return this.f58620f.A(c10).B(this.f58621g, this.f58622h);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding B(String str, int i10) {
            throw new UnsupportedOperationException("Already have a separator");
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean f(CharSequence charSequence) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < charSequence.length(); i10++) {
                char cCharAt = charSequence.charAt(i10);
                if (this.f58621g.indexOf(cCharAt) < 0) {
                    sb2.append(cCharAt);
                }
            }
            return this.f58620f.f(sb2);
        }

        @Override // com.google.common.io.BaseEncoding
        int i(byte[] bArr, CharSequence charSequence) throws DecodingException {
            StringBuilder sb2 = new StringBuilder(charSequence.length());
            for (int i10 = 0; i10 < charSequence.length(); i10++) {
                char cCharAt = charSequence.charAt(i10);
                if (this.f58621g.indexOf(cCharAt) < 0) {
                    sb2.append(cCharAt);
                }
            }
            return this.f58620f.i(bArr, sb2);
        }

        @Override // com.google.common.io.BaseEncoding
        @o9.c
        public InputStream k(Reader reader) {
            return this.f58620f.k(BaseEncoding.r(reader, this.f58621g));
        }

        @Override // com.google.common.io.BaseEncoding
        void n(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            this.f58620f.n(BaseEncoding.w(appendable, this.f58621g, this.f58622h), bArr, i10, i11);
        }

        @Override // com.google.common.io.BaseEncoding
        @o9.c
        public OutputStream p(Writer writer) {
            return this.f58620f.p(BaseEncoding.x(writer, this.f58621g, this.f58622h));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding s() {
            return this.f58620f.s().B(this.f58621g, this.f58622h);
        }

        @Override // com.google.common.io.BaseEncoding
        int t(int i10) {
            return this.f58620f.t(i10);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f58620f);
            String str = this.f58621g;
            int i10 = this.f58622h;
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 31 + String.valueOf(str).length());
            sb2.append(strValueOf);
            sb2.append(".withSeparator(\"");
            sb2.append(str);
            sb2.append("\", ");
            sb2.append(i10);
            sb2.append(")");
            return sb2.toString();
        }

        @Override // com.google.common.io.BaseEncoding
        int u(int i10) {
            int iU = this.f58620f.u(i10);
            return iU + (this.f58621g.length() * com.google.common.math.f.g(Math.max(0, iU - 1), this.f58622h, RoundingMode.FLOOR));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding v() {
            return this.f58620f.v().B(this.f58621g, this.f58622h);
        }

        @Override // com.google.common.io.BaseEncoding
        CharSequence y(CharSequence charSequence) {
            return this.f58620f.y(charSequence);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding z() {
            return this.f58620f.z().B(this.f58621g, this.f58622h);
        }
    }

    public static class j extends BaseEncoding {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final f f58623f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @CheckForNull
        final Character f58624g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @CheckForNull
        @t9.b
        private transient BaseEncoding f58625h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @CheckForNull
        @t9.b
        private transient BaseEncoding f58626i;

        public class a extends OutputStream {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f58627b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f58628c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f58629d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Writer f58630e;

            a(Writer writer) {
                this.f58630e = writer;
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                int i10 = this.f58628c;
                if (i10 > 0) {
                    int i11 = this.f58627b;
                    f fVar = j.this.f58623f;
                    this.f58630e.write(fVar.d((i11 << (fVar.f58614d - i10)) & fVar.f58613c));
                    this.f58629d++;
                    if (j.this.f58624g != null) {
                        while (true) {
                            int i12 = this.f58629d;
                            j jVar = j.this;
                            if (i12 % jVar.f58623f.f58615e == 0) {
                                break;
                            }
                            this.f58630e.write(jVar.f58624g.charValue());
                            this.f58629d++;
                        }
                    }
                }
                this.f58630e.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                this.f58630e.flush();
            }

            @Override // java.io.OutputStream
            public void write(int i10) throws IOException {
                this.f58627b = (i10 & 255) | (this.f58627b << 8);
                this.f58628c += 8;
                while (true) {
                    int i11 = this.f58628c;
                    f fVar = j.this.f58623f;
                    int i12 = fVar.f58614d;
                    if (i11 < i12) {
                        return;
                    }
                    this.f58630e.write(fVar.d((this.f58627b >> (i11 - i12)) & fVar.f58613c));
                    this.f58629d++;
                    this.f58628c -= j.this.f58623f.f58614d;
                }
            }
        }

        public class b extends InputStream {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f58632b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f58633c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f58634d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            boolean f58635e = false;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Reader f58636f;

            b(Reader reader) {
                this.f58636f = reader;
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f58636f.close();
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                int i10;
                while (true) {
                    int i11 = this.f58636f.read();
                    if (i11 == -1) {
                        if (this.f58635e || j.this.f58623f.g(this.f58634d)) {
                            return -1;
                        }
                        int i12 = this.f58634d;
                        StringBuilder sb2 = new StringBuilder(32);
                        sb2.append("Invalid input length ");
                        sb2.append(i12);
                        throw new DecodingException(sb2.toString());
                    }
                    this.f58634d++;
                    char c10 = (char) i11;
                    Character ch2 = j.this.f58624g;
                    if (ch2 == null || ch2.charValue() != c10) {
                        if (this.f58635e) {
                            int i13 = this.f58634d;
                            StringBuilder sb3 = new StringBuilder(61);
                            sb3.append("Expected padding character but found '");
                            sb3.append(c10);
                            sb3.append("' at index ");
                            sb3.append(i13);
                            throw new DecodingException(sb3.toString());
                        }
                        int i14 = this.f58632b;
                        f fVar = j.this.f58623f;
                        int i15 = i14 << fVar.f58614d;
                        this.f58632b = i15;
                        int iC = fVar.c(c10) | i15;
                        this.f58632b = iC;
                        int i16 = this.f58633c + j.this.f58623f.f58614d;
                        this.f58633c = i16;
                        if (i16 >= 8) {
                            int i17 = i16 - 8;
                            this.f58633c = i17;
                            return (iC >> i17) & 255;
                        }
                    } else {
                        if (!this.f58635e && ((i10 = this.f58634d) == 1 || !j.this.f58623f.g(i10 - 1))) {
                            int i18 = this.f58634d;
                            StringBuilder sb4 = new StringBuilder(41);
                            sb4.append("Padding cannot start at index ");
                            sb4.append(i18);
                            throw new DecodingException(sb4.toString());
                        }
                        this.f58635e = true;
                    }
                }
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = i11 + i10;
                com.google.common.base.w.f0(i10, i12, bArr.length);
                int i13 = i10;
                while (i13 < i12) {
                    int i14 = read();
                    if (i14 == -1) {
                        int i15 = i13 - i10;
                        if (i15 == 0) {
                            return -1;
                        }
                        return i15;
                    }
                    bArr[i13] = (byte) i14;
                    i13++;
                }
                return i13 - i10;
            }
        }

        j(f fVar, @CheckForNull Character ch2) {
            this.f58623f = (f) com.google.common.base.w.E(fVar);
            com.google.common.base.w.u(ch2 == null || !fVar.i(ch2.charValue()), "Padding character %s was already in alphabet", ch2);
            this.f58624g = ch2;
        }

        j(String str, String str2, @CheckForNull Character ch2) {
            this(new f(str, str2.toCharArray()), ch2);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding A(char c10) {
            Character ch2;
            return (8 % this.f58623f.f58614d == 0 || ((ch2 = this.f58624g) != null && ch2.charValue() == c10)) ? this : D(this.f58623f, Character.valueOf(c10));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding B(String str, int i10) {
            for (int i11 = 0; i11 < str.length(); i11++) {
                com.google.common.base.w.u(!this.f58623f.i(str.charAt(i11)), "Separator (%s) cannot contain alphabet characters", str);
            }
            Character ch2 = this.f58624g;
            if (ch2 != null) {
                com.google.common.base.w.u(str.indexOf(ch2.charValue()) < 0, "Separator (%s) cannot contain padding character", str);
            }
            return new i(this, str, i10);
        }

        void C(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            com.google.common.base.w.E(appendable);
            com.google.common.base.w.f0(i10, i10 + i11, bArr.length);
            int i12 = 0;
            com.google.common.base.w.d(i11 <= this.f58623f.f58616f);
            long j10 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                j10 = (j10 | ((long) (bArr[i10 + i13] & 255))) << 8;
            }
            int i14 = ((i11 + 1) * 8) - this.f58623f.f58614d;
            while (i12 < i11 * 8) {
                f fVar = this.f58623f;
                appendable.append(fVar.d(((int) (j10 >>> (i14 - i12))) & fVar.f58613c));
                i12 += this.f58623f.f58614d;
            }
            if (this.f58624g != null) {
                while (i12 < this.f58623f.f58616f * 8) {
                    appendable.append(this.f58624g.charValue());
                    i12 += this.f58623f.f58614d;
                }
            }
        }

        BaseEncoding D(f fVar, @CheckForNull Character ch2) {
            return new j(fVar, ch2);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f58623f.equals(jVar.f58623f) && com.google.common.base.s.a(this.f58624g, jVar.f58624g);
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean f(CharSequence charSequence) {
            com.google.common.base.w.E(charSequence);
            CharSequence charSequenceY = y(charSequence);
            if (!this.f58623f.g(charSequenceY.length())) {
                return false;
            }
            for (int i10 = 0; i10 < charSequenceY.length(); i10++) {
                if (!this.f58623f.b(charSequenceY.charAt(i10))) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return this.f58623f.hashCode() ^ com.google.common.base.s.b(this.f58624g);
        }

        @Override // com.google.common.io.BaseEncoding
        int i(byte[] bArr, CharSequence charSequence) throws DecodingException {
            f fVar;
            com.google.common.base.w.E(bArr);
            CharSequence charSequenceY = y(charSequence);
            if (!this.f58623f.g(charSequenceY.length())) {
                int length = charSequenceY.length();
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Invalid input length ");
                sb2.append(length);
                throw new DecodingException(sb2.toString());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequenceY.length()) {
                long jC = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    fVar = this.f58623f;
                    if (i12 >= fVar.f58615e) {
                        break;
                    }
                    jC <<= fVar.f58614d;
                    if (i10 + i12 < charSequenceY.length()) {
                        jC |= (long) this.f58623f.c(charSequenceY.charAt(i13 + i10));
                        i13++;
                    }
                    i12++;
                }
                int i14 = fVar.f58616f;
                int i15 = (i14 * 8) - (i13 * fVar.f58614d);
                int i16 = (i14 - 1) * 8;
                while (i16 >= i15) {
                    bArr[i11] = (byte) ((jC >>> i16) & 255);
                    i16 -= 8;
                    i11++;
                }
                i10 += this.f58623f.f58615e;
            }
            return i11;
        }

        @Override // com.google.common.io.BaseEncoding
        @o9.c
        public InputStream k(Reader reader) {
            com.google.common.base.w.E(reader);
            return new b(reader);
        }

        @Override // com.google.common.io.BaseEncoding
        void n(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            com.google.common.base.w.E(appendable);
            com.google.common.base.w.f0(i10, i10 + i11, bArr.length);
            int i12 = 0;
            while (i12 < i11) {
                C(appendable, bArr, i10 + i12, Math.min(this.f58623f.f58616f, i11 - i12));
                i12 += this.f58623f.f58616f;
            }
        }

        @Override // com.google.common.io.BaseEncoding
        @o9.c
        public OutputStream p(Writer writer) {
            com.google.common.base.w.E(writer);
            return new a(writer);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding s() {
            BaseEncoding baseEncodingD = this.f58626i;
            if (baseEncodingD == null) {
                f fVarH = this.f58623f.h();
                baseEncodingD = fVarH == this.f58623f ? this : D(fVarH, this.f58624g);
                this.f58626i = baseEncodingD;
            }
            return baseEncodingD;
        }

        @Override // com.google.common.io.BaseEncoding
        int t(int i10) {
            return (int) (((((long) this.f58623f.f58614d) * ((long) i10)) + 7) / 8);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            sb2.append(this.f58623f.toString());
            if (8 % this.f58623f.f58614d != 0) {
                if (this.f58624g == null) {
                    sb2.append(".omitPadding()");
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(this.f58624g);
                    sb2.append("')");
                }
            }
            return sb2.toString();
        }

        @Override // com.google.common.io.BaseEncoding
        int u(int i10) {
            f fVar = this.f58623f;
            return fVar.f58615e * com.google.common.math.f.g(i10, fVar.f58616f, RoundingMode.CEILING);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding v() {
            return this.f58624g == null ? this : D(this.f58623f, null);
        }

        @Override // com.google.common.io.BaseEncoding
        CharSequence y(CharSequence charSequence) {
            com.google.common.base.w.E(charSequence);
            Character ch2 = this.f58624g;
            if (ch2 == null) {
                return charSequence;
            }
            char cCharValue = ch2.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding z() {
            BaseEncoding baseEncodingD = this.f58625h;
            if (baseEncodingD == null) {
                f fVarJ = this.f58623f.j();
                baseEncodingD = fVarJ == this.f58623f ? this : D(fVarJ, this.f58624g);
                this.f58625h = baseEncodingD;
            }
            return baseEncodingD;
        }
    }

    static {
        Character chValueOf = Character.valueOf(n5.a.f132013h);
        f58594a = new h("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", chValueOf);
        f58595b = new h("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", chValueOf);
        f58596c = new j("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", chValueOf);
        f58597d = new j("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", chValueOf);
        f58598e = new g("base16()", "0123456789ABCDEF");
    }

    BaseEncoding() {
    }

    public static BaseEncoding a() {
        return f58598e;
    }

    public static BaseEncoding b() {
        return f58596c;
    }

    public static BaseEncoding c() {
        return f58597d;
    }

    public static BaseEncoding d() {
        return f58594a;
    }

    public static BaseEncoding e() {
        return f58595b;
    }

    private static byte[] q(byte[] bArr, int i10) {
        if (i10 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    @o9.c
    static Reader r(Reader reader, String str) {
        com.google.common.base.w.E(reader);
        com.google.common.base.w.E(str);
        return new c(reader, str);
    }

    static Appendable w(Appendable appendable, String str, int i10) {
        com.google.common.base.w.E(appendable);
        com.google.common.base.w.E(str);
        com.google.common.base.w.d(i10 > 0);
        return new d(i10, appendable, str);
    }

    @o9.c
    static Writer x(Writer writer, String str, int i10) {
        return new e(w(writer, str, i10), writer);
    }

    public abstract BaseEncoding A(char c10);

    public abstract BaseEncoding B(String str, int i10);

    public abstract boolean f(CharSequence charSequence);

    public final byte[] g(CharSequence charSequence) {
        try {
            return h(charSequence);
        } catch (DecodingException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    final byte[] h(CharSequence charSequence) throws DecodingException {
        CharSequence charSequenceY = y(charSequence);
        byte[] bArr = new byte[t(charSequenceY.length())];
        return q(bArr, i(bArr, charSequenceY));
    }

    abstract int i(byte[] bArr, CharSequence charSequence) throws DecodingException;

    @o9.c
    public final com.google.common.io.f j(com.google.common.io.j jVar) {
        com.google.common.base.w.E(jVar);
        return new b(jVar);
    }

    @o9.c
    public abstract InputStream k(Reader reader);

    public String l(byte[] bArr) {
        return m(bArr, 0, bArr.length);
    }

    public final String m(byte[] bArr, int i10, int i11) {
        com.google.common.base.w.f0(i10, i10 + i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(u(i11));
        try {
            n(sb2, bArr, i10, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    abstract void n(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException;

    @o9.c
    public final com.google.common.io.e o(com.google.common.io.i iVar) {
        com.google.common.base.w.E(iVar);
        return new a(iVar);
    }

    @o9.c
    public abstract OutputStream p(Writer writer);

    public abstract BaseEncoding s();

    abstract int t(int i10);

    abstract int u(int i10);

    public abstract BaseEncoding v();

    CharSequence y(CharSequence charSequence) {
        return (CharSequence) com.google.common.base.w.E(charSequence);
    }

    public abstract BaseEncoding z();
}
