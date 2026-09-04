package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.k1;
import androidx.compose.ui.graphics.l1;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: MultiParagraph.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\b\u0017\u0012\u0006\u0010>\u001a\u000209\u0012\b\b\u0002\u0010B\u001a\u00020\u0002\u0012\b\b\u0002\u0010a\u001a\u00020$\u0012\u0006\u0010I\u001a\u00020\u0015¢\u0006\u0004\bb\u0010cB[\b\u0017\u0012\u0006\u0010Y\u001a\u00020W\u0012\u0006\u0010e\u001a\u00020d\u0012\u0014\b\u0002\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020g0f0O\u0012\b\b\u0002\u0010B\u001a\u00020\u0002\u0012\b\b\u0002\u0010a\u001a\u00020$\u0012\u0006\u0010I\u001a\u00020\u0015\u0012\u0006\u0010j\u001a\u00020i\u0012\u0006\u0010l\u001a\u00020k¢\u0006\u0004\bb\u0010mB[\b\u0017\u0012\u0006\u0010Y\u001a\u00020W\u0012\u0006\u0010e\u001a\u00020d\u0012\u0006\u0010I\u001a\u00020\u0015\u0012\u0006\u0010j\u001a\u00020i\u0012\u0006\u0010o\u001a\u00020n\u0012\u0014\b\u0002\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020g0f0O\u0012\b\b\u0002\u0010B\u001a\u00020\u0002\u0012\b\b\u0002\u0010a\u001a\u00020$¢\u0006\u0004\bb\u0010pB.\u0012\u0006\u0010>\u001a\u000209\u0012\u0006\u0010r\u001a\u00020q\u0012\b\b\u0002\u0010B\u001a\u00020\u0002\u0012\b\b\u0002\u0010a\u001a\u00020$ø\u0001\u0001¢\u0006\u0004\bb\u0010sB^\b\u0016\u0012\u0006\u0010Y\u001a\u00020W\u0012\u0006\u0010e\u001a\u00020d\u0012\u0006\u0010r\u001a\u00020q\u0012\u0006\u0010j\u001a\u00020i\u0012\u0006\u0010o\u001a\u00020n\u0012\u0014\b\u0002\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020g0f0O\u0012\b\b\u0002\u0010B\u001a\u00020\u0002\u0012\b\b\u0002\u0010a\u001a\u00020$ø\u0001\u0001¢\u0006\u0004\bb\u0010tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J=\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0017\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007J\u0016\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0015J\u001b\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u000e\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010&\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$J\u000e\u0010(\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010)\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010+\u001a\u00020*2\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J\u000e\u0010-\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010.\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010/\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u00100\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u00101\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u00102\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u00103\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u00104\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u00105\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0018\u00107\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u00106\u001a\u00020$J\u000e\u00108\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\u0002R\u0017\u0010>\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010B\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010F\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b#\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010I\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\bG\u0010HR\u0017\u0010K\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bD\u0010+\u001a\u0004\bJ\u0010HR\u0017\u0010N\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bL\u0010?\u001a\u0004\bM\u0010AR\u001f\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0O8\u0006¢\u0006\f\n\u0004\bJ\u0010P\u001a\u0004\bQ\u0010RR \u0010V\u001a\b\u0012\u0004\u0012\u00020T0O8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010P\u001a\u0004\bU\u0010RR\u0014\u0010Y\u001a\u00020W8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010XR\u0011\u0010[\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bZ\u0010HR\u0011\u0010]\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\\\u0010HR\u0011\u0010^\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bL\u0010HR\u0011\u0010`\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b_\u0010H\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006u"}, d2 = {"Landroidx/compose/ui/text/j;", "", "", androidx.constraintlayout.core.motion.utils.w.c.R, "Lkotlin/b2;", "L", "M", "lineIndex", "N", "Landroidx/compose/ui/graphics/d0;", "canvas", "Landroidx/compose/ui/graphics/l0;", "color", "Landroidx/compose/ui/graphics/e2;", "shadow", "Landroidx/compose/ui/text/style/i;", "decoration", "J", "(Landroidx/compose/ui/graphics/d0;JLandroidx/compose/ui/graphics/e2;Landroidx/compose/ui/text/style/i;)V", "Landroidx/compose/ui/graphics/a0;", "brush", "", "alpha", "H", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "Landroidx/compose/ui/graphics/l1;", "C", "vertical", "p", "Lb1/f;", CommonNetImpl.POSITION, ak.aD, "(J)I", "Lb1/i;", ak.aF, "", "usePrimaryDirection", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/text/style/ResolvedTextDirection;", androidx.exifinterface.media.a.W4, "b", "Landroidx/compose/ui/text/o0;", "F", "(I)J", "d", "o", "r", ak.aB, ak.aG, "k", "q", "v", "t", "visibleEnd", "m", "G", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", ak.av, "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "i", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "intrinsics", "I", "x", "()I", "maxLines", "Z", "e", "()Z", "didExceedMaxLines", androidx.exifinterface.media.a.S4, "()F", "width", "g", "height", "f", "l", "lineCount", "", "Ljava/util/List;", "D", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/text/o;", "B", "paragraphInfoList", "Landroidx/compose/ui/text/d;", "()Landroidx/compose/ui/text/d;", "annotatedString", "y", "minIntrinsicWidth", RXScreenCaptureService.KEY_WIDTH, "maxIntrinsicWidth", "firstBaseline", "j", "lastBaseline", "ellipsis", "<init>", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;IZF)V", "Landroidx/compose/ui/text/q0;", "style", "Landroidx/compose/ui/text/d$b;", "Landroidx/compose/ui/text/w;", "placeholders", "Ls1/e;", "density", "Landroidx/compose/ui/text/font/u$b;", "resourceLoader", "(Landroidx/compose/ui/text/d;Landroidx/compose/ui/text/q0;Ljava/util/List;IZFLs1/e;Landroidx/compose/ui/text/font/u$b;)V", "Landroidx/compose/ui/text/font/v$b;", "fontFamilyResolver", "(Landroidx/compose/ui/text/d;Landroidx/compose/ui/text/q0;FLs1/e;Landroidx/compose/ui/text/font/v$b;Ljava/util/List;IZ)V", "Ls1/b;", "constraints", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIZLkotlin/jvm/internal/u;)V", "(Landroidx/compose/ui/text/d;Landroidx/compose/ui/text/q0;JLs1/e;Landroidx/compose/ui/text/font/v$b;Ljava/util/List;IZLkotlin/jvm/internal/u;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f16804i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final MultiParagraphIntrinsics intrinsics;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean didExceedMaxLines;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float width;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float height;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int lineCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<b1.i> placeholderRects;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<ParagraphInfo> paragraphInfoList;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @kotlin.s0(expression = "MultiParagraph(intrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public j(@dl.d MultiParagraphIntrinsics intrinsics, int i10, boolean z10, float f10) {
        this(intrinsics, s1.c.b(0, t.k(f10), 0, 0, 13, null), i10, z10, null);
        kotlin.jvm.internal.f0.p(intrinsics, "intrinsics");
    }

    public /* synthetic */ j(MultiParagraphIntrinsics multiParagraphIntrinsics, int i10, boolean z10, float f10, int i11, kotlin.jvm.internal.u uVar) {
        this(multiParagraphIntrinsics, (i11 & 2) != 0 ? Integer.MAX_VALUE : i10, (i11 & 4) != 0 ? false : z10, f10);
    }

    private j(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, boolean z10) {
        boolean z11;
        this.intrinsics = multiParagraphIntrinsics;
        this.maxLines = i10;
        int i11 = 0;
        if (!(s1.b.r(j10) == 0 && s1.b.q(j10) == 0)) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        ArrayList arrayList = new ArrayList();
        List<ParagraphIntrinsicInfo> listF = multiParagraphIntrinsics.f();
        int size = listF.size();
        float f10 = 0.0f;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= size) {
                z11 = false;
                break;
            }
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = listF.get(i12);
            n nVarI = t.i(paragraphIntrinsicInfo.g(), s1.c.b(0, s1.b.p(j10), 0, s1.b.i(j10) ? fi.u.u(s1.b.o(j10) - t.k(f10), i11) : s1.b.o(j10), 5, null), this.maxLines - i13, z10);
            float height = f10 + nVarI.getHeight();
            int iR = i13 + nVarI.r();
            arrayList.add(new ParagraphInfo(nVarI, paragraphIntrinsicInfo.h(), paragraphIntrinsicInfo.f(), i13, iR, f10, height));
            if (nVarI.t() || (iR == this.maxLines && i12 != CollectionsKt__CollectionsKt.G(this.intrinsics.f()))) {
                i13 = iR;
                f10 = height;
                z11 = true;
                break;
            } else {
                i12++;
                i13 = iR;
                f10 = height;
                i11 = 0;
            }
        }
        this.height = f10;
        this.lineCount = i13;
        this.didExceedMaxLines = z11;
        this.paragraphInfoList = arrayList;
        this.width = s1.b.p(j10);
        List<b1.i> arrayList2 = new ArrayList<>(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i14);
            List<b1.i> listA = paragraphInfo.n().A();
            ArrayList arrayList3 = new ArrayList(listA.size());
            int size3 = listA.size();
            for (int i15 = 0; i15 < size3; i15++) {
                b1.i iVar = listA.get(i15);
                arrayList3.add(iVar != null ? paragraphInfo.w(iVar) : null);
            }
            kotlin.collections.x.n0(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.intrinsics.g().size()) {
            int size4 = this.intrinsics.g().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i16 = 0; i16 < size4; i16++) {
                arrayList4.add(null);
            }
            arrayList2 = CollectionsKt___CollectionsKt.y4(arrayList2, arrayList4);
        }
        this.placeholderRects = arrayList2;
    }

    public /* synthetic */ j(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, boolean z10, int i11, kotlin.jvm.internal.u uVar) {
        this(multiParagraphIntrinsics, j10, (i11 & 4) != 0 ? Integer.MAX_VALUE : i10, (i11 & 8) != 0 ? false : z10, null);
    }

    public /* synthetic */ j(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, boolean z10, kotlin.jvm.internal.u uVar) {
        this(multiParagraphIntrinsics, j10, i10, z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @kotlin.s0(expression = "MultiParagraph(annotatedString, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public j(@dl.d d annotatedString, @dl.d TextStyle style, float f10, @dl.d s1.e density, @dl.d androidx.compose.ui.text.font.v.b fontFamilyResolver, @dl.d List<d.Range<Placeholder>> placeholders, int i10, boolean z10) {
        this(new MultiParagraphIntrinsics(annotatedString, style, placeholders, density, fontFamilyResolver), s1.c.b(0, t.k(f10), 0, 0, 13, null), i10, z10, null);
        kotlin.jvm.internal.f0.p(annotatedString, "annotatedString");
        kotlin.jvm.internal.f0.p(style, "style");
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(fontFamilyResolver, "fontFamilyResolver");
        kotlin.jvm.internal.f0.p(placeholders, "placeholders");
    }

    public /* synthetic */ j(d dVar, TextStyle q0Var, float f10, s1.e eVar, androidx.compose.ui.text.font.v.b bVar, List list, int i10, boolean z10, int i11, kotlin.jvm.internal.u uVar) {
        this(dVar, q0Var, f10, eVar, bVar, (List<d.Range<Placeholder>>) ((i11 & 32) != 0 ? CollectionsKt__CollectionsKt.E() : list), (i11 & 64) != 0 ? Integer.MAX_VALUE : i10, (i11 & 128) != 0 ? false : z10);
    }

    private j(d dVar, TextStyle q0Var, long j10, s1.e eVar, androidx.compose.ui.text.font.v.b bVar, List<d.Range<Placeholder>> list, int i10, boolean z10) {
        this(new MultiParagraphIntrinsics(dVar, q0Var, list, eVar, bVar), j10, i10, z10, null);
    }

    public /* synthetic */ j(d dVar, TextStyle q0Var, long j10, s1.e eVar, androidx.compose.ui.text.font.v.b bVar, List list, int i10, boolean z10, int i11, kotlin.jvm.internal.u uVar) {
        this(dVar, q0Var, j10, eVar, bVar, (i11 & 32) != 0 ? CollectionsKt__CollectionsKt.E() : list, (i11 & 64) != 0 ? Integer.MAX_VALUE : i10, (i11 & 128) != 0 ? false : z10, null);
    }

    public /* synthetic */ j(d dVar, TextStyle q0Var, long j10, s1.e eVar, androidx.compose.ui.text.font.v.b bVar, List list, int i10, boolean z10, kotlin.jvm.internal.u uVar) {
        this(dVar, q0Var, j10, eVar, bVar, (List<d.Range<Placeholder>>) list, i10, z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "Font.ResourceLoader is deprecated, use fontFamilyResolver instead", replaceWith = @kotlin.s0(expression = "MultiParagraph(annotatedString, style, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public j(@dl.d d annotatedString, @dl.d TextStyle style, @dl.d List<d.Range<Placeholder>> placeholders, int i10, boolean z10, float f10, @dl.d s1.e density, @dl.d androidx.compose.ui.text.font.u.b resourceLoader) {
        this(new MultiParagraphIntrinsics(annotatedString, style, placeholders, density, androidx.compose.ui.text.font.o.a(resourceLoader)), s1.c.b(0, t.k(f10), 0, 0, 13, null), i10, z10, null);
        kotlin.jvm.internal.f0.p(annotatedString, "annotatedString");
        kotlin.jvm.internal.f0.p(style, "style");
        kotlin.jvm.internal.f0.p(placeholders, "placeholders");
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(resourceLoader, "resourceLoader");
    }

    public /* synthetic */ j(d dVar, TextStyle q0Var, List list, int i10, boolean z10, float f10, s1.e eVar, androidx.compose.ui.text.font.u.b bVar, int i11, kotlin.jvm.internal.u uVar) {
        this(dVar, q0Var, (List<d.Range<Placeholder>>) ((i11 & 4) != 0 ? CollectionsKt__CollectionsKt.E() : list), (i11 & 8) != 0 ? Integer.MAX_VALUE : i10, (i11 & 16) != 0 ? false : z10, f10, eVar, bVar);
    }

    public static /* synthetic */ void I(j jVar, androidx.compose.ui.graphics.d0 d0Var, androidx.compose.ui.graphics.a0 a0Var, float f10, Shadow e2Var, androidx.compose.ui.text.style.i iVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = Float.NaN;
        }
        jVar.H(d0Var, a0Var, f10, (i10 & 8) != 0 ? null : e2Var, (i10 & 16) != 0 ? null : iVar);
    }

    public static /* synthetic */ void K(j jVar, androidx.compose.ui.graphics.d0 d0Var, long j10, Shadow e2Var, androidx.compose.ui.text.style.i iVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = androidx.compose.ui.graphics.l0.INSTANCE.u();
        }
        jVar.J(d0Var, j10, (i10 & 4) != 0 ? null : e2Var, (i10 & 8) != 0 ? null : iVar);
    }

    private final void L(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < a().getText().length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i10 + ") is out of bounds [0, " + a().length() + ')').toString());
    }

    private final void M(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= a().getText().length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i10 + ") is out of bounds [0, " + a().length() + ']').toString());
    }

    private final void N(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.lineCount) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("lineIndex(" + i10 + ") is out of bounds [0, " + i10 + ')').toString());
    }

    private final d a() {
        return this.intrinsics.getAnnotatedString();
    }

    public static /* synthetic */ int n(j jVar, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return jVar.m(i10, z10);
    }

    @dl.d
    public final ResolvedTextDirection A(int offset) {
        M(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == a().length() ? CollectionsKt__CollectionsKt.G(this.paragraphInfoList) : l.b(this.paragraphInfoList, offset));
        return paragraphInfo.n().e(paragraphInfo.C(offset));
    }

    @dl.d
    public final List<ParagraphInfo> B() {
        return this.paragraphInfoList;
    }

    @dl.d
    public final l1 C(int start, int end) {
        if (!((start >= 0 && start <= end) && end <= a().getText().length())) {
            throw new IllegalArgumentException(("Start(" + start + ") or End(" + end + ") is out of range [0.." + a().getText().length() + "), or start > end!").toString());
        }
        if (start == end) {
            return androidx.compose.ui.graphics.o.a();
        }
        l1 l1VarA = androidx.compose.ui.graphics.o.a();
        int size = this.paragraphInfoList.size();
        for (int iB = l.b(this.paragraphInfoList, start); iB < size; iB++) {
            ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iB);
            if (paragraphInfo.o() >= end) {
                break;
            }
            if (paragraphInfo.o() != paragraphInfo.k()) {
                k1.c(l1VarA, paragraphInfo.v(paragraphInfo.n().u(paragraphInfo.C(start), paragraphInfo.C(end))), 0L, 2, null);
            }
        }
        return l1VarA;
    }

    @dl.d
    public final List<b1.i> D() {
        return this.placeholderRects;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public final long F(int offset) {
        M(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == a().length() ? CollectionsKt__CollectionsKt.G(this.paragraphInfoList) : l.b(this.paragraphInfoList, offset));
        return paragraphInfo.x(paragraphInfo.n().g(paragraphInfo.C(offset)));
    }

    public final boolean G(int lineIndex) {
        N(lineIndex);
        return this.paragraphInfoList.get(l.c(this.paragraphInfoList, lineIndex)).n().q(lineIndex);
    }

    @g
    public final void H(@dl.d androidx.compose.ui.graphics.d0 canvas, @dl.d androidx.compose.ui.graphics.a0 brush, float f10, @dl.e Shadow e2Var, @dl.e androidx.compose.ui.text.style.i iVar) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        kotlin.jvm.internal.f0.p(brush, "brush");
        androidx.compose.ui.text.platform.e.a(this, canvas, brush, f10, e2Var, iVar);
    }

    public final void J(@dl.d androidx.compose.ui.graphics.d0 canvas, long color, @dl.e Shadow shadow, @dl.e androidx.compose.ui.text.style.i decoration) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        canvas.f();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ParagraphInfo paragraphInfo = list.get(i10);
            paragraphInfo.n().C(canvas, color, shadow, decoration);
            canvas.b(0.0f, paragraphInfo.n().getHeight());
        }
        canvas.u();
    }

    @dl.d
    public final ResolvedTextDirection b(int offset) {
        M(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == a().length() ? CollectionsKt__CollectionsKt.G(this.paragraphInfoList) : l.b(this.paragraphInfoList, offset));
        return paragraphInfo.n().z(paragraphInfo.C(offset));
    }

    @dl.d
    public final b1.i c(int offset) {
        L(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(l.b(this.paragraphInfoList, offset));
        return paragraphInfo.w(paragraphInfo.n().c(paragraphInfo.C(offset)));
    }

    @dl.d
    public final b1.i d(int offset) {
        M(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == a().length() ? CollectionsKt__CollectionsKt.G(this.paragraphInfoList) : l.b(this.paragraphInfoList, offset));
        return paragraphInfo.w(paragraphInfo.n().p(paragraphInfo.C(offset)));
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float f() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return this.paragraphInfoList.get(0).n().h();
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    public final float h(int offset, boolean usePrimaryDirection) {
        M(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == a().length() ? CollectionsKt__CollectionsKt.G(this.paragraphInfoList) : l.b(this.paragraphInfoList, offset));
        return paragraphInfo.n().v(paragraphInfo.C(offset), usePrimaryDirection);
    }

    @dl.d
    /* JADX INFO: renamed from: i, reason: from getter */
    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final float j() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) CollectionsKt___CollectionsKt.k3(this.paragraphInfoList);
        return paragraphInfo.A(paragraphInfo.n().x());
    }

    public final float k(int lineIndex) {
        N(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(l.c(this.paragraphInfoList, lineIndex));
        return paragraphInfo.A(paragraphInfo.n().o(paragraphInfo.D(lineIndex)));
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getLineCount() {
        return this.lineCount;
    }

    public final int m(int lineIndex, boolean visibleEnd) {
        N(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(l.c(this.paragraphInfoList, lineIndex));
        return paragraphInfo.y(paragraphInfo.n().k(paragraphInfo.D(lineIndex), visibleEnd));
    }

    public final int o(int offset) {
        int iB;
        if (offset >= a().length()) {
            iB = CollectionsKt__CollectionsKt.G(this.paragraphInfoList);
        } else {
            iB = offset < 0 ? 0 : l.b(this.paragraphInfoList, offset);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iB);
        return paragraphInfo.z(paragraphInfo.n().y(paragraphInfo.C(offset)));
    }

    public final int p(float vertical) {
        int iG;
        if (vertical <= 0.0f) {
            iG = 0;
        } else {
            iG = vertical >= this.height ? CollectionsKt__CollectionsKt.G(this.paragraphInfoList) : l.d(this.paragraphInfoList, vertical);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iG);
        return paragraphInfo.m() == 0 ? Math.max(0, paragraphInfo.o() - 1) : paragraphInfo.z(paragraphInfo.n().m(paragraphInfo.E(vertical)));
    }

    public final float q(int lineIndex) {
        N(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(l.c(this.paragraphInfoList, lineIndex));
        return paragraphInfo.n().l(paragraphInfo.D(lineIndex));
    }

    public final float r(int lineIndex) {
        N(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(l.c(this.paragraphInfoList, lineIndex));
        return paragraphInfo.n().n(paragraphInfo.D(lineIndex));
    }

    public final float s(int lineIndex) {
        N(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(l.c(this.paragraphInfoList, lineIndex));
        return paragraphInfo.n().s(paragraphInfo.D(lineIndex));
    }

    public final int t(int lineIndex) {
        N(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(l.c(this.paragraphInfoList, lineIndex));
        return paragraphInfo.y(paragraphInfo.n().j(paragraphInfo.D(lineIndex)));
    }

    public final float u(int lineIndex) {
        N(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(l.c(this.paragraphInfoList, lineIndex));
        return paragraphInfo.A(paragraphInfo.n().f(paragraphInfo.D(lineIndex)));
    }

    public final float v(int lineIndex) {
        N(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(l.c(this.paragraphInfoList, lineIndex));
        return paragraphInfo.n().B(paragraphInfo.D(lineIndex));
    }

    public final float w() {
        return this.intrinsics.b();
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    public final float y() {
        return this.intrinsics.b();
    }

    public final int z(long position) {
        int iG;
        if (b1.f.r(position) <= 0.0f) {
            iG = 0;
        } else {
            iG = b1.f.r(position) >= this.height ? CollectionsKt__CollectionsKt.G(this.paragraphInfoList) : l.d(this.paragraphInfoList, b1.f.r(position));
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iG);
        return paragraphInfo.m() == 0 ? Math.max(0, paragraphInfo.o() - 1) : paragraphInfo.y(paragraphInfo.n().i(paragraphInfo.B(position)));
    }
}
