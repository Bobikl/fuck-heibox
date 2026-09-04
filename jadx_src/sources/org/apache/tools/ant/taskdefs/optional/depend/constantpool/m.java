package org.apache.tools.ant.taskdefs.optional.depend.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: MethodRefCPInfo.java */
/* JADX INFO: loaded from: classes5.dex */
public class m extends e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f134780t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f134781u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f134782v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f134783w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f134784x;

    public m() {
        super(10, 1);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void d(DataInputStream dataInputStream) throws IOException {
        this.f134783w = dataInputStream.readUnsignedShort();
        this.f134784x = dataInputStream.readUnsignedShort();
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void f(d dVar) {
        a aVar = (a) dVar.e(this.f134783w);
        aVar.f(dVar);
        this.f134780t = aVar.g();
        p pVar = (p) dVar.e(this.f134784x);
        pVar.f(dVar);
        this.f134781u = pVar.g();
        this.f134782v = pVar.h();
        super.f(dVar);
    }

    public String g() {
        return this.f134780t;
    }

    public String h() {
        return this.f134781u;
    }

    public String i() {
        return this.f134782v;
    }

    public String toString() {
        if (!c()) {
            return "Method : Class index = " + this.f134783w + ", name and type index = " + this.f134784x;
        }
        return "Method : Class = " + this.f134780t + ", name = " + this.f134781u + ", type = " + this.f134782v;
    }
}
