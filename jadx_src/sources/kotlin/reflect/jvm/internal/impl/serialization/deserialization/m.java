package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: compiled from: ErrorReporter.java */
/* JADX INFO: loaded from: classes5.dex */
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f127887a = new a();

    /* JADX INFO: compiled from: ErrorReporter.java */
    public static final class a implements m {
        a() {
        }

        private static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = org.apache.tools.ant.taskdefs.optional.ejb.g.d.f134964e;
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i10 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.m
        public void a(@dl.d CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor == null) {
                c(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.m
        public void b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d List<String> list) {
            if (dVar == null) {
                c(0);
            }
            if (list == null) {
                c(1);
            }
        }
    }

    void a(@dl.d CallableMemberDescriptor callableMemberDescriptor);

    void b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d List<String> list);
}
