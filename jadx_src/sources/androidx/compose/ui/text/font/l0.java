package androidx.compose.ui.text.font;

import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: FontWeight.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/text/font/k0;", com.google.android.exoplayer2.text.ttml.d.f49798o0, "stop", "", Progress.G, ak.av, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class l0 {
    @dl.d
    public static final FontWeight a(@dl.d FontWeight start, @dl.d FontWeight stop, float f10) {
        kotlin.jvm.internal.f0.p(start, "start");
        kotlin.jvm.internal.f0.p(stop, "stop");
        return new FontWeight(fi.u.I(u1.d.b(start.w(), stop.w(), f10), 1, 1000));
    }
}
