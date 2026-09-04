package com.max.hbcommon.component.triplebanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bb.c;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.transition.f;
import com.max.hbcommon.R;
import com.max.hbimage.image.l;
import com.max.hbimage.image.o;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.z;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: TripleBannerDecorationView.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class TripleBannerDecorationView extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f67923w = 30;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f67924x = 375;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final float f67925y = 9.8f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final q0 f67927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f67928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageView f67929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f67930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LinearLayout f67931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private LinearLayout f67932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private LinearLayout f67933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinearLayout f67934i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private LinearLayout f67935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private LinearLayout f67936k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f67937l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f67938m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @e
    private ArrayList<String> f67939n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f67940o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f67941p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f67942q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @e
    private SensorEventListener f67943r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f67944s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f67945t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @d
    private final z f67946u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @d
    public static final a f67922v = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @d
    private static final HashMap<String, Bitmap> f67926z = new HashMap<>();

    /* JADX INFO: compiled from: TripleBannerDecorationView.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @d
        public final HashMap<String, Bitmap> a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.Z4, new Class[0], HashMap.class);
            return patchProxyResultProxy.isSupported ? (HashMap) patchProxyResultProxy.result : TripleBannerDecorationView.f67926z;
        }
    }

    /* JADX INFO: compiled from: TripleBannerDecorationView.kt */
    public static final class b extends o {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f67955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f67956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TripleBannerDecorationView f67957d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ImageView f67958e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f67959f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, int i10, TripleBannerDecorationView tripleBannerDecorationView, ImageView imageView, int i11) {
            super(str);
            this.f67955b = str;
            this.f67956c = i10;
            this.f67957d = tripleBannerDecorationView;
            this.f67958e = imageView;
            this.f67959f = i11;
        }

        @Override // com.max.hbimage.image.o, com.bumptech.glide.request.target.p
        public void onLoadFailed(@e Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, c.e.f31715b5, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onLoadFailed(drawable);
            int i10 = this.f67959f;
            if (i10 < 3) {
                TripleBannerDecorationView.a(this.f67957d, this.f67955b, this.f67956c, this.f67958e, i10 + 1);
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.max.hbimage.image.o
        public void onResourceReady(@d File resource, @e f<? super File> fVar) {
            if (PatchProxy.proxy(new Object[]{resource, fVar}, this, changeQuickRedirect, false, c.e.f31698a5, new Class[]{File.class, f.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(resource, "resource");
            super.onResourceReady(resource, fVar);
            if (this.f67956c == this.f67957d.getCurrentIndex()) {
                try {
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(resource.getAbsolutePath());
                    this.f67958e.setImageBitmap(bitmapDecodeFile);
                    HashMap<String, Bitmap> mapA = TripleBannerDecorationView.f67922v.a();
                    String str = this.f67955b;
                    f0.m(str);
                    f0.m(bitmapDecodeFile);
                    mapA.put(str, bitmapDecodeFile);
                } catch (Throwable unused) {
                }
            }
        }

        @Override // com.max.hbimage.image.o, com.bumptech.glide.request.target.p
        public /* bridge */ /* synthetic */ void onResourceReady(File file, f<? super File> fVar) {
            if (PatchProxy.proxy(new Object[]{file, fVar}, this, changeQuickRedirect, false, c.e.f31732c5, new Class[]{Object.class, f.class}, Void.TYPE).isSupported) {
                return;
            }
            onResourceReady(file, fVar);
        }
    }

    public TripleBannerDecorationView(@e Context context) {
        this(context, null);
    }

    public TripleBannerDecorationView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TripleBannerDecorationView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripleBannerDecorationView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        f0.m(context);
        this.f67927b = r0.a(e1.e());
        this.f67939n = new ArrayList<>();
        this.f67944s = true;
        this.f67946u = b0.c(new yh.a<PathInterpolator>() { // from class: com.max.hbcommon.component.triplebanner.TripleBannerDecorationView$pathInterpolator$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @d
            public final PathInterpolator a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.f31749d5, new Class[0], PathInterpolator.class);
                return patchProxyResultProxy.isSupported ? (PathInterpolator) patchProxyResultProxy.result : new PathInterpolator(0.42f, 0.0f, 1.0f, 1.0f);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.view.animation.PathInterpolator, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ PathInterpolator invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.f31766e5, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.K3);
        f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f67945t = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TripleBannerDecorationView_tbdvBottomStyle, false);
        k();
        final float fD = (((ic.a.f119343a.d(context) * 30) / 375) * 5.0f) / 3.0f;
        final float f10 = (2.0f * fD) / 5.0f;
        this.f67943r = new SensorEventListener() { // from class: com.max.hbcommon.component.triplebanner.TripleBannerDecorationView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(@e Sensor sensor, int i12) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(@e SensorEvent sensorEvent) {
                if (PatchProxy.proxy(new Object[]{sensorEvent}, this, changeQuickRedirect, false, c.e.U4, new Class[]{SensorEvent.class}, Void.TYPE).isSupported || sensorEvent == null) {
                    return;
                }
                TripleBannerDecorationView tripleBannerDecorationView = TripleBannerDecorationView.this;
                float f11 = f10;
                float f12 = fD;
                if (sensorEvent.sensor.getType() != 9 || com.max.hbcommon.utils.c.w(tripleBannerDecorationView.getImageList())) {
                    return;
                }
                k.f(tripleBannerDecorationView.f67927b, null, null, new TripleBannerDecorationView$1$onSensorChanged$1$1(tripleBannerDecorationView, f11, sensorEvent, f12, null), 3, null);
            }
        };
    }

    public static final /* synthetic */ void a(TripleBannerDecorationView tripleBannerDecorationView, String str, int i10, ImageView imageView, int i11) {
        Object[] objArr = {tripleBannerDecorationView, str, new Integer(i10), imageView, new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.e.T4, new Class[]{TripleBannerDecorationView.class, String.class, cls, ImageView.class, cls}, Void.TYPE).isSupported) {
            return;
        }
        tripleBannerDecorationView.l(str, i10, imageView, i11);
    }

    public static final /* synthetic */ float c(TripleBannerDecorationView tripleBannerDecorationView, float f10) {
        Object[] objArr = {tripleBannerDecorationView, new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.e.R4, new Class[]{TripleBannerDecorationView.class, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : tripleBannerDecorationView.m(f10);
    }

    public static final /* synthetic */ void e(TripleBannerDecorationView tripleBannerDecorationView, float f10) {
        if (PatchProxy.proxy(new Object[]{tripleBannerDecorationView, new Float(f10)}, null, changeQuickRedirect, true, c.e.Q4, new Class[]{TripleBannerDecorationView.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        tripleBannerDecorationView.setImageTranslateX(f10);
    }

    public static final /* synthetic */ void f(TripleBannerDecorationView tripleBannerDecorationView, float f10) {
        if (PatchProxy.proxy(new Object[]{tripleBannerDecorationView, new Float(f10)}, null, changeQuickRedirect, true, c.e.S4, new Class[]{TripleBannerDecorationView.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        tripleBannerDecorationView.setImageTranslateY(f10);
    }

    private final void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.D4, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.f67928c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ImageView imageView2 = this.f67928c;
        LinearLayout linearLayout = null;
        if (imageView2 == null) {
            f0.S("centerImage");
            imageView2 = null;
        }
        LinearLayout linearLayoutH = h(imageView2);
        this.f67931f = linearLayoutH;
        if (linearLayoutH == null) {
            f0.S("centerGrandContainer");
        } else {
            linearLayout = linearLayoutH;
        }
        View childAt = linearLayout.getChildAt(0);
        f0.n(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.f67934i = (LinearLayout) childAt;
    }

    private final PathInterpolator getPathInterpolator() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.f32053v4, new Class[0], PathInterpolator.class);
        return patchProxyResultProxy.isSupported ? (PathInterpolator) patchProxyResultProxy.result : (PathInterpolator) this.f67946u.getValue();
    }

    private final LinearLayout h(ImageView imageView) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, c.e.G4, new Class[]{ImageView.class}, LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setLayoutParams(layoutParams);
        linearLayout2.setGravity(17);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        linearLayout2.addView(imageView, layoutParams2);
        addView(linearLayout);
        return linearLayout;
    }

    private final void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.F4, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.f67929d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ImageView imageView2 = this.f67929d;
        LinearLayout linearLayout = null;
        if (imageView2 == null) {
            f0.S("nextImage");
            imageView2 = null;
        }
        LinearLayout linearLayoutH = h(imageView2);
        this.f67932g = linearLayoutH;
        if (linearLayoutH == null) {
            f0.S("nextGrandContainer");
            linearLayoutH = null;
        }
        View childAt = linearLayoutH.getChildAt(0);
        f0.n(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.f67935j = (LinearLayout) childAt;
        if (this.f67945t) {
            LinearLayout linearLayout2 = this.f67932g;
            if (linearLayout2 == null) {
                f0.S("nextGrandContainer");
                linearLayout2 = null;
            }
            ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((FrameLayout.LayoutParams) layoutParams).gravity = 5;
            LinearLayout linearLayout3 = this.f67932g;
            if (linearLayout3 == null) {
                f0.S("nextGrandContainer");
                linearLayout3 = null;
            }
            linearLayout3.setGravity(5);
            LinearLayout linearLayout4 = this.f67933h;
            if (linearLayout4 == null) {
                f0.S("preGrandContainer");
                linearLayout4 = null;
            }
            linearLayout4.getLayoutParams().width = 0;
        }
        LinearLayout linearLayout5 = this.f67935j;
        if (linearLayout5 == null) {
            f0.S("nextContainer");
        } else {
            linearLayout = linearLayout5;
        }
        linearLayout.setTranslationX(this.f67937l);
    }

    private final void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.E4, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.f67930e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ImageView imageView2 = this.f67930e;
        LinearLayout linearLayout = null;
        if (imageView2 == null) {
            f0.S("preImage");
            imageView2 = null;
        }
        LinearLayout linearLayoutH = h(imageView2);
        this.f67933h = linearLayoutH;
        if (linearLayoutH == null) {
            f0.S("preGrandContainer");
            linearLayoutH = null;
        }
        View childAt = linearLayoutH.getChildAt(0);
        f0.n(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.f67936k = (LinearLayout) childAt;
        if (this.f67945t) {
            LinearLayout linearLayout2 = this.f67933h;
            if (linearLayout2 == null) {
                f0.S("preGrandContainer");
                linearLayout2 = null;
            }
            ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((FrameLayout.LayoutParams) layoutParams).gravity = 3;
            LinearLayout linearLayout3 = this.f67933h;
            if (linearLayout3 == null) {
                f0.S("preGrandContainer");
                linearLayout3 = null;
            }
            linearLayout3.setGravity(3);
            LinearLayout linearLayout4 = this.f67933h;
            if (linearLayout4 == null) {
                f0.S("preGrandContainer");
                linearLayout4 = null;
            }
            linearLayout4.getLayoutParams().width = 0;
        }
        LinearLayout linearLayout5 = this.f67936k;
        if (linearLayout5 == null) {
            f0.S("preContainer");
        } else {
            linearLayout = linearLayout5;
        }
        linearLayout.setTranslationX(-this.f67937l);
    }

    private final void k() {
        int iD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.C4, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f67945t) {
            ic.a aVar = ic.a.f119343a;
            Context context = getContext();
            f0.o(context, "getContext(...)");
            iD = (aVar.d(context) * 30) / 375;
        } else {
            ic.a aVar2 = ic.a.f119343a;
            Context context2 = getContext();
            f0.o(context2, "getContext(...)");
            iD = aVar2.d(context2);
        }
        this.f67937l = iD;
        ic.a aVar3 = ic.a.f119343a;
        Context context3 = getContext();
        f0.o(context3, "getContext(...)");
        this.f67938m = (aVar3.d(context3) * 30) / 375;
        if (this.f67945t) {
            g();
            j();
            i();
        } else {
            j();
            i();
            g();
        }
    }

    private final void l(String str, int i10, ImageView imageView, int i11) {
        Object[] objArr = {str, new Integer(i10), imageView, new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.e.O4, new Class[]{String.class, cls, ImageView.class, cls}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        Glide.F(l.a()).u().load(str).z1(new b(str, i10, this, imageView, i11));
    }

    private final float m(float f10) {
        Object[] objArr = {new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.e.f32104y4, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        return (f10 >= 0.0f ? 1.0f : -1.0f) * getPathInterpolator().getInterpolation(Math.max(0.0f, Math.min(1.0f, Math.abs(f10))));
    }

    private final int n(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.e.K4, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (com.max.hbcommon.utils.c.w(this.f67939n)) {
            return 0;
        }
        int i11 = i10 + 1;
        ArrayList<String> arrayList = this.f67939n;
        f0.m(arrayList);
        if (i11 >= arrayList.size()) {
            return 0;
        }
        return i11;
    }

    private final int o(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.e.L4, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (com.max.hbcommon.utils.c.w(this.f67939n)) {
            return 0;
        }
        int i11 = i10 - 1;
        if (i11 >= 0) {
            return i11;
        }
        ArrayList<String> arrayList = this.f67939n;
        f0.m(arrayList);
        return arrayList.size() - 1;
    }

    private final void p(String str, ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{str, imageView}, this, changeQuickRedirect, false, c.e.M4, new Class[]{String.class, ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            imageView.setVisibility(4);
            return;
        }
        imageView.setVisibility(0);
        HashMap<String, Bitmap> map = f67926z;
        if (map.containsKey(str)) {
            imageView.setImageBitmap(map.get(str));
            return;
        }
        File fileP = com.max.hbimage.b.p(str);
        if (fileP == null || !fileP.isFile() || !fileP.exists()) {
            l(str, this.f67940o, imageView, 0);
            return;
        }
        try {
            imageView.setImageBitmap(BitmapFactory.decodeFile(fileP.getAbsolutePath()));
        } catch (Throwable unused) {
            l(str, this.f67940o, imageView, 0);
        }
    }

    private final void setImageTranslateX(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.e.f32070w4, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = this.f67928c;
        ImageView imageView2 = null;
        if (imageView == null) {
            f0.S("centerImage");
            imageView = null;
        }
        imageView.setTranslationX(f10);
        ImageView imageView3 = this.f67930e;
        if (imageView3 == null) {
            f0.S("preImage");
            imageView3 = null;
        }
        imageView3.setTranslationX(f10);
        ImageView imageView4 = this.f67929d;
        if (imageView4 == null) {
            f0.S("nextImage");
        } else {
            imageView2 = imageView4;
        }
        imageView2.setTranslationX(f10);
    }

    private final void setImageTranslateY(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.e.f32087x4, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = this.f67928c;
        ImageView imageView2 = null;
        if (imageView == null) {
            f0.S("centerImage");
            imageView = null;
        }
        imageView.setTranslationY(f10);
        ImageView imageView3 = this.f67930e;
        if (imageView3 == null) {
            f0.S("preImage");
            imageView3 = null;
        }
        imageView3.setTranslationY(f10);
        ImageView imageView4 = this.f67929d;
        if (imageView4 == null) {
            f0.S("nextImage");
        } else {
            imageView2 = imageView4;
        }
        imageView2.setTranslationY(f10);
    }

    public final boolean getCurrentChange() {
        return this.f67942q;
    }

    public final int getCurrentIndex() {
        return this.f67940o;
    }

    @e
    public final ArrayList<String> getImageList() {
        return this.f67939n;
    }

    public final int getLastIndex() {
        return this.f67941p;
    }

    @e
    public final SensorEventListener getListener() {
        return this.f67943r;
    }

    public final boolean getSameWithGyroScope() {
        return this.f67944s;
    }

    public final int getScrollWidth() {
        return this.f67937l;
    }

    public final int getWidthExtra() {
        return this.f67938m;
    }

    public final void q() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.B4, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0060  */
    /* JADX WARN: Code duplicated, block: B:14:0x0064  */
    /* JADX WARN: Code duplicated, block: B:16:0x0068  */
    /* JADX WARN: Code duplicated, block: B:19:0x0078  */
    /* JADX WARN: Code duplicated, block: B:22:0x0088  */
    /* JADX WARN: Code duplicated, block: B:23:0x008b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x0104  */
    /* JADX WARN: Code duplicated, block: B:54:0x0108  */
    /* JADX WARN: Code duplicated, block: B:57:0x010e  */
    /* JADX WARN: Code duplicated, block: B:80:0x014f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void r(float f10, int i10, boolean z10) {
        float f11;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        int i11;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        LinearLayout linearLayout5;
        LinearLayout linearLayout6;
        int i12;
        LinearLayout linearLayout7;
        LinearLayout linearLayout8;
        if (PatchProxy.proxy(new Object[]{new Float(f10), new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.e.H4, new Class[]{Float.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ic.a aVar = ic.a.f119343a;
        Context context = getContext();
        f0.o(context, "getContext(...)");
        int iD = aVar.d(context);
        LinearLayout linearLayout9 = null;
        if (i10 == n(this.f67940o)) {
            ArrayList<String> arrayList = this.f67939n;
            if ((arrayList != null ? arrayList.size() : 0) > 2) {
                linearLayout5 = this.f67934i;
                if (linearLayout5 == null) {
                    f0.S("centerContainer");
                    linearLayout5 = null;
                }
                linearLayout5.setTranslationX((-f10) * this.f67937l);
                linearLayout6 = this.f67935j;
                if (linearLayout6 == null) {
                    f0.S("nextContainer");
                    linearLayout6 = null;
                }
                int i13 = this.f67937l;
                float f12 = i13 - (i13 * f10);
                if (this.f67945t) {
                    i12 = this.f67938m;
                } else {
                    i12 = 0;
                }
                linearLayout6.setTranslationX(f12 + i12);
                if (this.f67945t) {
                    linearLayout7 = this.f67932g;
                    if (linearLayout7 == null) {
                        f0.S("nextGrandContainer");
                        linearLayout7 = null;
                    }
                    ViewGroup.LayoutParams layoutParams = linearLayout7.getLayoutParams();
                    layoutParams.width = (int) (iD * f10);
                    linearLayout8 = this.f67932g;
                    if (linearLayout8 == null) {
                        f0.S("nextGrandContainer");
                    } else {
                        linearLayout9 = linearLayout8;
                    }
                    linearLayout9.setLayoutParams(layoutParams);
                }
                if (z10) {
                    this.f67940o = this.f67941p;
                }
            } else if (i10 == this.f67940o) {
                linearLayout5 = this.f67934i;
                if (linearLayout5 == null) {
                    f0.S("centerContainer");
                    linearLayout5 = null;
                }
                linearLayout5.setTranslationX((-f10) * this.f67937l);
                linearLayout6 = this.f67935j;
                if (linearLayout6 == null) {
                    f0.S("nextContainer");
                    linearLayout6 = null;
                }
                int i14 = this.f67937l;
                float f13 = i14 - (i14 * f10);
                if (this.f67945t) {
                    i12 = this.f67938m;
                } else {
                    i12 = 0;
                }
                linearLayout6.setTranslationX(f13 + i12);
                if (this.f67945t) {
                    linearLayout7 = this.f67932g;
                    if (linearLayout7 == null) {
                        f0.S("nextGrandContainer");
                        linearLayout7 = null;
                    }
                    ViewGroup.LayoutParams layoutParams2 = linearLayout7.getLayoutParams();
                    layoutParams2.width = (int) (iD * f10);
                    linearLayout8 = this.f67932g;
                    if (linearLayout8 == null) {
                        f0.S("nextGrandContainer");
                    } else {
                        linearLayout9 = linearLayout8;
                    }
                    linearLayout9.setLayoutParams(layoutParams2);
                }
                if (z10) {
                    this.f67940o = this.f67941p;
                }
            } else {
                f11 = 1 - f10;
                linearLayout = this.f67934i;
                if (linearLayout == null) {
                    f0.S("centerContainer");
                    linearLayout = null;
                }
                linearLayout.setTranslationX(this.f67937l * f11);
                linearLayout2 = this.f67936k;
                if (linearLayout2 == null) {
                    f0.S("preContainer");
                    linearLayout2 = null;
                }
                int i15 = this.f67937l;
                float f14 = (i15 * f11) - i15;
                if (this.f67945t) {
                    i11 = this.f67938m;
                } else {
                    i11 = 0;
                }
                linearLayout2.setTranslationX(f14 - i11);
                if (this.f67945t) {
                    linearLayout3 = this.f67933h;
                    if (linearLayout3 == null) {
                        f0.S("preGrandContainer");
                        linearLayout3 = null;
                    }
                    ViewGroup.LayoutParams layoutParams3 = linearLayout3.getLayoutParams();
                    layoutParams3.width = (int) (f11 * iD);
                    linearLayout4 = this.f67933h;
                    if (linearLayout4 == null) {
                        f0.S("preGrandContainer");
                    } else {
                        linearLayout9 = linearLayout4;
                    }
                    linearLayout9.setLayoutParams(layoutParams3);
                }
                if (z10) {
                    this.f67940o = n(this.f67941p);
                }
            }
        } else if (i10 == this.f67940o) {
            linearLayout5 = this.f67934i;
            if (linearLayout5 == null) {
                f0.S("centerContainer");
                linearLayout5 = null;
            }
            linearLayout5.setTranslationX((-f10) * this.f67937l);
            linearLayout6 = this.f67935j;
            if (linearLayout6 == null) {
                f0.S("nextContainer");
                linearLayout6 = null;
            }
            int i16 = this.f67937l;
            float f15 = i16 - (i16 * f10);
            if (this.f67945t) {
                i12 = this.f67938m;
            } else {
                i12 = 0;
            }
            linearLayout6.setTranslationX(f15 + i12);
            if (this.f67945t) {
                linearLayout7 = this.f67932g;
                if (linearLayout7 == null) {
                    f0.S("nextGrandContainer");
                    linearLayout7 = null;
                }
                ViewGroup.LayoutParams layoutParams4 = linearLayout7.getLayoutParams();
                layoutParams4.width = (int) (iD * f10);
                linearLayout8 = this.f67932g;
                if (linearLayout8 == null) {
                    f0.S("nextGrandContainer");
                } else {
                    linearLayout9 = linearLayout8;
                }
                linearLayout9.setLayoutParams(layoutParams4);
            }
            if (z10) {
                this.f67940o = this.f67941p;
            }
        } else {
            f11 = 1 - f10;
            linearLayout = this.f67934i;
            if (linearLayout == null) {
                f0.S("centerContainer");
                linearLayout = null;
            }
            linearLayout.setTranslationX(this.f67937l * f11);
            linearLayout2 = this.f67936k;
            if (linearLayout2 == null) {
                f0.S("preContainer");
                linearLayout2 = null;
            }
            int i17 = this.f67937l;
            float f16 = (i17 * f11) - i17;
            if (this.f67945t) {
                i11 = this.f67938m;
            } else {
                i11 = 0;
            }
            linearLayout2.setTranslationX(f16 - i11);
            if (this.f67945t) {
                linearLayout3 = this.f67933h;
                if (linearLayout3 == null) {
                    f0.S("preGrandContainer");
                    linearLayout3 = null;
                }
                ViewGroup.LayoutParams layoutParams5 = linearLayout3.getLayoutParams();
                layoutParams5.width = (int) (f11 * iD);
                linearLayout4 = this.f67933h;
                if (linearLayout4 == null) {
                    f0.S("preGrandContainer");
                } else {
                    linearLayout9 = linearLayout4;
                }
                linearLayout9.setLayoutParams(layoutParams5);
            }
            if (z10) {
                this.f67940o = n(this.f67941p);
            }
        }
        if (z10) {
            if ((f10 == 1.0f) == true) {
                v(n(this.f67940o));
            } else {
                if (f10 == 0.0f) {
                    v(o(this.f67940o));
                }
            }
        } else {
            if ((f10 == 1.0f) == true) {
                v(this.f67940o);
            } else {
                if (f10 == 0.0f) {
                    v(this.f67940o);
                }
            }
        }
        this.f67941p = i10;
    }

    public final void s() {
        int i10;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.I4, new Class[0], Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(this.f67939n) || (i10 = this.f67940o) < 0) {
            return;
        }
        ArrayList<String> arrayList = this.f67939n;
        f0.m(arrayList);
        if (i10 < arrayList.size()) {
            ArrayList<String> arrayList2 = this.f67939n;
            f0.m(arrayList2);
            String str = arrayList2.get(this.f67940o);
            ImageView imageView = this.f67928c;
            ImageView imageView2 = null;
            if (imageView == null) {
                f0.S("centerImage");
                imageView = null;
            }
            p(str, imageView);
            ArrayList<String> arrayList3 = this.f67939n;
            f0.m(arrayList3);
            String str2 = arrayList3.get(n(this.f67940o));
            ImageView imageView3 = this.f67929d;
            if (imageView3 == null) {
                f0.S("nextImage");
                imageView3 = null;
            }
            p(str2, imageView3);
            ArrayList<String> arrayList4 = this.f67939n;
            f0.m(arrayList4);
            String str3 = arrayList4.get(o(this.f67940o));
            ImageView imageView4 = this.f67930e;
            if (imageView4 == null) {
                f0.S("preImage");
            } else {
                imageView2 = imageView4;
            }
            p(str3, imageView2);
        }
    }

    public final void setCurrentChange(boolean z10) {
        this.f67942q = z10;
    }

    public final void setCurrentIndex(int i10) {
        this.f67940o = i10;
    }

    public final void setImageList(@e ArrayList<String> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, c.e.f32036u4, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f67939n = arrayList;
        v(0);
    }

    public final void setLastIndex(int i10) {
        this.f67941p = i10;
    }

    public final void setLayoutWidthHeight(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.e.P4, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = this.f67928c;
        LinearLayout linearLayout = null;
        if (imageView == null) {
            f0.S("centerImage");
            imageView = null;
        }
        imageView.getLayoutParams().width = i10;
        ImageView imageView2 = this.f67928c;
        if (imageView2 == null) {
            f0.S("centerImage");
            imageView2 = null;
        }
        imageView2.getLayoutParams().height = i11;
        ImageView imageView3 = this.f67929d;
        if (imageView3 == null) {
            f0.S("nextImage");
            imageView3 = null;
        }
        imageView3.getLayoutParams().width = i10;
        ImageView imageView4 = this.f67929d;
        if (imageView4 == null) {
            f0.S("nextImage");
            imageView4 = null;
        }
        imageView4.getLayoutParams().height = i11;
        ImageView imageView5 = this.f67930e;
        if (imageView5 == null) {
            f0.S("preImage");
            imageView5 = null;
        }
        imageView5.getLayoutParams().width = i10;
        ImageView imageView6 = this.f67930e;
        if (imageView6 == null) {
            f0.S("preImage");
            imageView6 = null;
        }
        imageView6.getLayoutParams().height = i11;
        LinearLayout linearLayout2 = this.f67934i;
        if (linearLayout2 == null) {
            f0.S("centerContainer");
            linearLayout2 = null;
        }
        linearLayout2.getLayoutParams().width = i10;
        LinearLayout linearLayout3 = this.f67935j;
        if (linearLayout3 == null) {
            f0.S("nextContainer");
            linearLayout3 = null;
        }
        linearLayout3.getLayoutParams().width = i10;
        LinearLayout linearLayout4 = this.f67936k;
        if (linearLayout4 == null) {
            f0.S("preContainer");
        } else {
            linearLayout = linearLayout4;
        }
        linearLayout.getLayoutParams().width = i10;
    }

    public final void setListener(@e SensorEventListener sensorEventListener) {
        this.f67943r = sensorEventListener;
    }

    public final void setSameWithGyroScope(boolean z10) {
        this.f67944s = z10;
    }

    public final void setScrollWidth(int i10) {
        this.f67937l = i10;
    }

    public final void setWidthExtra(int i10) {
        this.f67938m = i10;
    }

    public final void t() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.f32121z4, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        if (context == null) {
            g.f74531b.v("[TripleBannerDecorationView][registerListener] context is invalid: null");
            return;
        }
        Object systemService = context.getSystemService(ak.f104420ac);
        SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
        if (sensorManager != null) {
            sensorManager.registerListener(this.f67943r, sensorManager.getDefaultSensor(9), 1);
        }
    }

    public final void u() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.N4, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = this.f67934i;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            f0.S("centerContainer");
            linearLayout = null;
        }
        linearLayout.setTranslationX(0.0f);
        LinearLayout linearLayout3 = this.f67935j;
        if (linearLayout3 == null) {
            f0.S("nextContainer");
            linearLayout3 = null;
        }
        linearLayout3.setTranslationX(this.f67937l);
        LinearLayout linearLayout4 = this.f67936k;
        if (linearLayout4 == null) {
            f0.S("preContainer");
            linearLayout4 = null;
        }
        linearLayout4.setTranslationX(-this.f67937l);
        if (this.f67945t) {
            LinearLayout linearLayout5 = this.f67932g;
            if (linearLayout5 == null) {
                f0.S("nextGrandContainer");
                linearLayout5 = null;
            }
            linearLayout5.getLayoutParams().width = 0;
            LinearLayout linearLayout6 = this.f67933h;
            if (linearLayout6 == null) {
                f0.S("preGrandContainer");
            } else {
                linearLayout2 = linearLayout6;
            }
            linearLayout2.getLayoutParams().width = 0;
        }
    }

    public final void v(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.e.J4, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67940o = i10;
        if (com.max.hbcommon.utils.c.w(this.f67939n)) {
            setVisibility(4);
            return;
        }
        try {
            setVisibility(0);
            this.f67940o = i10;
            s();
            u();
        } catch (Throwable unused) {
        }
    }

    public final void w() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.A4, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        if (context == null) {
            g.f74531b.v("[TripleBannerDecorationView][unregisterListener] context is invalid: null");
            return;
        }
        Object systemService = context.getSystemService(ak.f104420ac);
        SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f67943r);
        }
    }
}
