package com.max.hbcustomview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes10.dex */
public class CustomHorizontalScrollView extends HorizontalScrollListView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f68396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f68397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f68398f;

    public interface a {
        void a(int i10, int i11);
    }

    public CustomHorizontalScrollView(Context context) {
        super(context);
        this.f68396d = true;
    }

    public CustomHorizontalScrollView(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68396d = true;
    }

    public CustomHorizontalScrollView(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f68396d = true;
    }

    public boolean getDirection() {
        return this.f68396d;
    }

    public Runnable getRunnable() {
        return this.f68397e;
    }

    @Override // com.max.hbcustomview.HorizontalScrollListView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.J3, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onScrollChanged(i10, i11, i12, i13);
        a aVar = this.f68398f;
        if (aVar != null) {
            aVar.a(i10, i11);
        }
    }

    public void setDirection(boolean z10) {
        this.f68396d = z10;
    }

    public void setOnScrollListener(a aVar) {
        this.f68398f = aVar;
    }

    public void setRunnable(Runnable runnable) {
        this.f68397e = runnable;
    }
}
