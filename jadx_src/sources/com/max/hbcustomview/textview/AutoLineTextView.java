package com.max.hbcustomview.textview;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: AutoLineTextView.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class AutoLineTextView extends AppCompatTextView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private a f69590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f69591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f69592d;

    /* JADX INFO: compiled from: AutoLineTextView.kt */
    public interface a {
        void a(int i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public AutoLineTextView(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public AutoLineTextView(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public AutoLineTextView(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f69591c = 2;
        this.f69592d = 1;
    }

    public /* synthetic */ AutoLineTextView(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Tt, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TextPaint paint = getPaint();
        f0.o(paint, "getPaint(...)");
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(getText().toString(), 0, getText().length(), paint, (getWidth() - getPaddingLeft()) - getPaddingRight()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(false).build();
        f0.o(staticLayoutBuild, "build(...)");
        int lineCount = staticLayoutBuild.getLineCount();
        int i10 = this.f69591c;
        if (lineCount > i10) {
            setMaxLines(i10);
        } else {
            setMaxLines(lineCount);
        }
        this.f69592d = lineCount;
        a aVar = this.f69590b;
        if (aVar != null) {
            aVar.a(lineCount);
        }
    }

    public final int getCurrentLineCount() {
        return this.f69592d;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.St, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onSizeChanged(i10, i11, i12, i13);
        f();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(@e CharSequence charSequence, int i10, int i11, int i12) {
        Object[] objArr = {charSequence, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Rt, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onTextChanged(charSequence, i10, i11, i12);
        f();
    }

    public final void setCurrentLineCount(int i10) {
        this.f69592d = i10;
    }

    public final void setOnLineCountChangedListener(@e a aVar) {
        this.f69590b = aVar;
    }
}
