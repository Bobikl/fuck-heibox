package androidx.compose.ui.platform;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: GlobalSnapshotManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/GlobalSnapshotManager;", "", "Lkotlin/b2;", ak.av, "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "started", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class GlobalSnapshotManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final GlobalSnapshotManager f15641a = new GlobalSnapshotManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final AtomicBoolean started = new AtomicBoolean(false);

    private GlobalSnapshotManager() {
    }

    public final void a() {
        if (started.compareAndSet(false, true)) {
            final kotlinx.coroutines.channels.k kVarD = kotlinx.coroutines.channels.m.d(-1, null, null, 6, null);
            kotlinx.coroutines.k.f(kotlinx.coroutines.r0.a(AndroidUiDispatcher.INSTANCE.b()), null, null, new GlobalSnapshotManager$ensureStarted$1(kVarD, null), 3, null);
            androidx.compose.runtime.snapshots.f.INSTANCE.i(new yh.l<Object, kotlin.b2>() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(Object obj) {
                    invoke2(obj);
                    return kotlin.b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@dl.d Object it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    kVarD.v(kotlin.b2.f124493a);
                }
            });
        }
    }
}
