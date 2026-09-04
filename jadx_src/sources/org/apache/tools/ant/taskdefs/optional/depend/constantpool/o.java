package org.apache.tools.ant.taskdefs.optional.depend.constantpool;

import com.meituan.robust.Constants;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: ModuleCPInfo.java */
/* JADX INFO: loaded from: classes5.dex */
public class o extends b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f134787u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f134788v;

    public o() {
        super(19, 1);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void d(DataInputStream dataInputStream) throws IOException {
        this.f134787u = dataInputStream.readUnsignedShort();
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void f(d dVar) {
        this.f134788v = ((s) dVar.e(this.f134787u)).g();
        super.f(dVar);
    }

    public String toString() {
        return "Module info Constant Pool Entry for " + this.f134788v + Constants.ARRAY_TYPE + this.f134787u + "]";
    }
}
