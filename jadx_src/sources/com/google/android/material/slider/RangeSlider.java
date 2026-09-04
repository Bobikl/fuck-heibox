package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.annotation.f0;
import androidx.annotation.n;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.r;
import androidx.annotation.v;
import com.google.android.material.R;
import com.google.android.material.internal.c0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class RangeSlider extends BaseSlider<RangeSlider, b, c> {

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private float f55317f4;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private int f55318g4;

    public static class RangeSliderState extends AbsSavedState {
        public static final Parcelable.Creator<RangeSliderState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f55319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f55320c;

        public class a implements Parcelable.Creator<RangeSliderState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public RangeSliderState createFromParcel(Parcel parcel) {
                return new RangeSliderState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public RangeSliderState[] newArray(int i10) {
                return new RangeSliderState[i10];
            }
        }

        private RangeSliderState(Parcel parcel) {
            super(parcel.readParcelable(RangeSliderState.class.getClassLoader()));
            this.f55319b = parcel.readFloat();
            this.f55320c = parcel.readInt();
        }

        RangeSliderState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeFloat(this.f55319b);
            parcel.writeInt(this.f55320c);
        }
    }

    public interface b extends com.google.android.material.slider.a<RangeSlider> {
        @Override // com.google.android.material.slider.a
        /* bridge */ /* synthetic */ void a(@n0 RangeSlider rangeSlider, float f10, boolean z10);

        void b(@n0 RangeSlider rangeSlider, float f10, boolean z10);
    }

    public interface c extends com.google.android.material.slider.b<RangeSlider> {
        @Override // com.google.android.material.slider.b
        /* bridge */ /* synthetic */ void a(@n0 RangeSlider rangeSlider);

        @Override // com.google.android.material.slider.b
        /* bridge */ /* synthetic */ void b(@n0 RangeSlider rangeSlider);

        void d(@n0 RangeSlider rangeSlider);

        void e(@n0 RangeSlider rangeSlider);
    }

    public RangeSlider(@n0 Context context) {
        this(context, null);
    }

    public RangeSlider(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    public RangeSlider(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray typedArrayK = c0.k(context, attributeSet, R.styleable.f52829d1, i10, BaseSlider.V3, new int[0]);
        int i11 = R.styleable.RangeSlider_values;
        if (typedArrayK.hasValue(i11)) {
            setValues(D0(typedArrayK.getResources().obtainTypedArray(typedArrayK.getResourceId(i11, 0))));
        }
        this.f55317f4 = typedArrayK.getDimension(R.styleable.RangeSlider_minSeparation, 0.0f);
        typedArrayK.recycle();
    }

    private static List<Float> D0(TypedArray typedArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < typedArray.length(); i10++) {
            arrayList.add(Float.valueOf(typedArray.getFloat(i10, -1.0f)));
        }
        return arrayList;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ boolean I() {
        return super.I();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ boolean Q() {
        return super.Q();
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchHoverEvent(@n0 MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(@n0 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void g(@n0 com.google.android.material.slider.a aVar) {
        super.g(aVar);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void g0(@n0 com.google.android.material.slider.a aVar) {
        super.g0(aVar);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    @n0
    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
        return super.getActiveThumbIndex();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
        return super.getFocusedThumbIndex();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @r
    public /* bridge */ /* synthetic */ int getHaloRadius() {
        return super.getHaloRadius();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @n0
    public /* bridge */ /* synthetic */ ColorStateList getHaloTintList() {
        return super.getHaloTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getLabelBehavior() {
        return super.getLabelBehavior();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public float getMinSeparation() {
        return this.f55317f4;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getStepSize() {
        return super.getStepSize();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getThumbElevation() {
        return super.getThumbElevation();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @r
    public /* bridge */ /* synthetic */ int getThumbRadius() {
        return super.getThumbRadius();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getThumbStrokeColor() {
        return super.getThumbStrokeColor();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getThumbStrokeWidth() {
        return super.getThumbStrokeWidth();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @n0
    public /* bridge */ /* synthetic */ ColorStateList getThumbTintList() {
        return super.getThumbTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @r
    public /* bridge */ /* synthetic */ int getTickActiveRadius() {
        return super.getTickActiveRadius();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @n0
    public /* bridge */ /* synthetic */ ColorStateList getTickActiveTintList() {
        return super.getTickActiveTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @r
    public /* bridge */ /* synthetic */ int getTickInactiveRadius() {
        return super.getTickInactiveRadius();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @n0
    public /* bridge */ /* synthetic */ ColorStateList getTickInactiveTintList() {
        return super.getTickInactiveTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @n0
    public /* bridge */ /* synthetic */ ColorStateList getTickTintList() {
        return super.getTickTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @n0
    public /* bridge */ /* synthetic */ ColorStateList getTrackActiveTintList() {
        return super.getTrackActiveTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @r
    public /* bridge */ /* synthetic */ int getTrackHeight() {
        return super.getTrackHeight();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @n0
    public /* bridge */ /* synthetic */ ColorStateList getTrackInactiveTintList() {
        return super.getTrackInactiveTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @r
    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
        return super.getTrackSidePadding();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @n0
    public /* bridge */ /* synthetic */ ColorStateList getTrackTintList() {
        return super.getTrackTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @r
    public /* bridge */ /* synthetic */ int getTrackWidth() {
        return super.getTrackWidth();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getValueFrom() {
        return super.getValueFrom();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getValueTo() {
        return super.getValueTo();
    }

    @Override // com.google.android.material.slider.BaseSlider
    @n0
    public List<Float> getValues() {
        return super.getValues();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void h(@n0 com.google.android.material.slider.b bVar) {
        super.h(bVar);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void h0(@n0 com.google.android.material.slider.b bVar) {
        super.h0(bVar);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void o() {
        super.o();
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int i10, @n0 KeyEvent keyEvent) {
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyUp(int i10, @n0 KeyEvent keyEvent) {
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    protected void onRestoreInstanceState(@p0 Parcelable parcelable) {
        RangeSliderState rangeSliderState = (RangeSliderState) parcelable;
        super.onRestoreInstanceState(rangeSliderState.getSuperState());
        this.f55317f4 = rangeSliderState.f55319b;
        int i10 = rangeSliderState.f55320c;
        this.f55318g4 = i10;
        setSeparationUnit(i10);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    @n0
    public Parcelable onSaveInstanceState() {
        RangeSliderState rangeSliderState = new RangeSliderState(super.onSaveInstanceState());
        rangeSliderState.f55319b = this.f55317f4;
        rangeSliderState.f55320c = this.f55318g4;
        return rangeSliderState;
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(@n0 MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void p() {
        super.p();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(@v int i10) {
        super.setCustomThumbDrawable(i10);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(@n0 Drawable drawable) {
        super.setCustomThumbDrawable(drawable);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawablesForValues(@n0 @v int... iArr) {
        super.setCustomThumbDrawablesForValues(iArr);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawablesForValues(@n0 Drawable... drawableArr) {
        super.setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z10) {
        super.setEnabled(z10);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i10) {
        super.setFocusedThumbIndex(i10);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloRadius(@f0(from = 0) @r int i10) {
        super.setHaloRadius(i10);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloRadiusResource(@q int i10) {
        super.setHaloRadiusResource(i10);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloTintList(@n0 ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setLabelBehavior(int i10) {
        super.setLabelBehavior(i10);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setLabelFormatter(@p0 d dVar) {
        super.setLabelFormatter(dVar);
    }

    public void setMinSeparation(@r float f10) {
        this.f55317f4 = f10;
        this.f55318g4 = 0;
        setSeparationUnit(0);
    }

    public void setMinSeparationValue(float f10) {
        this.f55317f4 = f10;
        this.f55318g4 = 1;
        setSeparationUnit(1);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setStepSize(float f10) {
        super.setStepSize(f10);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbElevation(float f10) {
        super.setThumbElevation(f10);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbElevationResource(@q int i10) {
        super.setThumbElevationResource(i10);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadius(@f0(from = 0) @r int i10) {
        super.setThumbRadius(i10);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadiusResource(@q int i10) {
        super.setThumbRadiusResource(i10);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeColor(@p0 ColorStateList colorStateList) {
        super.setThumbStrokeColor(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeColorResource(@n int i10) {
        super.setThumbStrokeColorResource(i10);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f10) {
        super.setThumbStrokeWidth(f10);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeWidthResource(@q int i10) {
        super.setThumbStrokeWidthResource(i10);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbTintList(@n0 ColorStateList colorStateList) {
        super.setThumbTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveRadius(@f0(from = 0) @r int i10) {
        super.setTickActiveRadius(i10);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveTintList(@n0 ColorStateList colorStateList) {
        super.setTickActiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveRadius(@f0(from = 0) @r int i10) {
        super.setTickInactiveRadius(i10);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveTintList(@n0 ColorStateList colorStateList) {
        super.setTickInactiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickTintList(@n0 ColorStateList colorStateList) {
        super.setTickTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickVisible(boolean z10) {
        super.setTickVisible(z10);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackActiveTintList(@n0 ColorStateList colorStateList) {
        super.setTrackActiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackHeight(@f0(from = 0) @r int i10) {
        super.setTrackHeight(i10);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(@n0 ColorStateList colorStateList) {
        super.setTrackInactiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackTintList(@n0 ColorStateList colorStateList) {
        super.setTrackTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setValueFrom(float f10) {
        super.setValueFrom(f10);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setValueTo(float f10) {
        super.setValueTo(f10);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setValues(@n0 List<Float> list) {
        super.setValues(list);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setValues(@n0 Float... fArr) {
        super.setValues(fArr);
    }
}
