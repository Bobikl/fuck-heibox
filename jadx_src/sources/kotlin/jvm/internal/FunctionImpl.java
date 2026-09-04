package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.DeprecationLevel;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.k(level = DeprecationLevel.ERROR, message = "This class is no longer supported, do not use it.")
@Deprecated
public abstract class FunctionImpl implements kotlin.u, Serializable, yh.a, yh.l, yh.p, yh.q, yh.r, yh.s, yh.t, yh.u, yh.v, yh.w, yh.b, yh.c, yh.d, yh.e, yh.f, yh.g, yh.h, yh.i, yh.j, yh.k, yh.m, yh.n, yh.o {
    private void a(int i10) {
        if (getArity() != i10) {
            c(i10);
        }
    }

    private void c(int i10) {
        throw new IllegalStateException("Wrong function arity, expected: " + i10 + ", actual: " + getArity());
    }

    @Override // yh.d
    public Object A0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        a(12);
        return b(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    @Override // yh.k
    public Object B0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19) {
        a(19);
        return b(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    @Override // yh.h
    public Object C0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        a(16);
        return b(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    @Override // yh.w
    public Object H1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        a(9);
        return b(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    @Override // yh.b
    public Object L1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        a(10);
        return b(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @Override // yh.s
    public Object N0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        a(5);
        return b(obj, obj2, obj3, obj4, obj5);
    }

    @Override // yh.n
    public Object O0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        a(21);
        return b(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    @Override // yh.r
    public Object U0(Object obj, Object obj2, Object obj3, Object obj4) {
        a(4);
        return b(obj, obj2, obj3, obj4);
    }

    @Override // yh.v
    public Object V0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        a(8);
        return b(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // yh.o
    public Object X0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22) {
        a(22);
        return b(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }

    @Override // yh.t
    public Object Z0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        a(6);
        return b(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // yh.f
    public Object a1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        a(14);
        return b(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    public Object b(Object... objArr) {
        throw new UnsupportedOperationException();
    }

    @Override // yh.i
    public Object b1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        a(17);
        return b(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    @Override // yh.c
    public Object d0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        a(11);
        return b(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    @Override // yh.u
    public Object g1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        a(7);
        return b(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public abstract int getArity();

    @Override // yh.a
    public Object invoke() {
        a(0);
        return b(new Object[0]);
    }

    @Override // yh.l
    public Object invoke(Object obj) {
        a(1);
        return b(obj);
    }

    @Override // yh.p
    public Object invoke(Object obj, Object obj2) {
        a(2);
        return b(obj, obj2);
    }

    @Override // yh.q
    public Object invoke(Object obj, Object obj2, Object obj3) {
        a(3);
        return b(obj, obj2, obj3);
    }

    @Override // yh.m
    public Object l0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20) {
        a(20);
        return b(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    @Override // yh.g
    public Object m1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        a(15);
        return b(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    @Override // yh.e
    public Object n0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        a(13);
        return b(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    @Override // yh.j
    public Object t1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
        a(18);
        return b(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }
}
