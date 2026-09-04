package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class MutablePropertyReference2 extends MutablePropertyReference implements kotlin.reflect.m {
    public MutablePropertyReference2() {
    }

    @kotlin.u0(version = "1.4")
    public MutablePropertyReference2(Class cls, String str, String str2, int i10) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.reflect.q
    @kotlin.u0(version = "1.1")
    public Object Q0(Object obj, Object obj2) {
        return ((kotlin.reflect.m) getReflected()).Q0(obj, obj2);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.c computeReflected() {
        return n0.l(this);
    }

    @Override // kotlin.reflect.n
    public kotlin.reflect.q.a getGetter() {
        return ((kotlin.reflect.m) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.j
    public kotlin.reflect.m.a getSetter() {
        return ((kotlin.reflect.m) getReflected()).getSetter();
    }

    @Override // yh.p
    public Object invoke(Object obj, Object obj2) {
        return Y(obj, obj2);
    }
}
