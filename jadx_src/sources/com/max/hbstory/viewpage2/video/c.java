package com.max.hbstory.viewpage2.video;

import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: StoryViewHolder.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class c extends RecyclerView.ViewHolder implements a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final l3.c f73035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private com.max.hbstory.d f73036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f73037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@dl.d l3.c coreViewBinding) {
        super(coreViewBinding.getRoot());
        f0.p(coreViewBinding, "coreViewBinding");
        this.f73035b = coreViewBinding;
        this.f73037d = -1;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void c(@dl.d com.max.hbstory.d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Vi, new Class[]{com.max.hbstory.d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void e(@dl.d com.max.hbstory.d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Wi, new Class[]{com.max.hbstory.d.class, Integer.TYPE}, Void.TYPE).isSupported) {
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
    @dl.d
    /* JADX INFO: renamed from: getCoreViewBinding */
    public l3.c mo41getCoreViewBinding() {
        return this.f73035b;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public int getMPosition() {
        return this.f73037d;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @dl.e
    public com.max.hbstory.d getMStoryContext() {
        return this.f73036c;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void hide() {
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMPosition(int i10) {
        this.f73037d = i10;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMStoryContext(@dl.e com.max.hbstory.d dVar) {
        this.f73036c = dVar;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void show() {
    }
}
