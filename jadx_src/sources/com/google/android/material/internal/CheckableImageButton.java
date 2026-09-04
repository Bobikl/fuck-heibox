package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.j1;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f54369h = {R.attr.state_checked};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f54370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f54371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f54372g;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f54373b;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @n0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@n0 Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @n0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@n0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @n0
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(@n0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void a(@n0 Parcel parcel) {
            this.f54373b = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@n0 Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f54373b ? 1 : 0);
        }
    }

    public class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, @n0 AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @n0 androidx.core.view.accessibility.a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            a0Var.Z0(CheckableImageButton.this.a());
            a0Var.a1(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f54371f = true;
        this.f54372g = true;
        j1.B1(this, new a());
    }

    public boolean a() {
        return this.f54371f;
    }

    public boolean b() {
        return this.f54372g;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f54370e;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (!this.f54370e) {
            return super.onCreateDrawableState(i10);
        }
        int[] iArr = f54369h;
        return View.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.f54373b);
    }

    @Override // android.view.View
    @n0
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f54373b = this.f54370e;
        return savedState;
    }

    public void setCheckable(boolean z10) {
        if (this.f54371f != z10) {
            this.f54371f = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f54371f || this.f54370e == z10) {
            return;
        }
        this.f54370e = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z10) {
        this.f54372g = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f54372g) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f54370e);
    }
}
