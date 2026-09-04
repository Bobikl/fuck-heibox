package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;

/* JADX INFO: compiled from: MemberSignature.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f126558b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String f126559a;

    /* JADX INFO: compiled from: MemberSignature.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final r a(@dl.d String name, @dl.d String desc) {
            f0.p(name, "name");
            f0.p(desc, "desc");
            return new r(name + '#' + desc, null);
        }

        @dl.d
        @xh.m
        public final r b(@dl.d kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d signature) {
            f0.p(signature, "signature");
            if (signature instanceof kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b) {
                return d(signature.c(), signature.b());
            }
            if (signature instanceof kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.a) {
                return a(signature.c(), signature.b());
            }
            throw new NoWhenBranchMatchedException();
        }

        @dl.d
        @xh.m
        public final r c(@dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.d JvmProtoBuf.JvmMethodSignature signature) {
            f0.p(nameResolver, "nameResolver");
            f0.p(signature, "signature");
            return d(nameResolver.getString(signature.y()), nameResolver.getString(signature.x()));
        }

        @dl.d
        @xh.m
        public final r d(@dl.d String name, @dl.d String desc) {
            f0.p(name, "name");
            f0.p(desc, "desc");
            return new r(name + desc, null);
        }

        @dl.d
        @xh.m
        public final r e(@dl.d r signature, int i10) {
            f0.p(signature, "signature");
            return new r(signature.a() + '@' + i10, null);
        }
    }

    private r(String str) {
        this.f126559a = str;
    }

    public /* synthetic */ r(String str, kotlin.jvm.internal.u uVar) {
        this(str);
    }

    @dl.d
    public final String a() {
        return this.f126559a;
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && f0.g(this.f126559a, ((r) obj).f126559a);
    }

    public int hashCode() {
        return this.f126559a.hashCode();
    }

    @dl.d
    public String toString() {
        return "MemberSignature(signature=" + this.f126559a + ')';
    }
}
