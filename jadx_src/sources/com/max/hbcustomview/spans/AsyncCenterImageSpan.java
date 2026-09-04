package com.max.hbcustomview.spans;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import android.util.Log;
import android.widget.TextView;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import xh.m;
import yh.p;

/* JADX INFO: compiled from: AsyncCenterImageSpan.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class AsyncCenterImageSpan extends ImageSpan {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    public static final a f69489l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final HashMap<String, Drawable> f69490m = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final String f69491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f69492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f69493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f69494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f69495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f69496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f69497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final WeakReference<TextView> f69498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final WeakReference<Context> f69499j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private Drawable f69500k;

    /* JADX INFO: renamed from: com.max.hbcustomview.spans.AsyncCenterImageSpan$1, reason: invalid class name */
    /* JADX INFO: compiled from: AsyncCenterImageSpan.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.hbcustomview.spans.AsyncCenterImageSpan$1", f = "AsyncCenterImageSpan.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f69501b;

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.f.Br, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : AsyncCenterImageSpan.this.new AnonymousClass1(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.f.Dr, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.f.Cr, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Drawable.ConstantState constantState;
            Drawable drawableNewDrawable;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.f.Ar, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f69501b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            a aVar = AsyncCenterImageSpan.f69489l;
            if (aVar.a().get(AsyncCenterImageSpan.this.f69491b) != null) {
                AsyncCenterImageSpan asyncCenterImageSpan = AsyncCenterImageSpan.this;
                Drawable drawable = aVar.a().get(AsyncCenterImageSpan.this.f69491b);
                asyncCenterImageSpan.f69500k = (drawable == null || (constantState = drawable.getConstantState()) == null || (drawableNewDrawable = constantState.newDrawable()) == null) ? null : drawableNewDrawable.mutate();
            } else {
                AsyncCenterImageSpan.g(AsyncCenterImageSpan.this);
            }
            return b2.f124493a;
        }
    }

    /* JADX INFO: compiled from: AsyncCenterImageSpan.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @m
        public static /* synthetic */ void b() {
        }

        @dl.d
        public final HashMap<String, Drawable> a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Er, new Class[0], HashMap.class);
            return patchProxyResultProxy.isSupported ? (HashMap) patchProxyResultProxy.result : AsyncCenterImageSpan.f69490m;
        }
    }

    /* JADX INFO: compiled from: AsyncCenterImageSpan.kt */
    public static final class b extends com.bumptech.glide.request.target.e<Bitmap> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.bumptech.glide.request.target.p
        public void onLoadCleared(@dl.e Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.f.Gr, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            Log.d("AsyncCenterImageSpan", "onLoadCleared " + AsyncCenterImageSpan.this.f69498i.get());
        }

        public void onResourceReady(@dl.d Bitmap resource, @dl.e com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
            if (PatchProxy.proxy(new Object[]{resource, fVar}, this, changeQuickRedirect, false, bb.c.f.Fr, new Class[]{Bitmap.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(resource, "resource");
            Log.d("AsyncCenterImageSpan", "onResourceReady " + AsyncCenterImageSpan.this.f69498i.get());
            Context context = (Context) AsyncCenterImageSpan.this.f69499j.get();
            if (context != null) {
                AsyncCenterImageSpan asyncCenterImageSpan = AsyncCenterImageSpan.this;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), resource);
                bitmapDrawable.setBounds(0, 0, asyncCenterImageSpan.f69492c, asyncCenterImageSpan.f69493d);
                AsyncCenterImageSpan.f69489l.a().put(asyncCenterImageSpan.f69491b, bitmapDrawable);
                asyncCenterImageSpan.f69500k = bitmapDrawable;
                AsyncCenterImageSpan.i(asyncCenterImageSpan);
            }
        }

        @Override // com.bumptech.glide.request.target.p
        public /* bridge */ /* synthetic */ void onResourceReady(Object obj, com.bumptech.glide.request.transition.f fVar) {
            if (PatchProxy.proxy(new Object[]{obj, fVar}, this, changeQuickRedirect, false, bb.c.f.Hr, new Class[]{Object.class, com.bumptech.glide.request.transition.f.class}, Void.TYPE).isSupported) {
                return;
            }
            onResourceReady((Bitmap) obj, (com.bumptech.glide.request.transition.f<? super Bitmap>) fVar);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AsyncCenterImageSpan(@dl.d Context context, @dl.e String str, @dl.e TextView textView, int i10, int i11, int i12, int i13, int i14, int i15) {
        f0.p(context, "context");
        Drawable drawable = context.getDrawable(R.drawable.bbs_pic_filled_24x24);
        f0.m(drawable);
        super(drawable, 0);
        this.f69491b = str;
        this.f69492c = i10;
        this.f69493d = i11;
        this.f69494e = i12;
        this.f69495f = i13;
        this.f69496g = i14;
        this.f69497h = i15;
        this.f69498i = new WeakReference<>(textView);
        this.f69499j = new WeakReference<>(context);
        k.f(r0.a(e1.c()), null, null, new AnonymousClass1(null), 3, null);
    }

    public /* synthetic */ AsyncCenterImageSpan(Context context, String str, TextView textView, int i10, int i11, int i12, int i13, int i14, int i15, int i16, u uVar) {
        this(context, str, textView, i10, i11, (i16 & 32) != 0 ? 0 : i12, (i16 & 64) != 0 ? 0 : i13, (i16 & 128) != 0 ? 0 : i14, (i16 & 256) != 0 ? 0 : i15);
    }

    public static final /* synthetic */ void g(AsyncCenterImageSpan asyncCenterImageSpan) {
        if (PatchProxy.proxy(new Object[]{asyncCenterImageSpan}, null, changeQuickRedirect, true, bb.c.f.zr, new Class[]{AsyncCenterImageSpan.class}, Void.TYPE).isSupported) {
            return;
        }
        asyncCenterImageSpan.k();
    }

    public static final /* synthetic */ void i(AsyncCenterImageSpan asyncCenterImageSpan) {
        if (PatchProxy.proxy(new Object[]{asyncCenterImageSpan}, null, changeQuickRedirect, true, bb.c.f.yr, new Class[]{AsyncCenterImageSpan.class}, Void.TYPE).isSupported) {
            return;
        }
        asyncCenterImageSpan.l();
    }

    @dl.d
    public static final HashMap<String, Drawable> j() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.f.xr, new Class[0], HashMap.class);
        return patchProxyResultProxy.isSupported ? (HashMap) patchProxyResultProxy.result : f69489l.a();
    }

    private final void k() {
        Context context;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.tr, new Class[0], Void.TYPE).isSupported || (context = this.f69499j.get()) == null) {
            return;
        }
    }

    private final void l() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.wr, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k.f(r0.a(e1.e()), null, null, new AsyncCenterImageSpan$updateTextView$1(this, null), 3, null);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(@dl.d Canvas canvas, @dl.e CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, @dl.d Paint paint) {
        Object[] objArr = {canvas, charSequence, new Integer(i10), new Integer(i11), new Float(f10), new Integer(i12), new Integer(i13), new Integer(i14), paint};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.ur, new Class[]{Canvas.class, CharSequence.class, cls, cls, Float.TYPE, cls, cls, cls, Paint.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        f0.p(paint, "paint");
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setBounds(0, 0, this.f69492c, this.f69493d);
        }
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        float f11 = this.f69494e + f10;
        int i15 = (((fontMetricsInt.descent + i13) + i13) + fontMetricsInt.ascent) / 2;
        f0.m(drawable);
        int i16 = ((i15 - (drawable.getBounds().bottom / 2)) + this.f69496g) - this.f69497h;
        canvas.save();
        canvas.translate(f11, i16);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    @dl.e
    public Drawable getDrawable() {
        Drawable.ConstantState constantState;
        Drawable drawableNewDrawable;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.sr, new Class[0], Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        Drawable drawable = this.f69500k;
        if (drawable == null) {
            Drawable drawable2 = f69490m.get(this.f69491b);
            if (drawable2 == null || (constantState = drawable2.getConstantState()) == null || (drawableNewDrawable = constantState.newDrawable()) == null || (drawable = drawableNewDrawable.mutate()) == null) {
                drawable = null;
            } else {
                this.f69500k = drawable;
                drawable.setBounds(0, 0, this.f69492c, this.f69493d);
            }
        }
        if (drawable == null) {
            drawable = super.getDrawable();
        }
        if (drawable == null) {
            return null;
        }
        drawable.setBounds(0, 0, this.f69492c, this.f69493d);
        return drawable;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(@dl.d Paint paint, @dl.e CharSequence charSequence, int i10, int i11, @dl.e Paint.FontMetricsInt fontMetricsInt) {
        Object[] objArr = {paint, charSequence, new Integer(i10), new Integer(i11), fontMetricsInt};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.vr, new Class[]{Paint.class, CharSequence.class, cls, cls, Paint.FontMetricsInt.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(paint, "paint");
        return this.f69494e + super.getSize(paint, charSequence, i10, i11, fontMetricsInt) + this.f69495f;
    }
}
