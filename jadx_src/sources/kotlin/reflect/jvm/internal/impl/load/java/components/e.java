package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.d0;
import mi.r;
import org.apache.tools.ant.taskdefs.optional.ejb.g;

/* JADX INFO: compiled from: SignaturePropagator.java */
/* JADX INFO: loaded from: classes5.dex */
public interface e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f126045a = new a();

    /* JADX INFO: compiled from: SignaturePropagator.java */
    public static final class a implements e {
        a() {
        }

        private static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = g.d.f134964e;
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i10 == 5 || i10 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.e
        public void a(@dl.d CallableMemberDescriptor callableMemberDescriptor, @dl.d List<String> list) {
            if (callableMemberDescriptor == null) {
                c(5);
            }
            if (list == null) {
                c(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.e
        @dl.d
        public b b(@dl.d r rVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d d0 d0Var, @dl.e d0 d0Var2, @dl.d List<b1> list, @dl.d List<y0> list2) {
            if (rVar == null) {
                c(0);
            }
            if (dVar == null) {
                c(1);
            }
            if (d0Var == null) {
                c(2);
            }
            if (list == null) {
                c(3);
            }
            if (list2 == null) {
                c(4);
            }
            return new b(d0Var, d0Var2, list, list2, Collections.emptyList(), false);
        }
    }

    /* JADX INFO: compiled from: SignaturePropagator.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d0 f126046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d0 f126047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<b1> f126048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<y0> f126049d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List<String> f126050e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f126051f;

        public b(@dl.d d0 d0Var, @dl.e d0 d0Var2, @dl.d List<b1> list, @dl.d List<y0> list2, @dl.d List<String> list3, boolean z10) {
            if (d0Var == null) {
                a(0);
            }
            if (list == null) {
                a(1);
            }
            if (list2 == null) {
                a(2);
            }
            if (list3 == null) {
                a(3);
            }
            this.f126046a = d0Var;
            this.f126047b = d0Var2;
            this.f126048c = list;
            this.f126049d = list2;
            this.f126050e = list3;
            this.f126051f = z10;
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
            switch (i10) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i10 == 4) {
                objArr[1] = "getReturnType";
            } else if (i10 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i10 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i10 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @dl.d
        public List<String> b() {
            List<String> list = this.f126050e;
            if (list == null) {
                a(7);
            }
            return list;
        }

        @dl.e
        public d0 c() {
            return this.f126047b;
        }

        @dl.d
        public d0 d() {
            d0 d0Var = this.f126046a;
            if (d0Var == null) {
                a(4);
            }
            return d0Var;
        }

        @dl.d
        public List<y0> e() {
            List<y0> list = this.f126049d;
            if (list == null) {
                a(6);
            }
            return list;
        }

        @dl.d
        public List<b1> f() {
            List<b1> list = this.f126048c;
            if (list == null) {
                a(5);
            }
            return list;
        }

        public boolean g() {
            return this.f126051f;
        }
    }

    void a(@dl.d CallableMemberDescriptor callableMemberDescriptor, @dl.d List<String> list);

    @dl.d
    b b(@dl.d r rVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d d0 d0Var, @dl.e d0 d0Var2, @dl.d List<b1> list, @dl.d List<y0> list2);
}
