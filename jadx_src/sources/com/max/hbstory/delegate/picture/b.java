package com.max.hbstory.delegate.picture;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbstory.bean.StoryImgObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PictureViewPager2Delegate.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class b extends RecyclerView.Adapter<a> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private List<StoryImgObj> f72902b;

    /* JADX INFO: compiled from: PictureViewPager2Delegate.kt */
    public final class a extends RecyclerView.ViewHolder {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final ImageView f72903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f72904c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d b bVar, pd.b storyPictureBannerItemBinding) {
            super(storyPictureBannerItemBinding.b());
            f0.p(storyPictureBannerItemBinding, "storyPictureBannerItemBinding");
            this.f72904c = bVar;
            ImageView imageViewB = storyPictureBannerItemBinding.b();
            f0.o(imageViewB, "getRoot(...)");
            this.f72903b = imageViewB;
        }

        @dl.d
        public final ImageView a() {
            return this.f72903b;
        }
    }

    public b(@dl.d List<StoryImgObj> imageUrls) {
        f0.p(imageUrls, "imageUrls");
        this.f72902b = imageUrls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(String str, a holder) {
        if (PatchProxy.proxy(new Object[]{str, holder}, null, changeQuickRedirect, true, bb.c.k.Yf, new Class[]{String.class, a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "$holder");
        com.max.hbimage.b.K(str, holder.a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Xf, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return this.f72902b.size() == 1 ? 1 : Integer.MAX_VALUE;
    }

    @dl.d
    public final List<StoryImgObj> n() {
        return this.f72902b;
    }

    public void o(@dl.d final a holder, int i10) {
        if (PatchProxy.proxy(new Object[]{holder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Wf, new Class[]{a.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        List<StoryImgObj> list = this.f72902b;
        if (!(list == null || list.isEmpty())) {
            final String img_url = this.f72902b.get(i10 % this.f72902b.size()).getImg_url();
            holder.a().post(new Runnable() { // from class: com.max.hbstory.delegate.picture.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.p(img_url, holder);
                }
            });
            return;
        }
        com.max.heybox.hblog.g.f74531b.v("[BannerAdapter][onBindViewHolder] skip mod by zero!\nimageUrls: " + this.f72902b + "\nposition: " + i10 + ", holder: " + holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.f33437ag, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        o((a) viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Zf, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : q(viewGroup, i10);
    }

    @dl.d
    public a q(@dl.d ViewGroup parent, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Vf, new Class[]{ViewGroup.class, Integer.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        f0.p(parent, "parent");
        pd.b bVarC = pd.b.c(LayoutInflater.from(parent.getContext()));
        f0.o(bVarC, "inflate(...)");
        bVarC.b().setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new a(this, bVarC);
    }

    public final void r(@dl.d List<StoryImgObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.k.Uf, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.f72902b = list;
    }
}
