package com.heybox.imageviewer.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.heybox.imageviewer.core.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: ImageViewerAdapter.kt */
/* JADX INFO: loaded from: classes7.dex */
@t0({"SMAP\nImageViewerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageViewerAdapter.kt\ncom/heybox/imageviewer/adapter/ImageViewerAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
public final class a extends PagingDataAdapter<d, RecyclerView.ViewHolder> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private com.heybox.imageviewer.e f59718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f59719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final com.heybox.imageviewer.e f59720g;

    /* JADX INFO: renamed from: com.heybox.imageviewer.adapter.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ImageViewerAdapter.kt */
    public static final class C0492a implements com.heybox.imageviewer.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0492a() {
        }

        @Override // com.heybox.imageviewer.e
        public void a(@dl.d RecyclerView.ViewHolder viewHolder, @dl.d View view, float f10) {
            if (PatchProxy.proxy(new Object[]{viewHolder, view, new Float(f10)}, this, changeQuickRedirect, false, 94, new Class[]{RecyclerView.ViewHolder.class, View.class, Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(view, "view");
            com.heybox.imageviewer.e eVar = a.this.f59718e;
            if (eVar != null) {
                eVar.a(viewHolder, view, f10);
            }
        }

        @Override // com.heybox.imageviewer.e
        public void b(@dl.d RecyclerView.ViewHolder viewHolder, @dl.d View view, float f10) {
            if (PatchProxy.proxy(new Object[]{viewHolder, view, new Float(f10)}, this, changeQuickRedirect, false, 92, new Class[]{RecyclerView.ViewHolder.class, View.class, Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(view, "view");
            com.heybox.imageviewer.e eVar = a.this.f59718e;
            if (eVar != null) {
                eVar.b(viewHolder, view, f10);
            }
        }

        @Override // com.heybox.imageviewer.e
        public void c(@dl.d RecyclerView.ViewHolder viewHolder, int i10) {
            if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, 91, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            com.heybox.imageviewer.e eVar = a.this.f59718e;
            if (eVar != null) {
                eVar.c(viewHolder, i10);
            }
        }

        @Override // com.heybox.imageviewer.e
        public void d(@dl.d RecyclerView.ViewHolder viewHolder, @dl.d View view) {
            if (PatchProxy.proxy(new Object[]{viewHolder, view}, this, changeQuickRedirect, false, 93, new Class[]{RecyclerView.ViewHolder.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(view, "view");
            com.heybox.imageviewer.e eVar = a.this.f59718e;
            if (eVar != null) {
                eVar.d(viewHolder, view);
            }
        }
    }

    public a(long j10) {
        super(b.a(), null, null, 6, null);
        this.f59719f = j10;
        this.f59720g = new C0492a();
    }

    private final d B(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 90, new Class[]{Integer.TYPE}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        try {
            return getItem(i10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void C(@e com.heybox.imageviewer.e eVar) {
        this.f59718e = eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 89, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        d dVarB = B(i10);
        if (dVarB != null) {
            return dVarB.i();
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@dl.d RecyclerView.ViewHolder holder, int i10) {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{holder, new Integer(i10)}, this, changeQuickRedirect, false, 88, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        d dVarB = B(i10);
        if (holder instanceof com.heybox.imageviewer.viewholders.a) {
            if (dVarB != null) {
                ((com.heybox.imageviewer.viewholders.a) holder).a(dVarB);
            }
        } else if (holder instanceof com.heybox.imageviewer.viewholders.b) {
            if (dVarB != null) {
                ((com.heybox.imageviewer.viewholders.b) holder).a(dVarB);
            }
        } else if ((holder instanceof com.heybox.imageviewer.viewholders.d) && dVarB != null) {
            ((com.heybox.imageviewer.viewholders.d) holder).a(dVarB);
        }
        if (dVarB != null && dVarB.id() == this.f59719f) {
            z10 = true;
        }
        if (z10) {
            com.heybox.imageviewer.e eVar = this.f59718e;
            if (eVar != null) {
                eVar.c(holder, i10);
            }
            this.f59719f = -1L;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @dl.d
    public RecyclerView.ViewHolder onCreateViewHolder(@dl.d ViewGroup parent, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, 87, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecyclerView.ViewHolder) patchProxyResultProxy.result;
        }
        f0.p(parent, "parent");
        if (i10 == 1) {
            return new com.heybox.imageviewer.viewholders.a(parent, this.f59720g, null, 4, null);
        }
        if (i10 != 2) {
            return i10 != 3 ? new com.heybox.imageviewer.viewholders.c(new View(parent.getContext())) : new com.heybox.imageviewer.viewholders.d(parent, this.f59720g, null, 4, null);
        }
        return new com.heybox.imageviewer.viewholders.b(parent, this.f59720g, null, 4, null);
    }
}
