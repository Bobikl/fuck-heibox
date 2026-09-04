package cn.fly.verify;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* JADX INFO: loaded from: classes6.dex */
public class cv implements dm<Context> {
    @Override // cn.fly.verify.dm
    public boolean a(Context context, Class<Context> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        if (ei.a("016)ej<fi-elecfi>if?dfel]fUdjdddiEcf").equals(str) && objArr.length == 1) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                try {
                    objArr2[0] = context.getSystemService((String) obj);
                } catch (Throwable th2) {
                    objArr2[0] = null;
                    thArr[0] = th2;
                }
                return true;
            }
        }
        if ("getApplicationInfo".equals(str) && objArr.length == 0) {
            objArr2[0] = context.getApplicationInfo();
            return true;
        }
        if (ei.a("0186ejDfi@eddk2eifeiBgj0fNfidk.gCdd4f(dj").equals(str) && objArr.length == 0) {
            objArr2[0] = context.getContentResolver();
            return true;
        }
        if (ei.a("014SejEfi5glSdc<ehVd@ejXf?egCd.df^f").equals(str) && objArr.length == 0) {
            objArr2[0] = context.getPackageName();
            return true;
        }
        if (ei.a("017Oej<fi(gl?dc ehKd,ejPf)hcGded=ej%f+dj").equals(str) && objArr.length == 0) {
            objArr2[0] = context.getPackageManager();
            return true;
        }
        if (ei.a("013VfiTid'dj2iSfdRciPdidddiViNec").equals(str) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof Intent) {
                context.startActivity((Intent) obj2);
                return true;
            }
        }
        if (ei.a("011[ej8fi6gcdiHgfIfifldidj").equals(str)) {
            objArr2[0] = context.getFilesDir();
            return true;
        }
        if (ei.a("009;ej=fiGfdfifiUfi*fi").equals(str)) {
            objArr2[0] = context.getAssets();
            return true;
        }
        if (ei.a("019chfc=ehelQfgPefglQfLdjdfdififididkXe").equals(str) && objArr.length == 1) {
            Object obj3 = objArr[0];
            if (obj3 instanceof String) {
                objArr2[0] = Integer.valueOf(context.checkSelfPermission((String) obj3));
                return true;
            }
        }
        if (ei.a("011TffdiMe5dcel^f%djdddiIcf").equals(str) && objArr.length == 3) {
            objArr2[0] = Boolean.valueOf(context.bindService((Intent) objArr[0], (ServiceConnection) objArr[1], ((Integer) objArr[2]).intValue()));
            return true;
        }
        if (ei.a("013Gdg0e+ffdiLe;dcel6fQdjdddiJcf").equals(str) && objArr.length == 1) {
            Object obj4 = objArr[0];
            if (obj4 instanceof ServiceConnection) {
                context.unbindService((ServiceConnection) obj4);
                return true;
            }
        }
        return false;
    }
}
