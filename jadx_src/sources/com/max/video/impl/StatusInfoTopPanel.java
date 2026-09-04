package com.max.video.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.video.ui.TopPanel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import xd.g;

/* JADX INFO: compiled from: StatusInfoTopPanel.kt */
/* JADX INFO: loaded from: classes8.dex */
public class StatusInfoTopPanel extends TopPanel {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final g f76032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private ze.e f76033c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusInfoTopPanel(@dl.d Context context) {
        super(context);
        f0.p(context, "context");
        g gVarD = g.d(LayoutInflater.from(getContext()), this, true);
        f0.o(gVarD, "inflate(...)");
        this.f76032b = gVarD;
        gVarD.f141281b.setOnClickListener(new View.OnClickListener() { // from class: com.max.video.impl.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StatusInfoTopPanel.f(this.f76048b, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusInfoTopPanel(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        super(context, attributeSet);
        f0.p(context, "context");
        g gVarD = g.d(LayoutInflater.from(getContext()), this, true);
        f0.o(gVarD, "inflate(...)");
        this.f76032b = gVarD;
        gVarD.f141281b.setOnClickListener(new View.OnClickListener() { // from class: com.max.video.impl.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StatusInfoTopPanel.f(this.f76048b, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusInfoTopPanel(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        g gVarD = g.d(LayoutInflater.from(getContext()), this, true);
        f0.o(gVarD, "inflate(...)");
        this.f76032b = gVarD;
        gVarD.f141281b.setOnClickListener(new View.OnClickListener() { // from class: com.max.video.impl.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StatusInfoTopPanel.f(this.f76048b, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusInfoTopPanel(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        f0.p(context, "context");
        g gVarD = g.d(LayoutInflater.from(getContext()), this, true);
        f0.o(gVarD, "inflate(...)");
        this.f76032b = gVarD;
        gVarD.f141281b.setOnClickListener(new View.OnClickListener() { // from class: com.max.video.impl.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StatusInfoTopPanel.f(this.f76048b, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(StatusInfoTopPanel this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.m.wn, new Class[]{StatusInfoTopPanel.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        ze.e eVar = this$0.f76033c;
        if (eVar != null) {
            eVar.invoke();
        }
    }

    @Override // com.max.video.ui.TopPanel
    public void b(@dl.d com.max.video.ui.widget.f action) {
        if (PatchProxy.proxy(new Object[]{action}, this, changeQuickRedirect, false, bb.c.m.un, new Class[]{com.max.video.ui.widget.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(action, "action");
        new LinearLayout.LayoutParams(-2, -2);
        this.f76032b.f141284e.addView(action.c());
        this.f76032b.f141285f.requestLayout();
    }

    @dl.e
    public final ze.e getBackwardAction() {
        return this.f76033c;
    }

    @dl.d
    public final g getBinding() {
        return this.f76032b;
    }

    public final void setBackwardAction(@dl.e ze.e eVar) {
        this.f76033c = eVar;
    }

    public final void setTitle(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.vn, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f76032b.f141283d;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
    }
}
