package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.util.o;
import com.google.android.material.animation.i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: BaseMotionStrategy.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f54264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final ExtendedFloatingActionButton f54265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<Animator.AnimatorListener> f54266c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.a f54267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private i f54268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private i f54269f;

    /* JADX INFO: compiled from: BaseMotionStrategy.java */
    public class a extends Property<ExtendedFloatingActionButton, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(com.google.android.material.animation.b.a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.P.getColorForState(extendedFloatingActionButton.getDrawableState(), b.this.f54265b.P.getDefaultColor()))));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f10) {
            int colorForState = extendedFloatingActionButton.P.getColorForState(extendedFloatingActionButton.getDrawableState(), b.this.f54265b.P.getDefaultColor());
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (com.google.android.material.animation.b.a(0.0f, Color.alpha(colorForState) / 255.0f, f10.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f10.floatValue() == 1.0f) {
                extendedFloatingActionButton.X(extendedFloatingActionButton.P);
            } else {
                extendedFloatingActionButton.X(colorStateListValueOf);
            }
        }
    }

    b(@n0 ExtendedFloatingActionButton extendedFloatingActionButton, com.google.android.material.floatingactionbutton.a aVar) {
        this.f54265b = extendedFloatingActionButton;
        this.f54264a = extendedFloatingActionButton.getContext();
        this.f54267d = aVar;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @androidx.annotation.i
    public void a() {
        this.f54267d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final i b() {
        i iVar = this.f54269f;
        if (iVar != null) {
            return iVar;
        }
        if (this.f54268e == null) {
            this.f54268e = i.d(this.f54264a, f());
        }
        return (i) o.l(this.f54268e);
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @p0
    public i c() {
        return this.f54269f;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final void e(@n0 Animator.AnimatorListener animatorListener) {
        this.f54266c.remove(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public AnimatorSet g() {
        return o(b());
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @androidx.annotation.i
    public void j() {
        this.f54267d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final void k(@n0 Animator.AnimatorListener animatorListener) {
        this.f54266c.add(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final void l(@p0 i iVar) {
        this.f54269f = iVar;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @n0
    public final List<Animator.AnimatorListener> m() {
        return this.f54266c;
    }

    @n0
    AnimatorSet o(@n0 i iVar) {
        ArrayList arrayList = new ArrayList();
        if (iVar.j("opacity")) {
            arrayList.add(iVar.f("opacity", this.f54265b, View.ALPHA));
        }
        if (iVar.j("scale")) {
            arrayList.add(iVar.f("scale", this.f54265b, View.SCALE_Y));
            arrayList.add(iVar.f("scale", this.f54265b, View.SCALE_X));
        }
        if (iVar.j("width")) {
            arrayList.add(iVar.f("width", this.f54265b, ExtendedFloatingActionButton.f54203x2));
        }
        if (iVar.j("height")) {
            arrayList.add(iVar.f("height", this.f54265b, ExtendedFloatingActionButton.f54205y2));
        }
        if (iVar.j("paddingStart")) {
            arrayList.add(iVar.f("paddingStart", this.f54265b, ExtendedFloatingActionButton.G2));
        }
        if (iVar.j("paddingEnd")) {
            arrayList.add(iVar.f("paddingEnd", this.f54265b, ExtendedFloatingActionButton.f54201p3));
        }
        if (iVar.j("labelOpacity")) {
            arrayList.add(iVar.f("labelOpacity", this.f54265b, new a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        com.google.android.material.animation.c.a(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @androidx.annotation.i
    public void onAnimationStart(Animator animator) {
        this.f54267d.c(animator);
    }
}
