package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.o;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PressInteraction.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/i;", "Landroidx/compose/foundation/interaction/d;", ak.av, "b", ak.aF, "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface i extends d {

    /* JADX INFO: compiled from: PressInteraction.kt */
    @o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/interaction/i$a;", "Landroidx/compose/foundation/interaction/i;", "Landroidx/compose/foundation/interaction/i$b;", ak.av, "Landroidx/compose/foundation/interaction/i$b;", "()Landroidx/compose/foundation/interaction/i$b;", "press", "<init>", "(Landroidx/compose/foundation/interaction/i$b;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f5868b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final b press;

        public a(@dl.d b press) {
            f0.p(press, "press");
            this.press = press;
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getPress() {
            return this.press;
        }
    }

    /* JADX INFO: compiled from: PressInteraction.kt */
    @o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/interaction/i$b;", "Landroidx/compose/foundation/interaction/i;", "Lb1/f;", ak.av, "J", "()J", "pressPosition", "<init>", "(JLkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f5870b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long pressPosition;

        private b(long j10) {
            this.pressPosition = j10;
        }

        public /* synthetic */ b(long j10, u uVar) {
            this(j10);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getPressPosition() {
            return this.pressPosition;
        }
    }

    /* JADX INFO: compiled from: PressInteraction.kt */
    @o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/interaction/i$c;", "Landroidx/compose/foundation/interaction/i;", "Landroidx/compose/foundation/interaction/i$b;", ak.av, "Landroidx/compose/foundation/interaction/i$b;", "()Landroidx/compose/foundation/interaction/i$b;", "press", "<init>", "(Landroidx/compose/foundation/interaction/i$b;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f5872b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final b press;

        public c(@dl.d b press) {
            f0.p(press, "press");
            this.press = press;
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getPress() {
            return this.press;
        }
    }
}
