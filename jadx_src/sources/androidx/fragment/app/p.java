package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.view.c1;
import androidx.fragment.R;

/* JADX INFO: compiled from: FragmentAnim.java */
/* JADX INFO: loaded from: classes6.dex */
public class p {

    /* JADX INFO: compiled from: FragmentAnim.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f23767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Animator f23768b;

        a(Animator animator) {
            this.f23767a = null;
            this.f23768b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        a(Animation animation) {
            this.f23767a = animation;
            this.f23768b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* JADX INFO: compiled from: FragmentAnim.java */
    public static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ViewGroup f23769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f23770c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f23771d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f23772e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f23773f;

        b(@androidx.annotation.n0 Animation animation, @androidx.annotation.n0 ViewGroup viewGroup, @androidx.annotation.n0 View view) {
            super(false);
            this.f23773f = true;
            this.f23769b = viewGroup;
            this.f23770c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, @androidx.annotation.n0 Transformation transformation) {
            this.f23773f = true;
            if (this.f23771d) {
                return !this.f23772e;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f23771d = true;
                c1.a(this.f23769b, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, @androidx.annotation.n0 Transformation transformation, float f10) {
            this.f23773f = true;
            if (this.f23771d) {
                return !this.f23772e;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f23771d = true;
                c1.a(this.f23769b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f23771d || !this.f23773f) {
                this.f23769b.endViewTransition(this.f23770c);
                this.f23772e = true;
            } else {
                this.f23773f = false;
                this.f23769b.post(this);
            }
        }
    }

    private p() {
    }

    @androidx.annotation.a
    private static int a(Fragment fragment, boolean z10, boolean z11) {
        if (z11) {
            return z10 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
        }
        return z10 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    @SuppressLint({"ResourceType"})
    static a b(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Fragment fragment, boolean z10, boolean z11) {
        int nextTransition = fragment.getNextTransition();
        int iA = a(fragment, z10, z11);
        boolean z12 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i10 = R.id.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i10) != null) {
                fragment.mContainer.setTag(i10, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z10, iA);
        if (animationOnCreateAnimation != null) {
            return new a(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z10, iA);
        if (animatorOnCreateAnimator != null) {
            return new a(animatorOnCreateAnimator);
        }
        if (iA == 0 && nextTransition != 0) {
            iA = d(context, nextTransition, z10);
        }
        if (iA != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iA));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation != null) {
                        return new a(animationLoadAnimation);
                    }
                    z12 = true;
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                }
            }
            if (!z12) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                    if (animatorLoadAnimator != null) {
                        return new a(animatorLoadAnimator);
                    }
                } catch (RuntimeException e11) {
                    if (zEquals) {
                        throw e11;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation2 != null) {
                        return new a(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    @androidx.annotation.a
    private static int c(@androidx.annotation.n0 Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    @androidx.annotation.a
    private static int d(@androidx.annotation.n0 Context context, int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (i10 == 8194) {
            return z10 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
        }
        if (i10 == 8197) {
            return z10 ? c(context, android.R.attr.activityCloseEnterAnimation) : c(context, android.R.attr.activityCloseExitAnimation);
        }
        if (i10 == 4099) {
            return z10 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
        }
        if (i10 != 4100) {
            return -1;
        }
        return z10 ? c(context, android.R.attr.activityOpenEnterAnimation) : c(context, android.R.attr.activityOpenExitAnimation);
    }
}
