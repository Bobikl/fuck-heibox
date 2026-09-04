package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ContextThemeWrapper;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.material.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: HarmonizedColors.java */
/* JADX INFO: loaded from: classes7.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f53743a = "j";

    private j() {
    }

    @w0(api = 30)
    private static void a(@n0 Map<Integer, Integer> map, @n0 TypedArray typedArray, @p0 TypedArray typedArray2, @androidx.annotation.l int i10) {
        if (typedArray2 == null) {
            typedArray2 = typedArray;
        }
        for (int i11 = 0; i11 < typedArray.getIndexCount(); i11++) {
            int resourceId = typedArray2.getResourceId(i11, 0);
            if (resourceId != 0 && typedArray.hasValue(i11) && p.b(typedArray.getType(i11))) {
                map.put(Integer.valueOf(resourceId), Integer.valueOf(m.k(typedArray.getColor(i11, 0), i10)));
            }
        }
    }

    @n0
    public static void b(@n0 Context context, @n0 k kVar) {
        if (d()) {
            Map<Integer, Integer> mapC = c(context, kVar);
            int iE = kVar.e(0);
            if (!p.a(context, mapC) || iE == 0) {
                return;
            }
            q.a(context, iE);
        }
    }

    @w0(api = 30)
    private static Map<Integer, Integer> c(Context context, k kVar) {
        HashMap map = new HashMap();
        int iC = m.c(context, kVar.b(), f53743a);
        for (int i10 : kVar.d()) {
            map.put(Integer.valueOf(i10), Integer.valueOf(m.k(androidx.core.content.d.f(context, i10), iC)));
        }
        i iVarC = kVar.c();
        if (iVarC != null) {
            int[] iArrD = iVarC.d();
            if (iArrD.length > 0) {
                int iE = iVarC.e();
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArrD);
                TypedArray typedArrayObtainStyledAttributes2 = iE != 0 ? new ContextThemeWrapper(context, iE).obtainStyledAttributes(iArrD) : null;
                a(map, typedArrayObtainStyledAttributes, typedArrayObtainStyledAttributes2, iC);
                typedArrayObtainStyledAttributes.recycle();
                if (typedArrayObtainStyledAttributes2 != null) {
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
        }
        return map;
    }

    @androidx.annotation.k(api = 30)
    public static boolean d() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @n0
    public static Context e(@n0 Context context, @n0 k kVar) {
        if (!d()) {
            return context;
        }
        Map<Integer, Integer> mapC = c(context, kVar);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, kVar.e(R.style.ThemeOverlay_Material3_HarmonizedColors_Empty));
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        return p.a(contextThemeWrapper, mapC) ? contextThemeWrapper : context;
    }
}
