package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.types.j0;

/* JADX INFO: compiled from: ImplicitClassReceiver.kt */
/* JADX INFO: loaded from: classes5.dex */
public class e implements g, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.d f127649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final e f127650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.d f127651c;

    public e(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d classDescriptor, @dl.e e eVar) {
        f0.p(classDescriptor, "classDescriptor");
        this.f127649a = classDescriptor;
        this.f127650b = eVar == null ? this : eVar;
        this.f127651c = classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h
    @dl.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public j0 getType() {
        j0 j0VarV = this.f127649a.v();
        f0.o(j0VarV, "classDescriptor.defaultType");
        return j0VarV;
    }

    public boolean equals(@dl.e Object obj) {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = this.f127649a;
        e eVar = obj instanceof e ? (e) obj : null;
        return f0.g(dVar, eVar != null ? eVar.f127649a : null);
    }

    public int hashCode() {
        return this.f127649a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.j
    @dl.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.d o() {
        return this.f127649a;
    }

    @dl.d
    public String toString() {
        return "Class{" + getType() + '}';
    }
}
