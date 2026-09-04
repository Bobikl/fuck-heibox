package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ReflectJavaRecordComponent.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class w extends r implements mi.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Object f125934a;

    public w(@dl.d Object recordComponent) {
        f0.p(recordComponent, "recordComponent");
        this.f125934a = recordComponent;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.r
    @dl.d
    public Member Q() throws IllegalAccessException, InvocationTargetException {
        Method methodC = a.f125896a.c(this.f125934a);
        if (methodC != null) {
            return methodC;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // mi.w
    public boolean c() {
        return false;
    }

    @Override // mi.w
    @dl.d
    public mi.x getType() throws IllegalAccessException, InvocationTargetException {
        Class<?> clsD = a.f125896a.d(this.f125934a);
        if (clsD != null) {
            return new l(clsD);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
