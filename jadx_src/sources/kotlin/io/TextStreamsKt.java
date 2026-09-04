package kotlin.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import kotlin.sequences.SequencesKt__SequencesKt;

/* JADX INFO: compiled from: ReadWrite.kt */
/* JADX INFO: loaded from: classes5.dex */
@xh.h(name = "TextStreamsKt")
public final class TextStreamsKt {
    @sh.f
    private static final BufferedReader a(Reader reader, int i10) {
        f0.p(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i10);
    }

    @sh.f
    private static final BufferedWriter b(Writer writer, int i10) {
        f0.p(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i10);
    }

    static /* synthetic */ BufferedReader c(Reader reader, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        f0.p(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i10);
    }

    static /* synthetic */ BufferedWriter d(Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        f0.p(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i10);
    }

    public static final long e(@dl.d Reader reader, @dl.d Writer out, int i10) throws IOException {
        f0.p(reader, "<this>");
        f0.p(out, "out");
        char[] cArr = new char[i10];
        int i11 = reader.read(cArr);
        long j10 = 0;
        while (i11 >= 0) {
            out.write(cArr, 0, i11);
            j10 += (long) i11;
            i11 = reader.read(cArr);
        }
        return j10;
    }

    public static /* synthetic */ long f(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return e(reader, writer, i10);
    }

    public static final void g(@dl.d Reader reader, @dl.d yh.l<? super String, b2> action) {
        f0.p(reader, "<this>");
        f0.p(action, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator<String> it = h(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            b2 b2Var = b2.f124493a;
            b.a(bufferedReader, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(bufferedReader, th2);
                throw th3;
            }
        }
    }

    @dl.d
    public static final kotlin.sequences.m<String> h(@dl.d BufferedReader bufferedReader) {
        f0.p(bufferedReader, "<this>");
        return SequencesKt__SequencesKt.f(new m(bufferedReader));
    }

    @dl.d
    public static final byte[] i(@dl.d URL url) throws IOException {
        f0.p(url, "<this>");
        InputStream it = url.openStream();
        try {
            f0.o(it, "it");
            byte[] bArrP = a.p(it);
            b.a(it, null);
            return bArrP;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(it, th2);
                throw th3;
            }
        }
    }

    @dl.d
    public static final List<String> j(@dl.d Reader reader) {
        f0.p(reader, "<this>");
        final ArrayList arrayList = new ArrayList();
        g(reader, new yh.l<String, b2>() { // from class: kotlin.io.TextStreamsKt$readLines$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(String str) {
                invoke2(str);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d String it) {
                f0.p(it, "it");
                arrayList.add(it);
            }
        });
        return arrayList;
    }

    @dl.d
    public static final String k(@dl.d Reader reader) {
        f0.p(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        f(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        f0.o(string, "buffer.toString()");
        return string;
    }

    @sh.f
    private static final String l(URL url, Charset charset) {
        f0.p(url, "<this>");
        f0.p(charset, "charset");
        return new String(i(url), charset);
    }

    static /* synthetic */ String m(URL url, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        f0.p(url, "<this>");
        f0.p(charset, "charset");
        return new String(i(url), charset);
    }

    @sh.f
    private static final StringReader n(String str) {
        f0.p(str, "<this>");
        return new StringReader(str);
    }

    public static final <T> T o(@dl.d Reader reader, @dl.d yh.l<? super kotlin.sequences.m<String>, ? extends T> block) {
        f0.p(reader, "<this>");
        f0.p(block, "block");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            T tInvoke = block.invoke(h(bufferedReader));
            c0.d(1);
            b.a(bufferedReader, null);
            c0.c(1);
            return tInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c0.d(1);
                b.a(bufferedReader, th2);
                c0.c(1);
                throw th3;
            }
        }
    }
}
