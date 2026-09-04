package androidx.room;

import kotlin.Metadata;

/* JADX INFO: compiled from: AutoClosingRoomOpenHelperFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/room/d;", "Lj3/h$c;", "Lj3/h$b;", "configuration", "Landroidx/room/AutoClosingRoomOpenHelper;", "b", "Landroidx/room/c;", "Landroidx/room/c;", "autoCloser", "delegate", "<init>", "(Lj3/h$c;Landroidx/room/c;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class d implements j3.h.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final j3.h.c f27095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final c autoCloser;

    public d(@dl.d j3.h.c delegate, @dl.d c autoCloser) {
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        kotlin.jvm.internal.f0.p(autoCloser, "autoCloser");
        this.f27095a = delegate;
        this.autoCloser = autoCloser;
    }

    @Override // j3.h.c
    @dl.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AutoClosingRoomOpenHelper a(@dl.d j3.h.b configuration) {
        kotlin.jvm.internal.f0.p(configuration, "configuration");
        return new AutoClosingRoomOpenHelper(this.f27095a.a(configuration), this.autoCloser);
    }
}
