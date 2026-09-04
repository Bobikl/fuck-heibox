package retrofit2;

import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: SkipCallbackExecutorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public final class w implements v {

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private static final v f139120w1 = new w();

    w() {
    }

    static Annotation[] a(Annotation[] annotationArr) {
        if (x.l(annotationArr, v.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f139120w1;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return v.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof v;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + v.class.getName() + "()";
    }
}
