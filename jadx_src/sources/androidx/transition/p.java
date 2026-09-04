package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: Scene.java */
/* JADX INFO: loaded from: classes6.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f27895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f27897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f27898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f27899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f27900f;

    public p(@androidx.annotation.n0 ViewGroup viewGroup) {
        this.f27896b = -1;
        this.f27897c = viewGroup;
    }

    private p(ViewGroup viewGroup, int i10, Context context) {
        this.f27895a = context;
        this.f27897c = viewGroup;
        this.f27896b = i10;
    }

    public p(@androidx.annotation.n0 ViewGroup viewGroup, @androidx.annotation.n0 View view) {
        this.f27896b = -1;
        this.f27897c = viewGroup;
        this.f27898d = view;
    }

    @androidx.annotation.p0
    public static p c(@androidx.annotation.n0 ViewGroup viewGroup) {
        return (p) viewGroup.getTag(R.id.transition_current_scene);
    }

    @androidx.annotation.n0
    public static p d(@androidx.annotation.n0 ViewGroup viewGroup, @androidx.annotation.i0 int i10, @androidx.annotation.n0 Context context) {
        int i11 = R.id.transition_scene_layoutid_cache;
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(i11);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(i11, sparseArray);
        }
        p pVar = (p) sparseArray.get(i10);
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(viewGroup, i10, context);
        sparseArray.put(i10, pVar2);
        return pVar2;
    }

    static void g(@androidx.annotation.n0 ViewGroup viewGroup, @androidx.annotation.p0 p pVar) {
        viewGroup.setTag(R.id.transition_current_scene, pVar);
    }

    public void a() {
        if (this.f27896b > 0 || this.f27898d != null) {
            e().removeAllViews();
            if (this.f27896b > 0) {
                LayoutInflater.from(this.f27895a).inflate(this.f27896b, this.f27897c);
            } else {
                this.f27897c.addView(this.f27898d);
            }
        }
        Runnable runnable = this.f27899e;
        if (runnable != null) {
            runnable.run();
        }
        g(this.f27897c, this);
    }

    public void b() {
        Runnable runnable;
        if (c(this.f27897c) != this || (runnable = this.f27900f) == null) {
            return;
        }
        runnable.run();
    }

    @androidx.annotation.n0
    public ViewGroup e() {
        return this.f27897c;
    }

    boolean f() {
        return this.f27896b > 0;
    }

    public void h(@androidx.annotation.p0 Runnable runnable) {
        this.f27899e = runnable;
    }

    public void i(@androidx.annotation.p0 Runnable runnable) {
        this.f27900f = runnable;
    }
}
