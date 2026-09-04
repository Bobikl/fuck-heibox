package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.f0;
import mi.b0;

/* JADX INFO: compiled from: ReflectJavaValueParameter.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class z extends n implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final x f125937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Annotation[] f125938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final String f125939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f125940d;

    public z(@dl.d x type, @dl.d Annotation[] reflectAnnotations, @dl.e String str, boolean z10) {
        f0.p(type, "type");
        f0.p(reflectAnnotations, "reflectAnnotations");
        this.f125937a = type;
        this.f125938b = reflectAnnotations;
        this.f125939c = str;
        this.f125940d = z10;
    }

    @Override // mi.d
    public boolean A() {
        return false;
    }

    @Override // mi.b0
    @dl.d
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public x getType() {
        return this.f125937a;
    }

    @Override // mi.b0
    public boolean c() {
        return this.f125940d;
    }

    @Override // mi.d
    @dl.d
    public List<d> getAnnotations() {
        return h.b(this.f125938b);
    }

    @Override // mi.b0
    @dl.e
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        String str = this.f125939c;
        if (str != null) {
            return kotlin.reflect.jvm.internal.impl.name.f.e(str);
        }
        return null;
    }

    @Override // mi.d
    @dl.e
    public d k(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        f0.p(fqName, "fqName");
        return h.a(this.f125938b, fqName);
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z.class.getName());
        sb2.append(": ");
        sb2.append(c() ? "vararg " : "");
        sb2.append(getName());
        sb2.append(": ");
        sb2.append(getType());
        return sb2.toString();
    }
}
