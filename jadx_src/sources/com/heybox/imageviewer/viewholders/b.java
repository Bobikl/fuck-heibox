package com.heybox.imageviewer.viewholders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.heybox.imageviewer.R;
import com.heybox.imageviewer.core.Components;
import com.heybox.imageviewer.e;
import com.heybox.imageviewer.widgets.SubsamplingScaleImageView2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SubsamplingViewHolder.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class b extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final w9.c f59807b;

    /* JADX INFO: compiled from: SubsamplingViewHolder.kt */
    public static final class a implements SubsamplingScaleImageView2.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f59808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f59809b;

        a(e eVar, b bVar) {
            this.f59808a = eVar;
            this.f59809b = bVar;
        }

        @Override // com.heybox.imageviewer.widgets.SubsamplingScaleImageView2.c
        public void a(@dl.d SubsamplingScaleImageView2 view, float f10) {
            if (PatchProxy.proxy(new Object[]{view, new Float(f10)}, this, changeQuickRedirect, false, bb.c.b.D1, new Class[]{SubsamplingScaleImageView2.class, Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            this.f59808a.b(this.f59809b, view, f10);
        }

        @Override // com.heybox.imageviewer.widgets.SubsamplingScaleImageView2.c
        public void b(@dl.d SubsamplingScaleImageView2 view, float f10) {
            if (PatchProxy.proxy(new Object[]{view, new Float(f10)}, this, changeQuickRedirect, false, bb.c.b.E1, new Class[]{SubsamplingScaleImageView2.class, Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            this.f59808a.a(this.f59809b, view, f10);
        }

        @Override // com.heybox.imageviewer.widgets.SubsamplingScaleImageView2.c
        public void c(@dl.d SubsamplingScaleImageView2 view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.F1, new Class[]{SubsamplingScaleImageView2.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            this.f59808a.d(this.f59809b, view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@dl.d ViewGroup parent, @dl.d e callback, @dl.d w9.c binding) {
        super(binding.b());
        f0.p(parent, "parent");
        f0.p(callback, "callback");
        f0.p(binding, "binding");
        this.f59807b = binding;
        binding.f141012b.setMinimumScaleType(4);
        binding.f141012b.setMinimumDpi(10);
        binding.f141012b.setListener(new a(callback, this));
        Components.f59730a.i().g(2, this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ b(ViewGroup viewGroup, e eVar, w9.c cVar, int i10, u uVar) {
        if ((i10 & 4) != 0) {
            cVar = w9.c.d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            f0.o(cVar, "inflate(...)");
        }
        this(viewGroup, eVar, cVar);
    }

    public final void a(@dl.d com.heybox.imageviewer.core.d item) {
        if (PatchProxy.proxy(new Object[]{item}, this, changeQuickRedirect, false, bb.c.b.C1, new Class[]{com.heybox.imageviewer.core.d.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(item, "item");
        this.f59807b.f141012b.setTag(R.id.viewer_adapter_item_key, Long.valueOf(item.id()));
        this.f59807b.f141012b.setTag(R.id.viewer_adapter_item_data, item);
        this.f59807b.f141012b.setTag(R.id.viewer_adapter_item_holder, this);
        Components components = Components.f59730a;
        components.i().e(2, item, this);
        com.heybox.imageviewer.core.b bVarF = components.f();
        SubsamplingScaleImageView2 subsamplingView = this.f59807b.f141012b;
        f0.o(subsamplingView, "subsamplingView");
        bVarF.b(subsamplingView, item, this);
    }

    @dl.d
    public final w9.c b() {
        return this.f59807b;
    }
}
