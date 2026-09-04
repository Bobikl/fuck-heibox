package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f128233a;

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final a f128234b = new a();

        private a() {
            super(false, null);
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class b extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final String f128235b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@dl.d String error) {
            super(false, null);
            f0.p(error, "error");
            this.f128235b = error;
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class c extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final c f128236b = new c();

        private c() {
            super(true, null);
        }
    }

    private g(boolean z10) {
        this.f128233a = z10;
    }

    public /* synthetic */ g(boolean z10, u uVar) {
        this(z10);
    }

    public final boolean a() {
        return this.f128233a;
    }
}
