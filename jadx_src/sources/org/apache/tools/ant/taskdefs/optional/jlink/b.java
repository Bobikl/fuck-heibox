package org.apache.tools.ant.taskdefs.optional.jlink;

import java.io.DataInput;
import java.io.IOException;

/* JADX INFO: compiled from: ClassNameReader.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final byte f135228c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final byte f135229d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final byte f135230e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final byte f135231f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final byte f135232g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final byte f135233h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final byte f135234i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final byte f135235j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final byte f135236k = 9;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final byte f135237l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final byte f135238m = 11;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final byte f135239n = 12;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    byte[] f135240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object[] f135241b;

    b(DataInput dataInput) throws IOException {
        int unsignedShort = dataInput.readUnsignedShort();
        this.f135240a = new byte[unsignedShort];
        this.f135241b = new Object[unsignedShort];
        int i10 = 1;
        while (i10 < unsignedShort) {
            byte b10 = dataInput.readByte();
            this.f135240a[i10] = b10;
            switch (b10) {
                case 1:
                    this.f135241b[i10] = dataInput.readUTF();
                    continue;
                    i10++;
                    break;
                case 2:
                default:
                    continue;
                    i10++;
                    break;
                case 3:
                case 9:
                case 10:
                case 11:
                case 12:
                    this.f135241b[i10] = Integer.valueOf(dataInput.readInt());
                    continue;
                    i10++;
                    break;
                case 4:
                    this.f135241b[i10] = Float.valueOf(dataInput.readFloat());
                    continue;
                    i10++;
                    break;
                case 5:
                    this.f135241b[i10] = Long.valueOf(dataInput.readLong());
                    break;
                case 6:
                    this.f135241b[i10] = Double.valueOf(dataInput.readDouble());
                    break;
                case 7:
                case 8:
                    this.f135241b[i10] = Integer.valueOf(dataInput.readUnsignedShort());
                    continue;
                    i10++;
                    break;
            }
            i10++;
            i10++;
        }
    }
}
