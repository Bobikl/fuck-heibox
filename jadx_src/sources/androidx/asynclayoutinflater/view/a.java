package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.i0;
import androidx.annotation.i1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.util.n;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: compiled from: AsyncLayoutInflater.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f3025e = "AsyncLayoutInflater";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    LayoutInflater f3026a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler.Callback f3029d = new C0020a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Handler f3027b = new Handler(this.f3029d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    d f3028c = d.b();

    /* JADX INFO: renamed from: androidx.asynclayoutinflater.view.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AsyncLayoutInflater.java */
    public class C0020a implements Handler.Callback {
        C0020a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            c cVar = (c) message.obj;
            if (cVar.f3035d == null) {
                cVar.f3035d = a.this.f3026a.inflate(cVar.f3034c, cVar.f3033b, false);
            }
            cVar.f3036e.a(cVar.f3035d, cVar.f3034c, cVar.f3033b);
            a.this.f3028c.d(cVar);
            return true;
        }
    }

    /* JADX INFO: compiled from: AsyncLayoutInflater.java */
    public static class b extends LayoutInflater {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String[] f3031a = {"android.widget.", "android.webkit.", "android.app."};

        b(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new b(context);
        }

        @Override // android.view.LayoutInflater
        protected View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            for (String str2 : f3031a) {
                try {
                    View viewCreateView = createView(str, str2, attributeSet);
                    if (viewCreateView != null) {
                        return viewCreateView;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* JADX INFO: compiled from: AsyncLayoutInflater.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a f3032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ViewGroup f3033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3034c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        View f3035d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        e f3036e;

        c() {
        }
    }

    /* JADX INFO: compiled from: AsyncLayoutInflater.java */
    public static class d extends Thread {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final d f3037d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayBlockingQueue<c> f3038b = new ArrayBlockingQueue<>(10);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n.c<c> f3039c = new n.c<>(10);

        static {
            d dVar = new d();
            f3037d = dVar;
            dVar.start();
        }

        private d() {
        }

        public static d b() {
            return f3037d;
        }

        public void a(c cVar) {
            try {
                this.f3038b.put(cVar);
            } catch (InterruptedException e10) {
                throw new RuntimeException("Failed to enqueue async inflate request", e10);
            }
        }

        public c c() {
            c cVarA = this.f3039c.a();
            return cVarA == null ? new c() : cVarA;
        }

        public void d(c cVar) {
            cVar.f3036e = null;
            cVar.f3032a = null;
            cVar.f3033b = null;
            cVar.f3034c = 0;
            cVar.f3035d = null;
            this.f3039c.b(cVar);
        }

        public void e() {
            try {
                c cVarTake = this.f3038b.take();
                try {
                    cVarTake.f3035d = cVarTake.f3032a.f3026a.inflate(cVarTake.f3034c, cVarTake.f3033b, false);
                } catch (RuntimeException e10) {
                    Log.w(a.f3025e, "Failed to inflate resource in the background! Retrying on the UI thread", e10);
                }
                Message.obtain(cVarTake.f3032a.f3027b, 0, cVarTake).sendToTarget();
            } catch (InterruptedException e11) {
                Log.w(a.f3025e, e11);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                e();
            }
        }
    }

    /* JADX INFO: compiled from: AsyncLayoutInflater.java */
    public interface e {
        void a(@n0 View view, @i0 int i10, @p0 ViewGroup viewGroup);
    }

    public a(@n0 Context context) {
        this.f3026a = new b(context);
    }

    @i1
    public void a(@i0 int i10, @p0 ViewGroup viewGroup, @n0 e eVar) {
        if (eVar == null) {
            throw new NullPointerException("callback argument may not be null!");
        }
        c cVarC = this.f3028c.c();
        cVarC.f3032a = this;
        cVarC.f3034c = i10;
        cVarC.f3033b = viewGroup;
        cVarC.f3036e = eVar;
        this.f3028c.a(cVarC);
    }
}
