package androidx.compose.ui.platform;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* JADX INFO: compiled from: CompositionLocals.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002\"\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"(\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0012\"&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0012\"\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012\"\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u000e8\u0006¢\u0006\f\n\u0004\b\"\u0010\u0010\u001a\u0004\b#\u0010\u0012\"\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u000e8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b&\u0010\u0012\"&\u0010,\u001a\b\u0012\u0004\u0012\u00020(0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010\u0010\u0012\u0004\b+\u0010\u0018\u001a\u0004\b*\u0010\u0012\"\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b.\u0010\u0012\"\u001d\u00102\u001a\b\u0012\u0004\u0012\u0002000\u000e8\u0006¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b1\u0010\u0012\"\u001d\u00105\u001a\b\u0012\u0004\u0012\u0002030\u000e8\u0006¢\u0006\f\n\u0004\b&\u0010\u0010\u001a\u0004\b4\u0010\u0012\"\u001d\u00108\u001a\b\u0012\u0004\u0012\u0002060\u000e8\u0006¢\u0006\f\n\u0004\b.\u0010\u0010\u001a\u0004\b7\u0010\u0012\"\u001f\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010\u0010\u001a\u0004\b:\u0010\u0012\"\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020<0\u000e8\u0006¢\u0006\f\n\u0004\b=\u0010\u0010\u001a\u0004\b>\u0010\u0012\"\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b1\u0010\u0010\u001a\u0004\b@\u0010\u0012\"\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020B0\u000e8\u0006¢\u0006\f\n\u0004\b4\u0010\u0010\u001a\u0004\bC\u0010\u0012\"\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020E0\u000e8\u0006¢\u0006\f\n\u0004\b7\u0010\u0010\u001a\u0004\bF\u0010\u0012\"\"\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010\u0010\u001a\u0004\bI\u0010\u0012¨\u0006K"}, d2 = {"Landroidx/compose/ui/node/b1;", "owner", "Landroidx/compose/ui/platform/y1;", "uriHandler", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", ak.av, "(Landroidx/compose/ui/node/b1;Landroidx/compose/ui/platform/y1;Lyh/p;Landroidx/compose/runtime/p;I)V", "", "name", "", RXScreenCaptureService.KEY_WIDTH, "Landroidx/compose/runtime/j1;", "Landroidx/compose/ui/platform/c;", "Landroidx/compose/runtime/j1;", ak.aF, "()Landroidx/compose/runtime/j1;", "LocalAccessibilityManager", "La1/e;", "b", "d", "getLocalAutofill$annotations", "()V", "LocalAutofill", "La1/n;", "f", "getLocalAutofillTree$annotations", "LocalAutofillTree", "Landroidx/compose/ui/platform/k0;", RXScreenCaptureService.KEY_HEIGHT, "LocalClipboardManager", "Ls1/e;", "e", "i", "LocalDensity", "Landroidx/compose/ui/focus/g;", "j", "LocalFocusManager", "Landroidx/compose/ui/text/font/u$b;", "g", "l", "getLocalFontLoader$annotations", "LocalFontLoader", "Landroidx/compose/ui/text/font/v$b;", "k", "LocalFontFamilyResolver", "Ld1/a;", "n", "LocalHapticFeedback", "Le1/b;", "o", "LocalInputModeManager", "Landroidx/compose/ui/unit/LayoutDirection;", "p", "LocalLayoutDirection", "Landroidx/compose/ui/text/input/i0;", "r", "LocalTextInputService", "Landroidx/compose/ui/platform/w1;", "m", ak.aB, "LocalTextToolbar", "t", "LocalUriHandler", "Landroidx/compose/ui/platform/d2;", ak.aG, "LocalViewConfiguration", "Landroidx/compose/ui/platform/o2;", "v", "LocalWindowInfo", "Landroidx/compose/ui/input/pointer/v;", "q", "LocalPointerIconService", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class CompositionLocalsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<c> f15596a = CompositionLocalKt.e(new yh.a<c>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAccessibilityManager$1
        @Override // yh.a
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            return null;
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<a1.e> f15597b = CompositionLocalKt.e(new yh.a<a1.e>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofill$1
        @Override // yh.a
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a1.e invoke() {
            return null;
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<a1.n> f15598c = CompositionLocalKt.e(new yh.a<a1.n>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofillTree$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a1.n invoke() {
            CompositionLocalsKt.w("LocalAutofillTree");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<k0> f15599d = CompositionLocalKt.e(new yh.a<k0>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboardManager$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            CompositionLocalsKt.w("LocalClipboardManager");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<s1.e> f15600e = CompositionLocalKt.e(new yh.a<s1.e>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalDensity$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s1.e invoke() {
            CompositionLocalsKt.w("LocalDensity");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<androidx.compose.ui.focus.g> f15601f = CompositionLocalKt.e(new yh.a<androidx.compose.ui.focus.g>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFocusManager$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.focus.g invoke() {
            CompositionLocalsKt.w("LocalFocusManager");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<androidx.compose.ui.text.font.u.b> f15602g = CompositionLocalKt.e(new yh.a<androidx.compose.ui.text.font.u.b>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontLoader$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.font.u.b invoke() {
            CompositionLocalsKt.w("LocalFontLoader");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<androidx.compose.ui.text.font.v.b> f15603h = CompositionLocalKt.e(new yh.a<androidx.compose.ui.text.font.v.b>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontFamilyResolver$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.font.v.b invoke() {
            CompositionLocalsKt.w("LocalFontFamilyResolver");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<d1.a> f15604i = CompositionLocalKt.e(new yh.a<d1.a>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalHapticFeedback$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d1.a invoke() {
            CompositionLocalsKt.w("LocalHapticFeedback");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<e1.b> f15605j = CompositionLocalKt.e(new yh.a<e1.b>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalInputModeManager$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e1.b invoke() {
            CompositionLocalsKt.w("LocalInputManager");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<LayoutDirection> f15606k = CompositionLocalKt.e(new yh.a<LayoutDirection>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalLayoutDirection$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LayoutDirection invoke() {
            CompositionLocalsKt.w("LocalLayoutDirection");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<androidx.compose.ui.text.input.i0> f15607l = CompositionLocalKt.e(new yh.a<androidx.compose.ui.text.input.i0>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextInputService$1
        @Override // yh.a
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.input.i0 invoke() {
            return null;
        }
    });

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<w1> f15608m = CompositionLocalKt.e(new yh.a<w1>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextToolbar$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w1 invoke() {
            CompositionLocalsKt.w("LocalTextToolbar");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<y1> f15609n = CompositionLocalKt.e(new yh.a<y1>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalUriHandler$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y1 invoke() {
            CompositionLocalsKt.w("LocalUriHandler");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<d2> f15610o = CompositionLocalKt.e(new yh.a<d2>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalViewConfiguration$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d2 invoke() {
            CompositionLocalsKt.w("LocalViewConfiguration");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<o2> f15611p = CompositionLocalKt.e(new yh.a<o2>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalWindowInfo$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o2 invoke() {
            CompositionLocalsKt.w("LocalWindowInfo");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<androidx.compose.ui.input.pointer.v> f15612q = CompositionLocalKt.e(new yh.a<androidx.compose.ui.input.pointer.v>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalPointerIconService$1
        @Override // yh.a
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.input.pointer.v invoke() {
            return null;
        }
    });

    @androidx.compose.ui.g
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final androidx.compose.ui.node.b1 owner, @dl.d final y1 uriHandler, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        int i11;
        kotlin.jvm.internal.f0.p(owner, "owner");
        kotlin.jvm.internal.f0.p(uriHandler, "uriHandler");
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(874662829);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(owner) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= pVarF.s(uriHandler) ? 32 : 16;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            i11 |= pVarF.s(content) ? 256 : 128;
        }
        if ((i11 & bb.c.b.f30586db) == 146 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(874662829, i11, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:171)");
            }
            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{f15596a.f(owner.getAccessibilityManager()), f15597b.f(owner.getAutofill()), f15598c.f(owner.getF15438p()), f15599d.f(owner.getClipboardManager()), f15600e.f(owner.getF15427e()), f15601f.f(owner.getFocusManager()), f15602g.g(owner.getFontLoader()), f15603h.g(owner.getFontFamilyResolver()), f15604i.f(owner.getF15450x1()), f15605j.f(owner.getInputModeManager()), f15606k.f(owner.getLayoutDirection()), f15607l.f(owner.getTextInputService()), f15608m.f(owner.getTextToolbar()), f15609n.f(uriHandler), f15610o.f(owner.getViewConfiguration()), f15611p.f(owner.getWindowInfo()), f15612q.f(owner.getPointerIconService())}, content, pVarF, ((i11 >> 3) & 112) | 8);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$ProvideCommonCompositionLocals$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                CompositionLocalsKt.a(owner, uriHandler, content, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    @dl.d
    public static final androidx.compose.runtime.j1<c> c() {
        return f15596a;
    }

    @androidx.compose.ui.g
    @dl.d
    public static final androidx.compose.runtime.j1<a1.e> d() {
        return f15597b;
    }

    @androidx.compose.ui.g
    public static /* synthetic */ void e() {
    }

    @androidx.compose.ui.g
    @dl.d
    public static final androidx.compose.runtime.j1<a1.n> f() {
        return f15598c;
    }

    @androidx.compose.ui.g
    public static /* synthetic */ void g() {
    }

    @dl.d
    public static final androidx.compose.runtime.j1<k0> h() {
        return f15599d;
    }

    @dl.d
    public static final androidx.compose.runtime.j1<s1.e> i() {
        return f15600e;
    }

    @dl.d
    public static final androidx.compose.runtime.j1<androidx.compose.ui.focus.g> j() {
        return f15601f;
    }

    @dl.d
    public static final androidx.compose.runtime.j1<androidx.compose.ui.text.font.v.b> k() {
        return f15603h;
    }

    @dl.d
    public static final androidx.compose.runtime.j1<androidx.compose.ui.text.font.u.b> l() {
        return f15602g;
    }

    @kotlin.k(message = "LocalFontLoader is replaced with LocalFontFamilyResolver", replaceWith = @kotlin.s0(expression = "LocalFontFamilyResolver", imports = {}))
    public static /* synthetic */ void m() {
    }

    @dl.d
    public static final androidx.compose.runtime.j1<d1.a> n() {
        return f15604i;
    }

    @dl.d
    public static final androidx.compose.runtime.j1<e1.b> o() {
        return f15605j;
    }

    @dl.d
    public static final androidx.compose.runtime.j1<LayoutDirection> p() {
        return f15606k;
    }

    @dl.d
    public static final androidx.compose.runtime.j1<androidx.compose.ui.input.pointer.v> q() {
        return f15612q;
    }

    @dl.d
    public static final androidx.compose.runtime.j1<androidx.compose.ui.text.input.i0> r() {
        return f15607l;
    }

    @dl.d
    public static final androidx.compose.runtime.j1<w1> s() {
        return f15608m;
    }

    @dl.d
    public static final androidx.compose.runtime.j1<y1> t() {
        return f15609n;
    }

    @dl.d
    public static final androidx.compose.runtime.j1<d2> u() {
        return f15610o;
    }

    @dl.d
    public static final androidx.compose.runtime.j1<o2> v() {
        return f15611p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void w(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
