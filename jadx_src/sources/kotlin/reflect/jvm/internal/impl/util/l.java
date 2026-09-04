package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final l f128244a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f128245b = "should not have varargs or parameters with default values";

    private l() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @dl.e
    public String a(@dl.d w wVar) {
        return f.a.a(this, wVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    public boolean b(@dl.d w functionDescriptor) {
        f0.p(functionDescriptor, "functionDescriptor");
        List<b1> listI = functionDescriptor.i();
        f0.o(listI, "functionDescriptor.valueParameters");
        if (!(listI instanceof Collection) || !listI.isEmpty()) {
            for (b1 it : listI) {
                f0.o(it, "it");
                if (!(!DescriptorUtilsKt.c(it) && it.F0() == null)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @dl.d
    public String getDescription() {
        return f128245b;
    }
}
