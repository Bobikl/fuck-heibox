package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: ToolbarUtils.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator<View> f54490a = new a();

    /* JADX INFO: compiled from: ToolbarUtils.java */
    public class a implements Comparator<View> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    private d0() {
    }

    @p0
    public static ActionMenuItemView a(@n0 Toolbar toolbar, @androidx.annotation.d0 int i10) {
        ActionMenuView actionMenuViewB = b(toolbar);
        if (actionMenuViewB == null) {
            return null;
        }
        for (int i11 = 0; i11 < actionMenuViewB.getChildCount(); i11++) {
            View childAt = actionMenuViewB.getChildAt(i11);
            if (childAt instanceof ActionMenuItemView) {
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) childAt;
                if (actionMenuItemView.getItemData().getItemId() == i10) {
                    return actionMenuItemView;
                }
            }
        }
        return null;
    }

    @p0
    public static ActionMenuView b(@n0 Toolbar toolbar) {
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    @p0
    private static ImageView c(@n0 Toolbar toolbar, @p0 Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    @p0
    public static ImageView d(@n0 Toolbar toolbar) {
        return c(toolbar, toolbar.getLogo());
    }

    @p0
    public static ImageButton e(@n0 Toolbar toolbar) {
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    @p0
    public static View f(@n0 Toolbar toolbar) {
        ActionMenuView actionMenuViewB = b(toolbar);
        if (actionMenuViewB == null || actionMenuViewB.getChildCount() <= 1) {
            return null;
        }
        return actionMenuViewB.getChildAt(0);
    }

    @p0
    public static TextView g(@n0 Toolbar toolbar) {
        List<TextView> listH = h(toolbar, toolbar.getSubtitle());
        if (listH.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(listH, f54490a);
    }

    private static List<TextView> h(@n0 Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    @p0
    public static TextView i(@n0 Toolbar toolbar) {
        List<TextView> listH = h(toolbar, toolbar.getTitle());
        if (listH.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(listH, f54490a);
    }
}
