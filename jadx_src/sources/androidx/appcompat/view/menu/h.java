package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.n0;
import androidx.appcompat.R;

/* JADX INFO: compiled from: MenuDialogHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f2202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.appcompat.app.c f2203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    e f2204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private m.a f2205e;

    public h(g gVar) {
        this.f2202b = gVar;
    }

    @Override // androidx.appcompat.view.menu.m.a
    public void a(@n0 g gVar, boolean z10) {
        if (z10 || gVar == this.f2202b) {
            c();
        }
        m.a aVar = this.f2205e;
        if (aVar != null) {
            aVar.a(gVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.m.a
    public boolean b(@n0 g gVar) {
        m.a aVar = this.f2205e;
        if (aVar != null) {
            return aVar.b(gVar);
        }
        return false;
    }

    public void c() {
        androidx.appcompat.app.c cVar = this.f2203c;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    public void d(m.a aVar) {
        this.f2205e = aVar;
    }

    public void e(IBinder iBinder) {
        g gVar = this.f2202b;
        androidx.appcompat.app.c.a aVar = new androidx.appcompat.app.c.a(gVar.x());
        e eVar = new e(aVar.getContext(), R.layout.abc_list_menu_item_layout);
        this.f2204d = eVar;
        eVar.i(this);
        this.f2202b.b(this.f2204d);
        aVar.a(this.f2204d.b(), this);
        View viewB = gVar.B();
        if (viewB != null) {
            aVar.d(viewB);
        } else {
            aVar.f(gVar.z()).setTitle(gVar.A());
        }
        aVar.x(this);
        androidx.appcompat.app.c cVarCreate = aVar.create();
        this.f2203c = cVarCreate;
        cVarCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f2203c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f2203c.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f2202b.O((j) this.f2204d.b().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f2204d.a(this.f2202b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2203c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2203c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f2202b.f(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f2202b.performShortcut(i10, keyEvent, 0);
    }
}
