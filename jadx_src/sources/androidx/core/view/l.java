package androidx.core.view;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: DragStartHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f21661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f21662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View.OnLongClickListener f21666f = new View.OnLongClickListener() { // from class: androidx.core.view.j
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return this.f21581b.d(view);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View.OnTouchListener f21667g = new View.OnTouchListener() { // from class: androidx.core.view.k
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return this.f21660b.e(view, motionEvent);
        }
    };

    /* JADX INFO: compiled from: DragStartHelper.java */
    public interface a {
        boolean a(@androidx.annotation.n0 View view, @androidx.annotation.n0 l lVar);
    }

    public l(@androidx.annotation.n0 View view, @androidx.annotation.n0 a aVar) {
        this.f21661a = view;
        this.f21662b = aVar;
    }

    public void a() {
        this.f21661a.setOnLongClickListener(this.f21666f);
        this.f21661a.setOnTouchListener(this.f21667g);
    }

    public void b() {
        this.f21661a.setOnLongClickListener(null);
        this.f21661a.setOnTouchListener(null);
    }

    public void c(@androidx.annotation.n0 Point point) {
        point.set(this.f21663c, this.f21664d);
    }

    public boolean d(@androidx.annotation.n0 View view) {
        return this.f21662b.a(view, this);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    public boolean e(@androidx.annotation.n0 View view, @androidx.annotation.n0 MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f21663c = x10;
            this.f21664d = y10;
        } else if (action == 1) {
            this.f21665e = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f21665e = false;
            }
        } else if (q0.l(motionEvent, 8194) && (motionEvent.getButtonState() & 1) != 0 && !this.f21665e && (this.f21663c != x10 || this.f21664d != y10)) {
            this.f21663c = x10;
            this.f21664d = y10;
            boolean zA = this.f21662b.a(view, this);
            this.f21665e = zA;
            return zA;
        }
        return false;
    }
}
