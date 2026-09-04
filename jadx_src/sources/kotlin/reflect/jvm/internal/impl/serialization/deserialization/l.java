package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* JADX INFO: compiled from: DeserializedPackageFragment.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class l extends kotlin.reflect.jvm.internal.impl.descriptors.impl.w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.m f127886h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName, @dl.d kotlin.reflect.jvm.internal.impl.storage.m storageManager, @dl.d d0 module) {
        super(module, fqName);
        f0.p(fqName, "fqName");
        f0.p(storageManager, "storageManager");
        f0.p(module, "module");
        this.f127886h = storageManager;
    }

    @dl.d
    public abstract f K0();

    public boolean L0(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
        f0.p(name, "name");
        MemberScope memberScopeU = u();
        return (memberScopeU instanceof DeserializedMemberScope) && ((DeserializedMemberScope) memberScopeU).r().contains(name);
    }

    public abstract void M0(@dl.d h hVar);
}
