package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.r1;
import p1.LocaleList;

/* JADX INFO: compiled from: Savers.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\t\u001a\u00020\b\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001aN\u0010\f\u001a\u0004\u0018\u00018\u0003\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0006\b\u0003\u0010\u000b\u0018\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u00022\u0006\u0010\u0005\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u000b\u0018\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\bH\u0080\b¢\u0006\u0004\b\u0010\u0010\u000f\"&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\".\u0010\u001a\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00180\u0017\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013\".\u0010\u001e\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0018\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u0012\u0004\b\u001c\u0010\u001d\" \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0013\"&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u0012\u0004\b#\u0010\u001d\"&\u0010(\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010\u0013\u001a\u0004\b'\u0010\u0015\"&\u0010+\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010\u0013\u001a\u0004\b*\u0010\u0015\" \u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0013\" \u00101\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0013\" \u00104\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0013\" \u00107\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0013\"#\u0010:\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b9\u0010\u0013\"#\u0010=\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b<\u0010\u0013\" \u0010@\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0013\"#\u0010C\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bB\u0010\u0013\")\u0010G\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bE\u0010\u0013\u0012\u0004\bF\u0010\u001d\"#\u0010J\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bI\u0010\u0013\" \u0010M\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0013\" \u0010P\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010\u0013\"$\u0010S\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b0\u0000*\u00020Q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010R\"$\u0010S\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\b0\u0000*\u00020T8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010U\"$\u0010S\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\b0\u0000*\u00020V8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010W\"$\u0010S\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\b0\u0000*\u00020X8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u0010Y\"'\u0010S\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\b0\u0000*\u00020Z8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b9\u0010[\"'\u0010S\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\b0\u0000*\u00020\\8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b3\u0010]\"$\u0010S\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0\u0000*\u00020^8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u0010_\"'\u0010S\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\b0\u0000*\u00020`8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b-\u0010a\"'\u0010S\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\b0\u0000*\u00020b8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\bO\u0010c\"'\u0010S\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\b0\u0000*\u00020d8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\bE\u0010e\"$\u0010S\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\b0\u0000*\u00020f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010g\"$\u0010S\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\b0\u0000*\u00020h8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bI\u0010i\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006j"}, d2 = {"Landroidx/compose/runtime/saveable/e;", androidx.exifinterface.media.a.f23244d5, "Original", "Saveable", "value", "saver", "Landroidx/compose/runtime/saveable/f;", "scope", "", ak.aD, "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/e;Landroidx/compose/runtime/saveable/f;)Ljava/lang/Object;", "Result", "x", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/e;)Ljava/lang/Object;", "y", "(Ljava/lang/Object;)Ljava/lang/Object;", RXScreenCaptureService.KEY_WIDTH, "Landroidx/compose/ui/text/d;", ak.av, "Landroidx/compose/runtime/saveable/e;", "e", "()Landroidx/compose/runtime/saveable/e;", "AnnotatedStringSaver", "", "Landroidx/compose/ui/text/d$b;", "b", "AnnotationRangeListSaver", ak.aF, "getAnnotationRangeSaver$annotations", "()V", "AnnotationRangeSaver", "Landroidx/compose/ui/text/u0;", "d", "VerbatimTtsAnnotationSaver", "Landroidx/compose/ui/text/t0;", "getUrlAnnotationSaver$annotations", "UrlAnnotationSaver", "Landroidx/compose/ui/text/u;", "f", "g", "ParagraphStyleSaver", "Landroidx/compose/ui/text/d0;", "t", "SpanStyleSaver", "Landroidx/compose/ui/text/style/i;", RXScreenCaptureService.KEY_HEIGHT, "TextDecorationSaver", "Landroidx/compose/ui/text/style/m;", "i", "TextGeometricTransformSaver", "Landroidx/compose/ui/text/style/o;", "j", "TextIndentSaver", "Landroidx/compose/ui/text/font/k0;", "k", "FontWeightSaver", "Landroidx/compose/ui/text/style/a;", "l", "BaselineShiftSaver", "Landroidx/compose/ui/text/o0;", "m", "TextRangeSaver", "Landroidx/compose/ui/graphics/e2;", "n", "ShadowSaver", "Landroidx/compose/ui/graphics/l0;", "o", "ColorSaver", "Ls1/u;", "p", "getTextUnitSaver$annotations", "TextUnitSaver", "Lb1/f;", "q", "OffsetSaver", "Lp1/f;", "r", "LocaleListSaver", "Lp1/e;", ak.aB, "LocaleSaver", "Landroidx/compose/ui/text/style/i$a;", "(Landroidx/compose/ui/text/style/i$a;)Landroidx/compose/runtime/saveable/e;", "Saver", "Landroidx/compose/ui/text/style/m$a;", "(Landroidx/compose/ui/text/style/m$a;)Landroidx/compose/runtime/saveable/e;", "Landroidx/compose/ui/text/style/o$a;", "(Landroidx/compose/ui/text/style/o$a;)Landroidx/compose/runtime/saveable/e;", "Landroidx/compose/ui/text/font/k0$a;", "(Landroidx/compose/ui/text/font/k0$a;)Landroidx/compose/runtime/saveable/e;", "Landroidx/compose/ui/text/style/a$a;", "(Landroidx/compose/ui/text/style/a$a;)Landroidx/compose/runtime/saveable/e;", "Landroidx/compose/ui/text/o0$a;", "(Landroidx/compose/ui/text/o0$a;)Landroidx/compose/runtime/saveable/e;", "Landroidx/compose/ui/graphics/e2$a;", "(Landroidx/compose/ui/graphics/e2$a;)Landroidx/compose/runtime/saveable/e;", "Landroidx/compose/ui/graphics/l0$a;", "(Landroidx/compose/ui/graphics/l0$a;)Landroidx/compose/runtime/saveable/e;", "Ls1/u$a;", "(Ls1/u$a;)Landroidx/compose/runtime/saveable/e;", "Lb1/f$a;", "(Lb1/f$a;)Landroidx/compose/runtime/saveable/e;", "Lp1/f$a;", "(Lp1/f$a;)Landroidx/compose/runtime/saveable/e;", "Lp1/e$a;", "(Lp1/e$a;)Landroidx/compose/runtime/saveable/e;", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class SaversKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<d, Object> f16185a = SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, d, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d androidx.compose.runtime.saveable.f Saver, @dl.d d it) {
            kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
            kotlin.jvm.internal.f0.p(it, "it");
            return CollectionsKt__CollectionsKt.r(SaversKt.y(it.getText()), SaversKt.z(it.e(), SaversKt.f16186b, Saver), SaversKt.z(it.d(), SaversKt.f16186b, Saver), SaversKt.z(it.b(), SaversKt.f16186b, Saver));
        }
    }, new yh.l<Object, d>() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(@dl.d Object it) {
            kotlin.jvm.internal.f0.p(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            List list2 = null;
            String str = obj != null ? (String) obj : null;
            kotlin.jvm.internal.f0.m(str);
            Object obj2 = list.get(1);
            androidx.compose.runtime.saveable.e eVar = SaversKt.f16186b;
            Boolean bool = Boolean.FALSE;
            List list3 = (kotlin.jvm.internal.f0.g(obj2, bool) || obj2 == null) ? null : (List) eVar.b(obj2);
            kotlin.jvm.internal.f0.m(list3);
            Object obj3 = list.get(2);
            List list4 = (kotlin.jvm.internal.f0.g(obj3, bool) || obj3 == null) ? null : (List) SaversKt.f16186b.b(obj3);
            kotlin.jvm.internal.f0.m(list4);
            Object obj4 = list.get(3);
            androidx.compose.runtime.saveable.e eVar2 = SaversKt.f16186b;
            if (!kotlin.jvm.internal.f0.g(obj4, bool) && obj4 != null) {
                list2 = (List) eVar2.b(obj4);
            }
            kotlin.jvm.internal.f0.m(list2);
            return new d(str, list3, list4, list2);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<List<d.Range<? extends Object>>, Object> f16186b = SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, List<? extends d.Range<? extends Object>>, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d androidx.compose.runtime.saveable.f Saver, @dl.d List<? extends d.Range<? extends Object>> it) {
            kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
            kotlin.jvm.internal.f0.p(it, "it");
            ArrayList arrayList = new ArrayList(it.size());
            int size = it.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(SaversKt.z(it.get(i10), SaversKt.f16187c, Saver));
            }
            return arrayList;
        }
    }, new yh.l<Object, List<? extends d.Range<? extends Object>>>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<d.Range<? extends Object>> invoke(@dl.d Object it) {
            kotlin.jvm.internal.f0.p(it, "it");
            List list = (List) it;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                androidx.compose.runtime.saveable.e eVar = SaversKt.f16187c;
                d.Range range = null;
                if (!kotlin.jvm.internal.f0.g(obj, Boolean.FALSE) && obj != null) {
                    range = (d.Range) eVar.b(obj);
                }
                kotlin.jvm.internal.f0.m(range);
                arrayList.add(range);
            }
            return arrayList;
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<d.Range<? extends Object>, Object> f16187c = SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, d.Range<? extends Object>, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1

        /* JADX INFO: compiled from: Savers.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f16209a;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                iArr[AnnotationType.Paragraph.ordinal()] = 1;
                iArr[AnnotationType.Span.ordinal()] = 2;
                iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                iArr[AnnotationType.Url.ordinal()] = 4;
                iArr[AnnotationType.String.ordinal()] = 5;
                f16209a = iArr;
            }
        }

        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d androidx.compose.runtime.saveable.f Saver, @dl.d d.Range<? extends Object> it) {
            AnnotationType annotationType;
            Object objZ;
            kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
            kotlin.jvm.internal.f0.p(it, "it");
            Object objH = it.h();
            if (objH instanceof ParagraphStyle) {
                annotationType = AnnotationType.Paragraph;
            } else if (objH instanceof SpanStyle) {
                annotationType = AnnotationType.Span;
            } else if (objH instanceof VerbatimTtsAnnotation) {
                annotationType = AnnotationType.VerbatimTts;
            } else {
                annotationType = objH instanceof UrlAnnotation ? AnnotationType.Url : AnnotationType.String;
            }
            int i10 = a.f16209a[annotationType.ordinal()];
            if (i10 == 1) {
                Object objH2 = it.h();
                kotlin.jvm.internal.f0.n(objH2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                objZ = SaversKt.z((ParagraphStyle) objH2, SaversKt.g(), Saver);
            } else if (i10 == 2) {
                Object objH3 = it.h();
                kotlin.jvm.internal.f0.n(objH3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                objZ = SaversKt.z((SpanStyle) objH3, SaversKt.t(), Saver);
            } else if (i10 == 3) {
                Object objH4 = it.h();
                kotlin.jvm.internal.f0.n(objH4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                objZ = SaversKt.z((VerbatimTtsAnnotation) objH4, SaversKt.f16188d, Saver);
            } else if (i10 == 4) {
                Object objH5 = it.h();
                kotlin.jvm.internal.f0.n(objH5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                objZ = SaversKt.z((UrlAnnotation) objH5, SaversKt.f16189e, Saver);
            } else {
                if (i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                objZ = SaversKt.y(it.h());
            }
            return CollectionsKt__CollectionsKt.r(SaversKt.y(annotationType), objZ, SaversKt.y(Integer.valueOf(it.i())), SaversKt.y(Integer.valueOf(it.g())), SaversKt.y(it.j()));
        }
    }, new yh.l<Object, d.Range<? extends Object>>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2

        /* JADX INFO: compiled from: Savers.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f16211a;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                iArr[AnnotationType.Paragraph.ordinal()] = 1;
                iArr[AnnotationType.Span.ordinal()] = 2;
                iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                iArr[AnnotationType.Url.ordinal()] = 4;
                iArr[AnnotationType.String.ordinal()] = 5;
                f16211a = iArr;
            }
        }

        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d.Range<? extends Object> invoke(@dl.d Object it) {
            kotlin.jvm.internal.f0.p(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            ParagraphStyle paragraphStyleB = null;
            AnnotationType annotationType = obj != null ? (AnnotationType) obj : null;
            kotlin.jvm.internal.f0.m(annotationType);
            Object obj2 = list.get(2);
            Integer num = obj2 != null ? (Integer) obj2 : null;
            kotlin.jvm.internal.f0.m(num);
            int iIntValue = num.intValue();
            Object obj3 = list.get(3);
            Integer num2 = obj3 != null ? (Integer) obj3 : null;
            kotlin.jvm.internal.f0.m(num2);
            int iIntValue2 = num2.intValue();
            Object obj4 = list.get(4);
            String str = obj4 != null ? (String) obj4 : null;
            kotlin.jvm.internal.f0.m(str);
            int i10 = a.f16211a[annotationType.ordinal()];
            if (i10 == 1) {
                Object obj5 = list.get(1);
                androidx.compose.runtime.saveable.e<ParagraphStyle, Object> eVarG = SaversKt.g();
                if (!kotlin.jvm.internal.f0.g(obj5, Boolean.FALSE) && obj5 != null) {
                    paragraphStyleB = eVarG.b(obj5);
                }
                kotlin.jvm.internal.f0.m(paragraphStyleB);
                return new d.Range<>(paragraphStyleB, iIntValue, iIntValue2, str);
            }
            if (i10 == 2) {
                Object obj6 = list.get(1);
                androidx.compose.runtime.saveable.e<SpanStyle, Object> eVarT = SaversKt.t();
                if (!kotlin.jvm.internal.f0.g(obj6, Boolean.FALSE) && obj6 != null) {
                    paragraphStyleB = eVarT.b(obj6);
                }
                kotlin.jvm.internal.f0.m(paragraphStyleB);
                return new d.Range<>(paragraphStyleB, iIntValue, iIntValue2, str);
            }
            if (i10 == 3) {
                Object obj7 = list.get(1);
                androidx.compose.runtime.saveable.e eVar = SaversKt.f16188d;
                if (!kotlin.jvm.internal.f0.g(obj7, Boolean.FALSE) && obj7 != null) {
                    paragraphStyleB = (VerbatimTtsAnnotation) eVar.b(obj7);
                }
                kotlin.jvm.internal.f0.m(paragraphStyleB);
                return new d.Range<>(paragraphStyleB, iIntValue, iIntValue2, str);
            }
            if (i10 != 4) {
                if (i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                Object obj8 = list.get(1);
                paragraphStyleB = obj8 != null ? (String) obj8 : null;
                kotlin.jvm.internal.f0.m(paragraphStyleB);
                return new d.Range<>(paragraphStyleB, iIntValue, iIntValue2, str);
            }
            Object obj9 = list.get(1);
            androidx.compose.runtime.saveable.e eVar2 = SaversKt.f16189e;
            if (!kotlin.jvm.internal.f0.g(obj9, Boolean.FALSE) && obj9 != null) {
                paragraphStyleB = (UrlAnnotation) eVar2.b(obj9);
            }
            kotlin.jvm.internal.f0.m(paragraphStyleB);
            return new d.Range<>(paragraphStyleB, iIntValue, iIntValue2, str);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<VerbatimTtsAnnotation, Object> f16188d = SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, VerbatimTtsAnnotation, Object>() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d androidx.compose.runtime.saveable.f Saver, @dl.d VerbatimTtsAnnotation it) {
            kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
            kotlin.jvm.internal.f0.p(it, "it");
            return SaversKt.y(it.getVerbatim());
        }
    }, new yh.l<Object, VerbatimTtsAnnotation>() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VerbatimTtsAnnotation invoke(@dl.d Object it) {
            kotlin.jvm.internal.f0.p(it, "it");
            return new VerbatimTtsAnnotation((String) it);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<UrlAnnotation, Object> f16189e = SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, UrlAnnotation, Object>() { // from class: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d androidx.compose.runtime.saveable.f Saver, @dl.d UrlAnnotation it) {
            kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
            kotlin.jvm.internal.f0.p(it, "it");
            return SaversKt.y(it.getUrl());
        }
    }, new yh.l<Object, UrlAnnotation>() { // from class: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UrlAnnotation invoke(@dl.d Object it) {
            kotlin.jvm.internal.f0.p(it, "it");
            return new UrlAnnotation((String) it);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<ParagraphStyle, Object> f16190f = SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, ParagraphStyle, Object>() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d androidx.compose.runtime.saveable.f Saver, @dl.d ParagraphStyle it) {
            kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
            kotlin.jvm.internal.f0.p(it, "it");
            return CollectionsKt__CollectionsKt.r(SaversKt.y(it.getTextAlign()), SaversKt.y(it.getTextDirection()), SaversKt.z(s1.u.c(it.getLineHeight()), SaversKt.s(s1.u.f139249b), Saver), SaversKt.z(it.getTextIndent(), SaversKt.o(TextIndent.INSTANCE), Saver));
        }
    }, new yh.l<Object, ParagraphStyle>() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ParagraphStyle invoke(@dl.d Object it) {
            kotlin.jvm.internal.f0.p(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            androidx.compose.ui.text.style.h hVar = obj != null ? (androidx.compose.ui.text.style.h) obj : null;
            Object obj2 = list.get(1);
            androidx.compose.ui.text.style.j jVar = obj2 != null ? (androidx.compose.ui.text.style.j) obj2 : null;
            Object obj3 = list.get(2);
            androidx.compose.runtime.saveable.e<s1.u, Object> eVarS = SaversKt.s(s1.u.f139249b);
            Boolean bool = Boolean.FALSE;
            s1.u uVarB = (kotlin.jvm.internal.f0.g(obj3, bool) || obj3 == null) ? null : eVarS.b(obj3);
            kotlin.jvm.internal.f0.m(uVarB);
            long f139252a = uVarB.getF139252a();
            Object obj4 = list.get(3);
            return new ParagraphStyle(hVar, jVar, f139252a, (kotlin.jvm.internal.f0.g(obj4, bool) || obj4 == null) ? null : SaversKt.o(TextIndent.INSTANCE).b(obj4), null);
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<SpanStyle, Object> f16191g = SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, SpanStyle, Object>() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d androidx.compose.runtime.saveable.f Saver, @dl.d SpanStyle it) {
            kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
            kotlin.jvm.internal.f0.p(it, "it");
            androidx.compose.ui.graphics.l0 l0VarN = androidx.compose.ui.graphics.l0.n(it.m());
            androidx.compose.ui.graphics.l0.Companion companion = androidx.compose.ui.graphics.l0.INSTANCE;
            s1.u uVarC = s1.u.c(it.getFontSize());
            s1.u.a aVar = s1.u.f139249b;
            return CollectionsKt__CollectionsKt.r(SaversKt.z(l0VarN, SaversKt.h(companion), Saver), SaversKt.z(uVarC, SaversKt.s(aVar), Saver), SaversKt.z(it.getFontWeight(), SaversKt.k(FontWeight.INSTANCE), Saver), SaversKt.y(it.getFontStyle()), SaversKt.y(it.getFontSynthesis()), SaversKt.y(-1), SaversKt.y(it.getFontFeatureSettings()), SaversKt.z(s1.u.c(it.getLetterSpacing()), SaversKt.s(aVar), Saver), SaversKt.z(it.getBaselineShift(), SaversKt.l(androidx.compose.ui.text.style.a.INSTANCE), Saver), SaversKt.z(it.getTextGeometricTransform(), SaversKt.n(TextGeometricTransform.INSTANCE), Saver), SaversKt.z(it.getLocaleList(), SaversKt.r(LocaleList.f138137d), Saver), SaversKt.z(androidx.compose.ui.graphics.l0.n(it.getBackground()), SaversKt.h(companion), Saver), SaversKt.z(it.getTextDecoration(), SaversKt.m(androidx.compose.ui.text.style.i.INSTANCE), Saver), SaversKt.z(it.getShadow(), SaversKt.i(Shadow.INSTANCE), Saver));
        }
    }, new yh.l<Object, SpanStyle>() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SpanStyle invoke(@dl.d Object it) {
            kotlin.jvm.internal.f0.p(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            androidx.compose.ui.graphics.l0.Companion companion = androidx.compose.ui.graphics.l0.INSTANCE;
            androidx.compose.runtime.saveable.e<androidx.compose.ui.graphics.l0, Object> eVarH = SaversKt.h(companion);
            Boolean bool = Boolean.FALSE;
            androidx.compose.ui.graphics.l0 l0VarB = (kotlin.jvm.internal.f0.g(obj, bool) || obj == null) ? null : eVarH.b(obj);
            kotlin.jvm.internal.f0.m(l0VarB);
            long jM = l0VarB.M();
            Object obj2 = list.get(1);
            s1.u.a aVar = s1.u.f139249b;
            s1.u uVarB = (kotlin.jvm.internal.f0.g(obj2, bool) || obj2 == null) ? null : SaversKt.s(aVar).b(obj2);
            kotlin.jvm.internal.f0.m(uVarB);
            long f139252a = uVarB.getF139252a();
            Object obj3 = list.get(2);
            FontWeight fontWeightB = (kotlin.jvm.internal.f0.g(obj3, bool) || obj3 == null) ? null : SaversKt.k(FontWeight.INSTANCE).b(obj3);
            Object obj4 = list.get(3);
            androidx.compose.ui.text.font.g0 g0Var = obj4 != null ? (androidx.compose.ui.text.font.g0) obj4 : null;
            Object obj5 = list.get(4);
            androidx.compose.ui.text.font.h0 h0Var = obj5 != null ? (androidx.compose.ui.text.font.h0) obj5 : null;
            Object obj6 = list.get(6);
            String str = obj6 != null ? (String) obj6 : null;
            Object obj7 = list.get(7);
            s1.u uVarB2 = (kotlin.jvm.internal.f0.g(obj7, bool) || obj7 == null) ? null : SaversKt.s(aVar).b(obj7);
            kotlin.jvm.internal.f0.m(uVarB2);
            long f139252a2 = uVarB2.getF139252a();
            Object obj8 = list.get(8);
            androidx.compose.ui.text.style.a aVarB = (kotlin.jvm.internal.f0.g(obj8, bool) || obj8 == null) ? null : SaversKt.l(androidx.compose.ui.text.style.a.INSTANCE).b(obj8);
            Object obj9 = list.get(9);
            TextGeometricTransform textGeometricTransformB = (kotlin.jvm.internal.f0.g(obj9, bool) || obj9 == null) ? null : SaversKt.n(TextGeometricTransform.INSTANCE).b(obj9);
            Object obj10 = list.get(10);
            LocaleList localeListB = (kotlin.jvm.internal.f0.g(obj10, bool) || obj10 == null) ? null : SaversKt.r(LocaleList.f138137d).b(obj10);
            Object obj11 = list.get(11);
            androidx.compose.ui.graphics.l0 l0VarB2 = (kotlin.jvm.internal.f0.g(obj11, bool) || obj11 == null) ? null : SaversKt.h(companion).b(obj11);
            kotlin.jvm.internal.f0.m(l0VarB2);
            long jM2 = l0VarB2.M();
            Object obj12 = list.get(12);
            androidx.compose.ui.text.style.i iVarB = (kotlin.jvm.internal.f0.g(obj12, bool) || obj12 == null) ? null : SaversKt.m(androidx.compose.ui.text.style.i.INSTANCE).b(obj12);
            Object obj13 = list.get(13);
            return new SpanStyle(jM, f139252a, fontWeightB, g0Var, h0Var, (androidx.compose.ui.text.font.v) null, str, f139252a2, aVarB, textGeometricTransformB, localeListB, jM2, iVarB, (kotlin.jvm.internal.f0.g(obj13, bool) || obj13 == null) ? null : SaversKt.i(Shadow.INSTANCE).b(obj13), 32, (kotlin.jvm.internal.u) null);
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<androidx.compose.ui.text.style.i, Object> f16192h = SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, androidx.compose.ui.text.style.i, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d androidx.compose.runtime.saveable.f Saver, @dl.d androidx.compose.ui.text.style.i it) {
            kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
            kotlin.jvm.internal.f0.p(it, "it");
            return Integer.valueOf(it.getMask());
        }
    }, new yh.l<Object, androidx.compose.ui.text.style.i>() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.style.i invoke(@dl.d Object it) {
            kotlin.jvm.internal.f0.p(it, "it");
            return new androidx.compose.ui.text.style.i(((Integer) it).intValue());
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<TextGeometricTransform, Object> f16193i = SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, TextGeometricTransform, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d androidx.compose.runtime.saveable.f Saver, @dl.d TextGeometricTransform it) {
            kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
            kotlin.jvm.internal.f0.p(it, "it");
            return CollectionsKt__CollectionsKt.r(Float.valueOf(it.getScaleX()), Float.valueOf(it.getSkewX()));
        }
    }, new yh.l<Object, TextGeometricTransform>() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextGeometricTransform invoke(@dl.d Object it) {
            kotlin.jvm.internal.f0.p(it, "it");
            List list = (List) it;
            return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<TextIndent, Object> f16194j = SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, TextIndent, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d androidx.compose.runtime.saveable.f Saver, @dl.d TextIndent it) {
            kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
            kotlin.jvm.internal.f0.p(it, "it");
            s1.u uVarC = s1.u.c(it.getFirstLine());
            s1.u.a aVar = s1.u.f139249b;
            return CollectionsKt__CollectionsKt.r(SaversKt.z(uVarC, SaversKt.s(aVar), Saver), SaversKt.z(s1.u.c(it.getRestLine()), SaversKt.s(aVar), Saver));
        }
    }, new yh.l<Object, TextIndent>() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextIndent invoke(@dl.d Object it) {
            kotlin.jvm.internal.f0.p(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            s1.u.a aVar = s1.u.f139249b;
            androidx.compose.runtime.saveable.e<s1.u, Object> eVarS = SaversKt.s(aVar);
            Boolean bool = Boolean.FALSE;
            s1.u uVarB = null;
            s1.u uVarB2 = (kotlin.jvm.internal.f0.g(obj, bool) || obj == null) ? null : eVarS.b(obj);
            kotlin.jvm.internal.f0.m(uVarB2);
            long f139252a = uVarB2.getF139252a();
            Object obj2 = list.get(1);
            androidx.compose.runtime.saveable.e<s1.u, Object> eVarS2 = SaversKt.s(aVar);
            if (!kotlin.jvm.internal.f0.g(obj2, bool) && obj2 != null) {
                uVarB = eVarS2.b(obj2);
            }
            kotlin.jvm.internal.f0.m(uVarB);
            return new TextIndent(f139252a, uVarB.getF139252a(), null);
        }
    });

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<FontWeight, Object> f16195k = SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, FontWeight, Object>() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d androidx.compose.runtime.saveable.f Saver, @dl.d FontWeight it) {
            kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
            kotlin.jvm.internal.f0.p(it, "it");
            return Integer.valueOf(it.w());
        }
    }, new yh.l<Object, FontWeight>() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FontWeight invoke(@dl.d Object it) {
            kotlin.jvm.internal.f0.p(it, "it");
            return new FontWeight(((Integer) it).intValue());
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<androidx.compose.ui.text.style.a, Object> f16196l = SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, androidx.compose.ui.text.style.a, Object>() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$1
        @dl.e
        public final Object a(@dl.d androidx.compose.runtime.saveable.f Saver, float f10) {
            kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
            return Float.valueOf(f10);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(androidx.compose.runtime.saveable.f fVar, androidx.compose.ui.text.style.a aVar) {
            return a(fVar, aVar.k());
        }
    }, new yh.l<Object, androidx.compose.ui.text.style.a>() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.style.a invoke(@dl.d Object it) {
            kotlin.jvm.internal.f0.p(it, "it");
            return androidx.compose.ui.text.style.a.d(androidx.compose.ui.text.style.a.e(((Float) it).floatValue()));
        }
    });

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<o0, Object> f16197m = SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, o0, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$1
        @dl.e
        public final Object a(@dl.d androidx.compose.runtime.saveable.f Saver, long j10) {
            kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
            return CollectionsKt__CollectionsKt.r((Integer) SaversKt.y(Integer.valueOf(o0.n(j10))), (Integer) SaversKt.y(Integer.valueOf(o0.i(j10))));
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(androidx.compose.runtime.saveable.f fVar, o0 o0Var) {
            return a(fVar, o0Var.getPackedValue());
        }
    }, new yh.l<Object, o0>() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o0 invoke(@dl.d Object it) {
            kotlin.jvm.internal.f0.p(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            Integer num = obj != null ? (Integer) obj : null;
            kotlin.jvm.internal.f0.m(num);
            int iIntValue = num.intValue();
            Object obj2 = list.get(1);
            Integer num2 = obj2 != null ? (Integer) obj2 : null;
            kotlin.jvm.internal.f0.m(num2);
            return o0.b(p0.b(iIntValue, num2.intValue()));
        }
    });

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<Shadow, Object> f16198n = SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, Shadow, Object>() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d androidx.compose.runtime.saveable.f Saver, @dl.d Shadow it) {
            kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
            kotlin.jvm.internal.f0.p(it, "it");
            return CollectionsKt__CollectionsKt.r(SaversKt.z(androidx.compose.ui.graphics.l0.n(it.getColor()), SaversKt.h(androidx.compose.ui.graphics.l0.INSTANCE), Saver), SaversKt.z(b1.f.d(it.getOffset()), SaversKt.p(b1.f.f30364b), Saver), SaversKt.y(Float.valueOf(it.getBlurRadius())));
        }
    }, new yh.l<Object, Shadow>() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Shadow invoke(@dl.d Object it) {
            kotlin.jvm.internal.f0.p(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            androidx.compose.runtime.saveable.e<androidx.compose.ui.graphics.l0, Object> eVarH = SaversKt.h(androidx.compose.ui.graphics.l0.INSTANCE);
            Boolean bool = Boolean.FALSE;
            androidx.compose.ui.graphics.l0 l0VarB = (kotlin.jvm.internal.f0.g(obj, bool) || obj == null) ? null : eVarH.b(obj);
            kotlin.jvm.internal.f0.m(l0VarB);
            long jM = l0VarB.M();
            Object obj2 = list.get(1);
            b1.f fVarB = (kotlin.jvm.internal.f0.g(obj2, bool) || obj2 == null) ? null : SaversKt.p(b1.f.f30364b).b(obj2);
            kotlin.jvm.internal.f0.m(fVarB);
            long f30368a = fVarB.getF30368a();
            Object obj3 = list.get(2);
            Float f10 = obj3 != null ? (Float) obj3 : null;
            kotlin.jvm.internal.f0.m(f10);
            return new Shadow(jM, f30368a, f10.floatValue(), null);
        }
    });

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<androidx.compose.ui.graphics.l0, Object> f16199o = SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, androidx.compose.ui.graphics.l0, Object>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$1
        @dl.e
        public final Object a(@dl.d androidx.compose.runtime.saveable.f Saver, long j10) {
            kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
            return r1.b(j10);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(androidx.compose.runtime.saveable.f fVar, androidx.compose.ui.graphics.l0 l0Var) {
            return a(fVar, l0Var.M());
        }
    }, new yh.l<Object, androidx.compose.ui.graphics.l0>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.graphics.l0 invoke(@dl.d Object it) {
            kotlin.jvm.internal.f0.p(it, "it");
            return androidx.compose.ui.graphics.l0.n(androidx.compose.ui.graphics.l0.t(((r1) it).q0()));
        }
    });

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<s1.u, Object> f16200p = SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, s1.u, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$1
        @dl.e
        public final Object a(@dl.d androidx.compose.runtime.saveable.f Saver, long j10) {
            kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
            return CollectionsKt__CollectionsKt.r(SaversKt.y(Float.valueOf(s1.u.n(j10))), SaversKt.y(s1.w.d(s1.u.m(j10))));
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(androidx.compose.runtime.saveable.f fVar, s1.u uVar) {
            return a(fVar, uVar.getF139252a());
        }
    }, new yh.l<Object, s1.u>() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s1.u invoke(@dl.d Object it) {
            kotlin.jvm.internal.f0.p(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            Float f10 = obj != null ? (Float) obj : null;
            kotlin.jvm.internal.f0.m(f10);
            float fFloatValue = f10.floatValue();
            Object obj2 = list.get(1);
            s1.w wVar = obj2 != null ? (s1.w) obj2 : null;
            kotlin.jvm.internal.f0.m(wVar);
            return s1.u.c(s1.v.a(fFloatValue, wVar.getF139261a()));
        }
    });

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<b1.f, Object> f16201q = SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, b1.f, Object>() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$1
        @dl.e
        public final Object a(@dl.d androidx.compose.runtime.saveable.f Saver, long j10) {
            kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
            return b1.f.l(j10, b1.f.f30364b.c()) ? Boolean.FALSE : CollectionsKt__CollectionsKt.r((Float) SaversKt.y(Float.valueOf(b1.f.p(j10))), (Float) SaversKt.y(Float.valueOf(b1.f.r(j10))));
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(androidx.compose.runtime.saveable.f fVar, b1.f fVar2) {
            return a(fVar, fVar2.getF30368a());
        }
    }, new yh.l<Object, b1.f>() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b1.f invoke(@dl.d Object it) {
            kotlin.jvm.internal.f0.p(it, "it");
            if (kotlin.jvm.internal.f0.g(it, Boolean.FALSE)) {
                return b1.f.d(b1.f.f30364b.c());
            }
            List list = (List) it;
            Object obj = list.get(0);
            Float f10 = obj != null ? (Float) obj : null;
            kotlin.jvm.internal.f0.m(f10);
            float fFloatValue = f10.floatValue();
            Object obj2 = list.get(1);
            Float f11 = obj2 != null ? (Float) obj2 : null;
            kotlin.jvm.internal.f0.m(f11);
            return b1.f.d(b1.g.a(fFloatValue, f11.floatValue()));
        }
    });

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<LocaleList, Object> f16202r = SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, LocaleList, Object>() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d androidx.compose.runtime.saveable.f Saver, @dl.d LocaleList it) {
            kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
            kotlin.jvm.internal.f0.p(it, "it");
            List<p1.e> listG = it.g();
            ArrayList arrayList = new ArrayList(listG.size());
            int size = listG.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(SaversKt.z(listG.get(i10), SaversKt.q(p1.e.f138135b), Saver));
            }
            return arrayList;
        }
    }, new yh.l<Object, LocaleList>() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LocaleList invoke(@dl.d Object it) {
            kotlin.jvm.internal.f0.p(it, "it");
            List list = (List) it;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                androidx.compose.runtime.saveable.e<p1.e, Object> eVarQ = SaversKt.q(p1.e.f138135b);
                p1.e eVarB = null;
                if (!kotlin.jvm.internal.f0.g(obj, Boolean.FALSE) && obj != null) {
                    eVarB = eVarQ.b(obj);
                }
                kotlin.jvm.internal.f0.m(eVarB);
                arrayList.add(eVarB);
            }
            return new LocaleList(arrayList);
        }
    });

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.saveable.e<p1.e, Object> f16203s = SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, p1.e, Object>() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d androidx.compose.runtime.saveable.f Saver, @dl.d p1.e it) {
            kotlin.jvm.internal.f0.p(Saver, "$this$Saver");
            kotlin.jvm.internal.f0.p(it, "it");
            return it.e();
        }
    }, new yh.l<Object, p1.e>() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$2
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p1.e invoke(@dl.d Object it) {
            kotlin.jvm.internal.f0.p(it, "it");
            return new p1.e((String) it);
        }
    });

    @dl.d
    public static final androidx.compose.runtime.saveable.e<d, Object> e() {
        return f16185a;
    }

    private static /* synthetic */ void f() {
    }

    @dl.d
    public static final androidx.compose.runtime.saveable.e<ParagraphStyle, Object> g() {
        return f16190f;
    }

    @dl.d
    public static final androidx.compose.runtime.saveable.e<androidx.compose.ui.graphics.l0, Object> h(@dl.d androidx.compose.ui.graphics.l0.Companion companion) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        return f16199o;
    }

    @dl.d
    public static final androidx.compose.runtime.saveable.e<Shadow, Object> i(@dl.d Shadow.Companion companion) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        return f16198n;
    }

    @dl.d
    public static final androidx.compose.runtime.saveable.e<o0, Object> j(@dl.d o0.Companion companion) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        return f16197m;
    }

    @dl.d
    public static final androidx.compose.runtime.saveable.e<FontWeight, Object> k(@dl.d FontWeight.Companion companion) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        return f16195k;
    }

    @dl.d
    public static final androidx.compose.runtime.saveable.e<androidx.compose.ui.text.style.a, Object> l(@dl.d androidx.compose.ui.text.style.a.Companion companion) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        return f16196l;
    }

    @dl.d
    public static final androidx.compose.runtime.saveable.e<androidx.compose.ui.text.style.i, Object> m(@dl.d androidx.compose.ui.text.style.i.Companion companion) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        return f16192h;
    }

    @dl.d
    public static final androidx.compose.runtime.saveable.e<TextGeometricTransform, Object> n(@dl.d TextGeometricTransform.Companion companion) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        return f16193i;
    }

    @dl.d
    public static final androidx.compose.runtime.saveable.e<TextIndent, Object> o(@dl.d TextIndent.Companion companion) {
        kotlin.jvm.internal.f0.p(companion, "<this>");
        return f16194j;
    }

    @dl.d
    public static final androidx.compose.runtime.saveable.e<b1.f, Object> p(@dl.d b1.f.a aVar) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        return f16201q;
    }

    @dl.d
    public static final androidx.compose.runtime.saveable.e<p1.e, Object> q(@dl.d p1.e.a aVar) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        return f16203s;
    }

    @dl.d
    public static final androidx.compose.runtime.saveable.e<LocaleList, Object> r(@dl.d LocaleList.a aVar) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        return f16202r;
    }

    @dl.d
    public static final androidx.compose.runtime.saveable.e<s1.u, Object> s(@dl.d s1.u.a aVar) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        return f16200p;
    }

    @dl.d
    public static final androidx.compose.runtime.saveable.e<SpanStyle, Object> t() {
        return f16191g;
    }

    private static /* synthetic */ void u() {
    }

    private static /* synthetic */ void v() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <Result> Result w(Object obj) {
        if (obj == 0) {
            return null;
        }
        kotlin.jvm.internal.f0.y(1, "Result");
        return obj;
    }

    public static final /* synthetic */ <T extends androidx.compose.runtime.saveable.e<Original, Saveable>, Original, Saveable, Result> Result x(Saveable saveable, T saver) {
        kotlin.jvm.internal.f0.p(saver, "saver");
        if (kotlin.jvm.internal.f0.g(saveable, Boolean.FALSE) || saveable == null) {
            return null;
        }
        Result result = (Result) saver.b(saveable);
        kotlin.jvm.internal.f0.y(1, "Result");
        return result;
    }

    @dl.e
    public static final <T> T y(@dl.e T t10) {
        return t10;
    }

    @dl.d
    public static final <T extends androidx.compose.runtime.saveable.e<Original, Saveable>, Original, Saveable> Object z(@dl.e Original original, @dl.d T saver, @dl.d androidx.compose.runtime.saveable.f scope) {
        Object objA;
        kotlin.jvm.internal.f0.p(saver, "saver");
        kotlin.jvm.internal.f0.p(scope, "scope");
        return (original == null || (objA = saver.a(scope, original)) == null) ? Boolean.FALSE : objA;
    }
}
