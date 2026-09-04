package kotlin.io.path;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.e2;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: PathReadWrite.kt */
/* JADX INFO: loaded from: classes5.dex */
public class n {
    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path A(Path path, kotlin.sequences.m<? extends CharSequence> lines, Charset charset, OpenOption... options) throws IOException {
        f0.p(path, "<this>");
        f0.p(lines, "lines");
        f0.p(charset, "charset");
        f0.p(options, "options");
        Path pathWrite = Files.write(path, SequencesKt___SequencesKt.N(lines), charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        f0.o(pathWrite, "write(this, lines.asIterable(), charset, *options)");
        return pathWrite;
    }

    static /* synthetic */ Path B(Path path, Iterable lines, Charset charset, OpenOption[] options, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        f0.p(path, "<this>");
        f0.p(lines, "lines");
        f0.p(charset, "charset");
        f0.p(options, "options");
        Path pathWrite = Files.write(path, lines, charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        f0.o(pathWrite, "write(this, lines, charset, *options)");
        return pathWrite;
    }

    static /* synthetic */ Path C(Path path, kotlin.sequences.m lines, Charset charset, OpenOption[] options, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        f0.p(path, "<this>");
        f0.p(lines, "lines");
        f0.p(charset, "charset");
        f0.p(options, "options");
        Path pathWrite = Files.write(path, SequencesKt___SequencesKt.N(lines), charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        f0.o(pathWrite, "write(this, lines.asIterable(), charset, *options)");
        return pathWrite;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    public static final void D(@dl.d Path path, @dl.d CharSequence text, @dl.d Charset charset, @dl.d OpenOption... options) throws IOException {
        f0.p(path, "<this>");
        f0.p(text, "text");
        f0.p(charset, "charset");
        f0.p(options, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        f0.o(outputStreamNewOutputStream, "newOutputStream(this, *options)");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStreamNewOutputStream, charset);
        try {
            outputStreamWriter.append(text);
            kotlin.io.b.a(outputStreamWriter, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.b.a(outputStreamWriter, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ void E(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArr, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        D(path, charSequence, charset, openOptionArr);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final OutputStreamWriter F(Path path, Charset charset, OpenOption... options) throws IOException {
        f0.p(path, "<this>");
        f0.p(charset, "charset");
        f0.p(options, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset);
    }

    static /* synthetic */ OutputStreamWriter G(Path path, Charset charset, OpenOption[] options, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        f0.p(path, "<this>");
        f0.p(charset, "charset");
        f0.p(options, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final void a(Path path, byte[] array) throws IOException {
        f0.p(path, "<this>");
        f0.p(array, "array");
        Files.write(path, array, StandardOpenOption.APPEND);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path b(Path path, Iterable<? extends CharSequence> lines, Charset charset) throws IOException {
        f0.p(path, "<this>");
        f0.p(lines, "lines");
        f0.p(charset, "charset");
        Path pathWrite = Files.write(path, lines, charset, StandardOpenOption.APPEND);
        f0.o(pathWrite, "write(this, lines, chars…tandardOpenOption.APPEND)");
        return pathWrite;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path c(Path path, kotlin.sequences.m<? extends CharSequence> lines, Charset charset) throws IOException {
        f0.p(path, "<this>");
        f0.p(lines, "lines");
        f0.p(charset, "charset");
        Path pathWrite = Files.write(path, SequencesKt___SequencesKt.N(lines), charset, StandardOpenOption.APPEND);
        f0.o(pathWrite, "write(this, lines.asIter…tandardOpenOption.APPEND)");
        return pathWrite;
    }

    static /* synthetic */ Path d(Path path, Iterable lines, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        f0.p(path, "<this>");
        f0.p(lines, "lines");
        f0.p(charset, "charset");
        Path pathWrite = Files.write(path, lines, charset, StandardOpenOption.APPEND);
        f0.o(pathWrite, "write(this, lines, chars…tandardOpenOption.APPEND)");
        return pathWrite;
    }

    static /* synthetic */ Path e(Path path, kotlin.sequences.m lines, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        f0.p(path, "<this>");
        f0.p(lines, "lines");
        f0.p(charset, "charset");
        Path pathWrite = Files.write(path, SequencesKt___SequencesKt.N(lines), charset, StandardOpenOption.APPEND);
        f0.o(pathWrite, "write(this, lines.asIter…tandardOpenOption.APPEND)");
        return pathWrite;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    public static final void f(@dl.d Path path, @dl.d CharSequence text, @dl.d Charset charset) throws IOException {
        f0.p(path, "<this>");
        f0.p(text, "text");
        f0.p(charset, "charset");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, StandardOpenOption.APPEND);
        f0.o(outputStreamNewOutputStream, "newOutputStream(this, StandardOpenOption.APPEND)");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStreamNewOutputStream, charset);
        try {
            outputStreamWriter.append(text);
            kotlin.io.b.a(outputStreamWriter, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.b.a(outputStreamWriter, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ void g(Path path, CharSequence charSequence, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        f(path, charSequence, charset);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final BufferedReader h(Path path, Charset charset, int i10, OpenOption... options) throws IOException {
        f0.p(path, "<this>");
        f0.p(charset, "charset");
        f0.p(options, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset), i10);
    }

    static /* synthetic */ BufferedReader i(Path path, Charset charset, int i10, OpenOption[] options, int i11, Object obj) throws IOException {
        if ((i11 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        f0.p(path, "<this>");
        f0.p(charset, "charset");
        f0.p(options, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset), i10);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final BufferedWriter j(Path path, Charset charset, int i10, OpenOption... options) throws IOException {
        f0.p(path, "<this>");
        f0.p(charset, "charset");
        f0.p(options, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset), i10);
    }

    static /* synthetic */ BufferedWriter k(Path path, Charset charset, int i10, OpenOption[] options, int i11, Object obj) throws IOException {
        if ((i11 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        f0.p(path, "<this>");
        f0.p(charset, "charset");
        f0.p(options, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset), i10);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final void l(Path path, Charset charset, yh.l<? super String, b2> action) throws IOException {
        f0.p(path, "<this>");
        f0.p(charset, "charset");
        f0.p(action, "action");
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(path, charset);
        f0.o(bufferedReaderNewBufferedReader, "newBufferedReader(this, charset)");
        try {
            Iterator<String> it = TextStreamsKt.h(bufferedReaderNewBufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            b2 b2Var = b2.f124493a;
            c0.d(1);
            kotlin.io.b.a(bufferedReaderNewBufferedReader, null);
            c0.c(1);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c0.d(1);
                kotlin.io.b.a(bufferedReaderNewBufferedReader, th2);
                c0.c(1);
                throw th3;
            }
        }
    }

    static /* synthetic */ void m(Path path, Charset charset, yh.l action, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        f0.p(path, "<this>");
        f0.p(charset, "charset");
        f0.p(action, "action");
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(path, charset);
        f0.o(bufferedReaderNewBufferedReader, "newBufferedReader(this, charset)");
        try {
            Iterator<String> it = TextStreamsKt.h(bufferedReaderNewBufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            b2 b2Var = b2.f124493a;
            c0.d(1);
            kotlin.io.b.a(bufferedReaderNewBufferedReader, null);
            c0.c(1);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c0.d(1);
                kotlin.io.b.a(bufferedReaderNewBufferedReader, th2);
                c0.c(1);
                throw th3;
            }
        }
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final InputStream n(Path path, OpenOption... options) throws IOException {
        f0.p(path, "<this>");
        f0.p(options, "options");
        InputStream inputStreamNewInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        f0.o(inputStreamNewInputStream, "newInputStream(this, *options)");
        return inputStreamNewInputStream;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final OutputStream o(Path path, OpenOption... options) throws IOException {
        f0.p(path, "<this>");
        f0.p(options, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        f0.o(outputStreamNewOutputStream, "newOutputStream(this, *options)");
        return outputStreamNewOutputStream;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final byte[] p(Path path) throws IOException {
        f0.p(path, "<this>");
        byte[] allBytes = Files.readAllBytes(path);
        f0.o(allBytes, "readAllBytes(this)");
        return allBytes;
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final List<String> q(Path path, Charset charset) throws IOException {
        f0.p(path, "<this>");
        f0.p(charset, "charset");
        List<String> allLines = Files.readAllLines(path, charset);
        f0.o(allLines, "readAllLines(this, charset)");
        return allLines;
    }

    static /* synthetic */ List r(Path path, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        f0.p(path, "<this>");
        f0.p(charset, "charset");
        List<String> allLines = Files.readAllLines(path, charset);
        f0.o(allLines, "readAllLines(this, charset)");
        return allLines;
    }

    @u0(version = s0.f136928s)
    @dl.d
    @e2(markerClass = {e.class})
    public static final String s(@dl.d Path path, @dl.d Charset charset) throws IOException {
        f0.p(path, "<this>");
        f0.p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0)), charset);
        try {
            String strK = TextStreamsKt.k(inputStreamReader);
            kotlin.io.b.a(inputStreamReader, null);
            return strK;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.b.a(inputStreamReader, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ String t(Path path, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        return s(path, charset);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final InputStreamReader u(Path path, Charset charset, OpenOption... options) throws IOException {
        f0.p(path, "<this>");
        f0.p(charset, "charset");
        f0.p(options, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset);
    }

    static /* synthetic */ InputStreamReader v(Path path, Charset charset, OpenOption[] options, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        f0.p(path, "<this>");
        f0.p(charset, "charset");
        f0.p(options, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length)), charset);
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final <T> T w(Path path, Charset charset, yh.l<? super kotlin.sequences.m<String>, ? extends T> block) throws IOException {
        f0.p(path, "<this>");
        f0.p(charset, "charset");
        f0.p(block, "block");
        BufferedReader it = Files.newBufferedReader(path, charset);
        try {
            f0.o(it, "it");
            T tInvoke = block.invoke(TextStreamsKt.h(it));
            c0.d(1);
            kotlin.io.b.a(it, null);
            c0.c(1);
            return tInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c0.d(1);
                kotlin.io.b.a(it, th2);
                c0.c(1);
                throw th3;
            }
        }
    }

    static /* synthetic */ Object x(Path path, Charset charset, yh.l block, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        f0.p(path, "<this>");
        f0.p(charset, "charset");
        f0.p(block, "block");
        BufferedReader it = Files.newBufferedReader(path, charset);
        try {
            f0.o(it, "it");
            Object objInvoke = block.invoke(TextStreamsKt.h(it));
            c0.d(1);
            kotlin.io.b.a(it, null);
            c0.c(1);
            return objInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c0.d(1);
                kotlin.io.b.a(it, th2);
                c0.c(1);
                throw th3;
            }
        }
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final void y(Path path, byte[] array, OpenOption... options) throws IOException {
        f0.p(path, "<this>");
        f0.p(array, "array");
        f0.p(options, "options");
        Files.write(path, array, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @u0(version = s0.f136928s)
    @e2(markerClass = {e.class})
    @sh.f
    private static final Path z(Path path, Iterable<? extends CharSequence> lines, Charset charset, OpenOption... options) throws IOException {
        f0.p(path, "<this>");
        f0.p(lines, "lines");
        f0.p(charset, "charset");
        f0.p(options, "options");
        Path pathWrite = Files.write(path, lines, charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        f0.o(pathWrite, "write(this, lines, charset, *options)");
        return pathWrite;
    }
}
