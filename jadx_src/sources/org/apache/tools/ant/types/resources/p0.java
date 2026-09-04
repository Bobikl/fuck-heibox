package org.apache.tools.ant.types.resources;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.tools.ant.b2;
import org.apache.tools.ant.taskdefs.r3;

/* JADX INFO: compiled from: LogOutputResource.java */
/* JADX INFO: loaded from: classes5.dex */
public class p0 extends org.apache.tools.ant.types.s1 implements f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f136407q = "[Ant log]";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private r3 f136408p;

    public p0(b2 b2Var) {
        super(f136407q);
        this.f136408p = new r3(b2Var);
    }

    public p0(b2 b2Var, int i10) {
        super(f136407q);
        this.f136408p = new r3(b2Var, i10);
    }

    @Override // org.apache.tools.ant.types.resources.f
    public OutputStream j() throws IOException {
        return this.f136408p;
    }

    @Override // org.apache.tools.ant.types.s1
    public OutputStream l2() throws IOException {
        return this.f136408p;
    }
}
