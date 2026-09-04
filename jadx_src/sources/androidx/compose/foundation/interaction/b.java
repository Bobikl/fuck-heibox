package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.o;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FocusInteraction.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/b;", "Landroidx/compose/foundation/interaction/d;", ak.av, "b", "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface b extends d {

    /* JADX INFO: compiled from: FocusInteraction.kt */
    @o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/b$a;", "Landroidx/compose/foundation/interaction/b;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f5861a = 0;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.interaction.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FocusInteraction.kt */
    @o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/interaction/b$b;", "Landroidx/compose/foundation/interaction/b;", "Landroidx/compose/foundation/interaction/b$a;", ak.av, "Landroidx/compose/foundation/interaction/b$a;", "()Landroidx/compose/foundation/interaction/b$a;", "focus", "<init>", "(Landroidx/compose/foundation/interaction/b$a;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class C0047b implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f5862b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final a focus;

        public C0047b(@dl.d a focus) {
            f0.p(focus, "focus");
            this.focus = focus;
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getFocus() {
            return this.focus;
        }
    }
}
