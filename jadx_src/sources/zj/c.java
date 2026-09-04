package zj;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import org.aspectj.lang.reflect.AdviceKind;
import org.aspectj.lang.reflect.DeclareAnnotation;
import org.aspectj.lang.reflect.NoSuchAdviceException;
import org.aspectj.lang.reflect.NoSuchPointcutException;

/* JADX INFO: compiled from: AjType.java */
/* JADX INFO: loaded from: classes5.dex */
public interface c<T> extends Type, AnnotatedElement {
    p[] A();

    q[] B();

    v C(String str) throws NoSuchPointcutException;

    n D(c<?> cVar, c<?>... cVarArr) throws NoSuchMethodException;

    T[] E();

    Constructor[] F();

    Type G();

    u H();

    v[] I();

    Class<T> J();

    Method K(String str, c<?>... cVarArr) throws NoSuchMethodException;

    Constructor L(c<?>... cVarArr) throws NoSuchMethodException;

    n[] M();

    DeclareAnnotation[] N();

    v[] O();

    Method P(String str, c<?>... cVarArr) throws NoSuchMethodException;

    boolean Q();

    q R(String str, c<?> cVar, c<?>... cVarArr) throws NoSuchMethodException;

    j[] S();

    a T(String str) throws NoSuchAdviceException;

    n U(c<?> cVar, c<?>... cVarArr) throws NoSuchMethodException;

    Package V();

    c<?> W();

    a[] X(AdviceKind... adviceKindArr);

    p Y(String str, c<?> cVar) throws NoSuchFieldException;

    Field Z(String str) throws NoSuchFieldException;

    c<?> a();

    Method a0();

    Method[] b();

    boolean b0();

    c<?>[] c();

    a c0(String str) throws NoSuchAdviceException;

    Field d(String str) throws NoSuchFieldException;

    c<?> d0();

    q e(String str, c<?> cVar, c<?>... cVarArr) throws NoSuchMethodException;

    Constructor e0(c<?>... cVarArr) throws NoSuchMethodException;

    n[] f();

    h[] f0();

    p g(String str, c<?> cVar) throws NoSuchFieldException;

    int getModifiers();

    String getName();

    TypeVariable<Class<T>>[] getTypeParameters();

    Constructor[] h();

    boolean i();

    boolean isArray();

    boolean isPrimitive();

    Field[] j();

    v k(String str) throws NoSuchPointcutException;

    c<?>[] l();

    boolean m();

    boolean n();

    a[] o(AdviceKind... adviceKindArr);

    c<?>[] p();

    Field[] q();

    k[] r();

    boolean s();

    Constructor t();

    boolean u(Object obj);

    p[] v();

    q[] w();

    boolean x();

    i[] y();

    Method[] z();
}
