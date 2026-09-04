package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ReflectJavaField.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class p extends r implements mi.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Field f125927a;

    public p(@dl.d Field member) {
        f0.p(member, "member");
        this.f125927a = member;
    }

    @Override // mi.n
    public boolean F() {
        return false;
    }

    @Override // mi.n
    public boolean N() {
        return Q().isEnumConstant();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.r
    @dl.d
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public Field Q() {
        return this.f125927a;
    }

    @Override // mi.n
    @dl.d
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public x getType() {
        x.a aVar = x.f125935a;
        Type genericType = Q().getGenericType();
        f0.o(genericType, "member.genericType");
        return aVar.a(genericType);
    }
}
