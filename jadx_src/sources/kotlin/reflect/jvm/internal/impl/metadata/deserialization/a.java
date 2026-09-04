package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: BinaryVersion.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final C1166a f127028f = new C1166a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final int[] f127029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f127030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f127031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f127032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final List<Integer> f127033e;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.deserialization.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BinaryVersion.kt */
    public static final class C1166a {
        private C1166a() {
        }

        public /* synthetic */ C1166a(u uVar) {
            this();
        }
    }

    public a(@dl.d int... numbers) {
        List<Integer> listE;
        f0.p(numbers, "numbers");
        this.f127029a = numbers;
        Integer numOf = ArraysKt___ArraysKt.of(numbers, 0);
        this.f127030b = numOf != null ? numOf.intValue() : -1;
        Integer numOf2 = ArraysKt___ArraysKt.of(numbers, 1);
        this.f127031c = numOf2 != null ? numOf2.intValue() : -1;
        Integer numOf3 = ArraysKt___ArraysKt.of(numbers, 2);
        this.f127032d = numOf3 != null ? numOf3.intValue() : -1;
        if (numbers.length <= 3) {
            listE = CollectionsKt__CollectionsKt.E();
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + numbers.length + lg.a.f131414g);
            }
            listE = CollectionsKt___CollectionsKt.Q5(m.r(numbers).subList(3, numbers.length));
        }
        this.f127033e = listE;
    }

    public final int a() {
        return this.f127030b;
    }

    public final int b() {
        return this.f127031c;
    }

    public final boolean c(int i10, int i11, int i12) {
        int i13 = this.f127030b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f127031c;
        if (i14 > i11) {
            return true;
        }
        return i14 >= i11 && this.f127032d >= i12;
    }

    public final boolean d(@dl.d a version) {
        f0.p(version, "version");
        return c(version.f127030b, version.f127031c, version.f127032d);
    }

    public final boolean e(int i10, int i11, int i12) {
        int i13 = this.f127030b;
        if (i13 < i10) {
            return true;
        }
        if (i13 > i10) {
            return false;
        }
        int i14 = this.f127031c;
        if (i14 < i11) {
            return true;
        }
        return i14 <= i11 && this.f127032d <= i12;
    }

    public boolean equals(@dl.e Object obj) {
        if (obj != null && f0.g(getClass(), obj.getClass())) {
            a aVar = (a) obj;
            if (this.f127030b == aVar.f127030b && this.f127031c == aVar.f127031c && this.f127032d == aVar.f127032d && f0.g(this.f127033e, aVar.f127033e)) {
                return true;
            }
        }
        return false;
    }

    protected final boolean f(@dl.d a ourVersion) {
        f0.p(ourVersion, "ourVersion");
        int i10 = this.f127030b;
        if (i10 == 0) {
            if (ourVersion.f127030b == 0 && this.f127031c == ourVersion.f127031c) {
                return true;
            }
        } else if (i10 == ourVersion.f127030b && this.f127031c <= ourVersion.f127031c) {
            return true;
        }
        return false;
    }

    @dl.d
    public final int[] g() {
        return this.f127029a;
    }

    public int hashCode() {
        int i10 = this.f127030b;
        int i11 = i10 + (i10 * 31) + this.f127031c;
        int i12 = i11 + (i11 * 31) + this.f127032d;
        return i12 + (i12 * 31) + this.f127033e.hashCode();
    }

    @dl.d
    public String toString() {
        int[] iArrG = g();
        ArrayList arrayList = new ArrayList();
        int length = iArrG.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArrG[i10];
            if (!(i11 != -1)) {
                break;
            }
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList.isEmpty() ? "unknown" : CollectionsKt___CollectionsKt.h3(arrayList, ".", null, null, 0, null, null, 62, null);
    }
}
