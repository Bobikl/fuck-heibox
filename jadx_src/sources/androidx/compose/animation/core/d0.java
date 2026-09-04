package androidx.compose.animation.core;

import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Easing.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0004\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0007\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010\t\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\u0002\u001a\u0004\b\u0001\u0010\u0004\"\u0017\u0010\n\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/animation/core/b0;", ak.av, "Landroidx/compose/animation/core/b0;", "b", "()Landroidx/compose/animation/core/b0;", "FastOutSlowInEasing", "d", "LinearOutSlowInEasing", ak.aF, "FastOutLinearInEasing", "LinearEasing", "", "e", "F", "CubicErrorBound", "animation-core_release"}, k = 2, mv = {1, 7, 1})
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final b0 f4405a = new v(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final b0 f4406b = new v(0.0f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final b0 f4407c = new v(0.4f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final b0 f4408d = a.f4410a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f4409e = 0.001f;

    /* JADX INFO: compiled from: Easing.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", Progress.G, "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4410a = new a();

        a() {
        }

        @Override // androidx.compose.animation.core.b0
        public final float a(float f10) {
            return f10;
        }
    }

    @dl.d
    public static final b0 a() {
        return f4407c;
    }

    @dl.d
    public static final b0 b() {
        return f4405a;
    }

    @dl.d
    public static final b0 c() {
        return f4408d;
    }

    @dl.d
    public static final b0 d() {
        return f4406b;
    }
}
