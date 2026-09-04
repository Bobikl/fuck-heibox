package kotlin.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import kotlin.collections.p;
import kotlin.jvm.internal.f0;
import kotlin.s0;
import kotlin.u0;

/* JADX INFO: compiled from: IOStreams.kt */
/* JADX INFO: loaded from: classes5.dex */
@xh.h(name = "ByteStreamsKt")
public final class a {

    /* JADX INFO: renamed from: kotlin.io.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IOStreams.kt */
    public static final class C1129a extends p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f124745b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f124746c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f124747d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ BufferedInputStream f124748e;

        C1129a(BufferedInputStream bufferedInputStream) {
            this.f124748e = bufferedInputStream;
        }

        private final void e() throws IOException {
            if (this.f124746c || this.f124747d) {
                return;
            }
            int i10 = this.f124748e.read();
            this.f124745b = i10;
            this.f124746c = true;
            this.f124747d = i10 == -1;
        }

        public final boolean b() {
            return this.f124747d;
        }

        public final int c() {
            return this.f124745b;
        }

        public final boolean d() {
            return this.f124746c;
        }

        public final void g(boolean z10) {
            this.f124747d = z10;
        }

        public final void h(int i10) {
            this.f124745b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            e();
            return !this.f124747d;
        }

        public final void i(boolean z10) {
            this.f124746c = z10;
        }

        @Override // kotlin.collections.p
        public byte l() throws IOException {
            e();
            if (this.f124747d) {
                throw new NoSuchElementException("Input stream is over.");
            }
            byte b10 = (byte) this.f124745b;
            this.f124746c = false;
            return b10;
        }
    }

    @sh.f
    private static final BufferedInputStream a(InputStream inputStream, int i10) {
        f0.p(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i10);
    }

    @sh.f
    private static final BufferedOutputStream b(OutputStream outputStream, int i10) {
        f0.p(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i10);
    }

    static /* synthetic */ BufferedInputStream c(InputStream inputStream, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        f0.p(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i10);
    }

    static /* synthetic */ BufferedOutputStream d(OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        f0.p(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i10);
    }

    @sh.f
    private static final BufferedReader e(InputStream inputStream, Charset charset) {
        f0.p(inputStream, "<this>");
        f0.p(charset, "charset");
        Reader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    static /* synthetic */ BufferedReader f(InputStream inputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        f0.p(inputStream, "<this>");
        f0.p(charset, "charset");
        Reader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    @sh.f
    private static final BufferedWriter g(OutputStream outputStream, Charset charset) {
        f0.p(outputStream, "<this>");
        f0.p(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    static /* synthetic */ BufferedWriter h(OutputStream outputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        f0.p(outputStream, "<this>");
        f0.p(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    @sh.f
    private static final ByteArrayInputStream i(String str, Charset charset) {
        f0.p(str, "<this>");
        f0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        f0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }

    static /* synthetic */ ByteArrayInputStream j(String str, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        f0.p(str, "<this>");
        f0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        f0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }

    public static final long k(@dl.d InputStream inputStream, @dl.d OutputStream out, int i10) throws IOException {
        f0.p(inputStream, "<this>");
        f0.p(out, "out");
        byte[] bArr = new byte[i10];
        int i11 = inputStream.read(bArr);
        long j10 = 0;
        while (i11 >= 0) {
            out.write(bArr, 0, i11);
            j10 += (long) i11;
            i11 = inputStream.read(bArr);
        }
        return j10;
    }

    public static /* synthetic */ long l(InputStream inputStream, OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return k(inputStream, outputStream, i10);
    }

    @sh.f
    private static final ByteArrayInputStream m(byte[] bArr) {
        f0.p(bArr, "<this>");
        return new ByteArrayInputStream(bArr);
    }

    @sh.f
    private static final ByteArrayInputStream n(byte[] bArr, int i10, int i11) {
        f0.p(bArr, "<this>");
        return new ByteArrayInputStream(bArr, i10, i11);
    }

    @dl.d
    public static final p o(@dl.d BufferedInputStream bufferedInputStream) {
        f0.p(bufferedInputStream, "<this>");
        return new C1129a(bufferedInputStream);
    }

    @u0(version = "1.3")
    @dl.d
    public static final byte[] p(@dl.d InputStream inputStream) {
        f0.p(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        f0.o(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    @dl.d
    @kotlin.k(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @s0(expression = "readBytes()", imports = {}))
    @kotlin.l(errorSince = org.apache.tools.ant.util.s0.f136928s, warningSince = "1.3")
    public static final byte[] q(@dl.d InputStream inputStream, int i10) {
        f0.p(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i10, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        f0.o(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    public static /* synthetic */ byte[] r(InputStream inputStream, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        return q(inputStream, i10);
    }

    @sh.f
    private static final InputStreamReader s(InputStream inputStream, Charset charset) {
        f0.p(inputStream, "<this>");
        f0.p(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    static /* synthetic */ InputStreamReader t(InputStream inputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        f0.p(inputStream, "<this>");
        f0.p(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    @sh.f
    private static final OutputStreamWriter u(OutputStream outputStream, Charset charset) {
        f0.p(outputStream, "<this>");
        f0.p(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }

    static /* synthetic */ OutputStreamWriter v(OutputStream outputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        f0.p(outputStream, "<this>");
        f0.p(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }
}
