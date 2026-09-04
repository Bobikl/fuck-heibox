package com.huawei.hms.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.constraintlayout.core.motion.utils.w;
import com.google.android.exoplayer2.text.ttml.d;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ResourceLoaderUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f62793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f62794b;

    public static int getAnimId(String str) {
        return f62793a.getResources().getIdentifier(str, "anim", f62794b);
    }

    public static int getColorId(String str) {
        return f62793a.getResources().getIdentifier(str, "color", f62794b);
    }

    public static int getDimenId(String str) {
        return f62793a.getResources().getIdentifier(str, "dimen", f62794b);
    }

    public static Drawable getDrawable(String str) {
        return f62793a.getResources().getDrawable(getDrawableId(str));
    }

    public static int getDrawableId(String str) {
        return f62793a.getResources().getIdentifier(str, "drawable", f62794b);
    }

    public static int getIdId(String str) {
        return f62793a.getResources().getIdentifier(str, "id", f62794b);
    }

    public static int getLayoutId(String str) {
        return f62793a.getResources().getIdentifier(str, d.f49813w, f62794b);
    }

    public static String getString(String str) {
        return f62793a.getResources().getString(getStringId(str));
    }

    public static String getString(String str, Object... objArr) {
        return f62793a.getResources().getString(getStringId(str), objArr);
    }

    public static int getStringId(String str) {
        return f62793a.getResources().getIdentifier(str, w.b.f17895e, f62794b);
    }

    public static int getStyleId(String str) {
        return f62793a.getResources().getIdentifier(str, "style", f62794b);
    }

    public static Context getmContext() {
        return f62793a;
    }

    public static void setmContext(Context context) {
        f62793a = context;
        f62794b = context.getPackageName();
    }
}
