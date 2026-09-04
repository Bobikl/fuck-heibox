package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ClassLiteralValue.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.b f127531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f127532b;

    public f(@dl.d kotlin.reflect.jvm.internal.impl.name.b classId, int i10) {
        f0.p(classId, "classId");
        this.f127531a = classId;
        this.f127532b = i10;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.name.b a() {
        return this.f127531a;
    }

    public final int b() {
        return this.f127532b;
    }

    public final int c() {
        return this.f127532b;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.name.b d() {
        return this.f127531a;
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return f0.g(this.f127531a, fVar.f127531a) && this.f127532b == fVar.f127532b;
    }

    public int hashCode() {
        return (this.f127531a.hashCode() * 31) + this.f127532b;
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f127532b;
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(this.f127531a);
        int i12 = this.f127532b;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(">");
        }
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
