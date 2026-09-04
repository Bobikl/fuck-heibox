package org.apache.tools.ant.taskdefs.optional.depend;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

/* JADX INFO: compiled from: ClassFile.java */
/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f134736c = -889275714;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.apache.tools.ant.taskdefs.optional.depend.constantpool.d f134737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f134738b;

    public Vector<String> a() {
        Vector<String> vector = new Vector<>();
        int iN = this.f134737a.n();
        for (int i10 = 0; i10 < iN; i10++) {
            org.apache.tools.ant.taskdefs.optional.depend.constantpool.e eVarE = this.f134737a.e(i10);
            if (eVarE != null && eVarE.b() == 7) {
                org.apache.tools.ant.taskdefs.optional.depend.constantpool.a aVar = (org.apache.tools.ant.taskdefs.optional.depend.constantpool.a) eVarE;
                if (!aVar.g().equals(this.f134738b)) {
                    vector.add(f.b(aVar.g()));
                }
            }
        }
        return vector;
    }

    public String b() {
        return f.b(this.f134738b);
    }

    public void c(InputStream inputStream) throws IOException, ClassFormatError {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        if (dataInputStream.readInt() != f134736c) {
            throw new ClassFormatError("No Magic Code Found - probably not a Java class file.");
        }
        dataInputStream.readUnsignedShort();
        dataInputStream.readUnsignedShort();
        org.apache.tools.ant.taskdefs.optional.depend.constantpool.d dVar = new org.apache.tools.ant.taskdefs.optional.depend.constantpool.d();
        this.f134737a = dVar;
        dVar.l(dataInputStream);
        this.f134737a.m();
        dataInputStream.readUnsignedShort();
        int unsignedShort = dataInputStream.readUnsignedShort();
        dataInputStream.readUnsignedShort();
        this.f134738b = ((org.apache.tools.ant.taskdefs.optional.depend.constantpool.a) this.f134737a.e(unsignedShort)).g();
    }
}
