package com.max.hbcustomview.spans;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ClickableMovementMethod.java */
/* JADX INFO: loaded from: classes10.dex */
public class f extends LinkMovementMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f69515a;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static f a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.f.Tr, new Class[0], f.class);
        if (patchProxyResultProxy.isSupported) {
            return (f) patchProxyResultProxy.result;
        }
        if (f69515a == null) {
            f69515a = new f();
        }
        return f69515a;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textView, spannable, motionEvent}, this, changeQuickRedirect, false, bb.c.f.Ur, new Class[]{TextView.class, Spannable.class, MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int totalPaddingLeft = x10 - textView.getTotalPaddingLeft();
            int totalPaddingTop = y10 - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            int scrollY = totalPaddingTop + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            e[] eVarArr = (e[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, e.class);
            if (clickableSpanArr.length != 0) {
                if (action == 1) {
                    clickableSpanArr[0].onClick(textView);
                } else if (action == 0) {
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpanArr[0]), spannable.getSpanEnd(clickableSpanArr[0]));
                }
                return true;
            }
            if (eVarArr.length != 0) {
                if (action == 1) {
                    eVarArr[0].a(textView);
                } else if (action == 0) {
                    Selection.setSelection(spannable, spannable.getSpanStart(eVarArr[0]), spannable.getSpanEnd(eVarArr[0]));
                }
                return true;
            }
            Selection.removeSelection(spannable);
        }
        return false;
    }
}
