package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j extends g<b2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f127536b = new a(null);

    /* JADX INFO: compiled from: constantValues.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final j a(@dl.d String message) {
            f0.p(message, "message");
            return new b(message);
        }
    }

    /* JADX INFO: compiled from: constantValues.kt */
    public static final class b extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final String f127537c;

        public b(@dl.d String message) {
            f0.p(message, "message");
            this.f127537c = message;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
        @dl.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.types.error.f a(@dl.d d0 module) {
            f0.p(module, "module");
            return kotlin.reflect.jvm.internal.impl.types.error.h.d(ErrorTypeKind.ERROR_CONSTANT_VALUE, this.f127537c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
        @dl.d
        public String toString() {
            return this.f127537c;
        }
    }

    public j() {
        super(b2.f124493a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @dl.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b2 b() {
        throw new UnsupportedOperationException();
    }
}
