package org.apache.tools.ant.taskdefs.optional.depend.constantpool;

import com.meituan.robust.Constants;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: ClassCPInfo.java */
/* JADX INFO: loaded from: classes5.dex */
public class a extends e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f134742t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f134743u;

    public a() {
        super(7, 1);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void d(DataInputStream dataInputStream) throws IOException {
        this.f134743u = dataInputStream.readUnsignedShort();
        this.f134742t = "unresolved";
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void f(d dVar) {
        this.f134742t = ((s) dVar.e(this.f134743u)).g();
        super.f(dVar);
    }

    public String g() {
        return this.f134742t;
    }

    public String toString() {
        return "Class Constant Pool Entry for " + this.f134742t + Constants.ARRAY_TYPE + this.f134743u + "]";
    }
}
