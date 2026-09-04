package com.max.xiaoheihe.module.expression.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class HeyBoxEditText extends AppCompatEditText {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f83620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f83621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f83622i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f83623j;

    public interface a {
        void a();
    }

    public HeyBoxEditText(Context context) {
        super(context);
        this.f83620g = (int) getTextSize();
    }

    public HeyBoxEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet);
    }

    public HeyBoxEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c(attributeSet);
    }

    private void c(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, 31521, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.O0);
        this.f83620g = (int) typedArrayObtainStyledAttributes.getDimension(8, getTextSize());
        this.f83621h = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f83622i = typedArrayObtainStyledAttributes.getBoolean(7, true);
        typedArrayObtainStyledAttributes.recycle();
        setText(getText());
    }

    private void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31524, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.expression.core.a.g(getContext(), getText(), this.f83620g, false, this.f83621h, this.f83622i, true, this);
    }

    public a getContextMenuItemSelectedListener() {
        return this.f83623j;
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        Object[] objArr = {charSequence, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 31523, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onTextChanged(charSequence, i10, i11, i12);
        d();
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        a aVar;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 31522, new Class[]{Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        boolean zOnTextContextMenuItem = super.onTextContextMenuItem(i10);
        if (i10 == 16908322 && (aVar = this.f83623j) != null) {
            aVar.a();
        }
        return zOnTextContextMenuItem;
    }

    public void setContextMenuItemSelectedListener(a aVar) {
        this.f83623j = aVar;
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Float(f10)}, this, changeQuickRedirect, false, 31525, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 0) {
            this.f83620g = (int) f10;
        } else {
            this.f83620g = ViewUtils.f(getContext(), f10);
        }
        super.setTextSize(i10, f10);
    }
}
