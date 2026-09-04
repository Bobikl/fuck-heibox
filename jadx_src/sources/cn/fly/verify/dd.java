package cn.fly.verify;

import android.database.ContentObserver;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class dd extends ContentObserver implements dm<dd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private df f36097a;

    public dd() {
        super(null);
    }

    public void a(df dfVar) {
        this.f36097a = dfVar;
    }

    @Override // cn.fly.verify.dm
    public boolean a(dd ddVar, Class<dd> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        Object obj;
        if (!"setHandler".equals(str) || objArr.length != 1 || (obj = objArr[0]) == null || !(obj instanceof df)) {
            return false;
        }
        ddVar.a((df) obj);
        return true;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        if (this.f36097a != null) {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(Boolean.valueOf(z10));
            this.f36097a.a("onChange", arrayList);
        }
    }
}
