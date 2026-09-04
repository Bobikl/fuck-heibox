package com.max.xiaoheihe.module.story.widget.ui.video.widget;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: StoryBottomEditorBarWidget.kt */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class StoryBottomEditorBarWidget$mOnLikeTouchListener$2 extends FunctionReferenceImpl implements yh.a<b2> {
    public static ChangeQuickRedirect changeQuickRedirect;

    StoryBottomEditorBarWidget$mOnLikeTouchListener$2(Object obj) {
        super(0, obj, StoryBottomEditorBarWidget.class, "onDislike", "onDislike()V", 0);
    }

    public final void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44071, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        StoryBottomEditorBarWidget.p1((StoryBottomEditorBarWidget) this.receiver);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
    @Override // yh.a
    public /* bridge */ /* synthetic */ b2 invoke() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44072, new Class[0], Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        i();
        return b2.f124493a;
    }
}
