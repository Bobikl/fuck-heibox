package r4;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class h implements p4.b {
    @Override // p4.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean zE = s5.e.e(context);
        t4.a.d("getOAID", "isSupported", Boolean.valueOf(zE));
        if (zE) {
            return s5.e.a(context);
        }
        return null;
    }
}
