package com.max.hbstory.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import bb.c;
import com.max.hbstory.viewpage2.video.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: StoryGestureFrameLayout.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class StoryGestureFrameLayout extends ConstraintLayout implements a {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final pd.a J;

    @e
    private com.max.hbstory.d K;
    private int L;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryGestureFrameLayout(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryGestureFrameLayout(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public StoryGestureFrameLayout(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        pd.a aVarB = pd.a.b(LayoutInflater.from(context), this);
        f0.o(aVarB, "inflate(...)");
        this.J = aVarB;
        this.L = -1;
    }

    public /* synthetic */ StoryGestureFrameLayout(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void c(@d com.max.hbstory.d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, c.k.Kj, new Class[]{com.max.hbstory.d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void e(@d com.max.hbstory.d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, c.k.Lj, new Class[]{com.max.hbstory.d.class, Integer.TYPE}, Void.TYPE).isSupported) {
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
    /* JADX INFO: renamed from: getCoreViewBinding */
    public /* bridge */ /* synthetic */ l3.c mo41getCoreViewBinding() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Mj, new Class[0], l3.c.class);
        return patchProxyResultProxy.isSupported ? (l3.c) patchProxyResultProxy.result : mo41getCoreViewBinding();
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @d
    /* JADX INFO: renamed from: getCoreViewBinding */
    public pd.a mo41getCoreViewBinding() {
        return this.J;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public int getMPosition() {
        return this.L;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    public com.max.hbstory.d getMStoryContext() {
        return this.K;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void hide() {
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMPosition(int i10) {
        this.L = i10;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMStoryContext(@e com.max.hbstory.d dVar) {
        this.K = dVar;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void show() {
    }
}
