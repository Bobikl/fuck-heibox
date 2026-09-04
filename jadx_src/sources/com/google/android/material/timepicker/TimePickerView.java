package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.d1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class TimePickerView extends ConstraintLayout implements j {
    static final String S = "android.view.View";
    private final Chip J;
    private final Chip K;
    private final ClockHandView L;
    private final ClockFaceView M;
    private final MaterialButtonToggleGroup N;
    private final View.OnClickListener O;
    private e P;
    private f Q;
    private d R;

    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.Q != null) {
                TimePickerView.this.Q.c(((Integer) view.getTag(R.id.selection_type)).intValue());
            }
        }
    }

    public class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            d dVar = TimePickerView.this.R;
            if (dVar == null) {
                return false;
            }
            dVar.b0();
            return true;
        }
    }

    public class c implements View.OnTouchListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GestureDetector f55764b;

        c(GestureDetector gestureDetector) {
            this.f55764b = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f55764b.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public interface d {
        void b0();
    }

    public interface e {
        void b(int i10);
    }

    public interface f {
        void c(int i10);
    }

    public TimePickerView(Context context) {
        this(context, null);
    }

    public TimePickerView(Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.O = new a();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        this.M = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.N = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.o
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i11, boolean z10) {
                this.f55844a.H(materialButtonToggleGroup2, i11, z10);
            }
        });
        this.J = (Chip) findViewById(R.id.material_minute_tv);
        this.K = (Chip) findViewById(R.id.material_hour_tv);
        this.L = (ClockHandView) findViewById(R.id.material_clock_hand);
        J();
        I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
        e eVar;
        if (z10 && (eVar = this.P) != null) {
            eVar.b(i10 == R.id.material_clock_period_pm_button ? 1 : 0);
        }
    }

    private void I() {
        Chip chip = this.J;
        int i10 = R.id.selection_type;
        chip.setTag(i10, 12);
        this.K.setTag(i10, 10);
        this.J.setOnClickListener(this.O);
        this.K.setOnClickListener(this.O);
        this.J.setAccessibilityClassName("android.view.View");
        this.K.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void J() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.J.setOnTouchListener(cVar);
        this.K.setOnTouchListener(cVar);
    }

    private void L(Chip chip, boolean z10) {
        chip.setChecked(z10);
        j1.D1(chip, z10 ? 2 : 0);
    }

    public void F(ClockHandView.c cVar) {
        this.L.b(cVar);
    }

    public void K() {
        this.N.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.j
    @SuppressLint({"DefaultLocale"})
    public void a(int i10, int i11, int i12) {
        this.N.e(i10 == 1 ? R.id.material_clock_period_pm_button : R.id.material_clock_period_am_button);
        Locale locale = getResources().getConfiguration().locale;
        String str = String.format(locale, TimeModel.f55753i, Integer.valueOf(i12));
        String str2 = String.format(locale, TimeModel.f55753i, Integer.valueOf(i11));
        if (!TextUtils.equals(this.J.getText(), str)) {
            this.J.setText(str);
        }
        if (TextUtils.equals(this.K.getText(), str2)) {
            return;
        }
        this.K.setText(str2);
    }

    int getCurrentLevel() {
        return this.M.getCurrentLevel();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@n0 View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.K.sendAccessibilityEvent(8);
        }
    }

    @Override // com.google.android.material.timepicker.j
    public void setActiveSelection(int i10) {
        L(this.J, i10 == 12);
        L(this.K, i10 == 10);
    }

    public void setAnimateOnTouchUp(boolean z10) {
        this.L.setAnimateOnTouchUp(z10);
    }

    void setCurrentLevel(int i10) {
        this.M.setCurrentLevel(i10);
    }

    @Override // com.google.android.material.timepicker.j
    public void setHandRotation(float f10) {
        this.L.setHandRotation(f10);
    }

    public void setHandRotation(float f10, boolean z10) {
        this.L.setHandRotation(f10, z10);
    }

    public void setHourClickDelegate(androidx.core.view.a aVar) {
        j1.B1(this.J, aVar);
    }

    public void setMinuteHourDelegate(androidx.core.view.a aVar) {
        j1.B1(this.K, aVar);
    }

    public void setOnActionUpListener(ClockHandView.b bVar) {
        this.L.setOnActionUpListener(bVar);
    }

    void setOnDoubleTapListener(@p0 d dVar) {
        this.R = dVar;
    }

    void setOnPeriodChangeListener(e eVar) {
        this.P = eVar;
    }

    void setOnSelectionChangeListener(f fVar) {
        this.Q = fVar;
    }

    @Override // com.google.android.material.timepicker.j
    public void setValues(String[] strArr, @d1 int i10) {
        this.M.setValues(strArr, i10);
    }
}
