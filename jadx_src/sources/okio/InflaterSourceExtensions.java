package okio;

import dl.d;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import xh.h;

/* JADX INFO: renamed from: okio.-InflaterSourceExtensions, reason: invalid class name */
/* JADX INFO: compiled from: InflaterSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "-InflaterSourceExtensions")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\u0005"}, d2 = {"inflate", "Lokio/InflaterSource;", "Lokio/Source;", "inflater", "Ljava/util/zip/Inflater;", "okio"}, k = 2, mv = {1, 4, 0})
public final class InflaterSourceExtensions {
    @d
    public static final InflaterSource inflate(@d Source inflate, @d Inflater inflater) {
        f0.p(inflate, "$this$inflate");
        f0.p(inflater, "inflater");
        return new InflaterSource(inflate, inflater);
    }

    public static /* synthetic */ InflaterSource inflate$default(Source inflate, Inflater inflater, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            inflater = new Inflater();
        }
        f0.p(inflate, "$this$inflate");
        f0.p(inflater, "inflater");
        return new InflaterSource(inflate, inflater);
    }
}
