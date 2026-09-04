package kotlin.jvm.internal;

import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: localVariableReferences.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.u0(version = "1.1")
public class LocalVariableReference extends PropertyReference0 {
    @Override // kotlin.reflect.o
    @dl.e
    public Object get() {
        h0.b();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.jvm.internal.CallableReference
    @dl.d
    public kotlin.reflect.h getOwner() {
        h0.b();
        throw new KotlinNothingValueException();
    }
}
