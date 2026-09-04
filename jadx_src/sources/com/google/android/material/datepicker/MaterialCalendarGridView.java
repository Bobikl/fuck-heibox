package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.accessibility.a0;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.internal.j0;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Calendar f54029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f54030c;

    public class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @n0 a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            a0Var.d1(null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f54029b = s.v();
        if (j.k4(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f54030c = j.m4(getContext());
        j1.B1(this, new a());
    }

    private void a(int i10, Rect rect) {
        if (i10 == 33) {
            setSelection(getAdapter().m());
        } else if (i10 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    private View b(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    private static int c(@n0 View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean d(@p0 Long l10, @p0 Long l11, @p0 Long l12, @p0 Long l13) {
        return l10 == null || l11 == null || l12 == null || l13 == null || l12.longValue() > l11.longValue() || l13.longValue() < l10.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @n0
    public n getAdapter() {
        return (n) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(@n0 Canvas canvas) {
        int iA;
        int iC;
        int iA2;
        int iC2;
        int width;
        int i10;
        int right;
        int right2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        n adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.f54155c;
        b bVar = adapter.f54157e;
        int iMax = Math.max(adapter.b(), getFirstVisiblePosition());
        int iMin = Math.min(adapter.m(), getLastVisiblePosition());
        Long item = adapter.getItem(iMax);
        Long item2 = adapter.getItem(iMin);
        Iterator<androidx.core.util.k<Long, Long>> it = dateSelector.r1().iterator();
        while (it.hasNext()) {
            androidx.core.util.k<Long, Long> next = it.next();
            Long l10 = next.f21263a;
            if (l10 == null) {
                materialCalendarGridView = this;
            } else if (next.f21264b != null) {
                long jLongValue = l10.longValue();
                long jLongValue2 = next.f21264b.longValue();
                if (!d(item, item2, Long.valueOf(jLongValue), Long.valueOf(jLongValue2))) {
                    boolean zQ = j0.q(this);
                    if (jLongValue < item.longValue()) {
                        if (adapter.h(iMax)) {
                            right2 = 0;
                        } else {
                            right2 = !zQ ? materialCalendarGridView.b(iMax - 1).getRight() : materialCalendarGridView.b(iMax - 1).getLeft();
                        }
                        iC = right2;
                        iA = iMax;
                    } else {
                        materialCalendarGridView.f54029b.setTimeInMillis(jLongValue);
                        iA = adapter.a(materialCalendarGridView.f54029b.get(5));
                        iC = c(materialCalendarGridView.b(iA));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        if (adapter.i(iMin)) {
                            right = getWidth();
                        } else {
                            right = !zQ ? materialCalendarGridView.b(iMin).getRight() : materialCalendarGridView.b(iMin).getLeft();
                        }
                        iC2 = right;
                        iA2 = iMin;
                    } else {
                        materialCalendarGridView.f54029b.setTimeInMillis(jLongValue2);
                        iA2 = adapter.a(materialCalendarGridView.f54029b.get(5));
                        iC2 = c(materialCalendarGridView.b(iA2));
                    }
                    int itemId = (int) adapter.getItemId(iA);
                    int i11 = iMax;
                    int i12 = iMin;
                    int itemId2 = (int) adapter.getItemId(iA2);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View viewB = materialCalendarGridView.b(numColumns);
                        int top = viewB.getTop() + bVar.f54069a.e();
                        n nVar = adapter;
                        int bottom = viewB.getBottom() - bVar.f54069a.b();
                        if (zQ) {
                            int i13 = iA2 > numColumns2 ? 0 : iC2;
                            width = numColumns > iA ? getWidth() : iC;
                            i10 = i13;
                        } else {
                            i10 = numColumns > iA ? 0 : iC;
                            width = iA2 > numColumns2 ? getWidth() : iC2;
                        }
                        canvas.drawRect(i10, top, width, bottom, bVar.f54076h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        adapter = nVar;
                    }
                    materialCalendarGridView = this;
                    iMax = i11;
                    iMin = i12;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            a(i10, rect);
        } else {
            super.onFocusChanged(false, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.f54030c) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof n)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), n.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i10) {
        if (i10 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i10);
        }
    }
}
