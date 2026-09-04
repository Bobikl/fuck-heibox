package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: typeQualifiers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f126391e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final d f126392f = new d(null, null, false, false, 8, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final NullabilityQualifier f126393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final MutabilityQualifier f126394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f126395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f126396d;

    /* JADX INFO: compiled from: typeQualifiers.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final d a() {
            return d.f126392f;
        }
    }

    public d(@dl.e NullabilityQualifier nullabilityQualifier, @dl.e MutabilityQualifier mutabilityQualifier, boolean z10, boolean z11) {
        this.f126393a = nullabilityQualifier;
        this.f126394b = mutabilityQualifier;
        this.f126395c = z10;
        this.f126396d = z11;
    }

    public /* synthetic */ d(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z10, boolean z11, int i10, u uVar) {
        this(nullabilityQualifier, mutabilityQualifier, z10, (i10 & 8) != 0 ? false : z11);
    }

    public final boolean b() {
        return this.f126395c;
    }

    @dl.e
    public final MutabilityQualifier c() {
        return this.f126394b;
    }

    @dl.e
    public final NullabilityQualifier d() {
        return this.f126393a;
    }

    public final boolean e() {
        return this.f126396d;
    }
}
