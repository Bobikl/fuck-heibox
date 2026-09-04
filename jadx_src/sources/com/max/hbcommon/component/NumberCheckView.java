package com.max.hbcommon.component;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.max.hbcommon.R;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: NumberCheckView.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class NumberCheckView extends AppCompatTextView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final a f67149d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f67150e = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f67151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private b f67152c;

    /* JADX INFO: compiled from: NumberCheckView.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: NumberCheckView.kt */
    public interface b {
        boolean a();

        void b(boolean z10);

        int c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberCheckView(@dl.d Context context) {
        super(context);
        kotlin.jvm.internal.f0.p(context, "context");
        this.f67151b = -1;
        setGravity(17);
        setTextSize(1, 15.0f);
        setTextColor(getContext().getResources().getColor(R.color.text_primary_1_not_change_color));
        setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NumberCheckView.g(this.f67792b, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberCheckView(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.f0.p(context, "context");
        this.f67151b = -1;
        setGravity(17);
        setTextSize(1, 15.0f);
        setTextColor(getContext().getResources().getColor(R.color.text_primary_1_not_change_color));
        setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NumberCheckView.g(this.f67792b, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberCheckView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.f0.p(context, "context");
        this.f67151b = -1;
        setGravity(17);
        setTextSize(1, 15.0f);
        setTextColor(getContext().getResources().getColor(R.color.text_primary_1_not_change_color));
        setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NumberCheckView.g(this.f67792b, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(NumberCheckView this$0, View view) {
        b bVar;
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.d.f31463pd, new Class[]{NumberCheckView.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        Log.d("NumberCheckView", "onclick");
        int iC = -1;
        if (!this$0.h() && (bVar = this$0.f67152c) != null) {
            iC = bVar.c() + 1;
        }
        setCheckNumber$default(this$0, iC, false, 2, null);
    }

    public static /* synthetic */ void setCheckNumber$default(NumberCheckView numberCheckView, int i10, boolean z10, int i11, Object obj) {
        Object[] objArr = {numberCheckView, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.f31417nd, new Class[]{NumberCheckView.class, cls, Boolean.TYPE, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i11 & 2) != 0) {
            z10 = true;
        }
        numberCheckView.setCheckNumber(i10, z10);
    }

    private final void setChecked(boolean z10) {
        int iW;
        if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31440od, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported && (iW = ViewUtils.W(this)) > 0) {
            if (z10) {
                setText(String.valueOf(this.f67151b));
                setBackground(ViewUtils.j(iW / 2, getContext().getResources().getColor(R.color.white)));
            } else {
                setText((CharSequence) null);
                setBackground(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(getContext(), R.color.text_primary_1_not_change_color_alpha40, ViewUtils.h0(getContext(), iW / 2)), getContext(), R.color.white, 1.0f));
            }
        }
    }

    @dl.e
    public final b getOnCheckedChangeListener() {
        return this.f67152c;
    }

    public final boolean h() {
        return this.f67151b != -1;
    }

    public final void setCheckNumber(int i10, boolean z10) {
        b bVar;
        b bVar2;
        boolean z11 = false;
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31394md, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        boolean z12 = i10 != -1;
        if (!z12) {
            this.f67151b = i10;
            setChecked(z12);
            if (!z10 || (bVar = this.f67152c) == null) {
                return;
            }
            bVar.b(z12);
            return;
        }
        b bVar3 = this.f67152c;
        if (bVar3 != null && bVar3.a()) {
            z11 = true;
        }
        if (!z11 && z10) {
            if (z10) {
                com.max.hbutils.utils.c.f("图片已经选择完成");
            }
        } else {
            this.f67151b = i10;
            setChecked(z12);
            if (!z10 || (bVar2 = this.f67152c) == null) {
                return;
            }
            bVar2.b(z12);
        }
    }

    public final void setOnCheckedChangeListener(@dl.e b bVar) {
        this.f67152c = bVar;
    }
}
