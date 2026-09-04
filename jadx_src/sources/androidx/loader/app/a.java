package androidx.loader.app;

import android.os.Bundle;
import androidx.annotation.k0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.lifecycle.c1;
import androidx.lifecycle.y;
import androidx.loader.content.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: LoaderManager.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LoaderManager.java */
    public interface InterfaceC0178a<D> {
        @n0
        @k0
        c<D> a(int i10, @p0 Bundle bundle);

        @k0
        void b(@n0 c<D> cVar, D d10);

        @k0
        void c(@n0 c<D> cVar);
    }

    public static void c(boolean z10) {
        b.f24308d = z10;
    }

    @n0
    public static <T extends y & c1> a d(@n0 T t10) {
        return new b(t10, t10.getViewModelStore());
    }

    @k0
    public abstract void a(int i10);

    @Deprecated
    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @p0
    public abstract <D> c<D> e(int i10);

    public boolean f() {
        return false;
    }

    @n0
    @k0
    public abstract <D> c<D> g(int i10, @p0 Bundle bundle, @n0 InterfaceC0178a<D> interfaceC0178a);

    public abstract void h();

    @n0
    @k0
    public abstract <D> c<D> i(int i10, @p0 Bundle bundle, @n0 InterfaceC0178a<D> interfaceC0178a);
}
