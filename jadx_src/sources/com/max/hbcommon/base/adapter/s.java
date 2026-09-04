package com.max.hbcommon.base.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: RVCommonAdapter.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class s<T> extends RecyclerView.Adapter<e> {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected List<T> mDataList;
    protected LayoutInflater mInflater;
    private int mLayoutId;
    private c mOnItemClickListener;
    private d mOnItemLongClickListener;

    /* JADX INFO: compiled from: RVCommonAdapter.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f66800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f66801c;

        a(ViewGroup viewGroup, e eVar) {
            this.f66800b = viewGroup;
            this.f66801c = eVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 2018, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            s.this.mOnItemClickListener.a(this.f66800b, view, this.f66801c.getAdapterPosition());
        }
    }

    /* JADX INFO: compiled from: RVCommonAdapter.java */
    public class b implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f66803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f66804c;

        b(ViewGroup viewGroup, e eVar) {
            this.f66803b = viewGroup;
            this.f66804c = eVar;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 2019, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            s.this.mOnItemLongClickListener.a(this.f66803b, view, this.f66804c.getAdapterPosition());
            return false;
        }
    }

    /* JADX INFO: compiled from: RVCommonAdapter.java */
    public interface c<T> {
        void a(ViewGroup viewGroup, View view, int i10);
    }

    /* JADX INFO: compiled from: RVCommonAdapter.java */
    public interface d<T> {
        boolean a(ViewGroup viewGroup, View view, int i10);
    }

    /* JADX INFO: compiled from: RVCommonAdapter.java */
    public static class e extends RecyclerView.ViewHolder {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f66806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private View f66807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private SparseArray<View> f66808d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f66809e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final HashMap<Integer, Object> f66810f;

        public e(int i10, View view) {
            super(view);
            this.f66810f = new HashMap<>();
            this.f66806b = i10;
            this.f66807c = view;
            this.f66808d = new SparseArray<>();
        }

        public e a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2028, new Class[0], e.class);
            if (patchProxyResultProxy.isSupported) {
                return (e) patchProxyResultProxy.result;
            }
            this.f66810f.clear();
            return this;
        }

        public View b() {
            return this.itemView;
        }

        public int d() {
            return this.f66806b;
        }

        public Object g() {
            return this.f66809e;
        }

        public Object h(Integer num) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 2020, new Class[]{Integer.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : this.f66810f.get(num);
        }

        /* JADX WARN: Incorrect return type in method signature: <T:Landroid/view/View;>(I)TT; */
        public View i(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.C0259c.f31096d, new Class[]{Integer.TYPE}, View.class);
            if (patchProxyResultProxy.isSupported) {
                return (View) patchProxyResultProxy.result;
            }
            View view = this.f66808d.get(i10);
            if (view != null) {
                return view;
            }
            View viewFindViewById = this.f66807c.findViewById(i10);
            this.f66808d.put(i10, viewFindViewById);
            return viewFindViewById;
        }

        public void j() {
        }

        public e k(int i10, String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), str}, this, changeQuickRedirect, false, bb.c.C0259c.f31101i, new Class[]{Integer.TYPE, String.class}, e.class);
            if (patchProxyResultProxy.isSupported) {
                return (e) patchProxyResultProxy.result;
            }
            ((EditText) i(i10)).setText(str);
            return this;
        }

        public e l(int i10, String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), str}, this, changeQuickRedirect, false, 2026, new Class[]{Integer.TYPE, String.class}, e.class);
            if (patchProxyResultProxy.isSupported) {
                return (e) patchProxyResultProxy.result;
            }
            com.max.hbimage.b.L(str, (ImageView) i(i10), R.drawable.common_default_placeholder_375x210);
            return this;
        }

        public e m(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.C0259c.f31099g, new Class[]{cls, cls}, e.class);
            if (patchProxyResultProxy.isSupported) {
                return (e) patchProxyResultProxy.result;
            }
            ((ImageView) i(i10)).setImageResource(i11);
            return this;
        }

        public void n(Integer num, Object obj) {
            if (PatchProxy.proxy(new Object[]{num, obj}, this, changeQuickRedirect, false, bb.c.C0259c.f31095c, new Class[]{Integer.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f66810f.put(num, obj);
        }

        public void o(Object obj) {
            this.f66809e = obj;
        }

        public e p(int i10, String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), str}, this, changeQuickRedirect, false, bb.c.C0259c.f31097e, new Class[]{Integer.TYPE, String.class}, e.class);
            if (patchProxyResultProxy.isSupported) {
                return (e) patchProxyResultProxy.result;
            }
            ((TextView) i(i10)).setText(str);
            return this;
        }

        public e q(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.C0259c.f31098f, new Class[]{cls, cls}, e.class);
            if (patchProxyResultProxy.isSupported) {
                return (e) patchProxyResultProxy.result;
            }
            ((TextView) i(i10)).setTextColor(i11);
            return this;
        }
    }

    public s(Context context, List<T> list, int i10) {
        this.mInflater = LayoutInflater.from(context);
        this.mDataList = list;
        this.mLayoutId = i10;
    }

    public List<T> getDataList() {
        return this.mDataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2013, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<T> list = this.mDataList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @dl.e
    public T getItemData(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 2014, new Class[]{Integer.TYPE}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        if (i10 < 0 || i10 >= getItemCount()) {
            return null;
        }
        return this.mDataList.get(i10);
    }

    public c getOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    public d getOnItemLongClickListener() {
        return this.mOnItemLongClickListener;
    }

    public boolean isEnabled(int i10) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@n0 RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, 2016, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        onBindViewHolder((e) viewHolder, i10);
    }

    public void onBindViewHolder(@n0 e eVar, int i10) {
        if (PatchProxy.proxy(new Object[]{eVar, new Integer(i10)}, this, changeQuickRedirect, false, 2012, new Class[]{e.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        onBindViewHolder(eVar, this.mDataList.get(i10));
    }

    public abstract void onBindViewHolder(e eVar, T t10);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 2017, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public e onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 2011, new Class[]{ViewGroup.class, Integer.TYPE}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        View viewInflate = this.mInflater.inflate(this.mLayoutId, viewGroup, false);
        e eVar = new e(this.mLayoutId, viewInflate);
        setListener(viewGroup, i10, viewInflate, eVar);
        return eVar;
    }

    public void setDataList(List<T> list) {
        this.mDataList = list;
    }

    public void setListener(ViewGroup viewGroup, int i10, View view, e eVar) {
        if (!PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10), view, eVar}, this, changeQuickRedirect, false, 2015, new Class[]{ViewGroup.class, Integer.TYPE, View.class, e.class}, Void.TYPE).isSupported && isEnabled(i10)) {
            if (this.mOnItemClickListener != null) {
                view.setOnClickListener(new a(viewGroup, eVar));
            }
            if (this.mOnItemLongClickListener != null) {
                view.setOnLongClickListener(new b(viewGroup, eVar));
            }
        }
    }

    public void setOnItemClickListener(c cVar) {
        this.mOnItemClickListener = cVar;
    }

    public void setOnItemLongClickListener(d dVar) {
        this.mOnItemLongClickListener = dVar;
    }
}
