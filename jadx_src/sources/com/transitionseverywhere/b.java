package com.transitionseverywhere;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.transition.Transition;
import androidx.transition.u;
import androidx.transition.z;
import java.util.Map;

/* JADX INFO: compiled from: ChangeText.java */
/* JADX INFO: loaded from: classes4.dex */
public class b extends Transition {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f103980a0 = "android:textchange:textColor";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f103981b0 = 0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f103982c0 = 1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f103983p1 = 2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final int f103984x1 = 3;
    private int W = 0;
    private static final String X = "android:textchange:text";
    private static final String Y = "android:textchange:textSelectionStart";
    private static final String Z = "android:textchange:textSelectionEnd";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final String[] f103985y1 = {X, Y, Z};

    /* JADX INFO: compiled from: ChangeText.java */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f103986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f103987c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CharSequence f103988d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f103989e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f103990f;

        a(CharSequence charSequence, TextView textView, CharSequence charSequence2, int i10, int i11) {
            this.f103986b = charSequence;
            this.f103987c = textView;
            this.f103988d = charSequence2;
            this.f103989e = i10;
            this.f103990f = i11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f103986b.equals(this.f103987c.getText())) {
                this.f103987c.setText(this.f103988d);
                TextView textView = this.f103987c;
                if (textView instanceof EditText) {
                    b.this.N0((EditText) textView, this.f103989e, this.f103990f);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.transitionseverywhere.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ChangeText.java */
    public class C1030b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f103992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f103993c;

        C1030b(TextView textView, int i10) {
            this.f103992b = textView;
            this.f103993c = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@n0 ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            TextView textView = this.f103992b;
            int i10 = this.f103993c;
            textView.setTextColor((iIntValue << 24) | (16711680 & i10) | (65280 & i10) | (i10 & 255));
        }
    }

    /* JADX INFO: compiled from: ChangeText.java */
    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f103995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f103996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CharSequence f103997d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f103998e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f103999f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f104000g;

        c(CharSequence charSequence, TextView textView, CharSequence charSequence2, int i10, int i11, int i12) {
            this.f103995b = charSequence;
            this.f103996c = textView;
            this.f103997d = charSequence2;
            this.f103998e = i10;
            this.f103999f = i11;
            this.f104000g = i12;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f103995b.equals(this.f103996c.getText())) {
                this.f103996c.setText(this.f103997d);
                TextView textView = this.f103996c;
                if (textView instanceof EditText) {
                    b.this.N0((EditText) textView, this.f103998e, this.f103999f);
                }
            }
            this.f103996c.setTextColor(this.f104000g);
        }
    }

    /* JADX INFO: compiled from: ChangeText.java */
    public class d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f104002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f104003c;

        d(TextView textView, int i10) {
            this.f104002b = textView;
            this.f104003c = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@n0 ValueAnimator valueAnimator) {
            this.f104002b.setTextColor((((Integer) valueAnimator.getAnimatedValue()).intValue() << 24) | (Color.red(this.f104003c) << 16) | (Color.green(this.f104003c) << 8) | Color.blue(this.f104003c));
        }
    }

    /* JADX INFO: compiled from: ChangeText.java */
    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f104005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f104006c;

        e(TextView textView, int i10) {
            this.f104005b = textView;
            this.f104006c = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f104005b.setTextColor(this.f104006c);
        }
    }

    /* JADX INFO: compiled from: ChangeText.java */
    public class f extends u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f104008b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f104009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CharSequence f104010d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f104011e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f104012f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f104013g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ CharSequence f104014h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f104015i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f104016j;

        f(TextView textView, CharSequence charSequence, int i10, int i11, int i12, CharSequence charSequence2, int i13, int i14) {
            this.f104009c = textView;
            this.f104010d = charSequence;
            this.f104011e = i10;
            this.f104012f = i11;
            this.f104013g = i12;
            this.f104014h = charSequence2;
            this.f104015i = i13;
            this.f104016j = i14;
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void a(@n0 Transition transition) {
            if (b.this.W != 2) {
                this.f104009c.setText(this.f104014h);
                TextView textView = this.f104009c;
                if (textView instanceof EditText) {
                    b.this.N0((EditText) textView, this.f104015i, this.f104016j);
                }
            }
            if (b.this.W > 0) {
                this.f104009c.setTextColor(this.f104008b);
            }
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void c(@n0 Transition transition) {
            if (b.this.W != 2) {
                this.f104009c.setText(this.f104010d);
                TextView textView = this.f104009c;
                if (textView instanceof EditText) {
                    b.this.N0((EditText) textView, this.f104011e, this.f104012f);
                }
            }
            if (b.this.W > 0) {
                this.f104008b = this.f104009c.getCurrentTextColor();
                this.f104009c.setTextColor(this.f104013g);
            }
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void d(@n0 Transition transition) {
            transition.n0(this);
        }
    }

    private void K0(z zVar) {
        View view = zVar.f27974b;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            zVar.f27973a.put(X, textView.getText());
            if (textView instanceof EditText) {
                zVar.f27973a.put(Y, Integer.valueOf(textView.getSelectionStart()));
                zVar.f27973a.put(Z, Integer.valueOf(textView.getSelectionEnd()));
            }
            if (this.W > 0) {
                zVar.f27973a.put(f103980a0, Integer.valueOf(textView.getCurrentTextColor()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0(@n0 EditText editText, int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            return;
        }
        editText.setSelection(i10, i11);
    }

    public int L0() {
        return this.W;
    }

    @n0
    public b M0(int i10) {
        if (i10 >= 0 && i10 <= 3) {
            this.W = i10;
        }
        return this;
    }

    @Override // androidx.transition.Transition
    @p0
    public String[] Y() {
        return f103985y1;
    }

    @Override // androidx.transition.Transition
    public void j(@n0 z zVar) {
        K0(zVar);
    }

    @Override // androidx.transition.Transition
    public void m(@n0 z zVar) {
        K0(zVar);
    }

    @Override // androidx.transition.Transition
    @p0
    public Animator q(@n0 ViewGroup viewGroup, @p0 z zVar, @p0 z zVar2) {
        int i10;
        int i11;
        int iIntValue;
        int i12;
        int i13;
        ValueAnimator valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfInt;
        int i14;
        Animator animator;
        int i15;
        if (zVar == null || zVar2 == null || !(zVar.f27974b instanceof TextView)) {
            return null;
        }
        View view = zVar2.f27974b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = zVar.f27973a;
        Map<String, Object> map2 = zVar2.f27973a;
        CharSequence charSequence = map.get(X) != null ? (CharSequence) map.get(X) : "";
        CharSequence charSequence2 = map2.get(X) != null ? (CharSequence) map2.get(X) : "";
        if (textView instanceof EditText) {
            int iIntValue2 = map.get(Y) != null ? ((Integer) map.get(Y)).intValue() : -1;
            int iIntValue3 = map.get(Z) != null ? ((Integer) map.get(Z)).intValue() : iIntValue2;
            int iIntValue4 = map2.get(Y) != null ? ((Integer) map2.get(Y)).intValue() : -1;
            iIntValue = map2.get(Z) != null ? ((Integer) map2.get(Z)).intValue() : iIntValue4;
            i11 = iIntValue4;
            i12 = iIntValue2;
            i10 = iIntValue3;
        } else {
            i10 = -1;
            i11 = -1;
            iIntValue = -1;
            i12 = -1;
        }
        if (charSequence.equals(charSequence2)) {
            return null;
        }
        if (this.W != 2) {
            textView.setText(charSequence);
            if (textView instanceof EditText) {
                N0((EditText) textView, i12, i10);
            }
        }
        if (this.W != 0) {
            i13 = i10;
            int iIntValue5 = ((Integer) map.get(f103980a0)).intValue();
            int iIntValue6 = ((Integer) map2.get(f103980a0)).intValue();
            int i16 = this.W;
            if (i16 == 3 || i16 == 1) {
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(Color.alpha(iIntValue5), 0);
                valueAnimatorOfInt2.addUpdateListener(new C1030b(textView, iIntValue5));
                valueAnimatorOfInt2.addListener(new c(charSequence, textView, charSequence2, i11, iIntValue, iIntValue6));
                valueAnimatorOfFloat = valueAnimatorOfInt2;
            } else {
                valueAnimatorOfFloat = null;
            }
            int i17 = this.W;
            if (i17 == 3 || i17 == 2) {
                valueAnimatorOfInt = ValueAnimator.ofInt(0, Color.alpha(iIntValue6));
                i14 = iIntValue6;
                valueAnimatorOfInt.addUpdateListener(new d(textView, i14));
                valueAnimatorOfInt.addListener(new e(textView, i14));
            } else {
                i14 = iIntValue6;
                valueAnimatorOfInt = null;
            }
            if (valueAnimatorOfFloat != null && valueAnimatorOfInt != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfInt);
                animator = animatorSet;
            } else if (valueAnimatorOfFloat != null) {
                i15 = i14;
            } else {
                animator = valueAnimatorOfInt;
            }
            i15 = i14;
            a(new f(textView, charSequence2, i11, iIntValue, i15, charSequence, i12, i13));
            return animator;
        }
        valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addListener(new a(charSequence, textView, charSequence2, i11, iIntValue));
        i13 = i10;
        charSequence = charSequence;
        i12 = i12;
        i15 = 0;
        animator = valueAnimatorOfFloat;
        a(new f(textView, charSequence2, i11, iIntValue, i15, charSequence, i12, i13));
        return animator;
    }
}
