package l7;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public class b implements j7.b {
    @Override // j7.b
    public boolean a(int i10, Bundle bundle, j7.a aVar) {
        if (bundle != null && aVar != null) {
            if (i10 == 9) {
                a.C1198a c1198a = new a.C1198a(bundle);
                if (!c1198a.checkArgs()) {
                    return false;
                }
                aVar.a(c1198a);
                return true;
            }
            if (i10 == 10) {
                a.b bVar = new a.b(bundle);
                if (bVar.checkArgs()) {
                    aVar.c(bVar);
                    return true;
                }
            }
        }
        return false;
    }
}
