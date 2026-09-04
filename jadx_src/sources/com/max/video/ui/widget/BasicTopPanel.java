package com.max.video.ui.widget;

import af.h;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbvideo.R;
import com.max.video.ui.TopPanel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BasicTopPanel.kt */
/* JADX INFO: loaded from: classes8.dex */
public class BasicTopPanel extends TopPanel implements h {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private ze.e f76106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f76107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ImageView f76108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ImageView f76109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextView f76110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LinearLayout f76111g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTopPanel(@dl.d Context context) {
        super(context);
        f0.p(context, "context");
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.video_basic_top_panel, (ViewGroup) this, true);
        this.f76107c = viewInflate;
        this.f76108d = (ImageView) viewInflate.findViewById(R.id.iv_isp);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_backward);
        this.f76109e = imageView;
        this.f76110f = (TextView) viewInflate.findViewById(R.id.tv_title);
        this.f76111g = (LinearLayout) viewInflate.findViewById(R.id.vg_ext);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.max.video.ui.widget.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BasicTopPanel.f(this.f76128b, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTopPanel(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        super(context, attributeSet);
        f0.p(context, "context");
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.video_basic_top_panel, (ViewGroup) this, true);
        this.f76107c = viewInflate;
        this.f76108d = (ImageView) viewInflate.findViewById(R.id.iv_isp);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_backward);
        this.f76109e = imageView;
        this.f76110f = (TextView) viewInflate.findViewById(R.id.tv_title);
        this.f76111g = (LinearLayout) viewInflate.findViewById(R.id.vg_ext);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.max.video.ui.widget.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BasicTopPanel.f(this.f76128b, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTopPanel(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.video_basic_top_panel, (ViewGroup) this, true);
        this.f76107c = viewInflate;
        this.f76108d = (ImageView) viewInflate.findViewById(R.id.iv_isp);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_backward);
        this.f76109e = imageView;
        this.f76110f = (TextView) viewInflate.findViewById(R.id.tv_title);
        this.f76111g = (LinearLayout) viewInflate.findViewById(R.id.vg_ext);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.max.video.ui.widget.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BasicTopPanel.f(this.f76128b, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTopPanel(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        f0.p(context, "context");
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.video_basic_top_panel, (ViewGroup) this, true);
        this.f76107c = viewInflate;
        this.f76108d = (ImageView) viewInflate.findViewById(R.id.iv_isp);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_backward);
        this.f76109e = imageView;
        this.f76110f = (TextView) viewInflate.findViewById(R.id.tv_title);
        this.f76111g = (LinearLayout) viewInflate.findViewById(R.id.vg_ext);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.max.video.ui.widget.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BasicTopPanel.f(this.f76128b, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(BasicTopPanel this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.m.Bq, new Class[]{BasicTopPanel.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        ze.e eVar = this$0.f76106b;
        if (eVar != null) {
            eVar.invoke();
        }
    }

    @Override // com.max.video.ui.TopPanel
    public void b(@dl.d f action) {
        if (PatchProxy.proxy(new Object[]{action}, this, changeQuickRedirect, false, bb.c.m.Aq, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(action, "action");
        this.f76111g.addView(action.c());
    }

    @dl.e
    public final ze.e getBackwardAction() {
        return this.f76106b;
    }

    @Override // af.h
    public void h(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.zq, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f76110f.setText(str);
    }

    public final void setBackwardAction(@dl.e ze.e eVar) {
        this.f76106b = eVar;
    }
}
