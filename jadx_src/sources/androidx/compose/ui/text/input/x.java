package androidx.compose.ui.text.input;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: OffsetMapping.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/x;", "", "", androidx.constraintlayout.core.motion.utils.w.c.R, "b", ak.av, "ui-text_release"}, k = 1, mv = {1, 7, 1})
public interface x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f16791a;

    /* JADX INFO: renamed from: androidx.compose.ui.text.input.x$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: OffsetMapping.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/input/x$a;", "", "Landroidx/compose/ui/text/input/x;", "b", "Landroidx/compose/ui/text/input/x;", ak.av, "()Landroidx/compose/ui/text/input/x;", "Identity", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f16791a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final x Identity = new C0106a();

        /* JADX INFO: renamed from: androidx.compose.ui.text.input.x$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: OffsetMapping.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"androidx/compose/ui/text/input/x$a$a", "Landroidx/compose/ui/text/input/x;", "", androidx.constraintlayout.core.motion.utils.w.c.R, "b", ak.av, "ui-text_release"}, k = 1, mv = {1, 7, 1})
        public static final class C0106a implements x {
            C0106a() {
            }

            @Override // androidx.compose.ui.text.input.x
            public int a(int offset) {
                return offset;
            }

            @Override // androidx.compose.ui.text.input.x
            public int b(int offset) {
                return offset;
            }
        }

        private Companion() {
        }

        @dl.d
        public final x a() {
            return Identity;
        }
    }

    int a(int offset);

    int b(int offset);
}
