package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import kotlin.b0;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.z;

/* JADX INFO: compiled from: ActivityResultCaller.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ActivityResultCallerLauncher<I, O> extends g<b2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final g<I> f1499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final z.a<I, O> f1500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I f1501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final z f1502d;

    public ActivityResultCallerLauncher(@dl.d g<I> launcher, @dl.d z.a<I, O> callerContract, I i10) {
        f0.p(launcher, "launcher");
        f0.p(callerContract, "callerContract");
        this.f1499a = launcher;
        this.f1500b = callerContract;
        this.f1501c = i10;
        this.f1502d = b0.c(new yh.a<ActivityResultCallerLauncher$resultContract$2.a>(this) { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ActivityResultCallerLauncher<I, O> f1503b;

            /* JADX INFO: Add missing generic type declarations: [O] */
            /* JADX INFO: compiled from: ActivityResultCaller.kt */
            public static final class a<O> extends z.a<b2, O> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ ActivityResultCallerLauncher<I, O> f1504a;

                a(ActivityResultCallerLauncher<I, O> activityResultCallerLauncher) {
                    this.f1504a = activityResultCallerLauncher;
                }

                @Override // z.a
                public O c(int i10, @dl.e Intent intent) {
                    return (O) this.f1504a.e().c(i10, intent);
                }

                @Override // z.a
                @dl.d
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public Intent a(@dl.d Context context, @dl.d b2 input) {
                    f0.p(context, "context");
                    f0.p(input, "input");
                    return this.f1504a.e().a(context, this.f1504a.f());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f1503b = this;
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a invoke() {
                return new a(this.f1503b);
            }
        });
    }

    @Override // androidx.activity.result.g
    @dl.d
    public z.a<b2, ?> a() {
        return h();
    }

    @Override // androidx.activity.result.g
    public void d() {
        this.f1499a.d();
    }

    @dl.d
    public final z.a<I, O> e() {
        return this.f1500b;
    }

    public final I f() {
        return this.f1501c;
    }

    @dl.d
    public final g<I> g() {
        return this.f1499a;
    }

    @dl.d
    public final z.a<b2, O> h() {
        return (z.a) this.f1502d.getValue();
    }

    @Override // androidx.activity.result.g
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void c(@dl.d b2 input, @dl.e androidx.core.app.i iVar) {
        f0.p(input, "input");
        this.f1499a.c(this.f1501c, iVar);
    }
}
