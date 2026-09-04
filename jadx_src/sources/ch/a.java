package ch;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.zhpan.indicator.R;

/* JADX INFO: compiled from: AttrsController.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static void a(@n0 Context context, @p0 AttributeSet attributeSet, b bVar) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f108062f);
            int i10 = typedArrayObtainStyledAttributes.getInt(R.styleable.IndicatorView_vpi_slide_mode, 0);
            int i11 = typedArrayObtainStyledAttributes.getInt(R.styleable.IndicatorView_vpi_style, 0);
            int color = typedArrayObtainStyledAttributes.getColor(R.styleable.IndicatorView_vpi_slider_checked_color, Color.parseColor("#6C6D72"));
            int color2 = typedArrayObtainStyledAttributes.getColor(R.styleable.IndicatorView_vpi_slider_normal_color, Color.parseColor("#8C18171C"));
            int i12 = typedArrayObtainStyledAttributes.getInt(R.styleable.IndicatorView_vpi_orientation, 0);
            float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.IndicatorView_vpi_slider_radius, dh.a.a(8.0f));
            bVar.n(color);
            bVar.s(color2);
            bVar.u(i12);
            bVar.r(i11);
            bVar.x(i10);
            float f10 = dimension * 2.0f;
            bVar.D(f10, f10);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
