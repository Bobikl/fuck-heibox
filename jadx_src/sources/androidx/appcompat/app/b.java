package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ActionBarDrawerToggleHoneycomb.java */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f1775a = "ActionBarDrawerToggleHC";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f1776b = {R.attr.homeAsUpIndicator};

    /* JADX INFO: compiled from: ActionBarDrawerToggleHoneycomb.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f1777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f1778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImageView f1779c;

        a(Activity activity) {
            try {
                this.f1777a = android.app.ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f1778b = android.app.ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View viewFindViewById = activity.findViewById(R.id.home);
                if (viewFindViewById == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                if (childAt instanceof ImageView) {
                    this.f1779c = (ImageView) childAt;
                }
            }
        }
    }

    private b() {
    }

    public static Drawable a(Activity activity) {
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(f1776b);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    public static a b(a aVar, Activity activity, int i10) {
        if (aVar == null) {
            aVar = new a(activity);
        }
        if (aVar.f1777a != null) {
            try {
                aVar.f1778b.invoke(activity.getActionBar(), Integer.valueOf(i10));
            } catch (Exception e10) {
                Log.w(f1775a, "Couldn't set content description via JB-MR2 API", e10);
            }
        }
        return aVar;
    }

    public static a c(Activity activity, Drawable drawable, int i10) {
        a aVar = new a(activity);
        if (aVar.f1777a != null) {
            try {
                android.app.ActionBar actionBar = activity.getActionBar();
                aVar.f1777a.invoke(actionBar, drawable);
                aVar.f1778b.invoke(actionBar, Integer.valueOf(i10));
            } catch (Exception e10) {
                Log.w(f1775a, "Couldn't set home-as-up indicator via JB-MR2 API", e10);
            }
        } else {
            ImageView imageView = aVar.f1779c;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            } else {
                Log.w(f1775a, "Couldn't set home-as-up indicator");
            }
        }
        return aVar;
    }
}
