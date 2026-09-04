package androidx.window.sidecar;

import android.graphics.Rect;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: HardwareFoldingFeature.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002\u000b\u000fB\u001f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u001eR\u0014\u0010\"\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010!R\u0014\u0010%\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010$¨\u0006("}, d2 = {"Landroidx/window/layout/n;", "Landroidx/window/layout/m;", "", "toString", "", "other", "", "equals", "", "hashCode", "Landroidx/window/core/b;", ak.av, "Landroidx/window/core/b;", "featureBounds", "Landroidx/window/layout/n$b;", "b", "Landroidx/window/layout/n$b;", "d", "()Landroidx/window/layout/n$b;", "type", "Landroidx/window/layout/m$c;", ak.aF, "Landroidx/window/layout/m$c;", "getState", "()Landroidx/window/layout/m$c;", "state", "Landroid/graphics/Rect;", "getBounds", "()Landroid/graphics/Rect;", "bounds", "()Z", "isSeparating", "Landroidx/window/layout/m$a;", "()Landroidx/window/layout/m$a;", "occlusionType", "Landroidx/window/layout/m$b;", "()Landroidx/window/layout/m$b;", "orientation", "<init>", "(Landroidx/window/core/b;Landroidx/window/layout/n$b;Landroidx/window/layout/m$c;)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class n implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final androidx.window.core.b featureBounds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @d
    private final b type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d
    private final m.c state;

    /* JADX INFO: renamed from: androidx.window.layout.n$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: HardwareFoldingFeature.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/window/layout/n$a;", "", "Landroidx/window/core/b;", "bounds", "Lkotlin/b2;", ak.av, "(Landroidx/window/core/b;)V", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final void a(@d androidx.window.core.b bounds) {
            f0.p(bounds, "bounds");
            if (!((bounds.f() == 0 && bounds.b() == 0) ? false : true)) {
                throw new IllegalArgumentException("Bounds must be non zero".toString());
            }
            if (!(bounds.getLeft() == 0 || bounds.getTop() == 0)) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
            }
        }
    }

    /* JADX INFO: compiled from: HardwareFoldingFeature.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\u0004B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Landroidx/window/layout/n$b;", "", "", "toString", ak.av, "Ljava/lang/String;", "description", "<init>", "(Ljava/lang/String;)V", "b", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @d
        private static final b f28652c = new b("FOLD");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @d
        private static final b f28653d = new b("HINGE");

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d
        private final String description;

        /* JADX INFO: renamed from: androidx.window.layout.n$b$a, reason: from kotlin metadata */
        /* JADX INFO: compiled from: HardwareFoldingFeature.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/n$b$a;", "", "Landroidx/window/layout/n$b;", "FOLD", "Landroidx/window/layout/n$b;", ak.av, "()Landroidx/window/layout/n$b;", "HINGE", "b", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(u uVar) {
                this();
            }

            @d
            public final b a() {
                return b.f28652c;
            }

            @d
            public final b b() {
                return b.f28653d;
            }
        }

        private b(String str) {
            this.description = str;
        }

        @d
        /* JADX INFO: renamed from: toString, reason: from getter */
        public String getDescription() {
            return this.description;
        }
    }

    public n(@d androidx.window.core.b featureBounds, @d b type, @d m.c state) {
        f0.p(featureBounds, "featureBounds");
        f0.p(type, "type");
        f0.p(state, "state");
        this.featureBounds = featureBounds;
        this.type = type;
        this.state = state;
        INSTANCE.a(featureBounds);
    }

    @Override // androidx.window.sidecar.m
    public boolean a() {
        b bVar = this.type;
        b.Companion companion = b.INSTANCE;
        if (f0.g(bVar, companion.b())) {
            return true;
        }
        return f0.g(this.type, companion.a()) && f0.g(getState(), m.c.f28645d);
    }

    @Override // androidx.window.sidecar.m
    @d
    public m.a b() {
        return (this.featureBounds.f() == 0 || this.featureBounds.b() == 0) ? m.a.f28636c : m.a.f28637d;
    }

    @Override // androidx.window.sidecar.m
    @d
    public m.b c() {
        return this.featureBounds.f() > this.featureBounds.b() ? m.b.f28641d : m.b.f28640c;
    }

    @d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getType() {
        return this.type;
    }

    public boolean equals(@e Object other) {
        if (this == other) {
            return true;
        }
        if (!f0.g(n.class, other == null ? null : other.getClass())) {
            return false;
        }
        if (other == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        }
        n nVar = (n) other;
        return f0.g(this.featureBounds, nVar.featureBounds) && f0.g(this.type, nVar.type) && f0.g(getState(), nVar.getState());
    }

    @Override // androidx.window.sidecar.h
    @d
    public Rect getBounds() {
        return this.featureBounds.i();
    }

    @Override // androidx.window.sidecar.m
    @d
    public m.c getState() {
        return this.state;
    }

    public int hashCode() {
        return (((this.featureBounds.hashCode() * 31) + this.type.hashCode()) * 31) + getState().hashCode();
    }

    @d
    public String toString() {
        return ((Object) n.class.getSimpleName()) + " { " + this.featureBounds + ", type=" + this.type + ", state=" + getState() + " }";
    }
}
