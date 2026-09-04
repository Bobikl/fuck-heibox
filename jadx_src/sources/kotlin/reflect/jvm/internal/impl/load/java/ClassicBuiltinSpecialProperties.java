package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: compiled from: ClassicBuiltinSpecialProperties.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ClassicBuiltinSpecialProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final ClassicBuiltinSpecialProperties f125962a = new ClassicBuiltinSpecialProperties();

    private ClassicBuiltinSpecialProperties() {
    }

    private final boolean c(CallableMemberDescriptor callableMemberDescriptor) {
        if (CollectionsKt___CollectionsKt.R1(c.f126008a.c(), DescriptorUtilsKt.h(callableMemberDescriptor)) && callableMemberDescriptor.i().isEmpty()) {
            return true;
        }
        if (!kotlin.reflect.jvm.internal.impl.builtins.g.f0(callableMemberDescriptor)) {
            return false;
        }
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.f();
        f0.o(overriddenDescriptors, "overriddenDescriptors");
        if (!overriddenDescriptors.isEmpty()) {
            for (CallableMemberDescriptor it : overriddenDescriptors) {
                ClassicBuiltinSpecialProperties classicBuiltinSpecialProperties = f125962a;
                f0.o(it, "it");
                if (classicBuiltinSpecialProperties.b(it)) {
                    return true;
                }
            }
        }
        return false;
    }

    @dl.e
    public final String a(@dl.d CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.reflect.jvm.internal.impl.name.f fVar;
        f0.p(callableMemberDescriptor, "<this>");
        kotlin.reflect.jvm.internal.impl.builtins.g.f0(callableMemberDescriptor);
        CallableMemberDescriptor callableMemberDescriptorF = DescriptorUtilsKt.f(DescriptorUtilsKt.s(callableMemberDescriptor), false, new yh.l<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties$getBuiltinSpecialPropertyGetterName$descriptor$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d CallableMemberDescriptor it) {
                f0.p(it, "it");
                return Boolean.valueOf(ClassicBuiltinSpecialProperties.f125962a.b(it));
            }
        }, 1, null);
        if (callableMemberDescriptorF == null || (fVar = c.f126008a.a().get(DescriptorUtilsKt.l(callableMemberDescriptorF))) == null) {
            return null;
        }
        return fVar.b();
    }

    public final boolean b(@dl.d CallableMemberDescriptor callableMemberDescriptor) {
        f0.p(callableMemberDescriptor, "callableMemberDescriptor");
        if (c.f126008a.d().contains(callableMemberDescriptor.getName())) {
            return c(callableMemberDescriptor);
        }
        return false;
    }
}
