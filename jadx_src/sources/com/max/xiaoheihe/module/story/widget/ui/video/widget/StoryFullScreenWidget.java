package com.max.xiaoheihe.module.story.widget.ui.video.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.o;
import androidx.lifecycle.LiveData;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.bean.StoryLinkCardInfoObj;
import com.max.hbstory.bean.StoryVideoInfoObj;
import com.max.hbstory.g;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.cb0;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import l3.c;
import xh.i;

/* JADX INFO: compiled from: StoryFullScreenWidget.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class StoryFullScreenWidget extends LinearLayout implements com.max.hbstory.viewpage2.video.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f92308f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final cb0 f92309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private com.max.hbstory.d f92310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f92311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private final View.OnClickListener f92312e;

    /* JADX INFO: compiled from: StoryFullScreenWidget.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            com.max.hbstory.d mStoryContext;
            g gVarD;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44203, new Class[]{View.class}, Void.TYPE).isSupported || (mStoryContext = StoryFullScreenWidget.this.getMStoryContext()) == null || (gVarD = mStoryContext.d()) == null) {
                return;
            }
            gVarD.r0(true);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryFullScreenWidget(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryFullScreenWidget(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public StoryFullScreenWidget(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f92312e = new a();
        cb0 cb0VarD = cb0.d(LayoutInflater.from(context), this, true);
        f0.o(cb0VarD, "inflate(inflater, this, true)");
        cb0VarD.f109284c.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
        this.f92309b = cb0VarD;
    }

    public /* synthetic */ StoryFullScreenWidget(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final int a(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 44199, new Class[]{cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        f0.o(displayMetrics, "resources.displayMetrics");
        int i12 = (int) (displayMetrics.widthPixels / (i10 / i11));
        return ((int) ((((displayMetrics.heightPixels - i12) - getContext().getResources().getDimension(R.dimen.bottom_bar_height)) - ((int) getContext().getResources().getDimension(R.dimen.fullscreen_icon_height_with_margin))) / 2)) + i12 + ((int) getContext().getResources().getDimension(R.dimen.fullscreen_icon_top_margin));
    }

    private final void b(int i10) {
        StoryItemsObj storyItemsObj;
        StoryLinkCardInfoObj link_card_info;
        StoryVideoInfoObj video_info;
        g gVarD;
        LiveData<List<StoryItemsObj>> liveDataF;
        int i11 = 0;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 44198, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbstory.d mStoryContext = getMStoryContext();
        List<StoryItemsObj> listF = (mStoryContext == null || (gVarD = mStoryContext.d()) == null || (liveDataF = gVarD.F()) == null) ? null : liveDataF.f();
        if (listF == null || (storyItemsObj = listF.get(i10)) == null || (link_card_info = storyItemsObj.getLink_card_info()) == null || (video_info = link_card_info.getVideo_info()) == null) {
            return;
        }
        if (video_info.getWidth() > video_info.getHeight()) {
            setOnClickListener(this.f92312e);
            int iA = a(video_info.getWidth(), video_info.getHeight());
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            f0.o(layoutParams, "layoutParams");
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iA;
                setLayoutParams(layoutParams);
            }
        } else {
            i11 = 8;
        }
        setVisibility(i11);
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void c(@d com.max.hbstory.d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 44194, new Class[]{com.max.hbstory.d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void e(@d com.max.hbstory.d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 44195, new Class[]{com.max.hbstory.d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
        setMStoryContext(storyContext);
        setMPosition(i10);
        b(i10);
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void f() {
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @d
    /* JADX INFO: renamed from: getCoreViewBinding */
    public cb0 mo41getCoreViewBinding() {
        return this.f92309b;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    /* JADX INFO: renamed from: getCoreViewBinding */
    public /* bridge */ /* synthetic */ c mo41getCoreViewBinding() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44202, new Class[0], c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : mo41getCoreViewBinding();
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public int getMPosition() {
        return this.f92311d;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    public com.max.hbstory.d getMStoryContext() {
        return this.f92310c;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void hide() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44201, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44196, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        setOnClickListener(this.f92312e);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44197, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOnClickListener(null);
        super.onDetachedFromWindow();
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMPosition(int i10) {
        this.f92311d = i10;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMStoryContext(@e com.max.hbstory.d dVar) {
        this.f92310c = dVar;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void show() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44200, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(0);
    }
}
