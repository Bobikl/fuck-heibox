package com.max.hbexpression.widget;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.style.LineHeightSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: CompactFontPaddingTextView.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class CompactFontPaddingTextView extends AppCompatTextView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: CompactFontPaddingTextView.kt */
    public final class a implements LineHeightSpan {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
        }

        @Override // android.text.style.LineHeightSpan
        public void chooseHeight(@d CharSequence text, int i10, int i11, int i12, int i13, @d Paint.FontMetricsInt fm) {
            Object[] objArr = {text, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), fm};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.g.W3, new Class[]{CharSequence.class, cls, cls, cls, cls, Paint.FontMetricsInt.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(text, "text");
            f0.p(fm, "fm");
            Rect rect = new Rect();
            CompactFontPaddingTextView.this.getPaint().getTextBounds(text.toString(), 0, text.length(), rect);
            int i14 = fm.descent - fm.ascent;
            int iMax = Math.max((int) CompactFontPaddingTextView.this.getTextSize(), rect.bottom - rect.top);
            int iAbs = Math.abs(fm.ascent - rect.top);
            int i15 = fm.descent - rect.bottom;
            int i16 = (i14 - iMax) / 2;
            if (i16 < Math.min(iAbs, i15)) {
                fm.ascent += i16;
                fm.descent -= i16;
            } else if (iAbs >= i15) {
                fm.ascent = fm.descent - iMax;
                fm.descent = rect.bottom;
            } else {
                int i17 = rect.top;
                fm.ascent = i17;
                fm.descent = iMax + i17;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public CompactFontPaddingTextView(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public CompactFontPaddingTextView(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public CompactFontPaddingTextView(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        setIncludeFontPadding(false);
    }

    public /* synthetic */ CompactFontPaddingTextView(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final SpannableStringBuilder f(CharSequence charSequence) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, c.g.V3, new Class[]{CharSequence.class}, SpannableStringBuilder.class);
        if (patchProxyResultProxy.isSupported) {
            return (SpannableStringBuilder) patchProxyResultProxy.result;
        }
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new a(), 0, charSequence.length(), 33);
        return spannableStringBuilder;
    }

    @Override // android.widget.TextView
    public void setText(@e CharSequence charSequence, @e TextView.BufferType bufferType) {
        if (PatchProxy.proxy(new Object[]{charSequence, bufferType}, this, changeQuickRedirect, false, c.g.U3, new Class[]{CharSequence.class, TextView.BufferType.class}, Void.TYPE).isSupported) {
            return;
        }
        super.setText(f(charSequence), bufferType);
    }
}
