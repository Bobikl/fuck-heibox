package com.heybox.imageviewer.viewholders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.heybox.imageviewer.R;
import com.heybox.imageviewer.core.Components;
import com.heybox.imageviewer.e;
import com.heybox.imageviewer.widgets.video.ExoVideoView2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: VideoViewHolder.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class d extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final w9.d f59810b;

    /* JADX INFO: compiled from: VideoViewHolder.kt */
    public static final class a implements ExoVideoView2.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f59811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f59812b;

        a(e eVar, d dVar) {
            this.f59811a = eVar;
            this.f59812b = dVar;
        }

        @Override // com.heybox.imageviewer.widgets.video.ExoVideoView2.a
        public void a(@dl.d ExoVideoView2 view, float f10) {
            if (PatchProxy.proxy(new Object[]{view, new Float(f10)}, this, changeQuickRedirect, false, bb.c.b.I1, new Class[]{ExoVideoView2.class, Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            this.f59811a.a(this.f59812b, view, f10);
        }

        @Override // com.heybox.imageviewer.widgets.video.ExoVideoView2.a
        public void b(@dl.d ExoVideoView2 view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.J1, new Class[]{ExoVideoView2.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            this.f59811a.d(this.f59812b, view);
        }

        @Override // com.heybox.imageviewer.widgets.video.ExoVideoView2.a
        public void c(@dl.d ExoVideoView2 view, float f10) {
            if (PatchProxy.proxy(new Object[]{view, new Float(f10)}, this, changeQuickRedirect, false, bb.c.b.H1, new Class[]{ExoVideoView2.class, Float.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            this.f59811a.b(this.f59812b, view, f10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@dl.d ViewGroup parent, @dl.d e callback, @dl.d w9.d binding) {
        super(binding.b());
        f0.p(parent, "parent");
        f0.p(callback, "callback");
        f0.p(binding, "binding");
        this.f59810b = binding;
        binding.f141015c.r(new a(callback, this));
        Components.f59730a.i().g(3, this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d(ViewGroup viewGroup, e eVar, w9.d dVar, int i10, u uVar) {
        if ((i10 & 4) != 0) {
            dVar = w9.d.d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            f0.o(dVar, "inflate(...)");
        }
        this(viewGroup, eVar, dVar);
    }

    public final void a(@dl.d com.heybox.imageviewer.core.d item) {
        if (PatchProxy.proxy(new Object[]{item}, this, changeQuickRedirect, false, 240, new Class[]{com.heybox.imageviewer.core.d.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(item, "item");
        this.f59810b.f141015c.setTag(R.id.viewer_adapter_item_key, Long.valueOf(item.id()));
        this.f59810b.f141015c.setTag(R.id.viewer_adapter_item_data, item);
        this.f59810b.f141015c.setTag(R.id.viewer_adapter_item_holder, this);
        Components components = Components.f59730a;
        components.i().e(3, item, this);
        com.heybox.imageviewer.core.b bVarF = components.f();
        ExoVideoView2 videoView = this.f59810b.f141015c;
        f0.o(videoView, "videoView");
        bVarF.a(videoView, item, this);
    }

    @dl.d
    public final w9.d b() {
        return this.f59810b;
    }
}
