package org.apache.tools.ant.taskdefs.optional.depend.constantpool;

import com.meituan.robust.Constants;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: PackageCPInfo.java */
/* JADX INFO: loaded from: classes5.dex */
public class q extends b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f134793u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f134794v;

    public q() {
        super(20, 1);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void d(DataInputStream dataInputStream) throws IOException {
        this.f134793u = dataInputStream.readUnsignedShort();
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void f(d dVar) {
        this.f134794v = ((s) dVar.e(this.f134793u)).g();
        super.f(dVar);
    }

    public String toString() {
        return "Package info Constant Pool Entry for " + this.f134794v + Constants.ARRAY_TYPE + this.f134793u + "]";
    }
}
