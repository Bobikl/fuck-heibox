package com.max.hbstory.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import androidx.viewpager2.widget.ViewPager2;
import com.max.hbstory.bean.StoryImgInfoObj;
import com.max.hbstory.bean.StoryImgObj;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.bean.StoryLinkCardInfoObj;
import com.max.hbstory.d;
import com.max.hbstory.delegate.picture.b;
import com.max.hbstory.g;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.hbstory.viewpage2.video.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.u;
import kotlinx.coroutines.internal.z;
import l3.c;

/* JADX INFO: compiled from: StoryViewPager2Container.kt */
/* JADX INFO: loaded from: classes13.dex */
@t0({"SMAP\nStoryViewPager2Container.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoryViewPager2Container.kt\ncom/max/hbstory/widget/StoryViewPager2Container\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,125:1\n766#2:126\n857#2,2:127\n254#3,2:129\n254#3,2:131\n*S KotlinDebug\n*F\n+ 1 StoryViewPager2Container.kt\ncom/max/hbstory/widget/StoryViewPager2Container\n*L\n78#1:126\n78#1:127,2\n118#1:129,2\n122#1:131,2\n*E\n"})
public final class StoryViewPager2Container extends FrameLayout implements a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewPager2 f73055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private b f73056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private rd.a f73057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private final c f73058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private d f73059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f73060g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryViewPager2Container(@dl.d Context context) {
        super(context);
        f0.p(context, "context");
        removeAllViews();
        setPictureViewPager2(new ViewPager2(getContext()));
        addView(getPictureViewPager2(), new FrameLayout.LayoutParams(-1, -1));
        this.f73056c = new b(new ArrayList());
        getPictureViewPager2().setAdapter(this.f73056c);
        this.f73060g = -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryViewPager2Container(@dl.d Context context, @e AttributeSet attributeSet) {
        super(context, attributeSet);
        f0.p(context, "context");
        removeAllViews();
        setPictureViewPager2(new ViewPager2(getContext()));
        addView(getPictureViewPager2(), new FrameLayout.LayoutParams(-1, -1));
        this.f73056c = new b(new ArrayList());
        getPictureViewPager2().setAdapter(this.f73056c);
        this.f73060g = -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryViewPager2Container(@dl.d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        removeAllViews();
        setPictureViewPager2(new ViewPager2(getContext()));
        addView(getPictureViewPager2(), new FrameLayout.LayoutParams(-1, -1));
        this.f73056c = new b(new ArrayList());
        getPictureViewPager2().setAdapter(this.f73056c);
        this.f73060g = -1;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void b(d dVar, int i10) {
        StoryItemsObj storyItemsObj;
        List listE;
        StoryImgInfoObj img_info;
        if (PatchProxy.proxy(new Object[]{dVar, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Tj, new Class[]{d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        d(dVar, i10);
        g gVarD = dVar.d();
        if (gVarD == null) {
            return;
        }
        List<StoryItemsObj> listF = gVarD.F().f();
        if (listF != null && (storyItemsObj = listF.get(i10)) != null) {
            StoryLinkCardInfoObj link_card_info = storyItemsObj.getLink_card_info();
            List<StoryImgObj> images = (link_card_info == null || (img_info = link_card_info.getImg_info()) == null) ? null : img_info.getImages();
            if (images != null) {
                listE = new ArrayList();
                for (Object obj : images) {
                    String img_url = ((StoryImgObj) obj).getImg_url();
                    if (img_url != null && (u.V1(img_url) ^ true)) {
                        listE.add(obj);
                    }
                }
            } else {
                listE = CollectionsKt__CollectionsKt.E();
            }
            if (!listE.isEmpty()) {
                h(listE);
            }
        }
        ViewParent parent = getPictureViewPager2().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            StoryUtilsKt.c(viewGroup, 0.0f, 0, 0, 0, false, 16, null);
        }
        StoryUtilsKt.c(getPictureViewPager2(), 0.0f, 0, 0, 0, false, 16, null);
    }

    private final void d(d dVar, int i10) {
        if (PatchProxy.proxy(new Object[]{dVar, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Rj, new Class[]{d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        g gVarD = dVar.d();
        if (gVarD != null) {
            g(gVarD, i10);
        }
        Fragment fragmentB = dVar.b();
        Lifecycle lifecycle = fragmentB != null ? fragmentB.getLifecycle() : null;
        if (lifecycle != null) {
            lifecycle.a(new v() { // from class: com.max.hbstory.widget.StoryViewPager2Container$observerLifecycle$2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // androidx.lifecycle.v
                public void d(@dl.d y source, @dl.d Lifecycle.Event event) {
                    rd.a aVar;
                    ViewPager2 pictureViewPager2;
                    if (PatchProxy.proxy(new Object[]{source, event}, this, changeQuickRedirect, false, bb.c.k.Zj, new Class[]{y.class, Lifecycle.Event.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(source, "source");
                    f0.p(event, "event");
                    if (event != Lifecycle.Event.ON_DESTROY || (aVar = this.f73061b.f73057d) == null || (pictureViewPager2 = this.f73061b.getPictureViewPager2()) == null) {
                        return;
                    }
                    pictureViewPager2.unregisterOnPageChangeCallback(aVar);
                }
            });
        }
    }

    private final void g(g gVar, int i10) {
        if (PatchProxy.proxy(new Object[]{gVar, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Sj, new Class[]{g.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        rd.a aVar = this.f73057d;
        if (aVar != null) {
            if (aVar == null) {
                return;
            }
            aVar.d(i10);
        } else {
            this.f73057d = new rd.a(gVar, i10);
            ViewPager2 pictureViewPager2 = getPictureViewPager2();
            rd.a aVar2 = this.f73057d;
            f0.m(aVar2);
            pictureViewPager2.registerOnPageChangeCallback(aVar2);
        }
    }

    private final void h(List<StoryImgObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.k.Uj, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        b bVar = this.f73056c;
        if (bVar != null) {
            bVar.r(list);
        }
        getPictureViewPager2().setOffscreenPageLimit(list.size());
        b bVar2 = this.f73056c;
        if (bVar2 != null) {
            bVar2.notifyDataSetChanged();
        }
        getPictureViewPager2().setCurrentItem(z.f130219j - (z.f130219j % list.size()), false);
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void c(@dl.d d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Vj, new Class[]{d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void e(@dl.d d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Wj, new Class[]{d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
        b(storyContext, i10);
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void f() {
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    /* JADX INFO: renamed from: getCoreViewBinding */
    public c mo41getCoreViewBinding() {
        return this.f73058e;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public int getMPosition() {
        return this.f73060g;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    public d getMStoryContext() {
        return this.f73059f;
    }

    @dl.d
    public final ViewPager2 getPictureViewPager2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Pj, new Class[0], ViewPager2.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewPager2) patchProxyResultProxy.result;
        }
        ViewPager2 viewPager2 = this.f73055b;
        if (viewPager2 != null) {
            return viewPager2;
        }
        f0.S("pictureViewPager2");
        return null;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void hide() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Yj, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(8);
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMPosition(int i10) {
        this.f73060g = i10;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMStoryContext(@e d dVar) {
        this.f73059f = dVar;
    }

    public final void setPictureViewPager2(@dl.d ViewPager2 viewPager2) {
        if (PatchProxy.proxy(new Object[]{viewPager2}, this, changeQuickRedirect, false, bb.c.k.Qj, new Class[]{ViewPager2.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewPager2, "<set-?>");
        this.f73055b = viewPager2;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void show() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Xj, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(0);
    }
}
