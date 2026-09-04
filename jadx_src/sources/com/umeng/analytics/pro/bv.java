package com.umeng.analytics.pro;

/* JADX INFO: compiled from: TProtocolUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public class bv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f104651a = Integer.MAX_VALUE;

    public static bu a(byte[] bArr, bu buVar) {
        if (bArr[0] > 16) {
            return new bm.a();
        }
        return (bArr.length <= 1 || (bArr[1] & 128) == 0) ? buVar : new bm.a();
    }

    public static void a(int i10) {
        f104651a = i10;
    }

    public static void a(bs bsVar, byte b10) throws az {
        a(bsVar, b10, f104651a);
    }

    public static void a(bs bsVar, byte b10, int i10) throws az {
        if (i10 <= 0) {
            throw new az("Maximum skip depth exceeded");
        }
        int i11 = 0;
        switch (b10) {
            case 2:
                bsVar.t();
                return;
            case 3:
                bsVar.u();
                return;
            case 4:
                bsVar.y();
                return;
            case 5:
            case 7:
            case 9:
            default:
                return;
            case 6:
                bsVar.v();
                return;
            case 8:
                bsVar.w();
                return;
            case 10:
                bsVar.x();
                return;
            case 11:
                bsVar.A();
                return;
            case 12:
                bsVar.j();
                while (true) {
                    byte b11 = bsVar.l().f104628b;
                    if (b11 == 0) {
                        bsVar.k();
                        return;
                    } else {
                        a(bsVar, b11, i10 - 1);
                        bsVar.m();
                    }
                }
                break;
            case 13:
                bp bpVarN = bsVar.n();
                while (i11 < bpVarN.f104634c) {
                    int i12 = i10 - 1;
                    a(bsVar, bpVarN.f104632a, i12);
                    a(bsVar, bpVarN.f104633b, i12);
                    i11++;
                }
                bsVar.o();
                return;
            case 14:
                bw bwVarR = bsVar.r();
                while (i11 < bwVarR.f104653b) {
                    a(bsVar, bwVarR.f104652a, i10 - 1);
                    i11++;
                }
                bsVar.s();
                return;
            case 15:
                bo boVarP = bsVar.p();
                while (i11 < boVarP.f104631b) {
                    a(bsVar, boVarP.f104630a, i10 - 1);
                    i11++;
                }
                bsVar.q();
                return;
        }
    }
}
