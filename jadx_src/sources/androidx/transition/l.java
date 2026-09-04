package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: compiled from: ObjectAnimatorUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class l {
    private l() {
    }

    static <T> ObjectAnimator a(T t10, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t10, property, (TypeConverter) null, path);
    }
}
