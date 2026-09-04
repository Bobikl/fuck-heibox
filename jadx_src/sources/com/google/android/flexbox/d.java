package com.google.android.flexbox;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: FlexContainer.java */
/* JADX INFO: loaded from: classes7.dex */
public interface d {

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final int f52228i1 = -1;

    void a(View view, int i10, int i11, f fVar);

    void addView(View view);

    void addView(View view, int i10);

    View b(int i10);

    int c(int i10, int i11, int i12);

    int d(View view);

    View e(int i10);

    int f(View view, int i10, int i11);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<f> getFlexLines();

    List<f> getFlexLinesInternal();

    int getFlexWrap();

    int getJustifyContent();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    int h(int i10, int i11, int i12);

    void i(f fVar);

    void j(int i10, View view);

    boolean k();

    void removeAllViews();

    void removeViewAt(int i10);

    void setAlignContent(int i10);

    void setAlignItems(int i10);

    void setFlexDirection(int i10);

    void setFlexLines(List<f> list);

    void setFlexWrap(int i10);

    void setJustifyContent(int i10);

    void setMaxLine(int i10);
}
