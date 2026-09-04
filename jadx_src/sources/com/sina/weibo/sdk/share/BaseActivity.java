package com.sina.weibo.sdk.share;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes8.dex */
public class BaseActivity extends Activity {
    private boolean h() {
        boolean zBooleanValue;
        Exception e10;
        try {
            TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes((int[]) Class.forName("com.android.internal.R$styleable").getField("Window").get(null));
            Method method = ActivityInfo.class.getMethod("isTranslucentOrFloating", TypedArray.class);
            method.setAccessible(true);
            zBooleanValue = ((Boolean) method.invoke(null, typedArrayObtainStyledAttributes)).booleanValue();
            try {
                method.setAccessible(false);
            } catch (Exception e11) {
                e10 = e11;
                e10.printStackTrace();
            }
        } catch (Exception e12) {
            zBooleanValue = false;
            e10 = e12;
        }
        return zBooleanValue;
    }

    private boolean i() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
            declaredField.setAccessible(true);
            ((ActivityInfo) declaredField.get(this)).screenOrientation = -1;
            declaredField.setAccessible(false);
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT == 26 && h()) {
            i();
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i10) {
        if (Build.VERSION.SDK_INT == 26 && h()) {
            return;
        }
        super.setRequestedOrientation(i10);
    }
}
