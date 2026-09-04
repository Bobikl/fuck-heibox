package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakReference<View> f2698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LayoutInflater f2699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f2700f;

    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2696b = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.H, i10, 0);
        this.f2697c = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ViewStubCompat_android_inflatedId, -1);
        this.f2696b = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ViewStubCompat_android_layout, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(R.styleable.ViewStubCompat_android_id, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f2696b == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f2699e;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f2696b, viewGroup, false);
        int i10 = this.f2697c;
        if (i10 != -1) {
            viewInflate.setId(i10);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f2698d = new WeakReference<>(viewInflate);
        a aVar = this.f2700f;
        if (aVar != null) {
            aVar.a(this, viewInflate);
        }
        return viewInflate;
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f2697c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f2699e;
    }

    public int getLayoutResource() {
        return this.f2696b;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i10) {
        this.f2697c = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f2699e = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.f2696b = i10;
    }

    public void setOnInflateListener(a aVar) {
        this.f2700f = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        WeakReference<View> weakReference = this.f2698d;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            a();
        }
    }
}
