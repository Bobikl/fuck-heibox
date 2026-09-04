package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e implements mi.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f125914b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final kotlin.reflect.jvm.internal.impl.name.f f125915a;

    /* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final e a(@dl.d Object value, @dl.e kotlin.reflect.jvm.internal.impl.name.f fVar) {
            f0.p(value, "value");
            if (ReflectClassUtilKt.h(value.getClass())) {
                return new o(fVar, (Enum) value);
            }
            if (value instanceof Annotation) {
                return new f(fVar, (Annotation) value);
            }
            if (value instanceof Object[]) {
                return new i(fVar, (Object[]) value);
            }
            return value instanceof Class ? new k(fVar, (Class) value) : new q(fVar, value);
        }
    }

    private e(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        this.f125915a = fVar;
    }

    public /* synthetic */ e(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.jvm.internal.u uVar) {
        this(fVar);
    }

    @Override // mi.b
    @dl.e
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        return this.f125915a;
    }
}
