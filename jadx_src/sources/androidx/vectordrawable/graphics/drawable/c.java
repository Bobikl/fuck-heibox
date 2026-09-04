package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.core.content.res.q;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
/* JADX INFO: loaded from: classes6.dex */
public class c extends h implements androidx.vectordrawable.graphics.drawable.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f28041j = "AnimatedVDCompat";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f28042k = "animated-vector";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f28043l = "target";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final boolean f28044m = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0224c f28045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f28046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArgbEvaluator f28047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    d f28048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Animator.AnimatorListener f28049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ArrayList<androidx.vectordrawable.graphics.drawable.b.a> f28050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Drawable.Callback f28051i;

    /* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
    public class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            c.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f28050h);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b.a) arrayList.get(i10)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f28050h);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b.a) arrayList.get(i10)).c(c.this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
    public static class C0224c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        i f28055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        AnimatorSet f28056c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList<Animator> f28057d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.collection.a<Animator, String> f28058e;

        public C0224c(Context context, C0224c c0224c, Drawable.Callback callback, Resources resources) {
            if (c0224c != null) {
                this.f28054a = c0224c.f28054a;
                i iVar = c0224c.f28055b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    if (resources != null) {
                        this.f28055b = (i) constantState.newDrawable(resources);
                    } else {
                        this.f28055b = (i) constantState.newDrawable();
                    }
                    i iVar2 = (i) this.f28055b.mutate();
                    this.f28055b = iVar2;
                    iVar2.setCallback(callback);
                    this.f28055b.setBounds(c0224c.f28055b.getBounds());
                    this.f28055b.l(false);
                }
                ArrayList<Animator> arrayList = c0224c.f28057d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f28057d = new ArrayList<>(size);
                    this.f28058e = new androidx.collection.a<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = c0224c.f28057d.get(i10);
                        Animator animatorClone = animator.clone();
                        String str = c0224c.f28058e.get(animator);
                        animatorClone.setTarget(this.f28055b.g(str));
                        this.f28057d.add(animatorClone);
                        this.f28058e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f28056c == null) {
                this.f28056c = new AnimatorSet();
            }
            this.f28056c.playTogether(this.f28057d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f28054a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
    @w0(24)
    public static class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f28059a;

        public d(Drawable.ConstantState constantState) {
            this.f28059a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f28059a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f28059a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f28059a.newDrawable();
            cVar.f28076b = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f28051i);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f28059a.newDrawable(resources);
            cVar.f28076b = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f28051i);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f28059a.newDrawable(resources, theme);
            cVar.f28076b = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f28051i);
            return cVar;
        }
    }

    c() {
        this(null, null, null);
    }

    private c(@p0 Context context) {
        this(context, null, null);
    }

    private c(@p0 Context context, @p0 C0224c c0224c, @p0 Resources resources) {
        this.f28047e = null;
        this.f28049g = null;
        this.f28050h = null;
        a aVar = new a();
        this.f28051i = aVar;
        this.f28046d = context;
        if (c0224c != null) {
            this.f28045c = c0224c;
        } else {
            this.f28045c = new C0224c(context, c0224c, aVar, resources);
        }
    }

    public static void a(Drawable drawable) {
        if (drawable instanceof Animatable) {
            if (Build.VERSION.SDK_INT >= 24) {
                ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            } else {
                ((c) drawable).clearAnimationCallbacks();
            }
        }
    }

    @p0
    public static c d(@n0 Context context, @v int i10) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            c cVar = new c(context);
            Drawable drawableG = androidx.core.content.res.i.g(context.getResources(), i10, context.getTheme());
            cVar.f28076b = drawableG;
            drawableG.setCallback(cVar.f28051i);
            cVar.f28048f = new d(cVar.f28076b.getConstantState());
            return cVar;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i10);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return e(context, context.getResources(), xml, attributeSetAsAttributeSet, context.getTheme());
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e10) {
            Log.e(f28041j, "parser error", e10);
            return null;
        } catch (XmlPullParserException e11) {
            Log.e(f28041j, "parser error", e11);
            return null;
        }
    }

    public static c e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        c cVar = new c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    public static void f(Drawable drawable, androidx.vectordrawable.graphics.drawable.b.a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            g((AnimatedVectorDrawable) drawable, aVar);
        } else {
            ((c) drawable).c(aVar);
        }
    }

    @w0(23)
    private static void g(@n0 AnimatedVectorDrawable animatedVectorDrawable, @n0 androidx.vectordrawable.graphics.drawable.b.a aVar) {
        animatedVectorDrawable.registerAnimationCallback(aVar.a());
    }

    private void h() {
        Animator.AnimatorListener animatorListener = this.f28049g;
        if (animatorListener != null) {
            this.f28045c.f28056c.removeListener(animatorListener);
            this.f28049g = null;
        }
    }

    private void i(String str, Animator animator) {
        animator.setTarget(this.f28045c.f28055b.g(str));
        C0224c c0224c = this.f28045c;
        if (c0224c.f28057d == null) {
            c0224c.f28057d = new ArrayList<>();
            this.f28045c.f28058e = new androidx.collection.a<>();
        }
        this.f28045c.f28057d.add(animator);
        this.f28045c.f28058e.put(animator, str);
    }

    private void j(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i10 = 0; i10 < childAnimations.size(); i10++) {
                j(childAnimations.get(i10));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f28047e == null) {
                    this.f28047e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f28047e);
            }
        }
    }

    public static boolean k(Drawable drawable, androidx.vectordrawable.graphics.drawable.b.a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 24 ? l((AnimatedVectorDrawable) drawable, aVar) : ((c) drawable).b(aVar);
    }

    @w0(23)
    private static boolean l(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b.a aVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(aVar.a());
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.a(drawable, theme);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public boolean b(@n0 androidx.vectordrawable.graphics.drawable.b.a aVar) {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            l((AnimatedVectorDrawable) drawable, aVar);
        }
        ArrayList<androidx.vectordrawable.graphics.drawable.b.a> arrayList = this.f28050h;
        if (arrayList == null || aVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(aVar);
        if (this.f28050h.size() == 0) {
            h();
        }
        return zRemove;
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void c(@n0 androidx.vectordrawable.graphics.drawable.b.a aVar) {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, aVar);
            return;
        }
        if (aVar == null) {
            return;
        }
        if (this.f28050h == null) {
            this.f28050h = new ArrayList<>();
        }
        if (this.f28050h.contains(aVar)) {
            return;
        }
        this.f28050h.add(aVar);
        if (this.f28049g == null) {
            this.f28049g = new b();
        }
        this.f28045c.f28056c.addListener(this.f28049g);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.d.b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void clearAnimationCallbacks() {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        h();
        ArrayList<androidx.vectordrawable.graphics.drawable.b.a> arrayList = this.f28050h;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f28045c.f28055b.draw(canvas);
        if (this.f28045c.f28056c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f28076b;
        return drawable != null ? androidx.core.graphics.drawable.d.d(drawable) : this.f28045c.f28055b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f28076b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f28045c.f28054a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f28076b;
        return drawable != null ? androidx.core.graphics.drawable.d.e(drawable) : this.f28045c.f28055b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f28076b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.f28076b.getConstantState());
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f28076b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f28045c.f28055b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f28076b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f28045c.f28055b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f28076b;
        return drawable != null ? drawable.getOpacity() : this.f28045c.f28055b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (f28042k.equals(name)) {
                    TypedArray typedArrayS = q.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.M);
                    int resourceId = typedArrayS.getResourceId(0, 0);
                    if (resourceId != 0) {
                        i iVarD = i.d(resources, resourceId, theme);
                        iVarD.l(false);
                        iVarD.setCallback(this.f28051i);
                        i iVar = this.f28045c.f28055b;
                        if (iVar != null) {
                            iVar.setCallback(null);
                        }
                        this.f28045c.f28055b = iVarD;
                    }
                    typedArrayS.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.O);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f28046d;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        i(string, e.j(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f28045c.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f28076b;
        return drawable != null ? androidx.core.graphics.drawable.d.h(drawable) : this.f28045c.f28055b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f28076b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f28045c.f28056c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f28076b;
        return drawable != null ? drawable.isStateful() : this.f28045c.f28055b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f28045c.f28055b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f28076b;
        return drawable != null ? drawable.setLevel(i10) : this.f28045c.f28055b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f28076b;
        return drawable != null ? drawable.setState(iArr) : this.f28045c.f28055b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f28045c.f28055b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.j(drawable, z10);
        } else {
            this.f28045c.f28055b.setAutoMirrored(z10);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f28045c.f28055b.setColorFilter(colorFilter);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTint(int i10) {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.n(drawable, i10);
        } else {
            this.f28045c.f28055b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.o(drawable, colorStateList);
        } else {
            this.f28045c.f28055b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.p(drawable, mode);
        } else {
            this.f28045c.f28055b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f28045c.f28055b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f28045c.f28056c.isStarted()) {
                return;
            }
            this.f28045c.f28056c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f28076b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f28045c.f28056c.end();
        }
    }
}
