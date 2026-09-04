package com.max.mediaselector.lib.dialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.decoration.WrapContentLinearLayoutManager;
import com.max.mediaselector.lib.entity.LocalMediaFolder;
import com.max.mediaselector.lib.utils.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: AlbumListPopWindow.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends PopupWindow {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f75173g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f75174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f75175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RecyclerView f75176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f75177d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.max.mediaselector.lib.adapter.a f75178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f75179f;

    /* JADX INFO: renamed from: com.max.mediaselector.lib.dialog.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AlbumListPopWindow.java */
    public class ViewOnClickListenerC0606a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        ViewOnClickListenerC0606a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 11104, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: AlbumListPopWindow.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 11105, new Class[]{View.class}, Void.TYPE).isSupported && o.b()) {
                a.this.dismiss();
            }
        }
    }

    /* JADX INFO: compiled from: AlbumListPopWindow.java */
    public interface c {
        void a();

        void b();
    }

    public a(Context context) {
        this.f75174a = context;
        setContentView(LayoutInflater.from(context).inflate(R.layout.ps_window_folder, (ViewGroup) null));
        setWidth(-1);
        setHeight(-2);
        setAnimationStyle(R.style.PictureThemeWindowStyle);
        setFocusable(true);
        setOutsideTouchable(true);
        update();
        i();
    }

    static /* synthetic */ void a(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 11103, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        super.dismiss();
    }

    public static a c(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.l.dm, new Class[]{Context.class}, a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : new a(context);
    }

    private void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Wl, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f75176c = (RecyclerView) getContentView().findViewById(R.id.folder_list);
        this.f75175b = getContentView().findViewById(R.id.rootViewBg);
        this.f75176c.setLayoutManager(new WrapContentLinearLayoutManager(this.f75174a));
        com.max.mediaselector.lib.adapter.a aVar = new com.max.mediaselector.lib.adapter.a();
        this.f75178e = aVar;
        this.f75176c.setAdapter(aVar);
        this.f75175b.setOnClickListener(new ViewOnClickListenerC0606a());
        getContentView().findViewById(R.id.rootView).setOnClickListener(new b());
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void b(List<LocalMediaFolder> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.Xl, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f75178e.n(list);
        this.f75178e.notifyDataSetChanged();
    }

    public void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11101, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        List<LocalMediaFolder> listO = this.f75178e.o();
        for (int i10 = 0; i10 < listO.size(); i10++) {
            LocalMediaFolder localMediaFolder = listO.get(i10);
            localMediaFolder.A(false);
            localMediaFolder.B(0);
            this.f75178e.notifyItemChanged(i10);
            for (int i11 = 0; i11 < qe.a.g(); i11++) {
                if (TextUtils.equals(localMediaFolder.h(), qe.a.i().get(i11).D())) {
                    localMediaFolder.A(true);
                    localMediaFolder.B(localMediaFolder.k() + 1);
                    this.f75178e.notifyItemChanged(i10);
                }
                if (localMediaFolder.a() == -1) {
                    localMediaFolder.A(true);
                    localMediaFolder.B(qe.a.g());
                    this.f75178e.notifyItemChanged(i10);
                    break;
                }
            }
        }
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11102, new Class[0], Void.TYPE).isSupported || this.f75177d) {
            return;
        }
        this.f75175b.animate().alpha(0.0f).setDuration(50L).start();
        c cVar = this.f75179f;
        if (cVar != null) {
            cVar.b();
        }
        this.f75177d = true;
        a(this);
        this.f75177d = false;
    }

    public List<LocalMediaFolder> e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Yl, new Class[0], List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : this.f75178e.o();
    }

    public int f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.am, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (h() > 0) {
            return g(0).j();
        }
        return 0;
    }

    public LocalMediaFolder g(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Zl, new Class[]{Integer.TYPE}, LocalMediaFolder.class);
        if (patchProxyResultProxy.isSupported) {
            return (LocalMediaFolder) patchProxyResultProxy.result;
        }
        if (this.f75178e.o().size() <= 0 || i10 >= this.f75178e.o().size()) {
            return null;
        }
        return this.f75178e.o().get(i10);
    }

    public int h() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.bm, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f75178e.o().size();
    }

    public void j(oe.a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.l.cm, new Class[]{oe.a.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f75178e.r(aVar);
    }

    public void k(c cVar) {
        this.f75179f = cVar;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.em, new Class[]{View.class}, Void.TYPE).isSupported || e() == null || e().size() == 0) {
            return;
        }
        if (o.c()) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            showAtLocation(view, 0, 0, iArr[1] + view.getHeight());
        } else {
            super.showAsDropDown(view);
        }
        this.f75177d = false;
        c cVar = this.f75179f;
        if (cVar != null) {
            cVar.a();
        }
        this.f75175b.animate().alpha(1.0f).setDuration(250L).setStartDelay(250L).start();
        d();
    }
}
