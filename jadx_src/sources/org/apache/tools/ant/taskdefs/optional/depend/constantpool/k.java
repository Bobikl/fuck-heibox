package org.apache.tools.ant.taskdefs.optional.depend.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: InvokeDynamicCPInfo.java */
/* JADX INFO: loaded from: classes5.dex */
public class k extends b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f134777u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f134778v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private p f134779w;

    public k() {
        super(18, 1);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void d(DataInputStream dataInputStream) throws IOException {
        this.f134777u = dataInputStream.readUnsignedShort();
        this.f134778v = dataInputStream.readUnsignedShort();
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void f(d dVar) {
        p pVar = (p) dVar.e(this.f134778v);
        this.f134779w = pVar;
        pVar.f(dVar);
        super.f(dVar);
    }

    public String toString() {
        if (c()) {
            return "Name = " + this.f134779w.g() + ", type = " + this.f134779w.h();
        }
        return "BootstrapMethodAttrIndex inx = " + this.f134777u + "NameAndType index = " + this.f134778v;
    }
}
