package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.Index;
import androidx.room.n0;
import androidx.room.p1;
import androidx.work.BackoffPolicy;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WorkSpec.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.room.q(indices = {@Index({"schedule_requested_at"}), @Index({"last_enqueue_time"})})
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b4\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0003>@\nBÍ\u0001\u0012\u0006\u0010)\u001a\u00020\r\u0012\b\b\u0002\u0010*\u001a\u00020\u0010\u0012\u0006\u0010+\u001a\u00020\r\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010-\u001a\u00020\u0014\u0012\b\b\u0002\u0010.\u001a\u00020\u0014\u0012\b\b\u0002\u0010/\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u00100\u001a\u00020\u001a\u0012\b\b\u0003\u00101\u001a\u00020\u001c\u0012\b\b\u0002\u00102\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u00103\u001a\u00020\u0002\u0012\b\b\u0002\u00104\u001a\u00020\u0002\u0012\b\b\u0002\u00105\u001a\u00020\u0002\u0012\b\b\u0002\u00106\u001a\u00020\u000b\u0012\b\b\u0002\u00107\u001a\u00020%\u0012\b\b\u0002\u00108\u001a\u00020\u001c\u0012\b\b\u0002\u00109\u001a\u00020\u001c¢\u0006\u0004\bS\u0010TB\u0019\b\u0016\u0012\u0006\u0010)\u001a\u00020\r\u0012\u0006\u0010U\u001a\u00020\r¢\u0006\u0004\bS\u0010VB\u0019\b\u0016\u0012\u0006\u0010W\u001a\u00020\r\u0012\u0006\u0010<\u001a\u00020\u0000¢\u0006\u0004\bS\u0010XJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\u000e\u001a\u00020\rH\u0016J\t\u0010\u000f\u001a\u00020\rHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0012\u001a\u00020\rHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0014HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0002HÆ\u0003J\t\u0010\u001b\u001a\u00020\u001aHÆ\u0003J\t\u0010\u001d\u001a\u00020\u001cHÆ\u0003J\t\u0010\u001f\u001a\u00020\u001eHÆ\u0003J\t\u0010 \u001a\u00020\u0002HÆ\u0003J\t\u0010!\u001a\u00020\u0002HÆ\u0003J\t\u0010\"\u001a\u00020\u0002HÆ\u0003J\t\u0010#\u001a\u00020\u0002HÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020%HÆ\u0003J\t\u0010'\u001a\u00020\u001cHÆ\u0003J\t\u0010(\u001a\u00020\u001cHÆ\u0003JÓ\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010)\u001a\u00020\r2\b\b\u0002\u0010*\u001a\u00020\u00102\b\b\u0002\u0010+\u001a\u00020\r2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010-\u001a\u00020\u00142\b\b\u0002\u0010.\u001a\u00020\u00142\b\b\u0002\u0010/\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u00100\u001a\u00020\u001a2\b\b\u0003\u00101\u001a\u00020\u001c2\b\b\u0002\u00102\u001a\u00020\u001e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u00103\u001a\u00020\u00022\b\b\u0002\u00104\u001a\u00020\u00022\b\b\u0002\u00105\u001a\u00020\u00022\b\b\u0002\u00106\u001a\u00020\u000b2\b\b\u0002\u00107\u001a\u00020%2\b\b\u0002\u00108\u001a\u00020\u001c2\b\b\u0002\u00109\u001a\u00020\u001cHÆ\u0001J\t\u0010;\u001a\u00020\u001cHÖ\u0001J\u0013\u0010=\u001a\u00020\u000b2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010)\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010*\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010+\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010?R\u0018\u0010,\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010?R\u0016\u0010-\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010BR\u0016\u0010.\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010BR\u0016\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010CR\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010CR\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010CR\u0016\u00100\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010DR\u0016\u00101\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b#\u0010ER\u0016\u00102\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010FR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u0010CR\u0016\u00103\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b'\u0010CR\u0016\u00104\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010CR\u0016\u00105\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010CR\u0016\u00106\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010GR\u0016\u00107\u001a\u00020%8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010HR\"\u00108\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010E\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u00109\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010E\u001a\u0004\bM\u0010JR\u0011\u0010P\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0011\u0010R\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bQ\u0010O¨\u0006Y"}, d2 = {"Landroidx/work/impl/model/u;", "", "", "backoffDelayDuration", "Lkotlin/b2;", androidx.exifinterface.media.a.S4, "intervalDuration", "G", "flexDuration", "H", ak.aF, "", "B", "", "toString", "d", "Landroidx/work/WorkInfo$State;", "o", "q", "r", "Landroidx/work/e;", ak.aB, "t", ak.aG, "v", RXScreenCaptureService.KEY_WIDTH, "Landroidx/work/c;", "e", "", "f", "Landroidx/work/BackoffPolicy;", "g", RXScreenCaptureService.KEY_HEIGHT, "i", "j", "k", "l", "Landroidx/work/OutOfQuotaPolicy;", "m", "n", "p", "id", "state", "workerClassName", "inputMergerClassName", "input", "output", "initialDelay", "constraints", "runAttemptCount", "backoffPolicy", "lastEnqueueTime", "minimumRetentionDuration", "scheduleRequestedAt", "expedited", "outOfQuotaPolicy", "periodCount", "generation", "x", "hashCode", "other", "equals", ak.av, "Ljava/lang/String;", "b", "Landroidx/work/WorkInfo$State;", "Landroidx/work/e;", "J", "Landroidx/work/c;", "I", "Landroidx/work/BackoffPolicy;", "Z", "Landroidx/work/OutOfQuotaPolicy;", androidx.exifinterface.media.a.W4, "()I", "F", "(I)V", ak.aD, "D", "()Z", "isPeriodic", "C", "isBackedOff", "<init>", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/e;Landroidx/work/e;JJJLandroidx/work/c;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;II)V", "workerClassName_", "(Ljava/lang/String;Ljava/lang/String;)V", "newId", "(Ljava/lang/String;Landroidx/work/impl/model/u;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final /* data */ class u {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final String f29126v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final long f29127w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final f0.a<List<WorkInfoPojo>, List<WorkInfo>> f29128x;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @n0
    @xh.e
    @androidx.room.f(name = "id")
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    @androidx.room.f(name = "state")
    public WorkInfo.State state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    @androidx.room.f(name = "worker_class_name")
    public String workerClassName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    @xh.e
    @androidx.room.f(name = "input_merger_class_name")
    public String inputMergerClassName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    @androidx.room.f(name = "input")
    public androidx.work.e input;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    @androidx.room.f(name = "output")
    public androidx.work.e output;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @xh.e
    @androidx.room.f(name = "initial_delay")
    public long initialDelay;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @xh.e
    @androidx.room.f(name = "interval_duration")
    public long intervalDuration;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @xh.e
    @androidx.room.f(name = "flex_duration")
    public long flexDuration;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @androidx.room.p
    @dl.d
    @xh.e
    public androidx.work.c constraints;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @xh.e
    @androidx.room.f(name = "run_attempt_count")
    public int runAttemptCount;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    @androidx.room.f(name = "backoff_policy")
    public BackoffPolicy backoffPolicy;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @xh.e
    @androidx.room.f(name = "backoff_delay_duration")
    public long backoffDelayDuration;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @xh.e
    @androidx.room.f(name = "last_enqueue_time")
    public long lastEnqueueTime;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @xh.e
    @androidx.room.f(name = "minimum_retention_duration")
    public long minimumRetentionDuration;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @xh.e
    @androidx.room.f(name = "schedule_requested_at")
    public long scheduleRequestedAt;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @xh.e
    @androidx.room.f(name = "run_in_foreground")
    public boolean expedited;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    @androidx.room.f(name = "out_of_quota_policy")
    public OutOfQuotaPolicy outOfQuotaPolicy;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @androidx.room.f(defaultValue = "0", name = "period_count")
    private int periodCount;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @androidx.room.f(defaultValue = "0")
    private final int generation;

    /* JADX INFO: renamed from: androidx.work.impl.model.u$b, reason: from toString */
    /* JADX INFO: compiled from: WorkSpec.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/work/impl/model/u$b;", "", "", ak.av, "Landroidx/work/WorkInfo$State;", "b", "id", "state", ak.aF, "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "Landroidx/work/WorkInfo$State;", "<init>", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class IdAndState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        @xh.e
        @androidx.room.f(name = "id")
        public String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        @xh.e
        @androidx.room.f(name = "state")
        public WorkInfo.State state;

        public IdAndState(@dl.d String id2, @dl.d WorkInfo.State state) {
            f0.p(id2, "id");
            f0.p(state, "state");
            this.id = id2;
            this.state = state;
        }

        public static /* synthetic */ IdAndState d(IdAndState idAndState, String str, WorkInfo.State state, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = idAndState.id;
            }
            if ((i10 & 2) != 0) {
                state = idAndState.state;
            }
            return idAndState.c(str, state);
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @dl.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public final WorkInfo.State getState() {
            return this.state;
        }

        @dl.d
        public final IdAndState c(@dl.d String id2, @dl.d WorkInfo.State state) {
            f0.p(id2, "id");
            f0.p(state, "state");
            return new IdAndState(id2, state);
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) other;
            return f0.g(this.id, idAndState.id) && this.state == idAndState.state;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.state.hashCode();
        }

        @dl.d
        public String toString() {
            return "IdAndState(id=" + this.id + ", state=" + this.state + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.u$c, reason: from toString */
    /* JADX INFO: compiled from: WorkSpec.kt */
    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\r\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0004\b9\u0010:J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\nHÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rHÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\rHÆ\u0003J[\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\rHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0019\u001a\u00020\nHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u0013\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\u0014\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b1\u0010.R(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u00102\u001a\u0004\b7\u00104\"\u0004\b8\u00106¨\u0006;"}, d2 = {"Landroidx/work/impl/model/u$c;", "", "Landroidx/work/WorkInfo;", RXScreenCaptureService.KEY_WIDTH, "", ak.av, "Landroidx/work/WorkInfo$State;", "b", "Landroidx/work/e;", ak.aF, "", "d", "e", "", "f", "g", "id", "state", "output", "runAttemptCount", "generation", "tags", "progress", RXScreenCaptureService.KEY_HEIGHT, "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "q", "(Ljava/lang/String;)V", "Landroidx/work/WorkInfo$State;", "o", "()Landroidx/work/WorkInfo$State;", ak.aG, "(Landroidx/work/WorkInfo$State;)V", "Landroidx/work/e;", "l", "()Landroidx/work/e;", "r", "(Landroidx/work/e;)V", "I", "n", "()I", "t", "(I)V", "j", "Ljava/util/List;", "p", "()Ljava/util/List;", "v", "(Ljava/util/List;)V", "m", ak.aB, "<init>", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Landroidx/work/e;IILjava/util/List;Ljava/util/List;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class WorkInfoPojo {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        @androidx.room.f(name = "id")
        private String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        @androidx.room.f(name = "state")
        private WorkInfo.State state;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        @androidx.room.f(name = "output")
        private androidx.work.e output;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @androidx.room.f(name = "run_attempt_count")
        private int runAttemptCount;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @androidx.room.f(name = "generation")
        private final int generation;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @p1(entity = y.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"tag"})
        @dl.d
        private List<String> tags;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @p1(entity = q.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"progress"})
        @dl.d
        private List<androidx.work.e> progress;

        public WorkInfoPojo(@dl.d String id2, @dl.d WorkInfo.State state, @dl.d androidx.work.e output, int i10, int i11, @dl.d List<String> tags, @dl.d List<androidx.work.e> progress) {
            f0.p(id2, "id");
            f0.p(state, "state");
            f0.p(output, "output");
            f0.p(tags, "tags");
            f0.p(progress, "progress");
            this.id = id2;
            this.state = state;
            this.output = output;
            this.runAttemptCount = i10;
            this.generation = i11;
            this.tags = tags;
            this.progress = progress;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WorkInfoPojo i(WorkInfoPojo workInfoPojo, String str, WorkInfo.State state, androidx.work.e eVar, int i10, int i11, List list, List list2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = workInfoPojo.id;
            }
            if ((i12 & 2) != 0) {
                state = workInfoPojo.state;
            }
            WorkInfo.State state2 = state;
            if ((i12 & 4) != 0) {
                eVar = workInfoPojo.output;
            }
            androidx.work.e eVar2 = eVar;
            if ((i12 & 8) != 0) {
                i10 = workInfoPojo.runAttemptCount;
            }
            int i13 = i10;
            if ((i12 & 16) != 0) {
                i11 = workInfoPojo.generation;
            }
            int i14 = i11;
            if ((i12 & 32) != 0) {
                list = workInfoPojo.tags;
            }
            List list3 = list;
            if ((i12 & 64) != 0) {
                list2 = workInfoPojo.progress;
            }
            return workInfoPojo.h(str, state2, eVar2, i13, i14, list3, list2);
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @dl.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public final WorkInfo.State getState() {
            return this.state;
        }

        @dl.d
        /* JADX INFO: renamed from: c, reason: from getter */
        public final androidx.work.e getOutput() {
            return this.output;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getRunAttemptCount() {
            return this.runAttemptCount;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getGeneration() {
            return this.generation;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) other;
            return f0.g(this.id, workInfoPojo.id) && this.state == workInfoPojo.state && f0.g(this.output, workInfoPojo.output) && this.runAttemptCount == workInfoPojo.runAttemptCount && this.generation == workInfoPojo.generation && f0.g(this.tags, workInfoPojo.tags) && f0.g(this.progress, workInfoPojo.progress);
        }

        @dl.d
        public final List<String> f() {
            return this.tags;
        }

        @dl.d
        public final List<androidx.work.e> g() {
            return this.progress;
        }

        @dl.d
        public final WorkInfoPojo h(@dl.d String id2, @dl.d WorkInfo.State state, @dl.d androidx.work.e output, int runAttemptCount, int generation, @dl.d List<String> tags, @dl.d List<androidx.work.e> progress) {
            f0.p(id2, "id");
            f0.p(state, "state");
            f0.p(output, "output");
            f0.p(tags, "tags");
            f0.p(progress, "progress");
            return new WorkInfoPojo(id2, state, output, runAttemptCount, generation, tags, progress);
        }

        public int hashCode() {
            return (((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.output.hashCode()) * 31) + this.runAttemptCount) * 31) + this.generation) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode();
        }

        public final int j() {
            return this.generation;
        }

        @dl.d
        public final String k() {
            return this.id;
        }

        @dl.d
        public final androidx.work.e l() {
            return this.output;
        }

        @dl.d
        public final List<androidx.work.e> m() {
            return this.progress;
        }

        public final int n() {
            return this.runAttemptCount;
        }

        @dl.d
        public final WorkInfo.State o() {
            return this.state;
        }

        @dl.d
        public final List<String> p() {
            return this.tags;
        }

        public final void q(@dl.d String str) {
            f0.p(str, "<set-?>");
            this.id = str;
        }

        public final void r(@dl.d androidx.work.e eVar) {
            f0.p(eVar, "<set-?>");
            this.output = eVar;
        }

        public final void s(@dl.d List<androidx.work.e> list) {
            f0.p(list, "<set-?>");
            this.progress = list;
        }

        public final void t(int i10) {
            this.runAttemptCount = i10;
        }

        @dl.d
        public String toString() {
            return "WorkInfoPojo(id=" + this.id + ", state=" + this.state + ", output=" + this.output + ", runAttemptCount=" + this.runAttemptCount + ", generation=" + this.generation + ", tags=" + this.tags + ", progress=" + this.progress + ')';
        }

        public final void u(@dl.d WorkInfo.State state) {
            f0.p(state, "<set-?>");
            this.state = state;
        }

        public final void v(@dl.d List<String> list) {
            f0.p(list, "<set-?>");
            this.tags = list;
        }

        @dl.d
        public final WorkInfo w() {
            return new WorkInfo(UUID.fromString(this.id), this.state, this.output, this.tags, this.progress.isEmpty() ^ true ? this.progress.get(0) : androidx.work.e.f28775c, this.runAttemptCount, this.generation);
        }
    }

    static {
        String strI = androidx.work.n.i("WorkSpec");
        f0.o(strI, "tagWithPrefix(\"WorkSpec\")");
        f29126v = strI;
        f29128x = new f0.a() { // from class: androidx.work.impl.model.t
            @Override // f0.a
            public final Object apply(Object obj) {
                return u.b((List) obj);
            }
        };
    }

    public u(@dl.d String id2, @dl.d WorkInfo.State state, @dl.d String workerClassName, @dl.e String str, @dl.d androidx.work.e input, @dl.d androidx.work.e output, long j10, long j11, long j12, @dl.d androidx.work.c constraints, @androidx.annotation.f0(from = 0) int i10, @dl.d BackoffPolicy backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, @dl.d OutOfQuotaPolicy outOfQuotaPolicy, int i11, int i12) {
        f0.p(id2, "id");
        f0.p(state, "state");
        f0.p(workerClassName, "workerClassName");
        f0.p(input, "input");
        f0.p(output, "output");
        f0.p(constraints, "constraints");
        f0.p(backoffPolicy, "backoffPolicy");
        f0.p(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.id = id2;
        this.state = state;
        this.workerClassName = workerClassName;
        this.inputMergerClassName = str;
        this.input = input;
        this.output = output;
        this.initialDelay = j10;
        this.intervalDuration = j11;
        this.flexDuration = j12;
        this.constraints = constraints;
        this.runAttemptCount = i10;
        this.backoffPolicy = backoffPolicy;
        this.backoffDelayDuration = j13;
        this.lastEnqueueTime = j14;
        this.minimumRetentionDuration = j15;
        this.scheduleRequestedAt = j16;
        this.expedited = z10;
        this.outOfQuotaPolicy = outOfQuotaPolicy;
        this.periodCount = i11;
        this.generation = i12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ u(String str, WorkInfo.State state, String str2, String str3, androidx.work.e eVar, androidx.work.e eVar2, long j10, long j11, long j12, androidx.work.c cVar, int i10, BackoffPolicy backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, OutOfQuotaPolicy outOfQuotaPolicy, int i11, int i12, int i13, kotlin.jvm.internal.u uVar) {
        androidx.work.e eVar3;
        androidx.work.e eVar4;
        WorkInfo.State state2 = (i13 & 2) != 0 ? WorkInfo.State.ENQUEUED : state;
        String str4 = (i13 & 8) != 0 ? null : str3;
        if ((i13 & 16) != 0) {
            androidx.work.e EMPTY = androidx.work.e.f28775c;
            f0.o(EMPTY, "EMPTY");
            eVar3 = EMPTY;
        } else {
            eVar3 = eVar;
        }
        if ((i13 & 32) != 0) {
            androidx.work.e EMPTY2 = androidx.work.e.f28775c;
            f0.o(EMPTY2, "EMPTY");
            eVar4 = EMPTY2;
        } else {
            eVar4 = eVar2;
        }
        this(str, state2, str2, str4, eVar3, eVar4, (i13 & 64) != 0 ? 0L : j10, (i13 & 128) != 0 ? 0L : j11, (i13 & 256) != 0 ? 0L : j12, (i13 & 512) != 0 ? androidx.work.c.f28754j : cVar, (i13 & 1024) != 0 ? 0 : i10, (i13 & 2048) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i13 & 4096) != 0 ? 30000L : j13, (i13 & 8192) != 0 ? 0L : j14, (i13 & 16384) != 0 ? 0L : j15, (32768 & i13) != 0 ? -1L : j16, (65536 & i13) != 0 ? false : z10, (131072 & i13) != 0 ? OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST : outOfQuotaPolicy, (262144 & i13) != 0 ? 0 : i11, (i13 & 524288) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(@dl.d String newId, @dl.d u other) {
        this(newId, other.state, other.workerClassName, other.inputMergerClassName, new androidx.work.e(other.input), new androidx.work.e(other.output), other.initialDelay, other.intervalDuration, other.flexDuration, new androidx.work.c(other.constraints), other.runAttemptCount, other.backoffPolicy, other.backoffDelayDuration, other.lastEnqueueTime, other.minimumRetentionDuration, other.scheduleRequestedAt, other.expedited, other.outOfQuotaPolicy, other.periodCount, 0, 524288, null);
        f0.p(newId, "newId");
        f0.p(other, "other");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(@dl.d String id2, @dl.d String workerClassName_) {
        this(id2, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048570, null);
        f0.p(id2, "id");
        f0.p(workerClassName_, "workerClassName_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkInfoPojo) it.next()).w());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final int getPeriodCount() {
        return this.periodCount;
    }

    public final boolean B() {
        return !f0.g(androidx.work.c.f28754j, this.constraints);
    }

    public final boolean C() {
        return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
    }

    public final boolean D() {
        return this.intervalDuration != 0;
    }

    public final void E(long j10) {
        if (j10 > androidx.work.y.f29478f) {
            androidx.work.n.e().l(f29126v, "Backoff delay duration exceeds maximum value");
        }
        if (j10 < 10000) {
            androidx.work.n.e().l(f29126v, "Backoff delay duration less than minimum value");
        }
        this.backoffDelayDuration = fi.u.K(j10, 10000L, androidx.work.y.f29478f);
    }

    public final void F(int i10) {
        this.periodCount = i10;
    }

    public final void G(long j10) {
        if (j10 < 900000) {
            androidx.work.n.e().l(f29126v, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        H(fi.u.v(j10, 900000L), fi.u.v(j10, 900000L));
    }

    public final void H(long j10, long j11) {
        if (j10 < 900000) {
            androidx.work.n.e().l(f29126v, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.intervalDuration = fi.u.v(j10, 900000L);
        if (j11 < 300000) {
            androidx.work.n.e().l(f29126v, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j11 > this.intervalDuration) {
            androidx.work.n.e().l(f29126v, "Flex duration greater than interval duration; Changed to " + j10);
        }
        this.flexDuration = fi.u.K(j11, 300000L, this.intervalDuration);
    }

    public final long c() {
        if (C()) {
            return this.lastEnqueueTime + fi.u.C(this.backoffPolicy == BackoffPolicy.LINEAR ? this.backoffDelayDuration * ((long) this.runAttemptCount) : (long) Math.scalb(this.backoffDelayDuration, this.runAttemptCount - 1), androidx.work.y.f29478f);
        }
        long j10 = 0;
        if (!D()) {
            long jCurrentTimeMillis = this.lastEnqueueTime;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return this.initialDelay + jCurrentTimeMillis;
        }
        int i10 = this.periodCount;
        long j11 = this.lastEnqueueTime;
        if (i10 == 0) {
            j11 += this.initialDelay;
        }
        long j12 = this.flexDuration;
        long j13 = this.intervalDuration;
        if (j12 != j13) {
            j10 = i10 == 0 ? ((long) (-1)) * j12 : 0L;
            j11 += j13;
        } else if (i10 != 0) {
            j10 = j13;
        }
        return j11 + j10;
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final androidx.work.c getConstraints() {
        return this.constraints;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof u)) {
            return false;
        }
        u uVar = (u) other;
        return f0.g(this.id, uVar.id) && this.state == uVar.state && f0.g(this.workerClassName, uVar.workerClassName) && f0.g(this.inputMergerClassName, uVar.inputMergerClassName) && f0.g(this.input, uVar.input) && f0.g(this.output, uVar.output) && this.initialDelay == uVar.initialDelay && this.intervalDuration == uVar.intervalDuration && this.flexDuration == uVar.flexDuration && f0.g(this.constraints, uVar.constraints) && this.runAttemptCount == uVar.runAttemptCount && this.backoffPolicy == uVar.backoffPolicy && this.backoffDelayDuration == uVar.backoffDelayDuration && this.lastEnqueueTime == uVar.lastEnqueueTime && this.minimumRetentionDuration == uVar.minimumRetentionDuration && this.scheduleRequestedAt == uVar.scheduleRequestedAt && this.expedited == uVar.expedited && this.outOfQuotaPolicy == uVar.outOfQuotaPolicy && this.periodCount == uVar.periodCount && this.generation == uVar.generation;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getRunAttemptCount() {
        return this.runAttemptCount;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final BackoffPolicy getBackoffPolicy() {
        return this.backoffPolicy;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getBackoffDelayDuration() {
        return this.backoffDelayDuration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [int] */
    /* JADX WARN: Type inference failed for: r1v31, types: [int] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v38 */
    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31;
        String str = this.inputMergerClassName;
        int iHashCode2 = (((((((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31) + androidx.collection.k.a(this.initialDelay)) * 31) + androidx.collection.k.a(this.intervalDuration)) * 31) + androidx.collection.k.a(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + this.runAttemptCount) * 31) + this.backoffPolicy.hashCode()) * 31) + androidx.collection.k.a(this.backoffDelayDuration)) * 31) + androidx.collection.k.a(this.lastEnqueueTime)) * 31) + androidx.collection.k.a(this.minimumRetentionDuration)) * 31) + androidx.collection.k.a(this.scheduleRequestedAt)) * 31;
        boolean z10 = this.expedited;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return ((((((iHashCode2 + r10) * 31) + this.outOfQuotaPolicy.hashCode()) * 31) + this.periodCount) * 31) + this.generation;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getLastEnqueueTime() {
        return this.lastEnqueueTime;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getMinimumRetentionDuration() {
        return this.minimumRetentionDuration;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getScheduleRequestedAt() {
        return this.scheduleRequestedAt;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getExpedited() {
        return this.expedited;
    }

    @dl.d
    /* JADX INFO: renamed from: m, reason: from getter */
    public final OutOfQuotaPolicy getOutOfQuotaPolicy() {
        return this.outOfQuotaPolicy;
    }

    public final int n() {
        return this.periodCount;
    }

    @dl.d
    /* JADX INFO: renamed from: o, reason: from getter */
    public final WorkInfo.State getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getGeneration() {
        return this.generation;
    }

    @dl.d
    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getWorkerClassName() {
        return this.workerClassName;
    }

    @dl.e
    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getInputMergerClassName() {
        return this.inputMergerClassName;
    }

    @dl.d
    /* JADX INFO: renamed from: s, reason: from getter */
    public final androidx.work.e getInput() {
        return this.input;
    }

    @dl.d
    /* JADX INFO: renamed from: t, reason: from getter */
    public final androidx.work.e getOutput() {
        return this.output;
    }

    @dl.d
    public String toString() {
        return "{WorkSpec: " + this.id + '}';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final long getInitialDelay() {
        return this.initialDelay;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final long getIntervalDuration() {
        return this.intervalDuration;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final long getFlexDuration() {
        return this.flexDuration;
    }

    @dl.d
    public final u x(@dl.d String id2, @dl.d WorkInfo.State state, @dl.d String workerClassName, @dl.e String inputMergerClassName, @dl.d androidx.work.e input, @dl.d androidx.work.e output, long initialDelay, long intervalDuration, long flexDuration, @dl.d androidx.work.c constraints, @androidx.annotation.f0(from = 0) int runAttemptCount, @dl.d BackoffPolicy backoffPolicy, long backoffDelayDuration, long lastEnqueueTime, long minimumRetentionDuration, long scheduleRequestedAt, boolean expedited, @dl.d OutOfQuotaPolicy outOfQuotaPolicy, int periodCount, int generation) {
        f0.p(id2, "id");
        f0.p(state, "state");
        f0.p(workerClassName, "workerClassName");
        f0.p(input, "input");
        f0.p(output, "output");
        f0.p(constraints, "constraints");
        f0.p(backoffPolicy, "backoffPolicy");
        f0.p(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new u(id2, state, workerClassName, inputMergerClassName, input, output, initialDelay, intervalDuration, flexDuration, constraints, runAttemptCount, backoffPolicy, backoffDelayDuration, lastEnqueueTime, minimumRetentionDuration, scheduleRequestedAt, expedited, outOfQuotaPolicy, periodCount, generation);
    }

    public final int z() {
        return this.generation;
    }
}
