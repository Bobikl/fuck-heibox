package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements kotlin.reflect.l {
    public MutablePropertyReference1() {
    }

    @kotlin.u0(version = "1.1")
    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    @kotlin.u0(version = "1.4")
    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.c computeReflected() {
        return n0.k(this);
    }

    @Override // kotlin.reflect.p
    @kotlin.u0(version = "1.1")
    public Object e0(Object obj) {
        return ((kotlin.reflect.l) getReflected()).e0(obj);
    }

    @Override // kotlin.reflect.n
    public kotlin.reflect.p.a getGetter() {
        return ((kotlin.reflect.l) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.j
    public kotlin.reflect.l.a getSetter() {
        return ((kotlin.reflect.l) getReflected()).getSetter();
    }

    @Override // yh.l
    public Object invoke(Object obj) {
        return get(obj);
    }
}
