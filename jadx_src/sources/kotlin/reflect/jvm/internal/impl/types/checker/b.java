package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.a1;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.g0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.m0;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.y;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* JADX INFO: compiled from: ClassicTypeSystemContext.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface b extends h1, si.r {

    /* JADX INFO: compiled from: ClassicTypeSystemContext.kt */
    public static final class a {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ClassicTypeSystemContext.kt */
        public static final class C1182a extends TypeCheckerState.b.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f128069a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TypeSubstitutor f128070b;

            C1182a(b bVar, TypeSubstitutor typeSubstitutor) {
                this.f128069a = bVar;
                this.f128070b = typeSubstitutor;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b
            @dl.d
            public si.i a(@dl.d TypeCheckerState state, @dl.d si.g type) {
                f0.p(state, "state");
                f0.p(type, "type");
                b bVar = this.f128069a;
                TypeSubstitutor typeSubstitutor = this.f128070b;
                Object objM = bVar.M(type);
                f0.n(objM, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                d0 d0VarN = typeSubstitutor.n((d0) objM, Variance.INVARIANT);
                f0.o(d0VarN, "substitutor.safeSubstitu…VARIANT\n                )");
                si.i iVarC = bVar.c(d0VarN);
                f0.m(iVarC);
                return iVarC;
            }
        }

        @dl.d
        public static TypeVariance A(@dl.d b bVar, @dl.d si.l receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof c1) {
                Variance varianceC = ((c1) receiver).c();
                f0.o(varianceC, "this.projectionKind");
                return si.q.a(varianceC);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.d
        public static TypeVariance B(@dl.d b bVar, @dl.d si.n receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof y0) {
                Variance varianceN = ((y0) receiver).n();
                f0.o(varianceN, "this.variance");
                return si.q.a(varianceN);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        public static boolean C(@dl.d b bVar, @dl.d si.g receiver, @dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
            f0.p(receiver, "$receiver");
            f0.p(fqName, "fqName");
            if (receiver instanceof d0) {
                return ((d0) receiver).getAnnotations().J1(fqName);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        public static boolean D(@dl.d b bVar, @dl.d si.n receiver, @dl.e si.m mVar) {
            f0.p(receiver, "$receiver");
            if (!(receiver instanceof y0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
            }
            if (mVar == null ? true : mVar instanceof z0) {
                return TypeUtilsKt.m((y0) receiver, (z0) mVar, null, 4, null);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        public static boolean E(@dl.d b bVar, @dl.d si.i a10, @dl.d si.i b10) {
            f0.p(a10, "a");
            f0.p(b10, "b");
            if (!(a10 instanceof j0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + a10 + ", " + n0.d(a10.getClass())).toString());
            }
            if (b10 instanceof j0) {
                return ((j0) a10).M0() == ((j0) b10).M0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + b10 + ", " + n0.d(b10.getClass())).toString());
        }

        @dl.d
        public static si.g F(@dl.d b bVar, @dl.d List<? extends si.g> types) {
            f0.p(types, "types");
            return d.a(types);
        }

        public static boolean G(@dl.d b bVar, @dl.d si.m receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof z0) {
                return kotlin.reflect.jvm.internal.impl.builtins.g.v0((z0) receiver, kotlin.reflect.jvm.internal.impl.builtins.h.a.f125420b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        public static boolean H(@dl.d b bVar, @dl.d si.m receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof z0) {
                return ((z0) receiver).d() instanceof kotlin.reflect.jvm.internal.impl.descriptors.d;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        public static boolean I(@dl.d b bVar, @dl.d si.m receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof z0) {
                kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = ((z0) receiver).d();
                kotlin.reflect.jvm.internal.impl.descriptors.d dVar = fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD : null;
                return (dVar == null || !b0.a(dVar) || dVar.b() == ClassKind.ENUM_ENTRY || dVar.b() == ClassKind.ANNOTATION_CLASS) ? false : true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        public static boolean J(@dl.d b bVar, @dl.d si.m receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof z0) {
                return ((z0) receiver).e();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        public static boolean K(@dl.d b bVar, @dl.d si.g receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof d0) {
                return e0.a((d0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        public static boolean L(@dl.d b bVar, @dl.d si.m receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof z0) {
                kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = ((z0) receiver).d();
                kotlin.reflect.jvm.internal.impl.descriptors.d dVar = fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD : null;
                return (dVar != null ? dVar.m0() : null) instanceof x;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        public static boolean M(@dl.d b bVar, @dl.d si.m receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof z0) {
                return receiver instanceof IntegerLiteralTypeConstructor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        public static boolean N(@dl.d b bVar, @dl.d si.m receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof z0) {
                return receiver instanceof IntersectionTypeConstructor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        public static boolean O(@dl.d b bVar, @dl.d si.i receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof j0) {
                return ((j0) receiver).P0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        public static boolean P(@dl.d b bVar, @dl.d si.g receiver) {
            f0.p(receiver, "$receiver");
            return receiver instanceof g0;
        }

        public static boolean Q(@dl.d b bVar, @dl.d si.m receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof z0) {
                return kotlin.reflect.jvm.internal.impl.builtins.g.v0((z0) receiver, kotlin.reflect.jvm.internal.impl.builtins.h.a.f125422c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        public static boolean R(@dl.d b bVar, @dl.d si.g receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof d0) {
                return i1.l((d0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        public static boolean S(@dl.d b bVar, @dl.d si.b receiver) {
            f0.p(receiver, "$receiver");
            return receiver instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean T(@dl.d b bVar, @dl.d si.i receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof d0) {
                return kotlin.reflect.jvm.internal.impl.builtins.g.r0((d0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        public static boolean U(@dl.d b bVar, @dl.d si.b receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof h) {
                return ((h) receiver).a1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean V(@dl.d b bVar, @dl.d si.i receiver) {
            f0.p(receiver, "$receiver");
            if (!(receiver instanceof j0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
            }
            if (!e0.a((d0) receiver)) {
                j0 j0Var = (j0) receiver;
                if (!(j0Var.O0().d() instanceof x0) && (j0Var.O0().d() != null || (receiver instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a) || (receiver instanceof h) || (receiver instanceof kotlin.reflect.jvm.internal.impl.types.n) || (j0Var.O0() instanceof IntegerLiteralTypeConstructor) || W(bVar, receiver))) {
                    return true;
                }
            }
            return false;
        }

        private static boolean W(b bVar, si.i iVar) {
            return (iVar instanceof m0) && bVar.b(((m0) iVar).Z());
        }

        public static boolean X(@dl.d b bVar, @dl.d si.l receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof c1) {
                return ((c1) receiver).b();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Y(@dl.d b bVar, @dl.d si.i receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof j0) {
                return TypeUtilsKt.n((d0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Z(@dl.d b bVar, @dl.d si.i receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof j0) {
                return TypeUtilsKt.o((d0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        public static boolean a(@dl.d b bVar, @dl.d si.m c10, @dl.d si.m c11) {
            f0.p(c10, "c1");
            f0.p(c11, "c2");
            if (!(c10 instanceof z0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c10 + ", " + n0.d(c10.getClass())).toString());
            }
            if (c11 instanceof z0) {
                return f0.g(c10, c11);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c11 + ", " + n0.d(c11.getClass())).toString());
        }

        public static boolean a0(@dl.d b bVar, @dl.d si.g receiver) {
            f0.p(receiver, "$receiver");
            return (receiver instanceof l1) && (((l1) receiver).O0() instanceof l);
        }

        public static int b(@dl.d b bVar, @dl.d si.g receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof d0) {
                return ((d0) receiver).M0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        public static boolean b0(@dl.d b bVar, @dl.d si.m receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof z0) {
                kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = ((z0) receiver).d();
                return fVarD != null && kotlin.reflect.jvm.internal.impl.builtins.g.A0(fVarD);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.d
        public static si.k c(@dl.d b bVar, @dl.d si.i receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof j0) {
                return (si.k) receiver;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.d
        public static si.i c0(@dl.d b bVar, @dl.d si.e receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof y) {
                return ((y) receiver).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.e
        public static si.b d(@dl.d b bVar, @dl.d si.i receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof j0) {
                if (receiver instanceof m0) {
                    return bVar.e(((m0) receiver).Z());
                }
                if (receiver instanceof h) {
                    return (h) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.e
        public static si.g d0(@dl.d b bVar, @dl.d si.b receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof h) {
                return ((h) receiver).Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.e
        public static si.c e(@dl.d b bVar, @dl.d si.i receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof j0) {
                if (receiver instanceof kotlin.reflect.jvm.internal.impl.types.n) {
                    return (kotlin.reflect.jvm.internal.impl.types.n) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.d
        public static si.g e0(@dl.d b bVar, @dl.d si.g receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof l1) {
                return c.b((l1) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.e
        public static si.d f(@dl.d b bVar, @dl.d si.e receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof y) {
                if (receiver instanceof kotlin.reflect.jvm.internal.impl.types.t) {
                    return (kotlin.reflect.jvm.internal.impl.types.t) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.d
        public static TypeCheckerState f0(@dl.d b bVar, boolean z10, boolean z11) {
            return kotlin.reflect.jvm.internal.impl.types.checker.a.b(z10, z11, bVar, null, null, 24, null);
        }

        @dl.e
        public static si.e g(@dl.d b bVar, @dl.d si.g receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof d0) {
                l1 l1VarR0 = ((d0) receiver).R0();
                if (l1VarR0 instanceof y) {
                    return (y) l1VarR0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.d
        public static si.i g0(@dl.d b bVar, @dl.d si.c receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof kotlin.reflect.jvm.internal.impl.types.n) {
                return ((kotlin.reflect.jvm.internal.impl.types.n) receiver).a1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.e
        public static si.h h(@dl.d b bVar, @dl.d si.e receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof y) {
                if (receiver instanceof i0) {
                    return (i0) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        public static int h0(@dl.d b bVar, @dl.d si.m receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof z0) {
                return ((z0) receiver).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.e
        public static si.i i(@dl.d b bVar, @dl.d si.g receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof d0) {
                l1 l1VarR0 = ((d0) receiver).R0();
                if (l1VarR0 instanceof j0) {
                    return (j0) l1VarR0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.d
        public static Collection<si.g> i0(@dl.d b bVar, @dl.d si.i receiver) {
            f0.p(receiver, "$receiver");
            si.m mVarG = bVar.g(receiver);
            if (mVarG instanceof IntegerLiteralTypeConstructor) {
                return ((IntegerLiteralTypeConstructor) mVarG).j();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.d
        public static si.l j(@dl.d b bVar, @dl.d si.g receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof d0) {
                return TypeUtilsKt.a((d0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.d
        public static si.l j0(@dl.d b bVar, @dl.d si.a receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof NewCapturedTypeConstructor) {
                return ((NewCapturedTypeConstructor) receiver).c();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.e
        public static si.i k(@dl.d b bVar, @dl.d si.i type, @dl.d CaptureStatus status) {
            f0.p(type, "type");
            f0.p(status, "status");
            if (type instanceof j0) {
                return i.b((j0) type, status);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + n0.d(type.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @dl.d
        public static TypeCheckerState.b k0(@dl.d b bVar, @dl.d si.i type) {
            f0.p(type, "type");
            if (type instanceof j0) {
                return new C1182a(bVar, a1.f128047c.a((d0) type).c());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + n0.d(type.getClass())).toString());
        }

        @dl.d
        public static CaptureStatus l(@dl.d b bVar, @dl.d si.b receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof h) {
                return ((h) receiver).X0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.d
        public static Collection<si.g> l0(@dl.d b bVar, @dl.d si.m receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof z0) {
                Collection<d0> collectionL = ((z0) receiver).l();
                f0.o(collectionL, "this.supertypes");
                return collectionL;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.d
        public static si.g m(@dl.d b bVar, @dl.d si.i lowerBound, @dl.d si.i upperBound) {
            f0.p(lowerBound, "lowerBound");
            f0.p(upperBound, "upperBound");
            if (!(lowerBound instanceof j0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + n0.d(bVar.getClass())).toString());
            }
            if (upperBound instanceof j0) {
                return KotlinTypeFactory.d((j0) lowerBound, (j0) upperBound);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + n0.d(bVar.getClass())).toString());
        }

        @dl.d
        public static si.a m0(@dl.d b bVar, @dl.d si.b receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof h) {
                return ((h) receiver).O0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.d
        public static si.l n(@dl.d b bVar, @dl.d si.g receiver, int i10) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof d0) {
                return ((d0) receiver).M0().get(i10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.d
        public static si.m n0(@dl.d b bVar, @dl.d si.i receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof j0) {
                return ((j0) receiver).O0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.d
        public static List<si.l> o(@dl.d b bVar, @dl.d si.g receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof d0) {
                return ((d0) receiver).M0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.d
        public static si.i o0(@dl.d b bVar, @dl.d si.e receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof y) {
                return ((y) receiver).X0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.d
        public static kotlin.reflect.jvm.internal.impl.name.d p(@dl.d b bVar, @dl.d si.m receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof z0) {
                kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = ((z0) receiver).d();
                f0.n(fVarD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return DescriptorUtilsKt.m((kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.d
        public static si.g p0(@dl.d b bVar, @dl.d si.g receiver, boolean z10) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof si.i) {
                return bVar.a((si.i) receiver, z10);
            }
            if (!(receiver instanceof si.e)) {
                throw new IllegalStateException("sealed".toString());
            }
            si.e eVar = (si.e) receiver;
            return bVar.p0(bVar.a(bVar.d(eVar), z10), bVar.a(bVar.f(eVar), z10));
        }

        @dl.d
        public static si.n q(@dl.d b bVar, @dl.d si.m receiver, int i10) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof z0) {
                y0 y0Var = ((z0) receiver).getParameters().get(i10);
                f0.o(y0Var, "this.parameters[index]");
                return y0Var;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.d
        public static si.i q0(@dl.d b bVar, @dl.d si.i receiver, boolean z10) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof j0) {
                return ((j0) receiver).V0(z10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.d
        public static List<si.n> r(@dl.d b bVar, @dl.d si.m receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof z0) {
                List<y0> parameters = ((z0) receiver).getParameters();
                f0.o(parameters, "this.parameters");
                return parameters;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.e
        public static PrimitiveType s(@dl.d b bVar, @dl.d si.m receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof z0) {
                kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = ((z0) receiver).d();
                f0.n(fVarD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return kotlin.reflect.jvm.internal.impl.builtins.g.P((kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.e
        public static PrimitiveType t(@dl.d b bVar, @dl.d si.m receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof z0) {
                kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = ((z0) receiver).d();
                f0.n(fVarD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return kotlin.reflect.jvm.internal.impl.builtins.g.S((kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.d
        public static si.g u(@dl.d b bVar, @dl.d si.n receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof y0) {
                return TypeUtilsKt.j((y0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.d
        public static si.g v(@dl.d b bVar, @dl.d si.l receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof c1) {
                return ((c1) receiver).getType().R0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.e
        public static si.n w(@dl.d b bVar, @dl.d si.t receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof l) {
                return ((l) receiver).b();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.e
        public static si.n x(@dl.d b bVar, @dl.d si.m receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof z0) {
                kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = ((z0) receiver).d();
                if (fVarD instanceof y0) {
                    return (y0) fVarD;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.e
        public static si.g y(@dl.d b bVar, @dl.d si.g receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof d0) {
                return kotlin.reflect.jvm.internal.impl.resolve.e.e((d0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }

        @dl.d
        public static List<si.g> z(@dl.d b bVar, @dl.d si.n receiver) {
            f0.p(receiver, "$receiver");
            if (receiver instanceof y0) {
                List<d0> upperBounds = ((y0) receiver).getUpperBounds();
                f0.o(upperBounds, "this.upperBounds");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + n0.d(receiver.getClass())).toString());
        }
    }

    @Override // si.p
    @dl.d
    si.i a(@dl.d si.i iVar, boolean z10);

    @Override // si.p
    boolean b(@dl.d si.i iVar);

    @Override // si.p
    @dl.e
    si.i c(@dl.d si.g gVar);

    @Override // si.p
    @dl.d
    si.i d(@dl.d si.e eVar);

    @Override // si.p
    @dl.e
    si.b e(@dl.d si.i iVar);

    @Override // si.p
    @dl.d
    si.i f(@dl.d si.e eVar);

    @Override // si.p
    @dl.d
    si.m g(@dl.d si.i iVar);

    @dl.d
    si.g p0(@dl.d si.i iVar, @dl.d si.i iVar2);
}
