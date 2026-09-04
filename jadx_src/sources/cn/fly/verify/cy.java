package cn.fly.verify;

import android.content.Intent;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes6.dex */
public class cy implements dm<PackageManager> {
    @Override // cn.fly.verify.dm
    public boolean a(PackageManager packageManager, Class<PackageManager> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        if (ec.a("019Sbcbe1d2bhcacc6cgdcgOcj1d_bhbbbg^adQdg").equals(str) && objArr.length == 2) {
            Object obj = objArr[0];
            if (obj instanceof Intent) {
                Object obj2 = objArr[1];
                if (obj2 instanceof Integer) {
                    objArr2[0] = packageManager.queryIntentServices((Intent) obj, ((Integer) obj2).intValue());
                    return true;
                }
            }
        }
        if (ec.a("0258chHdg[dc%b[be8caf4ccCcgdcg2eabibhejLba_cf6b:chHd").equals(str) && objArr.length == 1) {
            Object obj3 = objArr[0];
            if (obj3 instanceof String) {
                objArr2[0] = packageManager.getLaunchIntentForPackage((String) obj3);
                return true;
            }
        }
        if (ec.a("015:bhZdCdgbiReNbbFdLdb-agNbgbbbgQgTca").equals(str) && objArr.length == 2) {
            Object obj4 = objArr[0];
            if (obj4 instanceof Integer) {
                Object obj5 = objArr[1];
                if (obj5 instanceof Integer) {
                    objArr2[0] = packageManager.resolveActivity((Intent) obj4, ((Integer) obj5).intValue());
                    return true;
                }
            }
        }
        return false;
    }
}
