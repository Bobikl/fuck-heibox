package com.heybox.imageviewer.viewholders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.heybox.imageviewer.R;
import com.heybox.imageviewer.core.Components;
import com.heybox.imageviewer.e;
import com.heybox.imageviewer.widgets.PhotoView2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PhotoViewHolder.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final w9.b f59804b;

    /* JADX INFO: renamed from: com.heybox.imageviewer.viewholders.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PhotoViewHolder.kt */
    public static final class C0494a implements PhotoView2.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f59805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f59806b;

        C0494a(e eVar, a aVar) {
            this.f59805a = eVar;
            this.f59806b = aVar;
        }

        @Override // com.heybox.imageviewer.widgets.PhotoView2.a
        public void a(@dl.d PhotoView2 view, float f10) {
            if (PatchProxy.proxy(new Object[]{view, new Float(f10)}, this, changeQuickRedirect, false, bb.c.b.A1, new Class[]{PhotoView2.class, Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            this.f59805a.a(this.f59806b, view, f10);
        }

        @Override // com.heybox.imageviewer.widgets.PhotoView2.a
        public void b(@dl.d PhotoView2 view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.B1, new Class[]{PhotoView2.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            this.f59805a.d(this.f59806b, view);
        }

        @Override // com.heybox.imageviewer.widgets.PhotoView2.a
        public void c(@dl.d PhotoView2 view, float f10) {
            if (PatchProxy.proxy(new Object[]{view, new Float(f10)}, this, changeQuickRedirect, false, bb.c.b.f31073z1, new Class[]{PhotoView2.class, Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            this.f59805a.b(this.f59806b, view, f10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@dl.d ViewGroup parent, @dl.d e callback, @dl.d w9.b binding) {
        super(binding.b());
        f0.p(parent, "parent");
        f0.p(callback, "callback");
        f0.p(binding, "binding");
        this.f59804b = binding;
        binding.f141010b.setListener(new C0494a(callback, this));
        Components.f59730a.i().g(1, this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(ViewGroup viewGroup, e eVar, w9.b bVar, int i10, u uVar) {
        if ((i10 & 4) != 0) {
            bVar = w9.b.d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            f0.o(bVar, "inflate(...)");
        }
        this(viewGroup, eVar, bVar);
    }

    public final void a(@dl.d com.heybox.imageviewer.core.d item) {
        if (PatchProxy.proxy(new Object[]{item}, this, changeQuickRedirect, false, bb.c.b.f31051y1, new Class[]{com.heybox.imageviewer.core.d.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(item, "item");
        this.f59804b.f141010b.setTag(R.id.viewer_adapter_item_key, Long.valueOf(item.id()));
        this.f59804b.f141010b.setTag(R.id.viewer_adapter_item_data, item);
        this.f59804b.f141010b.setTag(R.id.viewer_adapter_item_holder, this);
        Components components = Components.f59730a;
        components.i().e(1, item, this);
        com.heybox.imageviewer.core.b bVarF = components.f();
        PhotoView2 photoView = this.f59804b.f141010b;
        f0.o(photoView, "photoView");
        bVarF.e(photoView, item, this);
    }

    @dl.d
    public final w9.b b() {
        return this.f59804b;
    }
}
