package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* JADX INFO: compiled from: QRCodeReader.java */
/* JADX INFO: loaded from: classes7.dex */
public class j6 implements o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v1 f62004a = new v1();

    private int a(j2 j2Var) {
        r3.f62283i = j2Var.c();
        s sVarA = j2Var.a();
        int[] iArr = {3, sVarA.e() - 4, 3};
        int[] iArr2 = {3, 3, sVarA.c() - 4};
        int i10 = 0;
        for (int i11 = 0; i11 < 3; i11++) {
            if (a(sVarA, iArr[i11], iArr2[i11])) {
                i10++;
            }
        }
        return i10;
    }

    public static void a(p4 p4Var) {
        int iA = p4Var.a();
        if (iA == p4Var.c() && iA == 805) {
            r3.f62296v[0] = true;
        }
    }

    public static void a(p4 p4Var, s6 s6Var) {
        boolean z10;
        int iA = p4Var.a();
        int iC = p4Var.c();
        while (true) {
            if (r3.f62297w.size() == 0) {
                z10 = false;
                break;
            }
            int iIntValue = r3.f62297w.pop().intValue();
            if (iIntValue != 0 && iA % iIntValue == 0) {
                z10 = true;
                break;
            }
        }
        if (!(iA == iC && z10) || s6Var == null || s6Var.j() == null) {
            return;
        }
        if ((Math.max(Math.max(s6Var.j()[0].b(), s6Var.j()[1].b()), s6Var.j()[2].b()) - Math.min(Math.min(s6Var.j()[0].b(), s6Var.j()[1].b()), s6Var.j()[2].b())) * (Math.max(Math.max(s6Var.j()[0].c(), s6Var.j()[1].c()), s6Var.j()[2].c()) - Math.min(Math.min(s6Var.j()[0].c(), s6Var.j()[1].c()), s6Var.j()[2].c())) > ((double) (iA * iC)) * 0.8d) {
            r3.f62296v[1] = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    private boolean a(s sVar, int i10, int i11) {
        int i12;
        if (sVar == null || sVar.c() < 21 || sVar.e() < 21) {
            return false;
        }
        ?? B = sVar.b(i10, i11);
        if (sVar.b(i10 + 1, i11)) {
            i12 = B;
            i12 = B + 1;
        }
        i12 = B;
        int i13 = i12;
        if (!sVar.b(i10 + 2, i11)) {
            i13 = i12 + 1;
        }
        int i14 = i13;
        if (sVar.b(i10 + 3, i11)) {
            i14 = i13 + 1;
        }
        int i15 = i14;
        if (sVar.b(i10 - 1, i11)) {
            i15 = i14 + 1;
        }
        int i16 = i15;
        if (!sVar.b(i10 - 2, i11)) {
            i16 = i15 + 1;
        }
        int i17 = i16;
        if (sVar.b(i10 - 3, i11)) {
            i17 = i16 + 1;
        }
        int i18 = i17;
        if (sVar.b(i10, i11 + 1)) {
            i18 = i17 + 1;
        }
        int i19 = i18;
        if (!sVar.b(i10, i11 + 2)) {
            i19 = i18 + 1;
        }
        int i20 = i19;
        if (sVar.b(i10, i11 + 3)) {
            i20 = i19 + 1;
        }
        int i21 = i20;
        if (sVar.b(i10, i11 - 1)) {
            i21 = i20 + 1;
        }
        int i22 = i21;
        if (!sVar.b(i10, i11 - 2)) {
            i22 = i21 + 1;
        }
        int i23 = i22;
        if (sVar.b(i10, i11 - 3)) {
            i23 = i22 + 1;
        }
        return i23 > 10;
    }

    @Override // com.huawei.hms.scankit.p.o6
    public final s6 a(p pVar, Map<l1, ?> map) throws a {
        w1 w1VarA;
        boolean z10 = true;
        r3.f62284j++;
        try {
            j2 j2VarA = new g2(pVar.b()).a(map);
            boolean z11 = a(j2VarA) > 0;
            try {
                w1VarA = this.f62004a.a(j2VarA.a(), map);
                z10 = false;
            } catch (Exception unused) {
                w1VarA = null;
            }
            if (z10 && z11) {
                return new s6(null, null, j2VarA.b(), BarcodeFormat.QR_CODE);
            }
            if (z10) {
                throw a.a();
            }
            if (w1VarA == null) {
                return null;
            }
            u6[] u6VarArrD = j2VarA.d();
            if (w1VarA.b() instanceof i6) {
                ((i6) w1VarA.b()).a(u6VarArrD);
            }
            s6 s6Var = new s6(w1VarA.d(), w1VarA.c(), u6VarArrD, BarcodeFormat.QR_CODE);
            s6Var.b(j2VarA.b());
            return s6Var;
        } catch (a unused2) {
            throw a.a();
        }
    }
}
