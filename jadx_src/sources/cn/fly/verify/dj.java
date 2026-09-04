package cn.fly.verify;

/* JADX INFO: loaded from: classes6.dex */
public class dj implements dm<di> {
    @Override // cn.fly.verify.dm
    public boolean a(di diVar, Class<di> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        Object obj;
        if (!"setHandler".equals(str) || objArr.length != 1 || (obj = objArr[0]) == null || !(obj instanceof df)) {
            return false;
        }
        diVar.a((df) obj);
        return true;
    }
}
