package com.previewlibrary;

/* JADX INFO: compiled from: ZoomMediaLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile fg.a f96334a;

    /* JADX INFO: renamed from: com.previewlibrary.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ZoomMediaLoader.java */
    public static class C0915b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static b f96335a = new b();

        private C0915b() {
        }
    }

    private b() {
    }

    public static b a() {
        return C0915b.f96335a;
    }

    public fg.a b() {
        if (this.f96334a != null) {
            return this.f96334a;
        }
        throw new NullPointerException("ZoomMediaLoader loader  no init");
    }

    public void c(fg.a aVar) {
        this.f96334a = aVar;
    }
}
