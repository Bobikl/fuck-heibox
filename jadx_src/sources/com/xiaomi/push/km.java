package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public class km {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f107799a = Integer.MAX_VALUE;

    public static void a(kj kjVar, byte b10) {
        a(kjVar, b10, f107799a);
    }

    public static void a(kj kjVar, byte b10, int i10) throws kd {
        if (i10 <= 0) {
            throw new kd("Maximum skip depth exceeded");
        }
        int i11 = 0;
        switch (b10) {
            case 2:
                kjVar.mo651a();
                return;
            case 3:
                kjVar.a();
                return;
            case 4:
                kjVar.mo638a();
                return;
            case 5:
            case 7:
            case 9:
            default:
                return;
            case 6:
                kjVar.mo648a();
                return;
            case 8:
                kjVar.mo639a();
                return;
            case 10:
                kjVar.mo640a();
                return;
            case 11:
                kjVar.mo647a();
                return;
            case 12:
                kjVar.mo645a();
                while (true) {
                    byte b11 = kjVar.mo641a().f107793a;
                    if (b11 == 0) {
                        kjVar.f();
                        return;
                    } else {
                        a(kjVar, b11, i10 - 1);
                        kjVar.g();
                    }
                }
                break;
            case 13:
                ki kiVarMo643a = kjVar.mo643a();
                while (i11 < kiVarMo643a.f927a) {
                    int i12 = i10 - 1;
                    a(kjVar, kiVarMo643a.f107795a, i12);
                    a(kjVar, kiVarMo643a.f107796b, i12);
                    i11++;
                }
                kjVar.h();
                return;
            case 14:
                kn knVarMo644a = kjVar.mo644a();
                while (i11 < knVarMo644a.f928a) {
                    a(kjVar, knVarMo644a.f107800a, i10 - 1);
                    i11++;
                }
                kjVar.j();
                return;
            case 15:
                kh khVarMo642a = kjVar.mo642a();
                while (i11 < khVarMo642a.f926a) {
                    a(kjVar, khVarMo642a.f107794a, i10 - 1);
                    i11++;
                }
                kjVar.i();
                return;
        }
    }
}
