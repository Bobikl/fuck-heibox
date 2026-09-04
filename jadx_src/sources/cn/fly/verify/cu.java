package cn.fly.verify;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes6.dex */
public class cu implements dm<ed> {
    @Override // cn.fly.verify.dm
    public boolean a(ed edVar, Class<ed> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        if (ei.a("004*ej!fi!fl").equals(str)) {
            objArr2[0] = edVar.a();
        } else if (ei.a("008Afi;fi]feOdich").equals(str) && objArr != null && objArr.length == 1) {
            objArr2[0] = edVar.a((CountDownLatch) objArr[0]);
        } else {
            if (!ei.a("005_difiel[ji").equals(str)) {
                return false;
            }
            objArr2[0] = Boolean.valueOf(edVar.b());
        }
        return true;
    }
}
