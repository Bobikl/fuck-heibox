package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: AnnotationDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f125598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f125599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0 f125600c;

    public d(@dl.d d0 d0Var, @dl.d Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> map, @dl.d t0 t0Var) {
        if (d0Var == null) {
            b(0);
        }
        if (map == null) {
            b(1);
        }
        if (t0Var == null) {
            b(2);
        }
        this.f125598a = d0Var;
        this.f125599b = map;
        this.f125600c = t0Var;
    }

    private static /* synthetic */ void b(int i10) {
        String str = (i10 == 3 || i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "valueArguments";
        } else if (i10 == 2) {
            objArr[0] = "source";
        } else if (i10 == 3 || i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i10 == 3) {
            objArr[1] = "getType";
        } else if (i10 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.d
    public Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
        Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> map = this.f125599b;
        if (map == null) {
            b(4);
        }
        return map;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.e
    public kotlin.reflect.jvm.internal.impl.name.c e() {
        return c.a.a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.d
    public d0 getType() {
        d0 d0Var = this.f125598a;
        if (d0Var == null) {
            b(3);
        }
        return d0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.d
    public t0 j() {
        t0 t0Var = this.f125600c;
        if (t0Var == null) {
            b(5);
        }
        return t0Var;
    }

    public String toString() {
        return DescriptorRenderer.f127417g.t(this, null);
    }
}
