package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.n3;
import com.max.xiaoheihe.bean.bbs.BBSTopicMenuObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowInsets.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001HB\u001b\b\u0002\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\bF\u0010GJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0018\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u001b\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u001e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010 \u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\"\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b!\u0010\u0010R\u0017\u0010$\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b#\u0010\u0010R\u0017\u0010)\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b\u001a\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010/\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u00102\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.R\u0017\u00103\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b0\u0010.R\u0017\u00104\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b\u0019\u0010(R\u0017\u00105\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b+\u0010(R\u0017\u00107\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b6\u0010&\u001a\u0004\b6\u0010(R\u0017\u00109\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b8\u0010(R\u0017\u0010;\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b8\u0010&\u001a\u0004\b:\u0010(R\u0017\u0010?\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b!\u0010=\u001a\u0004\b\u001c\u0010>R\u0016\u0010A\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010@R\u0014\u0010D\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010C¨\u0006I"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder;", "", "Landroid/view/View;", sd.b.f139384b, "Lkotlin/b2;", RXScreenCaptureService.KEY_WIDTH, ak.aF, "Landroidx/core/view/n3;", "windowInsets", "", "types", "x", "Landroidx/compose/foundation/layout/f;", ak.av, "Landroidx/compose/foundation/layout/f;", "d", "()Landroidx/compose/foundation/layout/f;", "captionBar", "b", "g", "displayCutout", RXScreenCaptureService.KEY_HEIGHT, "ime", "i", "mandatorySystemGestures", "e", "j", "navigationBars", "f", "o", "statusBars", "q", "systemBars", ak.aB, "systemGestures", "t", "tappableElement", "Landroidx/compose/foundation/layout/f1;", "Landroidx/compose/foundation/layout/f1;", "v", "()Landroidx/compose/foundation/layout/f1;", BBSTopicMenuObj.TYPE_WATERFALL, "Landroidx/compose/foundation/layout/h1;", "k", "Landroidx/compose/foundation/layout/h1;", "m", "()Landroidx/compose/foundation/layout/h1;", "safeDrawing", "l", "n", "safeGestures", "safeContent", "captionBarIgnoringVisibility", "navigationBarsIgnoringVisibility", "p", "statusBarsIgnoringVisibility", "r", "systemBarsIgnoringVisibility", ak.aG, "tappableElementIgnoringVisibility", "", "Z", "()Z", "consumes", "I", "accessCount", "Landroidx/compose/foundation/layout/y;", "Landroidx/compose/foundation/layout/y;", "insetsListener", "insets", "<init>", "(Landroidx/core/view/n3;Landroid/view/View;)V", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class WindowInsetsHolder {

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final WeakHashMap<View, WindowInsetsHolder> f6171w = new WeakHashMap<>();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static boolean f6172x;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f captionBar;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f displayCutout;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f ime;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f mandatorySystemGestures;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f navigationBars;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f statusBars;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f systemBars;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f systemGestures;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f tappableElement;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f1 waterfall;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final h1 safeDrawing;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final h1 safeGestures;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final h1 safeContent;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f1 captionBarIgnoringVisibility;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f1 navigationBarsIgnoringVisibility;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f1 statusBarsIgnoringVisibility;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f1 systemBarsIgnoringVisibility;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f1 tappableElementIgnoringVisibility;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean consumes;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int accessCount;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final y insetsListener;

    /* JADX INFO: compiled from: WindowInsets.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\"\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010J\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder$Companion;", "", "Landroid/view/View;", sd.b.f139384b, "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "d", "Landroidx/core/view/n3;", "windowInsets", "", "type", "", "name", "Landroidx/compose/foundation/layout/f;", "f", "Landroidx/compose/foundation/layout/f1;", "g", "", "testInsets", "Lkotlin/b2;", "e", ak.aF, "(Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/layout/WindowInsetsHolder;", "Z", "Ljava/util/WeakHashMap;", "viewMap", "Ljava/util/WeakHashMap;", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        private final WindowInsetsHolder d(View view) {
            WindowInsetsHolder windowInsetsHolder;
            synchronized (WindowInsetsHolder.f6171w) {
                WeakHashMap weakHashMap = WindowInsetsHolder.f6171w;
                Object obj = weakHashMap.get(view);
                Object obj2 = obj;
                if (obj == null) {
                    WindowInsetsHolder windowInsetsHolder2 = new WindowInsetsHolder(null, view, false ? 1 : 0);
                    weakHashMap.put(view, windowInsetsHolder2);
                    obj2 = windowInsetsHolder2;
                }
                windowInsetsHolder = (WindowInsetsHolder) obj2;
            }
            return windowInsetsHolder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final f f(n3 windowInsets, int type, String name) {
            f fVar = new f(type, name);
            if (windowInsets != null) {
                fVar.j(windowInsets, type);
            }
            return fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final f1 g(n3 windowInsets, int type, String name) {
            androidx.core.graphics.h0 h0VarG;
            if (windowInsets == null || (h0VarG = windowInsets.g(type)) == null) {
                h0VarG = androidx.core.graphics.h0.f20741e;
            }
            kotlin.jvm.internal.f0.o(h0VarG, "windowInsets?.getInsetsI…e) ?: AndroidXInsets.NONE");
            return l1.a(h0VarG, name);
        }

        @dl.d
        @androidx.compose.runtime.h
        public final WindowInsetsHolder c(@dl.e androidx.compose.runtime.p pVar, int i10) {
            pVar.T(-1366542614);
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1366542614, i10, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:554)");
            }
            final View view = (View) pVar.K(AndroidCompositionLocals_androidKt.k());
            final WindowInsetsHolder windowInsetsHolderD = d(view);
            EffectsKt.c(windowInsetsHolderD, new yh.l<androidx.compose.runtime.f0, androidx.compose.runtime.e0>() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1

                /* JADX INFO: compiled from: Effects.kt */
                @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                public static final class a implements androidx.compose.runtime.e0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ WindowInsetsHolder f6196a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ View f6197b;

                    public a(WindowInsetsHolder windowInsetsHolder, View view) {
                        this.f6196a = windowInsetsHolder;
                        this.f6197b = view;
                    }

                    @Override // androidx.compose.runtime.e0
                    public void dispose() {
                        this.f6196a.c(this.f6197b);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final androidx.compose.runtime.e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                    kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                    windowInsetsHolderD.w(view);
                    return new a(windowInsetsHolderD, view);
                }
            }, pVar, 8);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVar.c0();
            return windowInsetsHolderD;
        }

        public final void e(boolean z10) {
            WindowInsetsHolder.f6172x = z10;
        }
    }

    private WindowInsetsHolder(n3 n3Var, View view) {
        androidx.core.view.g gVarE;
        Companion companion = INSTANCE;
        this.captionBar = companion.f(n3Var, n3.m.b(), "captionBar");
        f fVarF = companion.f(n3Var, n3.m.c(), "displayCutout");
        this.displayCutout = fVarF;
        f fVarF2 = companion.f(n3Var, n3.m.d(), "ime");
        this.ime = fVarF2;
        f fVarF3 = companion.f(n3Var, n3.m.f(), "mandatorySystemGestures");
        this.mandatorySystemGestures = fVarF3;
        this.navigationBars = companion.f(n3Var, n3.m.g(), "navigationBars");
        this.statusBars = companion.f(n3Var, n3.m.h(), "statusBars");
        f fVarF4 = companion.f(n3Var, n3.m.i(), "systemBars");
        this.systemBars = fVarF4;
        f fVarF5 = companion.f(n3Var, n3.m.j(), "systemGestures");
        this.systemGestures = fVarF5;
        f fVarF6 = companion.f(n3Var, n3.m.k(), "tappableElement");
        this.tappableElement = fVarF6;
        androidx.core.graphics.h0 h0VarG = (n3Var == null || (gVarE = n3Var.e()) == null || (h0VarG = gVarE.g()) == null) ? androidx.core.graphics.h0.f20741e : h0VarG;
        kotlin.jvm.internal.f0.o(h0VarG, "insets?.displayCutout?.w…ts ?: AndroidXInsets.NONE");
        f1 f1VarA = l1.a(h0VarG, BBSTopicMenuObj.TYPE_WATERFALL);
        this.waterfall = f1VarA;
        h1 h1VarK = i1.k(i1.k(fVarF4, fVarF2), fVarF);
        this.safeDrawing = h1VarK;
        h1 h1VarK2 = i1.k(i1.k(i1.k(fVarF6, fVarF3), fVarF5), f1VarA);
        this.safeGestures = h1VarK2;
        this.safeContent = i1.k(h1VarK, h1VarK2);
        this.captionBarIgnoringVisibility = companion.g(n3Var, n3.m.b(), "captionBarIgnoringVisibility");
        this.navigationBarsIgnoringVisibility = companion.g(n3Var, n3.m.g(), "navigationBarsIgnoringVisibility");
        this.statusBarsIgnoringVisibility = companion.g(n3Var, n3.m.h(), "statusBarsIgnoringVisibility");
        this.systemBarsIgnoringVisibility = companion.g(n3Var, n3.m.i(), "systemBarsIgnoringVisibility");
        this.tappableElementIgnoringVisibility = companion.g(n3Var, n3.m.k(), "tappableElementIgnoringVisibility");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.consumes = bool != null ? bool.booleanValue() : true;
        this.insetsListener = new y(this);
    }

    public /* synthetic */ WindowInsetsHolder(n3 n3Var, View view, kotlin.jvm.internal.u uVar) {
        this(n3Var, view);
    }

    public static /* synthetic */ void y(WindowInsetsHolder windowInsetsHolder, n3 n3Var, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        windowInsetsHolder.x(n3Var, i10);
    }

    public final void c(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "view");
        int i10 = this.accessCount - 1;
        this.accessCount = i10;
        if (i10 == 0) {
            androidx.core.view.j1.a2(view, null);
            androidx.core.view.j1.y2(view, null);
            view.removeOnAttachStateChangeListener(this.insetsListener);
        }
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final f getCaptionBar() {
        return this.captionBar;
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final f1 getCaptionBarIgnoringVisibility() {
        return this.captionBarIgnoringVisibility;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getConsumes() {
        return this.consumes;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final f getDisplayCutout() {
        return this.displayCutout;
    }

    @dl.d
    /* JADX INFO: renamed from: h, reason: from getter */
    public final f getIme() {
        return this.ime;
    }

    @dl.d
    /* JADX INFO: renamed from: i, reason: from getter */
    public final f getMandatorySystemGestures() {
        return this.mandatorySystemGestures;
    }

    @dl.d
    /* JADX INFO: renamed from: j, reason: from getter */
    public final f getNavigationBars() {
        return this.navigationBars;
    }

    @dl.d
    /* JADX INFO: renamed from: k, reason: from getter */
    public final f1 getNavigationBarsIgnoringVisibility() {
        return this.navigationBarsIgnoringVisibility;
    }

    @dl.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public final h1 getSafeContent() {
        return this.safeContent;
    }

    @dl.d
    /* JADX INFO: renamed from: m, reason: from getter */
    public final h1 getSafeDrawing() {
        return this.safeDrawing;
    }

    @dl.d
    /* JADX INFO: renamed from: n, reason: from getter */
    public final h1 getSafeGestures() {
        return this.safeGestures;
    }

    @dl.d
    /* JADX INFO: renamed from: o, reason: from getter */
    public final f getStatusBars() {
        return this.statusBars;
    }

    @dl.d
    /* JADX INFO: renamed from: p, reason: from getter */
    public final f1 getStatusBarsIgnoringVisibility() {
        return this.statusBarsIgnoringVisibility;
    }

    @dl.d
    /* JADX INFO: renamed from: q, reason: from getter */
    public final f getSystemBars() {
        return this.systemBars;
    }

    @dl.d
    /* JADX INFO: renamed from: r, reason: from getter */
    public final f1 getSystemBarsIgnoringVisibility() {
        return this.systemBarsIgnoringVisibility;
    }

    @dl.d
    /* JADX INFO: renamed from: s, reason: from getter */
    public final f getSystemGestures() {
        return this.systemGestures;
    }

    @dl.d
    /* JADX INFO: renamed from: t, reason: from getter */
    public final f getTappableElement() {
        return this.tappableElement;
    }

    @dl.d
    /* JADX INFO: renamed from: u, reason: from getter */
    public final f1 getTappableElementIgnoringVisibility() {
        return this.tappableElementIgnoringVisibility;
    }

    @dl.d
    /* JADX INFO: renamed from: v, reason: from getter */
    public final f1 getWaterfall() {
        return this.waterfall;
    }

    public final void w(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "view");
        if (this.accessCount == 0) {
            androidx.core.view.j1.a2(view, this.insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.insetsListener);
            if (Build.VERSION.SDK_INT >= 30) {
                androidx.core.view.j1.y2(view, this.insetsListener);
            }
        }
        this.accessCount++;
    }

    public final void x(@dl.d n3 windowInsets, int i10) {
        kotlin.jvm.internal.f0.p(windowInsets, "windowInsets");
        if (f6172x) {
            WindowInsets windowInsetsJ = windowInsets.J();
            kotlin.jvm.internal.f0.m(windowInsetsJ);
            windowInsets = n3.K(windowInsetsJ);
        }
        kotlin.jvm.internal.f0.o(windowInsets, "if (testInsets) {\n      …   windowInsets\n        }");
        this.captionBar.j(windowInsets, i10);
        this.ime.j(windowInsets, i10);
        this.displayCutout.j(windowInsets, i10);
        this.navigationBars.j(windowInsets, i10);
        this.statusBars.j(windowInsets, i10);
        this.systemBars.j(windowInsets, i10);
        this.systemGestures.j(windowInsets, i10);
        this.tappableElement.j(windowInsets, i10);
        this.mandatorySystemGestures.j(windowInsets, i10);
        if (i10 == 0) {
            f1 f1Var = this.captionBarIgnoringVisibility;
            androidx.core.graphics.h0 h0VarG = windowInsets.g(n3.m.b());
            kotlin.jvm.internal.f0.o(h0VarG, "insets.getInsetsIgnoring…aptionBar()\n            )");
            f1Var.g(l1.M(h0VarG));
            f1 f1Var2 = this.navigationBarsIgnoringVisibility;
            androidx.core.graphics.h0 h0VarG2 = windowInsets.g(n3.m.g());
            kotlin.jvm.internal.f0.o(h0VarG2, "insets.getInsetsIgnoring…ationBars()\n            )");
            f1Var2.g(l1.M(h0VarG2));
            f1 f1Var3 = this.statusBarsIgnoringVisibility;
            androidx.core.graphics.h0 h0VarG3 = windowInsets.g(n3.m.h());
            kotlin.jvm.internal.f0.o(h0VarG3, "insets.getInsetsIgnoring…tatusBars()\n            )");
            f1Var3.g(l1.M(h0VarG3));
            f1 f1Var4 = this.systemBarsIgnoringVisibility;
            androidx.core.graphics.h0 h0VarG4 = windowInsets.g(n3.m.i());
            kotlin.jvm.internal.f0.o(h0VarG4, "insets.getInsetsIgnoring…ystemBars()\n            )");
            f1Var4.g(l1.M(h0VarG4));
            f1 f1Var5 = this.tappableElementIgnoringVisibility;
            androidx.core.graphics.h0 h0VarG5 = windowInsets.g(n3.m.k());
            kotlin.jvm.internal.f0.o(h0VarG5, "insets.getInsetsIgnoring…leElement()\n            )");
            f1Var5.g(l1.M(h0VarG5));
            androidx.core.view.g gVarE = windowInsets.e();
            if (gVarE != null) {
                androidx.core.graphics.h0 h0VarG6 = gVarE.g();
                kotlin.jvm.internal.f0.o(h0VarG6, "cutout.waterfallInsets");
                this.waterfall.g(l1.M(h0VarG6));
            }
        }
        androidx.compose.runtime.snapshots.f.INSTANCE.l();
    }
}
