package org.apache.tools.ant.taskdefs.optional.depend.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: InterfaceMethodRefCPInfo.java */
/* JADX INFO: loaded from: classes5.dex */
public class j extends e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f134772t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f134773u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f134774v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f134775w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f134776x;

    public j() {
        super(11, 1);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void d(DataInputStream dataInputStream) throws IOException {
        this.f134775w = dataInputStream.readUnsignedShort();
        this.f134776x = dataInputStream.readUnsignedShort();
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void f(d dVar) {
        a aVar = (a) dVar.e(this.f134775w);
        aVar.f(dVar);
        this.f134772t = aVar.g();
        p pVar = (p) dVar.e(this.f134776x);
        pVar.f(dVar);
        this.f134773u = pVar.g();
        this.f134774v = pVar.h();
        super.f(dVar);
    }

    public String g() {
        return this.f134772t;
    }

    public String h() {
        return this.f134773u;
    }

    public String i() {
        return this.f134774v;
    }

    public String toString() {
        if (!c()) {
            return "InterfaceMethod : Class index = " + this.f134775w + ", name and type index = " + this.f134776x;
        }
        return "InterfaceMethod : Class = " + this.f134772t + ", name = " + this.f134773u + ", type = " + this.f134774v;
    }
}
