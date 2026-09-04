package com.max.xiaoheihe.module.bbs.post.ui;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import androidx.compose.runtime.internal.o;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.n;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.t;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.module.bbs.LikeAnimResourceManager;
import com.max.xiaoheihe.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
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
import kotlin.s0;
import yh.a;
import yh.l;

/* JADX INFO: compiled from: FloatingLikeLottieAnimation.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nFloatingLikeLottieAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingLikeLottieAnimation.kt\ncom/max/xiaoheihe/module/bbs/post/ui/FloatingLikeLottieAnimation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,485:1\n1#2:486\n*E\n"})
@k(message = "已迁移到HBUtils模块下", replaceWith = @s0(expression = "OneshotLottieAnimHelper", imports = {"com.max.hbutils.anim.OneshotLottieAnimHelper"}))
@o(parameters = 0)
public final class FloatingLikeLottieAnimation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final b f81508b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f81509c = 8;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final String f81510d = "FloatingLikeLottieAnimation-dbg";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f81511e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final String f81512f = "icon";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f81513g = 72;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f81514h = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Builder f81515a;

    /* JADX INFO: compiled from: FloatingLikeLottieAnimation.kt */
    @o(parameters = 0)
    public static final class Builder {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f81516q = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final WeakReference<Activity> f81517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private Pair<Float, Float> f81518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private WeakReference<View> f81519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.e
        private Pair<Bitmap, String> f81520d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.e
        private yh.a<b2> f81521e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.e
        private yh.a<b2> f81522f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.e
        private yh.a<b2> f81523g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @dl.d
        private String f81524h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @dl.d
        private Drawable f81525i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f81526j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f81527k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @dl.e
        private yh.a<Rect> f81528l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f81529m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f81530n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @dl.e
        private Integer f81531o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @dl.e
        private Size f81532p;

        public Builder(@dl.d Activity context) {
            f0.p(context, "context");
            this.f81517a = new WeakReference<>(context);
            this.f81524h = "";
            this.f81525i = new ColorDrawable(0);
            this.f81527k = 1;
        }

        public static /* synthetic */ Builder B(Builder builder, Bitmap bitmap, String str, boolean z10, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{builder, bitmap, str, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 28524, new Class[]{Builder.class, Bitmap.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, Builder.class);
            if (patchProxyResultProxy.isSupported) {
                return (Builder) patchProxyResultProxy.result;
            }
            if ((i10 & 2) != 0) {
                str = "icon";
            }
            if ((i10 & 4) != 0) {
                z10 = true;
            }
            return builder.A(bitmap, str, z10);
        }

        private final Builder C(ImageView imageView, String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageView, str}, this, changeQuickRedirect, false, 28522, new Class[]{ImageView.class, String.class}, Builder.class);
            if (patchProxyResultProxy.isSupported) {
                return (Builder) patchProxyResultProxy.result;
            }
            int iF = ViewUtils.f(imageView.getContext(), 24.0f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iF, iF, Bitmap.Config.ARGB_8888);
            f0.o(bitmapCreateBitmap, "createBitmap(\n          …g.ARGB_8888\n            )");
            bitmapCreateBitmap.eraseColor(0);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.translate((iF - imageView.getWidth()) / 2, (iF - imageView.getHeight()) / 2);
            imageView.draw(canvas);
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, 72, 72, false);
            f0.o(bitmapCreateScaledBitmap, "createScaledBitmap(paddi…tSize, targetSize, false)");
            Log.d(FloatingLikeLottieAnimation.f81510d, "[setDynamicImage]\nimgView w: " + imageView.getWidth() + ", h: " + imageView.getHeight() + "\npaddingBitmap w: " + bitmapCreateBitmap.getWidth() + ", h: " + bitmapCreateBitmap.getHeight() + "\nscaledBitmap w: " + bitmapCreateScaledBitmap.getWidth() + ", h: " + bitmapCreateScaledBitmap.getHeight());
            return A(bitmapCreateScaledBitmap, str, false);
        }

        private final Builder D(String str, String str2, int i10, int i11, Context context) {
            Bitmap bitmapCreateScaledBitmap;
            Object[] objArr = {str, str2, new Integer(i10), new Integer(i11), context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28521, new Class[]{String.class, String.class, cls, cls, Context.class}, Builder.class);
            if (patchProxyResultProxy.isSupported) {
                return (Builder) patchProxyResultProxy.result;
            }
            int iF = ViewUtils.f(context, 24.0f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iF, iF, Bitmap.Config.ARGB_8888);
            f0.o(bitmapCreateBitmap, "createBitmap(\n          …g.ARGB_8888\n            )");
            bitmapCreateBitmap.eraseColor(0);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.translate((iF - i10) / 2, (iF - i11) / 2);
            File fileA = LikeAnimResourceManager.f79963a.a(str);
            if (fileA != null && (bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeFile(fileA.getAbsolutePath()), i10, i10, false)) != null) {
                canvas.drawBitmap(bitmapCreateScaledBitmap, 0.0f, 0.0f, (Paint) null);
            }
            Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapCreateBitmap, 72, 72, false);
            f0.o(bitmapCreateScaledBitmap2, "createScaledBitmap(paddi…tSize, targetSize, false)");
            return A(bitmapCreateScaledBitmap2, str2, false);
        }

        public static /* synthetic */ Builder z(Builder builder, ImageView imageView, String str, String str2, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{builder, imageView, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 28520, new Class[]{Builder.class, ImageView.class, String.class, String.class, Integer.TYPE, Object.class}, Builder.class);
            if (patchProxyResultProxy.isSupported) {
                return (Builder) patchProxyResultProxy.result;
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            if ((i10 & 4) != 0) {
                str2 = "icon";
            }
            return builder.y(imageView, str, str2);
        }

        @dl.d
        public final Builder A(@dl.d Bitmap bitmap, @dl.d String imgLayerName, boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, imgLayerName, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28523, new Class[]{Bitmap.class, String.class, Boolean.TYPE}, Builder.class);
            if (patchProxyResultProxy.isSupported) {
                return (Builder) patchProxyResultProxy.result;
            }
            f0.p(bitmap, "bitmap");
            f0.p(imgLayerName, "imgLayerName");
            if (z10) {
                bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            }
            this.f81520d = new Pair<>(bitmap, imgLayerName);
            return this;
        }

        public final void E(@dl.e Pair<Bitmap, String> pair) {
            this.f81520d = pair;
        }

        @dl.d
        public final Builder F(@dl.e String str) {
            if (str == null) {
                str = "";
            }
            this.f81524h = str;
            return this;
        }

        @dl.d
        public final Builder G(@u0 int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28512, new Class[]{Integer.TYPE}, Builder.class);
            if (patchProxyResultProxy.isSupported) {
                return (Builder) patchProxyResultProxy.result;
            }
            this.f81531o = Integer.valueOf(i10);
            return this;
        }

        public final void H(@dl.e Integer num) {
            this.f81531o = num;
        }

        @dl.d
        public final Builder I(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28526, new Class[]{cls, cls}, Builder.class);
            if (patchProxyResultProxy.isSupported) {
                return (Builder) patchProxyResultProxy.result;
            }
            this.f81532p = new Size(i10, i11);
            return this;
        }

        public final void J(@dl.e Size size) {
            this.f81532p = size;
        }

        public final void K(@dl.e yh.a<b2> aVar) {
            this.f81523g = aVar;
        }

        public final void L(@dl.e yh.a<b2> aVar) {
            this.f81522f = aVar;
        }

        @dl.d
        public final Builder M(@dl.d final l<? super Builder, b2> onAnimEnd) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{onAnimEnd}, this, changeQuickRedirect, false, 28517, new Class[]{l.class}, Builder.class);
            if (patchProxyResultProxy.isSupported) {
                return (Builder) patchProxyResultProxy.result;
            }
            f0.p(onAnimEnd, "onAnimEnd");
            this.f81522f = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.FloatingLikeLottieAnimation$Builder$setOnAnimEndListener$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28529, new Class[0], Object.class);
                    if (patchProxyResultProxy2.isSupported) {
                        return patchProxyResultProxy2.result;
                    }
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28528, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    onAnimEnd.invoke(this);
                }
            };
            return this;
        }

        public final void N(@dl.e yh.a<b2> aVar) {
            this.f81521e = aVar;
        }

        @dl.d
        public final Builder O(@dl.d final l<? super Builder, b2> onAnimStart) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{onAnimStart}, this, changeQuickRedirect, false, 28516, new Class[]{l.class}, Builder.class);
            if (patchProxyResultProxy.isSupported) {
                return (Builder) patchProxyResultProxy.result;
            }
            f0.p(onAnimStart, "onAnimStart");
            this.f81521e = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.FloatingLikeLottieAnimation$Builder$setOnAnimStartListener$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28531, new Class[0], Object.class);
                    if (patchProxyResultProxy2.isSupported) {
                        return patchProxyResultProxy2.result;
                    }
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28530, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    onAnimStart.invoke(this);
                }
            };
            return this;
        }

        @dl.d
        public final Builder P(@dl.d final l<? super Builder, b2> onAnimCancel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{onAnimCancel}, this, changeQuickRedirect, false, 28518, new Class[]{l.class}, Builder.class);
            if (patchProxyResultProxy.isSupported) {
                return (Builder) patchProxyResultProxy.result;
            }
            f0.p(onAnimCancel, "onAnimCancel");
            this.f81523g = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.FloatingLikeLottieAnimation$Builder$setOnCancelListener$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28533, new Class[0], Object.class);
                    if (patchProxyResultProxy2.isSupported) {
                        return patchProxyResultProxy2.result;
                    }
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28532, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    onAnimCancel.invoke(this);
                }
            };
            return this;
        }

        public final void Q(int i10) {
            this.f81526j = i10;
        }

        public final void R(int i10) {
            this.f81527k = i10;
        }

        public final void S(boolean z10) {
            this.f81529m = z10;
        }

        public final void T(boolean z10) {
            this.f81530n = z10;
        }

        @dl.d
        public final FloatingLikeLottieAnimation a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28527, new Class[0], FloatingLikeLottieAnimation.class);
            return patchProxyResultProxy.isSupported ? (FloatingLikeLottieAnimation) patchProxyResultProxy.result : new FloatingLikeLottieAnimation(this);
        }

        @dl.e
        public final Pair<Float, Float> b() {
            return this.f81518b;
        }

        @dl.e
        public final WeakReference<View> c() {
            return this.f81519c;
        }

        @dl.e
        public final yh.a<Rect> d() {
            return this.f81528l;
        }

        @dl.d
        public final Drawable e() {
            return this.f81525i;
        }

        @dl.d
        public final WeakReference<Activity> f() {
            return this.f81517a;
        }

        @dl.e
        public final Pair<Bitmap, String> g() {
            return this.f81520d;
        }

        @dl.d
        public final String h() {
            return this.f81524h;
        }

        @dl.e
        public final Integer i() {
            return this.f81531o;
        }

        @dl.e
        public final Size j() {
            return this.f81532p;
        }

        @dl.e
        public final yh.a<b2> k() {
            return this.f81523g;
        }

        @dl.e
        public final yh.a<b2> l() {
            return this.f81522f;
        }

        @dl.e
        public final yh.a<b2> m() {
            return this.f81521e;
        }

        public final int n() {
            return this.f81526j;
        }

        public final int o() {
            return this.f81527k;
        }

        public final boolean p() {
            return this.f81529m;
        }

        public final boolean q() {
            return this.f81530n;
        }

        public final void r(@dl.e Pair<Float, Float> pair) {
            this.f81518b = pair;
        }

        public final void s(@dl.e WeakReference<View> weakReference) {
            this.f81519c = weakReference;
        }

        @dl.d
        public final Builder t(float f10, float f11) {
            Object[] objArr = {new Float(f10), new Float(f11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28514, new Class[]{cls, cls}, Builder.class);
            if (patchProxyResultProxy.isSupported) {
                return (Builder) patchProxyResultProxy.result;
            }
            this.f81519c = null;
            this.f81518b = new Pair<>(Float.valueOf(f10), Float.valueOf(f11));
            return this;
        }

        @dl.d
        public final Builder u(@dl.e View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28513, new Class[]{View.class}, Builder.class);
            if (patchProxyResultProxy.isSupported) {
                return (Builder) patchProxyResultProxy.result;
            }
            this.f81518b = null;
            this.f81519c = new WeakReference<>(view);
            return this;
        }

        @dl.d
        public final Builder v(@dl.d yh.a<Rect> animContainerSafeRectGetter) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{animContainerSafeRectGetter}, this, changeQuickRedirect, false, 28515, new Class[]{yh.a.class}, Builder.class);
            if (patchProxyResultProxy.isSupported) {
                return (Builder) patchProxyResultProxy.result;
            }
            f0.p(animContainerSafeRectGetter, "animContainerSafeRectGetter");
            this.f81528l = animContainerSafeRectGetter;
            return this;
        }

        @dl.d
        public final Builder w(@dl.d Drawable drawable) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 28525, new Class[]{Drawable.class}, Builder.class);
            if (patchProxyResultProxy.isSupported) {
                return (Builder) patchProxyResultProxy.result;
            }
            f0.p(drawable, "drawable");
            this.f81525i = drawable;
            return this;
        }

        public final void x(@dl.d Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 28511, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(drawable, "<set-?>");
            this.f81525i = drawable;
        }

        @dl.d
        public final Builder y(@dl.d ImageView imageView, @dl.e String str, @dl.d String imgLayerName) {
            boolean z10 = false;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageView, str, imgLayerName}, this, changeQuickRedirect, false, 28519, new Class[]{ImageView.class, String.class, String.class}, Builder.class);
            if (patchProxyResultProxy.isSupported) {
                return (Builder) patchProxyResultProxy.result;
            }
            f0.p(imageView, "imageView");
            f0.p(imgLayerName, "imgLayerName");
            try {
                Result.a aVar = Result.f124476c;
                if (str != null) {
                    File fileA = LikeAnimResourceManager.f79963a.a(str);
                    if (fileA != null && fileA.exists()) {
                        z10 = true;
                    }
                    if (z10) {
                        this.f81529m = true;
                        int width = imageView.getWidth();
                        int height = imageView.getHeight();
                        Context context = imageView.getContext();
                        f0.o(context, "imageView.context");
                        return D(str, imgLayerName, width, height, context);
                    }
                }
                return C(imageView, imgLayerName);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f124476c;
                Throwable thE = Result.e(Result.b(kotlin.t0.a(th2)));
                if (thE != null) {
                    g.f74531b.v("[setDynamicImage] error: " + thE);
                }
                return this;
            }
        }
    }

    /* JADX INFO: compiled from: FloatingLikeLottieAnimation.kt */
    @o(parameters = 0)
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f81539e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final WeakReference<ViewGroup> f81540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final WeakReference<LottieAnimationView> f81541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final WeakReference<FrameLayout> f81542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.e
        private final yh.a<b2> f81543d;

        public a(@dl.e ViewGroup viewGroup, @dl.e LottieAnimationView lottieAnimationView, @dl.e FrameLayout frameLayout, @dl.e yh.a<b2> aVar) {
            this.f81540a = new WeakReference<>(viewGroup);
            this.f81541b = new WeakReference<>(lottieAnimationView);
            this.f81542c = new WeakReference<>(frameLayout);
            this.f81543d = aVar;
        }

        public final void a() {
            boolean z10 = false;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28509, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Log.d(FloatingLikeLottieAnimation.f81510d, "[cancelAnimation]\nrootView: " + this.f81540a.get() + "\nlottieView: " + this.f81541b.get() + "\nonAnimCancelListenerRef: " + this.f81543d);
            yh.a<b2> aVar = this.f81543d;
            if (aVar != null) {
                aVar.invoke();
            }
            ViewGroup viewGroup = this.f81540a.get();
            if (viewGroup == null) {
                return;
            }
            LottieAnimationView lottieAnimationView = this.f81541b.get();
            FrameLayout frameLayout = this.f81542c.get();
            if (lottieAnimationView != null && lottieAnimationView.A()) {
                z10 = true;
            }
            if (z10) {
                lottieAnimationView.p();
            }
            if (frameLayout != null) {
                viewGroup.removeView(frameLayout);
            } else {
                viewGroup.removeView(lottieAnimationView);
            }
        }

        public final boolean b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28510, new Class[0], Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            LottieAnimationView lottieAnimationView = this.f81541b.get();
            return lottieAnimationView != null && lottieAnimationView.A();
        }
    }

    /* JADX INFO: compiled from: FloatingLikeLottieAnimation.kt */
    public static final class b {
        public static ChangeQuickRedirect changeQuickRedirect;

        private b() {
        }

        public /* synthetic */ b(u uVar) {
            this();
        }

        @dl.d
        public final Pair<Float, Float> a(@dl.e View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28534, new Class[]{View.class}, Pair.class);
            if (patchProxyResultProxy.isSupported) {
                return (Pair) patchProxyResultProxy.result;
            }
            Rect rect = new Rect();
            return view != null && view.getGlobalVisibleRect(rect) ? new Pair<>(Float.valueOf(rect.exactCenterX()), Float.valueOf(rect.exactCenterY())) : new Pair<>(Float.valueOf(-1.0f), Float.valueOf(-1.0f));
        }
    }

    /* JADX INFO: compiled from: FloatingLikeLottieAnimation.kt */
    @t0({"SMAP\nFloatingLikeLottieAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingLikeLottieAnimation.kt\ncom/max/xiaoheihe/module/bbs/post/ui/FloatingLikeLottieAnimation$showInternal$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,485:1\n1#2:486\n*E\n"})
    public static final class c implements n {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f81545b;

        /* JADX INFO: compiled from: FloatingLikeLottieAnimation.kt */
        public static final class a<T> implements com.airbnb.lottie.value.l {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bitmap f81546a;

            a(Bitmap bitmap) {
                this.f81546a = bitmap;
            }

            @Override // com.airbnb.lottie.value.l
            public /* bridge */ /* synthetic */ Object a(com.airbnb.lottie.value.b bVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 28536, new Class[]{com.airbnb.lottie.value.b.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : b(bVar);
            }

            public final Bitmap b(com.airbnb.lottie.value.b<Bitmap> bVar) {
                return this.f81546a;
            }
        }

        c(LottieAnimationView lottieAnimationView) {
            this.f81545b = lottieAnimationView;
        }

        @Override // com.airbnb.lottie.n
        public final void a(com.airbnb.lottie.g gVar) {
            Pair<Bitmap, String> pairG;
            if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 28535, new Class[]{com.airbnb.lottie.g.class}, Void.TYPE).isSupported || (pairG = FloatingLikeLottieAnimation.this.f81515a.g()) == null) {
                return;
            }
            this.f81545b.o(new com.airbnb.lottie.model.d(pairG.b()), com.airbnb.lottie.o.N, new a(pairG.a()));
        }
    }

    /* JADX INFO: compiled from: FloatingLikeLottieAnimation.kt */
    public static final class d implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f81548c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ yh.a<Pair<Float, Float>> f81549d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewGroup f81550e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ FrameLayout f81551f;

        /* JADX INFO: compiled from: FloatingLikeLottieAnimation.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ yh.a<Pair<Float, Float>> f81552b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ LottieAnimationView f81553c;

            a(yh.a<Pair<Float, Float>> aVar, LottieAnimationView lottieAnimationView) {
                this.f81552b = aVar;
                this.f81553c = lottieAnimationView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28541, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                Pair<Float, Float> pairInvoke = this.f81552b.invoke();
                float fFloatValue = pairInvoke.a().floatValue();
                float fFloatValue2 = pairInvoke.b().floatValue();
                LottieAnimationView lottieAnimationView = this.f81553c;
                lottieAnimationView.setTranslationX(fFloatValue - (lottieAnimationView.getWidth() / 2));
                LottieAnimationView lottieAnimationView2 = this.f81553c;
                lottieAnimationView2.setTranslationY(fFloatValue2 - (lottieAnimationView2.getHeight() / 2));
                this.f81553c.setVisibility(0);
            }
        }

        d(LottieAnimationView lottieAnimationView, yh.a<Pair<Float, Float>> aVar, ViewGroup viewGroup, FrameLayout frameLayout) {
            this.f81548c = lottieAnimationView;
            this.f81549d = aVar;
            this.f81550e = viewGroup;
            this.f81551f = frameLayout;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 28539, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 28538, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            yh.a<b2> aVarL = FloatingLikeLottieAnimation.this.f81515a.l();
            if (aVarL != null) {
                aVarL.invoke();
            }
            this.f81550e.removeView(this.f81551f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 28540, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 28537, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            yh.a<b2> aVarM = FloatingLikeLottieAnimation.this.f81515a.m();
            if (aVarM != null) {
                aVarM.invoke();
            }
            this.f81548c.setVisibility(4);
            LottieAnimationView lottieAnimationView = this.f81548c;
            lottieAnimationView.post(new a(this.f81549d, lottieAnimationView));
        }
    }

    /* JADX INFO: compiled from: FloatingLikeLottieAnimation.kt */
    @t0({"SMAP\nFloatingLikeLottieAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingLikeLottieAnimation.kt\ncom/max/xiaoheihe/module/bbs/post/ui/FloatingLikeLottieAnimation$showInternal$2$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,485:1\n262#2,2:486\n*S KotlinDebug\n*F\n+ 1 FloatingLikeLottieAnimation.kt\ncom/max/xiaoheihe/module/bbs/post/ui/FloatingLikeLottieAnimation$showInternal$2$2\n*L\n184#1:486,2\n*E\n"})
    public static final class e implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.a<Pair<Float, Float>> f81555c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f81556d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Rect f81557e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ FrameLayout f81558f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Rect f81559g;

        e(yh.a<Pair<Float, Float>> aVar, LottieAnimationView lottieAnimationView, Rect rect, FrameLayout frameLayout, Rect rect2) {
            this.f81555c = aVar;
            this.f81556d = lottieAnimationView;
            this.f81557e = rect;
            this.f81558f = frameLayout;
            this.f81559g = rect2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 28542, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            yh.a<Rect> aVarD = FloatingLikeLottieAnimation.this.f81515a.d();
            if (aVarD != null) {
                FrameLayout frameLayout = this.f81558f;
                Rect rect = this.f81559g;
                FloatingLikeLottieAnimation floatingLikeLottieAnimation = FloatingLikeLottieAnimation.this;
                Rect rect2 = this.f81557e;
                frameLayout.getGlobalVisibleRect(rect);
                FloatingLikeLottieAnimation.a(floatingLikeLottieAnimation, rect, aVarD.invoke(), rect2);
                frameLayout.setPadding(0, rect2.top, 0, rect2.bottom);
            }
            Pair<Float, Float> pairInvoke = this.f81555c.invoke();
            float fFloatValue = pairInvoke.a().floatValue();
            float fFloatValue2 = pairInvoke.b().floatValue();
            if (!(fFloatValue == -1.0f)) {
                if (!(fFloatValue2 == -1.0f)) {
                    LottieAnimationView lottieAnimationView = this.f81556d;
                    lottieAnimationView.setTranslationX(fFloatValue - (lottieAnimationView.getWidth() / 2));
                    LottieAnimationView lottieAnimationView2 = this.f81556d;
                    lottieAnimationView2.setTranslationY((fFloatValue2 - (lottieAnimationView2.getHeight() / 2)) - this.f81557e.top);
                    return;
                }
            }
            this.f81556d.setVisibility(8);
            yh.a<b2> aVarL = FloatingLikeLottieAnimation.this.f81515a.l();
            if (aVarL != null) {
                aVarL.invoke();
            }
        }
    }

    public FloatingLikeLottieAnimation(@dl.d Builder builder) {
        f0.p(builder, "builder");
        this.f81515a = builder;
    }

    public static final /* synthetic */ void a(FloatingLikeLottieAnimation floatingLikeLottieAnimation, Rect rect, Rect rect2, Rect rect3) {
        if (PatchProxy.proxy(new Object[]{floatingLikeLottieAnimation, rect, rect2, rect3}, null, changeQuickRedirect, true, 28508, new Class[]{FloatingLikeLottieAnimation.class, Rect.class, Rect.class, Rect.class}, Void.TYPE).isSupported) {
            return;
        }
        floatingLikeLottieAnimation.e(rect, rect2, rect3);
    }

    public static final /* synthetic */ void c(FloatingLikeLottieAnimation floatingLikeLottieAnimation, Activity activity, ViewGroup viewGroup, LottieAnimationView lottieAnimationView, FrameLayout frameLayout, yh.a aVar) {
        if (PatchProxy.proxy(new Object[]{floatingLikeLottieAnimation, activity, viewGroup, lottieAnimationView, frameLayout, aVar}, null, changeQuickRedirect, true, 28507, new Class[]{FloatingLikeLottieAnimation.class, Activity.class, ViewGroup.class, LottieAnimationView.class, FrameLayout.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        floatingLikeLottieAnimation.f(activity, viewGroup, lottieAnimationView, frameLayout, aVar);
    }

    private final LottieAnimationView d(Activity activity, Builder builder) {
        Object objB;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity, builder}, this, changeQuickRedirect, false, 28506, new Class[]{Activity.class, Builder.class}, LottieAnimationView.class);
        if (patchProxyResultProxy.isSupported) {
            return (LottieAnimationView) patchProxyResultProxy.result;
        }
        String strH = builder.h();
        Integer numI = builder.i();
        LottieAnimationView lottieAnimationView = new LottieAnimationView(activity);
        lottieAnimationView.setRepeatCount(builder.n());
        lottieAnimationView.setRepeatMode(builder.o());
        lottieAnimationView.setBackground(builder.e());
        try {
            Result.a aVar = Result.f124476c;
            if (!kotlin.text.u.V1(strH) || numI == null) {
                File file = new File(r.p(strH));
                if (!file.exists()) {
                    file = null;
                }
                if (file != null) {
                    lottieAnimationView.setFailureListener(r.f95734k);
                    lottieAnimationView.setAnimation(new FileInputStream(file), strH);
                } else {
                    lottieAnimationView = null;
                }
            } else {
                lottieAnimationView.setAnimation(numI.intValue());
            }
            objB = Result.b(lottieAnimationView);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(kotlin.t0.a(th2));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            g.f74531b.q("[FloatingLikeLottieAnimation-dbg][buildLottieAnimView] build failed\nlottieCacheFile: " + strH + "\nerror: " + thE);
        }
        return (LottieAnimationView) (Result.i(objB) ? null : objB);
    }

    private final void e(Rect rect, Rect rect2, Rect rect3) {
        if (PatchProxy.proxy(new Object[]{rect, rect2, rect3}, this, changeQuickRedirect, false, 28505, new Class[]{Rect.class, Rect.class, Rect.class}, Void.TYPE).isSupported) {
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

    private final void f(Activity activity, ViewGroup viewGroup, LottieAnimationView lottieAnimationView, FrameLayout frameLayout, yh.a<Pair<Float, Float>> aVar) {
        if (PatchProxy.proxy(new Object[]{activity, viewGroup, lottieAnimationView, frameLayout, aVar}, this, changeQuickRedirect, false, 28504, new Class[]{Activity.class, ViewGroup.class, LottieAnimationView.class, FrameLayout.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        Size sizeJ = this.f81515a.j();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(sizeJ != null ? ViewUtils.f(activity, sizeJ.getWidth()) : -2, sizeJ != null ? ViewUtils.f(activity, sizeJ.getHeight()) : -2);
        if (lottieAnimationView != null) {
            lottieAnimationView.m(new c(lottieAnimationView));
        }
        t.p(activity);
        if (lottieAnimationView != null) {
            lottieAnimationView.j(new d(lottieAnimationView, aVar, viewGroup, frameLayout));
            lottieAnimationView.l(new e(aVar, lottieAnimationView, new Rect(0, 0, 0, 0), frameLayout, new Rect()));
            frameLayout.addView(lottieAnimationView, layoutParams);
            viewGroup.addView(frameLayout);
        }
        if (lottieAnimationView != null) {
            lottieAnimationView.E();
        }
    }

    @dl.e
    public final a g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28503, new Class[0], a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        final Activity activity = this.f81515a.f().get();
        if (activity == null) {
            return null;
        }
        WeakReference<View> weakReferenceC = this.f81515a.c();
        final View view = weakReferenceC != null ? weakReferenceC.get() : null;
        final Pair<Float, Float> pairB = this.f81515a.b();
        if (view == null && pairB == null) {
            return null;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        f0.o(viewFindViewById, "context.findViewById(android.R.id.content)");
        final ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        final LottieAnimationView lottieAnimationViewD = d(activity, this.f81515a);
        final FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        viewGroup.postDelayed(new Runnable() { // from class: com.max.xiaoheihe.module.bbs.post.ui.FloatingLikeLottieAnimation$showOneShot$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28543, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                final View view2 = view;
                if (view2 != null) {
                    FloatingLikeLottieAnimation.c(this, activity, viewGroup, lottieAnimationViewD, frameLayout, new a<Pair<? extends Float, ? extends Float>>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.FloatingLikeLottieAnimation$showOneShot$1.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @d
                        public final Pair<Float, Float> a() {
                            PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28544, new Class[0], Pair.class);
                            return patchProxyResultProxy2.isSupported ? (Pair) patchProxyResultProxy2.result : FloatingLikeLottieAnimation.f81508b.a(view2);
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Pair<? extends java.lang.Float, ? extends java.lang.Float>] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ Pair<? extends Float, ? extends Float> invoke() {
                            PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28545, new Class[0], Object.class);
                            return patchProxyResultProxy2.isSupported ? patchProxyResultProxy2.result : a();
                        }
                    });
                    return;
                }
                final Pair<Float, Float> pair = pairB;
                if (pair != null) {
                    FloatingLikeLottieAnimation.c(this, activity, viewGroup, lottieAnimationViewD, frameLayout, new a<Pair<? extends Float, ? extends Float>>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.FloatingLikeLottieAnimation$showOneShot$1.2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @d
                        public final Pair<Float, Float> a() {
                            return pair;
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Pair<? extends java.lang.Float, ? extends java.lang.Float>] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ Pair<? extends Float, ? extends Float> invoke() {
                            PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28546, new Class[0], Object.class);
                            return patchProxyResultProxy2.isSupported ? patchProxyResultProxy2.result : a();
                        }
                    });
                }
            }
        }, 10L);
        return new a(viewGroup, lottieAnimationViewD, frameLayout, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.FloatingLikeLottieAnimation$showOneShot$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28548, new Class[0], Object.class);
                if (patchProxyResultProxy2.isSupported) {
                    return patchProxyResultProxy2.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                a<b2> aVarK;
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28547, new Class[0], Void.TYPE).isSupported || (aVarK = this.f81569b.f81515a.k()) == null) {
                    return;
                }
                aVarK.invoke();
            }
        });
    }
}
