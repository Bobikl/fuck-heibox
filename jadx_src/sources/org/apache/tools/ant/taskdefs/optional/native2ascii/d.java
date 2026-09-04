package org.apache.tools.ant.taskdefs.optional.native2ascii;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Iterator;
import java.util.function.UnaryOperator;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.optional.s;
import org.apache.tools.ant.util.c1;

/* JADX INFO: compiled from: BuiltinNative2Ascii.java */
/* JADX INFO: loaded from: classes5.dex */
public class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f135282a = "builtin";

    private BufferedReader c(File file, String str, boolean z10) throws IOException {
        return (z10 || str == null) ? new BufferedReader(new FileReader(file)) : new BufferedReader(new InputStreamReader(Files.newInputStream(file.toPath(), new OpenOption[0]), str));
    }

    private Writer d(File file, String str, boolean z10) throws IOException {
        if (!z10) {
            str = "ASCII";
        }
        return str == null ? new BufferedWriter(new FileWriter(file)) : new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(file.toPath(), new OpenOption[0]), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator e(BufferedReader bufferedReader, UnaryOperator unaryOperator) {
        return bufferedReader.lines().map(unaryOperator).iterator();
    }

    private void f(final BufferedReader bufferedReader, Writer writer, final UnaryOperator<String> unaryOperator) throws IOException {
        Iterator it = new Iterable() { // from class: org.apache.tools.ant.taskdefs.optional.native2ascii.c
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return d.e(bufferedReader, unaryOperator);
            }
        }.iterator();
        while (it.hasNext()) {
            writer.write(String.format("%s%n", (String) it.next()));
        }
    }

    @Override // org.apache.tools.ant.taskdefs.optional.native2ascii.g
    public final boolean a(s sVar, File file, File file2) throws BuildException {
        boolean zH2 = sVar.H2();
        String strG2 = sVar.G2();
        try {
            BufferedReader bufferedReaderC = c(file, strG2, zH2);
            try {
                Writer writerD = d(file2, strG2, zH2);
                try {
                    f(bufferedReaderC, writerD, zH2 ? new UnaryOperator() { // from class: org.apache.tools.ant.taskdefs.optional.native2ascii.a
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return c1.a((String) obj);
                        }
                    } : new UnaryOperator() { // from class: org.apache.tools.ant.taskdefs.optional.native2ascii.b
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return c1.b((String) obj);
                        }
                    });
                    if (writerD != null) {
                        writerD.close();
                    }
                    if (bufferedReaderC != null) {
                        bufferedReaderC.close();
                    }
                    return true;
                } catch (Throwable th2) {
                    if (writerD != null) {
                        try {
                            writerD.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (bufferedReaderC != null) {
                    try {
                        bufferedReaderC.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (IOException e10) {
            throw new BuildException("Exception trying to translate data", e10);
        }
    }
}
