package com.google.auto.common;

import com.google.common.base.Equivalence;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ErrorType;
import javax.lang.model.type.ExecutableType;
import javax.lang.model.type.IntersectionType;
import javax.lang.model.type.NoType;
import javax.lang.model.type.NullType;
import javax.lang.model.type.PrimitiveType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVariable;
import javax.lang.model.type.WildcardType;
import javax.lang.model.util.Elements;
import javax.lang.model.util.SimpleTypeVisitor8;
import javax.lang.model.util.Types;

/* JADX INFO: compiled from: MoreTypes.java */
/* JADX INFO: loaded from: classes7.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f56532a = 17;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f56533b = 31;

    /* JADX INFO: compiled from: MoreTypes.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f56534a;

        static {
            int[] iArr = new int[TypeKind.values().length];
            f56534a = iArr;
            try {
                iArr[TypeKind.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56534a[TypeKind.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56534a[TypeKind.CHAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56534a[TypeKind.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56534a[TypeKind.FLOAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56534a[TypeKind.INT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56534a[TypeKind.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f56534a[TypeKind.SHORT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: compiled from: MoreTypes.java */
    public static final class b extends d<ArrayType> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final b f56535b = new b();

        b() {
            super("array");
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ArrayType d(ArrayType arrayType, Void r10) {
            return arrayType;
        }
    }

    /* JADX INFO: compiled from: MoreTypes.java */
    public static final class c extends SimpleTypeVisitor8<Element, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f56536a = new c();

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Element b(TypeMirror typeMirror, Void r10) {
            throw new IllegalArgumentException(typeMirror + " cannot be converted to an Element");
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Element d(DeclaredType declaredType, Void r10) {
            return declaredType.asElement();
        }

        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Element f(ErrorType errorType, Void r10) {
            return errorType.asElement();
        }

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Element h(TypeVariable typeVariable, Void r10) {
            return typeVariable.asElement();
        }
    }

    /* JADX INFO: compiled from: MoreTypes.java */
    public static abstract class d<T> extends SimpleTypeVisitor8<T, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f56537a;

        d(String str) {
            this.f56537a = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public T a(TypeMirror typeMirror, Void r10) {
            throw new IllegalArgumentException(typeMirror + " does not represent a " + this.f56537a);
        }
    }

    /* JADX INFO: compiled from: MoreTypes.java */
    public static class e extends SimpleTypeVisitor8<Boolean, Void> {
        e() {
            super(Boolean.FALSE);
        }

        private static boolean b(TypeMirror typeMirror) {
            if (typeMirror.getKind() != TypeKind.DECLARED) {
                return false;
            }
            return o0.p(typeMirror).getQualifiedName().contentEquals("java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean c(TypeMirror typeMirror) {
            if (!typeMirror.getKind().equals(TypeKind.WILDCARD)) {
                return true;
            }
            WildcardType wildcardTypeS = o0.s(typeMirror);
            return ((wildcardTypeS.getExtendsBound() == null || b(wildcardTypeS.getExtendsBound())) && wildcardTypeS.getSuperBound() == null) ? false : true;
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean e(ArrayType arrayType, Void r10) {
            return (Boolean) visit(arrayType.getComponentType(), r10);
        }

        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean g(DeclaredType declaredType, Void r10) {
            return Boolean.valueOf(declaredType.getTypeArguments().stream().anyMatch(new Predicate() { // from class: com.google.auto.common.p0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return o0.e.c((TypeMirror) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean i(TypeVariable typeVariable, Void r10) {
            return Boolean.TRUE;
        }

        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Boolean k(TypeMirror typeMirror, Void r10) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: MoreTypes.java */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Element f56538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ImmutableList<TypeMirror> f56539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Element f56540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ImmutableList<TypeMirror> f56541d;

        f(Element element, ImmutableList<TypeMirror> immutableList, Element element2, ImmutableList<TypeMirror> immutableList2) {
            this.f56538a = element;
            this.f56539b = immutableList;
            this.f56540c = element2;
            this.f56541d = immutableList2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                int size = this.f56539b.size();
                if (this.f56538a.equals(fVar.f56538a) && this.f56540c.equals(fVar.f56540c) && size == this.f56541d.size()) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f56539b.get(i10) != this.f56541d.get(i10)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f56538a.hashCode() * 31) + this.f56540c.hashCode();
        }
    }

    /* JADX INFO: compiled from: MoreTypes.java */
    public static final class g extends d<DeclaredType> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final g f56542b = new g();

        g() {
            super("declared type");
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public DeclaredType d(DeclaredType declaredType, Void r10) {
            return declaredType;
        }
    }

    /* JADX INFO: compiled from: MoreTypes.java */
    public static final class h extends SimpleTypeVisitor8<Boolean, i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final h f56543a = new h();

        private h() {
        }

        private Set<f> t(Set<f> set, Element element, List<? extends TypeMirror> list, Element element2, List<? extends TypeMirror> list2) {
            f fVar = new f(element, ImmutableList.v(list), element2, ImmutableList.v(list2));
            HashSet hashSet = new HashSet(set);
            hashSet.add(fVar);
            return hashSet;
        }

        private Set<f> u(Set<f> set, Element element, Element element2) {
            ImmutableList immutableListB = ImmutableList.B();
            return t(set, element, immutableListB, element2, immutableListB);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean c(TypeMirror typeMirror, i iVar) {
            return Boolean.valueOf(typeMirror.getKind().equals(iVar.f56544a.getKind()));
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean e(ArrayType arrayType, i iVar) {
            if (!iVar.f56544a.getKind().equals(TypeKind.ARRAY)) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(o0.u(arrayType.getComponentType(), iVar.f56544a.getComponentType(), iVar.f56545b));
        }

        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean g(DeclaredType declaredType, i iVar) {
            if (!iVar.f56544a.getKind().equals(TypeKind.DECLARED)) {
                return Boolean.FALSE;
            }
            DeclaredType declaredType2 = iVar.f56544a;
            Element elementAsElement = declaredType.asElement();
            Element elementAsElement2 = declaredType2.asElement();
            Set<f> setT = t(iVar.f56545b, elementAsElement, declaredType.getTypeArguments(), elementAsElement2, declaredType2.getTypeArguments());
            if (setT.equals(iVar.f56545b)) {
                return Boolean.TRUE;
            }
            return Boolean.valueOf(elementAsElement.equals(elementAsElement2) && o0.u(o0.t(declaredType), o0.t(declaredType2), setT) && o0.v(declaredType.getTypeArguments(), declaredType2.getTypeArguments(), setT));
        }

        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean i(ErrorType errorType, i iVar) {
            return Boolean.valueOf(errorType.equals(iVar.f56544a));
        }

        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Boolean k(ExecutableType executableType, i iVar) {
            if (!iVar.f56544a.getKind().equals(TypeKind.EXECUTABLE)) {
                return Boolean.FALSE;
            }
            ExecutableType executableType2 = iVar.f56544a;
            return Boolean.valueOf(o0.v(executableType.getParameterTypes(), executableType2.getParameterTypes(), iVar.f56545b) && o0.u(executableType.getReturnType(), executableType2.getReturnType(), iVar.f56545b) && o0.v(executableType.getThrownTypes(), executableType2.getThrownTypes(), iVar.f56545b) && o0.v(executableType.getTypeVariables(), executableType2.getTypeVariables(), iVar.f56545b));
        }

        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Boolean m(IntersectionType intersectionType, i iVar) {
            if (!iVar.f56544a.getKind().equals(TypeKind.INTERSECTION)) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(o0.v(intersectionType.getBounds(), iVar.f56544a.getBounds(), iVar.f56545b));
        }

        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Boolean o(TypeVariable typeVariable, i iVar) {
            if (!iVar.f56544a.getKind().equals(TypeKind.TYPEVAR)) {
                return Boolean.FALSE;
            }
            TypeVariable typeVariable2 = iVar.f56544a;
            TypeParameterElement typeParameterElementAsElement = typeVariable.asElement();
            TypeParameterElement typeParameterElementAsElement2 = typeVariable2.asElement();
            Set<f> setU = u(iVar.f56545b, typeParameterElementAsElement, typeParameterElementAsElement2);
            if (setU.equals(iVar.f56545b)) {
                return Boolean.TRUE;
            }
            return Boolean.valueOf(o0.v(typeParameterElementAsElement.getBounds(), typeParameterElementAsElement2.getBounds(), setU) && o0.u(typeVariable.getLowerBound(), typeVariable2.getLowerBound(), setU) && typeVariable.asElement().getSimpleName().equals(typeVariable2.asElement().getSimpleName()));
        }

        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Boolean q(TypeMirror typeMirror, i iVar) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Boolean s(WildcardType wildcardType, i iVar) {
            if (!iVar.f56544a.getKind().equals(TypeKind.WILDCARD)) {
                return Boolean.FALSE;
            }
            WildcardType wildcardType2 = iVar.f56544a;
            return Boolean.valueOf(o0.u(wildcardType.getExtendsBound(), wildcardType2.getExtendsBound(), iVar.f56545b) && o0.u(wildcardType.getSuperBound(), wildcardType2.getSuperBound(), iVar.f56545b));
        }
    }

    /* JADX INFO: compiled from: MoreTypes.java */
    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        TypeMirror f56544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Set<f> f56545b;

        private i() {
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: MoreTypes.java */
    public static final class j extends d<ErrorType> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final j f56546b = new j();

        j() {
            super("error type");
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ErrorType d(ErrorType errorType, Void r10) {
            return errorType;
        }
    }

    /* JADX INFO: compiled from: MoreTypes.java */
    public static final class k extends d<ExecutableType> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final k f56547b = new k();

        k() {
            super("executable type");
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ExecutableType d(ExecutableType executableType, Void r10) {
            return executableType;
        }
    }

    /* JADX INFO: compiled from: MoreTypes.java */
    public static final class l extends SimpleTypeVisitor8<Integer, Set<Element>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final l f56548a = new l();

        private l() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer c(TypeMirror typeMirror, Set<Element> set) {
            return Integer.valueOf(d(17, typeMirror));
        }

        int d(int i10, TypeMirror typeMirror) {
            return (i10 * 31) + typeMirror.getKind().hashCode();
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Integer f(ArrayType arrayType, Set<Element> set) {
            return Integer.valueOf((d(17, arrayType) * 31) + ((Integer) arrayType.getComponentType().accept(this, set)).intValue());
        }

        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer h(DeclaredType declaredType, Set<Element> set) {
            Element elementAsElement = declaredType.asElement();
            if (set.contains(elementAsElement)) {
                return 0;
            }
            HashSet hashSet = new HashSet(set);
            hashSet.add(elementAsElement);
            return Integer.valueOf((((((d(17, declaredType) * 31) + declaredType.asElement().hashCode()) * 31) + ((Integer) declaredType.getEnclosingType().accept(this, hashSet)).intValue()) * 31) + o0.y(declaredType.getTypeArguments(), hashSet));
        }

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer j(ExecutableType executableType, Set<Element> set) {
            return Integer.valueOf((((((((d(17, executableType) * 31) + o0.y(executableType.getParameterTypes(), set)) * 31) + ((Integer) executableType.getReturnType().accept(this, set)).intValue()) * 31) + o0.y(executableType.getThrownTypes(), set)) * 31) + o0.y(executableType.getTypeVariables(), set));
        }

        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer l(TypeVariable typeVariable, Set<Element> set) {
            int iD = (d(17, typeVariable) * 31) + ((Integer) typeVariable.getLowerBound().accept(this, set)).intValue();
            Iterator it = typeVariable.asElement().getBounds().iterator();
            while (it.hasNext()) {
                iD = (iD * 31) + ((Integer) ((TypeMirror) it.next()).accept(this, set)).intValue();
            }
            return Integer.valueOf(iD);
        }

        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public Integer n(TypeMirror typeMirror, Set<Element> set) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Integer p(WildcardType wildcardType, Set<Element> set) {
            return Integer.valueOf((((d(17, wildcardType) * 31) + (wildcardType.getExtendsBound() == null ? 0 : ((Integer) wildcardType.getExtendsBound().accept(this, set)).intValue())) * 31) + (wildcardType.getSuperBound() != null ? ((Integer) wildcardType.getSuperBound().accept(this, set)).intValue() : 0));
        }
    }

    /* JADX INFO: compiled from: MoreTypes.java */
    public static final class m extends d<IntersectionType> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final m f56549b = new m();

        m() {
            super("intersection type");
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public IntersectionType d(IntersectionType intersectionType, Void r10) {
            return intersectionType;
        }
    }

    /* JADX INFO: compiled from: MoreTypes.java */
    public static final class n extends SimpleTypeVisitor8<Boolean, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<?> f56550a;

        n(Class<?> cls) {
            this.f56550a = cls;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean b(TypeMirror typeMirror, Void r10) {
            throw new IllegalArgumentException(typeMirror + " cannot be represented as a Class<?>.");
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean d(ArrayType arrayType, Void r10) {
            return Boolean.valueOf(this.f56550a.isArray() && o0.C(this.f56550a.getComponentType(), arrayType.getComponentType()));
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean f(DeclaredType declaredType, Void r10) {
            return Boolean.valueOf(n0.c(declaredType.asElement()).getQualifiedName().contentEquals(this.f56550a.getCanonicalName()));
        }

        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Boolean h(NoType noType, Void r10) {
            if (noType.getKind().equals(TypeKind.VOID)) {
                return Boolean.valueOf(this.f56550a.equals(Void.TYPE));
            }
            throw new IllegalArgumentException(noType + " cannot be represented as a Class<?>.");
        }

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean j(PrimitiveType primitiveType, Void r10) {
            switch (a.f56534a[primitiveType.getKind().ordinal()]) {
                case 1:
                    return Boolean.valueOf(this.f56550a.equals(Boolean.TYPE));
                case 2:
                    return Boolean.valueOf(this.f56550a.equals(Byte.TYPE));
                case 3:
                    return Boolean.valueOf(this.f56550a.equals(Character.TYPE));
                case 4:
                    return Boolean.valueOf(this.f56550a.equals(Double.TYPE));
                case 5:
                    return Boolean.valueOf(this.f56550a.equals(Float.TYPE));
                case 6:
                    return Boolean.valueOf(this.f56550a.equals(Integer.TYPE));
                case 7:
                    return Boolean.valueOf(this.f56550a.equals(Long.TYPE));
                case 8:
                    return Boolean.valueOf(this.f56550a.equals(Short.TYPE));
                default:
                    throw new IllegalArgumentException(primitiveType + " cannot be represented as a Class<?>.");
            }
        }
    }

    /* JADX INFO: compiled from: MoreTypes.java */
    public static final class o extends SimpleTypeVisitor8<Boolean, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final o f56551a = new o();

        private o() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean c(TypeMirror typeMirror, Void r10) {
            return Boolean.FALSE;
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean e(ArrayType arrayType, Void r10) {
            return Boolean.TRUE;
        }

        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean g(DeclaredType declaredType, Void r10) {
            return Boolean.valueOf(n0.q(declaredType.asElement()));
        }

        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean i(NoType noType, Void r10) {
            return Boolean.valueOf(noType.getKind().equals(TypeKind.VOID));
        }

        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Boolean k(PrimitiveType primitiveType, Void r10) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: MoreTypes.java */
    public static final class p extends d<NoType> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final p f56552b = new p();

        p() {
            super("non-type");
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public NoType d(NoType noType, Void r10) {
            return noType;
        }
    }

    /* JADX INFO: compiled from: MoreTypes.java */
    public static final class q extends d<NullType> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final q f56553b = new q();

        q() {
            super("null");
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public NullType d(NullType nullType, Void r10) {
            return nullType;
        }
    }

    /* JADX INFO: compiled from: MoreTypes.java */
    public static final class r extends d<PrimitiveType> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final r f56554b = new r();

        r() {
            super("primitive type");
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public PrimitiveType d(PrimitiveType primitiveType, Void r10) {
            return primitiveType;
        }
    }

    /* JADX INFO: compiled from: MoreTypes.java */
    public static final class s extends SimpleTypeVisitor8<Void, ImmutableSet.a<TypeElement>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final s f56555a = new s();

        private s() {
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Void b(ArrayType arrayType, ImmutableSet.a<TypeElement> aVar) {
            arrayType.getComponentType().accept(this, aVar);
            return null;
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Void d(DeclaredType declaredType, ImmutableSet.a<TypeElement> aVar) {
            aVar.g(n0.c(declaredType.asElement()));
            Iterator it = declaredType.getTypeArguments().iterator();
            while (it.hasNext()) {
                ((TypeMirror) it.next()).accept(this, aVar);
            }
            return null;
        }

        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Void f(TypeVariable typeVariable, ImmutableSet.a<TypeElement> aVar) {
            typeVariable.getLowerBound().accept(this, aVar);
            typeVariable.getUpperBound().accept(this, aVar);
            return null;
        }

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Void h(WildcardType wildcardType, ImmutableSet.a<TypeElement> aVar) {
            TypeMirror extendsBound = wildcardType.getExtendsBound();
            if (extendsBound != null) {
                extendsBound.accept(this, aVar);
            }
            TypeMirror superBound = wildcardType.getSuperBound();
            if (superBound == null) {
                return null;
            }
            superBound.accept(this, aVar);
            return null;
        }
    }

    /* JADX INFO: compiled from: MoreTypes.java */
    public static final class t extends Equivalence<TypeMirror> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final t f56556b = new t();

        private t() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Equivalence
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public boolean a(TypeMirror typeMirror, TypeMirror typeMirror2) {
            return o0.u(typeMirror, typeMirror2, ImmutableSet.D());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Equivalence
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public int b(TypeMirror typeMirror) {
            return o0.x(typeMirror, ImmutableSet.D());
        }

        public String toString() {
            return "MoreTypes.equivalence()";
        }
    }

    /* JADX INFO: compiled from: MoreTypes.java */
    public static final class u extends d<TypeVariable> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final u f56557b = new u();

        u() {
            super("type variable");
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public TypeVariable d(TypeVariable typeVariable, Void r10) {
            return typeVariable;
        }
    }

    /* JADX INFO: compiled from: MoreTypes.java */
    public static final class v extends d<WildcardType> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final v f56558b = new v();

        v() {
            super("wildcard type");
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public WildcardType d(WildcardType wildcardType, Void r10) {
            return wildcardType;
        }
    }

    private o0() {
    }

    private static boolean A(DeclaredType declaredType) {
        return p(declaredType).getQualifiedName().contentEquals("java.lang.Object");
    }

    public static boolean B(TypeMirror typeMirror) {
        return ((Boolean) typeMirror.accept(o.f56551a, (Object) null)).booleanValue();
    }

    public static boolean C(Class<?> cls, TypeMirror typeMirror) {
        com.google.common.base.w.E(cls);
        return ((Boolean) typeMirror.accept(new n(cls), (Object) null)).booleanValue();
    }

    public static Optional<DeclaredType> D(Types types, Elements elements, DeclaredType declaredType) {
        com.google.common.base.w.E(types);
        com.google.common.base.w.E(elements);
        com.google.common.base.w.E(declaredType);
        TypeMirror superclass = p(declaredType).getSuperclass();
        if (!B(superclass)) {
            return Optional.a();
        }
        DeclaredType declaredTypeG = g(superclass);
        if (A(declaredTypeG)) {
            return Optional.a();
        }
        return declaredTypeG.getTypeArguments().isEmpty() ? Optional.f(declaredTypeG) : Optional.f(g((TypeMirror) types.directSupertypes(declaredType).get(0)));
    }

    public static ImmutableSet<TypeElement> E(TypeMirror typeMirror) {
        com.google.common.base.w.E(typeMirror);
        ImmutableSet.a aVarQ = ImmutableSet.q();
        typeMirror.accept(s.f56555a, aVarQ);
        return aVarQ.e();
    }

    public static ArrayType f(TypeMirror typeMirror) {
        return (ArrayType) typeMirror.accept(b.f56535b, (Object) null);
    }

    public static DeclaredType g(TypeMirror typeMirror) {
        return (DeclaredType) typeMirror.accept(g.f56542b, (Object) null);
    }

    public static Element h(TypeMirror typeMirror) {
        return (Element) typeMirror.accept(c.f56536a, (Object) null);
    }

    public static ErrorType i(TypeMirror typeMirror) {
        return (ErrorType) typeMirror.accept(j.f56546b, (Object) null);
    }

    public static ExecutableType j(TypeMirror typeMirror) {
        return (ExecutableType) typeMirror.accept(k.f56547b, (Object) null);
    }

    public static IntersectionType k(TypeMirror typeMirror) {
        return (IntersectionType) typeMirror.accept(m.f56549b, (Object) null);
    }

    public static TypeMirror l(Types types, DeclaredType declaredType, VariableElement variableElement) {
        if (!variableElement.getKind().equals(ElementKind.PARAMETER)) {
            return types.asMemberOf(declaredType, variableElement);
        }
        ExecutableElement executableElementA = n0.a(variableElement.getEnclosingElement());
        ExecutableType executableTypeJ = j(types.asMemberOf(declaredType, executableElementA));
        List parameters = executableElementA.getParameters();
        List parameterTypes = executableTypeJ.getParameterTypes();
        com.google.common.base.w.g0(parameters.size() == parameterTypes.size());
        for (int i10 = 0; i10 < parameters.size(); i10++) {
            if (((VariableElement) parameters.get(i10)).equals(variableElement)) {
                return (TypeMirror) parameterTypes.get(i10);
            }
        }
        throw new IllegalStateException("Could not find variable: " + variableElement);
    }

    public static NoType m(TypeMirror typeMirror) {
        return (NoType) typeMirror.accept(p.f56552b, (Object) null);
    }

    public static NullType n(TypeMirror typeMirror) {
        return (NullType) typeMirror.accept(q.f56553b, (Object) null);
    }

    public static PrimitiveType o(TypeMirror typeMirror) {
        return (PrimitiveType) typeMirror.accept(r.f56554b, (Object) null);
    }

    public static TypeElement p(TypeMirror typeMirror) {
        return n0.c(h(typeMirror));
    }

    public static ImmutableSet<TypeElement> q(Iterable<? extends TypeMirror> iterable) {
        com.google.common.base.w.E(iterable);
        ImmutableSet.a aVarQ = ImmutableSet.q();
        Iterator<? extends TypeMirror> it = iterable.iterator();
        while (it.hasNext()) {
            aVarQ.g(p(it.next()));
        }
        return aVarQ.e();
    }

    public static TypeVariable r(TypeMirror typeMirror) {
        return (TypeVariable) typeMirror.accept(u.f56557b, (Object) null);
    }

    public static WildcardType s(TypeMirror typeMirror) {
        return (WildcardType) typeMirror.accept(v.f56558b, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TypeMirror t(DeclaredType declaredType) {
        TypeMirror enclosingType = declaredType.getEnclosingType();
        if (enclosingType.getKind().equals(TypeKind.NONE) || declaredType.asElement().getModifiers().contains(Modifier.STATIC)) {
            return null;
        }
        return enclosingType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean u(TypeMirror typeMirror, TypeMirror typeMirror2, Set<f> set) {
        if (com.google.common.base.s.a(typeMirror, typeMirror2) && !(typeMirror instanceof ExecutableType)) {
            return true;
        }
        i iVar = new i(null);
        iVar.f56544a = typeMirror2;
        iVar.f56545b = set;
        if (typeMirror != typeMirror2) {
            return (typeMirror == null || typeMirror2 == null || !((Boolean) typeMirror.accept(h.f56543a, iVar)).booleanValue()) ? false : true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean v(List<? extends TypeMirror> list, List<? extends TypeMirror> list2, Set<f> set) {
        if (list.size() != list2.size()) {
            return false;
        }
        Iterator<? extends TypeMirror> it = list.iterator();
        Iterator<? extends TypeMirror> it2 = list2.iterator();
        while (it.hasNext()) {
            if (!u(it.next(), it2.next(), set)) {
                return false;
            }
        }
        return true;
    }

    public static Equivalence<TypeMirror> w() {
        return t.f56556b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(TypeMirror typeMirror, Set<Element> set) {
        if (typeMirror == null) {
            return 0;
        }
        return ((Integer) typeMirror.accept(l.f56548a, set)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int y(List<? extends TypeMirror> list, Set<Element> set) {
        Iterator<? extends TypeMirror> it = list.iterator();
        int iX = 17;
        while (it.hasNext()) {
            iX = (iX * 31) + x(it.next(), set);
        }
        return iX;
    }

    public static boolean z(TypeMirror typeMirror) {
        return ((Boolean) new e().visit(typeMirror, null)).booleanValue();
    }
}
