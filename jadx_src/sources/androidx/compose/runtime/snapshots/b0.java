package androidx.compose.runtime.snapshots;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\"\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/b0;", "", "Landroidx/compose/runtime/snapshots/c0;", "value", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "previous", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "applied", "j", "l", "()Landroidx/compose/runtime/snapshots/c0;", "firstStateRecord", "runtime_release"}, k = 1, mv = {1, 7, 1})
public interface b0 {

    /* JADX INFO: compiled from: Snapshot.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @dl.e
        @Deprecated
        public static c0 a(@dl.d b0 b0Var, @dl.d c0 previous, @dl.d c0 current, @dl.d c0 applied) {
            kotlin.jvm.internal.f0.p(previous, "previous");
            kotlin.jvm.internal.f0.p(current, "current");
            kotlin.jvm.internal.f0.p(applied, "applied");
            return a0.a(b0Var, previous, current, applied);
        }
    }

    void h(@dl.d c0 c0Var);

    @dl.e
    c0 j(@dl.d c0 previous, @dl.d c0 current, @dl.d c0 applied);

    @dl.d
    c0 l();
}
