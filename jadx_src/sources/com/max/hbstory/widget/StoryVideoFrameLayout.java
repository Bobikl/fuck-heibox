package com.max.hbstory.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.bean.StoryLinkCardInfoObj;
import com.max.hbstory.bean.StoryVideoInfoObj;
import com.max.hbstory.d;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.hbstory.viewpage2.video.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import l3.c;
import xh.i;

/* JADX INFO: compiled from: StoryVideoFrameLayout.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class StoryVideoFrameLayout extends FrameLayout implements a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private final c f73052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private d f73053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f73054d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryVideoFrameLayout(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryVideoFrameLayout(@dl.d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public StoryVideoFrameLayout(@dl.d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f73054d = -1;
    }

    public /* synthetic */ StoryVideoFrameLayout(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void c(@dl.d d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Nj, new Class[]{d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void e(@dl.d d storyContext, int i10) {
        StoryLinkCardInfoObj link_card_info;
        StoryVideoInfoObj video_info;
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Oj, new Class[]{d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
        setMStoryContext(storyContext);
        setMPosition(i10);
        StoryItemsObj storyItemsObjN = StoryUtilsKt.n(this, getMPosition());
        if (storyItemsObjN == null || (link_card_info = storyItemsObjN.getLink_card_info()) == null || (video_info = link_card_info.getVideo_info()) == null) {
            return;
        }
        StoryUtilsKt.b(this, 0.0f, 0, video_info.getWidth(), video_info.getHeight(), true);
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void f() {
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    /* JADX INFO: renamed from: getCoreViewBinding */
    public c mo41getCoreViewBinding() {
        return this.f73052b;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public int getMPosition() {
        return this.f73054d;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    public d getMStoryContext() {
        return this.f73053c;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void hide() {
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMPosition(int i10) {
        this.f73054d = i10;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMStoryContext(@e d dVar) {
        this.f73053c = dVar;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void show() {
    }
}
