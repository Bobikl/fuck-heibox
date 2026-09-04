package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.accessibility.a0;
import com.google.android.material.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.tencent.connect.common.Constants;

/* JADX INFO: compiled from: TimePickerClockPresenter.java */
/* JADX INFO: loaded from: classes7.dex */
public class i implements ClockHandView.c, TimePickerView.f, TimePickerView.e, ClockHandView.b, k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f55810g = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String[] f55811h = {org.apache.tools.tar.c.V, "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f55812i = {org.apache.tools.tar.c.V, "5", "10", "15", "20", Constants.VIA_REPORT_TYPE_CHAT_AUDIO, BBSLinkObj.CONTENT_TYPE_EXPRESS_NEWS, BBSLinkObj.CONTENT_TYPE_NEWS_V2, "40", BBSLinkObj.CONTENT_TYPE_UI_KIT, BBSLinkObj.CONTENT_TYPE_LINK_NEWS_WITH_TOP_USER, "55"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f55813j = 30;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f55814k = 6;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimePickerView f55815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeModel f55816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f55817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f55818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f55819f = false;

    /* JADX INFO: compiled from: TimePickerClockPresenter.java */
    public class a extends com.google.android.material.timepicker.b {
        a(Context context, int i10) {
            super(context, i10);
        }

        @Override // com.google.android.material.timepicker.b, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            a0Var.f1(view.getResources().getString(i.this.f55816c.c(), String.valueOf(i.this.f55816c.d())));
        }
    }

    /* JADX INFO: compiled from: TimePickerClockPresenter.java */
    public class b extends com.google.android.material.timepicker.b {
        b(Context context, int i10) {
            super(context, i10);
        }

        @Override // com.google.android.material.timepicker.b, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            a0Var.f1(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(i.this.f55816c.f55759f)));
        }
    }

    public i(TimePickerView timePickerView, TimeModel timeModel) {
        this.f55815b = timePickerView;
        this.f55816c = timeModel;
        initialize();
    }

    private String[] f() {
        return this.f55816c.f55757d == 1 ? f55811h : f55810g;
    }

    private int g() {
        return (this.f55816c.d() * 30) % 360;
    }

    private void h(int i10, int i11) {
        TimeModel timeModel = this.f55816c;
        if (timeModel.f55759f == i11 && timeModel.f55758e == i10) {
            return;
        }
        this.f55815b.performHapticFeedback(4);
    }

    private void j() {
        TimeModel timeModel = this.f55816c;
        int i10 = 1;
        if (timeModel.f55760g == 10 && timeModel.f55757d == 1 && timeModel.f55758e >= 12) {
            i10 = 2;
        }
        this.f55815b.setCurrentLevel(i10);
    }

    private void k() {
        TimePickerView timePickerView = this.f55815b;
        TimeModel timeModel = this.f55816c;
        timePickerView.a(timeModel.f55761h, timeModel.d(), this.f55816c.f55759f);
    }

    private void l() {
        m(f55810g, TimeModel.f55754j);
        m(f55812i, TimeModel.f55753i);
    }

    private void m(String[] strArr, String str) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            strArr[i10] = TimeModel.b(this.f55815b.getResources(), strArr[i10], str);
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f10, boolean z10) {
        this.f55819f = true;
        TimeModel timeModel = this.f55816c;
        int i10 = timeModel.f55759f;
        int i11 = timeModel.f55758e;
        if (timeModel.f55760g == 10) {
            this.f55815b.setHandRotation(this.f55818e, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) androidx.core.content.d.o(this.f55815b.getContext(), AccessibilityManager.class);
            if (!(accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled())) {
                i(12, true);
            }
        } else {
            int iRound = Math.round(f10);
            if (!z10) {
                this.f55816c.n(((iRound + 15) / 30) * 5);
                this.f55817d = this.f55816c.f55759f * 6;
            }
            this.f55815b.setHandRotation(this.f55817d, z10);
        }
        this.f55819f = false;
        k();
        h(i11, i10);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.e
    public void b(int i10) {
        this.f55816c.o(i10);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.f
    public void c(int i10) {
        i(i10, true);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void d(float f10, boolean z10) {
        if (this.f55819f) {
            return;
        }
        TimeModel timeModel = this.f55816c;
        int i10 = timeModel.f55758e;
        int i11 = timeModel.f55759f;
        int iRound = Math.round(f10);
        TimeModel timeModel2 = this.f55816c;
        if (timeModel2.f55760g == 12) {
            timeModel2.n((iRound + 3) / 6);
            this.f55817d = (float) Math.floor(this.f55816c.f55759f * 6);
        } else {
            int i12 = (iRound + 15) / 30;
            if (timeModel2.f55757d == 1) {
                i12 %= 12;
                if (this.f55815b.getCurrentLevel() == 2) {
                    i12 += 12;
                }
            }
            this.f55816c.k(i12);
            this.f55818e = g();
        }
        if (z10) {
            return;
        }
        k();
        h(i10, i11);
    }

    @Override // com.google.android.material.timepicker.k
    public void hide() {
        this.f55815b.setVisibility(8);
    }

    void i(int i10, boolean z10) {
        boolean z11 = i10 == 12;
        this.f55815b.setAnimateOnTouchUp(z11);
        this.f55816c.f55760g = i10;
        this.f55815b.setValues(z11 ? f55812i : f(), z11 ? R.string.material_minute_suffix : this.f55816c.c());
        j();
        this.f55815b.setHandRotation(z11 ? this.f55817d : this.f55818e, z10);
        this.f55815b.setActiveSelection(i10);
        this.f55815b.setMinuteHourDelegate(new a(this.f55815b.getContext(), R.string.material_hour_selection));
        this.f55815b.setHourClickDelegate(new b(this.f55815b.getContext(), R.string.material_minute_selection));
    }

    @Override // com.google.android.material.timepicker.k
    public void initialize() {
        if (this.f55816c.f55757d == 0) {
            this.f55815b.K();
        }
        this.f55815b.F(this);
        this.f55815b.setOnSelectionChangeListener(this);
        this.f55815b.setOnPeriodChangeListener(this);
        this.f55815b.setOnActionUpListener(this);
        l();
        invalidate();
    }

    @Override // com.google.android.material.timepicker.k
    public void invalidate() {
        this.f55818e = g();
        TimeModel timeModel = this.f55816c;
        this.f55817d = timeModel.f55759f * 6;
        i(timeModel.f55760g, false);
        k();
    }

    @Override // com.google.android.material.timepicker.k
    public void show() {
        this.f55815b.setVisibility(0);
    }
}
