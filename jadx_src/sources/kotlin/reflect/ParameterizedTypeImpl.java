package kotlin.reflect;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.q
public final class ParameterizedTypeImpl implements ParameterizedType, u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Class<?> f125044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final Type f125045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final Type[] f125046d;

    public ParameterizedTypeImpl(@dl.d Class<?> rawType, @dl.e Type type, @dl.d List<? extends Type> typeArguments) {
        f0.p(rawType, "rawType");
        f0.p(typeArguments, "typeArguments");
        this.f125044b = rawType;
        this.f125045c = type;
        this.f125046d = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public boolean equals(@dl.e Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (f0.g(this.f125044b, parameterizedType.getRawType()) && f0.g(this.f125045c, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    @dl.d
    public Type[] getActualTypeArguments() {
        return this.f125046d;
    }

    @Override // java.lang.reflect.ParameterizedType
    @dl.e
    public Type getOwnerType() {
        return this.f125045c;
    }

    @Override // java.lang.reflect.ParameterizedType
    @dl.d
    public Type getRawType() {
        return this.f125044b;
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.u
    @dl.d
    public String getTypeName() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        Type type = this.f125045c;
        if (type != null) {
            sb2.append(TypesJVMKt.j(type));
            sb2.append("$");
            sb2.append(this.f125044b.getSimpleName());
        } else {
            sb2.append(TypesJVMKt.j(this.f125044b));
        }
        Type[] typeArr = this.f125046d;
        if (!(typeArr.length == 0)) {
            ArraysKt___ArraysKt.lh(typeArr, sb2, (50 & 2) != 0 ? ", " : null, (50 & 4) != 0 ? "" : "<", (50 & 8) == 0 ? ">" : "", (50 & 16) != 0 ? -1 : 0, (50 & 32) != 0 ? "..." : null, (50 & 64) != 0 ? null : ParameterizedTypeImpl$getTypeName$1$1.f125047d);
        }
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public int hashCode() {
        int iHashCode = this.f125044b.hashCode();
        Type type = this.f125045c;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    @dl.d
    public String toString() {
        return getTypeName();
    }
}
