package com.max.hbcustomview.spans;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: ClickableForegroundSpan.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class d extends ClickableSpan {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f69513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f69514c;

    public d(int i10) {
        this(i10, false);
    }

    public d(int i10, boolean z10) {
        this.f69513b = i10;
        this.f69514c = z10;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (PatchProxy.proxy(new Object[]{textPaint}, this, changeQuickRedirect, false, bb.c.f.Sr, new Class[]{TextPaint.class}, Void.TYPE).isSupported) {
            return;
        }
        textPaint.setColor(this.f69513b);
        textPaint.setUnderlineText(this.f69514c);
    }
}
