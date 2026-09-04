package androidx.compose.foundation.text;

import com.umeng.analytics.pro.ak;
import com.umeng.message.common.UPushNotificationChannel;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: KeyboardActions.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0016Bµ\u0001\u0012\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005\u0012\u001b\b\u0002\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005\u0012\u001b\b\u0002\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005\u0012\u001b\b\u0002\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005\u0012\u001b\b\u0002\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005\u0012\u001b\b\u0002\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0014\u0010\u0015R*\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR*\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR*\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR*\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR*\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\tR*\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0013\u0010\t¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/text/i;", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/h;", "Lkotlin/b2;", "Lkotlin/t;", "onDone", "Lyh/l;", "b", "()Lyh/l;", "onGo", ak.aF, "onNext", "d", "onPrevious", "e", "onSearch", "f", "onSend", "g", "<init>", "(Lyh/l;Lyh/l;Lyh/l;Lyh/l;Lyh/l;Lyh/l;)V", ak.av, "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f8073h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final yh.l<h, b2> f8075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final yh.l<h, b2> f8076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final yh.l<h, b2> f8077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final yh.l<h, b2> f8078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private final yh.l<h, b2> f8079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private final yh.l<h, b2> f8080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final i f8074i = new i(null, null, null, null, null, null, 63, null);

    /* JADX INFO: renamed from: androidx.compose.foundation.text.i$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: KeyboardActions.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/i$a;", "", "Landroidx/compose/foundation/text/i;", UPushNotificationChannel.DEFAULT_NOTIFICATION_CHANNEL_NAME, "Landroidx/compose/foundation/text/i;", ak.av, "()Landroidx/compose/foundation/text/i;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final i a() {
            return i.f8074i;
        }
    }

    public i() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@dl.e yh.l<? super h, b2> lVar, @dl.e yh.l<? super h, b2> lVar2, @dl.e yh.l<? super h, b2> lVar3, @dl.e yh.l<? super h, b2> lVar4, @dl.e yh.l<? super h, b2> lVar5, @dl.e yh.l<? super h, b2> lVar6) {
        this.f8075a = lVar;
        this.f8076b = lVar2;
        this.f8077c = lVar3;
        this.f8078d = lVar4;
        this.f8079e = lVar5;
        this.f8080f = lVar6;
    }

    public /* synthetic */ i(yh.l lVar, yh.l lVar2, yh.l lVar3, yh.l lVar4, yh.l lVar5, yh.l lVar6, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : lVar, (i10 & 2) != 0 ? null : lVar2, (i10 & 4) != 0 ? null : lVar3, (i10 & 8) != 0 ? null : lVar4, (i10 & 16) != 0 ? null : lVar5, (i10 & 32) != 0 ? null : lVar6);
    }

    @dl.e
    public final yh.l<h, b2> b() {
        return this.f8075a;
    }

    @dl.e
    public final yh.l<h, b2> c() {
        return this.f8076b;
    }

    @dl.e
    public final yh.l<h, b2> d() {
        return this.f8077c;
    }

    @dl.e
    public final yh.l<h, b2> e() {
        return this.f8078d;
    }

    @dl.e
    public final yh.l<h, b2> f() {
        return this.f8079e;
    }

    @dl.e
    public final yh.l<h, b2> g() {
        return this.f8080f;
    }
}
