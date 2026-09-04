package com.google.android.material.color;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import com.google.android.material.R;
import com.google.android.material.color.utilities.a0;
import com.google.android.material.color.utilities.a6;
import com.google.android.material.color.utilities.z;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: MaterialColorUtilitiesHelper.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, z> f53750a;

    static {
        HashMap map = new HashMap();
        map.put(Integer.valueOf(R.color.material_personalized_color_primary), a6.f53819u);
        map.put(Integer.valueOf(R.color.material_personalized_color_on_primary), a6.f53821w);
        map.put(Integer.valueOf(R.color.material_personalized_color_primary_inverse), a6.f53820v);
        map.put(Integer.valueOf(R.color.material_personalized_color_primary_container), a6.f53817s);
        map.put(Integer.valueOf(R.color.material_personalized_color_on_primary_container), a6.f53818t);
        map.put(Integer.valueOf(R.color.material_personalized_color_secondary), a6.f53824z);
        map.put(Integer.valueOf(R.color.material_personalized_color_on_secondary), a6.A);
        map.put(Integer.valueOf(R.color.material_personalized_color_secondary_container), a6.f53822x);
        map.put(Integer.valueOf(R.color.material_personalized_color_on_secondary_container), a6.f53823y);
        map.put(Integer.valueOf(R.color.material_personalized_color_tertiary), a6.D);
        map.put(Integer.valueOf(R.color.material_personalized_color_on_tertiary), a6.E);
        map.put(Integer.valueOf(R.color.material_personalized_color_tertiary_container), a6.B);
        map.put(Integer.valueOf(R.color.material_personalized_color_on_tertiary_container), a6.C);
        map.put(Integer.valueOf(R.color.material_personalized_color_background), a6.f53798b);
        map.put(Integer.valueOf(R.color.material_personalized_color_on_background), a6.f53800c);
        map.put(Integer.valueOf(R.color.material_personalized_color_surface), a6.f53802d);
        map.put(Integer.valueOf(R.color.material_personalized_color_on_surface), a6.f53811m);
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_variant), a6.f53813o);
        map.put(Integer.valueOf(R.color.material_personalized_color_on_surface_variant), a6.f53814p);
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_inverse), a6.f53803e);
        map.put(Integer.valueOf(R.color.material_personalized_color_on_surface_inverse), a6.f53812n);
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_bright), a6.f53804f);
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_dim), a6.f53805g);
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container), a6.f53808j);
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container_low), a6.f53807i);
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container_high), a6.f53809k);
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container_lowest), a6.f53806h);
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container_highest), a6.f53810l);
        map.put(Integer.valueOf(R.color.material_personalized_color_outline), a6.f53815q);
        map.put(Integer.valueOf(R.color.material_personalized_color_outline_variant), a6.f53816r);
        map.put(Integer.valueOf(R.color.material_personalized_color_error), a6.H);
        map.put(Integer.valueOf(R.color.material_personalized_color_on_error), a6.I);
        map.put(Integer.valueOf(R.color.material_personalized_color_error_container), a6.F);
        map.put(Integer.valueOf(R.color.material_personalized_color_on_error_container), a6.G);
        map.put(Integer.valueOf(R.color.material_personalized_color_control_activated), a6.V);
        map.put(Integer.valueOf(R.color.material_personalized_color_control_normal), a6.W);
        map.put(Integer.valueOf(R.color.material_personalized_color_control_highlight), a6.X);
        map.put(Integer.valueOf(R.color.material_personalized_color_text_primary_inverse), a6.Y);
        map.put(Integer.valueOf(R.color.material_personalized_color_text_secondary_and_tertiary_inverse), a6.Z);
        map.put(Integer.valueOf(R.color.material_personalized_color_text_secondary_and_tertiary_inverse_disabled), a6.f53799b0);
        map.put(Integer.valueOf(R.color.material_personalized_color_text_primary_inverse_disable_only), a6.f53797a0);
        map.put(Integer.valueOf(R.color.material_personalized_color_text_hint_foreground_inverse), a6.f53801c0);
        f53750a = Collections.unmodifiableMap(map);
    }

    private l() {
    }

    @n0
    public static Map<Integer, Integer> a(@n0 a0 a0Var) {
        HashMap map = new HashMap();
        for (Map.Entry<Integer, z> entry : f53750a.entrySet()) {
            map.put(entry.getKey(), Integer.valueOf(entry.getValue().E(a0Var)));
        }
        return Collections.unmodifiableMap(map);
    }
}
