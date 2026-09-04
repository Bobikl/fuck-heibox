package m7;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public class c implements j7.b {
    @Override // j7.b
    public boolean a(int i10, Bundle bundle, j7.a aVar) {
        if (bundle != null && aVar != null) {
            if (i10 == 3) {
                b.a aVar2 = new b.a(bundle);
                if (!aVar2.checkArgs()) {
                    return false;
                }
                aVar.a(aVar2);
                return true;
            }
            if (i10 == 4) {
                b.C1201b c1201b = new b.C1201b(bundle);
                if (c1201b.checkArgs()) {
                    aVar.c(c1201b);
                    return true;
                }
            }
        }
        return false;
    }
}
