package com.max.hbcustomview.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import bb.c;
import com.max.video.AbsVideoView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: VideoViewX.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class VideoViewX extends AbsVideoView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoViewX(@d Context context) {
        super(context);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoViewX(@d Context context, @e AttributeSet attributeSet) {
        super(context, attributeSet);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoViewX(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
    }

    @Override // com.max.video.AbsVideoView
    public boolean v(@d MotionEvent ev) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{ev}, this, changeQuickRedirect, false, c.f.Tv, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(ev, "ev");
        return false;
    }
}
