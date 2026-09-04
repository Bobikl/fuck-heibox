package androidx.compose.ui.text.platform.extensions;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: androidx.compose.ui.text.platform.extensions.d, reason: from toString */
/* JADX INFO: compiled from: SpannableExtensions.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0002\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0003HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/platform/extensions/d;", "", ak.av, "", "b", ak.aF, com.google.android.exoplayer2.text.ttml.d.f49805s, com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "d", "", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "I", RXScreenCaptureService.KEY_HEIGHT, "()I", "f", "<init>", "(Ljava/lang/Object;II)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class SpanRange {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final Object span;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int start;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int end;

    public SpanRange(@dl.d Object span, int i10, int i11) {
        f0.p(span, "span");
        this.span = span;
        this.start = i10;
        this.end = i11;
    }

    public static /* synthetic */ SpanRange e(SpanRange spanRange, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            obj = spanRange.span;
        }
        if ((i12 & 2) != 0) {
            i10 = spanRange.start;
        }
        if ((i12 & 4) != 0) {
            i11 = spanRange.end;
        }
        return spanRange.d(obj, i10, i11);
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getSpan() {
        return this.span;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    @dl.d
    public final SpanRange d(@dl.d Object span, int start, int end) {
        f0.p(span, "span");
        return new SpanRange(span, start, end);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpanRange)) {
            return false;
        }
        SpanRange spanRange = (SpanRange) other;
        return f0.g(this.span, spanRange.span) && this.start == spanRange.start && this.end == spanRange.end;
    }

    public final int f() {
        return this.end;
    }

    @dl.d
    public final Object g() {
        return this.span;
    }

    public final int h() {
        return this.start;
    }

    public int hashCode() {
        return (((this.span.hashCode() * 31) + this.start) * 31) + this.end;
    }

    @dl.d
    public String toString() {
        return "SpanRange(span=" + this.span + ", start=" + this.start + ", end=" + this.end + ')';
    }
}
