package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.reflect.jvm.internal.impl.descriptors.j;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import mi.l;
import mi.n;
import mi.q;
import org.apache.tools.ant.taskdefs.optional.ejb.g;

/* JADX INFO: compiled from: JavaResolverCache.java */
/* JADX INFO: loaded from: classes5.dex */
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f126044a = new a();

    /* JADX INFO: compiled from: JavaResolverCache.java */
    public static final class a implements d {
        a() {
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = g.d.f134964e;
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i10) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.d
        public void a(@dl.d n nVar, @dl.d o0 o0Var) {
            if (nVar == null) {
                f(5);
            }
            if (o0Var == null) {
                f(6);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.d
        public void b(@dl.d mi.g gVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
            if (gVar == null) {
                f(7);
            }
            if (dVar == null) {
                f(8);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.d
        public void c(@dl.d q qVar, @dl.d s0 s0Var) {
            if (qVar == null) {
                f(1);
            }
            if (s0Var == null) {
                f(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.d
        @dl.e
        public kotlin.reflect.jvm.internal.impl.descriptors.d d(@dl.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
            if (cVar != null) {
                return null;
            }
            f(0);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.d
        public void e(@dl.d l lVar, @dl.d j jVar) {
            if (lVar == null) {
                f(3);
            }
            if (jVar == null) {
                f(4);
            }
        }
    }

    void a(@dl.d n nVar, @dl.d o0 o0Var);

    void b(@dl.d mi.g gVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar);

    void c(@dl.d q qVar, @dl.d s0 s0Var);

    @dl.e
    kotlin.reflect.jvm.internal.impl.descriptors.d d(@dl.d kotlin.reflect.jvm.internal.impl.name.c cVar);

    void e(@dl.d l lVar, @dl.d j jVar);
}
