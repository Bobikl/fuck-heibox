package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: InputContentInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f21576a;

    /* JADX INFO: compiled from: InputContentInfoCompat.java */
    @w0(25)
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        final InputContentInfo f21577a;

        a(@n0 Uri uri, @n0 ClipDescription clipDescription, @p0 Uri uri2) {
            this.f21577a = new InputContentInfo(uri, clipDescription, uri2);
        }

        a(@n0 Object obj) {
            this.f21577a = (InputContentInfo) obj;
        }

        @Override // androidx.core.view.inputmethod.i.c
        @n0
        public Object a() {
            return this.f21577a;
        }

        @Override // androidx.core.view.inputmethod.i.c
        @n0
        public Uri b() {
            return this.f21577a.getContentUri();
        }

        @Override // androidx.core.view.inputmethod.i.c
        public void c() {
            this.f21577a.requestPermission();
        }

        @Override // androidx.core.view.inputmethod.i.c
        public void d() {
            this.f21577a.releasePermission();
        }

        @Override // androidx.core.view.inputmethod.i.c
        @n0
        public ClipDescription getDescription() {
            return this.f21577a.getDescription();
        }

        @Override // androidx.core.view.inputmethod.i.c
        @p0
        public Uri k() {
            return this.f21577a.getLinkUri();
        }
    }

    /* JADX INFO: compiled from: InputContentInfoCompat.java */
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        private final Uri f21578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @n0
        private final ClipDescription f21579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private final Uri f21580c;

        b(@n0 Uri uri, @n0 ClipDescription clipDescription, @p0 Uri uri2) {
            this.f21578a = uri;
            this.f21579b = clipDescription;
            this.f21580c = uri2;
        }

        @Override // androidx.core.view.inputmethod.i.c
        @p0
        public Object a() {
            return null;
        }

        @Override // androidx.core.view.inputmethod.i.c
        @n0
        public Uri b() {
            return this.f21578a;
        }

        @Override // androidx.core.view.inputmethod.i.c
        public void c() {
        }

        @Override // androidx.core.view.inputmethod.i.c
        public void d() {
        }

        @Override // androidx.core.view.inputmethod.i.c
        @n0
        public ClipDescription getDescription() {
            return this.f21579b;
        }

        @Override // androidx.core.view.inputmethod.i.c
        @p0
        public Uri k() {
            return this.f21580c;
        }
    }

    /* JADX INFO: compiled from: InputContentInfoCompat.java */
    public interface c {
        @p0
        Object a();

        @n0
        Uri b();

        void c();

        void d();

        @n0
        ClipDescription getDescription();

        @p0
        Uri k();
    }

    public i(@n0 Uri uri, @n0 ClipDescription clipDescription, @p0 Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f21576a = new a(uri, clipDescription, uri2);
        } else {
            this.f21576a = new b(uri, clipDescription, uri2);
        }
    }

    private i(@n0 c cVar) {
        this.f21576a = cVar;
    }

    @p0
    public static i g(@p0 Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new i(new a(obj));
        }
        return null;
    }

    @n0
    public Uri a() {
        return this.f21576a.b();
    }

    @n0
    public ClipDescription b() {
        return this.f21576a.getDescription();
    }

    @p0
    public Uri c() {
        return this.f21576a.k();
    }

    public void d() {
        this.f21576a.d();
    }

    public void e() {
        this.f21576a.c();
    }

    @p0
    public Object f() {
        return this.f21576a.a();
    }
}
