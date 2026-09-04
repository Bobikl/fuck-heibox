package z8;

import androidx.annotation.n0;
import com.google.android.gms.common.api.Scope;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public final class z {
    private z() {
    }

    @n0
    @v8.a
    public static String[] a(@n0 Set<Scope> set) {
        com.google.android.gms.common.internal.p.m(set, "scopes can't be null.");
        Scope[] scopeArr = (Scope[]) set.toArray(new Scope[set.size()]);
        com.google.android.gms.common.internal.p.m(scopeArr, "scopes can't be null.");
        String[] strArr = new String[scopeArr.length];
        for (int i10 = 0; i10 < scopeArr.length; i10++) {
            strArr[i10] = scopeArr[i10].b();
        }
        return strArr;
    }
}
