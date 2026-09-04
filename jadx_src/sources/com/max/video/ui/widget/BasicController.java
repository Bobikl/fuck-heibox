package com.max.video.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.max.hbvideo.R;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BasicController.kt */
/* JADX INFO: loaded from: classes8.dex */
public class BasicController extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicController(@dl.d Context context) {
        super(context);
        f0.p(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.video_basic_controller, (ViewGroup) this, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicController(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        super(context, attributeSet);
        f0.p(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.video_basic_controller, (ViewGroup) this, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicController(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.video_basic_controller, (ViewGroup) this, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicController(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        f0.p(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.video_basic_controller, (ViewGroup) this, true);
    }
}
