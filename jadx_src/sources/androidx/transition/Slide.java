package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.RestrictTo;
import androidx.core.view.j1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes6.dex */
public class Slide extends Visibility {

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f27748x2 = "android:slide:screenPosition";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private g f27751p1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private int f27752x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final TimeInterpolator f27749y1 = new DecelerateInterpolator();

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final TimeInterpolator f27746p2 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final g f27750y2 = new a();
    private static final g G2 = new b();

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final g f27747p3 = new c();
    private static final g G3 = new d();
    private static final g J3 = new e();
    private static final g K3 = new f();

    public class a extends h {
        a() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    public class b extends h {
        b() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return j1.Z(viewGroup) == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    public class c extends i {
        c() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    public class d extends h {
        d() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    public class e extends h {
        e() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return j1.Z(viewGroup) == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    public class f extends i {
        f() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    public interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    public static abstract class h implements g {
        private h() {
        }

        /* synthetic */ h(a aVar) {
            this();
        }

        @Override // androidx.transition.Slide.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    public static abstract class i implements g {
        private i() {
        }

        /* synthetic */ i(a aVar) {
            this();
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface j {
    }

    public Slide() {
        this.f27751p1 = K3;
        this.f27752x1 = 80;
        S0(80);
    }

    public Slide(int i10) {
        this.f27751p1 = K3;
        this.f27752x1 = 80;
        S0(i10);
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(@androidx.annotation.n0 Context context, @androidx.annotation.n0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27751p1 = K3;
        this.f27752x1 = 80;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f27913h);
        int iK = androidx.core.content.res.q.k(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        typedArrayObtainStyledAttributes.recycle();
        S0(iK);
    }

    private void I0(z zVar) {
        int[] iArr = new int[2];
        zVar.f27974b.getLocationOnScreen(iArr);
        zVar.f27973a.put(f27748x2, iArr);
    }

    @Override // androidx.transition.Visibility
    @androidx.annotation.p0
    public Animator M0(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        if (zVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) zVar2.f27973a.get(f27748x2);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return b0.a(view, zVar2, iArr[0], iArr[1], this.f27751p1.b(viewGroup, view), this.f27751p1.a(viewGroup, view), translationX, translationY, f27749y1, this);
    }

    @Override // androidx.transition.Visibility
    @androidx.annotation.p0
    public Animator O0(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        if (zVar == null) {
            return null;
        }
        int[] iArr = (int[]) zVar.f27973a.get(f27748x2);
        return b0.a(view, zVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f27751p1.b(viewGroup, view), this.f27751p1.a(viewGroup, view), f27746p2, this);
    }

    public int R0() {
        return this.f27752x1;
    }

    public void S0(int i10) {
        if (i10 == 3) {
            this.f27751p1 = f27750y2;
        } else if (i10 == 5) {
            this.f27751p1 = G3;
        } else if (i10 == 48) {
            this.f27751p1 = f27747p3;
        } else if (i10 == 80) {
            this.f27751p1 = K3;
        } else if (i10 == 8388611) {
            this.f27751p1 = G2;
        } else {
            if (i10 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f27751p1 = J3;
        }
        this.f27752x1 = i10;
        q qVar = new q();
        qVar.k(i10);
        B0(qVar);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void j(@androidx.annotation.n0 z zVar) {
        super.j(zVar);
        I0(zVar);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void m(@androidx.annotation.n0 z zVar) {
        super.m(zVar);
        I0(zVar);
    }
}
