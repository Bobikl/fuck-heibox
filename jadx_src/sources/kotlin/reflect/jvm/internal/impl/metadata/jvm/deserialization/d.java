package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: JvmMemberSignature.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d {

    /* JADX INFO: compiled from: JvmMemberSignature.kt */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final String f127164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final String f127165b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d String name, @dl.d String desc) {
            super(null);
            f0.p(name, "name");
            f0.p(desc, "desc");
            this.f127164a = name;
            this.f127165b = desc;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        @dl.d
        public String a() {
            return c() + ':' + b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        @dl.d
        public String b() {
            return this.f127165b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        @dl.d
        public String c() {
            return this.f127164a;
        }

        @dl.d
        public final String d() {
            return c();
        }

        @dl.d
        public final String e() {
            return b();
        }

        public boolean equals(@dl.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return f0.g(c(), aVar.c()) && f0.g(b(), aVar.b());
        }

        public int hashCode() {
            return (c().hashCode() * 31) + b().hashCode();
        }
    }

    /* JADX INFO: compiled from: JvmMemberSignature.kt */
    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final String f127166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final String f127167b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@dl.d String name, @dl.d String desc) {
            super(null);
            f0.p(name, "name");
            f0.p(desc, "desc");
            this.f127166a = name;
            this.f127167b = desc;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        @dl.d
        public String a() {
            return c() + b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        @dl.d
        public String b() {
            return this.f127167b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        @dl.d
        public String c() {
            return this.f127166a;
        }

        public boolean equals(@dl.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return f0.g(c(), bVar.c()) && f0.g(b(), bVar.b());
        }

        public int hashCode() {
            return (c().hashCode() * 31) + b().hashCode();
        }
    }

    private d() {
    }

    public /* synthetic */ d(u uVar) {
        this();
    }

    @dl.d
    public abstract String a();

    @dl.d
    public abstract String b();

    @dl.d
    public abstract String c();

    @dl.d
    public final String toString() {
        return a();
    }
}
