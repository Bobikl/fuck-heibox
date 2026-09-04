package androidx.media;

import android.media.VolumeProvider;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: VolumeProviderCompat.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f24639g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f24640h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f24641i = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f24645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f24646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private VolumeProvider f24647f;

    /* JADX INFO: compiled from: VolumeProviderCompat.java */
    public class a extends VolumeProvider {
        a(int i10, int i11, int i12, String str) {
            super(i10, i11, i12, str);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i10) {
            p.this.f(i10);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i10) {
            p.this.g(i10);
        }
    }

    /* JADX INFO: compiled from: VolumeProviderCompat.java */
    public class b extends VolumeProvider {
        b(int i10, int i11, int i12) {
            super(i10, i11, i12);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i10) {
            p.this.f(i10);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i10) {
            p.this.g(i10);
        }
    }

    /* JADX INFO: compiled from: VolumeProviderCompat.java */
    @w0(21)
    public static class c {
        private c() {
        }

        @u
        static void a(VolumeProvider volumeProvider, int i10) {
            volumeProvider.setCurrentVolume(i10);
        }
    }

    /* JADX INFO: compiled from: VolumeProviderCompat.java */
    public static abstract class d {
        public abstract void onVolumeChanged(p pVar);
    }

    /* JADX INFO: compiled from: VolumeProviderCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface e {
    }

    public p(int i10, int i11, int i12) {
        this(i10, i11, i12, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public p(int i10, int i11, int i12, @p0 String str) {
        this.f24642a = i10;
        this.f24643b = i11;
        this.f24645d = i12;
        this.f24644c = str;
    }

    public final int a() {
        return this.f24645d;
    }

    public final int b() {
        return this.f24643b;
    }

    public final int c() {
        return this.f24642a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @p0
    public final String d() {
        return this.f24644c;
    }

    public Object e() {
        if (this.f24647f == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f24647f = new a(this.f24642a, this.f24643b, this.f24645d, this.f24644c);
            } else {
                this.f24647f = new b(this.f24642a, this.f24643b, this.f24645d);
            }
        }
        return this.f24647f;
    }

    public void f(int i10) {
    }

    public void g(int i10) {
    }

    public void h(d dVar) {
        this.f24646e = dVar;
    }

    public final void i(int i10) {
        this.f24645d = i10;
        c.a((VolumeProvider) e(), i10);
        d dVar = this.f24646e;
        if (dVar != null) {
            dVar.onVolumeChanged(this);
        }
    }
}
