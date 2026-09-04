package r4;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class d implements p4.b {
    @Override // p4.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean zC = e5.b.c();
        t4.a.d("getOAID", "isSupported", Boolean.valueOf(zC));
        if (zC) {
            return e5.b.d(context);
        }
        return null;
    }
}
