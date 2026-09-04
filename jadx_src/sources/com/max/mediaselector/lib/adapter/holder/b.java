package com.max.mediaselector.lib.adapter.holder;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.n0;
import androidx.recyclerview.widget.RecyclerView;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.photoview.PhotoView;
import com.max.mediaselector.lib.utils.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: BasePreviewHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public class b extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f74830h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f74831i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f74832j = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f74833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f74834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f74835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final PictureSelectionConfig f74836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PhotoView f74837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected d f74838g;

    /* JADX INFO: compiled from: BasePreviewHolder.java */
    public class a implements oe.c<Bitmap> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalMedia f74839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f74840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int[] f74841c;

        a(LocalMedia localMedia, String str, int[] iArr) {
            this.f74839a = localMedia;
            this.f74840b = str;
            this.f74841c = iArr;
        }

        @Override // oe.c
        public /* bridge */ /* synthetic */ void a(Bitmap bitmap) {
            if (PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, bb.c.l.f34095dg, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bitmap);
        }

        public void b(Bitmap bitmap) {
            int height;
            int width;
            int i10;
            if (PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, bb.c.l.f34072cg, new Class[]{Bitmap.class}, Void.TYPE).isSupported) {
                return;
            }
            if (bitmap == null) {
                b.this.f74838g.d();
                return;
            }
            boolean z10 = com.max.mediaselector.lib.config.f.j(this.f74839a.A()) || com.max.mediaselector.lib.config.f.r(this.f74840b);
            boolean z11 = com.max.mediaselector.lib.config.f.o(this.f74840b) || com.max.mediaselector.lib.config.f.f(this.f74839a.A());
            if (z10 || z11) {
                PictureSelectionConfig.W3.c(b.this.itemView.getContext(), this.f74840b, b.this.f74837f);
            } else {
                b.this.f74837f.setImageBitmap(bitmap);
            }
            if (l.r(bitmap.getWidth(), bitmap.getHeight())) {
                b bVar = b.this;
                width = bVar.f74833b;
                i10 = bVar.f74834c;
                bVar.f74837f.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
                    int[] iArr = this.f74841c;
                    int i11 = iArr[0];
                    height = iArr[1];
                    width = i11;
                } else {
                    width = bitmap.getWidth();
                    height = bitmap.getHeight();
                }
                i10 = height;
                b.this.f74837f.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            b bVar2 = b.this;
            bVar2.f74838g.c(bVar2.f74837f, width, i10);
        }
    }

    /* JADX INFO: renamed from: com.max.mediaselector.lib.adapter.holder.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BasePreviewHolder.java */
    public class C0601b implements com.max.mediaselector.lib.photoview.j {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0601b() {
        }

        @Override // com.max.mediaselector.lib.photoview.j
        public void a(View view, float f10, float f11) {
            d dVar;
            Object[] objArr = {view, new Float(f10), new Float(f11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.f34118eg, new Class[]{View.class, cls, cls}, Void.TYPE).isSupported || (dVar = b.this.f74838g) == null) {
                return;
            }
            dVar.onBackPressed();
        }
    }

    /* JADX INFO: compiled from: BasePreviewHolder.java */
    public class c implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalMedia f74844b;

        c(LocalMedia localMedia) {
            this.f74844b = localMedia;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34141fg, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            d dVar = b.this.f74838g;
            if (dVar != null) {
                dVar.a(this.f74844b);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: BasePreviewHolder.java */
    public interface d {
        void a(LocalMedia localMedia);

        void b(String str);

        void c(ImageView imageView, int i10, int i11);

        void d();

        void onBackPressed();
    }

    public b(@n0 View view) {
        super(view);
        this.f74836e = PictureSelectionConfig.c();
        this.f74833b = com.max.mediaselector.lib.utils.h.f(view.getContext());
        this.f74834c = com.max.mediaselector.lib.utils.h.h(view.getContext());
        this.f74835d = com.max.mediaselector.lib.utils.h.e(view.getContext());
        this.f74837f = (PhotoView) view.findViewById(R.id.preview_image);
    }

    public static b b(ViewGroup viewGroup, int i10, int i11) {
        Object[] objArr = {viewGroup, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.l.Yf, new Class[]{ViewGroup.class, cls, cls}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i11, viewGroup, false);
        if (i10 == 2) {
            return new i(viewInflate);
        }
        return i10 == 3 ? new f(viewInflate) : new h(viewInflate);
    }

    public void a(LocalMedia localMedia, int i10) {
        if (PatchProxy.proxy(new Object[]{localMedia, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Zf, new Class[]{LocalMedia.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String strB = localMedia.b();
        int[] iArrD = d(localMedia);
        int[] iArrH = com.max.mediaselector.lib.utils.c.h(iArrD[0], iArrD[1]);
        if (this.itemView.getContext() != null && strB != null) {
            PictureSelectionConfig.W3.b(this.itemView.getContext(), strB, iArrH[0], iArrH[1], new a(localMedia, strB, iArrD));
        }
        j(localMedia);
        this.f74837f.setOnViewTapListener(new C0601b());
        this.f74837f.setOnLongClickListener(new c(localMedia));
    }

    public int[] d(LocalMedia localMedia) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.l.f34026ag, new Class[]{LocalMedia.class}, int[].class);
        if (patchProxyResultProxy.isSupported) {
            return (int[]) patchProxyResultProxy.result;
        }
        return (!localMedia.O() || localMedia.k() <= 0 || localMedia.j() <= 0) ? new int[]{localMedia.getWidth(), localMedia.getHeight()} : new int[]{localMedia.k(), localMedia.j()};
    }

    public void g() {
    }

    public void h() {
    }

    public void i(d dVar) {
        this.f74838g = dVar;
    }

    public void j(LocalMedia localMedia) {
        if (PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, bb.c.l.f34049bg, new Class[]{LocalMedia.class}, Void.TYPE).isSupported || this.f74836e.L || this.f74833b >= this.f74834c) {
            return;
        }
        int width = (int) (this.f74833b / (localMedia.getWidth() / localMedia.getHeight()));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f74837f.getLayoutParams();
        layoutParams.width = this.f74833b;
        int i10 = this.f74834c;
        if (width > i10) {
            i10 = this.f74835d;
        }
        layoutParams.height = i10;
        layoutParams.gravity = 17;
    }
}
