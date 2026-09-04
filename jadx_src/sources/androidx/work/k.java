package androidx.work;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.List;

/* JADX INFO: compiled from: InputMerger.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f29429a = n.i("InputMerger");

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @p0
    public static k a(@n0 String str) {
        try {
            return (k) Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e10) {
            n.e().d(f29429a, "Trouble instantiating + " + str, e10);
            return null;
        }
    }

    @n0
    public abstract e b(@n0 List<e> list);
}
