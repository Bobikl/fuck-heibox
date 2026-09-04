package androidx.compose.ui.window;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.annotation.j1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.u1;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.j2;
import androidx.compose.ui.platform.k2;
import androidx.compose.ui.t;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.o0;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import s1.n;
import s1.o;
import s1.p;
import s1.r;
import s1.s;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BX\u0012\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u0010F\u001a\u00020D\u0012\b\u0010\u008d\u0001\u001a\u00030\u008c\u0001\u0012\u0007\u0010\u008e\u0001\u001a\u00020R\u0012\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001\u0012\b\b\u0002\u0010I\u001a\u00020G¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0006\u0010\u0014\u001a\u00020\u0005J(\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0002\b\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\fH\u0010¢\u0006\u0004\b \u0010!J7\u0010'\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0010¢\u0006\u0004\b'\u0010(J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)H\u0016J.\u00101\u001a\u00020\u00052\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00172\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u00104\u001a\u00020\u00052\u0006\u00103\u001a\u000202J\u0006\u00105\u001a\u00020\u0005J\u000f\u00106\u001a\u00020\u0005H\u0001¢\u0006\u0004\b6\u00107J\u0006\u00108\u001a\u00020\u0005J\u0006\u00109\u001a\u00020\u0005J\u0012\u0010;\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010:H\u0016J\u0010\u0010<\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\"\u00100\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010ER\u0014\u0010I\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010HR\u0014\u0010L\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010KR \u0010Q\u001a\u00020\u00128\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010M\u0012\u0004\bP\u00107\u001a\u0004\bN\u0010OR\"\u0010X\u001a\u00020R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010^\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R8\u0010f\u001a\u0004\u0018\u00010_2\b\u0010`\u001a\u0004\u0018\u00010_8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b6\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR/\u00103\u001a\u0004\u0018\u0001022\b\u0010`\u001a\u0004\u0018\u0001028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010a\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u001b\u0010o\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u001d\u0010s\u001a\u00020p8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vRA\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0002\b\u00182\u0011\u0010`\u001a\r\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0002\b\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bx\u0010a\u001a\u0004\by\u0010z\"\u0004\b\u001a\u0010{R$\u0010\u007f\u001a\u00020\u00032\u0006\u0010`\u001a\u00020\u00038\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010nR\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0086\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0088\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0085\u0001R\u0017\u0010\u008b\u0001\u001a\u00020\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0093\u0001"}, d2 = {"Landroidx/compose/ui/window/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/k2;", "", "isFocusable", "Lkotlin/b2;", "setIsFocusable", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "setSecurePolicy", "clippingEnabled", "setClippingEnabled", "", Constants.KEY_FLAGS, "l", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "q", "Landroid/view/WindowManager$LayoutParams;", "m", "p", "Landroidx/compose/runtime/r;", "parent", "Lkotlin/Function0;", "Landroidx/compose/runtime/h;", "content", "setContent", "(Landroidx/compose/runtime/r;Lyh/p;)V", ak.av, "(Landroidx/compose/runtime/p;I)V", "widthMeasureSpec", "heightMeasureSpec", RXScreenCaptureService.KEY_HEIGHT, "(II)V", "changed", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "g", "(ZIIII)V", "Landroid/view/KeyEvent;", o0.I0, "dispatchKeyEvent", "onDismissRequest", "Landroidx/compose/ui/window/h;", "properties", "", "testTag", "r", "Landroidx/compose/ui/layout/q;", "parentLayoutCoordinates", "t", "o", ak.aB, "()V", ak.aG, "n", "Landroid/view/MotionEvent;", "onTouchEvent", "setLayoutDirection", "k", "Landroidx/compose/ui/window/h;", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "Landroid/view/View;", "Landroid/view/View;", "composeView", "Landroidx/compose/ui/window/d;", "Landroidx/compose/ui/window/d;", "popupLayoutHelper", "Landroid/view/WindowManager;", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release", "()Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release$annotations", "params", "Landroidx/compose/ui/window/g;", "Landroidx/compose/ui/window/g;", "getPositionProvider", "()Landroidx/compose/ui/window/g;", "setPositionProvider", "(Landroidx/compose/ui/window/g;)V", "positionProvider", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "parentLayoutDirection", "Ls1/r;", "<set-?>", "Landroidx/compose/runtime/a1;", "getPopupContentSize-bOM6tXw", "()Ls1/r;", "setPopupContentSize-fhxjrPA", "(Ls1/r;)V", "popupContentSize", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/q;", "setParentLayoutCoordinates", "(Landroidx/compose/ui/layout/q;)V", "v", "Landroidx/compose/runtime/m2;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "Ls1/h;", RXScreenCaptureService.KEY_WIDTH, "F", "maxSupportedElevation", "Landroid/graphics/Rect;", "x", "Landroid/graphics/Rect;", "previousWindowVisibleFrame", "y", "getContent", "()Lyh/p;", "(Lyh/p;)V", ak.aD, "Z", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "", androidx.exifinterface.media.a.W4, "[I", "locationOnScreen", "getDisplayWidth", "()I", "displayWidth", "getDisplayHeight", "displayHeight", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "Ls1/e;", "density", "initialPositionProvider", "Ljava/util/UUID;", "popupId", "<init>", "(Lyh/a;Landroidx/compose/ui/window/h;Ljava/lang/String;Landroid/view/View;Ls1/e;Landroidx/compose/ui/window/g;Ljava/util/UUID;Landroidx/compose/ui/window/d;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"ViewConstructor"})
public final class PopupLayout extends AbstractComposeView implements k2 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @dl.d
    private final int[] locationOnScreen;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private yh.a<b2> f17185j;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private h properties;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private String testTag;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final View composeView;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final d popupLayoutHelper;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final WindowManager windowManager;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final WindowManager.LayoutParams params;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private g positionProvider;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private LayoutDirection parentLayoutDirection;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 popupContentSize;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 parentLayoutCoordinates;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.e
    private p f17196u;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m2 canCalculatePosition;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final float maxSupportedElevation;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Rect previousWindowVisibleFrame;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 content;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"androidx/compose/ui/window/PopupLayout$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", sd.b.f139384b, "Landroid/graphics/Outline;", "result", "Lkotlin/b2;", "getOutline", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(@dl.d View view, @dl.d Outline result) {
            f0.p(view, "view");
            f0.p(result, "result");
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(0.0f);
        }
    }

    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17204a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            f17204a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PopupLayout(@dl.e yh.a<b2> aVar, @dl.d h properties, @dl.d String testTag, @dl.d View composeView, @dl.d s1.e density, @dl.d g initialPositionProvider, @dl.d UUID popupId, @dl.d d popupLayoutHelper) {
        f0.p(properties, "properties");
        f0.p(testTag, "testTag");
        f0.p(composeView, "composeView");
        f0.p(density, "density");
        f0.p(initialPositionProvider, "initialPositionProvider");
        f0.p(popupId, "popupId");
        f0.p(popupLayoutHelper, "popupLayoutHelper");
        Context context = composeView.getContext();
        f0.o(context, "composeView.context");
        super(context, null, 0, 6, null);
        this.f17185j = aVar;
        this.properties = properties;
        this.testTag = testTag;
        this.composeView = composeView;
        this.popupLayoutHelper = popupLayoutHelper;
        Object systemService = composeView.getContext().getSystemService("window");
        f0.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        this.params = m();
        this.positionProvider = initialPositionProvider;
        this.parentLayoutDirection = LayoutDirection.Ltr;
        this.popupContentSize = h2.g(null, null, 2, null);
        this.parentLayoutCoordinates = h2.g(null, null, 2, null);
        this.canCalculatePosition = e2.d(new yh.a<Boolean>() { // from class: androidx.compose.ui.window.PopupLayout$canCalculatePosition$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf((this.f17205b.getParentLayoutCoordinates() == null || this.f17205b.m6getPopupContentSizebOM6tXw() == null) ? false : true);
            }
        });
        float fG = s1.h.g(8);
        this.maxSupportedElevation = fG;
        this.previousWindowVisibleFrame = new Rect();
        setId(R.id.content);
        ViewTreeLifecycleOwner.b(this, ViewTreeLifecycleOwner.a(composeView));
        ViewTreeViewModelStoreOwner.b(this, ViewTreeViewModelStoreOwner.a(composeView));
        ViewTreeSavedStateRegistryOwner.b(this, ViewTreeSavedStateRegistryOwner.a(composeView));
        setTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag, "Popup:" + popupId);
        setClipChildren(false);
        setElevation(density.E1(fG));
        setOutlineProvider(new a());
        this.content = h2.g(ComposableSingletons$AndroidPopup_androidKt.f17168a.a(), null, 2, null);
        this.locationOnScreen = new int[2];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PopupLayout(yh.a aVar, h hVar, String str, View view, s1.e eVar, g gVar, UUID uuid, d dVar, int i10, u uVar) {
        d eVar2;
        if ((i10 & 128) != 0) {
            eVar2 = Build.VERSION.SDK_INT >= 29 ? new e() : new f();
        } else {
            eVar2 = dVar;
        }
        this(aVar, hVar, str, view, eVar, gVar, uuid, eVar2);
    }

    private final yh.p<androidx.compose.runtime.p, Integer, b2> getContent() {
        return (yh.p) this.content.getValue();
    }

    private final int getDisplayHeight() {
        return di.d.L0(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return di.d.L0(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    @j1(otherwise = 2)
    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q getParentLayoutCoordinates() {
        return (q) this.parentLayoutCoordinates.getValue();
    }

    private final void l(int i10) {
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.flags = i10;
        this.popupLayoutHelper.a(this.windowManager, this, layoutParams);
    }

    private final WindowManager.LayoutParams m() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = (layoutParams.flags & (-8552473)) | 262144;
        layoutParams.type = 1002;
        layoutParams.token = this.composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(androidx.compose.ui.R.string.default_popup_window_title));
        return layoutParams;
    }

    private final void q(LayoutDirection layoutDirection) {
        int i10 = b.f17204a[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i11);
    }

    private final void setClippingEnabled(boolean z10) {
        l(z10 ? this.params.flags & (-513) : this.params.flags | 512);
    }

    private final void setContent(yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> pVar) {
        this.content.setValue(pVar);
    }

    private final void setIsFocusable(boolean z10) {
        l(!z10 ? this.params.flags | 8 : this.params.flags & (-9));
    }

    private final void setParentLayoutCoordinates(q qVar) {
        this.parentLayoutCoordinates.setValue(qVar);
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy) {
        l(i.a(secureFlagPolicy, AndroidPopup_androidKt.i(this.composeView)) ? this.params.flags | 8192 : this.params.flags & (-8193));
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @t
    @androidx.compose.runtime.h
    public void a(@dl.e androidx.compose.runtime.p pVar, final int i10) {
        androidx.compose.runtime.p pVarF = pVar.F(-857613600);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-857613600, i10, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:461)");
        }
        getContent().invoke(pVarF, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.window.PopupLayout$Content$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i11) {
                this.f17202b.a(pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@dl.d KeyEvent event) {
        KeyEvent.DispatcherState keyDispatcherState;
        f0.p(event, "event");
        if (event.getKeyCode() == 4 && this.properties.getDismissOnBackPress()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(event, this);
                }
                return true;
            }
            if (event.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                yh.a<b2> aVar = this.f17185j;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void g(boolean changed, int left, int top, int right, int bottom) {
        super.g(changed, left, top, right, bottom);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.params.width = childAt.getMeasuredWidth();
        this.params.height = childAt.getMeasuredHeight();
        this.popupLayoutHelper.a(this.windowManager, this, this.params);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition.getValue()).booleanValue();
    }

    @dl.d
    /* JADX INFO: renamed from: getParams$ui_release, reason: from getter */
    public final WindowManager.LayoutParams getParams() {
        return this.params;
    }

    @dl.d
    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final r m6getPopupContentSizebOM6tXw() {
        return (r) this.popupContentSize.getValue();
    }

    @dl.d
    public final g getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.platform.k2
    @dl.d
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    @dl.d
    public final String getTestTag() {
        return this.testTag;
    }

    @Override // androidx.compose.ui.platform.k2
    public /* synthetic */ View getViewRoot() {
        return j2.b(this);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void h(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.properties.getUsePlatformDefaultWidth()) {
            super.h(widthMeasureSpec, heightMeasureSpec);
        } else {
            super.h(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final void n() {
        ViewTreeLifecycleOwner.b(this, null);
        this.windowManager.removeViewImmediate(this);
    }

    public final void o() {
        int[] iArr = this.locationOnScreen;
        int i10 = iArr[0];
        int i11 = iArr[1];
        this.composeView.getLocationOnScreen(iArr);
        int[] iArr2 = this.locationOnScreen;
        if (i10 == iArr2[0] && i11 == iArr2[1]) {
            return;
        }
        s();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@dl.e MotionEvent event) {
        if (!this.properties.getDismissOnClickOutside()) {
            return super.onTouchEvent(event);
        }
        boolean z10 = false;
        if ((event != null && event.getAction() == 0) && (event.getX() < 0.0f || event.getX() >= getWidth() || event.getY() < 0.0f || event.getY() >= getHeight())) {
            yh.a<b2> aVar = this.f17185j;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        if (event != null && event.getAction() == 4) {
            z10 = true;
        }
        if (!z10) {
            return super.onTouchEvent(event);
        }
        yh.a<b2> aVar2 = this.f17185j;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return true;
    }

    public final void p() {
        this.windowManager.addView(this, this.params);
    }

    public final void r(@dl.e yh.a<b2> aVar, @dl.d h properties, @dl.d String testTag, @dl.d LayoutDirection layoutDirection) {
        f0.p(properties, "properties");
        f0.p(testTag, "testTag");
        f0.p(layoutDirection, "layoutDirection");
        this.f17185j = aVar;
        this.properties = properties;
        this.testTag = testTag;
        setIsFocusable(properties.getFocusable());
        setSecurePolicy(properties.getSecurePolicy());
        setClippingEnabled(properties.getClippingEnabled());
        q(layoutDirection);
    }

    @j1(otherwise = 2)
    public final void s() {
        q parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        long jA = parentLayoutCoordinates.a();
        long jG = androidx.compose.ui.layout.r.g(parentLayoutCoordinates);
        p pVarB = s1.q.b(o.a(di.d.L0(b1.f.p(jG)), di.d.L0(b1.f.r(jG))), jA);
        if (f0.g(pVarB, this.f17196u)) {
            return;
        }
        this.f17196u = pVarB;
        u();
    }

    public final void setContent(@dl.d androidx.compose.runtime.r parent, @dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> content) {
        f0.p(parent, "parent");
        f0.p(content, "content");
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }

    public final void setParentLayoutDirection(@dl.d LayoutDirection layoutDirection) {
        f0.p(layoutDirection, "<set-?>");
        this.parentLayoutDirection = layoutDirection;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m7setPopupContentSizefhxjrPA(@dl.e r rVar) {
        this.popupContentSize.setValue(rVar);
    }

    public final void setPositionProvider(@dl.d g gVar) {
        f0.p(gVar, "<set-?>");
        this.positionProvider = gVar;
    }

    public final void setTestTag(@dl.d String str) {
        f0.p(str, "<set-?>");
        this.testTag = str;
    }

    public final void t(@dl.d q parentLayoutCoordinates) {
        f0.p(parentLayoutCoordinates, "parentLayoutCoordinates");
        setParentLayoutCoordinates(parentLayoutCoordinates);
        s();
    }

    public final void u() {
        r rVarM6getPopupContentSizebOM6tXw;
        p pVar = this.f17196u;
        if (pVar == null || (rVarM6getPopupContentSizebOM6tXw = m6getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long f139248a = rVarM6getPopupContentSizebOM6tXw.getF139248a();
        Rect rect = this.previousWindowVisibleFrame;
        this.popupLayoutHelper.c(this.composeView, rect);
        p pVarL = AndroidPopup_androidKt.l(rect);
        long jA = s.a(pVarL.G(), pVarL.r());
        long jA2 = this.positionProvider.a(pVar, jA, this.parentLayoutDirection, f139248a);
        this.params.x = n.m(jA2);
        this.params.y = n.o(jA2);
        if (this.properties.getExcludeFromSystemGesture()) {
            this.popupLayoutHelper.b(this, r.m(jA), r.j(jA));
        }
        this.popupLayoutHelper.a(this.windowManager, this, this.params);
    }
}
