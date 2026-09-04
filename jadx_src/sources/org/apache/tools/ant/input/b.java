package org.apache.tools.ant.input;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.k6;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: GreedyInputHandler.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends a {
    @Override // org.apache.tools.ant.input.a, org.apache.tools.ant.input.c
    public void a(d dVar) throws Throwable {
        InputStream inputStreamB;
        String strC = c(dVar);
        try {
            inputStreamB = b();
            try {
                System.err.println(strC);
                System.err.flush();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                k6 k6Var = new k6(inputStreamB, byteArrayOutputStream);
                Thread thread = new Thread(k6Var);
                thread.start();
                try {
                    try {
                        thread.join();
                    } catch (InterruptedException unused) {
                    }
                } catch (InterruptedException unused2) {
                    thread.join();
                }
                dVar.f(new String(byteArrayOutputStream.toByteArray()));
                if (!dVar.d()) {
                    throw new BuildException("Received invalid console input");
                }
                if (k6Var.c() != null) {
                    throw new BuildException("Failed to read input from console", k6Var.c());
                }
                j0.c(inputStreamB);
            } catch (Throwable th2) {
                th = th2;
                j0.c(inputStreamB);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamB = null;
        }
    }
}
