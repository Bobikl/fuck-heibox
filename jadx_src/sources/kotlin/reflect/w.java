package kotlin.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.q
public final class w implements TypeVariable<GenericDeclaration>, u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final s f128331b;

    public w(@dl.d s typeParameter) {
        f0.p(typeParameter, "typeParameter");
        this.f128331b = typeParameter;
    }

    public boolean equals(@dl.e Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (f0.g(getName(), typeVariable.getName()) && f0.g(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }

    @dl.e
    public final <T extends Annotation> T g0(@dl.d Class<T> annotationClass) {
        f0.p(annotationClass, "annotationClass");
        return null;
    }

    @Override // java.lang.reflect.TypeVariable
    @dl.d
    public Type[] getBounds() {
        List<r> upperBounds = this.f128331b.getUpperBounds();
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(TypesJVMKt.c((r) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    @dl.d
    public GenericDeclaration getGenericDeclaration() {
        throw new NotImplementedError("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f128331b));
    }

    @Override // java.lang.reflect.TypeVariable
    @dl.d
    public String getName() {
        return this.f128331b.getName();
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.u
    @dl.d
    public String getTypeName() {
        return getName();
    }

    @dl.d
    public final Annotation[] h0() {
        return new Annotation[0];
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    @dl.d
    public final Annotation[] i0() {
        return new Annotation[0];
    }

    @dl.d
    public String toString() {
        return getTypeName();
    }
}
