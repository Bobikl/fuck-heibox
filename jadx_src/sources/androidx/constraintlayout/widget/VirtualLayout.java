package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class VirtualLayout extends ConstraintHelper {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f19445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19446l;

    public VirtualLayout(Context context) {
        super(context);
    }

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public void J(l lVar, int i10, int i11) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f19445k || this.f19446l) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i10 = 0; i10 < this.f19249c; i10++) {
                    View viewP = constraintLayout.p(this.f19248b[i10]);
                    if (viewP != null) {
                        if (this.f19445k) {
                            viewP.setVisibility(visibility);
                        }
                        if (this.f19446l && elevation > 0.0f) {
                            viewP.setTranslationZ(viewP.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void r(ConstraintLayout constraintLayout) {
        q(constraintLayout);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        p();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        p();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void y(AttributeSet attributeSet) {
        super.y(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f19429u);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ConstraintLayout_Layout_android_visibility) {
                    this.f19445k = true;
                } else if (index == R.styleable.ConstraintLayout_Layout_android_elevation) {
                    this.f19446l = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
