package org.apache.tools.ant.taskdefs.optional.depend.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: ConstantPoolEntry.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f134748d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f134749e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f134750f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f134751g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f134752h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f134753i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f134754j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f134755k = 9;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f134756l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f134757m = 11;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f134758n = 12;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f134759o = 15;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f134760p = 16;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f134761q = 18;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f134762r = 19;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f134763s = 20;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f134764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f134765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f134766c = false;

    public e(int i10, int i11) {
        this.f134764a = i10;
        this.f134765b = i11;
    }

    public static e e(DataInputStream dataInputStream) throws IOException {
        e sVar;
        int unsignedByte = dataInputStream.readUnsignedByte();
        switch (unsignedByte) {
            case 1:
                sVar = new s();
                break;
            case 2:
            case 13:
            case 14:
            case 17:
            default:
                throw new ClassFormatError("Invalid Constant Pool entry Type " + unsignedByte);
            case 3:
                sVar = new i();
                break;
            case 4:
                sVar = new h();
                break;
            case 5:
                sVar = new l();
                break;
            case 6:
                sVar = new f();
                break;
            case 7:
                sVar = new a();
                break;
            case 8:
                sVar = new r();
                break;
            case 9:
                sVar = new g();
                break;
            case 10:
                sVar = new m();
                break;
            case 11:
                sVar = new j();
                break;
            case 12:
                sVar = new p();
                break;
            case 15:
                sVar = new MethodHandleCPInfo();
                break;
            case 16:
                sVar = new n();
                break;
            case 18:
                sVar = new k();
                break;
            case 19:
                sVar = new o();
                break;
            case 20:
                sVar = new q();
                break;
        }
        sVar.d(dataInputStream);
        return sVar;
    }

    public final int a() {
        return this.f134765b;
    }

    public int b() {
        return this.f134764a;
    }

    public boolean c() {
        return this.f134766c;
    }

    public abstract void d(DataInputStream dataInputStream) throws IOException;

    public void f(d dVar) {
        this.f134766c = true;
    }
}
