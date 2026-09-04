package kotlin.reflect.jvm.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b0;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.z;

/* JADX INFO: compiled from: KTypeImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class KTypeImpl$arguments$2 extends Lambda implements yh.a<List<? extends kotlin.reflect.t>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ KTypeImpl f125252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ yh.a<Type> f125253c;

    /* JADX INFO: compiled from: KTypeImpl.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125257a;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f125257a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    KTypeImpl$arguments$2(KTypeImpl kTypeImpl, yh.a<? extends Type> aVar) {
        super(0);
        this.f125252b = kTypeImpl;
        this.f125253c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Type> b(z<? extends List<? extends Type>> zVar) {
        return (List) zVar.getValue();
    }

    @Override // yh.a
    public final List<? extends kotlin.reflect.t> invoke() {
        kotlin.reflect.t tVarE;
        List<c1> listM0 = this.f125252b.j().M0();
        if (listM0.isEmpty()) {
            return CollectionsKt__CollectionsKt.E();
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        final KTypeImpl kTypeImpl = this.f125252b;
        final z zVarB = b0.b(lazyThreadSafetyMode, new yh.a<List<? extends Type>>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$arguments$2$parameterizedTypeArguments$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            public final List<? extends Type> invoke() {
                Type typeE = kTypeImpl.e();
                f0.m(typeE);
                return ReflectClassUtilKt.d(typeE);
            }
        });
        yh.a<Type> aVar = this.f125253c;
        final KTypeImpl kTypeImpl2 = this.f125252b;
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listM0, 10));
        final int i10 = 0;
        for (Object obj : listM0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            c1 c1Var = (c1) obj;
            if (c1Var.b()) {
                tVarE = kotlin.reflect.t.f128326c.c();
            } else {
                d0 type = c1Var.getType();
                f0.o(type, "typeProjection.type");
                KTypeImpl kTypeImpl3 = new KTypeImpl(type, aVar == null ? null : new yh.a<Type>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$arguments$2$1$type$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // yh.a
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Type invoke() {
                        Type typeE = kTypeImpl2.e();
                        if (typeE instanceof Class) {
                            Class cls = (Class) typeE;
                            Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                            f0.o(componentType, "{\n                      …                        }");
                            return componentType;
                        }
                        if (typeE instanceof GenericArrayType) {
                            if (i10 == 0) {
                                Type genericComponentType = ((GenericArrayType) typeE).getGenericComponentType();
                                f0.o(genericComponentType, "{\n                      …                        }");
                                return genericComponentType;
                            }
                            throw new KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + kTypeImpl2);
                        }
                        if (!(typeE instanceof ParameterizedType)) {
                            throw new KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + kTypeImpl2);
                        }
                        Type type2 = (Type) KTypeImpl$arguments$2.b(zVarB).get(i10);
                        if (type2 instanceof WildcardType) {
                            WildcardType wildcardType = (WildcardType) type2;
                            Type[] lowerBounds = wildcardType.getLowerBounds();
                            f0.o(lowerBounds, "argument.lowerBounds");
                            Type type3 = (Type) ArraysKt___ArraysKt.Oc(lowerBounds);
                            if (type3 == null) {
                                Type[] upperBounds = wildcardType.getUpperBounds();
                                f0.o(upperBounds, "argument.upperBounds");
                                type2 = (Type) ArraysKt___ArraysKt.sc(upperBounds);
                            } else {
                                type2 = type3;
                            }
                        }
                        f0.o(type2, "{\n                      …                        }");
                        return type2;
                    }
                });
                int i12 = a.f125257a[c1Var.c().ordinal()];
                if (i12 == 1) {
                    tVarE = kotlin.reflect.t.f128326c.e(kTypeImpl3);
                } else if (i12 == 2) {
                    tVarE = kotlin.reflect.t.f128326c.a(kTypeImpl3);
                } else {
                    if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tVarE = kotlin.reflect.t.f128326c.b(kTypeImpl3);
                }
            }
            arrayList.add(tVarE);
            i10 = i11;
        }
        return arrayList;
    }
}
