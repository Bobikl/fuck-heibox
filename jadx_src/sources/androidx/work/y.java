package androidx.work;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.w0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.time.Duration;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.d1;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WorkRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u0000 \n2\u00020\u0001:\u0002\u0003\bB'\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/work/y;", "", "Ljava/util/UUID;", ak.av, "Ljava/util/UUID;", "()Ljava/util/UUID;", "id", "Landroidx/work/impl/model/u;", "b", "Landroidx/work/impl/model/u;", "d", "()Landroidx/work/impl/model/u;", "workSpec", "", "", ak.aF, "Ljava/util/Set;", "()Ljava/util/Set;", "tags", "()Ljava/lang/String;", "stringId", "<init>", "(Ljava/util/UUID;Landroidx/work/impl/model/u;Ljava/util/Set;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public abstract class y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f29477e = 30000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SuppressLint({"MinMaxConstant"})
    public static final long f29478f = 18000000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SuppressLint({"MinMaxConstant"})
    public static final long f29479g = 10000;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final UUID id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.work.impl.model.u workSpec;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Set<String> tags;

    /* JADX INFO: compiled from: WorkRequest.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\n\b&\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0019\b\u0000\u0012\u000e\u0010?\u001a\n\u0012\u0006\b\u0001\u0012\u00020;0:¢\u0006\u0004\b[\u0010\\J\u0015\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000f\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010\"J\u0017\u0010&\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b&\u0010$J\u0017\u0010)\u001a\u00028\u00002\u0006\u0010(\u001a\u00020'H\u0017¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00028\u0001¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00028\u0001H ¢\u0006\u0004\b-\u0010,J\u0017\u00100\u001a\u00028\u00002\u0006\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00028\u00002\u0006\u00103\u001a\u000202H\u0007¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00028\u00002\u0006\u00106\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b7\u0010\"J\u001f\u00109\u001a\u00028\u00002\u0006\u00108\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b9\u0010\"R\"\u0010?\u001a\n\u0012\u0006\b\u0001\u0012\u00020;0:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010<\u001a\u0004\b=\u0010>R\"\u0010F\u001a\u00020@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010R\u001a\u00020L8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR \u0010W\u001a\b\u0012\u0004\u0012\u00020\u001d0S8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010T\u001a\u0004\bU\u0010VR\u0014\u0010Z\u001a\u00028\u00008 X \u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006]"}, d2 = {"Landroidx/work/y$a;", "B", "Landroidx/work/y;", androidx.exifinterface.media.a.T4, "", "Ljava/util/UUID;", "id", "q", "(Ljava/util/UUID;)Landroidx/work/y$a;", "Landroidx/work/BackoffPolicy;", "backoffPolicy", "", "backoffDelay", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "l", "(Landroidx/work/BackoffPolicy;JLjava/util/concurrent/TimeUnit;)Landroidx/work/y$a;", "Ljava/time/Duration;", "duration", "m", "(Landroidx/work/BackoffPolicy;Ljava/time/Duration;)Landroidx/work/y$a;", "Landroidx/work/c;", "constraints", "o", "(Landroidx/work/c;)Landroidx/work/y$a;", "Landroidx/work/e;", "inputData", RXScreenCaptureService.KEY_WIDTH, "(Landroidx/work/e;)Landroidx/work/y$a;", "", "tag", ak.av, "(Ljava/lang/String;)Landroidx/work/y$a;", "j", "(JLjava/util/concurrent/TimeUnit;)Landroidx/work/y$a;", "k", "(Ljava/time/Duration;)Landroidx/work/y$a;", ak.aB, "t", "Landroidx/work/OutOfQuotaPolicy;", ak.bo, "p", "(Landroidx/work/OutOfQuotaPolicy;)Landroidx/work/y$a;", "b", "()Landroidx/work/y;", ak.aF, "Landroidx/work/WorkInfo$State;", "state", "v", "(Landroidx/work/WorkInfo$State;)Landroidx/work/y$a;", "", "runAttemptCount", ak.aG, "(I)Landroidx/work/y$a;", "periodStartTime", "x", "scheduleRequestedAt", "y", "Ljava/lang/Class;", "Landroidx/work/m;", "Ljava/lang/Class;", "i", "()Ljava/lang/Class;", "workerClass", "", "Z", "d", "()Z", "n", "(Z)V", "backoffCriteriaSet", "Ljava/util/UUID;", "e", "()Ljava/util/UUID;", "r", "(Ljava/util/UUID;)V", "Landroidx/work/impl/model/u;", "Landroidx/work/impl/model/u;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/work/impl/model/u;", ak.aD, "(Landroidx/work/impl/model/u;)V", "workSpec", "", "Ljava/util/Set;", "f", "()Ljava/util/Set;", "tags", "g", "()Landroidx/work/y$a;", "thisObject", "<init>", "(Ljava/lang/Class;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class a<B extends a<B, ?>, W extends y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Class<? extends m> workerClass;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean backoffCriteriaSet;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private UUID id;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private androidx.work.impl.model.u workSpec;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Set<String> tags;

        public a(@dl.d Class<? extends m> workerClass) {
            f0.p(workerClass, "workerClass");
            this.workerClass = workerClass;
            UUID uuidRandomUUID = UUID.randomUUID();
            f0.o(uuidRandomUUID, "randomUUID()");
            this.id = uuidRandomUUID;
            String string = this.id.toString();
            f0.o(string, "id.toString()");
            String name = workerClass.getName();
            f0.o(name, "workerClass.name");
            this.workSpec = new androidx.work.impl.model.u(string, name);
            String name2 = workerClass.getName();
            f0.o(name2, "workerClass.name");
            this.tags = d1.q(name2);
        }

        @dl.d
        public final B a(@dl.d String tag) {
            f0.p(tag, "tag");
            this.tags.add(tag);
            return (B) g();
        }

        @dl.d
        public final W b() {
            W w10 = (W) c();
            c cVar = this.workSpec.constraints;
            boolean z10 = (Build.VERSION.SDK_INT >= 24 && cVar.e()) || cVar.getRequiresBatteryNotLow() || cVar.getRequiresCharging() || cVar.getRequiresDeviceIdle();
            androidx.work.impl.model.u uVar = this.workSpec;
            if (uVar.expedited) {
                if (!(!z10)) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
                if (!(uVar.initialDelay <= 0)) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            f0.o(uuidRandomUUID, "randomUUID()");
            q(uuidRandomUUID);
            return w10;
        }

        @dl.d
        public abstract W c();

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getBackoffCriteriaSet() {
            return this.backoffCriteriaSet;
        }

        @dl.d
        /* JADX INFO: renamed from: e, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        @dl.d
        public final Set<String> f() {
            return this.tags;
        }

        @dl.d
        public abstract B g();

        @dl.d
        /* JADX INFO: renamed from: h, reason: from getter */
        public final androidx.work.impl.model.u getWorkSpec() {
            return this.workSpec;
        }

        @dl.d
        public final Class<? extends m> i() {
            return this.workerClass;
        }

        @dl.d
        public final B j(long duration, @dl.d TimeUnit timeUnit) {
            f0.p(timeUnit, "timeUnit");
            this.workSpec.minimumRetentionDuration = timeUnit.toMillis(duration);
            return (B) g();
        }

        @dl.d
        @w0(26)
        public final B k(@dl.d Duration duration) {
            f0.p(duration, "duration");
            this.workSpec.minimumRetentionDuration = androidx.work.impl.utils.d.a(duration);
            return (B) g();
        }

        @dl.d
        public final B l(@dl.d BackoffPolicy backoffPolicy, long backoffDelay, @dl.d TimeUnit timeUnit) {
            f0.p(backoffPolicy, "backoffPolicy");
            f0.p(timeUnit, "timeUnit");
            this.backoffCriteriaSet = true;
            androidx.work.impl.model.u uVar = this.workSpec;
            uVar.backoffPolicy = backoffPolicy;
            uVar.E(timeUnit.toMillis(backoffDelay));
            return (B) g();
        }

        @dl.d
        @w0(26)
        public final B m(@dl.d BackoffPolicy backoffPolicy, @dl.d Duration duration) {
            f0.p(backoffPolicy, "backoffPolicy");
            f0.p(duration, "duration");
            this.backoffCriteriaSet = true;
            androidx.work.impl.model.u uVar = this.workSpec;
            uVar.backoffPolicy = backoffPolicy;
            uVar.E(androidx.work.impl.utils.d.a(duration));
            return (B) g();
        }

        public final void n(boolean z10) {
            this.backoffCriteriaSet = z10;
        }

        @dl.d
        public final B o(@dl.d c constraints) {
            f0.p(constraints, "constraints");
            this.workSpec.constraints = constraints;
            return (B) g();
        }

        @dl.d
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public B p(@dl.d OutOfQuotaPolicy policy) {
            f0.p(policy, "policy");
            androidx.work.impl.model.u uVar = this.workSpec;
            uVar.expedited = true;
            uVar.outOfQuotaPolicy = policy;
            return (B) g();
        }

        @dl.d
        public final B q(@dl.d UUID id2) {
            f0.p(id2, "id");
            this.id = id2;
            String string = id2.toString();
            f0.o(string, "id.toString()");
            this.workSpec = new androidx.work.impl.model.u(string, this.workSpec);
            return (B) g();
        }

        public final void r(@dl.d UUID uuid) {
            f0.p(uuid, "<set-?>");
            this.id = uuid;
        }

        @dl.d
        public B s(long duration, @dl.d TimeUnit timeUnit) {
            f0.p(timeUnit, "timeUnit");
            this.workSpec.initialDelay = timeUnit.toMillis(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.workSpec.initialDelay) {
                return (B) g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
        }

        @dl.d
        @w0(26)
        public B t(@dl.d Duration duration) {
            f0.p(duration, "duration");
            this.workSpec.initialDelay = androidx.work.impl.utils.d.a(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.workSpec.initialDelay) {
                return (B) g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
        }

        @j1
        @dl.d
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final B u(int runAttemptCount) {
            this.workSpec.runAttemptCount = runAttemptCount;
            return (B) g();
        }

        @j1
        @dl.d
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final B v(@dl.d WorkInfo.State state) {
            f0.p(state, "state");
            this.workSpec.state = state;
            return (B) g();
        }

        @dl.d
        public final B w(@dl.d e inputData) {
            f0.p(inputData, "inputData");
            this.workSpec.input = inputData;
            return (B) g();
        }

        @j1
        @dl.d
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final B x(long periodStartTime, @dl.d TimeUnit timeUnit) {
            f0.p(timeUnit, "timeUnit");
            this.workSpec.lastEnqueueTime = timeUnit.toMillis(periodStartTime);
            return (B) g();
        }

        @j1
        @dl.d
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final B y(long scheduleRequestedAt, @dl.d TimeUnit timeUnit) {
            f0.p(timeUnit, "timeUnit");
            this.workSpec.scheduleRequestedAt = timeUnit.toMillis(scheduleRequestedAt);
            return (B) g();
        }

        public final void z(@dl.d androidx.work.impl.model.u uVar) {
            f0.p(uVar, "<set-?>");
            this.workSpec = uVar;
        }
    }

    public y(@dl.d UUID id2, @dl.d androidx.work.impl.model.u workSpec, @dl.d Set<String> tags) {
        f0.p(id2, "id");
        f0.p(workSpec, "workSpec");
        f0.p(tags, "tags");
        this.id = id2;
        this.workSpec = workSpec;
        this.tags = tags;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public UUID getId() {
        return this.id;
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final String b() {
        String string = getId().toString();
        f0.o(string, "id.toString()");
        return string;
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Set<String> c() {
        return this.tags;
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: d, reason: from getter */
    public final androidx.work.impl.model.u getWorkSpec() {
        return this.workSpec;
    }
}
