package kotlin.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.q
public final class a implements GenericArrayType, u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Type f125050b;

    public a(@dl.d Type elementType) {
        f0.p(elementType, "elementType");
        this.f125050b = elementType;
    }

    public boolean equals(@dl.e Object obj) {
        return (obj instanceof GenericArrayType) && f0.g(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    @dl.d
    public Type getGenericComponentType() {
        return this.f125050b;
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.u
    @dl.d
    public String getTypeName() {
        return TypesJVMKt.j(this.f125050b) + okhttp3.t.f132643o;
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    @dl.d
    public String toString() {
        return getTypeName();
    }
}
