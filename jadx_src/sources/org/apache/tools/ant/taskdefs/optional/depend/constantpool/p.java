package org.apache.tools.ant.taskdefs.optional.depend.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: NameAndTypeCPInfo.java */
/* JADX INFO: loaded from: classes5.dex */
public class p extends e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f134789t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f134790u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f134791v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f134792w;

    public p() {
        super(12, 1);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void d(DataInputStream dataInputStream) throws IOException {
        this.f134791v = dataInputStream.readUnsignedShort();
        this.f134792w = dataInputStream.readUnsignedShort();
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void f(d dVar) {
        this.f134789t = ((s) dVar.e(this.f134791v)).g();
        this.f134790u = ((s) dVar.e(this.f134792w)).g();
        super.f(dVar);
    }

    public String g() {
        return this.f134789t;
    }

    public String h() {
        return this.f134790u;
    }

    public String toString() {
        if (c()) {
            return "Name = " + this.f134789t + ", type = " + this.f134790u;
        }
        return "Name index = " + this.f134791v + ", descriptor index = " + this.f134792w;
    }
}
