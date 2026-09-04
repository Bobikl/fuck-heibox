package com.max.component.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: ComponentRVCommonAdapter.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class e<T> extends RecyclerView.Adapter<C0530e> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected List<T> f65439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    LayoutInflater f65440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f65441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f65442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f65443f;

    /* JADX INFO: compiled from: ComponentRVCommonAdapter.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f65444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C0530e f65445c;

        a(ViewGroup viewGroup, C0530e c0530e) {
            this.f65444b = viewGroup;
            this.f65445c = c0530e;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.f30572cl, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            e.this.f65442e.a(this.f65444b, view, this.f65445c.getAdapterPosition());
        }
    }

    /* JADX INFO: compiled from: ComponentRVCommonAdapter.java */
    public class b implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f65447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C0530e f65448c;

        b(ViewGroup viewGroup, C0530e c0530e) {
            this.f65447b = viewGroup;
            this.f65448c = c0530e;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.f30596dl, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            e.this.f65443f.a(this.f65447b, view, this.f65448c.getAdapterPosition());
            return false;
        }
    }

    /* JADX INFO: compiled from: ComponentRVCommonAdapter.java */
    public interface c<T> {
        void a(ViewGroup viewGroup, View view, int i10);
    }

    /* JADX INFO: compiled from: ComponentRVCommonAdapter.java */
    public interface d<T> {
        boolean a(ViewGroup viewGroup, View view, int i10);
    }

    /* JADX INFO: renamed from: com.max.component.adapter.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ComponentRVCommonAdapter.java */
    public static class C0530e extends RecyclerView.ViewHolder {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f65450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private View f65451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private SparseArray<View> f65452d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f65453e;

        public C0530e(int i10, View view) {
            super(view);
            this.f65450b = i10;
            this.f65451c = view;
            this.f65452d = new SparseArray<>();
        }

        public View a() {
            return this.itemView;
        }

        public int b() {
            return this.f65450b;
        }

        public Object d() {
            return this.f65453e;
        }

        /* JADX WARN: Incorrect return type in method signature: <T:Landroid/view/View;>(I)TT; */
        public View g(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.f30619el, new Class[]{Integer.TYPE}, View.class);
            if (patchProxyResultProxy.isSupported) {
                return (View) patchProxyResultProxy.result;
            }
            View view = this.f65452d.get(i10);
            if (view != null) {
                return view;
            }
            View viewFindViewById = this.f65451c.findViewById(i10);
            this.f65452d.put(i10, viewFindViewById);
            return viewFindViewById;
        }

        public C0530e h(int i10, String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), str}, this, changeQuickRedirect, false, bb.c.b.f30710il, new Class[]{Integer.TYPE, String.class}, C0530e.class);
            if (patchProxyResultProxy.isSupported) {
                return (C0530e) patchProxyResultProxy.result;
            }
            ((EditText) g(i10)).setText(str);
            return this;
        }

        public C0530e i(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.f30688hl, new Class[]{cls, cls}, C0530e.class);
            if (patchProxyResultProxy.isSupported) {
                return (C0530e) patchProxyResultProxy.result;
            }
            ((ImageView) g(i10)).setImageResource(i11);
            return this;
        }

        public void j(Object obj) {
            this.f65453e = obj;
        }

        public C0530e k(int i10, String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), str}, this, changeQuickRedirect, false, bb.c.b.f30642fl, new Class[]{Integer.TYPE, String.class}, C0530e.class);
            if (patchProxyResultProxy.isSupported) {
                return (C0530e) patchProxyResultProxy.result;
            }
            ((TextView) g(i10)).setText(str);
            return this;
        }

        public C0530e l(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.f30665gl, new Class[]{cls, cls}, C0530e.class);
            if (patchProxyResultProxy.isSupported) {
                return (C0530e) patchProxyResultProxy.result;
            }
            ((TextView) g(i10)).setTextColor(i11);
            return this;
        }
    }

    public e(Context context, List<T> list, int i10) {
        this.f65440c = LayoutInflater.from(context);
        this.f65439b = list;
        this.f65441d = i10;
    }

    public List<T> getDataList() {
        return this.f65439b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Yk, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f65439b.size();
    }

    public boolean isEnabled(int i10) {
        return true;
    }

    public c o() {
        return this.f65442e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.f30526al, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        q((C0530e) viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.f30549bl, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : s(viewGroup, i10);
    }

    public d p() {
        return this.f65443f;
    }

    public void q(C0530e c0530e, int i10) {
        if (PatchProxy.proxy(new Object[]{c0530e, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Xk, new Class[]{C0530e.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        r(c0530e, this.f65439b.get(i10));
    }

    public abstract void r(C0530e c0530e, T t10);

    public C0530e s(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Wk, new Class[]{ViewGroup.class, Integer.TYPE}, C0530e.class);
        if (patchProxyResultProxy.isSupported) {
            return (C0530e) patchProxyResultProxy.result;
        }
        View viewInflate = this.f65440c.inflate(this.f65441d, viewGroup, false);
        C0530e c0530e = new C0530e(this.f65441d, viewInflate);
        t(viewGroup, i10, viewInflate, c0530e);
        return c0530e;
    }

    public void setDataList(List<T> list) {
        this.f65439b = list;
    }

    public void t(ViewGroup viewGroup, int i10, View view, C0530e c0530e) {
        if (!PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10), view, c0530e}, this, changeQuickRedirect, false, bb.c.b.Zk, new Class[]{ViewGroup.class, Integer.TYPE, View.class, C0530e.class}, Void.TYPE).isSupported && isEnabled(i10)) {
            if (this.f65442e != null) {
                view.setOnClickListener(new a(viewGroup, c0530e));
            }
            if (this.f65443f != null) {
                view.setOnLongClickListener(new b(viewGroup, c0530e));
            }
        }
    }

    public void u(c cVar) {
        this.f65442e = cVar;
    }

    public void v(d dVar) {
        this.f65443f = dVar;
    }
}
