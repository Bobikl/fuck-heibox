package com.google.android.material.elevation;

import android.content.Context;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.r;
import com.google.android.material.R;
import com.google.android.material.color.m;
import f9.a;

/* JADX INFO: loaded from: classes7.dex */
public enum SurfaceColors {
    SURFACE_0(R.dimen.m3_sys_elevation_level0),
    SURFACE_1(R.dimen.m3_sys_elevation_level1),
    SURFACE_2(R.dimen.m3_sys_elevation_level2),
    SURFACE_3(R.dimen.m3_sys_elevation_level3),
    SURFACE_4(R.dimen.m3_sys_elevation_level4),
    SURFACE_5(R.dimen.m3_sys_elevation_level5);

    private final int elevationResId;

    SurfaceColors(int i10) {
        this.elevationResId = i10;
    }

    @l
    public static int getColorForElevation(@n0 Context context, @r float f10) {
        return new a(context).c(m.b(context, R.attr.colorSurface, 0), f10);
    }

    @l
    public int getColor(@n0 Context context) {
        return getColorForElevation(context, context.getResources().getDimension(this.elevationResId));
    }
}
