package org.apache.tools.ant.taskdefs.optional.depend.constantpool;

import com.meituan.robust.Constants;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: StringCPInfo.java */
/* JADX INFO: loaded from: classes5.dex */
public class r extends b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f134795u;

    public r() {
        super(8, 1);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void d(DataInputStream dataInputStream) throws IOException {
        this.f134795u = dataInputStream.readUnsignedShort();
        h("unresolved");
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void f(d dVar) {
        h(((s) dVar.e(this.f134795u)).g());
        super.f(dVar);
    }

    public String toString() {
        return "String Constant Pool Entry for " + g() + Constants.ARRAY_TYPE + this.f134795u + "]";
    }
}
