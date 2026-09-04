package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.w;
import kotlin.jvm.internal.f0;
import kotlin.reflect.KParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: KCallableImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class KCallableImpl<R> implements kotlin.reflect.c<R>, l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final n.a<List<Annotation>> f125092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final n.a<ArrayList<KParameter>> f125093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final n.a<KTypeImpl> f125094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final n.a<List<KTypeParameterImpl>> f125095e;

    public KCallableImpl() {
        n.a<List<Annotation>> aVarD = n.d(new yh.a<List<? extends Annotation>>(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_annotations$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KCallableImpl<R> f125096b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f125096b = this;
            }

            @Override // yh.a
            public final List<? extends Annotation> invoke() {
                return s.e(this.f125096b.L());
            }
        });
        f0.o(aVarD, "lazySoft { descriptor.computeAnnotations() }");
        this.f125092b = aVarD;
        n.a<ArrayList<KParameter>> aVarD2 = n.d(new yh.a<ArrayList<KParameter>>(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KCallableImpl<R> f125097b;

            /* JADX INFO: compiled from: Comparisons.kt */
            public static final class a<T> implements Comparator {
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return kotlin.comparisons.g.l(((KParameter) t10).getName(), ((KParameter) t11).getName());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f125097b = this;
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ArrayList<KParameter> invoke() {
                int i10;
                final CallableMemberDescriptor callableMemberDescriptorL = this.f125097b.L();
                ArrayList<KParameter> arrayList = new ArrayList<>();
                final int i11 = 0;
                if (this.f125097b.J()) {
                    i10 = 0;
                } else {
                    final r0 r0VarI = s.i(callableMemberDescriptorL);
                    if (r0VarI != null) {
                        arrayList.add(new KParameterImpl(this.f125097b, 0, KParameter.Kind.INSTANCE, new yh.a<l0>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.1
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final l0 invoke() {
                                return r0VarI;
                            }
                        }));
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    final r0 r0VarL0 = callableMemberDescriptorL.l0();
                    if (r0VarL0 != null) {
                        arrayList.add(new KParameterImpl(this.f125097b, i10, KParameter.Kind.EXTENSION_RECEIVER, new yh.a<l0>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.2
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final l0 invoke() {
                                return r0VarL0;
                            }
                        }));
                        i10++;
                    }
                }
                int size = callableMemberDescriptorL.i().size();
                while (i11 < size) {
                    arrayList.add(new KParameterImpl(this.f125097b, i10, KParameter.Kind.VALUE, new yh.a<l0>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final l0 invoke() {
                            b1 b1Var = callableMemberDescriptorL.i().get(i11);
                            f0.o(b1Var, "descriptor.valueParameters[i]");
                            return b1Var;
                        }
                    }));
                    i11++;
                    i10++;
                }
                if (this.f125097b.I() && (callableMemberDescriptorL instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.a) && arrayList.size() > 1) {
                    w.m0(arrayList, new a());
                }
                arrayList.trimToSize();
                return arrayList;
            }
        });
        f0.o(aVarD2, "lazySoft {\n        val d…ze()\n        result\n    }");
        this.f125093c = aVarD2;
        n.a<KTypeImpl> aVarD3 = n.d(new yh.a<KTypeImpl>(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KCallableImpl<R> f125102b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f125102b = this;
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KTypeImpl invoke() {
                d0 returnType = this.f125102b.L().getReturnType();
                f0.m(returnType);
                final KCallableImpl<R> kCallableImpl = this.f125102b;
                return new KTypeImpl(returnType, new yh.a<Type>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // yh.a
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Type invoke() {
                        Type typeQ = kCallableImpl.q();
                        return typeQ == null ? kCallableImpl.r().getReturnType() : typeQ;
                    }
                });
            }
        });
        f0.o(aVarD3, "lazySoft {\n        KType…eturnType\n        }\n    }");
        this.f125094d = aVarD3;
        n.a<List<KTypeParameterImpl>> aVarD4 = n.d(new yh.a<List<? extends KTypeParameterImpl>>(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_typeParameters$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KCallableImpl<R> f125104b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f125104b = this;
            }

            @Override // yh.a
            public final List<? extends KTypeParameterImpl> invoke() {
                List<y0> typeParameters = this.f125104b.L().getTypeParameters();
                f0.o(typeParameters, "descriptor.typeParameters");
                l lVar = this.f125104b;
                ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(typeParameters, 10));
                for (y0 descriptor : typeParameters) {
                    f0.o(descriptor, "descriptor");
                    arrayList.add(new KTypeParameterImpl(lVar, descriptor));
                }
                return arrayList;
            }
        });
        f0.o(aVarD4, "lazySoft {\n        descr…this, descriptor) }\n    }");
        this.f125095e = aVarD4;
    }

    private final R j(Map<KParameter, ? extends Object> map) throws IllegalCallableAccessException {
        Object objN;
        List<KParameter> parameters = getParameters();
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(parameters, 10));
        for (KParameter kParameter : parameters) {
            if (map.containsKey(kParameter)) {
                objN = map.get(kParameter);
                if (objN == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + kParameter + ')');
                }
            } else if (kParameter.f()) {
                objN = null;
            } else {
                if (!kParameter.c()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
                }
                objN = n(kParameter.getType());
            }
            arrayList.add(objN);
        }
        kotlin.reflect.jvm.internal.calls.c<?> cVarG = G();
        if (cVarG != null) {
            try {
                return (R) cVarG.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e10) {
                throw new IllegalCallableAccessException(e10);
            }
        }
        throw new KotlinReflectionInternalError("This callable does not support a default call: " + L());
    }

    private final Object n(kotlin.reflect.r rVar) {
        Class clsE = xh.a.e(kotlin.reflect.jvm.d.b(rVar));
        if (clsE.isArray()) {
            Object objNewInstance = Array.newInstance(clsE.getComponentType(), 0);
            f0.o(objNewInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return objNewInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + clsE.getSimpleName() + ", because it is not an array type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Type q() {
        Type[] lowerBounds;
        CallableMemberDescriptor callableMemberDescriptorH = L();
        kotlin.reflect.jvm.internal.impl.descriptors.w wVar = callableMemberDescriptorH instanceof kotlin.reflect.jvm.internal.impl.descriptors.w ? (kotlin.reflect.jvm.internal.impl.descriptors.w) callableMemberDescriptorH : null;
        if (!(wVar != null && wVar.isSuspend())) {
            return null;
        }
        Object objQ3 = CollectionsKt___CollectionsKt.q3(r().c());
        ParameterizedType parameterizedType = objQ3 instanceof ParameterizedType ? (ParameterizedType) objQ3 : null;
        if (!f0.g(parameterizedType != null ? parameterizedType.getRawType() : null, kotlin.coroutines.c.class)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        f0.o(actualTypeArguments, "continuationType.actualTypeArguments");
        Object objHt = ArraysKt___ArraysKt.Ht(actualTypeArguments);
        WildcardType wildcardType = objHt instanceof WildcardType ? (WildcardType) objHt : null;
        if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
            return null;
        }
        return (Type) ArraysKt___ArraysKt.sc(lowerBounds);
    }

    @dl.e
    public abstract kotlin.reflect.jvm.internal.calls.c<?> G();

    @dl.d
    /* JADX INFO: renamed from: H */
    public abstract CallableMemberDescriptor L();

    protected final boolean I() {
        return f0.g(getName(), "<init>") && w().i().isAnnotation();
    }

    public abstract boolean J();

    @Override // kotlin.reflect.c
    public R call(@dl.d Object... args) throws IllegalCallableAccessException {
        f0.p(args, "args");
        try {
            return (R) r().call(args);
        } catch (IllegalAccessException e10) {
            throw new IllegalCallableAccessException(e10);
        }
    }

    @Override // kotlin.reflect.c
    public R callBy(@dl.d Map<KParameter, ? extends Object> args) {
        f0.p(args, "args");
        return I() ? j(args) : k(args, null);
    }

    @Override // kotlin.reflect.b
    @dl.d
    public List<Annotation> getAnnotations() {
        List<Annotation> listInvoke = this.f125092b.invoke();
        f0.o(listInvoke, "_annotations()");
        return listInvoke;
    }

    @Override // kotlin.reflect.c
    @dl.d
    public List<KParameter> getParameters() {
        ArrayList<KParameter> arrayListInvoke = this.f125093c.invoke();
        f0.o(arrayListInvoke, "_parameters()");
        return arrayListInvoke;
    }

    @Override // kotlin.reflect.c
    @dl.d
    public kotlin.reflect.r getReturnType() {
        KTypeImpl kTypeImplInvoke = this.f125094d.invoke();
        f0.o(kTypeImplInvoke, "_returnType()");
        return kTypeImplInvoke;
    }

    @Override // kotlin.reflect.c
    @dl.d
    public List<kotlin.reflect.s> getTypeParameters() {
        List<KTypeParameterImpl> listInvoke = this.f125095e.invoke();
        f0.o(listInvoke, "_typeParameters()");
        return listInvoke;
    }

    @Override // kotlin.reflect.c
    @dl.e
    public KVisibility getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.s visibility = L().getVisibility();
        f0.o(visibility, "descriptor.visibility");
        return s.q(visibility);
    }

    @Override // kotlin.reflect.c
    public boolean isAbstract() {
        return L().l() == Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.c
    public boolean isFinal() {
        return L().l() == Modality.FINAL;
    }

    @Override // kotlin.reflect.c
    public boolean isOpen() {
        return L().l() == Modality.OPEN;
    }

    public final R k(@dl.d Map<KParameter, ? extends Object> args, @dl.e kotlin.coroutines.c<?> cVar) throws IllegalCallableAccessException {
        f0.p(args, "args");
        List<KParameter> parameters = getParameters();
        ArrayList arrayList = new ArrayList(parameters.size());
        ArrayList arrayList2 = new ArrayList(1);
        Iterator<KParameter> it = parameters.iterator();
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                if (cVar != null) {
                    arrayList.add(cVar);
                }
                if (!z10) {
                    Object[] array = arrayList.toArray(new Object[0]);
                    return call(Arrays.copyOf(array, array.length));
                }
                arrayList2.add(Integer.valueOf(i11));
                kotlin.reflect.jvm.internal.calls.c<?> cVarG = G();
                if (cVarG == null) {
                    throw new KotlinReflectionInternalError("This callable does not support a default call: " + L());
                }
                arrayList.addAll(arrayList2);
                arrayList.add(null);
                try {
                    return (R) cVarG.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e10) {
                    throw new IllegalCallableAccessException(e10);
                }
            }
            KParameter next = it.next();
            if (i10 != 0 && i10 % 32 == 0) {
                arrayList2.add(Integer.valueOf(i11));
                i11 = 0;
            }
            if (args.containsKey(next)) {
                arrayList.add(args.get(next));
            } else if (next.f()) {
                arrayList.add(s.k(next.getType()) ? null : s.g(kotlin.reflect.jvm.e.g(next.getType())));
                i11 = (1 << (i10 % 32)) | i11;
                z10 = true;
            } else {
                if (!next.c()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + next);
                }
                arrayList.add(n(next.getType()));
            }
            if (next.b() == KParameter.Kind.VALUE) {
                i10++;
            }
        }
    }

    @dl.d
    public abstract kotlin.reflect.jvm.internal.calls.c<?> r();

    @dl.d
    public abstract KDeclarationContainerImpl w();
}
