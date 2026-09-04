package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DeprecationInfo.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements Comparable<a> {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@d a other) {
        f0.p(other, "other");
        int iCompareTo = b().compareTo(other.b());
        if (iCompareTo == 0 && !c() && other.c()) {
            return 1;
        }
        return iCompareTo;
    }

    @d
    public abstract DeprecationLevelValue b();

    public abstract boolean c();
}
