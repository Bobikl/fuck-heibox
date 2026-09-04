package androidx.compose.foundation.gestures;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/gestures/c;", "", "<init>", "()V", ak.av, "b", ak.aF, "d", "Landroidx/compose/foundation/gestures/c$a;", "Landroidx/compose/foundation/gestures/c$b;", "Landroidx/compose/foundation/gestures/c$c;", "Landroidx/compose/foundation/gestures/c$d;", "foundation_release"}, k = 1, mv = {1, 7, 1})
public abstract class c {

    /* JADX INFO: compiled from: Draggable.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/c$a;", "Landroidx/compose/foundation/gestures/c;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f5777a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f5778b = 0;

        private a() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: Draggable.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/gestures/c$b;", "Landroidx/compose/foundation/gestures/c;", "Lb1/f;", ak.av, "J", "()J", "delta", "<init>", "(JLkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f5779b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long delta;

        private b(long j10) {
            super(null);
            this.delta = j10;
        }

        public /* synthetic */ b(long j10, u uVar) {
            this(j10);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getDelta() {
            return this.delta;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Draggable.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/gestures/c$c;", "Landroidx/compose/foundation/gestures/c;", "Lb1/f;", ak.av, "J", "()J", "startPoint", "<init>", "(JLkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class C0045c extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f5781b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long startPoint;

        private C0045c(long j10) {
            super(null);
            this.startPoint = j10;
        }

        public /* synthetic */ C0045c(long j10, u uVar) {
            this(j10);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getStartPoint() {
            return this.startPoint;
        }
    }

    /* JADX INFO: compiled from: Draggable.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/gestures/c$d;", "Landroidx/compose/foundation/gestures/c;", "Ls1/x;", ak.av, "J", "()J", "velocity", "<init>", "(JLkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f5783b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long velocity;

        private d(long j10) {
            super(null);
            this.velocity = j10;
        }

        public /* synthetic */ d(long j10, u uVar) {
            this(j10);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getVelocity() {
            return this.velocity;
        }
    }

    private c() {
    }

    public /* synthetic */ c(u uVar) {
        this();
    }
}
