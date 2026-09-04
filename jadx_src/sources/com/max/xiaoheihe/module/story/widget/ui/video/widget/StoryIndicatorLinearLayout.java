package com.max.xiaoheihe.module.story.widget.ui.video.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import com.max.hbstory.bean.StoryCardIdInfoObj;
import com.max.hbstory.bean.StoryImgInfoObj;
import com.max.hbstory.bean.StoryImgObj;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.bean.StoryLinkCardInfoObj;
import com.max.hbstory.d;
import com.max.hbstory.g;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.xiaoheihe.module.story.comment.HBIndicatorLinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import l3.c;
import xh.i;

/* JADX INFO: compiled from: StoryIndicatorLinearLayout.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class StoryIndicatorLinearLayout extends HBIndicatorLinearLayout implements com.max.hbstory.viewpage2.video.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f92314l = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @e
    private final c f92315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @e
    private d f92316i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f92317j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f92318k;

    /* JADX INFO: compiled from: StoryIndicatorLinearLayout.kt */
    public static final class a implements j0<Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Integer num) {
            if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 44214, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(num);
        }

        public final void b(Integer index) {
            if (!PatchProxy.proxy(new Object[]{index}, this, changeQuickRedirect, false, 44213, new Class[]{Integer.class}, Void.TYPE).isSupported && StoryUtilsKt.h(StoryIndicatorLinearLayout.this)) {
                StoryIndicatorLinearLayout storyIndicatorLinearLayout = StoryIndicatorLinearLayout.this;
                f0.o(index, "index");
                StoryIndicatorLinearLayout.h(storyIndicatorLinearLayout, index.intValue());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryIndicatorLinearLayout(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryIndicatorLinearLayout(@dl.d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public StoryIndicatorLinearLayout(@dl.d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f92317j = -1;
    }

    public /* synthetic */ StoryIndicatorLinearLayout(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final int getCurrentPicture() {
        Integer numF;
        g gVarD;
        LiveData<Integer> liveDataO;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44209, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (!StoryUtilsKt.h(this)) {
            return 0;
        }
        d mStoryContext = getMStoryContext();
        if (mStoryContext == null || (gVarD = mStoryContext.d()) == null || (liveDataO = gVarD.o()) == null || (numF = liveDataO.f()) == null) {
            numF = 0;
        }
        return numF.intValue();
    }

    public static final /* synthetic */ void h(StoryIndicatorLinearLayout storyIndicatorLinearLayout, int i10) {
        if (PatchProxy.proxy(new Object[]{storyIndicatorLinearLayout, new Integer(i10)}, null, changeQuickRedirect, true, 44212, new Class[]{StoryIndicatorLinearLayout.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        storyIndicatorLinearLayout.i(i10);
    }

    private final void i(int i10) {
        StoryItemsObj storyItemsObjN;
        StoryLinkCardInfoObj link_card_info;
        StoryImgInfoObj img_info;
        List<StoryImgObj> images;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 44211, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (storyItemsObjN = StoryUtilsKt.n(this, getMPosition())) == null || (link_card_info = storyItemsObjN.getLink_card_info()) == null || (img_info = link_card_info.getImg_info()) == null || (images = img_info.getImages()) == null) {
            return;
        }
        b(i10 % images.size());
    }

    private final void j() {
        StoryItemsObj storyItemsObj;
        StoryImgInfoObj img_info;
        g gVarD;
        LiveData<List<StoryItemsObj>> liveDataF;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44208, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        d mStoryContext = getMStoryContext();
        List<StoryImgObj> images = null;
        List<StoryItemsObj> listF = (mStoryContext == null || (gVarD = mStoryContext.d()) == null || (liveDataF = gVarD.F()) == null) ? null : liveDataF.f();
        if (listF == null || (storyItemsObj = listF.get(getMPosition())) == null) {
            return;
        }
        StoryCardIdInfoObj card_id_info = storyItemsObj.getCard_id_info();
        if (card_id_info != null && card_id_info.getCard_type() == 2) {
            StoryLinkCardInfoObj link_card_info = storyItemsObj.getLink_card_info();
            if (link_card_info != null && (img_info = link_card_info.getImg_info()) != null) {
                images = img_info.getImages();
            }
            if (images == null || images.isEmpty()) {
                hide();
                return;
            }
            setItems(images, getCurrentPicture());
            if (!this.f92318k) {
                this.f92318k = true;
                k();
            }
            show();
        }
    }

    private final void k() {
        d mStoryContext;
        Fragment fragmentB;
        d mStoryContext2;
        g gVarD;
        LiveData<Integer> liveDataO;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44210, new Class[0], Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null || (fragmentB = mStoryContext.b()) == null || (mStoryContext2 = getMStoryContext()) == null || (gVarD = mStoryContext2.d()) == null || (liveDataO = gVarD.o()) == null) {
            return;
        }
        liveDataO.k(fragmentB, new a());
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void c(@dl.d d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 44204, new Class[]{d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void e(@dl.d d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 44205, new Class[]{d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
        setMStoryContext(storyContext);
        setMPosition(i10);
        j();
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void f() {
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    /* JADX INFO: renamed from: getCoreViewBinding */
    public c mo41getCoreViewBinding() {
        return this.f92315h;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public int getMPosition() {
        return this.f92317j;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    public d getMStoryContext() {
        return this.f92316i;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void hide() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44207, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(8);
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMPosition(int i10) {
        this.f92317j = i10;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMStoryContext(@e d dVar) {
        this.f92316i = dVar;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void show() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44206, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(0);
    }
}
