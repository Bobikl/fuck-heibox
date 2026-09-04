package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import androidx.annotation.f1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.collection.j2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MotionSpec.java */
/* JADX INFO: loaded from: classes7.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f52909c = "MotionSpec";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j2<String, j> f52910a = new j2<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j2<String, PropertyValuesHolder[]> f52911b = new j2<>();

    private static void a(@n0 i iVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            iVar.l(objectAnimator.getPropertyName(), objectAnimator.getValues());
            iVar.m(objectAnimator.getPropertyName(), j.b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    @n0
    private PropertyValuesHolder[] b(@n0 PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i10 = 0; i10 < propertyValuesHolderArr.length; i10++) {
            propertyValuesHolderArr2[i10] = propertyValuesHolderArr[i10].clone();
        }
        return propertyValuesHolderArr2;
    }

    @p0
    public static i c(@n0 Context context, @n0 TypedArray typedArray, @f1 int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return d(context, resourceId);
    }

    @p0
    public static i d(@n0 Context context, @androidx.annotation.b int i10) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return e(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return e(arrayList);
        } catch (Exception e10) {
            Log.w(f52909c, "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    @n0
    private static i e(@n0 List<Animator> list) {
        i iVar = new i();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(iVar, list.get(i10));
        }
        return iVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return this.f52910a.equals(((i) obj).f52910a);
        }
        return false;
    }

    @n0
    public <T> ObjectAnimator f(@n0 String str, @n0 T t10, @n0 Property<T, ?> property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t10, g(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        h(str).a(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    @n0
    public PropertyValuesHolder[] g(String str) {
        if (j(str)) {
            return b(this.f52911b.get(str));
        }
        throw new IllegalArgumentException();
    }

    public j h(String str) {
        if (k(str)) {
            return this.f52910a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.f52910a.hashCode();
    }

    public long i() {
        int size = this.f52910a.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j jVarK = this.f52910a.k(i10);
            jMax = Math.max(jMax, jVarK.c() + jVarK.d());
        }
        return jMax;
    }

    public boolean j(String str) {
        return this.f52911b.get(str) != null;
    }

    public boolean k(String str) {
        return this.f52910a.get(str) != null;
    }

    public void l(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f52911b.put(str, propertyValuesHolderArr);
    }

    public void m(String str, @p0 j jVar) {
        this.f52910a.put(str, jVar);
    }

    @n0
    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f52910a + "}\n";
    }
}
