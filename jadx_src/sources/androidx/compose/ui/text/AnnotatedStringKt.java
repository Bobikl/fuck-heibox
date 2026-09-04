package androidx.compose.ui.text;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import p1.LocaleList;

/* JADX INFO: compiled from: AnnotatedString.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\u001a \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001ad\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012>\b\u0004\u0010\u0012\u001a8\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00028\u00000\rH\u0080\bø\u0001\u0000\u001a\u0014\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u001a\u0014\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u001a\u0014\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u001a\u0014\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u001aB\u0010 \u001a\u00028\u0000\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\t2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0002\b\u001fH\u0086\bø\u0001\u0000¢\u0006\u0004\b \u0010!\u001aD\u0010\"\u001a\u00028\u0000\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00012\u0019\b\u0004\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0002\b\u001fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001aL\u0010'\u001a\u00028\u0000\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u00020\u001c2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0019\b\u0004\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0002\b\u001fH\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aD\u0010+\u001a\u00028\u0000\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u00020\u001c2\u0006\u0010*\u001a\u00020)2\u0019\b\u0004\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0002\b\u001fH\u0087\bø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001aD\u0010/\u001a\u00028\u0000\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u00020\u001c2\u0006\u0010.\u001a\u00020-2\u0019\b\u0004\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0002\b\u001fH\u0087\bø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a@\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\"\u0004\b\u0000\u0010\f2\u0014\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a\"\u00105\u001a\u00020\u00002\u0006\u00103\u001a\u00020$2\u0006\u00104\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u001a\u0016\u00106\u001a\u00020\u00002\u0006\u00103\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u0001\u001a%\u00109\u001a\u00020\u00002\u0017\u00108\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u0002070\u001e¢\u0006\u0002\b\u001fH\u0086\bø\u0001\u0000\u001a(\u0010?\u001a\u00020>2\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0000\u001a(\u0010D\u001a\u00020>2\u0006\u0010@\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u0006H\u0000\u001a\b\u0010E\u001a\u00020\u0000H\u0000\"\u0014\u0010G\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010F\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006H"}, d2 = {"Landroidx/compose/ui/text/d;", "Landroidx/compose/ui/text/u;", "defaultParagraphStyle", "", "Landroidx/compose/ui/text/d$b;", "q", "", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "Landroidx/compose/ui/text/d0;", "n", "r", androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function2;", "Lkotlin/m0;", "name", "annotatedString", "paragraphStyle", "block", "p", "Lp1/f;", "localeList", ak.aG, ak.aB, "g", "j", "", "R", "Landroidx/compose/ui/text/d$a;", "style", "Lkotlin/Function1;", "Lkotlin/t;", androidx.exifinterface.media.a.W4, "(Landroidx/compose/ui/text/d$a;Landroidx/compose/ui/text/d0;Lyh/l;)Ljava/lang/Object;", ak.aD, "(Landroidx/compose/ui/text/d$a;Landroidx/compose/ui/text/u;Lyh/l;)Ljava/lang/Object;", "", "tag", "annotation", "y", "(Landroidx/compose/ui/text/d$a;Ljava/lang/String;Ljava/lang/String;Lyh/l;)Ljava/lang/Object;", "Landroidx/compose/ui/text/s0;", "ttsAnnotation", RXScreenCaptureService.KEY_WIDTH, "(Landroidx/compose/ui/text/d$a;Landroidx/compose/ui/text/s0;Lyh/l;)Ljava/lang/Object;", "Landroidx/compose/ui/text/t0;", "urlAnnotation", "x", "(Landroidx/compose/ui/text/d$a;Landroidx/compose/ui/text/t0;Lyh/l;)Ljava/lang/Object;", "ranges", "m", "text", "spanStyle", "b", ak.av, "Lkotlin/b2;", "builder", "f", "baseStart", "baseEnd", "targetStart", "targetEnd", "", "i", "lStart", "lEnd", "rStart", "rEnd", "o", "l", "Landroidx/compose/ui/text/d;", "EmptyAnnotatedString", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class AnnotatedStringKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final d f16168a = new d("", null, null, 6, null);

    @dl.d
    public static final <R> R A(@dl.d d.a aVar, @dl.d SpanStyle style, @dl.d yh.l<? super d.a, ? extends R> block) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        kotlin.jvm.internal.f0.p(style, "style");
        kotlin.jvm.internal.f0.p(block, "block");
        int iN = aVar.n(style);
        try {
            return block.invoke(aVar);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            aVar.k(iN);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    @dl.d
    public static final d a(@dl.d String text, @dl.d ParagraphStyle paragraphStyle) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(paragraphStyle, "paragraphStyle");
        return new d(text, CollectionsKt__CollectionsKt.E(), kotlin.collections.s.k(new d.Range(paragraphStyle, 0, text.length())));
    }

    @dl.d
    public static final d b(@dl.d String text, @dl.d SpanStyle spanStyle, @dl.e ParagraphStyle uVar) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(spanStyle, "spanStyle");
        return new d(text, kotlin.collections.s.k(new d.Range(spanStyle, 0, text.length())), uVar == null ? CollectionsKt__CollectionsKt.E() : kotlin.collections.s.k(new d.Range(uVar, 0, text.length())));
    }

    public static /* synthetic */ d c(String str, SpanStyle d0Var, ParagraphStyle uVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            uVar = null;
        }
        return b(str, d0Var, uVar);
    }

    @dl.d
    public static final d f(@dl.d yh.l<? super d.a, b2> builder) {
        kotlin.jvm.internal.f0.p(builder, "builder");
        d.a aVar = new d.a(0, 1, null);
        builder.invoke(aVar);
        return aVar.q();
    }

    @dl.d
    public static final d g(@dl.d d dVar, @dl.d final LocaleList localeList) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        kotlin.jvm.internal.f0.p(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.b(dVar, new yh.q<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt$capitalize$1
            {
                super(3);
            }

            @dl.d
            public final String a(@dl.d String str, int i10, int i11) {
                kotlin.jvm.internal.f0.p(str, "str");
                if (i10 == 0) {
                    String strSubstring = str.substring(i10, i11);
                    kotlin.jvm.internal.f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return e0.b(strSubstring, localeList);
                }
                String strSubstring2 = str.substring(i10, i11);
                kotlin.jvm.internal.f0.o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring2;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return a(str, num.intValue(), num2.intValue());
            }
        });
    }

    public static /* synthetic */ d h(d dVar, LocaleList fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = LocaleList.f138137d.a();
        }
        return g(dVar, fVar);
    }

    public static final boolean i(int i10, int i11, int i12, int i13) {
        if (i10 <= i12 && i13 <= i11) {
            if (i11 != i13) {
                return true;
            }
            if ((i12 == i13) == (i10 == i11)) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    public static final d j(@dl.d d dVar, @dl.d final LocaleList localeList) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        kotlin.jvm.internal.f0.p(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.b(dVar, new yh.q<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt$decapitalize$1
            {
                super(3);
            }

            @dl.d
            public final String a(@dl.d String str, int i10, int i11) {
                kotlin.jvm.internal.f0.p(str, "str");
                if (i10 == 0) {
                    String strSubstring = str.substring(i10, i11);
                    kotlin.jvm.internal.f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return e0.d(strSubstring, localeList);
                }
                String strSubstring2 = str.substring(i10, i11);
                kotlin.jvm.internal.f0.o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring2;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return a(str, num.intValue(), num2.intValue());
            }
        });
    }

    public static /* synthetic */ d k(d dVar, LocaleList fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = LocaleList.f138137d.a();
        }
        return j(dVar, fVar);
    }

    @dl.d
    public static final d l() {
        return f16168a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<d.Range<T>> m(List<? extends d.Range<? extends T>> list, int i10, int i11) {
        if (!(i10 <= i11)) {
            throw new IllegalArgumentException(("start (" + i10 + ") should be less than or equal to end (" + i11 + ')').toString());
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            d.Range<? extends T> range = list.get(i12);
            d.Range<? extends T> range2 = range;
            if (o(i10, i11, range2.i(), range2.g())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            d.Range range3 = (d.Range) arrayList.get(i13);
            arrayList2.add(new d.Range(range3.h(), Math.max(i10, range3.i()) - i10, Math.min(i11, range3.g()) - i10, range3.j()));
        }
        return arrayList2;
    }

    private static final List<d.Range<SpanStyle>> n(d dVar, int i10, int i11) {
        if (i10 == i11) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (i10 == 0 && i11 >= dVar.getText().length()) {
            return dVar.e();
        }
        List<d.Range<SpanStyle>> listE = dVar.e();
        ArrayList arrayList = new ArrayList(listE.size());
        int size = listE.size();
        for (int i12 = 0; i12 < size; i12++) {
            d.Range<SpanStyle> range = listE.get(i12);
            d.Range<SpanStyle> range2 = range;
            if (o(i10, i11, range2.i(), range2.g())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            d.Range range3 = (d.Range) arrayList.get(i13);
            arrayList2.add(new d.Range(range3.h(), fi.u.I(range3.i(), i10, i11) - i10, fi.u.I(range3.g(), i10, i11) - i10));
        }
        return arrayList2;
    }

    public static final boolean o(int i10, int i11, int i12, int i13) {
        return Math.max(i10, i12) < Math.min(i11, i13) || i(i10, i11, i12, i13) || i(i12, i13, i10, i11);
    }

    @dl.d
    public static final <T> List<T> p(@dl.d d dVar, @dl.d ParagraphStyle defaultParagraphStyle, @dl.d yh.p<? super d, ? super d.Range<ParagraphStyle>, ? extends T> block) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        kotlin.jvm.internal.f0.p(defaultParagraphStyle, "defaultParagraphStyle");
        kotlin.jvm.internal.f0.p(block, "block");
        List<d.Range<ParagraphStyle>> listQ = q(dVar, defaultParagraphStyle);
        ArrayList arrayList = new ArrayList(listQ.size());
        int size = listQ.size();
        for (int i10 = 0; i10 < size; i10++) {
            d.Range<ParagraphStyle> range = listQ.get(i10);
            arrayList.add(block.invoke(r(dVar, range.i(), range.g()), range));
        }
        return arrayList;
    }

    @dl.d
    public static final List<d.Range<ParagraphStyle>> q(@dl.d d dVar, @dl.d ParagraphStyle defaultParagraphStyle) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        kotlin.jvm.internal.f0.p(defaultParagraphStyle, "defaultParagraphStyle");
        int length = dVar.getText().length();
        List<d.Range<ParagraphStyle>> listD = dVar.d();
        ArrayList arrayList = new ArrayList();
        int size = listD.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            d.Range<ParagraphStyle> range = listD.get(i10);
            ParagraphStyle uVarA = range.a();
            int start = range.getStart();
            int end = range.getEnd();
            if (start != i11) {
                arrayList.add(new d.Range(defaultParagraphStyle, i11, start));
            }
            arrayList.add(new d.Range(defaultParagraphStyle.q(uVarA), start, end));
            i10++;
            i11 = end;
        }
        if (i11 != length) {
            arrayList.add(new d.Range(defaultParagraphStyle, i11, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new d.Range(defaultParagraphStyle, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d r(d dVar, int i10, int i11) {
        String strSubstring;
        if (i10 != i11) {
            strSubstring = dVar.getText().substring(i10, i11);
            kotlin.jvm.internal.f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "";
        }
        return new d(strSubstring, n(dVar, i10, i11), null, 4, null);
    }

    @dl.d
    public static final d s(@dl.d d dVar, @dl.d final LocaleList localeList) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        kotlin.jvm.internal.f0.p(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.b(dVar, new yh.q<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt$toLowerCase$1
            {
                super(3);
            }

            @dl.d
            public final String a(@dl.d String str, int i10, int i11) {
                kotlin.jvm.internal.f0.p(str, "str");
                String strSubstring = str.substring(i10, i11);
                kotlin.jvm.internal.f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return e0.f(strSubstring, localeList);
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return a(str, num.intValue(), num2.intValue());
            }
        });
    }

    public static /* synthetic */ d t(d dVar, LocaleList fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = LocaleList.f138137d.a();
        }
        return s(dVar, fVar);
    }

    @dl.d
    public static final d u(@dl.d d dVar, @dl.d final LocaleList localeList) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        kotlin.jvm.internal.f0.p(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.b(dVar, new yh.q<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt$toUpperCase$1
            {
                super(3);
            }

            @dl.d
            public final String a(@dl.d String str, int i10, int i11) {
                kotlin.jvm.internal.f0.p(str, "str");
                String strSubstring = str.substring(i10, i11);
                kotlin.jvm.internal.f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return e0.h(strSubstring, localeList);
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return a(str, num.intValue(), num2.intValue());
            }
        });
    }

    public static /* synthetic */ d v(d dVar, LocaleList fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = LocaleList.f138137d.a();
        }
        return u(dVar, fVar);
    }

    @dl.d
    @g
    public static final <R> R w(@dl.d d.a aVar, @dl.d s0 ttsAnnotation, @dl.d yh.l<? super d.a, ? extends R> block) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        kotlin.jvm.internal.f0.p(ttsAnnotation, "ttsAnnotation");
        kotlin.jvm.internal.f0.p(block, "block");
        int iO = aVar.o(ttsAnnotation);
        try {
            return block.invoke(aVar);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            aVar.k(iO);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    @dl.d
    @g
    public static final <R> R x(@dl.d d.a aVar, @dl.d UrlAnnotation urlAnnotation, @dl.d yh.l<? super d.a, ? extends R> block) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        kotlin.jvm.internal.f0.p(urlAnnotation, "urlAnnotation");
        kotlin.jvm.internal.f0.p(block, "block");
        int iP = aVar.p(urlAnnotation);
        try {
            return block.invoke(aVar);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            aVar.k(iP);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    @dl.d
    @g
    public static final <R> R y(@dl.d d.a aVar, @dl.d String tag, @dl.d String annotation, @dl.d yh.l<? super d.a, ? extends R> block) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        kotlin.jvm.internal.f0.p(tag, "tag");
        kotlin.jvm.internal.f0.p(annotation, "annotation");
        kotlin.jvm.internal.f0.p(block, "block");
        int iL = aVar.l(tag, annotation);
        try {
            return block.invoke(aVar);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            aVar.k(iL);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    @dl.d
    public static final <R> R z(@dl.d d.a aVar, @dl.d ParagraphStyle style, @dl.d yh.l<? super d.a, ? extends R> block) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        kotlin.jvm.internal.f0.p(style, "style");
        kotlin.jvm.internal.f0.p(block, "block");
        int iM = aVar.m(style);
        try {
            return block.invoke(aVar);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            aVar.k(iM);
            kotlin.jvm.internal.c0.c(1);
        }
    }
}
