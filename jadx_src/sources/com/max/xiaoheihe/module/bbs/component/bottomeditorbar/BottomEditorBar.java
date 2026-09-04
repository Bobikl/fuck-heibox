package com.max.xiaoheihe.module.bbs.component.bottomeditorbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.webview.component.WebviewBottomEditorBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: BottomEditorBar.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class BottomEditorBar extends RelativeLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f80958c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private BaseBottomEditorBar f80959b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public BottomEditorBar(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public BottomEditorBar(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public BottomEditorBar(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        b(context, attributeSet, i10);
    }

    public /* synthetic */ BottomEditorBar(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void a(int i10) {
        BaseBottomEditorBar bottomEditorBarPostPageImpl;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 27903, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 1) {
            Context context = getContext();
            f0.o(context, "context");
            bottomEditorBarPostPageImpl = new BottomEditorBarPostPageImpl(context, null, 0, 6, null);
        } else if (i10 != 3) {
            Context context2 = getContext();
            f0.o(context2, "context");
            bottomEditorBarPostPageImpl = new BottomEditorBarPostPageImpl(context2, null, 0, 6, null);
        } else {
            Context context3 = getContext();
            f0.o(context3, "context");
            bottomEditorBarPostPageImpl = new WebviewBottomEditorBar(context3);
        }
        this.f80959b = bottomEditorBarPostPageImpl;
        addView(this.f80959b, new ViewGroup.LayoutParams(-1, -1));
        bottomEditorBarPostPageImpl.setVisibility(0);
    }

    private final void b(Context context, AttributeSet attributeSet, int i10) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet, new Integer(i10)}, this, changeQuickRedirect, false, 27902, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE).isSupported || attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.O, i10, 0);
        f0.o(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…itorBar, defStyleAttr, 0)");
        a(typedArrayObtainStyledAttributes.getInt(0, 1));
        typedArrayObtainStyledAttributes.recycle();
    }

    @e
    public final BaseBottomEditorBar getInstance() {
        return this.f80959b;
    }

    public final void setInstance(@e BaseBottomEditorBar baseBottomEditorBar) {
        this.f80959b = baseBottomEditorBar;
    }
}
