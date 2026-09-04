package cn.fly.verify;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class db extends BroadcastReceiver implements dm<db> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private df f36096a;

    public void a(df dfVar) {
        this.f36096a = dfVar;
    }

    @Override // cn.fly.verify.dm
    public boolean a(db dbVar, Class<db> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        Object obj;
        if (!"setHandler".equals(str) || objArr.length != 1 || (obj = objArr[0]) == null || !(obj instanceof df)) {
            return false;
        }
        dbVar.a((df) obj);
        return true;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f36096a != null) {
            try {
                ArrayList<Object> arrayList = new ArrayList<>(1);
                arrayList.add(intent);
                this.f36096a.a("onReceive", arrayList);
            } catch (Throwable unused) {
            }
        }
    }
}
