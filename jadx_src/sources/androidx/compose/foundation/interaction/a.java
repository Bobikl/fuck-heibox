package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.o;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DragInteraction.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/a;", "Landroidx/compose/foundation/interaction/d;", ak.av, "b", ak.aF, "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface a extends d {

    /* JADX INFO: renamed from: androidx.compose.foundation.interaction.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DragInteraction.kt */
    @o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/interaction/a$a;", "Landroidx/compose/foundation/interaction/a;", "Landroidx/compose/foundation/interaction/a$b;", ak.av, "Landroidx/compose/foundation/interaction/a$b;", "()Landroidx/compose/foundation/interaction/a$b;", com.google.android.exoplayer2.text.ttml.d.f49798o0, "<init>", "(Landroidx/compose/foundation/interaction/a$b;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class C0046a implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f5856b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final b start;

        public C0046a(@dl.d b start) {
            f0.p(start, "start");
            this.start = start;
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getStart() {
            return this.start;
        }
    }

    /* JADX INFO: compiled from: DragInteraction.kt */
    @o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/a$b;", "Landroidx/compose/foundation/interaction/a;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f5858a = 0;
    }

    /* JADX INFO: compiled from: DragInteraction.kt */
    @o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/interaction/a$c;", "Landroidx/compose/foundation/interaction/a;", "Landroidx/compose/foundation/interaction/a$b;", ak.av, "Landroidx/compose/foundation/interaction/a$b;", "()Landroidx/compose/foundation/interaction/a$b;", com.google.android.exoplayer2.text.ttml.d.f49798o0, "<init>", "(Landroidx/compose/foundation/interaction/a$b;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f5859b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final b start;

        public c(@dl.d b start) {
            f0.p(start, "start");
            this.start = start;
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getStart() {
            return this.start;
        }
    }
}
