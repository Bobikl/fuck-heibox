package androidx.compose.foundation.text.selection;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: SelectionRegistrar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H&J-\u0010\u0011\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H&J=\u0010\u0018\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000fH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0005H&J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H&R \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001d0\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/o;", "", "Landroidx/compose/foundation/text/selection/i;", "selectable", "j", "Lkotlin/b2;", ak.aF, "", "e", "selectableId", "b", "Landroidx/compose/ui/layout/q;", "layoutCoordinates", "Lb1/f;", "startPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", ak.av, "(Landroidx/compose/ui/layout/q;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "i", "newPosition", "previousPosition", "", "isStartHandle", "g", "(Landroidx/compose/ui/layout/q;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "d", RXScreenCaptureService.KEY_HEIGHT, "", "Landroidx/compose/foundation/text/selection/j;", "f", "()Ljava/util/Map;", "subselections", "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f8377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f8376b = 0;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.o$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SelectionRegistrar.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/selection/o$a;", "", "", "b", "J", "InvalidSelectableId", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f8377a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final long InvalidSelectableId = 0;

        private Companion() {
        }
    }

    void a(@dl.d androidx.compose.ui.layout.q layoutCoordinates, long startPosition, @dl.d SelectionAdjustment adjustment);

    void b(long j10);

    void c(@dl.d i iVar);

    void d();

    long e();

    @dl.d
    Map<Long, Selection> f();

    boolean g(@dl.d androidx.compose.ui.layout.q layoutCoordinates, long newPosition, long previousPosition, boolean isStartHandle, @dl.d SelectionAdjustment adjustment);

    void h(long j10);

    void i(long j10);

    @dl.d
    i j(@dl.d i selectable);
}
