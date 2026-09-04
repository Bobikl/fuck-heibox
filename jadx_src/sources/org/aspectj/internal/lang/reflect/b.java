package org.aspectj.internal.lang.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import org.aspectj.lang.reflect.AdviceKind;
import org.aspectj.lang.reflect.DeclareAnnotation;
import org.aspectj.lang.reflect.NoSuchAdviceException;
import org.aspectj.lang.reflect.NoSuchPointcutException;
import org.aspectj.lang.reflect.PerClauseKind;
import zj.u;
import zj.v;

/* JADX INFO: compiled from: AjTypeImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class b<T> implements zj.c<T> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f137597m = "ajc$";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Class<T> f137598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v[] f137599c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v[] f137600d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private zj.a[] f137601e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private zj.a[] f137602f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private zj.q[] f137603g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private zj.q[] f137604h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private zj.p[] f137605i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private zj.p[] f137606j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private zj.n[] f137607k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private zj.n[] f137608l = null;

    public b(Class<T> cls) {
        this.f137598b = cls;
    }

    private void g0(List<zj.i> list) {
        for (Field field : this.f137598b.getDeclaredFields()) {
            if (field.isAnnotationPresent(xj.k.class) && field.getType().isInterface()) {
                list.add(new e(((xj.k) field.getAnnotation(xj.k.class)).value(), field.getType().getName(), false, this));
            }
        }
    }

    private void h0(List<zj.p> list, boolean z10) {
    }

    private void i0(List<zj.q> list, boolean z10) {
        if (b0()) {
            for (Field field : this.f137598b.getDeclaredFields()) {
                if (field.getType().isInterface() && field.isAnnotationPresent(xj.k.class) && ((xj.k) field.getAnnotation(xj.k.class)).defaultImpl() != xj.k.class) {
                    for (Method method : field.getType().getDeclaredMethods()) {
                        if (Modifier.isPublic(method.getModifiers()) || !z10) {
                            list.add(new k(this, zj.d.a(field.getType()), method, 1));
                        }
                    }
                }
            }
        }
    }

    private zj.a j0(Method method) {
        if (method.getAnnotations().length == 0) {
            return null;
        }
        xj.g gVar = (xj.g) method.getAnnotation(xj.g.class);
        if (gVar != null) {
            return new a(method, gVar.value(), AdviceKind.BEFORE);
        }
        xj.b bVar = (xj.b) method.getAnnotation(xj.b.class);
        if (bVar != null) {
            return new a(method, bVar.value(), AdviceKind.AFTER);
        }
        xj.c cVar = (xj.c) method.getAnnotation(xj.c.class);
        if (cVar != null) {
            String strPointcut = cVar.pointcut();
            if (strPointcut.equals("")) {
                strPointcut = cVar.value();
            }
            return new a(method, strPointcut, AdviceKind.AFTER_RETURNING, cVar.returning());
        }
        xj.d dVar = (xj.d) method.getAnnotation(xj.d.class);
        if (dVar != null) {
            String strPointcut2 = dVar.pointcut();
            if (strPointcut2 == null) {
                strPointcut2 = dVar.value();
            }
            return new a(method, strPointcut2, AdviceKind.AFTER_THROWING, dVar.throwing());
        }
        xj.e eVar = (xj.e) method.getAnnotation(xj.e.class);
        if (eVar != null) {
            return new a(method, eVar.value(), AdviceKind.AROUND);
        }
        return null;
    }

    private v k0(Method method) {
        int iIndexOf;
        xj.n nVar = (xj.n) method.getAnnotation(xj.n.class);
        if (nVar == null) {
            return null;
        }
        String name = method.getName();
        if (name.startsWith(f137597m) && (iIndexOf = (name = name.substring(name.indexOf("$$") + 2, name.length())).indexOf("$")) != -1) {
            name = name.substring(0, iIndexOf);
        }
        return new o(name, nVar.value(), method, zj.d.a(method.getDeclaringClass()), nVar.argNames());
    }

    private zj.a[] l0(Set set) {
        if (this.f137602f == null) {
            n0();
        }
        ArrayList arrayList = new ArrayList();
        for (zj.a aVar : this.f137602f) {
            if (set.contains(aVar.b())) {
                arrayList.add(aVar);
            }
        }
        zj.a[] aVarArr = new zj.a[arrayList.size()];
        arrayList.toArray(aVarArr);
        return aVarArr;
    }

    private zj.a[] m0(Set set) {
        if (this.f137601e == null) {
            o0();
        }
        ArrayList arrayList = new ArrayList();
        for (zj.a aVar : this.f137601e) {
            if (set.contains(aVar.b())) {
                arrayList.add(aVar);
            }
        }
        zj.a[] aVarArr = new zj.a[arrayList.size()];
        arrayList.toArray(aVarArr);
        return aVarArr;
    }

    private void n0() {
        Method[] methods = this.f137598b.getMethods();
        ArrayList arrayList = new ArrayList();
        for (Method method : methods) {
            zj.a aVarJ0 = j0(method);
            if (aVarJ0 != null) {
                arrayList.add(aVarJ0);
            }
        }
        zj.a[] aVarArr = new zj.a[arrayList.size()];
        this.f137602f = aVarArr;
        arrayList.toArray(aVarArr);
    }

    private void o0() {
        Method[] declaredMethods = this.f137598b.getDeclaredMethods();
        ArrayList arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            zj.a aVarJ0 = j0(method);
            if (aVarJ0 != null) {
                arrayList.add(aVarJ0);
            }
        }
        zj.a[] aVarArr = new zj.a[arrayList.size()];
        this.f137601e = aVarArr;
        arrayList.toArray(aVarArr);
    }

    private boolean p0(Method method) {
        if (method.getName().startsWith(f137597m)) {
            return false;
        }
        if (method.getAnnotations().length == 0) {
            return true;
        }
        return (method.isAnnotationPresent(xj.n.class) || method.isAnnotationPresent(xj.g.class) || method.isAnnotationPresent(xj.b.class) || method.isAnnotationPresent(xj.c.class) || method.isAnnotationPresent(xj.d.class) || method.isAnnotationPresent(xj.e.class)) ? false : true;
    }

    private zj.c<?>[] q0(Class<?>[] clsArr) {
        int length = clsArr.length;
        zj.c<?>[] cVarArr = new zj.c[length];
        for (int i10 = 0; i10 < length; i10++) {
            cVarArr[i10] = zj.d.a(clsArr[i10]);
        }
        return cVarArr;
    }

    private Class<?>[] r0(zj.c<?>[] cVarArr) {
        int length = cVarArr.length;
        Class<?>[] clsArr = new Class[length];
        for (int i10 = 0; i10 < length; i10++) {
            clsArr[i10] = cVarArr[i10].J();
        }
        return clsArr;
    }

    @Override // zj.c
    public zj.p[] A() {
        List<zj.p> arrayList = new ArrayList<>();
        if (this.f137605i == null) {
            for (Method method : this.f137598b.getDeclaredMethods()) {
                if (method.isAnnotationPresent(wj.f.class) && method.getName().contains("ajc$interFieldInit")) {
                    wj.f fVar = (wj.f) method.getAnnotation(wj.f.class);
                    try {
                        Method declaredMethod = this.f137598b.getDeclaredMethod(method.getName().replace("FieldInit", "FieldGetDispatch"), method.getParameterTypes());
                        arrayList.add(new j(this, fVar.targetType(), fVar.modifiers(), fVar.name(), zj.d.a(declaredMethod.getReturnType()), declaredMethod.getGenericReturnType()));
                    } catch (NoSuchMethodException unused) {
                        throw new IllegalStateException("Can't find field get dispatch method for " + method.getName());
                    }
                }
            }
            h0(arrayList, false);
            zj.p[] pVarArr = new zj.p[arrayList.size()];
            this.f137605i = pVarArr;
            arrayList.toArray(pVarArr);
        }
        return this.f137605i;
    }

    @Override // zj.c
    public zj.q[] B() {
        if (this.f137603g == null) {
            List<zj.q> arrayList = new ArrayList<>();
            for (Method method : this.f137598b.getDeclaredMethods()) {
                if (method.getName().contains("ajc$interMethodDispatch1$") && method.isAnnotationPresent(wj.f.class)) {
                    wj.f fVar = (wj.f) method.getAnnotation(wj.f.class);
                    arrayList.add(new k(this, fVar.targetType(), fVar.modifiers(), fVar.name(), method));
                }
            }
            i0(arrayList, false);
            zj.q[] qVarArr = new zj.q[arrayList.size()];
            this.f137603g = qVarArr;
            arrayList.toArray(qVarArr);
        }
        return this.f137603g;
    }

    @Override // zj.c
    public v C(String str) throws NoSuchPointcutException {
        for (v vVar : I()) {
            if (vVar.getName().equals(str)) {
                return vVar;
            }
        }
        throw new NoSuchPointcutException(str);
    }

    @Override // zj.c
    public zj.n D(zj.c<?> cVar, zj.c<?>... cVarArr) throws NoSuchMethodException {
        for (zj.n nVar : M()) {
            try {
                if (nVar.g().equals(cVar)) {
                    zj.c<?>[] cVarArrC = nVar.c();
                    if (cVarArrC.length == cVarArr.length) {
                        for (int i10 = 0; i10 < cVarArrC.length; i10++) {
                            if (cVarArrC[i10].equals(cVarArr[i10])) {
                            }
                        }
                        return nVar;
                    }
                    continue;
                } else {
                    continue;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        throw new NoSuchMethodException();
    }

    @Override // zj.c
    public T[] E() {
        return this.f137598b.getEnumConstants();
    }

    @Override // zj.c
    public Constructor[] F() {
        return this.f137598b.getDeclaredConstructors();
    }

    @Override // zj.c
    public Type G() {
        return this.f137598b.getGenericSuperclass();
    }

    @Override // zj.c
    public u H() {
        if (!b0()) {
            return null;
        }
        String strValue = ((xj.f) this.f137598b.getAnnotation(xj.f.class)).value();
        if (strValue.equals("")) {
            return d0().b0() ? d0().H() : new l(PerClauseKind.SINGLETON);
        }
        if (strValue.startsWith("perthis(")) {
            return new m(PerClauseKind.PERTHIS, strValue.substring(8, strValue.length() - 1));
        }
        if (strValue.startsWith("pertarget(")) {
            return new m(PerClauseKind.PERTARGET, strValue.substring(10, strValue.length() - 1));
        }
        if (strValue.startsWith("percflow(")) {
            return new m(PerClauseKind.PERCFLOW, strValue.substring(9, strValue.length() - 1));
        }
        if (strValue.startsWith("percflowbelow(")) {
            return new m(PerClauseKind.PERCFLOWBELOW, strValue.substring(14, strValue.length() - 1));
        }
        if (strValue.startsWith("pertypewithin")) {
            return new r(PerClauseKind.PERTYPEWITHIN, strValue.substring(14, strValue.length() - 1));
        }
        throw new IllegalStateException("Per-clause not recognized: " + strValue);
    }

    @Override // zj.c
    public v[] I() {
        v[] vVarArr = this.f137599c;
        if (vVarArr != null) {
            return vVarArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Method method : this.f137598b.getDeclaredMethods()) {
            v vVarK0 = k0(method);
            if (vVarK0 != null) {
                arrayList.add(vVarK0);
            }
        }
        v[] vVarArr2 = new v[arrayList.size()];
        arrayList.toArray(vVarArr2);
        this.f137599c = vVarArr2;
        return vVarArr2;
    }

    @Override // zj.c
    public Class<T> J() {
        return this.f137598b;
    }

    @Override // zj.c
    public Method K(String str, zj.c<?>... cVarArr) throws NoSuchMethodException {
        Method declaredMethod = this.f137598b.getDeclaredMethod(str, r0(cVarArr));
        if (p0(declaredMethod)) {
            return declaredMethod;
        }
        throw new NoSuchMethodException(str);
    }

    @Override // zj.c
    public Constructor L(zj.c<?>... cVarArr) throws NoSuchMethodException {
        return this.f137598b.getConstructor(r0(cVarArr));
    }

    @Override // zj.c
    public zj.n[] M() {
        if (this.f137608l == null) {
            ArrayList arrayList = new ArrayList();
            for (Method method : this.f137598b.getDeclaredMethods()) {
                if (method.getName().contains("ajc$postInterConstructor") && method.isAnnotationPresent(wj.f.class)) {
                    wj.f fVar = (wj.f) method.getAnnotation(wj.f.class);
                    arrayList.add(new h(this, fVar.targetType(), fVar.modifiers(), method));
                }
            }
            zj.n[] nVarArr = new zj.n[arrayList.size()];
            this.f137608l = nVarArr;
            arrayList.toArray(nVarArr);
        }
        return this.f137608l;
    }

    @Override // zj.c
    public DeclareAnnotation[] N() {
        Annotation annotation;
        ArrayList arrayList = new ArrayList();
        for (Method method : this.f137598b.getDeclaredMethods()) {
            if (method.isAnnotationPresent(wj.a.class)) {
                wj.a aVar = (wj.a) method.getAnnotation(wj.a.class);
                Annotation[] annotations = method.getAnnotations();
                int length = annotations.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        annotation = null;
                        break;
                    }
                    Annotation annotation2 = annotations[i10];
                    if (annotation2.annotationType() != wj.a.class) {
                        annotation = annotation2;
                        break;
                    }
                    i10++;
                }
                arrayList.add(new c(this, aVar.kind(), aVar.pattern(), annotation, aVar.annotation()));
            }
        }
        if (d0().b0()) {
            arrayList.addAll(Arrays.asList(d0().N()));
        }
        DeclareAnnotation[] declareAnnotationArr = new DeclareAnnotation[arrayList.size()];
        arrayList.toArray(declareAnnotationArr);
        return declareAnnotationArr;
    }

    @Override // zj.c
    public v[] O() {
        v[] vVarArr = this.f137600d;
        if (vVarArr != null) {
            return vVarArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Method method : this.f137598b.getMethods()) {
            v vVarK0 = k0(method);
            if (vVarK0 != null) {
                arrayList.add(vVarK0);
            }
        }
        v[] vVarArr2 = new v[arrayList.size()];
        arrayList.toArray(vVarArr2);
        this.f137600d = vVarArr2;
        return vVarArr2;
    }

    @Override // zj.c
    public Method P(String str, zj.c<?>... cVarArr) throws NoSuchMethodException {
        Method method = this.f137598b.getMethod(str, r0(cVarArr));
        if (p0(method)) {
            return method;
        }
        throw new NoSuchMethodException(str);
    }

    @Override // zj.c
    public boolean Q() {
        return this.f137598b.isMemberClass() && b0();
    }

    @Override // zj.c
    public zj.q R(String str, zj.c<?> cVar, zj.c<?>... cVarArr) throws NoSuchMethodException {
        for (zj.q qVar : w()) {
            try {
                if (qVar.getName().equals(str) && qVar.g().equals(cVar)) {
                    zj.c<?>[] cVarArrC = qVar.c();
                    if (cVarArrC.length == cVarArr.length) {
                        for (int i10 = 0; i10 < cVarArrC.length; i10++) {
                            if (cVarArrC[i10].equals(cVarArr[i10])) {
                            }
                        }
                        return qVar;
                    }
                    continue;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        throw new NoSuchMethodException(str);
    }

    @Override // zj.c
    public zj.j[] S() {
        ArrayList arrayList = new ArrayList();
        if (this.f137598b.isAnnotationPresent(xj.l.class)) {
            arrayList.add(new f(((xj.l) this.f137598b.getAnnotation(xj.l.class)).value(), this));
        }
        for (Method method : this.f137598b.getDeclaredMethods()) {
            if (method.isAnnotationPresent(wj.d.class)) {
                arrayList.add(new f(((wj.d) method.getAnnotation(wj.d.class)).value(), this));
            }
        }
        if (d0().b0()) {
            arrayList.addAll(Arrays.asList(d0().S()));
        }
        zj.j[] jVarArr = new zj.j[arrayList.size()];
        arrayList.toArray(jVarArr);
        return jVarArr;
    }

    @Override // zj.c
    public zj.a T(String str) throws NoSuchAdviceException {
        if (str.equals("")) {
            throw new IllegalArgumentException("use getAdvice(AdviceType...) instead for un-named advice");
        }
        if (this.f137602f == null) {
            n0();
        }
        for (zj.a aVar : this.f137602f) {
            if (aVar.getName().equals(str)) {
                return aVar;
            }
        }
        throw new NoSuchAdviceException(str);
    }

    @Override // zj.c
    public zj.n U(zj.c<?> cVar, zj.c<?>... cVarArr) throws NoSuchMethodException {
        for (zj.n nVar : f()) {
            try {
                if (nVar.g().equals(cVar)) {
                    zj.c<?>[] cVarArrC = nVar.c();
                    if (cVarArrC.length == cVarArr.length) {
                        for (int i10 = 0; i10 < cVarArrC.length; i10++) {
                            if (cVarArrC[i10].equals(cVarArr[i10])) {
                            }
                        }
                        return nVar;
                    }
                    continue;
                } else {
                    continue;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        throw new NoSuchMethodException();
    }

    @Override // zj.c
    public Package V() {
        return this.f137598b.getPackage();
    }

    @Override // zj.c
    public zj.c<?> W() {
        Class<?> enclosingClass = this.f137598b.getEnclosingClass();
        if (enclosingClass != null) {
            return new b(enclosingClass);
        }
        return null;
    }

    @Override // zj.c
    public zj.a[] X(AdviceKind... adviceKindArr) {
        EnumSet enumSetAllOf;
        if (adviceKindArr.length == 0) {
            enumSetAllOf = EnumSet.allOf(AdviceKind.class);
        } else {
            EnumSet enumSetNoneOf = EnumSet.noneOf(AdviceKind.class);
            enumSetNoneOf.addAll(Arrays.asList(adviceKindArr));
            enumSetAllOf = enumSetNoneOf;
        }
        return l0(enumSetAllOf);
    }

    @Override // zj.c
    public zj.p Y(String str, zj.c<?> cVar) throws NoSuchFieldException {
        for (zj.p pVar : A()) {
            if (pVar.getName().equals(str)) {
                try {
                    if (pVar.g().equals(cVar)) {
                        return pVar;
                    }
                } catch (ClassNotFoundException unused) {
                    continue;
                }
            }
        }
        throw new NoSuchFieldException(str);
    }

    @Override // zj.c
    public Field Z(String str) throws NoSuchFieldException {
        Field field = this.f137598b.getField(str);
        if (field.getName().startsWith(f137597m)) {
            throw new NoSuchFieldException(str);
        }
        return field;
    }

    @Override // zj.c
    public zj.c<?> a() {
        Class<?> declaringClass = this.f137598b.getDeclaringClass();
        if (declaringClass != null) {
            return new b(declaringClass);
        }
        return null;
    }

    @Override // zj.c
    public Method a0() {
        return this.f137598b.getEnclosingMethod();
    }

    @Override // zj.c
    public Method[] b() {
        Method[] methods = this.f137598b.getMethods();
        ArrayList arrayList = new ArrayList();
        for (Method method : methods) {
            if (p0(method)) {
                arrayList.add(method);
            }
        }
        Method[] methodArr = new Method[arrayList.size()];
        arrayList.toArray(methodArr);
        return methodArr;
    }

    @Override // zj.c
    public boolean b0() {
        return this.f137598b.getAnnotation(xj.f.class) != null;
    }

    @Override // zj.c
    public zj.c<?>[] c() {
        return q0(this.f137598b.getDeclaredClasses());
    }

    @Override // zj.c
    public zj.a c0(String str) throws NoSuchAdviceException {
        if (str.equals("")) {
            throw new IllegalArgumentException("use getAdvice(AdviceType...) instead for un-named advice");
        }
        if (this.f137601e == null) {
            o0();
        }
        for (zj.a aVar : this.f137601e) {
            if (aVar.getName().equals(str)) {
                return aVar;
            }
        }
        throw new NoSuchAdviceException(str);
    }

    @Override // zj.c
    public Field d(String str) throws NoSuchFieldException {
        Field declaredField = this.f137598b.getDeclaredField(str);
        if (declaredField.getName().startsWith(f137597m)) {
            throw new NoSuchFieldException(str);
        }
        return declaredField;
    }

    @Override // zj.c
    public zj.c<? super T> d0() {
        Class<? super T> superclass = this.f137598b.getSuperclass();
        if (superclass == null) {
            return null;
        }
        return new b(superclass);
    }

    @Override // zj.c
    public zj.q e(String str, zj.c<?> cVar, zj.c<?>... cVarArr) throws NoSuchMethodException {
        for (zj.q qVar : B()) {
            try {
                if (qVar.getName().equals(str) && qVar.g().equals(cVar)) {
                    zj.c<?>[] cVarArrC = qVar.c();
                    if (cVarArrC.length == cVarArr.length) {
                        for (int i10 = 0; i10 < cVarArrC.length; i10++) {
                            if (cVarArrC[i10].equals(cVarArr[i10])) {
                            }
                        }
                        return qVar;
                    }
                    continue;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        throw new NoSuchMethodException(str);
    }

    @Override // zj.c
    public Constructor e0(zj.c<?>... cVarArr) throws NoSuchMethodException {
        return this.f137598b.getDeclaredConstructor(r0(cVarArr));
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f137598b.equals(this.f137598b);
        }
        return false;
    }

    @Override // zj.c
    public zj.n[] f() {
        if (this.f137607k == null) {
            ArrayList arrayList = new ArrayList();
            for (Method method : this.f137598b.getMethods()) {
                if (method.getName().contains("ajc$postInterConstructor") && method.isAnnotationPresent(wj.f.class)) {
                    wj.f fVar = (wj.f) method.getAnnotation(wj.f.class);
                    if (Modifier.isPublic(fVar.modifiers())) {
                        arrayList.add(new h(this, fVar.targetType(), fVar.modifiers(), method));
                    }
                }
            }
            zj.n[] nVarArr = new zj.n[arrayList.size()];
            this.f137607k = nVarArr;
            arrayList.toArray(nVarArr);
        }
        return this.f137607k;
    }

    @Override // zj.c
    public zj.h[] f0() {
        ArrayList arrayList = new ArrayList();
        for (Field field : this.f137598b.getDeclaredFields()) {
            try {
                if (field.isAnnotationPresent(xj.m.class)) {
                    xj.m mVar = (xj.m) field.getAnnotation(xj.m.class);
                    if (Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers())) {
                        arrayList.add(new d(mVar.value(), (String) field.get(null), false, this));
                    }
                } else if (field.isAnnotationPresent(xj.i.class)) {
                    xj.i iVar = (xj.i) field.getAnnotation(xj.i.class);
                    if (Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers())) {
                        arrayList.add(new d(iVar.value(), (String) field.get(null), true, this));
                    }
                }
            } catch (IllegalAccessException | IllegalArgumentException unused) {
            }
        }
        for (Method method : this.f137598b.getDeclaredMethods()) {
            if (method.isAnnotationPresent(wj.b.class)) {
                wj.b bVar = (wj.b) method.getAnnotation(wj.b.class);
                arrayList.add(new d(bVar.pointcut(), bVar.message(), bVar.isError(), this));
            }
        }
        zj.h[] hVarArr = new zj.h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return hVarArr;
    }

    @Override // zj.c
    public zj.p g(String str, zj.c<?> cVar) throws NoSuchFieldException {
        for (zj.p pVar : v()) {
            if (pVar.getName().equals(str)) {
                try {
                    if (pVar.g().equals(cVar)) {
                        return pVar;
                    }
                } catch (ClassNotFoundException unused) {
                    continue;
                }
            }
        }
        throw new NoSuchFieldException(str);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f137598b.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getAnnotations() {
        return this.f137598b.getAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getDeclaredAnnotations() {
        return this.f137598b.getDeclaredAnnotations();
    }

    @Override // zj.c
    public int getModifiers() {
        return this.f137598b.getModifiers();
    }

    @Override // zj.c
    public String getName() {
        return this.f137598b.getName();
    }

    @Override // zj.c
    public TypeVariable<Class<T>>[] getTypeParameters() {
        return this.f137598b.getTypeParameters();
    }

    @Override // zj.c
    public Constructor[] h() {
        return this.f137598b.getConstructors();
    }

    public int hashCode() {
        return this.f137598b.hashCode();
    }

    @Override // zj.c
    public boolean i() {
        return this.f137598b.isMemberClass() && !b0();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.f137598b.isAnnotationPresent(cls);
    }

    @Override // zj.c
    public boolean isArray() {
        return this.f137598b.isArray();
    }

    @Override // zj.c
    public boolean isPrimitive() {
        return this.f137598b.isPrimitive();
    }

    @Override // zj.c
    public Field[] j() {
        Field[] fields = this.f137598b.getFields();
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (!field.getName().startsWith(f137597m) && !field.isAnnotationPresent(xj.m.class) && !field.isAnnotationPresent(xj.i.class)) {
                arrayList.add(field);
            }
        }
        Field[] fieldArr = new Field[arrayList.size()];
        arrayList.toArray(fieldArr);
        return fieldArr;
    }

    @Override // zj.c
    public v k(String str) throws NoSuchPointcutException {
        for (v vVar : O()) {
            if (vVar.getName().equals(str)) {
                return vVar;
            }
        }
        throw new NoSuchPointcutException(str);
    }

    @Override // zj.c
    public zj.c<?>[] l() {
        return q0(this.f137598b.getInterfaces());
    }

    @Override // zj.c
    public boolean m() {
        return this.f137598b.isEnum();
    }

    @Override // zj.c
    public boolean n() {
        return this.f137598b.isInterface();
    }

    @Override // zj.c
    public zj.a[] o(AdviceKind... adviceKindArr) {
        EnumSet enumSetAllOf;
        if (adviceKindArr.length == 0) {
            enumSetAllOf = EnumSet.allOf(AdviceKind.class);
        } else {
            EnumSet enumSetNoneOf = EnumSet.noneOf(AdviceKind.class);
            enumSetNoneOf.addAll(Arrays.asList(adviceKindArr));
            enumSetAllOf = enumSetNoneOf;
        }
        return m0(enumSetAllOf);
    }

    @Override // zj.c
    public zj.c<?>[] p() {
        return q0(this.f137598b.getClasses());
    }

    @Override // zj.c
    public Field[] q() {
        Field[] declaredFields = this.f137598b.getDeclaredFields();
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if (!field.getName().startsWith(f137597m) && !field.isAnnotationPresent(xj.m.class) && !field.isAnnotationPresent(xj.i.class)) {
                arrayList.add(field);
            }
        }
        Field[] fieldArr = new Field[arrayList.size()];
        arrayList.toArray(fieldArr);
        return fieldArr;
    }

    @Override // zj.c
    public zj.k[] r() {
        ArrayList arrayList = new ArrayList();
        for (Method method : this.f137598b.getDeclaredMethods()) {
            if (method.isAnnotationPresent(wj.e.class)) {
                wj.e eVar = (wj.e) method.getAnnotation(wj.e.class);
                arrayList.add(new g(this, eVar.pointcut(), eVar.exceptionType()));
            }
        }
        if (d0().b0()) {
            arrayList.addAll(Arrays.asList(d0().r()));
        }
        zj.k[] kVarArr = new zj.k[arrayList.size()];
        arrayList.toArray(kVarArr);
        return kVarArr;
    }

    @Override // zj.c
    public boolean s() {
        return b0() && this.f137598b.isAnnotationPresent(wj.g.class);
    }

    @Override // zj.c
    public Constructor t() {
        return this.f137598b.getEnclosingConstructor();
    }

    public String toString() {
        return getName();
    }

    @Override // zj.c
    public boolean u(Object obj) {
        return this.f137598b.isInstance(obj);
    }

    @Override // zj.c
    public zj.p[] v() {
        List<zj.p> arrayList = new ArrayList<>();
        if (this.f137606j == null) {
            for (Method method : this.f137598b.getMethods()) {
                if (method.isAnnotationPresent(wj.f.class)) {
                    wj.f fVar = (wj.f) method.getAnnotation(wj.f.class);
                    if (method.getName().contains("ajc$interFieldInit") && Modifier.isPublic(fVar.modifiers())) {
                        try {
                            Method declaredMethod = method.getDeclaringClass().getDeclaredMethod(method.getName().replace("FieldInit", "FieldGetDispatch"), method.getParameterTypes());
                            arrayList.add(new j(this, fVar.targetType(), fVar.modifiers(), fVar.name(), zj.d.a(declaredMethod.getReturnType()), declaredMethod.getGenericReturnType()));
                        } catch (NoSuchMethodException unused) {
                            throw new IllegalStateException("Can't find field get dispatch method for " + method.getName());
                        }
                    }
                }
            }
            h0(arrayList, true);
            zj.p[] pVarArr = new zj.p[arrayList.size()];
            this.f137606j = pVarArr;
            arrayList.toArray(pVarArr);
        }
        return this.f137606j;
    }

    @Override // zj.c
    public zj.q[] w() {
        if (this.f137604h == null) {
            List<zj.q> arrayList = new ArrayList<>();
            for (Method method : this.f137598b.getDeclaredMethods()) {
                if (method.getName().contains("ajc$interMethod$") && method.isAnnotationPresent(wj.f.class)) {
                    wj.f fVar = (wj.f) method.getAnnotation(wj.f.class);
                    if (Modifier.isPublic(fVar.modifiers())) {
                        arrayList.add(new k(this, fVar.targetType(), fVar.modifiers(), fVar.name(), method));
                    }
                }
            }
            i0(arrayList, true);
            zj.q[] qVarArr = new zj.q[arrayList.size()];
            this.f137604h = qVarArr;
            arrayList.toArray(qVarArr);
        }
        return this.f137604h;
    }

    @Override // zj.c
    public boolean x() {
        return this.f137598b.isLocalClass() && !b0();
    }

    @Override // zj.c
    public zj.i[] y() {
        List<zj.i> arrayList = new ArrayList<>();
        for (Method method : this.f137598b.getDeclaredMethods()) {
            if (method.isAnnotationPresent(wj.c.class)) {
                wj.c cVar = (wj.c) method.getAnnotation(wj.c.class);
                arrayList.add(new e(cVar.targetTypePattern(), cVar.parentTypes(), cVar.isExtends(), this));
            }
        }
        g0(arrayList);
        if (d0().b0()) {
            arrayList.addAll(Arrays.asList(d0().y()));
        }
        zj.i[] iVarArr = new zj.i[arrayList.size()];
        arrayList.toArray(iVarArr);
        return iVarArr;
    }

    @Override // zj.c
    public Method[] z() {
        Method[] declaredMethods = this.f137598b.getDeclaredMethods();
        ArrayList arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            if (p0(method)) {
                arrayList.add(method);
            }
        }
        Method[] methodArr = new Method[arrayList.size()];
        arrayList.toArray(methodArr);
        return methodArr;
    }
}
