package androidx.work;

import android.net.Uri;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.annotation.w0;
import androidx.compose.foundation.b0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.d1;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Constraints.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0003\r\u0012\u0015B]\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0019\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b#\u0010$B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b#\u0010%J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0007J\u0013\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u001a\u0010\u001c\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0012\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\r\u0010\u001bR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\u0015\u0010!¨\u0006&"}, d2 = {"Landroidx/work/c;", "", "", "g", RXScreenCaptureService.KEY_HEIGHT, "f", "i", "e", "other", "equals", "", "hashCode", "Landroidx/work/NetworkType;", ak.av, "Landroidx/work/NetworkType;", "d", "()Landroidx/work/NetworkType;", "requiredNetworkType", "b", "Z", "requiresCharging", ak.aF, "requiresDeviceIdle", "requiresBatteryNotLow", "requiresStorageNotLow", "", "J", "()J", "contentTriggerUpdateDelayMillis", "contentTriggerMaxDelayMillis", "", "Landroidx/work/c$c;", "Ljava/util/Set;", "()Ljava/util/Set;", "contentUriTriggers", "<init>", "(Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V", "(Landroidx/work/c;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final c f28754j = new c(null, false, false, false, false, 0, 0, null, 255, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @androidx.room.f(name = "required_network_type")
    private final NetworkType requiredNetworkType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @androidx.room.f(name = "requires_charging")
    private final boolean requiresCharging;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @androidx.room.f(name = "requires_device_idle")
    private final boolean requiresDeviceIdle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @androidx.room.f(name = "requires_battery_not_low")
    private final boolean requiresBatteryNotLow;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @androidx.room.f(name = "requires_storage_not_low")
    private final boolean requiresStorageNotLow;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @androidx.room.f(name = "trigger_content_update_delay")
    private final long contentTriggerUpdateDelayMillis;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @androidx.room.f(name = "trigger_max_content_delay")
    private final long contentTriggerMaxDelayMillis;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @androidx.room.f(name = "content_uri_triggers")
    private final Set<C0229c> contentUriTriggers;

    /* JADX INFO: compiled from: Constraints.kt */
    @Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b'\u0010(B\u0011\b\u0017\u0012\u0006\u0010)\u001a\u00020\u001b¢\u0006\u0004\b'\u0010*J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0007J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0002J\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0007J\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0017H\u0007J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0017H\u0007J\u0006\u0010\u001c\u001a\u00020\u001bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0016\u0010!\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0016\u0010\"\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010 R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010%¨\u0006+"}, d2 = {"Landroidx/work/c$a;", "", "", "requiresCharging", "e", "requiresDeviceIdle", "f", "Landroidx/work/NetworkType;", "networkType", ak.aF, "requiresBatteryNotLow", "d", "requiresStorageNotLow", "g", "Landroid/net/Uri;", "uri", "triggerForDescendants", ak.av, "", "duration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "j", "Ljava/time/Duration;", "k", RXScreenCaptureService.KEY_HEIGHT, "i", "Landroidx/work/c;", "b", "Z", "Landroidx/work/NetworkType;", "requiredNetworkType", "J", "triggerContentUpdateDelay", "triggerContentMaxDelay", "", "Landroidx/work/c$c;", "Ljava/util/Set;", "contentUriTriggers", "<init>", "()V", "constraints", "(Landroidx/work/c;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean requiresCharging;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean requiresDeviceIdle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private NetworkType requiredNetworkType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean requiresBatteryNotLow;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean requiresStorageNotLow;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private long triggerContentUpdateDelay;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private long triggerContentMaxDelay;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private Set<C0229c> contentUriTriggers;

        public a() {
            this.requiredNetworkType = NetworkType.NOT_REQUIRED;
            this.triggerContentUpdateDelay = -1L;
            this.triggerContentMaxDelay = -1L;
            this.contentUriTriggers = new LinkedHashSet();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public a(@dl.d c constraints) {
            f0.p(constraints, "constraints");
            this.requiredNetworkType = NetworkType.NOT_REQUIRED;
            this.triggerContentUpdateDelay = -1L;
            this.triggerContentMaxDelay = -1L;
            this.contentUriTriggers = new LinkedHashSet();
            this.requiresCharging = constraints.getRequiresCharging();
            int i10 = Build.VERSION.SDK_INT;
            this.requiresDeviceIdle = constraints.getRequiresDeviceIdle();
            this.requiredNetworkType = constraints.getRequiredNetworkType();
            this.requiresBatteryNotLow = constraints.getRequiresBatteryNotLow();
            this.requiresStorageNotLow = constraints.getRequiresStorageNotLow();
            if (i10 >= 24) {
                this.triggerContentUpdateDelay = constraints.getContentTriggerUpdateDelayMillis();
                this.triggerContentMaxDelay = constraints.getContentTriggerMaxDelayMillis();
                this.contentUriTriggers = CollectionsKt___CollectionsKt.U5(constraints.c());
            }
        }

        @dl.d
        @w0(24)
        public final a a(@dl.d Uri uri, boolean triggerForDescendants) {
            f0.p(uri, "uri");
            this.contentUriTriggers.add(new C0229c(uri, triggerForDescendants));
            return this;
        }

        @dl.d
        public final c b() {
            Set setK;
            long j10;
            long j11;
            if (Build.VERSION.SDK_INT >= 24) {
                setK = CollectionsKt___CollectionsKt.V5(this.contentUriTriggers);
                j10 = this.triggerContentUpdateDelay;
                j11 = this.triggerContentMaxDelay;
            } else {
                setK = d1.k();
                j10 = -1;
                j11 = -1;
            }
            return new c(this.requiredNetworkType, this.requiresCharging, this.requiresDeviceIdle, this.requiresBatteryNotLow, this.requiresStorageNotLow, j10, j11, setK);
        }

        @dl.d
        public final a c(@dl.d NetworkType networkType) {
            f0.p(networkType, "networkType");
            this.requiredNetworkType = networkType;
            return this;
        }

        @dl.d
        public final a d(boolean requiresBatteryNotLow) {
            this.requiresBatteryNotLow = requiresBatteryNotLow;
            return this;
        }

        @dl.d
        public final a e(boolean requiresCharging) {
            this.requiresCharging = requiresCharging;
            return this;
        }

        @dl.d
        @w0(23)
        public final a f(boolean requiresDeviceIdle) {
            this.requiresDeviceIdle = requiresDeviceIdle;
            return this;
        }

        @dl.d
        public final a g(boolean requiresStorageNotLow) {
            this.requiresStorageNotLow = requiresStorageNotLow;
            return this;
        }

        @dl.d
        @w0(24)
        public final a h(long duration, @dl.d TimeUnit timeUnit) {
            f0.p(timeUnit, "timeUnit");
            this.triggerContentMaxDelay = timeUnit.toMillis(duration);
            return this;
        }

        @dl.d
        @w0(26)
        public final a i(@dl.d Duration duration) {
            f0.p(duration, "duration");
            this.triggerContentMaxDelay = androidx.work.impl.utils.d.a(duration);
            return this;
        }

        @dl.d
        @w0(24)
        public final a j(long duration, @dl.d TimeUnit timeUnit) {
            f0.p(timeUnit, "timeUnit");
            this.triggerContentUpdateDelay = timeUnit.toMillis(duration);
            return this;
        }

        @dl.d
        @w0(26)
        public final a k(@dl.d Duration duration) {
            f0.p(duration, "duration");
            this.triggerContentUpdateDelay = androidx.work.impl.utils.d.a(duration);
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.work.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Constraints.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/work/c$c;", "", "other", "", "equals", "", "hashCode", "Landroid/net/Uri;", ak.av, "Landroid/net/Uri;", "()Landroid/net/Uri;", "uri", "b", "Z", "()Z", "isTriggeredForDescendants", "<init>", "(Landroid/net/Uri;Z)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class C0229c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Uri uri;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isTriggeredForDescendants;

        public C0229c(@dl.d Uri uri, boolean z10) {
            f0.p(uri, "uri");
            this.uri = uri;
            this.isTriggeredForDescendants = z10;
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsTriggeredForDescendants() {
            return this.isTriggeredForDescendants;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!f0.g(C0229c.class, other != null ? other.getClass() : null)) {
                return false;
            }
            f0.n(other, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            C0229c c0229c = (C0229c) other;
            return f0.g(this.uri, c0229c.uri) && this.isTriggeredForDescendants == c0229c.isTriggeredForDescendants;
        }

        public int hashCode() {
            return (this.uri.hashCode() * 31) + b0.a(this.isTriggeredForDescendants);
        }
    }

    public c() {
        this(null, false, false, false, false, 0L, 0L, null, 255, null);
    }

    public c(@dl.d NetworkType requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, @dl.d Set<C0229c> contentUriTriggers) {
        f0.p(requiredNetworkType, "requiredNetworkType");
        f0.p(contentUriTriggers, "contentUriTriggers");
        this.requiredNetworkType = requiredNetworkType;
        this.requiresCharging = z10;
        this.requiresDeviceIdle = z11;
        this.requiresBatteryNotLow = z12;
        this.requiresStorageNotLow = z13;
        this.contentTriggerUpdateDelayMillis = j10;
        this.contentTriggerMaxDelayMillis = j11;
        this.contentUriTriggers = contentUriTriggers;
    }

    public /* synthetic */ c(NetworkType networkType, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set set, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) == 0 ? z13 : false, (i10 & 32) != 0 ? -1L : j10, (i10 & 64) == 0 ? j11 : -1L, (i10 & 128) != 0 ? d1.k() : set);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(@dl.d c other) {
        f0.p(other, "other");
        boolean z10 = other.requiresCharging;
        boolean z11 = other.requiresDeviceIdle;
        this(other.requiredNetworkType, z10, z11, other.requiresBatteryNotLow, other.requiresStorageNotLow, other.contentTriggerUpdateDelayMillis, other.contentTriggerMaxDelayMillis, other.contentUriTriggers);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getContentTriggerMaxDelayMillis() {
        return this.contentTriggerMaxDelayMillis;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getContentTriggerUpdateDelayMillis() {
        return this.contentTriggerUpdateDelayMillis;
    }

    @dl.d
    public final Set<C0229c> c() {
        return this.contentUriTriggers;
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final NetworkType getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean e() {
        return !this.contentUriTriggers.isEmpty();
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !f0.g(c.class, other.getClass())) {
            return false;
        }
        c cVar = (c) other;
        if (this.requiresCharging == cVar.requiresCharging && this.requiresDeviceIdle == cVar.requiresDeviceIdle && this.requiresBatteryNotLow == cVar.requiresBatteryNotLow && this.requiresStorageNotLow == cVar.requiresStorageNotLow && this.contentTriggerUpdateDelayMillis == cVar.contentTriggerUpdateDelayMillis && this.contentTriggerMaxDelayMillis == cVar.contentTriggerMaxDelayMillis && this.requiredNetworkType == cVar.requiredNetworkType) {
            return f0.g(this.contentUriTriggers, cVar.contentUriTriggers);
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getRequiresBatteryNotLow() {
        return this.requiresBatteryNotLow;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getRequiresCharging() {
        return this.requiresCharging;
    }

    @w0(23)
    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getRequiresDeviceIdle() {
        return this.requiresDeviceIdle;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.requiredNetworkType.hashCode() * 31) + (this.requiresCharging ? 1 : 0)) * 31) + (this.requiresDeviceIdle ? 1 : 0)) * 31) + (this.requiresBatteryNotLow ? 1 : 0)) * 31) + (this.requiresStorageNotLow ? 1 : 0)) * 31;
        long j10 = this.contentTriggerUpdateDelayMillis;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.contentTriggerMaxDelayMillis;
        return ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.contentUriTriggers.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getRequiresStorageNotLow() {
        return this.requiresStorageNotLow;
    }
}
