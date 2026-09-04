package okio;

import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import xh.h;

/* JADX INFO: renamed from: okio.-GzipSinkExtensions, reason: invalid class name */
/* JADX INFO: compiled from: GzipSink.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "-GzipSinkExtensions")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\b¨\u0006\u0003"}, d2 = {"gzip", "Lokio/GzipSink;", "Lokio/Sink;", "okio"}, k = 2, mv = {1, 4, 0})
public final class GzipSinkExtensions {
    @d
    public static final GzipSink gzip(@d Sink gzip) {
        f0.p(gzip, "$this$gzip");
        return new GzipSink(gzip);
    }
}
