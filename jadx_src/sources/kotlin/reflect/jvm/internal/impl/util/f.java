package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface f {

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class a {
        @dl.e
        public static String a(@dl.d f fVar, @dl.d w functionDescriptor) {
            f0.p(functionDescriptor, "functionDescriptor");
            if (fVar.b(functionDescriptor)) {
                return null;
            }
            return fVar.getDescription();
        }
    }

    @dl.e
    String a(@dl.d w wVar);

    boolean b(@dl.d w wVar);

    @dl.d
    String getDescription();
}
