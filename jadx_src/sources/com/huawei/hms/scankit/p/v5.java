package com.huawei.hms.scankit.p;

import com.huawei.hms.ml.scan.HmsScan;

/* JADX INFO: compiled from: ParserRegister.java */
/* JADX INFO: loaded from: classes7.dex */
public class v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final t6[] f62462a = {new t2(), new n4(), new f7(), new w6(), new k8(), new z(), new x7(), new y7(), new t3(), new u7(), new q4(), new x(), new c(), new i4(), new g6(), new n2()};

    public static HmsScan a(s6 s6Var) {
        if (s6Var == null) {
            return null;
        }
        for (t6 t6Var : f62462a) {
            HmsScan hmsScanB = t6Var.b(s6Var);
            if (hmsScanB != null) {
                return hmsScanB;
            }
        }
        return null;
    }
}
