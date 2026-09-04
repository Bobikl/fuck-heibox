package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: IncompatibleVersionErrorData.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class o<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f127889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f127890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final String f127891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.b f127892d;

    public o(T t10, T t11, @dl.d String filePath, @dl.d kotlin.reflect.jvm.internal.impl.name.b classId) {
        f0.p(filePath, "filePath");
        f0.p(classId, "classId");
        this.f127889a = t10;
        this.f127890b = t11;
        this.f127891c = filePath;
        this.f127892d = classId;
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return f0.g(this.f127889a, oVar.f127889a) && f0.g(this.f127890b, oVar.f127890b) && f0.g(this.f127891c, oVar.f127891c) && f0.g(this.f127892d, oVar.f127892d);
    }

    public int hashCode() {
        T t10 = this.f127889a;
        int iHashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        T t11 = this.f127890b;
        return ((((iHashCode + (t11 != null ? t11.hashCode() : 0)) * 31) + this.f127891c.hashCode()) * 31) + this.f127892d.hashCode();
    }

    @dl.d
    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f127889a + ", expectedVersion=" + this.f127890b + ", filePath=" + this.f127891c + ", classId=" + this.f127892d + ')';
    }
}
