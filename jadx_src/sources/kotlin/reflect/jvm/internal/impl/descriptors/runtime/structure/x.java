package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ReflectJavaType.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class x implements mi.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f125935a = new a(null);

    /* JADX INFO: compiled from: ReflectJavaType.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final x a(@dl.d Type type) {
            x jVar;
            f0.p(type, "type");
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new v(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z10 && ((Class) type).isArray())) {
                jVar = new j(type);
            } else {
                jVar = type instanceof WildcardType ? new a0((WildcardType) type) : new l(type);
            }
            return jVar;
        }
    }

    @dl.d
    protected abstract Type P();

    public boolean equals(@dl.e Object obj) {
        return (obj instanceof x) && f0.g(P(), ((x) obj).P());
    }

    public int hashCode() {
        return P().hashCode();
    }

    @Override // mi.d
    @dl.e
    public mi.a k(kotlin.reflect.jvm.internal.impl.name.c fqName) {
        Object obj;
        Object next;
        kotlin.reflect.jvm.internal.impl.name.b bVarF;
        f0.p(fqName, "fqName");
        Iterator<T> it = getAnnotations().iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
                bVarF = ((mi.a) next).f();
            }
            return (mi.a) obj;
        } while (!f0.g(bVarF != null ? bVarF.b() : null, fqName));
        obj = next;
        return (mi.a) obj;
    }

    @dl.d
    public String toString() {
        return getClass().getName() + ": " + P();
    }
}
