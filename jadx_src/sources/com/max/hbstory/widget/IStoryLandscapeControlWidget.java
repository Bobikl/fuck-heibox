package com.max.hbstory.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.max.hbcustomview.video.VideoViewX;
import com.max.video.impl.PlainVideoUI;
import com.meituan.robust.ChangeQuickRedirect;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: IStoryLandscapeControlWidget.kt */
/* JADX INFO: loaded from: classes13.dex */
public abstract class IStoryLandscapeControlWidget extends PlainVideoUI {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public IStoryLandscapeControlWidget(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public IStoryLandscapeControlWidget(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public IStoryLandscapeControlWidget(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
    }

    public /* synthetic */ IStoryLandscapeControlWidget(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public abstract void W(@d VideoViewX videoViewX, @d com.max.hbstory.d dVar, int i10);
}
