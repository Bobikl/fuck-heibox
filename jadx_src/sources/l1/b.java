package l1;

import android.text.Layout;
import androidx.compose.runtime.internal.o;
import androidx.compose.ui.text.android.animation.SegmentType;
import androidx.compose.ui.text.android.e;
import androidx.compose.ui.text.android.g;
import androidx.compose.ui.text.android.i;
import androidx.compose.ui.text.android.j;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SegmentBreaker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014J$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f¨\u0006\u001a"}, d2 = {"Ll1/b;", "", "Landroidx/compose/ui/text/android/j;", "layoutHelper", "", "", ak.av, "", "text", "Ljava/text/BreakIterator;", "breaker", "i", "Ll1/a;", "d", "f", "", "dropSpaces", "e", "g", ak.aF, "Landroidx/compose/ui/text/android/animation/SegmentType;", "segmentType", "b", RXScreenCaptureService.KEY_HEIGHT, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@g
@o(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final b f130826a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f130827b = 0;

    /* JADX INFO: compiled from: SegmentBreaker.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f130828a;

        static {
            int[] iArr = new int[SegmentType.values().length];
            iArr[SegmentType.Document.ordinal()] = 1;
            iArr[SegmentType.Paragraph.ordinal()] = 2;
            iArr[SegmentType.Line.ordinal()] = 3;
            iArr[SegmentType.Word.ordinal()] = 4;
            iArr[SegmentType.Character.ordinal()] = 5;
            f130828a = iArr;
        }
    }

    private b() {
    }

    private final List<Integer> a(j layoutHelper) {
        CharSequence text = layoutHelper.getLayout().getText();
        f0.o(text, "text");
        BreakIterator lineInstance = BreakIterator.getLineInstance(Locale.getDefault());
        f0.o(lineInstance, "getLineInstance(Locale.getDefault())");
        List<Integer> listI = i(text, lineInstance);
        TreeSet treeSet = new TreeSet();
        int size = listI.size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(Integer.valueOf(listI.get(i10).intValue()));
        }
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i11 = 0; i11 < paragraphCount; i11++) {
            Bidi bidiA = layoutHelper.a(i11);
            if (bidiA != null) {
                int i12 = layoutHelper.i(i11);
                int runCount = bidiA.getRunCount();
                for (int i13 = 0; i13 < runCount; i13++) {
                    treeSet.add(Integer.valueOf(bidiA.getRunStart(i13) + i12));
                }
            }
        }
        return CollectionsKt___CollectionsKt.Q5(treeSet);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ba  */
    private final List<Segment> c(j layoutHelper, boolean dropSpaces) {
        ArrayList arrayList = new ArrayList();
        List<Integer> listB = b(layoutHelper, SegmentType.Character);
        if (listB.size() != 0) {
            boolean z10 = true;
            if (listB.size() == 1) {
                CollectionsKt__CollectionsKt.E();
            } else {
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = false;
                Integer num = listB.get(0);
                int iG = CollectionsKt__CollectionsKt.G(listB);
                int i10 = 0;
                while (i10 < iG) {
                    i10++;
                    Integer num2 = listB.get(i10);
                    int iIntValue = num2.intValue();
                    int iIntValue2 = num.intValue();
                    Layout layout = layoutHelper.getLayout();
                    if (!dropSpaces || iIntValue != iIntValue2 + 1 || !layoutHelper.j(layout.getText().charAt(iIntValue2))) {
                        int iA = i.a(layout, iIntValue2, z11);
                        boolean z12 = layout.getParagraphDirection(iA) == -1 ? z10 : z11;
                        boolean zIsRtlCharAt = layout.isRtlCharAt(iIntValue2);
                        if (zIsRtlCharAt != z12) {
                            z10 = z11;
                        }
                        int iCeil = (int) Math.ceil(layoutHelper.c(iIntValue2, z10, z11));
                        int iCeil2 = (int) Math.ceil(layoutHelper.c(iIntValue, zIsRtlCharAt == z12, true));
                        arrayList.add(new Segment(iIntValue2, iIntValue, Math.min(iCeil, iCeil2), layout.getLineTop(iA), Math.max(iCeil, iCeil2), layout.getLineBottom(iA)));
                    }
                    arrayList2.add(b2.f124493a);
                    num = num2;
                    iG = iG;
                    z10 = true;
                    z11 = false;
                }
            }
        } else {
            CollectionsKt__CollectionsKt.E();
        }
        return arrayList;
    }

    private final List<Segment> d(j layoutHelper) {
        return s.k(new Segment(0, layoutHelper.getLayout().getText().length(), 0, 0, layoutHelper.getLayout().getWidth(), layoutHelper.getLayout().getHeight()));
    }

    private final List<Segment> e(j layoutHelper, boolean dropSpaces) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int lineCount = layoutHelper.getLayout().getLineCount();
        for (int i10 = 0; i10 < lineCount; i10++) {
            arrayList.add(new Segment(layout.getLineStart(i10), layout.getLineEnd(i10), dropSpaces ? (int) Math.ceil(layout.getLineLeft(i10)) : 0, layout.getLineTop(i10), dropSpaces ? (int) Math.ceil(layout.getLineRight(i10)) : layout.getWidth(), layout.getLineBottom(i10)));
        }
        return arrayList;
    }

    private final List<Segment> f(j layoutHelper) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i10 = 0; i10 < paragraphCount; i10++) {
            int i11 = layoutHelper.i(i10);
            int iF = layoutHelper.f(i10);
            arrayList.add(new Segment(i11, iF, 0, layout.getLineTop(i.a(layout, i11, false)), layout.getWidth(), layout.getLineBottom(i.a(layout, iF, true))));
        }
        return arrayList;
    }

    private final List<Segment> g(j layoutHelper, boolean dropSpaces) {
        int i10;
        Layout layout = layoutHelper.getLayout();
        int iCeil = (int) Math.ceil(layout.getPaint().measureText(" "));
        List<Integer> listB = b(layoutHelper, SegmentType.Word);
        if (listB.size() != 0) {
            boolean z10 = true;
            if (listB.size() != 1) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                Integer num = listB.get(0);
                int iG = CollectionsKt__CollectionsKt.G(listB);
                int i11 = 0;
                while (i11 < iG) {
                    i11++;
                    Integer num2 = listB.get(i11);
                    int iIntValue = num2.intValue();
                    int iIntValue2 = num.intValue();
                    int iA = i.a(layout, iIntValue2, z11);
                    boolean z12 = layout.getParagraphDirection(iA) == -1 ? z10 : z11;
                    boolean zIsRtlCharAt = layout.isRtlCharAt(iIntValue2);
                    if (zIsRtlCharAt != z12) {
                        z10 = z11;
                    }
                    int iCeil2 = (int) Math.ceil(layoutHelper.c(iIntValue2, z10, z11));
                    boolean z13 = zIsRtlCharAt == z12;
                    int i12 = iG;
                    int iCeil3 = (int) Math.ceil(layoutHelper.c(iIntValue, z13, true));
                    int iMin = Math.min(iCeil2, iCeil3);
                    int iMax = Math.max(iCeil2, iCeil3);
                    if (dropSpaces && iIntValue != 0 && layout.getText().charAt(iIntValue - 1) == ' ') {
                        i10 = iA;
                        if (layout.getLineEnd(i10) != iIntValue) {
                            if (zIsRtlCharAt) {
                                iMin += iCeil;
                            } else {
                                iMax -= iCeil;
                            }
                        }
                    } else {
                        i10 = iA;
                    }
                    arrayList.add(new Segment(iIntValue2, iIntValue, iMin, layout.getLineTop(i10), iMax, layout.getLineBottom(i10)));
                    num = num2;
                    iG = i12;
                    z10 = true;
                    z11 = false;
                }
                return arrayList;
            }
        }
        return CollectionsKt__CollectionsKt.E();
    }

    private final List<Integer> i(CharSequence text, BreakIterator breaker) {
        e eVar = new e(text, 0, text.length());
        List<Integer> listP = CollectionsKt__CollectionsKt.P(0);
        breaker.setText(eVar);
        while (breaker.next() != -1) {
            listP.add(Integer.valueOf(breaker.current()));
        }
        return listP;
    }

    @d
    public final List<Integer> b(@d j layoutHelper, @d SegmentType segmentType) {
        f0.p(layoutHelper, "layoutHelper");
        f0.p(segmentType, "segmentType");
        Layout layout = layoutHelper.getLayout();
        CharSequence text = layout.getText();
        int i10 = a.f130828a[segmentType.ordinal()];
        int i11 = 0;
        if (i10 == 1) {
            return CollectionsKt__CollectionsKt.L(0, Integer.valueOf(text.length()));
        }
        if (i10 == 2) {
            List<Integer> listP = CollectionsKt__CollectionsKt.P(0);
            int paragraphCount = layoutHelper.getParagraphCount();
            while (i11 < paragraphCount) {
                listP.add(Integer.valueOf(layoutHelper.f(i11)));
                i11++;
            }
            return listP;
        }
        if (i10 == 3) {
            List<Integer> listP2 = CollectionsKt__CollectionsKt.P(0);
            int lineCount = layout.getLineCount();
            while (i11 < lineCount) {
                listP2.add(Integer.valueOf(layout.getLineEnd(i11)));
                i11++;
            }
            return listP2;
        }
        if (i10 == 4) {
            return a(layoutHelper);
        }
        if (i10 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        f0.o(text, "text");
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.getDefault());
        f0.o(characterInstance, "getCharacterInstance(Locale.getDefault())");
        return i(text, characterInstance);
    }

    @d
    public final List<Segment> h(@d j layoutHelper, @d SegmentType segmentType, boolean dropSpaces) {
        f0.p(layoutHelper, "layoutHelper");
        f0.p(segmentType, "segmentType");
        int i10 = a.f130828a[segmentType.ordinal()];
        if (i10 == 1) {
            return d(layoutHelper);
        }
        if (i10 == 2) {
            return f(layoutHelper);
        }
        if (i10 == 3) {
            return e(layoutHelper, dropSpaces);
        }
        if (i10 == 4) {
            return g(layoutHelper, dropSpaces);
        }
        if (i10 == 5) {
            return c(layoutHelper, dropSpaces);
        }
        throw new NoWhenBranchMatchedException();
    }
}
