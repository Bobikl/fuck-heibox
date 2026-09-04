package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes5.dex */
public class FunctionReference extends CallableReference implements b0, kotlin.reflect.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f124882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @kotlin.u0(version = "1.4")
    private final int f124883c;

    public FunctionReference(int i10) {
        this(i10, CallableReference.NO_RECEIVER, null, null, null, 0);
    }

    @kotlin.u0(version = "1.1")
    public FunctionReference(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    @kotlin.u0(version = "1.4")
    public FunctionReference(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.f124882b = i10;
        this.f124883c = i11 >> 1;
    }

    @Override // kotlin.reflect.i
    @kotlin.u0(version = "1.1")
    public boolean B() {
        return getReflected().B();
    }

    @Override // kotlin.reflect.i
    @kotlin.u0(version = "1.1")
    public boolean K() {
        return getReflected().K();
    }

    @Override // kotlin.reflect.i
    @kotlin.u0(version = "1.1")
    public boolean U() {
        return getReflected().U();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.CallableReference
    @kotlin.u0(version = "1.1")
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.i getReflected() {
        return (kotlin.reflect.i) super.getReflected();
    }

    @Override // kotlin.jvm.internal.CallableReference
    @kotlin.u0(version = "1.1")
    protected kotlin.reflect.c computeReflected() {
        return n0.c(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.f124883c == functionReference.f124883c && this.f124882b == functionReference.f124882b && f0.g(getBoundReceiver(), functionReference.getBoundReceiver()) && f0.g(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof kotlin.reflect.i) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.reflect.i
    @kotlin.u0(version = "1.1")
    public boolean g() {
        return getReflected().g();
    }

    @Override // kotlin.jvm.internal.b0
    public int getArity() {
        return this.f124882b;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.c
    @kotlin.u0(version = "1.1")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        kotlin.reflect.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
