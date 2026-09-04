package org.apache.tools.ant.types.resources;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: BZip2Resource.java */
/* JADX INFO: loaded from: classes5.dex */
public class m extends s {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final char[] f136388r = {'B', 'Z'};

    public m() {
    }

    public m(org.apache.tools.ant.types.u1 u1Var) {
        super(u1Var);
    }

    @Override // org.apache.tools.ant.types.resources.u
    protected InputStream B2(InputStream inputStream) throws IOException {
        for (char c10 : f136388r) {
            if (inputStream.read() != c10) {
                throw new IOException("Invalid bz2 stream.");
            }
        }
        return new org.apache.tools.bzip2.c(inputStream);
    }

    @Override // org.apache.tools.ant.types.resources.u
    protected OutputStream C2(OutputStream outputStream) throws IOException {
        for (char c10 : f136388r) {
            outputStream.write(c10);
        }
        return new org.apache.tools.bzip2.d(outputStream);
    }

    @Override // org.apache.tools.ant.types.resources.s
    protected String D2() {
        return "Bzip2";
    }
}
