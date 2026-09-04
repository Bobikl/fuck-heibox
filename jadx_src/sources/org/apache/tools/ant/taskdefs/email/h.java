package org.apache.tools.ant.taskdefs.email;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Iterator;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Function;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.u2;

/* JADX INFO: compiled from: PlainMailer.java */
/* JADX INFO: loaded from: classes5.dex */
public class h extends d {
    h() {
    }

    private void z(a aVar, IOException iOException) {
        String str = "Failed to send mail to " + aVar;
        if (!x()) {
            throw new BuildException(str, iOException);
        }
        String str2 = str + " because of :" + iOException.getMessage();
        u2 u2Var = this.f134131n;
        if (u2Var != null) {
            u2Var.x1(str2, 1);
        } else {
            System.err.println(str2);
        }
    }

    @Override // org.apache.tools.ant.taskdefs.email.d
    public void d() {
        try {
            final org.apache.tools.mail.b bVar = new org.apache.tools.mail.b(this.f134118a, this.f134119b);
            bVar.g(this.f134124g.toString());
            boolean z10 = false;
            this.f134125h.stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.email.f
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((a) obj).toString();
                }
            }).forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.email.g
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    bVar.l((String) obj);
                }
            });
            for (a aVar : this.f134126i) {
                try {
                    bVar.C(aVar.toString());
                    z10 = true;
                } catch (IOException e10) {
                    z(aVar, e10);
                }
            }
            for (a aVar2 : this.f134127j) {
                try {
                    bVar.c(aVar2.toString());
                    z10 = true;
                } catch (IOException e11) {
                    z(aVar2, e11);
                }
            }
            for (a aVar3 : this.f134128k) {
                try {
                    bVar.b(aVar3.toString());
                    z10 = true;
                } catch (IOException e12) {
                    z(aVar3, e12);
                }
            }
            if (!z10) {
                throw new BuildException("Couldn't reach any recipient");
            }
            String str = this.f134130m;
            if (str != null) {
                bVar.A(str);
            }
            bVar.x("Date", a());
            if (this.f134123f.D1() != null) {
                bVar.x("Content-Type", this.f134123f.G1() + "; charset=\"" + this.f134123f.D1() + "\"");
            } else {
                bVar.x("Content-Type", this.f134123f.G1());
            }
            Vector<c> vector = this.f134133p;
            if (vector != null) {
                for (c cVar : vector) {
                    bVar.x(cVar.a(), cVar.b());
                }
            }
            PrintStream printStreamH = bVar.h();
            this.f134123f.K1(printStreamH);
            Vector<File> vector2 = this.f134129l;
            if (vector2 != null) {
                Iterator<File> it = vector2.iterator();
                while (it.hasNext()) {
                    y(it.next(), printStreamH);
                }
            }
            bVar.o();
        } catch (IOException e13) {
            throw new BuildException("IO error sending mail", e13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    protected void y(File file, PrintStream printStream) throws IOException {
        if (!file.exists() || !file.canRead()) {
            throw new BuildException("File \"%s\" does not exist or is not readable.", file.getAbsolutePath());
        }
        if (this.f134132o) {
            printStream.println();
            String name = file.getName();
            int length = name.length();
            printStream.println(name);
            for (int i10 = 0; i10 < length; i10++) {
                printStream.print(n5.a.f132013h);
            }
            printStream.println();
        }
        byte[] bArr = new byte[1024];
        InputStream inputStreamNewInputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStreamNewInputStream, 1024);
            while (true) {
                try {
                    int i11 = bufferedInputStream.read(bArr);
                    if (i11 == -1) {
                        break;
                    } else {
                        printStream.write(bArr, 0, i11);
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
                if (inputStreamNewInputStream != null) {
                    try {
                        inputStreamNewInputStream.close();
                    } catch (Throwable th4) {
                        th.addSuppressed(th4);
                    }
                }
                throw th;
            }
            bufferedInputStream.close();
            if (inputStreamNewInputStream != null) {
                inputStreamNewInputStream.close();
            }
        } catch (Throwable th5) {
            if (inputStreamNewInputStream != null) {
                inputStreamNewInputStream.close();
            }
            throw th5;
        }
    }
}
