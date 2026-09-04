package androidx.work;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: InputMergerFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class l {

    /* JADX INFO: compiled from: InputMergerFactory.java */
    public class a extends l {
        a() {
        }

        @Override // androidx.work.l
        @p0
        public k a(@n0 String str) {
            return null;
        }
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static l c() {
        return new a();
    }

    @p0
    public abstract k a(@n0 String str);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @p0
    public final k b(@n0 String str) {
        k kVarA = a(str);
        return kVarA == null ? k.a(str) : kVarA;
    }
}
