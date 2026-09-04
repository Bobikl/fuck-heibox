package org.apache.tools.ant.input;

import java.io.InputStream;
import org.apache.tools.ant.util.t0;

/* JADX INFO: compiled from: DefaultInputHandler.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements c {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        throw new org.apache.tools.ant.BuildException("Failed to close input.", r6);
     */
    @Override // org.apache.tools.ant.input.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(org.apache.tools.ant.input.d r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.String r0 = r5.c(r6)
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4d
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4d
            java.io.InputStream r4 = r5.b()     // Catch: java.lang.Throwable -> L4d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4d
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4d
        L13:
            java.io.PrintStream r1 = java.lang.System.err     // Catch: java.lang.Throwable -> L4a
            r1.println(r0)     // Catch: java.lang.Throwable -> L4a
            java.io.PrintStream r1 = java.lang.System.err     // Catch: java.lang.Throwable -> L4a
            r1.flush()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = r2.readLine()     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L4a
            if (r1 == 0) goto L39
            r6.f(r1)     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L4a
            boolean r1 = r6.d()     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L13
            r2.close()     // Catch: java.io.IOException -> L30
            return
        L30:
            r6 = move-exception
            org.apache.tools.ant.BuildException r0 = new org.apache.tools.ant.BuildException
            java.lang.String r1 = "Failed to close input."
            r0.<init>(r1, r6)
            throw r0
        L39:
            org.apache.tools.ant.BuildException r6 = new org.apache.tools.ant.BuildException     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L4a
            java.lang.String r0 = "unexpected end of stream while reading input"
            r6.<init>(r0)     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L4a
            throw r6     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L4a
        L41:
            r6 = move-exception
            org.apache.tools.ant.BuildException r0 = new org.apache.tools.ant.BuildException     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = "Failed to read input from Console."
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> L4a
            throw r0     // Catch: java.lang.Throwable -> L4a
        L4a:
            r6 = move-exception
            r1 = r2
            goto L4e
        L4d:
            r6 = move-exception
        L4e:
            if (r1 == 0) goto L53
            r1.close()     // Catch: java.io.IOException -> L53
        L53:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tools.ant.input.a.a(org.apache.tools.ant.input.d):void");
    }

    protected InputStream b() {
        return t0.a();
    }

    protected String c(d dVar) {
        String strC = dVar.c();
        String strA = dVar.a();
        if (!(dVar instanceof e)) {
            if (strA == null) {
                return strC;
            }
            return strC + " [" + strA + "]";
        }
        StringBuilder sb2 = new StringBuilder(strC);
        sb2.append(" (");
        boolean z10 = true;
        for (String str : ((e) dVar).g()) {
            if (!z10) {
                sb2.append(", ");
            }
            if (str.equals(strA)) {
                sb2.append('[');
            }
            sb2.append(str);
            if (str.equals(strA)) {
                sb2.append(']');
            }
            z10 = false;
        }
        sb2.append(")");
        return sb2.toString();
    }
}
