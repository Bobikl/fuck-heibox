package com.tencent.open.c;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class a extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f101071a = a.class.getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rect f101072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f101073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC0976a f101074d;

    /* JADX INFO: renamed from: com.tencent.open.c.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ProGuard */
    public interface InterfaceC0976a {
        void a();

        void a(int i10);
    }

    public a(Context context) {
        super(context);
        this.f101072b = null;
        this.f101073c = false;
        this.f101074d = null;
        this.f101072b = new Rect();
    }

    public void a(InterfaceC0976a interfaceC0976a) {
        this.f101074d = interfaceC0976a;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        Activity activity = (Activity) getContext();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.f101072b);
        int height = (activity.getWindowManager().getDefaultDisplay().getHeight() - this.f101072b.top) - size;
        InterfaceC0976a interfaceC0976a = this.f101074d;
        if (interfaceC0976a != null && size != 0) {
            if (height > 100) {
                interfaceC0976a.a((Math.abs(this.f101072b.height()) - getPaddingBottom()) - getPaddingTop());
            } else {
                interfaceC0976a.a();
            }
        }
        super.onMeasure(i10, i11);
    }
}
