package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.AtomicFile;
import androidx.annotation.w0;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.b2;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: AtomicFile.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nAtomicFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n1#1,84:1\n34#1,13:85\n*S KotlinDebug\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n53#1:85,13\n*E\n"})
@SuppressLint({"ClassVerificationFailure"})
public final class c {
    @dl.d
    @w0(17)
    public static final byte[] a(@dl.d AtomicFile atomicFile) throws IOException {
        kotlin.jvm.internal.f0.p(atomicFile, "<this>");
        byte[] fully = atomicFile.readFully();
        kotlin.jvm.internal.f0.o(fully, "readFully()");
        return fully;
    }

    @dl.d
    @w0(17)
    public static final String b(@dl.d AtomicFile atomicFile, @dl.d Charset charset) throws IOException {
        kotlin.jvm.internal.f0.p(atomicFile, "<this>");
        kotlin.jvm.internal.f0.p(charset, "charset");
        byte[] fully = atomicFile.readFully();
        kotlin.jvm.internal.f0.o(fully, "readFully()");
        return new String(fully, charset);
    }

    public static /* synthetic */ String c(AtomicFile atomicFile, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        return b(atomicFile, charset);
    }

    @w0(17)
    public static final void d(@dl.d AtomicFile atomicFile, @dl.d yh.l<? super FileOutputStream, b2> block) throws IOException {
        kotlin.jvm.internal.f0.p(atomicFile, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        FileOutputStream stream = atomicFile.startWrite();
        try {
            kotlin.jvm.internal.f0.o(stream, "stream");
            block.invoke(stream);
            kotlin.jvm.internal.c0.d(1);
            atomicFile.finishWrite(stream);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            atomicFile.failWrite(stream);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    @w0(17)
    public static final void e(@dl.d AtomicFile atomicFile, @dl.d byte[] array) throws IOException {
        kotlin.jvm.internal.f0.p(atomicFile, "<this>");
        kotlin.jvm.internal.f0.p(array, "array");
        FileOutputStream stream = atomicFile.startWrite();
        try {
            kotlin.jvm.internal.f0.o(stream, "stream");
            stream.write(array);
            atomicFile.finishWrite(stream);
        } catch (Throwable th2) {
            atomicFile.failWrite(stream);
            throw th2;
        }
    }

    @w0(17)
    public static final void f(@dl.d AtomicFile atomicFile, @dl.d String text, @dl.d Charset charset) throws IOException {
        kotlin.jvm.internal.f0.p(atomicFile, "<this>");
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        kotlin.jvm.internal.f0.o(bytes, "this as java.lang.String).getBytes(charset)");
        e(atomicFile, bytes);
    }

    public static /* synthetic */ void g(AtomicFile atomicFile, String str, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = kotlin.text.d.f128566b;
        }
        f(atomicFile, str, charset);
    }
}
