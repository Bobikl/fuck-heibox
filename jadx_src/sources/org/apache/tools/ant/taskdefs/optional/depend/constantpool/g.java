package org.apache.tools.ant.taskdefs.optional.depend.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: FieldRefCPInfo.java */
/* JADX INFO: loaded from: classes5.dex */
public class g extends e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f134767t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f134768u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f134769v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f134770w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f134771x;

    public g() {
        super(9, 1);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void d(DataInputStream dataInputStream) throws IOException {
        this.f134770w = dataInputStream.readUnsignedShort();
        this.f134771x = dataInputStream.readUnsignedShort();
    }

    @Override // org.apache.tools.ant.taskdefs.optional.depend.constantpool.e
    public void f(d dVar) {
        a aVar = (a) dVar.e(this.f134770w);
        aVar.f(dVar);
        this.f134767t = aVar.g();
        p pVar = (p) dVar.e(this.f134771x);
        pVar.f(dVar);
        this.f134768u = pVar.g();
        this.f134769v = pVar.h();
        super.f(dVar);
    }

    public String g() {
        return this.f134767t;
    }

    public String h() {
        return this.f134768u;
    }

    public String i() {
        return this.f134769v;
    }

    public String toString() {
        if (!c()) {
            return "Field : Class index = " + this.f134770w + ", name and type index = " + this.f134771x;
        }
        return "Field : Class = " + this.f134767t + ", name = " + this.f134768u + ", type = " + this.f134769v;
    }
}
