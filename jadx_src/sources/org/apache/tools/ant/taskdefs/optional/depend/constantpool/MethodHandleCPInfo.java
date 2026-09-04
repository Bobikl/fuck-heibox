package org.apache.tools.ant.taskdefs.optional.depend.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class MethodHandleCPInfo extends e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private e f134739t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ReferenceKind f134740u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f134741v;

    public enum ReferenceKind {
        REF_getField,
        REF_getStatic,
        REF_putField,
        REF_putStatic,
        REF_invokeVirtual,
        REF_invokeStatic,
        REF_invokeSpecial,
        REF_newInvokeSpecial,
        REF_invokeInterface;

        public int value() {
            return ordinal() + 1;
        }
    }

    public MethodHandleCPInfo() {
        super(15, 1);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void d(DataInputStream dataInputStream) throws IOException {
        this.f134740u = ReferenceKind.values()[dataInputStream.readUnsignedByte() - 1];
        this.f134741v = dataInputStream.readUnsignedShort();
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void f(d dVar) {
        e eVarE = dVar.e(this.f134741v);
        this.f134739t = eVarE;
        eVarE.f(dVar);
        super.f(dVar);
    }

    public String toString() {
        if (c()) {
            return "MethodHandle : " + this.f134739t.toString();
        }
        return "MethodHandle : Reference kind = " + this.f134740u + "Reference index = " + this.f134741v;
    }
}
