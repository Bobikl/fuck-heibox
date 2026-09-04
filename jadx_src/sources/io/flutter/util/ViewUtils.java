package io.flutter.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.window.sidecar.w;
import androidx.window.sidecar.x;
import io.flutter.util.ViewUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewUtils {

    public interface DisplayUpdater {
        void updateDisplayMetrics(float f10, float f11, float f12);
    }

    public interface ViewVisitor {
        boolean run(@n0 View view);
    }

    public static void calculateMaximumDisplayMetrics(@p0 Context context, @n0 DisplayUpdater displayUpdater) {
        Activity activity = getActivity(context);
        if (activity != null) {
            w wVarB = x.a().b(activity);
            displayUpdater.updateDisplayMetrics(wVarB.a().width(), wVarB.a().height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static boolean childHasFocus(@p0 View view) {
        return traverseHierarchy(view, new ViewVisitor() { // from class: ih.a
            @Override // io.flutter.util.ViewUtils.ViewVisitor
            public final boolean run(View view2) {
                return view2.hasFocus();
            }
        });
    }

    @p0
    public static Activity getActivity(@p0 Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return getActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean hasChildViewOfType(@p0 View view, final Class<? extends View>[] clsArr) {
        return traverseHierarchy(view, new ViewVisitor() { // from class: ih.b
            @Override // io.flutter.util.ViewUtils.ViewVisitor
            public final boolean run(View view2) {
                return ViewUtils.lambda$hasChildViewOfType$1(clsArr, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$hasChildViewOfType$1(Class[] clsArr, View view) {
        for (Class cls : clsArr) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    public static boolean traverseHierarchy(@p0 View view, @n0 ViewVisitor viewVisitor) {
        if (view == null) {
            return false;
        }
        if (viewVisitor.run(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (traverseHierarchy(viewGroup.getChildAt(i10), viewVisitor)) {
                    return true;
                }
            }
        }
        return false;
    }
}
