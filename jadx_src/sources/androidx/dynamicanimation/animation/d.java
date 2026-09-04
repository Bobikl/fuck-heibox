package androidx.dynamicanimation.animation;

import androidx.annotation.w0;

/* JADX INFO: compiled from: FloatPropertyCompat.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f22906a;

    /* JADX INFO: compiled from: FloatPropertyCompat.java */
    public static final class a extends d<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x.a f22907b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, x.a aVar) {
            super(str);
            this.f22907b = aVar;
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(T t10) {
            return ((Float) this.f22907b.get(t10)).floatValue();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(T t10, float f10) {
            this.f22907b.c(t10, f10);
        }
    }

    public d(String str) {
        this.f22906a = str;
    }

    @w0(24)
    public static <T> d<T> a(x.a<T> aVar) {
        return new a(aVar.getName(), aVar);
    }

    public abstract float b(T t10);

    public abstract void c(T t10, float f10);
}
