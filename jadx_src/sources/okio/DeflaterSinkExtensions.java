package okio;

import dl.d;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import xh.h;

/* JADX INFO: renamed from: okio.-DeflaterSinkExtensions, reason: invalid class name */
/* JADX INFO: compiled from: DeflaterSink.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "-DeflaterSinkExtensions")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\u0005"}, d2 = {"deflate", "Lokio/DeflaterSink;", "Lokio/Sink;", "deflater", "Ljava/util/zip/Deflater;", "okio"}, k = 2, mv = {1, 4, 0})
public final class DeflaterSinkExtensions {
    @d
    public static final DeflaterSink deflate(@d Sink deflate, @d Deflater deflater) {
        f0.p(deflate, "$this$deflate");
        f0.p(deflater, "deflater");
        return new DeflaterSink(deflate, deflater);
    }

    public static /* synthetic */ DeflaterSink deflate$default(Sink deflate, Deflater deflater, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            deflater = new Deflater();
        }
        f0.p(deflate, "$this$deflate");
        f0.p(deflater, "deflater");
        return new DeflaterSink(deflate, deflater);
    }
}
