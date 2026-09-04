package androidx.transition;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: compiled from: PropertyValuesHolderUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class n {
    private n() {
    }

    static PropertyValuesHolder a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
    }
}
