package com.max.hbutils.anim;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.u0;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.n;
import com.airbnb.lottie.o;
import com.airbnb.lottie.value.l;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.k;

/* JADX INFO: compiled from: OneshotLottieAnimHelper.kt */
/* JADX INFO: loaded from: classes13.dex */
@t0({"SMAP\nOneshotLottieAnimHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneshotLottieAnimHelper.kt\ncom/max/hbutils/anim/OneshotLottieAnimHelper\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,601:1\n185#2,3:602\n254#2,2:606\n1#3:605\n*S KotlinDebug\n*F\n+ 1 OneshotLottieAnimHelper.kt\ncom/max/hbutils/anim/OneshotLottieAnimHelper\n*L\n81#1:602,3\n220#1:606,2\n*E\n"})
public final class OneshotLottieAnimHelper {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final b f73361e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f73362f = -1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final String f73363g = "icon";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f73364h = 72;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f73365i = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final c f73366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f73367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f73368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f73369d;

    /* JADX INFO: compiled from: OneshotLottieAnimHelper.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.d
        public static final C0587a f73370e = new C0587a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f73371f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f73372g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f73373h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f73374i = 3;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f73375j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f73376k = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f73377l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f73378m = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final c f73379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f73380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f73381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f73382d;

        /* JADX INFO: renamed from: com.max.hbutils.anim.OneshotLottieAnimHelper$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: OneshotLottieAnimHelper.kt */
        public static final class C0587a {
            private C0587a() {
            }

            public /* synthetic */ C0587a(u uVar) {
                this();
            }
        }

        public a(@dl.d Context context) {
            f0.p(context, "context");
            this.f73379a = new c(null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, new WeakReference(context), 131071, null);
        }

        public static /* synthetic */ a h(a aVar, Bitmap bitmap, String str, boolean z10, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, bitmap, str, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.k.kn, new Class[]{a.class, Bitmap.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            if ((i10 & 2) != 0) {
                str = "icon";
            }
            if ((i10 & 4) != 0) {
                z10 = true;
            }
            return aVar.f(bitmap, str, z10);
        }

        public static /* synthetic */ a i(a aVar, ImageView imageView, String str, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, imageView, str, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.k.in, new Class[]{a.class, ImageView.class, String.class, Integer.TYPE, Object.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            if ((i10 & 2) != 0) {
                str = "icon";
            }
            return aVar.g(imageView, str);
        }

        private final a m(String str) {
            boolean z10 = true;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.Tm, new Class[]{String.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            if (str != null && !kotlin.text.u.V1(str)) {
                z10 = false;
            }
            if (!z10) {
                this.f73379a.R(str);
                this.f73380b = 0;
            }
            return this;
        }

        @dl.d
        public final OneshotLottieAnimHelper a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.mn, new Class[0], OneshotLottieAnimHelper.class);
            return patchProxyResultProxy.isSupported ? (OneshotLottieAnimHelper) patchProxyResultProxy.result : new OneshotLottieAnimHelper(this.f73379a, this.f73380b, this.f73381c, this.f73382d);
        }

        @dl.d
        public final a b(@dl.d Drawable drawable) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.k.Ym, new Class[]{Drawable.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(drawable, "drawable");
            this.f73379a.M(drawable);
            return this;
        }

        @dl.d
        public final a c(@dl.d yh.a<Rect> animContainerSafeRectGetter) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{animContainerSafeRectGetter}, this, changeQuickRedirect, false, bb.c.k.dn, new Class[]{yh.a.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(animContainerSafeRectGetter, "animContainerSafeRectGetter");
            this.f73379a.b0(new WeakReference<>(animContainerSafeRectGetter));
            return this;
        }

        @dl.d
        public final a d(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Wm, new Class[]{Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            this.f73379a.N(fi.u.u(i10, 0));
            return this;
        }

        @dl.d
        public final a e(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Xm, new Class[]{Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            this.f73379a.O(i10);
            return this;
        }

        @dl.d
        public final a f(@dl.d Bitmap bitmap, @dl.d String imgLayerName, boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, imgLayerName, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.jn, new Class[]{Bitmap.class, String.class, Boolean.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(bitmap, "bitmap");
            f0.p(imgLayerName, "imgLayerName");
            if (z10) {
                bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            }
            this.f73379a.Q(new Pair<>(bitmap, imgLayerName));
            return this;
        }

        @dl.d
        public final a g(@dl.d ImageView imageView, @dl.d String imgLayerName) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageView, imgLayerName}, this, changeQuickRedirect, false, bb.c.k.hn, new Class[]{ImageView.class, String.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(imageView, "imageView");
            f0.p(imgLayerName, "imgLayerName");
            try {
                Result.a aVar = Result.f124476c;
                int iF = ViewUtils.f(imageView.getContext(), 24.0f);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iF, iF, Bitmap.Config.ARGB_8888);
                f0.o(bitmapCreateBitmap, "createBitmap(...)");
                bitmapCreateBitmap.eraseColor(0);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.translate((iF - imageView.getWidth()) / 2, (iF - imageView.getHeight()) / 2);
                imageView.draw(canvas);
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, 72, 72, false);
                f0.o(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
                Log.d("OneshotLottieAnimHelper", "[setDynamicImage]\nimgView w: " + imageView.getWidth() + ", h: " + imageView.getHeight() + "\npaddingBitmap w: " + bitmapCreateBitmap.getWidth() + ", h: " + bitmapCreateBitmap.getHeight() + "\nscaledBitmap w: " + bitmapCreateScaledBitmap.getWidth() + ", h: " + bitmapCreateScaledBitmap.getHeight());
                return f(bitmapCreateScaledBitmap, imgLayerName, false);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f124476c;
                Throwable thE = Result.e(Result.b(kotlin.t0.a(th2)));
                if (thE != null) {
                    com.max.heybox.hblog.g.f74531b.v("[setDynamicImage] error: " + thE);
                }
                return this;
            }
        }

        @dl.d
        public final a j(@u0 int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Um, new Class[]{Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            this.f73380b = 1;
            this.f73379a.U(Integer.valueOf(i10));
            return this;
        }

        @dl.d
        public final a k(@dl.d com.airbnb.lottie.g composition) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{composition}, this, changeQuickRedirect, false, bb.c.k.Vm, new Class[]{com.airbnb.lottie.g.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(composition, "composition");
            this.f73380b = 3;
            this.f73379a.S(composition);
            return this;
        }

        @dl.d
        @k(message = "使用支持.lottie格式的重载方法")
        public final a l(@dl.e File file) {
            try {
                Result.a aVar = Result.f124476c;
                boolean z10 = true;
                if (file == null || !file.exists()) {
                    z10 = false;
                }
                if (z10) {
                    this.f73379a.T(file);
                    this.f73380b = 2;
                }
                Result.b(b2.f124493a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f124476c;
                Result.b(kotlin.t0.a(th2));
            }
            return this;
        }

        @dl.d
        public final a n(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.ln, new Class[]{cls, cls}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            this.f73379a.V(new Size(i10, i11));
            return this;
        }

        @dl.d
        public final a o(float f10, float f11) {
            Object[] objArr = {new Float(f10), new Float(f11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.an, new Class[]{cls, cls}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            this.f73381c = 1;
            this.f73379a.W(new Pair<>(Float.valueOf(f10), Float.valueOf(f11)));
            return this;
        }

        @dl.d
        public final a p(@dl.d View anchorView) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{anchorView}, this, changeQuickRedirect, false, bb.c.k.Zm, new Class[]{View.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(anchorView, "anchorView");
            this.f73381c = 0;
            this.f73379a.X(new WeakReference<>(anchorView));
            return this;
        }

        @dl.d
        public final a q(@dl.d Activity activity) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.k.f33489cn, new Class[]{Activity.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(activity, "activity");
            this.f73382d = 0;
            this.f73379a.P(new WeakReference<>(activity));
            return this;
        }

        @dl.d
        public final a r(@dl.d FrameLayout containerView) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{containerView}, this, changeQuickRedirect, false, bb.c.k.bn, new Class[]{FrameLayout.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(containerView, "containerView");
            this.f73382d = 1;
            this.f73379a.c0(new WeakReference<>(containerView));
            return this;
        }

        @dl.d
        public final a s(@dl.d yh.a<b2> onAnimEnd) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{onAnimEnd}, this, changeQuickRedirect, false, bb.c.k.fn, new Class[]{yh.a.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(onAnimEnd, "onAnimEnd");
            this.f73379a.Z(new WeakReference<>(onAnimEnd));
            return this;
        }

        @dl.d
        public final a t(@dl.d yh.a<b2> onAnimStart) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{onAnimStart}, this, changeQuickRedirect, false, bb.c.k.en, new Class[]{yh.a.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(onAnimStart, "onAnimStart");
            this.f73379a.a0(new WeakReference<>(onAnimStart));
            return this;
        }

        @dl.d
        public final a u(@dl.d yh.a<b2> onAnimCancel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{onAnimCancel}, this, changeQuickRedirect, false, bb.c.k.gn, new Class[]{yh.a.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(onAnimCancel, "onAnimCancel");
            this.f73379a.Y(new WeakReference<>(onAnimCancel));
            return this;
        }
    }

    /* JADX INFO: compiled from: OneshotLottieAnimHelper.kt */
    public static final class b {
        public static ChangeQuickRedirect changeQuickRedirect;

        private b() {
        }

        public /* synthetic */ b(u uVar) {
            this();
        }

        @dl.d
        public final Pair<Float, Float> a(@dl.e View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.nn, new Class[]{View.class}, Pair.class);
            if (patchProxyResultProxy.isSupported) {
                return (Pair) patchProxyResultProxy.result;
            }
            Rect rect = new Rect();
            return view != null && view.getGlobalVisibleRect(rect) ? new Pair<>(Float.valueOf(rect.exactCenterX()), Float.valueOf(rect.exactCenterY())) : new Pair<>(Float.valueOf(-1.0f), Float.valueOf(-1.0f));
        }
    }

    /* JADX INFO: compiled from: OneshotLottieAnimHelper.kt */
    public static final class c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.e
        private Integer f73383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private File f73384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private String f73385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.e
        private com.airbnb.lottie.g f73386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f73387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f73388f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.d
        private Drawable f73389g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @dl.e
        private WeakReference<View> f73390h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @dl.e
        private Pair<Float, Float> f73391i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @dl.e
        private WeakReference<FrameLayout> f73392j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @dl.e
        private WeakReference<Activity> f73393k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @dl.e
        private Size f73394l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @dl.e
        private WeakReference<yh.a<Rect>> f73395m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @dl.e
        private WeakReference<yh.a<b2>> f73396n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @dl.e
        private WeakReference<yh.a<b2>> f73397o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @dl.e
        private WeakReference<yh.a<b2>> f73398p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @dl.e
        private Pair<Bitmap, String> f73399q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @dl.d
        private final WeakReference<Context> f73400r;

        public c(@u0 @dl.e Integer num, @dl.e File file, @dl.e String str, @dl.e com.airbnb.lottie.g gVar, int i10, int i11, @dl.d Drawable animBackground, @dl.e WeakReference<View> weakReference, @dl.e Pair<Float, Float> pair, @dl.e WeakReference<FrameLayout> weakReference2, @dl.e WeakReference<Activity> weakReference3, @dl.e Size size, @dl.e WeakReference<yh.a<Rect>> weakReference4, @dl.e WeakReference<yh.a<b2>> weakReference5, @dl.e WeakReference<yh.a<b2>> weakReference6, @dl.e WeakReference<yh.a<b2>> weakReference7, @dl.e Pair<Bitmap, String> pair2, @dl.d WeakReference<Context> contextRef) {
            f0.p(animBackground, "animBackground");
            f0.p(contextRef, "contextRef");
            this.f73383a = num;
            this.f73384b = file;
            this.f73385c = str;
            this.f73386d = gVar;
            this.f73387e = i10;
            this.f73388f = i11;
            this.f73389g = animBackground;
            this.f73390h = weakReference;
            this.f73391i = pair;
            this.f73392j = weakReference2;
            this.f73393k = weakReference3;
            this.f73394l = size;
            this.f73395m = weakReference4;
            this.f73396n = weakReference5;
            this.f73397o = weakReference6;
            this.f73398p = weakReference7;
            this.f73399q = pair2;
            this.f73400r = contextRef;
        }

        public /* synthetic */ c(Integer num, File file, String str, com.airbnb.lottie.g gVar, int i10, int i11, Drawable drawable, WeakReference weakReference, Pair pair, WeakReference weakReference2, WeakReference weakReference3, Size size, WeakReference weakReference4, WeakReference weakReference5, WeakReference weakReference6, WeakReference weakReference7, Pair pair2, WeakReference weakReference8, int i12, u uVar) {
            this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : file, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : gVar, (i12 & 16) != 0 ? 0 : i10, (i12 & 32) != 0 ? 1 : i11, (i12 & 64) != 0 ? new ColorDrawable(0) : drawable, (i12 & 128) != 0 ? null : weakReference, (i12 & 256) != 0 ? null : pair, (i12 & 512) != 0 ? null : weakReference2, (i12 & 1024) != 0 ? null : weakReference3, (i12 & 2048) != 0 ? null : size, (i12 & 4096) != 0 ? null : weakReference4, (i12 & 8192) != 0 ? null : weakReference5, (i12 & 16384) != 0 ? null : weakReference6, (32768 & i12) != 0 ? null : weakReference7, (i12 & 65536) != 0 ? null : pair2, weakReference8);
        }

        public static /* synthetic */ c t(c cVar, Integer num, File file, String str, com.airbnb.lottie.g gVar, int i10, int i11, Drawable drawable, WeakReference weakReference, Pair pair, WeakReference weakReference2, WeakReference weakReference3, Size size, WeakReference weakReference4, WeakReference weakReference5, WeakReference weakReference6, WeakReference weakReference7, Pair pair2, WeakReference weakReference8, int i12, Object obj) {
            int i13 = i11;
            Object[] objArr = {cVar, num, file, str, gVar, new Integer(i10), new Integer(i13), drawable, weakReference, pair, weakReference2, weakReference3, size, weakReference4, weakReference5, weakReference6, weakReference7, pair2, weakReference8, new Integer(i12), obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.qn, new Class[]{c.class, Integer.class, File.class, String.class, com.airbnb.lottie.g.class, cls, cls, Drawable.class, WeakReference.class, Pair.class, WeakReference.class, WeakReference.class, Size.class, WeakReference.class, WeakReference.class, WeakReference.class, WeakReference.class, Pair.class, WeakReference.class, cls, Object.class}, c.class);
            if (patchProxyResultProxy.isSupported) {
                return (c) patchProxyResultProxy.result;
            }
            Integer num2 = (i12 & 1) != 0 ? cVar.f73383a : num;
            File file2 = (i12 & 2) != 0 ? cVar.f73384b : file;
            String str2 = (i12 & 4) != 0 ? cVar.f73385c : str;
            com.airbnb.lottie.g gVar2 = (i12 & 8) != 0 ? cVar.f73386d : gVar;
            int i14 = (i12 & 16) != 0 ? cVar.f73387e : i10;
            if ((i12 & 32) != 0) {
                i13 = cVar.f73388f;
            }
            return cVar.s(num2, file2, str2, gVar2, i14, i13, (i12 & 64) != 0 ? cVar.f73389g : drawable, (i12 & 128) != 0 ? cVar.f73390h : weakReference, (i12 & 256) != 0 ? cVar.f73391i : pair, (i12 & 512) != 0 ? cVar.f73392j : weakReference2, (i12 & 1024) != 0 ? cVar.f73393k : weakReference3, (i12 & 2048) != 0 ? cVar.f73394l : size, (i12 & 4096) != 0 ? cVar.f73395m : weakReference4, (i12 & 8192) != 0 ? cVar.f73396n : weakReference5, (i12 & 16384) != 0 ? cVar.f73397o : weakReference6, (i12 & 32768) != 0 ? cVar.f73398p : weakReference7, (i12 & 65536) != 0 ? cVar.f73399q : pair2, (i12 & 131072) != 0 ? cVar.f73400r : weakReference8);
        }

        @dl.e
        public final String A() {
            return this.f73385c;
        }

        @dl.e
        public final com.airbnb.lottie.g B() {
            return this.f73386d;
        }

        @dl.e
        public final File C() {
            return this.f73384b;
        }

        @dl.e
        public final Integer D() {
            return this.f73383a;
        }

        @dl.e
        public final Size E() {
            return this.f73394l;
        }

        @dl.e
        public final Pair<Float, Float> F() {
            return this.f73391i;
        }

        @dl.e
        public final WeakReference<View> G() {
            return this.f73390h;
        }

        @dl.e
        public final WeakReference<yh.a<b2>> H() {
            return this.f73398p;
        }

        @dl.e
        public final WeakReference<yh.a<b2>> I() {
            return this.f73397o;
        }

        @dl.e
        public final WeakReference<yh.a<b2>> J() {
            return this.f73396n;
        }

        @dl.e
        public final WeakReference<yh.a<Rect>> K() {
            return this.f73395m;
        }

        @dl.e
        public final WeakReference<FrameLayout> L() {
            return this.f73392j;
        }

        public final void M(@dl.d Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.k.on, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(drawable, "<set-?>");
            this.f73389g = drawable;
        }

        public final void N(int i10) {
            this.f73387e = i10;
        }

        public final void O(int i10) {
            this.f73388f = i10;
        }

        public final void P(@dl.e WeakReference<Activity> weakReference) {
            this.f73393k = weakReference;
        }

        public final void Q(@dl.e Pair<Bitmap, String> pair) {
            this.f73399q = pair;
        }

        public final void R(@dl.e String str) {
            this.f73385c = str;
        }

        public final void S(@dl.e com.airbnb.lottie.g gVar) {
            this.f73386d = gVar;
        }

        public final void T(@dl.e File file) {
            this.f73384b = file;
        }

        public final void U(@dl.e Integer num) {
            this.f73383a = num;
        }

        public final void V(@dl.e Size size) {
            this.f73394l = size;
        }

        public final void W(@dl.e Pair<Float, Float> pair) {
            this.f73391i = pair;
        }

        public final void X(@dl.e WeakReference<View> weakReference) {
            this.f73390h = weakReference;
        }

        public final void Y(@dl.e WeakReference<yh.a<b2>> weakReference) {
            this.f73398p = weakReference;
        }

        public final void Z(@dl.e WeakReference<yh.a<b2>> weakReference) {
            this.f73397o = weakReference;
        }

        @dl.e
        public final Integer a() {
            return this.f73383a;
        }

        public final void a0(@dl.e WeakReference<yh.a<b2>> weakReference) {
            this.f73396n = weakReference;
        }

        @dl.e
        public final WeakReference<FrameLayout> b() {
            return this.f73392j;
        }

        public final void b0(@dl.e WeakReference<yh.a<Rect>> weakReference) {
            this.f73395m = weakReference;
        }

        @dl.e
        public final WeakReference<Activity> c() {
            return this.f73393k;
        }

        public final void c0(@dl.e WeakReference<FrameLayout> weakReference) {
            this.f73392j = weakReference;
        }

        @dl.e
        public final Size d() {
            return this.f73394l;
        }

        @dl.e
        public final WeakReference<yh.a<Rect>> e() {
            return this.f73395m;
        }

        public boolean equals(@dl.e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.tn, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return f0.g(this.f73383a, cVar.f73383a) && f0.g(this.f73384b, cVar.f73384b) && f0.g(this.f73385c, cVar.f73385c) && f0.g(this.f73386d, cVar.f73386d) && this.f73387e == cVar.f73387e && this.f73388f == cVar.f73388f && f0.g(this.f73389g, cVar.f73389g) && f0.g(this.f73390h, cVar.f73390h) && f0.g(this.f73391i, cVar.f73391i) && f0.g(this.f73392j, cVar.f73392j) && f0.g(this.f73393k, cVar.f73393k) && f0.g(this.f73394l, cVar.f73394l) && f0.g(this.f73395m, cVar.f73395m) && f0.g(this.f73396n, cVar.f73396n) && f0.g(this.f73397o, cVar.f73397o) && f0.g(this.f73398p, cVar.f73398p) && f0.g(this.f73399q, cVar.f73399q) && f0.g(this.f73400r, cVar.f73400r);
        }

        @dl.e
        public final WeakReference<yh.a<b2>> f() {
            return this.f73396n;
        }

        @dl.e
        public final WeakReference<yh.a<b2>> g() {
            return this.f73397o;
        }

        @dl.e
        public final WeakReference<yh.a<b2>> h() {
            return this.f73398p;
        }

        public int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.sn, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            Integer num = this.f73383a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            File file = this.f73384b;
            int iHashCode2 = (iHashCode + (file == null ? 0 : file.hashCode())) * 31;
            String str = this.f73385c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            com.airbnb.lottie.g gVar = this.f73386d;
            int iHashCode4 = (((((((iHashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.f73387e) * 31) + this.f73388f) * 31) + this.f73389g.hashCode()) * 31;
            WeakReference<View> weakReference = this.f73390h;
            int iHashCode5 = (iHashCode4 + (weakReference == null ? 0 : weakReference.hashCode())) * 31;
            Pair<Float, Float> pair = this.f73391i;
            int iHashCode6 = (iHashCode5 + (pair == null ? 0 : pair.hashCode())) * 31;
            WeakReference<FrameLayout> weakReference2 = this.f73392j;
            int iHashCode7 = (iHashCode6 + (weakReference2 == null ? 0 : weakReference2.hashCode())) * 31;
            WeakReference<Activity> weakReference3 = this.f73393k;
            int iHashCode8 = (iHashCode7 + (weakReference3 == null ? 0 : weakReference3.hashCode())) * 31;
            Size size = this.f73394l;
            int iHashCode9 = (iHashCode8 + (size == null ? 0 : size.hashCode())) * 31;
            WeakReference<yh.a<Rect>> weakReference4 = this.f73395m;
            int iHashCode10 = (iHashCode9 + (weakReference4 == null ? 0 : weakReference4.hashCode())) * 31;
            WeakReference<yh.a<b2>> weakReference5 = this.f73396n;
            int iHashCode11 = (iHashCode10 + (weakReference5 == null ? 0 : weakReference5.hashCode())) * 31;
            WeakReference<yh.a<b2>> weakReference6 = this.f73397o;
            int iHashCode12 = (iHashCode11 + (weakReference6 == null ? 0 : weakReference6.hashCode())) * 31;
            WeakReference<yh.a<b2>> weakReference7 = this.f73398p;
            int iHashCode13 = (iHashCode12 + (weakReference7 == null ? 0 : weakReference7.hashCode())) * 31;
            Pair<Bitmap, String> pair2 = this.f73399q;
            return ((iHashCode13 + (pair2 != null ? pair2.hashCode() : 0)) * 31) + this.f73400r.hashCode();
        }

        @dl.e
        public final Pair<Bitmap, String> i() {
            return this.f73399q;
        }

        @dl.d
        public final WeakReference<Context> j() {
            return this.f73400r;
        }

        @dl.e
        public final File k() {
            return this.f73384b;
        }

        @dl.e
        public final String l() {
            return this.f73385c;
        }

        @dl.e
        public final com.airbnb.lottie.g m() {
            return this.f73386d;
        }

        public final int n() {
            return this.f73387e;
        }

        public final int o() {
            return this.f73388f;
        }

        @dl.d
        public final Drawable p() {
            return this.f73389g;
        }

        @dl.e
        public final WeakReference<View> q() {
            return this.f73390h;
        }

        @dl.e
        public final Pair<Float, Float> r() {
            return this.f73391i;
        }

        @dl.d
        public final c s(@u0 @dl.e Integer num, @dl.e File file, @dl.e String str, @dl.e com.airbnb.lottie.g gVar, int i10, int i11, @dl.d Drawable animBackground, @dl.e WeakReference<View> weakReference, @dl.e Pair<Float, Float> pair, @dl.e WeakReference<FrameLayout> weakReference2, @dl.e WeakReference<Activity> weakReference3, @dl.e Size size, @dl.e WeakReference<yh.a<Rect>> weakReference4, @dl.e WeakReference<yh.a<b2>> weakReference5, @dl.e WeakReference<yh.a<b2>> weakReference6, @dl.e WeakReference<yh.a<b2>> weakReference7, @dl.e Pair<Bitmap, String> pair2, @dl.d WeakReference<Context> contextRef) {
            Object[] objArr = {num, file, str, gVar, new Integer(i10), new Integer(i11), animBackground, weakReference, pair, weakReference2, weakReference3, size, weakReference4, weakReference5, weakReference6, weakReference7, pair2, contextRef};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.pn, new Class[]{Integer.class, File.class, String.class, com.airbnb.lottie.g.class, cls, cls, Drawable.class, WeakReference.class, Pair.class, WeakReference.class, WeakReference.class, Size.class, WeakReference.class, WeakReference.class, WeakReference.class, WeakReference.class, Pair.class, WeakReference.class}, c.class);
            if (patchProxyResultProxy.isSupported) {
                return (c) patchProxyResultProxy.result;
            }
            f0.p(animBackground, "animBackground");
            f0.p(contextRef, "contextRef");
            return new c(num, file, str, gVar, i10, i11, animBackground, weakReference, pair, weakReference2, weakReference3, size, weakReference4, weakReference5, weakReference6, weakReference7, pair2, contextRef);
        }

        @dl.d
        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.rn, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "Param(lottieAnimRawId=" + this.f73383a + ", lottieAnimFile=" + this.f73384b + ", lottieAnimCacheKey=" + this.f73385c + ", lottieAnimComposition=" + this.f73386d + ", animRepeatCnt=" + this.f73387e + ", animRepeatMode=" + this.f73388f + ", animBackground=" + this.f73389g + ", lottieViewAnchoredViewRef=" + this.f73390h + ", lottieViewAnchoredPos=" + this.f73391i + ", specifiedContainerRef=" + this.f73392j + ", defaultContainerActivityRef=" + this.f73393k + ", lottieCanvasSizeDp=" + this.f73394l + ", onContainerSafeRectGetRef=" + this.f73395m + ", onAnimStartRef=" + this.f73396n + ", onAnimEndRef=" + this.f73397o + ", onAnimCancelRef=" + this.f73398p + ", dynamicImgPair=" + this.f73399q + ", contextRef=" + this.f73400r + ')';
        }

        @dl.d
        public final Drawable u() {
            return this.f73389g;
        }

        public final int v() {
            return this.f73387e;
        }

        public final int w() {
            return this.f73388f;
        }

        @dl.d
        public final WeakReference<Context> x() {
            return this.f73400r;
        }

        @dl.e
        public final WeakReference<Activity> y() {
            return this.f73393k;
        }

        @dl.e
        public final Pair<Bitmap, String> z() {
            return this.f73399q;
        }
    }

    /* JADX INFO: compiled from: OneshotLottieAnimHelper.kt */
    public static final class d implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference<LottieAnimationView> f73402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ yh.a<Pair<Float, Float>> f73403d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f73404e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ WeakReference<ViewGroup> f73405f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ WeakReference<FrameLayout> f73406g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f73407h;

        d(WeakReference<LottieAnimationView> weakReference, yh.a<Pair<Float, Float>> aVar, LottieAnimationView lottieAnimationView, WeakReference<ViewGroup> weakReference2, WeakReference<FrameLayout> weakReference3, boolean z10) {
            this.f73402c = weakReference;
            this.f73403d = aVar;
            this.f73404e = lottieAnimationView;
            this.f73405f = weakReference2;
            this.f73406g = weakReference3;
            this.f73407h = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(WeakReference lottieViewRef, yh.a onGetAnchorSize, LottieAnimationView lottieView) {
            if (PatchProxy.proxy(new Object[]{lottieViewRef, onGetAnchorSize, lottieView}, null, changeQuickRedirect, true, bb.c.k.yn, new Class[]{WeakReference.class, yh.a.class, LottieAnimationView.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(lottieViewRef, "$lottieViewRef");
            f0.p(onGetAnchorSize, "$onGetAnchorSize");
            f0.p(lottieView, "$lottieView");
            LottieAnimationView lottieAnimationView = (LottieAnimationView) lottieViewRef.get();
            if (lottieAnimationView == null) {
                return;
            }
            Pair pair = (Pair) onGetAnchorSize.invoke();
            float fFloatValue = ((Number) pair.a()).floatValue();
            float fFloatValue2 = ((Number) pair.b()).floatValue();
            lottieAnimationView.setTranslationX(fFloatValue - (lottieView.getWidth() / 2));
            lottieAnimationView.setTranslationY(fFloatValue2 - (lottieView.getHeight() / 2));
            lottieAnimationView.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.k.wn, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animation) {
            yh.a<b2> aVar;
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.k.vn, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            WeakReference<yh.a<b2>> weakReferenceI = OneshotLottieAnimHelper.this.f73366a.I();
            if (weakReferenceI != null && (aVar = weakReferenceI.get()) != null) {
                aVar.invoke();
            }
            ViewGroup viewGroup = this.f73405f.get();
            FrameLayout frameLayout = this.f73406g.get();
            LottieAnimationView lottieAnimationView = this.f73402c.get();
            if (!this.f73407h) {
                if (frameLayout != null) {
                    frameLayout.removeView(lottieAnimationView);
                }
            } else {
                if (frameLayout != null) {
                    frameLayout.removeView(lottieAnimationView);
                }
                if (viewGroup != null) {
                    viewGroup.removeView(frameLayout);
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.k.xn, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animation) {
            yh.a<b2> aVar;
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.k.un, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            WeakReference<yh.a<b2>> weakReferenceJ = OneshotLottieAnimHelper.this.f73366a.J();
            if (weakReferenceJ != null && (aVar = weakReferenceJ.get()) != null) {
                aVar.invoke();
            }
            LottieAnimationView lottieAnimationView = this.f73402c.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setVisibility(4);
            final WeakReference<LottieAnimationView> weakReference = this.f73402c;
            final yh.a<Pair<Float, Float>> aVar2 = this.f73403d;
            final LottieAnimationView lottieAnimationView2 = this.f73404e;
            lottieAnimationView.post(new Runnable() { // from class: com.max.hbutils.anim.g
                @Override // java.lang.Runnable
                public final void run() {
                    OneshotLottieAnimHelper.d.b(weakReference, aVar2, lottieAnimationView2);
                }
            });
        }
    }

    /* JADX INFO: compiled from: View.kt */
    @t0({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$postDelayed$runnable$1\n+ 2 OneshotLottieAnimHelper.kt\ncom/max/hbutils/anim/OneshotLottieAnimHelper\n*L\n1#1,411:1\n82#2,8:412\n*E\n"})
    public static final class e implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f73409c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f73410d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ FrameLayout f73411e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ yh.a f73412f;

        public e(Context context, LottieAnimationView lottieAnimationView, FrameLayout frameLayout, yh.a aVar) {
            this.f73409c = context;
            this.f73410d = lottieAnimationView;
            this.f73411e = frameLayout;
            this.f73412f = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.zn, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            OneshotLottieAnimHelper.f(OneshotLottieAnimHelper.this, this.f73409c, this.f73410d, null, this.f73411e, this.f73412f);
        }
    }

    public OneshotLottieAnimHelper(@dl.d c param, int i10, int i11, int i12) {
        f0.p(param, "param");
        this.f73366a = param;
        this.f73367b = i10;
        this.f73368c = i11;
        this.f73369d = i12;
    }

    public static final /* synthetic */ void f(OneshotLottieAnimHelper oneshotLottieAnimHelper, Context context, LottieAnimationView lottieAnimationView, ViewGroup viewGroup, FrameLayout frameLayout, yh.a aVar) {
        if (PatchProxy.proxy(new Object[]{oneshotLottieAnimHelper, context, lottieAnimationView, viewGroup, frameLayout, aVar}, null, changeQuickRedirect, true, bb.c.k.Sm, new Class[]{OneshotLottieAnimHelper.class, Context.class, LottieAnimationView.class, ViewGroup.class, FrameLayout.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        oneshotLottieAnimHelper.i(context, lottieAnimationView, viewGroup, frameLayout, aVar);
    }

    private final LottieAnimationView g(Context context) {
        Object objB;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.k.Nm, new Class[]{Context.class}, LottieAnimationView.class);
        if (patchProxyResultProxy.isSupported) {
            return (LottieAnimationView) patchProxyResultProxy.result;
        }
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        lottieAnimationView.setRepeatCount(this.f73366a.v());
        lottieAnimationView.setRepeatMode(this.f73366a.w());
        lottieAnimationView.setBackground(this.f73366a.u());
        try {
            Result.a aVar = Result.f124476c;
            int i10 = this.f73367b;
            if (i10 != 0) {
                if (i10 == 1) {
                    Integer numD = this.f73366a.D();
                    f0.m(numD);
                    lottieAnimationView.setAnimation(numD.intValue());
                } else if (i10 == 2) {
                    File fileC = this.f73366a.C();
                    f0.m(fileC);
                    lottieAnimationView.setAnimation(new FileInputStream(fileC), fileC.getName());
                } else if (i10 != 3) {
                    com.max.heybox.hblog.g.f74531b.M("[OneshotLottieAnimHelper][buildLottieAnimView] invalid param, animSrcType: " + this.f73367b);
                } else {
                    com.airbnb.lottie.g gVarB = this.f73366a.B();
                    f0.m(gVarB);
                    lottieAnimationView.setComposition(gVarB);
                }
            }
            objB = Result.b(b2.f124493a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(kotlin.t0.a(th2));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            com.max.heybox.hblog.g.f74531b.v("[OneshotLottieAnimHelper][buildLottieAnimView] build failed\nparam: " + this.f73366a + "\nerror: " + thE);
        }
        if (Result.j(objB)) {
            return lottieAnimationView;
        }
        return null;
    }

    private final void h(Rect rect, Rect rect2, Rect rect3) {
        if (PatchProxy.proxy(new Object[]{rect, rect2, rect3}, this, changeQuickRedirect, false, bb.c.k.Mm, new Class[]{Rect.class, Rect.class, Rect.class}, Void.TYPE).isSupported) {
            return;
        }
        int i10 = rect2.top;
        if (i10 != -1) {
            rect3.top = fi.u.u(i10 - rect.top, 0);
        }
        int i11 = rect2.bottom;
        if (i11 != -1) {
            rect3.bottom = fi.u.u(rect.bottom - i11, 0);
        }
    }

    private final void i(Context context, final LottieAnimationView lottieAnimationView, ViewGroup viewGroup, final FrameLayout frameLayout, final yh.a<Pair<Float, Float>> aVar) {
        if (PatchProxy.proxy(new Object[]{context, lottieAnimationView, viewGroup, frameLayout, aVar}, this, changeQuickRedirect, false, bb.c.k.Lm, new Class[]{Context.class, LottieAnimationView.class, ViewGroup.class, FrameLayout.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        Size sizeE = this.f73366a.E();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(sizeE != null ? ViewUtils.f(context, sizeE.getWidth()) : -2, sizeE != null ? ViewUtils.f(context, sizeE.getHeight()) : -2);
        lottieAnimationView.m(new n() { // from class: com.max.hbutils.anim.d
            @Override // com.airbnb.lottie.n
            public final void a(com.airbnb.lottie.g gVar) {
                OneshotLottieAnimHelper.k(this.f73435a, lottieAnimationView, gVar);
            }
        });
        lottieAnimationView.j(new d(new WeakReference(lottieAnimationView), aVar, lottieAnimationView, new WeakReference(viewGroup), new WeakReference(frameLayout), viewGroup != null));
        final Rect rect = new Rect();
        final Rect rect2 = new Rect(0, 0, 0, 0);
        lottieAnimationView.l(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbutils.anim.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                OneshotLottieAnimHelper.j(this.f73437b, aVar, lottieAnimationView, rect2, frameLayout, rect, valueAnimator);
            }
        });
        if (viewGroup != null) {
            frameLayout.addView(lottieAnimationView, layoutParams);
            viewGroup.addView(frameLayout);
        } else {
            frameLayout.addView(lottieAnimationView, layoutParams);
        }
        lottieAnimationView.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(OneshotLottieAnimHelper this$0, yh.a onGetAnchorSize, LottieAnimationView lottieView, Rect containerViewSafePaddingRect, FrameLayout animContainerView, Rect containerViewVisibleRect, ValueAnimator it) {
        yh.a<b2> aVar;
        yh.a<Rect> aVar2;
        if (PatchProxy.proxy(new Object[]{this$0, onGetAnchorSize, lottieView, containerViewSafePaddingRect, animContainerView, containerViewVisibleRect, it}, null, changeQuickRedirect, true, bb.c.k.Rm, new Class[]{OneshotLottieAnimHelper.class, yh.a.class, LottieAnimationView.class, Rect.class, FrameLayout.class, Rect.class, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(onGetAnchorSize, "$onGetAnchorSize");
        f0.p(lottieView, "$lottieView");
        f0.p(containerViewSafePaddingRect, "$containerViewSafePaddingRect");
        f0.p(animContainerView, "$animContainerView");
        f0.p(containerViewVisibleRect, "$containerViewVisibleRect");
        f0.p(it, "it");
        WeakReference<yh.a<Rect>> weakReferenceK = this$0.f73366a.K();
        if (weakReferenceK != null && (aVar2 = weakReferenceK.get()) != null) {
            animContainerView.getGlobalVisibleRect(containerViewVisibleRect);
            this$0.h(containerViewVisibleRect, aVar2.invoke(), containerViewSafePaddingRect);
            animContainerView.setPadding(0, containerViewSafePaddingRect.top, 0, containerViewSafePaddingRect.bottom);
        }
        Pair pair = (Pair) onGetAnchorSize.invoke();
        float fFloatValue = ((Number) pair.a()).floatValue();
        float fFloatValue2 = ((Number) pair.b()).floatValue();
        if (!(fFloatValue == -1.0f)) {
            if (!(fFloatValue2 == -1.0f)) {
                lottieView.setTranslationX(fFloatValue - (lottieView.getWidth() / 2));
                lottieView.setTranslationY((fFloatValue2 - (lottieView.getHeight() / 2)) - containerViewSafePaddingRect.top);
                return;
            }
        }
        lottieView.setVisibility(8);
        WeakReference<yh.a<b2>> weakReferenceI = this$0.f73366a.I();
        if (weakReferenceI == null || (aVar = weakReferenceI.get()) == null) {
            return;
        }
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(OneshotLottieAnimHelper this$0, LottieAnimationView lottieView, com.airbnb.lottie.g gVar) {
        if (PatchProxy.proxy(new Object[]{this$0, lottieView, gVar}, null, changeQuickRedirect, true, bb.c.k.Qm, new Class[]{OneshotLottieAnimHelper.class, LottieAnimationView.class, com.airbnb.lottie.g.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(lottieView, "$lottieView");
        Pair<Bitmap, String> pairZ = this$0.f73366a.z();
        if (pairZ != null) {
            final Bitmap bitmapA = pairZ.a();
            lottieView.o(new com.airbnb.lottie.model.d(pairZ.b()), o.N, new l() { // from class: com.max.hbutils.anim.f
                @Override // com.airbnb.lottie.value.l
                public final Object a(com.airbnb.lottie.value.b bVar) {
                    return OneshotLottieAnimHelper.l(bitmapA, bVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap l(Bitmap imgBitmap, com.airbnb.lottie.value.b bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imgBitmap, bVar}, null, changeQuickRedirect, true, bb.c.k.Pm, new Class[]{Bitmap.class, com.airbnb.lottie.value.b.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        f0.p(imgBitmap, "$imgBitmap");
        return imgBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(OneshotLottieAnimHelper this$0, Context context, LottieAnimationView lottieView, ViewGroup rootView, FrameLayout containerView, yh.a onGetAnchorSize) {
        if (PatchProxy.proxy(new Object[]{this$0, context, lottieView, rootView, containerView, onGetAnchorSize}, null, changeQuickRedirect, true, bb.c.k.Om, new Class[]{OneshotLottieAnimHelper.class, Context.class, LottieAnimationView.class, ViewGroup.class, FrameLayout.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(context, "$context");
        f0.p(lottieView, "$lottieView");
        f0.p(rootView, "$rootView");
        f0.p(containerView, "$containerView");
        f0.p(onGetAnchorSize, "$onGetAnchorSize");
        this$0.i(context, lottieView, rootView, containerView, onGetAnchorSize);
    }

    @dl.e
    public final com.max.hbutils.anim.a m() {
        yh.a<Pair<? extends Float, ? extends Float>> aVar;
        Activity activity;
        final FrameLayout frameLayout;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Km, new Class[0], com.max.hbutils.anim.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbutils.anim.a) patchProxyResultProxy.result;
        }
        final Context context = this.f73366a.x().get();
        final ViewGroup viewGroup = null;
        if (context == null) {
            com.max.heybox.hblog.g.f74531b.M("[OneshotLottieAnimHelper][showOneShot] context is null");
            return null;
        }
        final LottieAnimationView lottieAnimationViewG = g(context);
        if (lottieAnimationViewG == null) {
            com.max.heybox.hblog.g.f74531b.v("[OneshotLottieAnimHelper][showOneShot] build lottie view failed");
            return null;
        }
        WeakReference<View> weakReferenceG = this.f73366a.G();
        View view = weakReferenceG != null ? weakReferenceG.get() : null;
        final Pair<Float, Float> pairF = this.f73366a.F();
        int i10 = this.f73368c;
        if (i10 == 1 && pairF != null) {
            aVar = new yh.a<Pair<? extends Float, ? extends Float>>() { // from class: com.max.hbutils.anim.OneshotLottieAnimHelper$showOneShot$onGetAnchorSize$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @dl.d
                public final Pair<Float, Float> a() {
                    return pairF;
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Pair<? extends java.lang.Float, ? extends java.lang.Float>] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ Pair<? extends Float, ? extends Float> invoke() {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Cn, new Class[0], Object.class);
                    return patchProxyResultProxy2.isSupported ? patchProxyResultProxy2.result : a();
                }
            };
        } else {
            if (i10 != 0 || view == null) {
                com.max.heybox.hblog.g.f74531b.v("[OneshotLottieAnimHelper][showOneShot] invalid status:\nanchorView: " + view + ", anchorPos: " + pairF + "\nanimAnchorType: " + this.f73368c);
                return null;
            }
            aVar = new yh.a<Pair<? extends Float, ? extends Float>>() { // from class: com.max.hbutils.anim.OneshotLottieAnimHelper$showOneShot$onGetAnchorSize$2
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(0);
                }

                @dl.d
                public final Pair<Float, Float> a() {
                    View view2;
                    Pair<Float, Float> pairA;
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Dn, new Class[0], Pair.class);
                    if (patchProxyResultProxy2.isSupported) {
                        return (Pair) patchProxyResultProxy2.result;
                    }
                    WeakReference<View> weakReferenceG2 = this.f73415b.f73366a.G();
                    return (weakReferenceG2 == null || (view2 = weakReferenceG2.get()) == null || (pairA = OneshotLottieAnimHelper.f73361e.a(view2)) == null) ? new Pair<>(Float.valueOf(-1.0f), Float.valueOf(-1.0f)) : pairA;
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Pair<? extends java.lang.Float, ? extends java.lang.Float>] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ Pair<? extends Float, ? extends Float> invoke() {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.En, new Class[0], Object.class);
                    return patchProxyResultProxy2.isSupported ? patchProxyResultProxy2.result : a();
                }
            };
        }
        final yh.a<Pair<? extends Float, ? extends Float>> aVar2 = aVar;
        if (this.f73369d == 1) {
            WeakReference<FrameLayout> weakReferenceL = this.f73366a.L();
            frameLayout = weakReferenceL != null ? weakReferenceL.get() : null;
            if (frameLayout == null) {
                com.max.heybox.hblog.g.f74531b.v("[OneshotLottieAnimHelper][showOneShot] specified container is null");
                return null;
            }
            frameLayout.postDelayed(new e(context, lottieAnimationViewG, frameLayout, aVar2), 10L);
        } else {
            WeakReference<Activity> weakReferenceY = this.f73366a.y();
            if (weakReferenceY == null || (activity = weakReferenceY.get()) == null) {
                com.max.heybox.hblog.g.f74531b.v("[OneshotLottieAnimHelper][showOneShot] activity for default container is null");
                return null;
            }
            View viewFindViewById = activity.findViewById(R.id.content);
            f0.o(viewFindViewById, "findViewById(...)");
            viewGroup = (ViewGroup) viewFindViewById;
            frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup.postDelayed(new Runnable() { // from class: com.max.hbutils.anim.c
                @Override // java.lang.Runnable
                public final void run() {
                    OneshotLottieAnimHelper.n(this.f73429b, context, lottieAnimationViewG, viewGroup, frameLayout, aVar2);
                }
            }, 10L);
        }
        return new com.max.hbutils.anim.a(viewGroup, lottieAnimationViewG, frameLayout, new yh.a<b2>() { // from class: com.max.hbutils.anim.OneshotLottieAnimHelper$showOneShot$3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Bn, new Class[0], Object.class);
                if (patchProxyResultProxy2.isSupported) {
                    return patchProxyResultProxy2.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                WeakReference<yh.a<b2>> weakReferenceH;
                yh.a<b2> aVar3;
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.An, new Class[0], Void.TYPE).isSupported || (weakReferenceH = this.f73413b.f73366a.H()) == null || (aVar3 = weakReferenceH.get()) == null) {
                    return;
                }
                aVar3.invoke();
            }
        });
    }
}
