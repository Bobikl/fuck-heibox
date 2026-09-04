package androidx.compose.ui.text;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: MultiParagraphIntrinsics.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020!\u0012\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'B=\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020!\u0012\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b&\u0010*J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR#\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012R\u0014\u0010 \u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001f¨\u0006+"}, d2 = {"Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "Landroidx/compose/ui/text/r;", "Landroidx/compose/ui/text/u;", "style", "defaultStyle", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/text/d;", ak.av, "Landroidx/compose/ui/text/d;", "e", "()Landroidx/compose/ui/text/d;", "annotatedString", "", "Landroidx/compose/ui/text/d$b;", "Landroidx/compose/ui/text/w;", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "placeholders", "", ak.aF, "Lkotlin/z;", "()F", "minIntrinsicWidth", "d", "maxIntrinsicWidth", "Landroidx/compose/ui/text/p;", "f", "infoList", "", "()Z", "hasStaleResolvedFonts", "Landroidx/compose/ui/text/q0;", "Ls1/e;", "density", "Landroidx/compose/ui/text/font/v$b;", "fontFamilyResolver", "<init>", "(Landroidx/compose/ui/text/d;Landroidx/compose/ui/text/q0;Ljava/util/List;Ls1/e;Landroidx/compose/ui/text/font/v$b;)V", "Landroidx/compose/ui/text/font/u$b;", "resourceLoader", "(Landroidx/compose/ui/text/d;Landroidx/compose/ui/text/q0;Ljava/util/List;Ls1/e;Landroidx/compose/ui/text/font/u$b;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class MultiParagraphIntrinsics implements r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f16177f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final d annotatedString;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<d.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlin.z minIntrinsicWidth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlin.z maxIntrinsicWidth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<ParagraphIntrinsicInfo> infoList;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "Font.ResourceLoader is deprecated, call with fontFamilyResolver", replaceWith = @kotlin.s0(expression = "MultiParagraphIntrinsics(annotatedString, style, placeholders, density, fontFamilyResolver)", imports = {}))
    public MultiParagraphIntrinsics(@dl.d d annotatedString, @dl.d TextStyle style, @dl.d List<d.Range<Placeholder>> placeholders, @dl.d s1.e density, @dl.d androidx.compose.ui.text.font.u.b resourceLoader) {
        this(annotatedString, style, placeholders, density, androidx.compose.ui.text.font.o.a(resourceLoader));
        kotlin.jvm.internal.f0.p(annotatedString, "annotatedString");
        kotlin.jvm.internal.f0.p(style, "style");
        kotlin.jvm.internal.f0.p(placeholders, "placeholders");
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(resourceLoader, "resourceLoader");
    }

    public MultiParagraphIntrinsics(@dl.d d dVar, @dl.d TextStyle style, @dl.d List<d.Range<Placeholder>> placeholders, @dl.d s1.e density, @dl.d androidx.compose.ui.text.font.v.b fontFamilyResolver) {
        d annotatedString = dVar;
        kotlin.jvm.internal.f0.p(annotatedString, "annotatedString");
        kotlin.jvm.internal.f0.p(style, "style");
        kotlin.jvm.internal.f0.p(placeholders, "placeholders");
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(fontFamilyResolver, "fontFamilyResolver");
        this.annotatedString = annotatedString;
        this.placeholders = placeholders;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.minIntrinsicWidth = kotlin.b0.b(lazyThreadSafetyMode, new yh.a<Float>() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$minIntrinsicWidth$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                ParagraphIntrinsicInfo paragraphIntrinsicInfo;
                r rVarG;
                List<ParagraphIntrinsicInfo> listF = this.f16184b.f();
                if (listF.isEmpty()) {
                    paragraphIntrinsicInfo = null;
                } else {
                    ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = listF.get(0);
                    float fA = paragraphIntrinsicInfo2.g().a();
                    int iG = CollectionsKt__CollectionsKt.G(listF);
                    int i10 = 1;
                    if (1 <= iG) {
                        while (true) {
                            ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = listF.get(i10);
                            float fA2 = paragraphIntrinsicInfo3.g().a();
                            if (Float.compare(fA, fA2) < 0) {
                                paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                                fA = fA2;
                            }
                            if (i10 == iG) {
                                break;
                            }
                            i10++;
                        }
                    }
                    paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
                }
                ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
                return Float.valueOf((paragraphIntrinsicInfo4 == null || (rVarG = paragraphIntrinsicInfo4.g()) == null) ? 0.0f : rVarG.a());
            }
        });
        this.maxIntrinsicWidth = kotlin.b0.b(lazyThreadSafetyMode, new yh.a<Float>() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$maxIntrinsicWidth$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                ParagraphIntrinsicInfo paragraphIntrinsicInfo;
                r rVarG;
                List<ParagraphIntrinsicInfo> listF = this.f16183b.f();
                if (listF.isEmpty()) {
                    paragraphIntrinsicInfo = null;
                } else {
                    ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = listF.get(0);
                    float fB = paragraphIntrinsicInfo2.g().b();
                    int iG = CollectionsKt__CollectionsKt.G(listF);
                    int i10 = 1;
                    if (1 <= iG) {
                        while (true) {
                            ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = listF.get(i10);
                            float fB2 = paragraphIntrinsicInfo3.g().b();
                            if (Float.compare(fB, fB2) < 0) {
                                paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                                fB = fB2;
                            }
                            if (i10 == iG) {
                                break;
                            }
                            i10++;
                        }
                    }
                    paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
                }
                ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
                return Float.valueOf((paragraphIntrinsicInfo4 == null || (rVarG = paragraphIntrinsicInfo4.g()) == null) ? 0.0f : rVarG.b());
            }
        });
        ParagraphStyle paragraphStyleW = style.W();
        List<d.Range<ParagraphStyle>> listQ = AnnotatedStringKt.q(annotatedString, paragraphStyleW);
        ArrayList arrayList = new ArrayList(listQ.size());
        int size = listQ.size();
        int i10 = 0;
        while (i10 < size) {
            d.Range<ParagraphStyle> range = listQ.get(i10);
            d dVarR = AnnotatedStringKt.r(annotatedString, range.i(), range.g());
            arrayList.add(new ParagraphIntrinsicInfo(s.b(dVarR.getText(), style.P(h(range.h(), paragraphStyleW)), dVarR.e(), k.b(g(), range.i(), range.g()), density, fontFamilyResolver), range.i(), range.g()));
            i10++;
            annotatedString = dVar;
        }
        this.infoList = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParagraphStyle h(ParagraphStyle style, ParagraphStyle defaultStyle) {
        androidx.compose.ui.text.style.j textDirection = style.getTextDirection();
        if (textDirection == null) {
            return ParagraphStyle.b(style, null, defaultStyle.getTextDirection(), 0L, null, 13, null);
        }
        textDirection.getValue();
        return style;
    }

    @Override // androidx.compose.ui.text.r
    public float a() {
        return ((Number) this.minIntrinsicWidth.getValue()).floatValue();
    }

    @Override // androidx.compose.ui.text.r
    public float b() {
        return ((Number) this.maxIntrinsicWidth.getValue()).floatValue();
    }

    @Override // androidx.compose.ui.text.r
    public boolean c() {
        List<ParagraphIntrinsicInfo> list = this.infoList;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).g().c()) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final d getAnnotatedString() {
        return this.annotatedString;
    }

    @dl.d
    public final List<ParagraphIntrinsicInfo> f() {
        return this.infoList;
    }

    @dl.d
    public final List<d.Range<Placeholder>> g() {
        return this.placeholders;
    }
}
