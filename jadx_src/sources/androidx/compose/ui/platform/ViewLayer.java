package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.unit.LayoutDirection;
import b1.MutableRect;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: compiled from: ViewLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u0081\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002/BB:\u0012\u0006\u0010Q\u001a\u00020M\u0012\u0006\u0010V\u001a\u00020R\u0012\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00040C\u0012\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00040E¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J§\u0001\u0010!\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020\u00042\u0006\u0010$\u001a\u00020+H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010*J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0016J\u0010\u00101\u001a\u00020\u00042\u0006\u0010.\u001a\u000200H\u0014J\b\u00102\u001a\u00020\u0004H\u0016J0\u00108\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00162\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u0002042\u0006\u0010/\u001a\u000204H\u0014J\b\u00109\u001a\u00020\u0004H\u0016J\b\u0010:\u001a\u00020\u0004H\u0016J\b\u0010;\u001a\u00020\u0004H\u0016J%\u0010>\u001a\u00020#2\u0006\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020\u0016H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010?J\u0018\u0010B\u001a\u00020\u00042\u0006\u0010A\u001a\u00020@2\u0006\u0010=\u001a\u00020\u0016H\u0016J*\u0010G\u001a\u00020\u00042\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00040C2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00040EH\u0016J\u001d\u0010J\u001a\u00020\u00042\u0006\u0010I\u001a\u00020HH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bJ\u0010KJ\u001d\u0010L\u001a\u00020\u00042\u0006\u0010I\u001a\u00020HH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010KR\u0017\u0010Q\u001a\u00020M8\u0006¢\u0006\f\n\u0004\b/\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010V\u001a\u00020R8\u0006¢\u0006\f\n\u0004\bB\u0010S\u001a\u0004\bT\u0010UR\u0014\u0010Y\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010XR\u0016\u0010[\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010ZR\u0018\u0010^\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010]R*\u0010d\u001a\u00020\u00162\u0006\u0010_\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010Z\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u0016\u0010e\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010ZR\u0014\u0010h\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010gR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00010i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010jR\u001f\u0010n\u001a\u00020\u00128\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bl\u0010mR\u001a\u0010s\u001a\u00020o8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bp\u0010m\u001a\u0004\bq\u0010rR\u0016\u0010w\u001a\u0004\u0018\u00010t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0014\u0010y\u001a\u00020o8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010rR$\u0010~\u001a\u00020\u00072\u0006\u0010_\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0082\u0001"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Landroidx/compose/ui/node/z0;", "Landroidx/compose/ui/layout/j;", "Lkotlin/b2;", "x", RXScreenCaptureService.KEY_WIDTH, "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/o2;", "transformOrigin", "Landroidx/compose/ui/graphics/g2;", "shape", "", "clip", "Landroidx/compose/ui/graphics/y1;", "renderEffect", "Landroidx/compose/ui/graphics/l0;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Ls1/e;", "density", ak.av, "(FFFFFFFFFFJLandroidx/compose/ui/graphics/g2;ZLandroidx/compose/ui/graphics/y1;JJLandroidx/compose/ui/unit/LayoutDirection;Ls1/e;)V", "Lb1/f;", CommonNetImpl.POSITION, RXScreenCaptureService.KEY_HEIGHT, "(J)Z", "Ls1/r;", UiKitSpanObj.TYPE_SIZE, "g", "(J)V", "Ls1/n;", "j", "Landroidx/compose/ui/graphics/d0;", "canvas", "b", "Landroid/graphics/Canvas;", "dispatchDraw", "invalidate", "changed", "", "l", "t", "r", "onLayout", "destroy", "k", "forceLayout", "point", "inverse", "f", "(JZ)J", "Lb1/d;", "rect", ak.aF, "Lkotlin/Function1;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "e", "Landroidx/compose/ui/graphics/c1;", "matrix", "d", "([F)V", "i", "Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/DrawChildContainer;", "Landroidx/compose/ui/platform/DrawChildContainer;", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", com.google.android.exoplayer2.text.ttml.d.W, "Landroidx/compose/ui/platform/g1;", "Landroidx/compose/ui/platform/g1;", "outlineResolver", "Z", "clipToBounds", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "clipBoundsCache", "value", "v", "()Z", "setInvalidated", "(Z)V", "isInvalidated", "drawnWithZ", "Landroidx/compose/ui/graphics/e0;", "Landroidx/compose/ui/graphics/e0;", "canvasHolder", "Landroidx/compose/ui/platform/b1;", "Landroidx/compose/ui/platform/b1;", "matrixCache", "m", "J", "mTransformOrigin", "", "n", "getLayerId", "()J", "layerId", "Landroidx/compose/ui/graphics/l1;", "getManualClipPath", "()Landroidx/compose/ui/graphics/l1;", "manualClipPath", "getOwnerViewId", "ownerViewId", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "cameraDistancePx", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/DrawChildContainer;Lyh/l;Lyh/a;)V", "o", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class ViewLayer extends View implements androidx.compose.ui.node.z0, androidx.compose.ui.layout.j {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final yh.p<View, Matrix, kotlin.b2> f15703p = new yh.p<View, Matrix, kotlin.b2>() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$getMatrix$1
        public final void a(@dl.d View view, @dl.d Matrix matrix) {
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(matrix, "matrix");
            matrix.set(view.getMatrix());
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ kotlin.b2 invoke(View view, Matrix matrix) {
            a(view, matrix);
            return kotlin.b2.f124493a;
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final ViewOutlineProvider f15704q = new a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.e
    private static Method f15705r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.e
    private static Field f15706s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f15707t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static boolean f15708u;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final DrawChildContainer container;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private yh.l<? super androidx.compose.ui.graphics.d0, kotlin.b2> f15711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private yh.a<kotlin.b2> f15712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final g1 outlineResolver;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Rect clipBoundsCache;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isInvalidated;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean drawnWithZ;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.graphics.e0 canvasHolder;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b1<View> matrixCache;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private long mTransformOrigin;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long layerId;

    /* JADX INFO: compiled from: ViewLayer.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/ViewLayer$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", sd.b.f139384b, "Landroid/graphics/Outline;", "outline", "Lkotlin/b2;", "getOutline", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(@dl.d View view, @dl.d Outline outline) {
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(outline, "outline");
            Outline outlineC = ((ViewLayer) view).outlineResolver.c();
            kotlin.jvm.internal.f0.m(outlineC);
            outline.set(outlineC);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ViewLayer$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ViewLayer.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R*\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b\u0013\u0010\u0014R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$b;", "", "Landroid/view/View;", sd.b.f139384b, "Lkotlin/b2;", "e", "Landroid/view/ViewOutlineProvider;", "OutlineProvider", "Landroid/view/ViewOutlineProvider;", "b", "()Landroid/view/ViewOutlineProvider;", "", "<set-?>", "hasRetrievedMethod", "Z", ak.av, "()Z", "shouldUseDispatchDraw", ak.aF, "d", "(Z)V", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "getMatrix", "Lyh/p;", "Ljava/lang/reflect/Field;", "recreateDisplayList", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Method;", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final boolean a() {
            return ViewLayer.f15707t;
        }

        @dl.d
        public final ViewOutlineProvider b() {
            return ViewLayer.f15704q;
        }

        public final boolean c() {
            return ViewLayer.f15708u;
        }

        public final void d(boolean z10) {
            ViewLayer.f15708u = z10;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void e(@dl.d View view) {
            kotlin.jvm.internal.f0.p(view, "view");
            try {
                if (!a()) {
                    ViewLayer.f15707t = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.f15705r = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.f15706s = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.f15705r = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.f15706s = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.f15705r;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.f15706s;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.f15706s;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.f15705r;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                d(true);
            }
        }
    }

    /* JADX INFO: compiled from: ViewLayer.android.kt */
    @androidx.annotation.w0(29)
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$c;", "", "Landroid/view/View;", sd.b.f139384b, "", ak.av, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final c f15723a = new c();

        private c() {
        }

        @androidx.annotation.u
        @xh.m
        public static final long a(@dl.d View view) {
            kotlin.jvm.internal.f0.p(view, "view");
            return view.getUniqueDrawingId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewLayer(@dl.d AndroidComposeView ownerView, @dl.d DrawChildContainer container, @dl.d yh.l<? super androidx.compose.ui.graphics.d0, kotlin.b2> drawBlock, @dl.d yh.a<kotlin.b2> invalidateParentLayer) {
        super(ownerView.getContext());
        kotlin.jvm.internal.f0.p(ownerView, "ownerView");
        kotlin.jvm.internal.f0.p(container, "container");
        kotlin.jvm.internal.f0.p(drawBlock, "drawBlock");
        kotlin.jvm.internal.f0.p(invalidateParentLayer, "invalidateParentLayer");
        this.ownerView = ownerView;
        this.container = container;
        this.f15711d = drawBlock;
        this.f15712e = invalidateParentLayer;
        this.outlineResolver = new g1(ownerView.getF15427e());
        this.canvasHolder = new androidx.compose.ui.graphics.e0();
        this.matrixCache = new b1<>(f15703p);
        this.mTransformOrigin = androidx.compose.ui.graphics.o2.INSTANCE.a();
        setWillNotDraw(false);
        container.addView(this);
        this.layerId = View.generateViewId();
    }

    private final androidx.compose.ui.graphics.l1 getManualClipPath() {
        if (!getClipToOutline() || this.outlineResolver.d()) {
            return null;
        }
        return this.outlineResolver.b();
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.isInvalidated) {
            this.isInvalidated = z10;
            this.ownerView.j0(this, z10);
        }
    }

    private final void w() {
        Rect rect;
        if (this.clipToBounds) {
            Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
            } else {
                kotlin.jvm.internal.f0.m(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void x() {
        setOutlineProvider(this.outlineResolver.c() != null ? f15704q : null);
    }

    @Override // androidx.compose.ui.node.z0
    public void a(float scaleX, float scaleY, float alpha, float translationX, float translationY, float shadowElevation, float rotationX, float rotationY, float rotationZ, float cameraDistance, long transformOrigin, @dl.d androidx.compose.ui.graphics.g2 shape, boolean clip, @dl.e androidx.compose.ui.graphics.y1 renderEffect, long ambientShadowColor, long spotShadowColor, @dl.d LayoutDirection layoutDirection, @dl.d s1.e density) {
        yh.a<kotlin.b2> aVar;
        kotlin.jvm.internal.f0.p(shape, "shape");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.f0.p(density, "density");
        this.mTransformOrigin = transformOrigin;
        setScaleX(scaleX);
        setScaleY(scaleY);
        setAlpha(alpha);
        setTranslationX(translationX);
        setTranslationY(translationY);
        setElevation(shadowElevation);
        setRotation(rotationZ);
        setRotationX(rotationX);
        setRotationY(rotationY);
        setPivotX(androidx.compose.ui.graphics.o2.k(this.mTransformOrigin) * getWidth());
        setPivotY(androidx.compose.ui.graphics.o2.l(this.mTransformOrigin) * getHeight());
        setCameraDistancePx(cameraDistance);
        this.clipToBounds = clip && shape == androidx.compose.ui.graphics.x1.a();
        w();
        boolean z10 = getManualClipPath() != null;
        setClipToOutline(clip && shape != androidx.compose.ui.graphics.x1.a());
        boolean zG = this.outlineResolver.g(shape, getAlpha(), getClipToOutline(), getElevation(), layoutDirection, density);
        x();
        boolean z11 = getManualClipPath() != null;
        if (z10 != z11 || (z11 && zG)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > 0.0f && (aVar = this.f15712e) != null) {
            aVar.invoke();
        }
        this.matrixCache.c();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            g2 g2Var = g2.f15876a;
            g2Var.a(this, androidx.compose.ui.graphics.n0.s(ambientShadowColor));
            g2Var.b(this, androidx.compose.ui.graphics.n0.s(spotShadowColor));
        }
        if (i10 >= 31) {
            i2.f15917a.a(this, renderEffect);
        }
    }

    @Override // androidx.compose.ui.node.z0
    public void b(@dl.d androidx.compose.ui.graphics.d0 canvas) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        boolean z10 = getElevation() > 0.0f;
        this.drawnWithZ = z10;
        if (z10) {
            canvas.w();
        }
        this.container.a(canvas, this, getDrawingTime());
        if (this.drawnWithZ) {
            canvas.o();
        }
    }

    @Override // androidx.compose.ui.node.z0
    public void c(@dl.d MutableRect rect, boolean z10) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        if (!z10) {
            androidx.compose.ui.graphics.c1.l(this.matrixCache.b(this), rect);
            return;
        }
        float[] fArrA = this.matrixCache.a(this);
        if (fArrA != null) {
            androidx.compose.ui.graphics.c1.l(fArrA, rect);
        } else {
            rect.k(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    @Override // androidx.compose.ui.node.z0
    public void d(@dl.d float[] matrix) {
        kotlin.jvm.internal.f0.p(matrix, "matrix");
        androidx.compose.ui.graphics.c1.u(matrix, this.matrixCache.b(this));
    }

    @Override // androidx.compose.ui.node.z0
    public void destroy() {
        setInvalidated(false);
        this.ownerView.p0();
        this.f15711d = null;
        this.f15712e = null;
        this.ownerView.n0(this);
        this.container.removeViewInLayout(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(@dl.d Canvas canvas) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        boolean z10 = false;
        setInvalidated(false);
        androidx.compose.ui.graphics.e0 e0Var = this.canvasHolder;
        Canvas canvasI = e0Var.getAndroidCanvas().getInternalCanvas();
        e0Var.getAndroidCanvas().K(canvas);
        androidx.compose.ui.graphics.b bVarB = e0Var.getAndroidCanvas();
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            z10 = true;
            bVarB.f();
            this.outlineResolver.a(bVarB);
        }
        yh.l<? super androidx.compose.ui.graphics.d0, kotlin.b2> lVar = this.f15711d;
        if (lVar != null) {
            lVar.invoke(bVarB);
        }
        if (z10) {
            bVarB.u();
        }
        e0Var.getAndroidCanvas().K(canvasI);
    }

    @Override // androidx.compose.ui.node.z0
    public void e(@dl.d yh.l<? super androidx.compose.ui.graphics.d0, kotlin.b2> drawBlock, @dl.d yh.a<kotlin.b2> invalidateParentLayer) {
        kotlin.jvm.internal.f0.p(drawBlock, "drawBlock");
        kotlin.jvm.internal.f0.p(invalidateParentLayer, "invalidateParentLayer");
        this.container.addView(this);
        this.clipToBounds = false;
        this.drawnWithZ = false;
        this.mTransformOrigin = androidx.compose.ui.graphics.o2.INSTANCE.a();
        this.f15711d = drawBlock;
        this.f15712e = invalidateParentLayer;
    }

    @Override // androidx.compose.ui.node.z0
    public long f(long point, boolean inverse) {
        if (!inverse) {
            return androidx.compose.ui.graphics.c1.j(this.matrixCache.b(this), point);
        }
        float[] fArrA = this.matrixCache.a(this);
        return fArrA != null ? androidx.compose.ui.graphics.c1.j(fArrA, point) : b1.f.f30364b.a();
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // androidx.compose.ui.node.z0
    public void g(long size) {
        int iM = s1.r.m(size);
        int iJ = s1.r.j(size);
        if (iM == getWidth() && iJ == getHeight()) {
            return;
        }
        float f10 = iM;
        setPivotX(androidx.compose.ui.graphics.o2.k(this.mTransformOrigin) * f10);
        float f11 = iJ;
        setPivotY(androidx.compose.ui.graphics.o2.l(this.mTransformOrigin) * f11);
        this.outlineResolver.h(b1.n.a(f10, f11));
        x();
        layout(getLeft(), getTop(), getLeft() + iM, getTop() + iJ);
        w();
        this.matrixCache.c();
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    @dl.d
    public final DrawChildContainer getContainer() {
        return this.container;
    }

    @Override // androidx.compose.ui.layout.j
    public long getLayerId() {
        return this.layerId;
    }

    @dl.d
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.ui.layout.j
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return c.a(this.ownerView);
        }
        return -1L;
    }

    @Override // androidx.compose.ui.node.z0
    public boolean h(long position) {
        float fP = b1.f.p(position);
        float fR = b1.f.r(position);
        if (this.clipToBounds) {
            return 0.0f <= fP && fP < ((float) getWidth()) && 0.0f <= fR && fR < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.outlineResolver.e(position);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.z0
    public void i(@dl.d float[] matrix) {
        kotlin.jvm.internal.f0.p(matrix, "matrix");
        float[] fArrA = this.matrixCache.a(this);
        if (fArrA != null) {
            androidx.compose.ui.graphics.c1.u(matrix, fArrA);
        }
    }

    @Override // android.view.View, androidx.compose.ui.node.z0
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // androidx.compose.ui.node.z0
    public void j(long position) {
        int iM = s1.n.m(position);
        if (iM != getLeft()) {
            offsetLeftAndRight(iM - getLeft());
            this.matrixCache.c();
        }
        int iO = s1.n.o(position);
        if (iO != getTop()) {
            offsetTopAndBottom(iO - getTop());
            this.matrixCache.c();
        }
    }

    @Override // androidx.compose.ui.node.z0
    public void k() {
        if (!this.isInvalidated || f15708u) {
            return;
        }
        setInvalidated(false);
        INSTANCE.e(this);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * getResources().getDisplayMetrics().densityDpi);
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }
}
