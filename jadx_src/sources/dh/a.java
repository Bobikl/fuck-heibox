package dh;

import android.content.res.Resources;
import ch.b;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import xh.m;

/* JADX INFO: compiled from: IndicatorUtils.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Ldh/a;", "", "", "dpValue", "", ak.av, "Lch/b;", "indicatorOptions", "maxDiameter", UCropPlusActivity.ARG_INDEX, "b", ak.aF, "<init>", "()V", "indicator_release"}, k = 1, mv = {1, 4, 0})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f118516a = new a();

    private a() {
    }

    @m
    public static final int a(float dpValue) {
        Resources system = Resources.getSystem();
        f0.h(system, "Resources.getSystem()");
        return (int) ((dpValue * system.getDisplayMetrics().density) + 0.5f);
    }

    public final float b(@d b indicatorOptions, float maxDiameter, int index) {
        f0.q(indicatorOptions, "indicatorOptions");
        return (maxDiameter / 2) + ((indicatorOptions.getF35656i() + indicatorOptions.getF35654g()) * index);
    }

    public final float c(float maxDiameter) {
        return maxDiameter / 2;
    }
}
