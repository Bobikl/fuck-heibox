package androidx.compose.ui.text;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: MultiParagraph.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\b\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u001e\u0010\n\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0000\u001a-\u0010\u000e\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\fH\u0082\b¨\u0006\u000f"}, d2 = {"", "Landroidx/compose/ui/text/o;", "paragraphInfoList", "", UCropPlusActivity.ARG_INDEX, "b", "", "y", "d", "lineIndex", ak.aF, androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function1;", "comparison", ak.av, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class l {
    private static final <T> int a(List<? extends T> list, yh.l<? super T, Integer> lVar) {
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            int iIntValue = lVar.invoke(list.get(i11)).intValue();
            if (iIntValue < 0) {
                i10 = i11 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final int b(@dl.d List<ParagraphInfo> paragraphInfoList, int i10) {
        byte b10;
        kotlin.jvm.internal.f0.p(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            ParagraphInfo paragraphInfo = paragraphInfoList.get(i12);
            if (paragraphInfo.o() > i10) {
                b10 = 1;
            } else {
                b10 = paragraphInfo.k() <= i10 ? (byte) -1 : (byte) 0;
            }
            if (b10 < 0) {
                i11 = i12 + 1;
            } else {
                if (b10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int c(@dl.d List<ParagraphInfo> paragraphInfoList, int i10) {
        byte b10;
        kotlin.jvm.internal.f0.p(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            ParagraphInfo paragraphInfo = paragraphInfoList.get(i12);
            if (paragraphInfo.p() > i10) {
                b10 = 1;
            } else {
                b10 = paragraphInfo.l() <= i10 ? (byte) -1 : (byte) 0;
            }
            if (b10 < 0) {
                i11 = i12 + 1;
            } else {
                if (b10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int d(@dl.d List<ParagraphInfo> paragraphInfoList, float f10) {
        byte b10;
        kotlin.jvm.internal.f0.p(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            ParagraphInfo paragraphInfo = paragraphInfoList.get(i11);
            if (paragraphInfo.q() > f10) {
                b10 = 1;
            } else {
                b10 = paragraphInfo.j() <= f10 ? (byte) -1 : (byte) 0;
            }
            if (b10 < 0) {
                i10 = i11 + 1;
            } else {
                if (b10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }
}
