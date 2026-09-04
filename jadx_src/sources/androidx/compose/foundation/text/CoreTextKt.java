package androidx.compose.foundation.text;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.e1;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.h0;
import androidx.compose.ui.layout.i0;
import androidx.compose.ui.layout.j0;
import androidx.compose.ui.layout.k0;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.d2;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CoreText.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a@\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002'\u0010\t\u001a#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00070\u0003j\u0002`\b0\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001ao\u0010\u001c\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00030\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a[\u0010\u001e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001aa\u0010%\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001a0\u0003j\u0002`$0\u0002\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00070\u0003j\u0002`\b0\u00020#2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!0 H\u0000\"Q\u0010'\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001a0\u0003j\u0002`$0\u0002\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00070\u0003j\u0002`\b0\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&*:\b\u0002\u0010(\"\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00070\u00032\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00070\u0003*\u0018\b\u0002\u0010)\"\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\u0012\u0004\u0012\u00020\u001a0\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/compose/ui/text/d;", "text", "", "Landroidx/compose/ui/text/d$b;", "Lkotlin/Function1;", "", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "Landroidx/compose/foundation/text/InlineContentRange;", "inlineContents", ak.av, "(Landroidx/compose/ui/text/d;Ljava/util/List;Landroidx/compose/runtime/p;I)V", "Landroidx/compose/foundation/text/p;", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "Landroidx/compose/ui/text/q0;", "style", "Ls1/e;", "density", "Landroidx/compose/ui/text/font/v$b;", "fontFamilyResolver", "", "softWrap", "Landroidx/compose/ui/text/style/q;", "overflow", "", "maxLines", "Landroidx/compose/ui/text/w;", "placeholders", ak.aF, "(Landroidx/compose/foundation/text/p;Landroidx/compose/ui/text/d;Landroidx/compose/ui/text/q0;Ls1/e;Landroidx/compose/ui/text/font/v$b;ZIILjava/util/List;)Landroidx/compose/foundation/text/p;", "e", "(Landroidx/compose/foundation/text/p;Ljava/lang/String;Landroidx/compose/ui/text/q0;Ls1/e;Landroidx/compose/ui/text/font/v$b;ZII)Landroidx/compose/foundation/text/p;", "", "Landroidx/compose/foundation/text/a;", "inlineContent", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/PlaceholderRange;", "b", "Lkotlin/Pair;", "EmptyInlineContent", "InlineContentRange", "PlaceholderRange", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class CoreTextKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> f7829a = new Pair<>(CollectionsKt__CollectionsKt.E(), CollectionsKt__CollectionsKt.E());

    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final androidx.compose.ui.text.d text, @dl.d final List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>> inlineContents, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        f0.p(text, "text");
        f0.p(inlineContents, "inlineContents");
        androidx.compose.runtime.p pVarF = pVar.F(-110905764);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-110905764, i10, -1, "androidx.compose.foundation.text.InlineChildren (CoreText.kt:75)");
        }
        int size = inlineContents.size();
        int i11 = 0;
        while (i11 < size) {
            androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>> range = inlineContents.get(i11);
            yh.q<String, androidx.compose.runtime.p, Integer, b2> qVarA = range.a();
            int start = range.getStart();
            int end = range.getEnd();
            CoreTextKt$InlineChildren$1$2 coreTextKt$InlineChildren$1$2 = new i0() { // from class: androidx.compose.foundation.text.CoreTextKt$InlineChildren$1$2
                @Override // androidx.compose.ui.layout.i0
                @dl.d
                public final j0 a(@dl.d l0 Layout, @dl.d List<? extends g0> children, long j10) {
                    f0.p(Layout, "$this$Layout");
                    f0.p(children, "children");
                    final ArrayList arrayList = new ArrayList(children.size());
                    int size2 = children.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        arrayList.add(children.get(i12).z1(j10));
                    }
                    return k0.p(Layout, s1.b.p(j10), s1.b.o(j10), null, new yh.l<e1.a, b2>() { // from class: androidx.compose.foundation.text.CoreTextKt$InlineChildren$1$2$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d e1.a layout) {
                            f0.p(layout, "$this$layout");
                            List<e1> list = arrayList;
                            int size3 = list.size();
                            for (int i13 = 0; i13 < size3; i13++) {
                                e1.a.v(layout, list.get(i13), 0, 0, 0.0f, 4, null);
                            }
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                            a(aVar);
                            return b2.f124493a;
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int b(androidx.compose.ui.layout.n nVar, List list, int i12) {
                    return h0.c(this, nVar, list, i12);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int c(androidx.compose.ui.layout.n nVar, List list, int i12) {
                    return h0.d(this, nVar, list, i12);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int d(androidx.compose.ui.layout.n nVar, List list, int i12) {
                    return h0.a(this, nVar, list, i12);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int e(androidx.compose.ui.layout.n nVar, List list, int i12) {
                    return h0.b(this, nVar, list, i12);
                }
            };
            pVarF.T(-1323940314);
            androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
            s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            d2 d2Var = (d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            yh.a<ComposeUiNode> aVarA = companion2.a();
            yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF = LayoutKt.f(companion);
            int i12 = size;
            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVarF.h();
            if (pVarF.D()) {
                pVarF.L(aVarA);
            } else {
                pVarF.d();
            }
            pVarF.Y();
            androidx.compose.runtime.p pVarB = Updater.b(pVarF);
            Updater.j(pVarB, coreTextKt$InlineChildren$1$2, companion2.d());
            Updater.j(pVarB, eVar, companion2.b());
            Updater.j(pVarB, layoutDirection, companion2.c());
            Updater.j(pVarB, d2Var, companion2.f());
            pVarF.x();
            qVarF.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarF.T(-72427749);
            qVarA.invoke(text.subSequence(start, end).getText(), pVarF, 0);
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            i11++;
            size = i12;
        }
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.CoreTextKt$InlineChildren$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i13) {
                CoreTextKt.a(text, inlineContents, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @dl.d
    public static final Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> b(@dl.d androidx.compose.ui.text.d text, @dl.d Map<String, a> inlineContent) {
        f0.p(text, "text");
        f0.p(inlineContent, "inlineContent");
        if (inlineContent.isEmpty()) {
            return f7829a;
        }
        List<androidx.compose.ui.text.d.Range<String>> listG = text.g(b.f8061a, 0, text.length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.text.d.Range<String> range = listG.get(i10);
            a aVar = inlineContent.get(range.h());
            if (aVar != null) {
                arrayList.add(new androidx.compose.ui.text.d.Range(aVar.getPlaceholder(), range.i(), range.g()));
                arrayList2.add(new androidx.compose.ui.text.d.Range(aVar.a(), range.i(), range.g()));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @dl.d
    public static final p c(@dl.d p current, @dl.d androidx.compose.ui.text.d text, @dl.d TextStyle style, @dl.d s1.e density, @dl.d androidx.compose.ui.text.font.v.b fontFamilyResolver, boolean z10, int i10, int i11, @dl.d List<androidx.compose.ui.text.d.Range<Placeholder>> placeholders) {
        f0.p(current, "current");
        f0.p(text, "text");
        f0.p(style, "style");
        f0.p(density, "density");
        f0.p(fontFamilyResolver, "fontFamilyResolver");
        f0.p(placeholders, "placeholders");
        if (f0.g(current.getText(), text) && f0.g(current.getStyle(), style)) {
            if (current.getSoftWrap() == z10) {
                if (androidx.compose.ui.text.style.q.g(current.getOverflow(), i10)) {
                    if (current.getMaxLines() == i11 && f0.g(current.getF8116f(), density) && f0.g(current.j(), placeholders) && current.getFontFamilyResolver() == fontFamilyResolver) {
                        return current;
                    }
                }
                return new p(text, style, i11, z10, i10, density, fontFamilyResolver, placeholders, null);
            }
            return new p(text, style, i11, z10, i10, density, fontFamilyResolver, placeholders, null);
        }
        return new p(text, style, i11, z10, i10, density, fontFamilyResolver, placeholders, null);
    }

    @dl.d
    public static final p e(@dl.d p current, @dl.d String text, @dl.d TextStyle style, @dl.d s1.e density, @dl.d androidx.compose.ui.text.font.v.b fontFamilyResolver, boolean z10, int i10, int i11) {
        f0.p(current, "current");
        f0.p(text, "text");
        f0.p(style, "style");
        f0.p(density, "density");
        f0.p(fontFamilyResolver, "fontFamilyResolver");
        if (f0.g(current.getText().getText(), text) && f0.g(current.getStyle(), style)) {
            if (current.getSoftWrap() == z10) {
                if (androidx.compose.ui.text.style.q.g(current.getOverflow(), i10)) {
                    if (current.getMaxLines() == i11 && f0.g(current.getF8116f(), density) && current.getFontFamilyResolver() == fontFamilyResolver) {
                        return current;
                    }
                }
                return new p(new androidx.compose.ui.text.d(text, null, null, 6, null), style, i11, z10, i10, density, fontFamilyResolver, null, 128, null);
            }
            return new p(new androidx.compose.ui.text.d(text, null, null, 6, null), style, i11, z10, i10, density, fontFamilyResolver, null, 128, null);
        }
        return new p(new androidx.compose.ui.text.d(text, null, null, 6, null), style, i11, z10, i10, density, fontFamilyResolver, null, 128, null);
    }
}
