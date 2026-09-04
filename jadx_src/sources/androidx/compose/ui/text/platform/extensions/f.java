package androidx.compose.ui.text.platform.extensions;

import android.text.style.TtsSpan;
import androidx.compose.ui.text.VerbatimTtsAnnotation;
import androidx.compose.ui.text.s0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TtsAnnotationExtensions.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/s0;", "Landroid/text/style/TtsSpan;", ak.av, "Landroidx/compose/ui/text/u0;", "b", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class f {
    @dl.d
    public static final TtsSpan a(@dl.d s0 s0Var) {
        f0.p(s0Var, "<this>");
        if (s0Var instanceof VerbatimTtsAnnotation) {
            return b((VerbatimTtsAnnotation) s0Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    @dl.d
    public static final TtsSpan b(@dl.d VerbatimTtsAnnotation verbatimTtsAnnotation) {
        f0.p(verbatimTtsAnnotation, "<this>");
        TtsSpan ttsSpanBuild = new TtsSpan.VerbatimBuilder(verbatimTtsAnnotation.getVerbatim()).build();
        f0.o(ttsSpanBuild, "builder.build()");
        return ttsSpanBuild;
    }
}
