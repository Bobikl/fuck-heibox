package androidx.compose.ui.text;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.plugin.editing.SpellCheckPlugin;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.text.p, reason: from toString */
/* JADX INFO: compiled from: MultiParagraphIntrinsics.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/p;", "", "Landroidx/compose/ui/text/r;", ak.av, "", "b", ak.aF, "intrinsics", SpellCheckPlugin.START_INDEX_KEY, SpellCheckPlugin.END_INDEX_KEY, "d", "", "toString", "hashCode", "other", "", "equals", "Landroidx/compose/ui/text/r;", "g", "()Landroidx/compose/ui/text/r;", "I", RXScreenCaptureService.KEY_HEIGHT, "()I", "f", "<init>", "(Landroidx/compose/ui/text/r;II)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ParagraphIntrinsicInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final r intrinsics;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int startIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int endIndex;

    public ParagraphIntrinsicInfo(@dl.d r intrinsics, int i10, int i11) {
        kotlin.jvm.internal.f0.p(intrinsics, "intrinsics");
        this.intrinsics = intrinsics;
        this.startIndex = i10;
        this.endIndex = i11;
    }

    public static /* synthetic */ ParagraphIntrinsicInfo e(ParagraphIntrinsicInfo paragraphIntrinsicInfo, r rVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            rVar = paragraphIntrinsicInfo.intrinsics;
        }
        if ((i12 & 2) != 0) {
            i10 = paragraphIntrinsicInfo.startIndex;
        }
        if ((i12 & 4) != 0) {
            i11 = paragraphIntrinsicInfo.endIndex;
        }
        return paragraphIntrinsicInfo.d(rVar, i10, i11);
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final r getIntrinsics() {
        return this.intrinsics;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getEndIndex() {
        return this.endIndex;
    }

    @dl.d
    public final ParagraphIntrinsicInfo d(@dl.d r intrinsics, int startIndex, int endIndex) {
        kotlin.jvm.internal.f0.p(intrinsics, "intrinsics");
        return new ParagraphIntrinsicInfo(intrinsics, startIndex, endIndex);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParagraphIntrinsicInfo)) {
            return false;
        }
        ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) other;
        return kotlin.jvm.internal.f0.g(this.intrinsics, paragraphIntrinsicInfo.intrinsics) && this.startIndex == paragraphIntrinsicInfo.startIndex && this.endIndex == paragraphIntrinsicInfo.endIndex;
    }

    public final int f() {
        return this.endIndex;
    }

    @dl.d
    public final r g() {
        return this.intrinsics;
    }

    public final int h() {
        return this.startIndex;
    }

    public int hashCode() {
        return (((this.intrinsics.hashCode() * 31) + this.startIndex) * 31) + this.endIndex;
    }

    @dl.d
    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.intrinsics + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ')';
    }
}
