package com.transitionseverywhere;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.RectEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.Property;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.transition.Transition;
import androidx.transition.z;
import java.util.Map;

/* JADX INFO: compiled from: Crossfade.java */
/* JADX INFO: loaded from: classes4.dex */
@TargetApi(18)
public class c extends Transition {
    private static final String Y = "Crossfade";
    private static final String Z = "android:crossfade:bitmap";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f104018a0 = "android:crossfade:drawable";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f104019b0 = "android:crossfade:bounds";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static RectEvaluator f104020c0 = null;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f104021p1 = 0;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f104022p2 = 0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final int f104023x1 = 1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f104024x2 = 1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final int f104025y1 = 2;
    private int W = 1;
    private int X = 1;

    /* JADX INFO: compiled from: Crossfade.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f104026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f104027c;

        a(View view, BitmapDrawable bitmapDrawable) {
            this.f104026b = view;
            this.f104027c = bitmapDrawable;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f104026b.invalidate(this.f104027c.getBounds());
        }
    }

    /* JADX INFO: compiled from: Crossfade.java */
    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f104029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f104030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f104031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f104032e;

        b(boolean z10, View view, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
            this.f104029b = z10;
            this.f104030c = view;
            this.f104031d = bitmapDrawable;
            this.f104032e = bitmapDrawable2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewOverlay overlay = this.f104029b ? ((ViewGroup) this.f104030c.getParent()).getOverlay() : this.f104030c.getOverlay();
            overlay.remove(this.f104031d);
            if (c.this.W == 1) {
                overlay.remove(this.f104032e);
            }
        }
    }

    private void J0(@n0 z zVar) {
        View view = zVar.f27974b;
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
        if (this.W != 1) {
            rect.offset(view.getLeft(), view.getTop());
        }
        zVar.f27973a.put(f104019b0, rect);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        if (view instanceof TextureView) {
            bitmapCreateBitmap = ((TextureView) view).getBitmap();
        } else {
            view.draw(new Canvas(bitmapCreateBitmap));
        }
        zVar.f27973a.put(Z, bitmapCreateBitmap);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(view.getResources(), bitmapCreateBitmap);
        bitmapDrawable.setBounds(rect);
        zVar.f27973a.put(f104018a0, bitmapDrawable);
    }

    public int K0() {
        return this.W;
    }

    public int L0() {
        return this.X;
    }

    @n0
    public c M0(int i10) {
        if (i10 >= 0 && i10 <= 2) {
            this.W = i10;
        }
        return this;
    }

    @n0
    public c N0(int i10) {
        if (i10 >= 0 && i10 <= 1) {
            this.X = i10;
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public void j(@n0 z zVar) {
        J0(zVar);
    }

    @Override // androidx.transition.Transition
    public void m(@n0 z zVar) {
        J0(zVar);
    }

    @Override // androidx.transition.Transition
    @p0
    public Animator q(@n0 ViewGroup viewGroup, @p0 z zVar, @p0 z zVar2) {
        ObjectAnimator objectAnimatorOfFloat = null;
        if (zVar != null && zVar2 != null) {
            if (f104020c0 == null) {
                f104020c0 = new RectEvaluator();
            }
            boolean z10 = this.W != 1;
            View view = zVar2.f27974b;
            Map<String, Object> map = zVar.f27973a;
            Map<String, Object> map2 = zVar2.f27973a;
            Rect rect = (Rect) map.get(f104019b0);
            Rect rect2 = (Rect) map2.get(f104019b0);
            if (rect != null && rect2 != null) {
                Bitmap bitmap = (Bitmap) map.get(Z);
                Bitmap bitmap2 = (Bitmap) map2.get(Z);
                BitmapDrawable bitmapDrawable = (BitmapDrawable) map.get(f104018a0);
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) map2.get(f104018a0);
                if (bitmapDrawable != null && bitmapDrawable2 != null && !bitmap.sameAs(bitmap2)) {
                    ViewOverlay overlay = z10 ? ((ViewGroup) view.getParent()).getOverlay() : view.getOverlay();
                    if (this.W == 1) {
                        overlay.add(bitmapDrawable2);
                    }
                    overlay.add(bitmapDrawable);
                    ObjectAnimator objectAnimatorOfInt = this.W == 2 ? ObjectAnimator.ofInt(bitmapDrawable, "alpha", 255, 0, 0) : ObjectAnimator.ofInt(bitmapDrawable, "alpha", 0);
                    objectAnimatorOfInt.addUpdateListener(new a(view, bitmapDrawable));
                    int i10 = this.W;
                    if (i10 == 2) {
                        objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 0.0f, 1.0f);
                    } else if (i10 == 0) {
                        objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                    }
                    ObjectAnimator objectAnimator = objectAnimatorOfFloat;
                    objectAnimatorOfInt.addListener(new b(z10, view, bitmapDrawable, bitmapDrawable2));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorOfInt);
                    if (objectAnimator != null) {
                        animatorSet.playTogether(objectAnimator);
                    }
                    if (this.X == 1 && !rect.equals(rect2)) {
                        animatorSet.playTogether(ObjectAnimator.ofObject(bitmapDrawable, "bounds", f104020c0, rect, rect2));
                        if (this.X == 1) {
                            animatorSet.playTogether(ObjectAnimator.ofObject(bitmapDrawable2, "bounds", f104020c0, rect, rect2));
                        }
                    }
                    return animatorSet;
                }
            }
        }
        return null;
    }
}
