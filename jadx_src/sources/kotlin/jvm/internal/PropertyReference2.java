package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class PropertyReference2 extends PropertyReference implements kotlin.reflect.q {
    public PropertyReference2() {
    }

    @kotlin.u0(version = "1.4")
    public PropertyReference2(Class cls, String str, String str2, int i10) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.reflect.q
    @kotlin.u0(version = "1.1")
    public Object Q0(Object obj, Object obj2) {
        return ((kotlin.reflect.q) getReflected()).Q0(obj, obj2);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.c computeReflected() {
        return n0.v(this);
    }

    @Override // kotlin.reflect.n
    public kotlin.reflect.q.a getGetter() {
        return ((kotlin.reflect.q) getReflected()).getGetter();
    }

    @Override // yh.p
    public Object invoke(Object obj, Object obj2) {
        return Y(obj, obj2);
    }
}
