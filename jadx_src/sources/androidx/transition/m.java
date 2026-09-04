package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: compiled from: PathProperty.java */
/* JADX INFO: loaded from: classes6.dex */
public class m<T> extends Property<T, Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Property<T, PointF> f27887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PathMeasure f27888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f27889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f27890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PointF f27891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f27892f;

    m(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f27890d = new float[2];
        this.f27891e = new PointF();
        this.f27887a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f27888b = pathMeasure;
        this.f27889c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(T t10) {
        return Float.valueOf(this.f27892f);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(T t10, Float f10) {
        this.f27892f = f10.floatValue();
        this.f27888b.getPosTan(this.f27889c * f10.floatValue(), this.f27890d, null);
        PointF pointF = this.f27891e;
        float[] fArr = this.f27890d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f27887a.set(t10, pointF);
    }
}
