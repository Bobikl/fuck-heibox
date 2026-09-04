package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.k0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.util.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import z5.g;

/* JADX INFO: compiled from: Loader.java */
/* JADX INFO: loaded from: classes6.dex */
public class c<D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f24365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    InterfaceC0181c<D> f24366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    b<D> f24367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Context f24368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f24369e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f24370f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f24371g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f24372h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f24373i = false;

    /* JADX INFO: compiled from: Loader.java */
    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            c.this.p();
        }
    }

    /* JADX INFO: compiled from: Loader.java */
    public interface b<D> {
        void a(@n0 c<D> cVar);
    }

    /* JADX INFO: renamed from: androidx.loader.content.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Loader.java */
    public interface InterfaceC0181c<D> {
        void a(@n0 c<D> cVar, @p0 D d10);
    }

    public c(@n0 Context context) {
        this.f24368d = context.getApplicationContext();
    }

    public boolean A() {
        boolean z10 = this.f24372h;
        this.f24372h = false;
        this.f24373i |= z10;
        return z10;
    }

    @k0
    public void B(@n0 InterfaceC0181c<D> interfaceC0181c) {
        InterfaceC0181c<D> interfaceC0181c2 = this.f24366b;
        if (interfaceC0181c2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC0181c2 != interfaceC0181c) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f24366b = null;
    }

    @k0
    public void C(@n0 b<D> bVar) {
        b<D> bVar2 = this.f24367c;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (bVar2 != bVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f24367c = null;
    }

    @k0
    public void a() {
        this.f24370f = true;
        n();
    }

    @k0
    public boolean b() {
        return o();
    }

    public void c() {
        this.f24373i = false;
    }

    @n0
    public String d(@p0 D d10) {
        StringBuilder sb2 = new StringBuilder(64);
        f.a(d10, sb2);
        sb2.append(g.f141884d);
        return sb2.toString();
    }

    @k0
    public void e() {
        b<D> bVar = this.f24367c;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @k0
    public void f(@p0 D d10) {
        InterfaceC0181c<D> interfaceC0181c = this.f24366b;
        if (interfaceC0181c != null) {
            interfaceC0181c.a(this, d10);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f24365a);
        printWriter.print(" mListener=");
        printWriter.println(this.f24366b);
        if (this.f24369e || this.f24372h || this.f24373i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f24369e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f24372h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f24373i);
        }
        if (this.f24370f || this.f24371g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f24370f);
            printWriter.print(" mReset=");
            printWriter.println(this.f24371g);
        }
    }

    @k0
    public void h() {
        q();
    }

    @n0
    public Context i() {
        return this.f24368d;
    }

    public int j() {
        return this.f24365a;
    }

    public boolean k() {
        return this.f24370f;
    }

    public boolean l() {
        return this.f24371g;
    }

    public boolean m() {
        return this.f24369e;
    }

    @k0
    protected void n() {
    }

    @k0
    protected boolean o() {
        return false;
    }

    @k0
    public void p() {
        if (this.f24369e) {
            h();
        } else {
            this.f24372h = true;
        }
    }

    @k0
    protected void q() {
    }

    @k0
    protected void r() {
    }

    @k0
    protected void s() {
    }

    @k0
    protected void t() {
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        f.a(this, sb2);
        sb2.append(" id=");
        sb2.append(this.f24365a);
        sb2.append(g.f141884d);
        return sb2.toString();
    }

    @k0
    public void u(int i10, @n0 InterfaceC0181c<D> interfaceC0181c) {
        if (this.f24366b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f24366b = interfaceC0181c;
        this.f24365a = i10;
    }

    @k0
    public void v(@n0 b<D> bVar) {
        if (this.f24367c != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f24367c = bVar;
    }

    @k0
    public void w() {
        r();
        this.f24371g = true;
        this.f24369e = false;
        this.f24370f = false;
        this.f24372h = false;
        this.f24373i = false;
    }

    public void x() {
        if (this.f24373i) {
            p();
        }
    }

    @k0
    public final void y() {
        this.f24369e = true;
        this.f24371g = false;
        this.f24370f = false;
        s();
    }

    @k0
    public void z() {
        this.f24369e = false;
        t();
    }
}
