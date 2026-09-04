package org.apache.tools.ant.taskdefs.optional.depend.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: MethodTypeCPInfo.java */
/* JADX INFO: loaded from: classes5.dex */
public class n extends b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f134785u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f134786v;

    public n() {
        super(16, 1);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void d(DataInputStream dataInputStream) throws IOException {
        this.f134785u = dataInputStream.readUnsignedShort();
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void f(d dVar) {
        s sVar = (s) dVar.e(this.f134785u);
        sVar.f(dVar);
        this.f134786v = sVar.g();
        super.f(dVar);
    }

    public String toString() {
        if (c()) {
            return "MethodDescriptor: " + this.f134786v;
        }
        return "MethodDescriptorIndex: " + this.f134785u;
    }
}
