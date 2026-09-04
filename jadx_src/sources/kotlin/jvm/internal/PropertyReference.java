package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class PropertyReference extends CallableReference implements kotlin.reflect.n {
    public PropertyReference() {
    }

    @kotlin.u0(version = "1.1")
    public PropertyReference(Object obj) {
        super(obj);
    }

    @kotlin.u0(version = "1.4")
    public PropertyReference(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            return getOwner().equals(propertyReference.getOwner()) && getName().equals(propertyReference.getName()) && getSignature().equals(propertyReference.getSignature()) && f0.g(getBoundReceiver(), propertyReference.getBoundReceiver());
        }
        if (obj instanceof kotlin.reflect.n) {
            return obj.equals(compute());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.CallableReference
    @kotlin.u0(version = "1.1")
    public kotlin.reflect.n getReflected() {
        return (kotlin.reflect.n) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.reflect.n
    @kotlin.u0(version = "1.1")
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // kotlin.reflect.n
    @kotlin.u0(version = "1.1")
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        kotlin.reflect.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
