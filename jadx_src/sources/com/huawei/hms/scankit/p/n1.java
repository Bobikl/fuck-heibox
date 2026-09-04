package com.huawei.hms.scankit.p;

import android.util.Log;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.util.LoadOpencvJNIUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DecodeProcessor.java */
/* JADX INFO: loaded from: classes7.dex */
public class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p4 f62124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p f62125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p f62126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p f62127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f62128e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f62130g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f62129f = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f62131h = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f62133j = 1.778f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f62134k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f62135l = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m4 f62132i = new m4();

    n1(p4 p4Var) {
        this.f62128e = false;
        this.f62130g = 0.0f;
        this.f62124a = p4Var;
        this.f62125b = new p(new q3(this.f62124a));
        this.f62126c = new p(new e4(this.f62124a));
        this.f62128e = false;
        this.f62130g = 0.0f;
    }

    public static float a(float[] fArr) {
        float[] fArr2 = r3.f62299y;
        float f10 = fArr2[2] - fArr2[0];
        float f11 = fArr2[3];
        float f12 = fArr2[1];
        float f13 = f10 * (f11 - f12);
        if (f13 == 0.0d) {
            return 0.0f;
        }
        float f14 = fArr[2] - fArr[0];
        float f15 = fArr[3];
        float f16 = fArr[1];
        float f17 = f13 + (f14 * (f15 - f16));
        float fMax = Math.max(f12, f16);
        float fMin = Math.min(r3.f62299y[3], fArr[3]);
        float fMax2 = Math.max(r3.f62299y[0], fArr[0]);
        float fMin2 = Math.min(r3.f62299y[2], fArr[2]);
        if (fMax >= fMin || fMax2 >= fMin2) {
            return 0.0f;
        }
        float f18 = (fMin - fMax) * (fMin2 - fMax2);
        return (f18 / (f17 - f18)) * 1.0f;
    }

    private p a(p pVar) {
        int iE = pVar.e();
        int iC = pVar.c();
        int i10 = (int) (((double) iE) * 0.75d);
        int i11 = (int) (((double) iC) * 0.75d);
        int i12 = (iE - i10) / 2;
        this.f62134k += i12;
        int i13 = (iC - i11) / 2;
        this.f62135l += i13;
        return pVar.a(i12, i13, i10, i11);
    }

    public static p a(byte[] bArr, int i10, int i11) throws a {
        byte[] bArrSharpen = LoadOpencvJNIUtil.sharpen(bArr, i11, i10);
        if (bArrSharpen != null) {
            return new p(new e4(new e6(bArrSharpen, i10, i11, 0, 0, i10, i11, false)));
        }
        throw a.a();
    }

    private s6 a(a5 a5Var, p4 p4Var, p pVar, Map<l1, Object> map, float f10, i2 i2Var) throws a {
        p pVar2;
        s6 s6VarA = null;
        if (r3.f62275a && !r3.f62276b) {
            try {
                pVar2 = new p(new q3(p4Var));
                try {
                    s6 s6VarA2 = a5Var.a(pVar2, map);
                    if (s6VarA2 != null) {
                        try {
                            if (s6VarA2.k() != null) {
                                k2.a(s6VarA2.j(), f10, i2Var);
                                return s6VarA2;
                            }
                        } catch (a unused) {
                            s6VarA = s6VarA2;
                            pVar = pVar2;
                            Log.e("DecodeProcessor", "decodeQRMultiHard AIScanException");
                            pVar2 = pVar;
                        }
                    }
                    s6VarA = s6VarA2;
                } catch (a unused2) {
                }
            } catch (a unused3) {
            }
            if (s6VarA != null && s6VarA.j() != null && s6VarA.j().length >= 3) {
                try {
                    s6VarA = a(pVar2, map, s6VarA, new double[]{0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d});
                    if (s6VarA != null && s6VarA.k() != null) {
                        k2.a(s6VarA.j(), f10, i2Var);
                        return s6VarA;
                    }
                } catch (a unused4) {
                    Log.e("DecodeProcessor", "decodeQRMultiHard AIScanException");
                }
            }
        }
        p pVar3 = new p(new e4(p4Var));
        try {
            s6 s6VarA3 = a5Var.a(pVar3, map);
            if (s6VarA3 == null || s6VarA3.k() == null) {
                throw a.a();
            }
            k2.a(s6VarA3.j(), f10, i2Var);
            return s6VarA3;
        } catch (a unused5) {
            if (r3.f62275a && !r3.f62276b && s6VarA != null && s6VarA.j() != null && s6VarA.j().length >= 3 && (s6VarA = a(pVar3, map, s6VarA, new double[]{0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d})) != null && s6VarA.k() != null) {
                k2.a(s6VarA.j(), f10, i2Var);
            }
            return s6VarA;
        }
    }

    private s6 a(a5 a5Var, p4 p4Var, s6 s6Var, Map<l1, Object> map, float f10, int i10, int i11) {
        s6 s6VarA;
        p pVar = null;
        if (!r3.f62275a) {
            return null;
        }
        try {
            try {
                p pVar2 = new p(new q3(p4Var));
                try {
                    s6 s6VarA2 = a5Var.a(pVar2, map);
                    if (s6VarA2 != null && s6VarA2.k() != null) {
                        return a(s6VarA2, f10, i10, i11);
                    }
                    if (s6VarA2 != null && s6VarA2.j() != null && s6VarA2.j().length >= 3) {
                        s6Var.b(s6VarA2.j());
                    }
                    pVar = pVar2;
                    if (s6Var != null) {
                        try {
                            if (s6Var.j() != null && s6Var.j().length >= 3 && !r3.f62287m && (s6VarA = a(pVar, map, s6Var, new double[]{0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d})) != null && s6VarA.k() != null) {
                                return a(s6VarA, f10, i10, i11);
                            }
                        } catch (a unused) {
                            Log.e("DecodeProcessor", "decodeQRUseFullImgTryHard AIScanException");
                        }
                    }
                    return a(pVar, a5Var, p4Var, s6Var, map, f10);
                } catch (a unused2) {
                    pVar = pVar2;
                    Log.e("DecodeProcessor", "decodeQRUseFullImgTryHard AIScanException");
                }
            } catch (a unused3) {
            }
        } catch (a unused4) {
        }
    }

    static s6 a(n1 n1Var) {
        float fC = n1Var.c(n1Var.f62125b);
        s6 s6Var = new s6(1.0f);
        s6Var.b(fC);
        s6Var.b(new i2(false, 0.0f, 0.0f, n1Var.f62125b.e(), n1Var.f62125b.e(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f));
        return s6Var;
    }

    private s6 a(p pVar, a5 a5Var, p4 p4Var, s6 s6Var, Map<l1, Object> map, float f10) {
        s6 s6VarA = null;
        try {
            j6.a(this.f62124a, s6Var);
            if (r3.f62277c && r3.f62296v[1]) {
                r3.f62293s = true;
                s6VarA = a5Var.a(this.f62125b, map);
                r3.f62293s = false;
                if (s6VarA != null && s6VarA.k() != null) {
                    return a(s6VarA, f10, 0, 0);
                }
            }
        } catch (a unused) {
            r3.f62293s = false;
        }
        float fE = pVar.e() / pVar.c();
        if (fE < 1.0f) {
            fE = 1.0f / fE;
        }
        if (!r3.f62287m && !r3.f62288n) {
            double d10 = fE;
            if (d10 > 1.27d && d10 < 1.272d) {
                r3.f62295u = true;
                try {
                    s6VarA = a5Var.a(new p(new e4(p4Var)), map);
                    if (s6VarA != null && s6VarA.k() != null) {
                        return a(s6VarA, f10, 0, 0);
                    }
                } catch (a unused2) {
                    Log.e("DecodeProcessor", "decodeQRUseFullImgTryHardSpecialCase AIScanException");
                }
                r3.f62295u = false;
            }
        }
        return s6VarA;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ad A[Catch: a -> 0x00c0, TryCatch #3 {a -> 0x00c0, blocks: (B:35:0x0097, B:37:0x00ad, B:39:0x00b3, B:41:0x00bb, B:42:0x00bf), top: B:103:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fc A[Catch: a -> 0x010f, TryCatch #2 {a -> 0x010f, blocks: (B:53:0x00d9, B:55:0x00fc, B:57:0x0102, B:59:0x010a, B:60:0x010e), top: B:102:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0116  */
    /* JADX WARN: Code duplicated, block: B:65:0x011c  */
    /* JADX WARN: Code duplicated, block: B:71:0x016e A[Catch: a -> 0x01fb, TRY_LEAVE, TryCatch #6 {a -> 0x01fb, blocks: (B:69:0x0124, B:71:0x016e, B:84:0x01c4, B:86:0x01d1, B:88:0x01d7, B:90:0x01dc, B:91:0x01f2, B:93:0x01f6, B:94:0x01fa, B:72:0x018d, B:74:0x0193, B:76:0x0199, B:78:0x019e, B:79:0x01b8, B:81:0x01bc, B:82:0x01c0), top: B:107:0x0124, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0193 A[Catch: a -> 0x01c1, TryCatch #4 {a -> 0x01c1, blocks: (B:72:0x018d, B:74:0x0193, B:76:0x0199, B:78:0x019e, B:79:0x01b8, B:81:0x01bc, B:82:0x01c0), top: B:104:0x018d, outer: #6 }] */
    private s6 a(p pVar, s6 s6Var, s6 s6Var2, a5 a5Var, Map<l1, Object> map, float f10, i2 i2Var) {
        s6 s6VarA;
        s6 s6Var3;
        s6 s6VarA2;
        s6 s6VarA3;
        int iMax;
        int iMax2;
        float[] fArr;
        byte[] bArrQRCornerDetect;
        p pVar2;
        s6 s6VarA4;
        try {
            if (r3.f62275a) {
                pVar.a(a(pVar.d(), pVar.e(), pVar.c(), false));
                s6VarA = a5Var.a(pVar, map);
                if (s6VarA != null) {
                    try {
                        if (s6VarA.k() == null && s6VarA.j() != null && s6VarA.j().length >= 3) {
                            s6Var3 = new s6(null, null, s6VarA.j(), BarcodeFormat.QR_CODE);
                            try {
                                s6VarA = a(pVar, map, s6VarA, new double[]{0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d});
                            } catch (a unused) {
                                if (s6VarA == null) {
                                    s6VarA2 = a5Var.a(a(pVar.d(), pVar.e(), pVar.c()), map);
                                    if (s6VarA2 != null) {
                                    }
                                    throw a.a();
                                }
                                try {
                                    s6VarA2 = a5Var.a(a(pVar.d(), pVar.e(), pVar.c()), map);
                                    if (s6VarA2 != null) {
                                    }
                                    throw a.a();
                                } catch (a unused2) {
                                    Log.e("DecodeProcessor", "decodeQRUseDetResHard sharpenMethod AIScanException");
                                    if (s6VarA == null) {
                                        p pVar3 = new p(new e4(pVar.a().c()));
                                        pVar3.a(pVar.b().d());
                                        s6VarA3 = a5Var.a(pVar3, map);
                                        if (s6VarA3 != null) {
                                        }
                                        throw a.a();
                                    }
                                    try {
                                        p pVar4 = new p(new e4(pVar.a().c()));
                                        pVar4.a(pVar.b().d());
                                        s6VarA3 = a5Var.a(pVar4, map);
                                        if (s6VarA3 != null) {
                                        }
                                        throw a.a();
                                    } catch (a unused3) {
                                        Log.e("DecodeProcessor", "decodeQRUseDetResHard InvMethod AIScanException");
                                        if (s6VarA != null) {
                                            try {
                                                iMax = (int) Math.max(i2Var.d(), 0.0f);
                                                iMax2 = (int) Math.max(i2Var.e(), 0.0f);
                                                int iMin = (int) Math.min(i2Var.f(), this.f62124a.c() - iMax);
                                                int iMin2 = (int) Math.min(i2Var.c(), this.f62124a.a() - iMax2);
                                                fArr = new float[8];
                                                bArrQRCornerDetect = LoadOpencvJNIUtil.QRCornerDetect(this.f62124a.a(iMax, iMax2, iMin, iMin2).b(), iMin, iMin2, fArr);
                                                if (bArrQRCornerDetect.length != 0) {
                                                    pVar2 = new p(new k5(new e6(bArrQRCornerDetect, 256, 256, 0, 0, 256, 256, false)));
                                                    try {
                                                        s6VarA4 = a5Var.a(pVar2, map);
                                                        if (s6VarA4 != null) {
                                                        }
                                                        throw a.a();
                                                    } catch (a unused4) {
                                                        pVar2.a(a(bArrQRCornerDetect, 256, 256, false));
                                                        s6 s6VarA5 = a5Var.a(pVar2, map);
                                                        if (s6VarA5 == null || s6VarA5.k() == null) {
                                                            throw a.a();
                                                        }
                                                        u6[] u6VarArr = new u6[4];
                                                        for (int i10 = 0; i10 < 4; i10++) {
                                                            int i11 = i10 * 2;
                                                            u6VarArr[i10] = new u6(fArr[i11] + iMax, fArr[i11 + 1] + iMax2);
                                                        }
                                                        s6VarA5.b(u6VarArr);
                                                        return s6VarA5;
                                                    }
                                                }
                                            } catch (a unused5) {
                                                Log.e("DecodeProcessor", "decodeQRUseDetResHard CornerMethod AIScanException");
                                                return s6Var3;
                                            }
                                        } else {
                                            iMax = (int) Math.max(i2Var.d(), 0.0f);
                                            iMax2 = (int) Math.max(i2Var.e(), 0.0f);
                                            int iMin3 = (int) Math.min(i2Var.f(), this.f62124a.c() - iMax);
                                            int iMin4 = (int) Math.min(i2Var.c(), this.f62124a.a() - iMax2);
                                            fArr = new float[8];
                                            bArrQRCornerDetect = LoadOpencvJNIUtil.QRCornerDetect(this.f62124a.a(iMax, iMax2, iMin3, iMin4).b(), iMin3, iMin4, fArr);
                                            if (bArrQRCornerDetect.length != 0) {
                                                pVar2 = new p(new k5(new e6(bArrQRCornerDetect, 256, 256, 0, 0, 256, 256, false)));
                                                s6VarA4 = a5Var.a(pVar2, map);
                                                if (s6VarA4 != null) {
                                                }
                                                throw a.a();
                                            }
                                        }
                                        return s6Var3;
                                    }
                                    if (s6VarA != null) {
                                        iMax = (int) Math.max(i2Var.d(), 0.0f);
                                        iMax2 = (int) Math.max(i2Var.e(), 0.0f);
                                        int iMin5 = (int) Math.min(i2Var.f(), this.f62124a.c() - iMax);
                                        int iMin6 = (int) Math.min(i2Var.c(), this.f62124a.a() - iMax2);
                                        fArr = new float[8];
                                        bArrQRCornerDetect = LoadOpencvJNIUtil.QRCornerDetect(this.f62124a.a(iMax, iMax2, iMin5, iMin6).b(), iMin5, iMin6, fArr);
                                        if (bArrQRCornerDetect.length != 0) {
                                            pVar2 = new p(new k5(new e6(bArrQRCornerDetect, 256, 256, 0, 0, 256, 256, false)));
                                            s6VarA4 = a5Var.a(pVar2, map);
                                            if (s6VarA4 != null) {
                                            }
                                            throw a.a();
                                        }
                                    } else {
                                        iMax = (int) Math.max(i2Var.d(), 0.0f);
                                        iMax2 = (int) Math.max(i2Var.e(), 0.0f);
                                        int iMin7 = (int) Math.min(i2Var.f(), this.f62124a.c() - iMax);
                                        int iMin8 = (int) Math.min(i2Var.c(), this.f62124a.a() - iMax2);
                                        fArr = new float[8];
                                        bArrQRCornerDetect = LoadOpencvJNIUtil.QRCornerDetect(this.f62124a.a(iMax, iMax2, iMin7, iMin8).b(), iMin7, iMin8, fArr);
                                        if (bArrQRCornerDetect.length != 0) {
                                            pVar2 = new p(new k5(new e6(bArrQRCornerDetect, 256, 256, 0, 0, 256, 256, false)));
                                            s6VarA4 = a5Var.a(pVar2, map);
                                            if (s6VarA4 != null) {
                                            }
                                            throw a.a();
                                        }
                                    }
                                    return s6Var3;
                                }
                                if (s6VarA == null) {
                                    p pVar5 = new p(new e4(pVar.a().c()));
                                    pVar5.a(pVar.b().d());
                                    s6VarA3 = a5Var.a(pVar5, map);
                                    if (s6VarA3 != null) {
                                    }
                                    throw a.a();
                                }
                                p pVar6 = new p(new e4(pVar.a().c()));
                                pVar6.a(pVar.b().d());
                                s6VarA3 = a5Var.a(pVar6, map);
                                if (s6VarA3 != null) {
                                }
                                throw a.a();
                                if (s6VarA != null) {
                                    iMax = (int) Math.max(i2Var.d(), 0.0f);
                                    iMax2 = (int) Math.max(i2Var.e(), 0.0f);
                                    int iMin9 = (int) Math.min(i2Var.f(), this.f62124a.c() - iMax);
                                    int iMin10 = (int) Math.min(i2Var.c(), this.f62124a.a() - iMax2);
                                    fArr = new float[8];
                                    bArrQRCornerDetect = LoadOpencvJNIUtil.QRCornerDetect(this.f62124a.a(iMax, iMax2, iMin9, iMin10).b(), iMin9, iMin10, fArr);
                                    if (bArrQRCornerDetect.length != 0) {
                                        pVar2 = new p(new k5(new e6(bArrQRCornerDetect, 256, 256, 0, 0, 256, 256, false)));
                                        s6VarA4 = a5Var.a(pVar2, map);
                                        if (s6VarA4 != null) {
                                        }
                                        throw a.a();
                                    }
                                } else {
                                    iMax = (int) Math.max(i2Var.d(), 0.0f);
                                    iMax2 = (int) Math.max(i2Var.e(), 0.0f);
                                    int iMin11 = (int) Math.min(i2Var.f(), this.f62124a.c() - iMax);
                                    int iMin12 = (int) Math.min(i2Var.c(), this.f62124a.a() - iMax2);
                                    fArr = new float[8];
                                    bArrQRCornerDetect = LoadOpencvJNIUtil.QRCornerDetect(this.f62124a.a(iMax, iMax2, iMin11, iMin12).b(), iMin11, iMin12, fArr);
                                    if (bArrQRCornerDetect.length != 0) {
                                        pVar2 = new p(new k5(new e6(bArrQRCornerDetect, 256, 256, 0, 0, 256, 256, false)));
                                        s6VarA4 = a5Var.a(pVar2, map);
                                        if (s6VarA4 != null) {
                                        }
                                        throw a.a();
                                    }
                                }
                                return s6Var3;
                            }
                        }
                    } catch (a unused6) {
                        s6Var3 = s6Var2;
                        if ((s6VarA == null || s6VarA.k() == null) && r3.f62277c && !r3.f62276b) {
                            s6VarA2 = a5Var.a(a(pVar.d(), pVar.e(), pVar.c()), map);
                            if (s6VarA2 != null || s6VarA2.k() == null) {
                                throw a.a();
                            }
                            k2.a(s6VarA2.j(), f10, i2Var);
                            return s6VarA2;
                        }
                        if ((s6VarA == null || s6VarA.k() == null) && (r3.f62298x || (!r3.f62277c && r3.f62291q))) {
                            p pVar7 = new p(new e4(pVar.a().c()));
                            pVar7.a(pVar.b().d());
                            s6VarA3 = a5Var.a(pVar7, map);
                            if (s6VarA3 != null || s6VarA3.k() == null) {
                                throw a.a();
                            }
                            k2.a(s6VarA3.j(), f10, i2Var);
                            return s6VarA3;
                        }
                        if ((s6VarA != null || s6VarA.k() == null) && r3.f62286l && !r3.f62276b) {
                            iMax = (int) Math.max(i2Var.d(), 0.0f);
                            iMax2 = (int) Math.max(i2Var.e(), 0.0f);
                            int iMin13 = (int) Math.min(i2Var.f(), this.f62124a.c() - iMax);
                            int iMin14 = (int) Math.min(i2Var.c(), this.f62124a.a() - iMax2);
                            fArr = new float[8];
                            bArrQRCornerDetect = LoadOpencvJNIUtil.QRCornerDetect(this.f62124a.a(iMax, iMax2, iMin13, iMin14).b(), iMin13, iMin14, fArr);
                            if (bArrQRCornerDetect.length != 0) {
                                pVar2 = new p(new k5(new e6(bArrQRCornerDetect, 256, 256, 0, 0, 256, 256, false)));
                                s6VarA4 = a5Var.a(pVar2, map);
                                if (s6VarA4 != null || s6VarA4.k() == null) {
                                    throw a.a();
                                }
                                u6[] u6VarArr2 = new u6[4];
                                int i12 = 0;
                                for (int i13 = 4; i12 < i13; i13 = 4) {
                                    int i14 = i12 * 2;
                                    u6VarArr2[i12] = new u6(fArr[i14] + iMax, fArr[i14 + 1] + iMax2);
                                    i12++;
                                }
                                s6VarA4.b(u6VarArr2);
                                return s6VarA4;
                            }
                        }
                        return s6Var3;
                    }
                }
                if (s6VarA != null && s6VarA.k() != null) {
                    k2.a(s6VarA.j(), f10, i2Var);
                    return s6VarA;
                }
            }
            throw a.a();
        } catch (a unused7) {
            s6VarA = s6Var;
        }
    }

    private s6 a(p pVar, Map<l1, Object> map, s6 s6Var, double[] dArr) throws a {
        s6 s6VarA;
        if (pVar == null) {
            return null;
        }
        a5 a5Var = new a5();
        int[] iArr = {0, 0};
        byte[] bArrA = k7.a(pVar, map, s6Var, iArr, dArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        e6 e6Var = new e6(bArrA, i10, i11, 0, 0, i10, i11, false);
        try {
            s6VarA = a5Var.a(new p(new q3(e6Var)), map);
            if (s6VarA != null) {
                try {
                    if (s6VarA.k() != null) {
                        u6[] u6VarArrA = k7.a(s6VarA.j(), pVar.e(), pVar.c(), dArr);
                        s6VarA.a();
                        s6VarA.b(u6VarArrA);
                        return s6VarA;
                    }
                } catch (a unused) {
                    p pVar2 = new p(new e4(e6Var));
                    try {
                        s6 s6VarA2 = a5Var.a(pVar2, map);
                        if (s6VarA2 == null || s6VarA2.k() == null) {
                            throw a.a();
                        }
                        u6[] u6VarArrA2 = k7.a(s6VarA2.j(), pVar.e(), pVar.c(), dArr);
                        s6VarA2.a();
                        s6VarA2.b(u6VarArrA2);
                        return s6VarA2;
                    } catch (a unused2) {
                        pVar2.a(a(e6Var.b(), e6Var.c(), e6Var.a(), false));
                        try {
                            s6 s6VarA3 = a5Var.a(pVar2, map);
                            if (s6VarA3 == null || s6VarA3.k() == null) {
                                throw a.a();
                            }
                            u6[] u6VarArrA3 = k7.a(s6VarA3.j(), pVar.e(), pVar.c(), dArr);
                            s6VarA3.a();
                            s6VarA3.b(u6VarArrA3);
                            return s6VarA3;
                        } catch (a unused3) {
                            Log.e("DecodeProcessor", "rotatedQRBinarizer  AIScanException");
                            return s6VarA;
                        }
                    }
                }
            }
            throw a.a();
        } catch (a unused4) {
            s6VarA = s6Var;
        }
    }

    private s6 a(s6 s6Var, float f10, int i10, int i11) {
        if (s6Var != null && s6Var.j().length == 4 && (Math.abs(f10 - 1.0f) >= 1.0E-6f || i10 != 0 || i11 != 0)) {
            u6[] u6VarArr = new u6[4];
            for (int i12 = 0; i12 < 4; i12++) {
                u6VarArr[i12] = new u6((s6Var.j()[i12].b() * f10) + i10, (s6Var.j()[i12].c() * f10) + i11);
            }
            s6Var.a();
            s6Var.a(u6VarArr);
        }
        return s6Var;
    }

    static s6 a(List<i2> list, n1 n1Var) {
        for (i2 i2Var : list) {
            if (r3.f62276b || i2Var.h() > 0.4d) {
                int iJ = (int) i2Var.j();
                int iK = (int) i2Var.k();
                if (iJ > n1Var.f62124a.c() / 3 && iJ < (n1Var.f62124a.c() * 2) / 3 && iK > n1Var.f62124a.a() / 3 && iK < (n1Var.f62124a.a() * 2) / 3) {
                    float fC = n1Var.c(n1Var.f62127d);
                    s6 s6Var = new s6(1.0f);
                    s6Var.a(fC);
                    s6Var.a(i2Var);
                    return s6Var;
                }
            }
        }
        return null;
    }

    public static s a(byte[] bArr, int i10, int i11, boolean z10) throws a {
        int i12 = i10 / 11;
        byte[] bArrAdaptivebinary = LoadOpencvJNIUtil.adaptivebinary(bArr, i11, i10, (i12 + (i12 % 2)) - 1, z10);
        if (bArrAdaptivebinary == null) {
            throw a.a();
        }
        s sVar = new s(i10, i11);
        for (int i13 = 0; i13 < i11; i13++) {
            for (int i14 = 0; i14 < i10; i14++) {
                if (bArrAdaptivebinary[(i13 * i10) + i14] == 0) {
                    sVar.c(i14, i13);
                }
            }
        }
        return sVar;
    }

    private void a(List<i2> list) {
        for (i2 i2Var : list) {
            i2Var.a(this.f62124a.c(), this.f62124a.a(), this.f62134k, this.f62135l);
            float fMin = Math.min(Math.abs(i2Var.i() % 90.0f), 90.0f - Math.abs(i2Var.i() % 90.0f));
            if (i2Var.c() * i2Var.f() > this.f62124a.a() * 0.9f * this.f62124a.c() && fMin < 5.0f) {
                i2Var.b(this.f62124a.c(), this.f62124a.a());
            }
        }
    }

    private static boolean a(p pVar, i2 i2Var) {
        if (r3.f62275a && !r3.f62276b) {
            float fD = i2Var.d();
            float fE = i2Var.e();
            float f10 = i2Var.f();
            float fC = i2Var.c();
            float f11 = fD - ((f10 * 0.2f) / 2.0f);
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            float f12 = fE - ((0.2f * fC) / 2.0f);
            float f13 = f12 >= 0.0f ? f12 : 0.0f;
            float fE2 = (f10 * 1.2f) + f11;
            if (fE2 > pVar.e()) {
                fE2 = pVar.e();
            }
            float fC2 = (fC * 1.2f) + f13;
            if (fC2 > pVar.c()) {
                fC2 = pVar.c();
            }
            float f14 = fE2 - f11;
            float f15 = fC2 - f13;
            if (f14 < pVar.e() / 2.0f && f15 < pVar.c() / 2.0f) {
                for (i2 i2Var2 : k2.a(r3.f62276b, pVar.a((int) f11, (int) f13, (int) f14, (int) f15), 0, true)) {
                    boolean z10 = i2Var2.g() == 1.0f && ((double) i2Var2.h()) > 0.5d;
                    boolean z11 = i2Var.g() == 2.0f && i2Var2.g() == 2.0f && ((double) i2Var2.h()) > 0.7d;
                    boolean z12 = i2Var.g() == 3.0f && i2Var2.g() == 3.0f && ((double) i2Var2.h()) > 0.7d;
                    boolean z13 = i2Var.g() == 7.0f && i2Var2.g() == 7.0f && ((double) i2Var2.h()) > 0.7d;
                    boolean z14 = i2Var.g() == 6.0f && i2Var2.g() == 6.0f && ((double) i2Var2.h()) > 0.7d;
                    if (z10 || z11 || z12 || z13 || z14) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static boolean a(List<i2> list, boolean z10) {
        if (z10 || r3.f62276b) {
            r3.f62299y = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
            r3.f62300z = 0;
            return false;
        }
        float[] fArrA = a(list.get(0));
        float fA = a(fArrA);
        r3.f62299y = fArrA;
        if (fA >= 0.6f) {
            r3.f62300z++;
        } else {
            r3.f62300z = 1;
        }
        o4.d("DecodeProcessor", "iou: " + fA + " focusAreaFrameCount: " + r3.f62300z);
        if (r3.f62300z < 8) {
            return false;
        }
        o4.d("DecodeProcessor", "need area focus");
        r3.f62300z = 1;
        return true;
    }

    public static float[] a(i2 i2Var) {
        int i10 = i2Var.f61937s;
        int i11 = i2Var.f61936r;
        return new float[]{i10, i11, i10 + i2Var.f61935q, i11 + i2Var.f61934p};
    }

    private p b(p pVar) {
        int iE = pVar.e();
        int iC = pVar.c();
        if (iE < iC) {
            if (iC / iE <= 1.2d) {
                return pVar;
            }
            int i10 = (int) (((double) iE) * 1.2d);
            int i11 = (iC - i10) / 2;
            this.f62135l = i11;
            return pVar.a(0, i11, iE, i10);
        }
        if (iE / iC <= 1.2d) {
            return pVar;
        }
        int i12 = (int) (((double) iC) * 1.2d);
        int i13 = (iE - i12) / 2;
        this.f62134k = i13;
        return pVar.a(i13, 0, i12, iC);
    }

    static boolean b(p pVar, i2 i2Var) {
        if (r3.f62275a && !r3.f62276b) {
            float fD = i2Var.d();
            float fE = i2Var.e();
            float f10 = i2Var.f();
            float fC = i2Var.c();
            float f11 = fD - ((f10 * 0.2f) / 2.0f);
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            float f12 = fE - ((0.2f * fC) / 2.0f);
            float f13 = f12 >= 0.0f ? f12 : 0.0f;
            float fE2 = (f10 * 1.2f) + f11;
            if (fE2 > pVar.e()) {
                fE2 = pVar.e();
            }
            float fC2 = (fC * 1.2f) + f13;
            if (fC2 > pVar.c()) {
                fC2 = pVar.c();
            }
            List<i2> listA = k2.a(r3.f62276b, pVar.a((int) f11, (int) f13, (int) (fE2 - f11), (int) (fC2 - f13)), 0, true);
            if (!listA.isEmpty() && listA.get(0).g() == 6.0f) {
                return true;
            }
        }
        return false;
    }

    public p a() {
        return this.f62125b;
    }

    public s6 a(List<BarcodeFormat> list, i2 i2Var) {
        a5 a5Var = new a5();
        HashMap map = new HashMap();
        map.put(l1.POSSIBLE_FORMATS, list);
        if (r3.f62277c) {
            map.put(l1.PHOTO_MODE, Boolean.valueOf(r3.f62277c));
        }
        s6 s6VarA = null;
        try {
            s6VarA = i2Var != null ? a5Var.a(this.f62125b, this.f62127d, map, this.f62132i, i2Var) : a5Var.a(this.f62125b, (p) null, map, this.f62132i, (i2) null);
        } catch (a unused) {
            Log.e("DecodeProcessor", "decode1d AIScanException");
        }
        if (s6VarA != null || r3.f62276b || i2Var == null || !r3.f62277c || i2Var.h() >= 0.8d) {
            return s6VarA;
        }
        float fI = i2Var.i() % 180.0f;
        boolean z10 = true;
        boolean z11 = ((double) i2Var.c()) > ((double) this.f62125b.c()) * 0.97d && ((fI < 5.0f && fI > -5.0f) || fI < -175.0f || fI > 175.0f);
        if (i2Var.b() <= ((double) this.f62125b.e()) * 0.97d || ((fI >= 95.0f || fI <= 85.0f) && (fI >= -85.0f || fI <= -95.0f))) {
            z10 = false;
        }
        if (!z11 && !z10) {
            return s6VarA;
        }
        this.f62132i.a();
        try {
            return a5Var.a(this.f62125b, (p) null, map, this.f62132i, (i2) null);
        } catch (a unused2) {
            Log.e("DecodeProcessor", "decode1d AIScanException");
            return s6VarA;
        }
    }

    public s6 a(Map<l1, Object> map) {
        p4 p4VarC;
        float f10;
        a5 a5Var = new a5();
        p4 p4Var = this.f62124a;
        if (!r3.f62275a || (this.f62125b.e() <= 800 && this.f62125b.c() <= 800)) {
            p4VarC = p4Var;
            f10 = 1.0f;
        } else {
            float fMax = Math.max(this.f62125b.e(), this.f62125b.c()) / 800.0f;
            if (r3.f62277c && (this.f62125b.e() > this.f62125b.c() * this.f62133j || this.f62125b.c() > this.f62125b.e() * this.f62133j)) {
                fMax = Math.min(this.f62125b.e(), this.f62125b.c()) / 860.0f;
            }
            p4VarC = this.f62132i.d(this.f62125b, fMax).a().c();
            f10 = fMax;
        }
        if (p4VarC == null) {
            return null;
        }
        p pVar = new p(new q3(p4VarC));
        j6.a(this.f62124a);
        try {
            if (r3.f62275a) {
                pVar.a(a(p4VarC.b(), p4VarC.c(), p4VarC.a(), false));
            }
            s6 s6VarA = a5Var.a(pVar, map);
            if (s6VarA != null && s6VarA.k() != null) {
                return a(s6VarA, f10, 0, 0);
            }
            s6 s6Var = (s6VarA == null || s6VarA.j() == null || s6VarA.j().length < 3) ? null : new s6(null, null, s6VarA.j(), BarcodeFormat.QR_CODE);
            s6 s6Var2 = s6Var == null ? new s6(null, null, null, BarcodeFormat.QR_CODE) : s6Var;
            if (r3.f62277c) {
                s6Var2 = a(a5Var, p4VarC, s6Var2, map, f10, 0, 0);
            }
            if (s6Var2 != null && s6Var2.k() != null) {
                return s6Var2;
            }
            if (s6Var2 != null && s6Var2.j() != null) {
                s6Var = s6Var2;
            }
            if (!r3.f62277c && s6Var != null && s6Var.j() != null && s6Var.j().length >= 3) {
                a(s6Var, f10, 0, 0);
                float fA = o8.a(this.f62124a.c(), this.f62124a.a(), s6Var.j());
                if (Math.abs(1.0f - fA) > 0.001d) {
                    this.f62129f = fA;
                    this.f62128e = true;
                }
            }
            return s6Var;
        } catch (a unused) {
            Log.e("DecodeProcessor", "decodeQRUseFullImg AIScanException");
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:61:0x0112  */
    public s6 a(Map<l1, Object> map, i2 i2Var) {
        p pVar;
        float f10;
        s6 s6Var;
        s6 s6Var2;
        p pVar2;
        s6 s6VarA;
        float fA;
        a5 a5Var = new a5();
        p pVar3 = this.f62127d;
        s6 s6Var3 = null;
        if (pVar3 == null) {
            return null;
        }
        r3.f62282h = true;
        int iE = pVar3.e() > this.f62127d.c() ? this.f62127d.e() : this.f62127d.c();
        if (!r3.f62275a || iE <= 500) {
            pVar = this.f62127d;
            f10 = 1.0f;
        } else {
            float f11 = iE / 500.0f;
            if (f11 < 1.0f) {
                f11 = 1.0f;
            }
            pVar = this.f62132i.g(this.f62127d, f11);
            f10 = f11;
        }
        try {
            if (r3.f62289o) {
                pVar = new p(new q3(j7.b(pVar.a().c())));
            }
            s6 s6VarA2 = a5Var.a(pVar, map);
            if (s6VarA2 != null) {
                try {
                    if (s6VarA2.k() != null || s6VarA2.j() == null || s6VarA2.j().length < 3) {
                        s6Var = null;
                    } else {
                        s6Var = new s6(null, null, s6VarA2.j(), BarcodeFormat.QR_CODE);
                        try {
                            s6VarA2 = a(pVar, map, s6VarA2, new double[]{0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d});
                        } catch (a unused) {
                            pVar2 = pVar;
                            s6Var2 = s6VarA2;
                            s6VarA = a(pVar2, s6Var2, s6Var, a5Var, map, f10, i2Var);
                            if (s6VarA != null) {
                            }
                            k2.a(s6VarA.j(), f10, i2Var);
                            fA = o8.a(this.f62124a.c(), this.f62124a.a(), s6VarA.j());
                            if (Math.abs(1.0f - fA) > 0.001d) {
                                this.f62129f = fA;
                                this.f62128e = true;
                            }
                            return s6VarA;
                        }
                    }
                } catch (a unused2) {
                    s6Var = null;
                    s6Var3 = s6VarA2;
                    p pVar4 = pVar;
                    s6Var2 = s6Var3;
                    pVar2 = pVar4;
                    s6VarA = a(pVar2, s6Var2, s6Var, a5Var, map, f10, i2Var);
                    if ((s6VarA != null || s6VarA.k() == null) && !r3.f62277c && s6VarA != null && s6VarA.j() != null && s6VarA.j().length >= 3) {
                        k2.a(s6VarA.j(), f10, i2Var);
                        fA = o8.a(this.f62124a.c(), this.f62124a.a(), s6VarA.j());
                        if (Math.abs(1.0f - fA) > 0.001d) {
                            this.f62129f = fA;
                            this.f62128e = true;
                        }
                    }
                    return s6VarA;
                }
            } else {
                s6Var = null;
            }
            s6Var3 = s6VarA2;
            if (s6Var3 != null) {
                try {
                    if (s6Var3.k() != null) {
                        k2.a(s6Var3.j(), f10, i2Var);
                        return s6Var3;
                    }
                } catch (a unused3) {
                    p pVar5 = pVar;
                    s6Var2 = s6Var3;
                    pVar2 = pVar5;
                    s6VarA = a(pVar2, s6Var2, s6Var, a5Var, map, f10, i2Var);
                    if (s6VarA != null) {
                    }
                    k2.a(s6VarA.j(), f10, i2Var);
                    fA = o8.a(this.f62124a.c(), this.f62124a.a(), s6VarA.j());
                    if (Math.abs(1.0f - fA) > 0.001d) {
                        this.f62129f = fA;
                        this.f62128e = true;
                    }
                    return s6VarA;
                }
            }
            throw a.a();
        } catch (a unused4) {
            s6Var = null;
        }
    }

    public List<i2> a(int i10, boolean z10) {
        List<i2> listA;
        ArrayList arrayList = new ArrayList();
        if (!r3.f62275a) {
            return arrayList;
        }
        boolean z11 = r3.f62276b;
        if (z11) {
            listA = k2.a(z11, this.f62125b, i10, z10);
        } else {
            byte[] bArrC = y4.c();
            byte[] bArrA = y4.a();
            byte[] bArrB = y4.b();
            LoadOpencvJNIUtil.setModel(bArrC, bArrC.length, bArrA, bArrA.length, bArrB, bArrB.length);
            p pVarA = this.f62125b;
            long jCurrentTimeMillis = System.currentTimeMillis() % 10;
            boolean z12 = jCurrentTimeMillis % 2 == 0;
            boolean z13 = jCurrentTimeMillis % 3 == 0;
            if (i10 == 0 && !r3.f62277c && z12) {
                pVarA = b(this.f62125b);
            } else if (i10 == 0 && !r3.f62277c && z13) {
                pVarA = a(b(this.f62125b));
            }
            listA = k2.a(r3.f62276b, pVarA, i10, z10);
        }
        List<i2> list = listA;
        a(list);
        return list;
    }

    public s6 b(List<BarcodeFormat> list, i2 i2Var) {
        s6 s6VarB;
        a5 a5Var = new a5();
        HashMap map = new HashMap();
        map.put(l1.POSSIBLE_FORMATS, list);
        try {
            s6VarB = i2Var != null ? a5Var.b(this.f62125b, this.f62126c, this.f62127d, map, this.f62132i, i2Var) : a5Var.b(this.f62125b, this.f62126c, null, map, this.f62132i, null);
            try {
                if (!r3.f62277c && s6VarB != null && s6VarB.k() == null && s6VarB.j() != null && s6VarB.j().length >= 3) {
                    float fB = o8.b(this.f62124a.c(), this.f62124a.a(), s6VarB.j());
                    if (Math.abs(1.0f - fB) > 0.001d) {
                        this.f62131h = fB;
                        this.f62128e = true;
                    }
                }
            } catch (a unused) {
                Log.e("DecodeProcessor", "decode2d AIScanException");
            }
        } catch (a unused2) {
            s6VarB = null;
        }
        return s6VarB;
    }

    public void b(i2 i2Var) {
        try {
            if (r3.f62275a) {
                k2.a(r3.f62276b, this.f62125b, i2Var);
                this.f62127d = i2Var.f61930l;
            }
        } catch (a unused) {
            Log.e("DecodeProcessor", "cropAndRotate AIScanException");
        }
    }

    public boolean b() {
        return this.f62128e;
    }

    public boolean b(List<i2> list) {
        int i10;
        for (i2 i2Var : list) {
            boolean z10 = i2Var.g() == 1.0f && ((double) i2Var.h()) > 0.7d;
            boolean z11 = i2Var.g() == 1.0f && ((double) i2Var.h()) > 0.4d;
            boolean z12 = i2Var.g() == 2.0f && ((double) i2Var.h()) > 0.7d;
            boolean z13 = i2Var.g() == 3.0f && ((double) i2Var.h()) > 0.7d;
            boolean z14 = i2Var.g() == 6.0f && ((double) i2Var.h()) > 0.7d;
            boolean z15 = i2Var.g() == 7.0f && ((double) i2Var.h()) > 0.7d;
            if (z11 || z12 || z13 || z14 || z15) {
                if (z10 || a(this.f62125b, i2Var) || (i10 = r3.f62285k) > 4) {
                    r3.f62285k = 0;
                    float fB = o8.b(this.f62124a.c(), this.f62124a.a(), new u6[]{new u6(i2Var.d(), i2Var.e()), new u6(i2Var.d() + i2Var.f(), i2Var.e()), new u6(i2Var.d(), i2Var.e() + i2Var.c())});
                    if (fB > 1.001f) {
                        this.f62130g = fB;
                        this.f62128e = true;
                    }
                } else {
                    r3.f62285k = i10 + 2;
                }
            }
        }
        return this.f62128e;
    }

    public float c() {
        return this.f62129f;
    }

    public float c(p pVar) {
        byte[] bArrB = (pVar == null || (pVar.a() == null && pVar.a().c() == null)) ? null : pVar.a().c().b();
        if (bArrB == null) {
            return 1.0f;
        }
        long j10 = 0;
        int iE = pVar.e();
        int iC = pVar.c();
        for (int i10 = iC / 4; i10 < (iC * 3) / 4; i10++) {
            for (int i11 = iE / 4; i11 < (iE * 3) / 4; i11++) {
                j10 += (long) (bArrB[(i10 * iE) + i11] & 255);
            }
        }
        return (j10 / ((long) bArrB.length)) * 4;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x009d A[Catch: a -> 0x00ab, TryCatch #0 {a -> 0x00ab, blocks: (B:4:0x0014, B:5:0x0026, B:8:0x002c, B:10:0x0032, B:12:0x0038, B:14:0x0040, B:16:0x009d, B:17:0x00a1, B:19:0x00a5), top: B:23:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x00a5 A[Catch: a -> 0x00ab, TRY_LEAVE, TryCatch #0 {a -> 0x00ab, blocks: (B:4:0x0014, B:5:0x0026, B:8:0x002c, B:10:0x0032, B:12:0x0038, B:14:0x0040, B:16:0x009d, B:17:0x00a1, B:19:0x00a5), top: B:23:0x0014 }] */
    public s6 c(List<BarcodeFormat> list, i2 i2Var) {
        float fB;
        a5 a5Var = new a5();
        HashMap map = new HashMap();
        map.put(l1.POSSIBLE_FORMATS, list);
        s6 s6VarA = null;
        if (i2Var != null) {
            try {
                Log.i("DecodeProcessor", "decodeHarm start.");
                s6VarA = a5Var.a(this.f62125b, this.f62126c, this.f62127d, map, this.f62132i, i2Var);
                if (!r3.f62277c && s6VarA != null && s6VarA.k() == null && s6VarA.j() != null && s6VarA.j().length >= 3) {
                    fB = o8.b(this.f62124a.c(), this.f62124a.a(), new u6[]{new u6(i2Var.d(), i2Var.e()), new u6(i2Var.d() + i2Var.f(), i2Var.e()), new u6(i2Var.d(), i2Var.e() + i2Var.c())});
                    if (Math.abs(1.0f - fB) > 0.001d) {
                        this.f62131h = fB;
                        this.f62128e = true;
                    }
                    if (this.f62128e) {
                        Log.i("DecodeProcessor", "decodeHarm need zoom");
                    }
                }
            } catch (a unused) {
                Log.e("DecodeProcessor", "decodeHarm AIScanException");
            }
        } else if (!r3.f62277c) {
            fB = o8.b(this.f62124a.c(), this.f62124a.a(), new u6[]{new u6(i2Var.d(), i2Var.e()), new u6(i2Var.d() + i2Var.f(), i2Var.e()), new u6(i2Var.d(), i2Var.e() + i2Var.c())});
            if (Math.abs(1.0f - fB) > 0.001d) {
                this.f62131h = fB;
                this.f62128e = true;
            }
            if (this.f62128e) {
                Log.i("DecodeProcessor", "decodeHarm need zoom");
            }
        }
        return s6VarA;
    }

    public boolean c(List<i2> list) {
        int i10;
        for (i2 i2Var : list) {
            boolean z10 = i2Var.g() == 1.0f && ((double) i2Var.h()) > 0.7d;
            boolean z11 = i2Var.g() == 1.0f && ((double) i2Var.h()) > 0.4d;
            boolean z12 = i2Var.g() == 2.0f && ((double) i2Var.h()) > 0.7d;
            boolean z13 = i2Var.g() == 3.0f && ((double) i2Var.h()) > 0.7d;
            boolean z14 = i2Var.g() == 4.0f && ((double) i2Var.h()) > 0.7d;
            boolean z15 = i2Var.g() == 5.0f && ((double) i2Var.h()) > 0.7d;
            boolean z16 = i2Var.g() == 6.0f && ((double) i2Var.h()) > 0.7d;
            boolean z17 = i2Var.g() == 7.0f && ((double) i2Var.h()) > 0.7d;
            if (z11 || z12 || z13 || z16 || z17 || z14 || z15) {
                if (z10 || a(this.f62125b, i2Var) || (i10 = r3.f62285k) > 4) {
                    r3.f62285k = 0;
                    float fB = o8.b(this.f62124a.c(), this.f62124a.a(), new u6[]{new u6(i2Var.d(), i2Var.e()), new u6(i2Var.d() + i2Var.f(), i2Var.e()), new u6(i2Var.d(), i2Var.e() + i2Var.c())});
                    if (fB > 1.001f) {
                        this.f62130g = fB;
                        return true;
                    }
                } else {
                    r3.f62285k = i10 + 2;
                }
            }
        }
        return this.f62128e;
    }

    public float d() {
        return this.f62131h;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f0 A[Catch: a -> 0x00f8, TRY_ENTER, TRY_LEAVE, TryCatch #3 {a -> 0x00f8, blocks: (B:10:0x0039, B:38:0x00f0, B:18:0x005d, B:20:0x006b, B:26:0x0085, B:28:0x0090, B:32:0x009e, B:31:0x0099, B:17:0x0058, B:13:0x0047, B:15:0x004b), top: B:62:0x0039, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00fa  */
    public s6 d(List<BarcodeFormat> list, i2 i2Var) {
        s6 s6VarA;
        s6 s6VarA2;
        float fMin;
        a5 a5Var = new a5();
        HashMap map = new HashMap();
        map.put(l1.POSSIBLE_FORMATS, list);
        float f10 = 1.0f;
        s6 s6VarA3 = null;
        try {
            if (i2Var != null) {
                p pVar = this.f62127d;
                if (pVar != null) {
                    fMin = Math.min(pVar.e(), this.f62127d.c()) / 800.0f;
                    if (fMin < 1.25f) {
                        fMin = 1.0f;
                    }
                    try {
                        p pVarH = this.f62132i.h(this.f62127d, fMin);
                        try {
                            try {
                                s6VarA2 = a5Var.a(pVarH, map);
                            } catch (a unused) {
                                if (r3.f62291q) {
                                    s6VarA3 = a5Var.a(this.f62132i.g(this.f62127d, fMin), map);
                                }
                                float fI = (i2Var.i() + 180.0f) % 90.0f;
                                if (!r3.f62277c && i2Var.h() > 0.8d && (fI < 3.0f || fI > 87.0f)) {
                                    p4 p4VarC = pVarH.a().c();
                                    float f11 = 0.0f;
                                    if (fI < 3.0f) {
                                        f11 = fI * (-2.0f);
                                    } else if (fI > 87.0f) {
                                        f11 = (90.0f - fI) * 2.0f;
                                    }
                                    s6VarA2 = a5Var.a(new p(new e4(new e6(LoadOpencvJNIUtil.imageRotate(p4VarC.b(), p4VarC.a(), p4VarC.c(), p4VarC.a(), p4VarC.c(), f11, 1.0d), p4VarC.c(), p4VarC.a(), 0, 0, p4VarC.c(), p4VarC.a(), false))), map);
                                    s6VarA3 = s6VarA2;
                                    if (s6VarA3 != null) {
                                        k2.a(s6VarA3.j(), fMin, i2Var);
                                    } else {
                                        f10 = fMin;
                                    }
                                } else if (s6VarA3 != null) {
                                    k2.a(s6VarA3.j(), fMin, i2Var);
                                } else {
                                    f10 = fMin;
                                }
                                return a(s6VarA3, f10, 0, 0);
                            }
                        } catch (a unused2) {
                            Log.e("DecodeProcessor", "decodePdf417  AIScanException");
                            float fI2 = (i2Var.i() + 180.0f) % 90.0f;
                            if (!r3.f62277c) {
                            }
                            if (s6VarA3 != null) {
                                k2.a(s6VarA3.j(), fMin, i2Var);
                            } else {
                                f10 = fMin;
                            }
                            return a(s6VarA3, f10, 0, 0);
                        }
                    } catch (a unused3) {
                        f10 = fMin;
                        Log.e("DecodeProcessor", "decodePdf417 AIScanException");
                    }
                } else {
                    s6VarA2 = a5Var.a(this.f62125b, map);
                    fMin = 1.0f;
                }
                s6VarA3 = s6VarA2;
                if (s6VarA3 != null) {
                    k2.a(s6VarA3.j(), fMin, i2Var);
                } else {
                    f10 = fMin;
                }
            } else {
                int iMin = Math.min(this.f62125b.e(), this.f62125b.c());
                if (iMin > 1080) {
                    float f12 = iMin / 1080.0f;
                    if (f12 >= 1.25f) {
                        f10 = f12;
                    }
                }
                try {
                    s6VarA = a5Var.a(this.f62132i.a(this.f62125b, f10), map);
                } catch (a unused4) {
                    s6VarA = a5Var.a(this.f62132i.b(this.f62126c, f10), map);
                }
                s6VarA3 = s6VarA;
            }
        } catch (a unused5) {
            Log.e("DecodeProcessor", "decodePdf417 AIScanException");
        }
        return a(s6VarA3, f10, 0, 0);
    }

    public float e() {
        return this.f62130g;
    }

    public s6 e(List<BarcodeFormat> list, i2 i2Var) {
        HashMap map = new HashMap();
        map.put(l1.POSSIBLE_FORMATS, list);
        if (i2Var == null) {
            s6 s6VarA = a(map);
            if (s6VarA != null && s6VarA.k() == null && r3.f62291q) {
                r3.f62287m = true;
                s6VarA = a(map);
                r3.f62287m = false;
            }
            s6 s6Var = s6VarA;
            if (s6Var == null || s6Var.k() != null || !r3.f62292r) {
                return s6Var;
            }
            r3.f62288n = true;
            s6 s6VarA2 = a(map);
            r3.f62288n = false;
            return s6VarA2;
        }
        r3.f62286l = true;
        s6 s6VarA3 = a(map, i2Var);
        r3.f62286l = false;
        if (s6VarA3 != null && s6VarA3.k() == null && r3.f62290p) {
            r3.f62287m = true;
            s6VarA3 = g(list, i2Var);
            r3.f62287m = false;
        }
        if (s6VarA3 != null && s6VarA3.k() == null && r3.f62291q) {
            r3.f62288n = true;
            s6VarA3 = a(map, i2Var);
            r3.f62288n = false;
        }
        if ((s6VarA3 != null && s6VarA3.k() != null) || !r3.f62292r) {
            return s6VarA3;
        }
        r3.f62289o = true;
        s6 s6VarA4 = a(map, i2Var);
        r3.f62289o = false;
        return s6VarA4;
    }

    public s6 f(List<BarcodeFormat> list, i2 i2Var) {
        float fE;
        p pVar;
        HashMap map = new HashMap();
        map.put(l1.POSSIBLE_FORMATS, list);
        try {
            p4 p4VarC = i2Var != null ? this.f62127d.a().c() : this.f62124a;
            if (!r3.f62275a || (this.f62125b.e() <= 800 && this.f62125b.c() <= 800)) {
                fE = 1.0f;
            } else {
                fE = (this.f62125b.e() > this.f62125b.c() ? this.f62125b.e() : this.f62125b.c()) / 800.0f;
                p4VarC = this.f62132i.h(new p(new q3(p4VarC)), fE).a().c();
            }
            p4 p4Var = p4VarC;
            float f10 = fE;
            if (p4Var == null) {
                throw a.a();
            }
            if (!r3.f62275a || r3.f62276b) {
                pVar = new p(new q3(p4Var));
            } else {
                s sVarA = a(p4Var.b(), p4Var.c(), p4Var.a(), false);
                pVar = new p(new q3(p4Var));
                pVar.a(sVarA);
            }
            a5 a5Var = new a5();
            try {
                s6 s6VarA = a5Var.a(pVar, map);
                if (s6VarA == null || s6VarA.k() == null) {
                    throw a.a();
                }
                k2.a(s6VarA.j(), f10, i2Var);
                return s6VarA;
            } catch (a unused) {
                return a(a5Var, p4Var, pVar, map, f10, i2Var);
            }
        } catch (a unused2) {
            Log.e("DecodeProcessor", "decodeQRMulti AIScanException");
            return null;
        }
    }

    public s6 g(List<BarcodeFormat> list, i2 i2Var) {
        p pVarG;
        p pVar;
        s6 s6VarA;
        a5 a5Var = new a5();
        HashMap map = new HashMap();
        map.put(l1.POSSIBLE_FORMATS, list);
        float fE = 1.0f;
        if (i2Var == null) {
            if (!r3.f62275a || (this.f62125b.e() <= 500 && this.f62125b.c() <= 500)) {
                pVarG = this.f62125b;
            } else {
                fE = (this.f62125b.e() > this.f62125b.c() ? this.f62125b.e() : this.f62125b.c()) / 500.0f;
                pVarG = this.f62132i.c(this.f62125b, fE);
            }
        } else if (!r3.f62275a || (pVar = this.f62127d) == null || (pVar.e() <= 500 && this.f62127d.c() <= 500)) {
            pVarG = this.f62127d;
        } else {
            fE = (this.f62127d.e() > this.f62127d.c() ? this.f62127d.e() : this.f62127d.c()) / 500.0f;
            pVarG = this.f62132i.g(this.f62127d, fE);
        }
        try {
            s6VarA = a5Var.a(pVarG, map);
            if (s6VarA != null) {
                try {
                    if (s6VarA.k() != null) {
                        k2.a(s6VarA.j(), fE, i2Var);
                        return s6VarA;
                    }
                } catch (a unused) {
                    Log.e("DecodeProcessor", "decodeQRSimple AIScanException");
                }
            }
        } catch (a unused2) {
            s6VarA = null;
        }
        return s6VarA;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[Catch: a -> 0x005f, TRY_LEAVE, TryCatch #0 {a -> 0x005f, blocks: (B:4:0x0012, B:5:0x001a, B:8:0x0020, B:10:0x0026, B:12:0x002c, B:14:0x0034, B:16:0x0059), top: B:20:0x0012 }] */
    public s6 h(List<BarcodeFormat> list, i2 i2Var) {
        float fB;
        a5 a5Var = new a5();
        HashMap map = new HashMap();
        map.put(l1.POSSIBLE_FORMATS, list);
        s6 s6VarC = null;
        if (i2Var != null) {
            try {
                s6VarC = a5Var.c(this.f62127d, this.f62132i, map, i2Var);
                if (!r3.f62277c && s6VarC != null && s6VarC.k() == null && s6VarC.j() != null && s6VarC.j().length >= 3) {
                    fB = o8.b(this.f62124a.c(), this.f62124a.a(), s6VarC.j());
                    if (Math.abs(1.0f - fB) > 0.001d) {
                        this.f62131h = fB;
                        this.f62128e = true;
                    }
                }
            } catch (a unused) {
                Log.e("DecodeProcessor", "decode2d AIScanException");
            }
        } else if (!r3.f62277c) {
            fB = o8.b(this.f62124a.c(), this.f62124a.a(), s6VarC.j());
            if (Math.abs(1.0f - fB) > 0.001d) {
                this.f62131h = fB;
                this.f62128e = true;
            }
        }
        return s6VarC;
    }
}
