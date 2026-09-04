package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.k0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u0;
import androidx.annotation.w0;
import androidx.annotation.x;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.j1;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import org.apache.tools.ant.types.selectors.m0;

/* JADX INFO: loaded from: classes6.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f37038u = LottieAnimationView.class.getSimpleName();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final l<Throwable> f37039v = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<com.airbnb.lottie.g> f37040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l<Throwable> f37041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private l<Throwable> f37042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.v
    private int f37043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j f37044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f37045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f37046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @u0
    private int f37047i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f37048j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f37049k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f37050l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f37051m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f37052n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f37053o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private RenderMode f37054p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Set<n> f37055q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f37056r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private q<com.airbnb.lottie.g> f37057s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.g f37058t;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f37059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f37060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f37061d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f37062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f37063f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f37064g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f37065h;

        public class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f37059b = parcel.readString();
            this.f37061d = parcel.readFloat();
            this.f37062e = parcel.readInt() == 1;
            this.f37063f = parcel.readString();
            this.f37064g = parcel.readInt();
            this.f37065h = parcel.readInt();
        }

        /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f37059b);
            parcel.writeFloat(this.f37061d);
            parcel.writeInt(this.f37062e ? 1 : 0);
            parcel.writeString(this.f37063f);
            parcel.writeInt(this.f37064g);
            parcel.writeInt(this.f37065h);
        }
    }

    public class a implements l<Throwable> {
        a() {
        }

        @Override // com.airbnb.lottie.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th2) {
            if (!com.airbnb.lottie.utils.j.k(th2)) {
                throw new IllegalStateException("Unable to parse composition", th2);
            }
            com.airbnb.lottie.utils.f.f("Unable to load composition.", th2);
        }
    }

    public class b implements l<com.airbnb.lottie.g> {
        b() {
        }

        @Override // com.airbnb.lottie.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(com.airbnb.lottie.g gVar) {
            LottieAnimationView.this.setComposition(gVar);
        }
    }

    public class c implements l<Throwable> {
        c() {
        }

        @Override // com.airbnb.lottie.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th2) {
            if (LottieAnimationView.this.f37043e != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f37043e);
            }
            (LottieAnimationView.this.f37042d == null ? LottieAnimationView.f37039v : LottieAnimationView.this.f37042d).onResult(th2);
        }
    }

    public class d implements Callable<p<com.airbnb.lottie.g>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37068b;

        d(int i10) {
            this.f37068b = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<com.airbnb.lottie.g> call() {
            return LottieAnimationView.this.f37053o ? h.u(LottieAnimationView.this.getContext(), this.f37068b) : h.v(LottieAnimationView.this.getContext(), this.f37068b, null);
        }
    }

    public class e implements Callable<p<com.airbnb.lottie.g>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37070b;

        e(String str) {
            this.f37070b = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<com.airbnb.lottie.g> call() {
            return LottieAnimationView.this.f37053o ? h.g(LottieAnimationView.this.getContext(), this.f37070b) : h.h(LottieAnimationView.this.getContext(), this.f37070b, null);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class f<T> extends com.airbnb.lottie.value.j<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.l f37072d;

        f(com.airbnb.lottie.value.l lVar) {
            this.f37072d = lVar;
        }

        @Override // com.airbnb.lottie.value.j
        public T a(com.airbnb.lottie.value.b<T> bVar) {
            return (T) this.f37072d.a(bVar);
        }
    }

    public static /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37074a;

        static {
            int[] iArr = new int[RenderMode.values().length];
            f37074a = iArr;
            try {
                iArr[RenderMode.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37074a[RenderMode.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37074a[RenderMode.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f37040b = new b();
        this.f37041c = new c();
        this.f37043e = 0;
        this.f37044f = new j();
        this.f37048j = false;
        this.f37049k = false;
        this.f37050l = false;
        this.f37051m = false;
        this.f37052n = false;
        this.f37053o = true;
        this.f37054p = RenderMode.AUTOMATIC;
        this.f37055q = new HashSet();
        this.f37056r = 0;
        z(null, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37040b = new b();
        this.f37041c = new c();
        this.f37043e = 0;
        this.f37044f = new j();
        this.f37048j = false;
        this.f37049k = false;
        this.f37050l = false;
        this.f37051m = false;
        this.f37052n = false;
        this.f37053o = true;
        this.f37054p = RenderMode.AUTOMATIC;
        this.f37055q = new HashSet();
        this.f37056r = 0;
        z(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f37040b = new b();
        this.f37041c = new c();
        this.f37043e = 0;
        this.f37044f = new j();
        this.f37048j = false;
        this.f37049k = false;
        this.f37050l = false;
        this.f37051m = false;
        this.f37052n = false;
        this.f37053o = true;
        this.f37054p = RenderMode.AUTOMATIC;
        this.f37055q = new HashSet();
        this.f37056r = 0;
        z(attributeSet, i10);
    }

    private void P() {
        boolean zA = A();
        setImageDrawable(null);
        setImageDrawable(this.f37044f);
        if (zA) {
            this.f37044f.e0();
        }
    }

    private void q() {
        q<com.airbnb.lottie.g> qVar = this.f37057s;
        if (qVar != null) {
            qVar.k(this.f37040b);
            this.f37057s.j(this.f37041c);
        }
    }

    private void r() {
        this.f37058t = null;
        this.f37044f.o();
    }

    private void setCompositionTask(q<com.airbnb.lottie.g> qVar) {
        r();
        q();
        this.f37057s = qVar.f(this.f37040b).e(this.f37041c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private void u() {
        com.airbnb.lottie.g gVar;
        int i10;
        int i11 = g.f37074a[this.f37054p.ordinal()];
        int i12 = 2;
        if (i11 != 1) {
            if (i11 == 2 || i11 != 3) {
                i12 = 1;
            } else {
                com.airbnb.lottie.g gVar2 = this.f37058t;
                boolean z10 = false;
                if ((gVar2 == null || !gVar2.t() || Build.VERSION.SDK_INT >= 28) && (((gVar = this.f37058t) == null || gVar.n() <= 4) && (i10 = Build.VERSION.SDK_INT) != 24 && i10 != 25)) {
                    z10 = true;
                }
                if (!z10) {
                    i12 = 1;
                }
            }
        }
        if (i12 != getLayerType()) {
            setLayerType(i12, null);
        }
    }

    private q<com.airbnb.lottie.g> v(String str) {
        if (isInEditMode()) {
            return new q<>(new e(str), true);
        }
        return this.f37053o ? h.e(getContext(), str) : h.f(getContext(), str, null);
    }

    private q<com.airbnb.lottie.g> w(@u0 int i10) {
        if (isInEditMode()) {
            return new q<>(new d(i10), true);
        }
        return this.f37053o ? h.s(getContext(), i10) : h.t(getContext(), i10, null);
    }

    private void z(@p0 AttributeSet attributeSet, @androidx.annotation.f int i10) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.C, i10, 0);
        this.f37053o = typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_cacheComposition, true);
        int i11 = R.styleable.LottieAnimationView_lottie_rawRes;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i11);
        int i12 = R.styleable.LottieAnimationView_lottie_fileName;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i12);
        int i13 = R.styleable.LottieAnimationView_lottie_url;
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(i13);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(i11, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(i12);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(i13)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(R.styleable.LottieAnimationView_lottie_fallbackRes, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_autoPlay, false)) {
            this.f37050l = true;
            this.f37052n = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_loop, false)) {
            this.f37044f.A0(-1);
        }
        int i14 = R.styleable.LottieAnimationView_lottie_repeatMode;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(i14, 1));
        }
        int i15 = R.styleable.LottieAnimationView_lottie_repeatCount;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(i15, -1));
        }
        int i16 = R.styleable.LottieAnimationView_lottie_speed;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(i16, 1.0f));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(R.styleable.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(typedArrayObtainStyledAttributes.getFloat(R.styleable.LottieAnimationView_lottie_progress, 0.0f));
        t(typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        int i17 = R.styleable.LottieAnimationView_lottie_colorFilter;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            n(new com.airbnb.lottie.model.d(m0.f136554a), o.K, new com.airbnb.lottie.value.j(new u(b0.a.a(getContext(), typedArrayObtainStyledAttributes.getResourceId(i17, -1)).getDefaultColor())));
        }
        int i18 = R.styleable.LottieAnimationView_lottie_scale;
        if (typedArrayObtainStyledAttributes.hasValue(i18)) {
            this.f37044f.D0(typedArrayObtainStyledAttributes.getFloat(i18, 1.0f));
        }
        int i19 = R.styleable.LottieAnimationView_lottie_renderMode;
        if (typedArrayObtainStyledAttributes.hasValue(i19)) {
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i19, renderMode.ordinal());
            if (iOrdinal >= RenderMode.values().length) {
                iOrdinal = renderMode.ordinal();
            }
            setRenderMode(RenderMode.values()[iOrdinal]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f37044f.F0(Boolean.valueOf(com.airbnb.lottie.utils.j.f(getContext()) != 0.0f));
        u();
        this.f37045g = true;
    }

    public boolean A() {
        return this.f37044f.R();
    }

    public boolean B() {
        return this.f37044f.U();
    }

    @Deprecated
    public void C(boolean z10) {
        this.f37044f.A0(z10 ? -1 : 0);
    }

    @k0
    public void D() {
        this.f37052n = false;
        this.f37050l = false;
        this.f37049k = false;
        this.f37048j = false;
        this.f37044f.W();
        u();
    }

    @k0
    public void E() {
        if (!isShown()) {
            this.f37048j = true;
        } else {
            this.f37044f.X();
            u();
        }
    }

    public void F() {
        this.f37044f.Y();
    }

    public void G() {
        this.f37055q.clear();
    }

    public void H() {
        this.f37044f.Z();
    }

    public void I(Animator.AnimatorListener animatorListener) {
        this.f37044f.a0(animatorListener);
    }

    @w0(api = 19)
    public void J(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f37044f.b0(animatorPauseListener);
    }

    public boolean K(@n0 n nVar) {
        return this.f37055q.remove(nVar);
    }

    public void L(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f37044f.c0(animatorUpdateListener);
    }

    public List<com.airbnb.lottie.model.d> M(com.airbnb.lottie.model.d dVar) {
        return this.f37044f.d0(dVar);
    }

    @k0
    public void N() {
        if (isShown()) {
            this.f37044f.e0();
            u();
        } else {
            this.f37048j = false;
            this.f37049k = true;
        }
    }

    public void O() {
        this.f37044f.f0();
    }

    @p0
    public Bitmap Q(String str, @p0 Bitmap bitmap) {
        return this.f37044f.H0(str, bitmap);
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z10) {
        com.airbnb.lottie.e.a("buildDrawingCache");
        this.f37056r++;
        super.buildDrawingCache(z10);
        if (this.f37056r == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z10) == null) {
            setRenderMode(RenderMode.HARDWARE);
        }
        this.f37056r--;
        com.airbnb.lottie.e.b("buildDrawingCache");
    }

    @p0
    public com.airbnb.lottie.g getComposition() {
        return this.f37058t;
    }

    public long getDuration() {
        com.airbnb.lottie.g gVar = this.f37058t;
        if (gVar != null) {
            return (long) gVar.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f37044f.A();
    }

    @p0
    public String getImageAssetsFolder() {
        return this.f37044f.D();
    }

    public float getMaxFrame() {
        return this.f37044f.E();
    }

    public float getMinFrame() {
        return this.f37044f.G();
    }

    @p0
    public t getPerformanceTracker() {
        return this.f37044f.H();
    }

    @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
    public float getProgress() {
        return this.f37044f.I();
    }

    public int getRepeatCount() {
        return this.f37044f.J();
    }

    public int getRepeatMode() {
        return this.f37044f.K();
    }

    public float getScale() {
        return this.f37044f.L();
    }

    public float getSpeed() {
        return this.f37044f.M();
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@n0 Drawable drawable) {
        Drawable drawable2 = getDrawable();
        j jVar = this.f37044f;
        if (drawable2 == jVar) {
            super.invalidateDrawable(jVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void j(Animator.AnimatorListener animatorListener) {
        this.f37044f.e(animatorListener);
    }

    @w0(api = 19)
    public void k(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f37044f.f(animatorPauseListener);
    }

    public void l(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f37044f.g(animatorUpdateListener);
    }

    public boolean m(@n0 n nVar) {
        com.airbnb.lottie.g gVar = this.f37058t;
        if (gVar != null) {
            nVar.a(gVar);
        }
        return this.f37055q.add(nVar);
    }

    public <T> void n(com.airbnb.lottie.model.d dVar, T t10, com.airbnb.lottie.value.j<T> jVar) {
        this.f37044f.h(dVar, t10, jVar);
    }

    public <T> void o(com.airbnb.lottie.model.d dVar, T t10, com.airbnb.lottie.value.l<T> lVar) {
        this.f37044f.h(dVar, t10, new f(lVar));
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        if (this.f37052n || this.f37050l) {
            E();
            this.f37052n = false;
            this.f37050l = false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        if (A()) {
            p();
            this.f37050l = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.f37059b;
        this.f37046h = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f37046h);
        }
        int i10 = savedState.f37060c;
        this.f37047i = i10;
        if (i10 != 0) {
            setAnimation(i10);
        }
        setProgress(savedState.f37061d);
        if (savedState.f37062e) {
            E();
        }
        this.f37044f.m0(savedState.f37063f);
        setRepeatMode(savedState.f37064g);
        setRepeatCount(savedState.f37065h);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f37059b = this.f37046h;
        savedState.f37060c = this.f37047i;
        savedState.f37061d = this.f37044f.I();
        savedState.f37062e = this.f37044f.R() || (!j1.O0(this) && this.f37050l);
        savedState.f37063f = this.f37044f.D();
        savedState.f37064g = this.f37044f.K();
        savedState.f37065h = this.f37044f.J();
        return savedState;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@n0 View view, int i10) {
        if (this.f37045g) {
            if (!isShown()) {
                if (A()) {
                    D();
                    this.f37049k = true;
                    return;
                }
                return;
            }
            if (this.f37049k) {
                N();
            } else if (this.f37048j) {
                E();
            }
            this.f37049k = false;
            this.f37048j = false;
        }
    }

    @k0
    public void p() {
        this.f37050l = false;
        this.f37049k = false;
        this.f37048j = false;
        this.f37044f.n();
        u();
    }

    public void s() {
        this.f37044f.p();
    }

    public void setAnimation(@u0 int i10) {
        this.f37047i = i10;
        this.f37046h = null;
        setCompositionTask(w(i10));
    }

    public void setAnimation(InputStream inputStream, @p0 String str) {
        setCompositionTask(h.j(inputStream, str));
    }

    public void setAnimation(String str) {
        this.f37046h = str;
        this.f37047i = 0;
        setCompositionTask(v(str));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromJson(String str, @p0 String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f37053o ? h.w(getContext(), str) : h.x(getContext(), str, null));
    }

    public void setAnimationFromUrl(String str, @p0 String str2) {
        setCompositionTask(h.x(getContext(), str, str2));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f37044f.g0(z10);
    }

    public void setCacheComposition(boolean z10) {
        this.f37053o = z10;
    }

    public void setComposition(@n0 com.airbnb.lottie.g gVar) {
        if (com.airbnb.lottie.e.f37311a) {
            Log.v(f37038u, "Set Composition \n" + gVar);
        }
        this.f37044f.setCallback(this);
        this.f37058t = gVar;
        this.f37051m = true;
        boolean zH0 = this.f37044f.h0(gVar);
        this.f37051m = false;
        u();
        if (getDrawable() != this.f37044f || zH0) {
            if (!zH0) {
                P();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<n> it = this.f37055q.iterator();
            while (it.hasNext()) {
                it.next().a(gVar);
            }
        }
    }

    public void setFailureListener(@p0 l<Throwable> lVar) {
        this.f37042d = lVar;
    }

    public void setFallbackResource(@androidx.annotation.v int i10) {
        this.f37043e = i10;
    }

    public void setFontAssetDelegate(com.airbnb.lottie.c cVar) {
        this.f37044f.i0(cVar);
    }

    public void setFrame(int i10) {
        this.f37044f.j0(i10);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f37044f.k0(z10);
    }

    public void setImageAssetDelegate(com.airbnb.lottie.d dVar) {
        this.f37044f.l0(dVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f37044f.m0(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        q();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        q();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        q();
        super.setImageResource(i10);
    }

    public void setMaxFrame(int i10) {
        this.f37044f.n0(i10);
    }

    public void setMaxFrame(String str) {
        this.f37044f.o0(str);
    }

    public void setMaxProgress(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        this.f37044f.p0(f10);
    }

    public void setMinAndMaxFrame(int i10, int i11) {
        this.f37044f.q0(i10, i11);
    }

    public void setMinAndMaxFrame(String str) {
        this.f37044f.r0(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z10) {
        this.f37044f.s0(str, str2, z10);
    }

    public void setMinAndMaxProgress(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f11) {
        this.f37044f.t0(f10, f11);
    }

    public void setMinFrame(int i10) {
        this.f37044f.u0(i10);
    }

    public void setMinFrame(String str) {
        this.f37044f.v0(str);
    }

    public void setMinProgress(float f10) {
        this.f37044f.w0(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.f37044f.x0(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f37044f.y0(z10);
    }

    public void setProgress(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        this.f37044f.z0(f10);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.f37054p = renderMode;
        u();
    }

    public void setRepeatCount(int i10) {
        this.f37044f.A0(i10);
    }

    public void setRepeatMode(int i10) {
        this.f37044f.B0(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f37044f.C0(z10);
    }

    public void setScale(float f10) {
        this.f37044f.D0(f10);
        if (getDrawable() == this.f37044f) {
            P();
        }
    }

    public void setSpeed(float f10) {
        this.f37044f.E0(f10);
    }

    public void setTextDelegate(v vVar) {
        this.f37044f.G0(vVar);
    }

    public void t(boolean z10) {
        this.f37044f.u(z10);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        j jVar;
        if (!this.f37051m && drawable == (jVar = this.f37044f) && jVar.R()) {
            D();
        } else if (!this.f37051m && (drawable instanceof j)) {
            j jVar2 = (j) drawable;
            if (jVar2.R()) {
                jVar2.W();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public boolean x() {
        return this.f37044f.P();
    }

    public boolean y() {
        return this.f37044f.Q();
    }
}
