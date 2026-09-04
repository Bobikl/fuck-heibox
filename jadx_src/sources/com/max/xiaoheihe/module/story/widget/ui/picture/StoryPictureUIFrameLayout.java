package com.max.xiaoheihe.module.story.widget.ui.picture;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.o;
import com.max.hbstory.viewpage2.video.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.db0;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import l3.c;
import xh.i;

/* JADX INFO: compiled from: StoryPictureUIFrameLayout.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class StoryPictureUIFrameLayout extends FrameLayout implements a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f92142e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final db0 f92143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private com.max.hbstory.d f92144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f92145d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryPictureUIFrameLayout(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryPictureUIFrameLayout(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public StoryPictureUIFrameLayout(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        db0 db0VarD = db0.d(LayoutInflater.from(context), this, true);
        f0.o(db0VarD, "inflate(LayoutInflater.from(context), this, true)");
        this.f92143b = db0VarD;
        this.f92145d = -1;
    }

    public /* synthetic */ StoryPictureUIFrameLayout(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void c(@d com.max.hbstory.d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 43873, new Class[]{com.max.hbstory.d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void e(@d com.max.hbstory.d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 43874, new Class[]{com.max.hbstory.d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
        setMStoryContext(storyContext);
        setMPosition(i10);
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void f() {
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @d
    /* JADX INFO: renamed from: getCoreViewBinding */
    public db0 mo41getCoreViewBinding() {
        return this.f92143b;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    /* JADX INFO: renamed from: getCoreViewBinding */
    public /* bridge */ /* synthetic */ c mo41getCoreViewBinding() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43875, new Class[0], c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : mo41getCoreViewBinding();
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public int getMPosition() {
        return this.f92145d;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    public com.max.hbstory.d getMStoryContext() {
        return this.f92144c;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void hide() {
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMPosition(int i10) {
        this.f92145d = i10;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMStoryContext(@e com.max.hbstory.d dVar) {
        this.f92144c = dVar;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void show() {
    }
}
