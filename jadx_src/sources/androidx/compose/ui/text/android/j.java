package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextUtils;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: LayoutHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0004J\u0010\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u0002J\u001e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b$\u0010(¨\u0006,"}, d2 = {"Landroidx/compose/ui/text/android/j;", "", "", androidx.constraintlayout.core.motion.utils.w.c.R, "", "primary", "", "b", "lineEnd", "l", "paragraphIndex", "Ljava/text/Bidi;", ak.av, "upstream", "g", "i", "f", "k", "usePrimaryDirection", ak.aF, "", "j", "Landroid/text/Layout;", "Landroid/text/Layout;", "d", "()Landroid/text/Layout;", com.google.android.exoplayer2.text.ttml.d.f49813w, "", "Ljava/util/List;", "paragraphEnds", "", "paragraphBidi", "", "[Z", "bidiProcessedParagraphs", "", "e", "[C", "tmpBuffer", "I", "()I", "paragraphCount", "<init>", "(Landroid/text/Layout;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@g
@androidx.compose.runtime.internal.o(parameters = 0)
public final class j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f16340g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Layout layout;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<Integer> paragraphEnds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<Bidi> paragraphBidi;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final boolean[] bidiProcessedParagraphs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private char[] tmpBuffer;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int paragraphCount;

    /* JADX INFO: renamed from: androidx.compose.ui.text.android.j$a, reason: from toString */
    /* JADX INFO: compiled from: LayoutHelper.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/android/j$a;", "", "", ak.av, "b", "", ak.aF, com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "isRtl", "d", "", "toString", "hashCode", "other", "equals", "I", "g", "()I", "f", "Z", RXScreenCaptureService.KEY_HEIGHT, "()Z", "<init>", "(IIZ)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class BidiRun {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int start;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int end;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isRtl;

        public BidiRun(int i10, int i11, boolean z10) {
            this.start = i10;
            this.end = i11;
            this.isRtl = z10;
        }

        public static /* synthetic */ BidiRun e(BidiRun bidiRun, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = bidiRun.start;
            }
            if ((i12 & 2) != 0) {
                i11 = bidiRun.end;
            }
            if ((i12 & 4) != 0) {
                z10 = bidiRun.isRtl;
            }
            return bidiRun.d(i10, i11, z10);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsRtl() {
            return this.isRtl;
        }

        @dl.d
        public final BidiRun d(int start, int end, boolean isRtl) {
            return new BidiRun(start, end, isRtl);
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BidiRun)) {
                return false;
            }
            BidiRun bidiRun = (BidiRun) other;
            return this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl;
        }

        public final int f() {
            return this.end;
        }

        public final int g() {
            return this.start;
        }

        public final boolean h() {
            return this.isRtl;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public int hashCode() {
            int i10 = ((this.start * 31) + this.end) * 31;
            boolean z10 = this.isRtl;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return i10 + r10;
        }

        @dl.d
        public String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }
    }

    public j(@dl.d Layout layout) {
        kotlin.jvm.internal.f0.p(layout, "layout");
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            CharSequence text = this.layout.getText();
            kotlin.jvm.internal.f0.o(text, "layout.text");
            int iR3 = StringsKt__StringsKt.r3(text, '\n', length, false, 4, null);
            length = iR3 < 0 ? this.layout.getText().length() : iR3 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    private final float b(int offset, boolean primary) {
        return primary ? this.layout.getPrimaryHorizontal(offset) : this.layout.getSecondaryHorizontal(offset);
    }

    public static /* synthetic */ int h(j jVar, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return jVar.g(i10, z10);
    }

    private final int l(int lineEnd) {
        while (lineEnd > 0 && j(this.layout.getText().charAt(lineEnd - 1))) {
            lineEnd--;
        }
        return lineEnd;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    @dl.e
    public final Bidi a(int paragraphIndex) {
        Bidi bidi;
        if (this.bidiProcessedParagraphs[paragraphIndex]) {
            return this.paragraphBidi.get(paragraphIndex);
        }
        int iIntValue = paragraphIndex == 0 ? 0 : this.paragraphEnds.get(paragraphIndex - 1).intValue();
        int iIntValue2 = this.paragraphEnds.get(paragraphIndex).intValue();
        int i10 = iIntValue2 - iIntValue;
        char[] cArr = this.tmpBuffer;
        if (cArr == null || cArr.length < i10) {
            cArr = new char[i10];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(this.layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i10)) {
            bidi = new Bidi(cArr2, 0, null, 0, i10, k(paragraphIndex) ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        this.paragraphBidi.set(paragraphIndex, bidi);
        this.bidiProcessedParagraphs[paragraphIndex] = true;
        if (bidi != null) {
            char[] cArr3 = this.tmpBuffer;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.tmpBuffer = cArr2;
        return bidi;
    }

    public final float c(int offset, boolean usePrimaryDirection, boolean upstream) {
        int iL = offset;
        if (!upstream) {
            return b(offset, usePrimaryDirection);
        }
        int iA = i.a(this.layout, iL, upstream);
        int lineStart = this.layout.getLineStart(iA);
        int lineEnd = this.layout.getLineEnd(iA);
        if (iL != lineStart && iL != lineEnd) {
            return b(offset, usePrimaryDirection);
        }
        if (iL == 0 || iL == this.layout.getText().length()) {
            return b(offset, usePrimaryDirection);
        }
        int iG = g(iL, upstream);
        boolean zK = k(iG);
        int iL2 = l(lineEnd);
        int i10 = i(iG);
        int i11 = lineStart - i10;
        int i12 = iL2 - i10;
        Bidi bidiA = a(iG);
        Bidi bidiCreateLineBidi = bidiA != null ? bidiA.createLineBidi(i11, i12) : null;
        boolean z10 = false;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (usePrimaryDirection || zK == zIsRtlCharAt) {
                zK = !zK;
            }
            if (iL == lineStart) {
                z10 = zK;
            } else if (!zK) {
                z10 = true;
            }
            Layout layout = this.layout;
            return z10 ? layout.getLineLeft(iA) : layout.getLineRight(iA);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i13 = 0; i13 < runCount; i13++) {
            bidiRunArr[i13] = new BidiRun(bidiCreateLineBidi.getRunStart(i13) + lineStart, bidiCreateLineBidi.getRunLimit(i13) + lineStart, bidiCreateLineBidi.getRunLevel(i13) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i14 = 0; i14 < runCount2; i14++) {
            bArr[i14] = (byte) bidiCreateLineBidi.getRunLevel(i14);
        }
        Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
        int i15 = -1;
        if (iL == lineStart) {
            for (int i16 = 0; i16 < runCount; i16++) {
                if (bidiRunArr[i16].g() == iL) {
                    i15 = i16;
                    break;
                }
            }
            BidiRun bidiRun = bidiRunArr[i15];
            if (usePrimaryDirection || zK == bidiRun.h()) {
                zK = !zK;
            }
            if (i15 == 0 && zK) {
                return this.layout.getLineLeft(iA);
            }
            if (i15 != ArraysKt___ArraysKt.Xe(bidiRunArr) || zK) {
                return zK ? this.layout.getPrimaryHorizontal(bidiRunArr[i15 - 1].g()) : this.layout.getPrimaryHorizontal(bidiRunArr[i15 + 1].g());
            }
            return this.layout.getLineRight(iA);
        }
        if (iL > iL2) {
            iL = l(offset);
        }
        for (int i17 = 0; i17 < runCount; i17++) {
            if (bidiRunArr[i17].f() == iL) {
                i15 = i17;
                break;
            }
        }
        BidiRun bidiRun2 = bidiRunArr[i15];
        if (!usePrimaryDirection && zK != bidiRun2.h()) {
            zK = !zK;
        }
        if (i15 == 0 && zK) {
            return this.layout.getLineLeft(iA);
        }
        if (i15 != ArraysKt___ArraysKt.Xe(bidiRunArr) || zK) {
            return zK ? this.layout.getPrimaryHorizontal(bidiRunArr[i15 - 1].f()) : this.layout.getPrimaryHorizontal(bidiRunArr[i15 + 1].f());
        }
        return this.layout.getLineRight(iA);
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Layout getLayout() {
        return this.layout;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getParagraphCount() {
        return this.paragraphCount;
    }

    public final int f(@androidx.annotation.f0(from = 0) int paragraphIndex) {
        return this.paragraphEnds.get(paragraphIndex).intValue();
    }

    public final int g(@androidx.annotation.f0(from = 0) int offset, boolean upstream) {
        int iX = CollectionsKt__CollectionsKt.x(this.paragraphEnds, Integer.valueOf(offset), 0, 0, 6, null);
        int i10 = iX < 0 ? -(iX + 1) : iX + 1;
        if (upstream && i10 > 0) {
            int i11 = i10 - 1;
            if (offset == this.paragraphEnds.get(i11).intValue()) {
                return i11;
            }
        }
        return i10;
    }

    public final int i(@androidx.annotation.f0(from = 0) int paragraphIndex) {
        if (paragraphIndex == 0) {
            return 0;
        }
        return this.paragraphEnds.get(paragraphIndex - 1).intValue();
    }

    public final boolean j(char c10) {
        if (c10 == ' ' || c10 == '\n' || c10 == 5760) {
            return true;
        }
        return ((8192 <= c10 && c10 < 8203) && c10 != 8199) || c10 == 8287 || c10 == 12288;
    }

    public final boolean k(@androidx.annotation.f0(from = 0) int paragraphIndex) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(i(paragraphIndex))) == -1;
    }
}
