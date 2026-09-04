package androidx.compose.ui.text.input;

import androidx.compose.runtime.j2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: VisualTransformation.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/m0;", "", "Landroidx/compose/ui/text/d;", "text", "Landroidx/compose/ui/text/input/l0;", ak.av, "ui-text_release"}, k = 1, mv = {1, 7, 1})
public interface m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f16751a;

    /* JADX INFO: renamed from: androidx.compose.ui.text.input.m0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: VisualTransformation.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\bR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/input/m0$a;", "", "Landroidx/compose/ui/text/input/m0;", "b", "Landroidx/compose/ui/text/input/m0;", ak.av, "()Landroidx/compose/ui/text/input/m0;", "getNone$annotations", "()V", d4.d.f108133a, "<init>", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f16751a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final m0 None = C0105a.f16753b;

        /* JADX INFO: renamed from: androidx.compose.ui.text.input.m0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: VisualTransformation.kt */
        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/text/d;", "text", "Landroidx/compose/ui/text/input/l0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class C0105a implements m0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0105a f16753b = new C0105a();

            C0105a() {
            }

            @Override // androidx.compose.ui.text.input.m0
            @dl.d
            public final TransformedText a(@dl.d androidx.compose.ui.text.d text) {
                kotlin.jvm.internal.f0.p(text, "text");
                return new TransformedText(text, x.INSTANCE.a());
            }
        }

        private Companion() {
        }

        @j2
        public static /* synthetic */ void b() {
        }

        @dl.d
        public final m0 a() {
            return None;
        }
    }

    @dl.d
    TransformedText a(@dl.d androidx.compose.ui.text.d text);
}
