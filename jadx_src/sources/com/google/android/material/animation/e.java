package com.google.android.material.animation;

import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.n0;
import com.google.android.material.R;

/* JADX INFO: compiled from: ChildrenAlphaProperty.java */
/* JADX INFO: loaded from: classes7.dex */
public class e extends Property<ViewGroup, Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Property<ViewGroup, Float> f52902a = new e("childrenAlpha");

    private e(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    @n0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(@n0 ViewGroup viewGroup) {
        Float f10 = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        return f10 != null ? f10 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(@n0 ViewGroup viewGroup, @n0 Float f10) {
        float fFloatValue = f10.floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(fFloatValue));
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            viewGroup.getChildAt(i10).setAlpha(fFloatValue);
        }
    }
}
