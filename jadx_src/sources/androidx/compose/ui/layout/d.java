package androidx.compose.ui.layout;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;

/* JADX INFO: compiled from: ContentScale.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a%\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a%\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a%\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lb1/m;", "srcSize", "dstSize", "", "f", "(JJ)F", "g", RXScreenCaptureService.KEY_HEIGHT, "e", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(long j10, long j11) {
        return b1.m.m(j11) / b1.m.m(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(long j10, long j11) {
        return Math.max(h(j10, j11), e(j10, j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(long j10, long j11) {
        return Math.min(h(j10, j11), e(j10, j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(long j10, long j11) {
        return b1.m.t(j11) / b1.m.t(j10);
    }
}
