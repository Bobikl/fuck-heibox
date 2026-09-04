package org.apache.tools.ant.types.resources;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: GZipResource.java */
/* JADX INFO: loaded from: classes5.dex */
public class f0 extends s {
    public f0() {
    }

    public f0(org.apache.tools.ant.types.u1 u1Var) {
        super(u1Var);
    }

    @Override // org.apache.tools.ant.types.resources.u
    protected InputStream B2(InputStream inputStream) throws IOException {
        return new GZIPInputStream(inputStream);
    }

    @Override // org.apache.tools.ant.types.resources.u
    protected OutputStream C2(OutputStream outputStream) throws IOException {
        return new GZIPOutputStream(outputStream);
    }

    @Override // org.apache.tools.ant.types.resources.s
    protected String D2() {
        return "GZip";
    }
}
