package androidx.compose.ui.text.style;

import androidx.compose.ui.text.SpanStyleKt;
import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextIndent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/text/style/o;", com.google.android.exoplayer2.text.ttml.d.f49798o0, "stop", "", Progress.G, ak.av, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class p {
    @dl.d
    public static final TextIndent a(@dl.d TextIndent start, @dl.d TextIndent stop, float f10) {
        f0.p(start, "start");
        f0.p(stop, "stop");
        return new TextIndent(SpanStyleKt.e(start.getFirstLine(), stop.getFirstLine(), f10), SpanStyleKt.e(start.getRestLine(), stop.getRestLine(), f10), null);
    }
}
