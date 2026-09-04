package kotlin.io;

import fi.u;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import yh.p;

/* JADX INFO: compiled from: FileReadWrite.kt */
/* JADX INFO: loaded from: classes5.dex */
public class FilesKt__FileReadWriteKt extends j {
    @sh.f
    private static final InputStreamReader A(File file, Charset charset) {
        f0.p(file, "<this>");
        f0.p(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    static /* synthetic */ InputStreamReader B(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        f0.p(file, "<this>");
        f0.p(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static final <T> T C(@dl.d File file, @dl.d Charset charset, @dl.d yh.l<? super kotlin.sequences.m<String>, ? extends T> block) {
        f0.p(file, "<this>");
        f0.p(charset, "charset");
        f0.p(block, "block");
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            T tInvoke = block.invoke(TextStreamsKt.h(bufferedReader));
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

    public static /* synthetic */ Object D(File file, Charset charset, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            Object objInvoke = lVar.invoke(TextStreamsKt.h(bufferedReader));
            c0.d(1);
            b.a(bufferedReader, null);
            c0.c(1);
            return objInvoke;
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

    public static final void E(@dl.d File file, @dl.d byte[] array) {
        f0.p(file, "<this>");
        f0.p(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            b2 b2Var = b2.f124493a;
            b.a(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static final void F(@dl.d File file, @dl.d String text, @dl.d Charset charset) {
        f0.p(file, "<this>");
        f0.p(text, "text");
        f0.p(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        f0.o(bytes, "this as java.lang.String).getBytes(charset)");
        E(file, bytes);
    }

    public static /* synthetic */ void G(File file, String str, Charset charset, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        F(file, str, charset);
    }

    @sh.f
    private static final OutputStreamWriter H(File file, Charset charset) {
        f0.p(file, "<this>");
        f0.p(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    static /* synthetic */ OutputStreamWriter I(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        f0.p(file, "<this>");
        f0.p(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static final void g(@dl.d File file, @dl.d byte[] array) {
        f0.p(file, "<this>");
        f0.p(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(array);
            b2 b2Var = b2.f124493a;
            b.a(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static final void h(@dl.d File file, @dl.d String text, @dl.d Charset charset) {
        f0.p(file, "<this>");
        f0.p(text, "text");
        f0.p(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        f0.o(bytes, "this as java.lang.String).getBytes(charset)");
        g(file, bytes);
    }

    public static /* synthetic */ void i(File file, String str, Charset charset, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        h(file, str, charset);
    }

    @sh.f
    private static final BufferedReader j(File file, Charset charset, int i10) {
        f0.p(file, "<this>");
        f0.p(charset, "charset");
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, i10);
    }

    static /* synthetic */ BufferedReader k(File file, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        f0.p(file, "<this>");
        f0.p(charset, "charset");
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, i10);
    }

    @sh.f
    private static final BufferedWriter l(File file, Charset charset, int i10) {
        f0.p(file, "<this>");
        f0.p(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, i10);
    }

    static /* synthetic */ BufferedWriter m(File file, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        f0.p(file, "<this>");
        f0.p(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [byte[], java.lang.Object] */
    public static final void n(@dl.d File file, int i10, @dl.d p<? super byte[], ? super Integer, b2> action) {
        f0.p(file, "<this>");
        f0.p(action, "action");
        ?? r10 = new byte[u.u(i10, 512)];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i11 = fileInputStream.read(r10);
                if (i11 <= 0) {
                    b2 b2Var = b2.f124493a;
                    b.a(fileInputStream, null);
                    return;
                }
                action.invoke(r10, Integer.valueOf(i11));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(fileInputStream, th2);
                    throw th3;
                }
            }
        }
    }

    public static final void o(@dl.d File file, @dl.d p<? super byte[], ? super Integer, b2> action) {
        f0.p(file, "<this>");
        f0.p(action, "action");
        n(file, 4096, action);
    }

    public static final void p(@dl.d File file, @dl.d Charset charset, @dl.d yh.l<? super String, b2> action) {
        f0.p(file, "<this>");
        f0.p(charset, "charset");
        f0.p(action, "action");
        TextStreamsKt.g(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    public static /* synthetic */ void q(File file, Charset charset, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        p(file, charset, lVar);
    }

    @sh.f
    private static final FileInputStream r(File file) {
        f0.p(file, "<this>");
        return new FileInputStream(file);
    }

    @sh.f
    private static final FileOutputStream s(File file) {
        f0.p(file, "<this>");
        return new FileOutputStream(file);
    }

    @sh.f
    private static final PrintWriter t(File file, Charset charset) {
        f0.p(file, "<this>");
        f0.p(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return new PrintWriter(outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192));
    }

    static /* synthetic */ PrintWriter u(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        f0.p(file, "<this>");
        f0.p(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return new PrintWriter(outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192));
    }

    @dl.d
    public static final byte[] v(@dl.d File file) {
        f0.p(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i10 = (int) length;
            byte[] bArrW0 = new byte[i10];
            int i11 = i10;
            int i12 = 0;
            while (i11 > 0) {
                int i13 = fileInputStream.read(bArrW0, i12, i11);
                if (i13 < 0) {
                    break;
                }
                i11 -= i13;
                i12 += i13;
            }
            if (i11 > 0) {
                bArrW0 = Arrays.copyOf(bArrW0, i12);
                f0.o(bArrW0, "copyOf(this, newSize)");
            } else {
                int i14 = fileInputStream.read();
                if (i14 != -1) {
                    f fVar = new f(8193);
                    fVar.write(i14);
                    a.l(fileInputStream, fVar, 0, 2, null);
                    int size = fVar.size() + i10;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrA = fVar.a();
                    byte[] bArrCopyOf = Arrays.copyOf(bArrW0, size);
                    f0.o(bArrCopyOf, "copyOf(this, newSize)");
                    bArrW0 = kotlin.collections.m.W0(bArrA, bArrCopyOf, i10, 0, fVar.size());
                }
            }
            b.a(fileInputStream, null);
            return bArrW0;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(fileInputStream, th2);
                throw th3;
            }
        }
    }

    @dl.d
    public static final List<String> w(@dl.d File file, @dl.d Charset charset) {
        f0.p(file, "<this>");
        f0.p(charset, "charset");
        final ArrayList arrayList = new ArrayList();
        p(file, charset, new yh.l<String, b2>() { // from class: kotlin.io.FilesKt__FileReadWriteKt$readLines$1
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

    public static /* synthetic */ List x(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        return w(file, charset);
    }

    @dl.d
    public static final String y(@dl.d File file, @dl.d Charset charset) {
        f0.p(file, "<this>");
        f0.p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strK = TextStreamsKt.k(inputStreamReader);
            b.a(inputStreamReader, null);
            return strK;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(inputStreamReader, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ String z(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        return y(file, charset);
    }
}
