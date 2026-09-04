package com.ss.android.ttvecamera.focusmanager;

import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.os.Build;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.TEFocusSettings;
import com.ss.android.ttvecamera.p;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: TEFocusManager.java */
/* JADX INFO: loaded from: classes9.dex */
public class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List<String> f97429h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @TECameraSettings.e
    private int f97433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f97434e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f97430a = 90;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final float f97431b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final float f97432c = 2.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<Camera.Area> f97435f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<Camera.Area> f97436g = new ArrayList();

    static {
        ArrayList arrayList = new ArrayList();
        f97429h = arrayList;
        arrayList.add("multilaser");
        arrayList.add("ms40");
    }

    public d(@TECameraSettings.e int i10) {
        this.f97433d = i10;
    }

    public List<Camera.Area> a(int i10, int i11, float f10, int i12, int i13, int i14, TEFocusSettings.CoordinatesMode coordinatesMode) {
        Rect rectC = c(i10, i11, f10, 90.0f, i12, i13, i14, coordinatesMode);
        if (this.f97435f.size() > 0) {
            this.f97435f.clear();
        }
        this.f97435f.add(new Camera.Area(rectC, 1000));
        return this.f97435f;
    }

    public List<Camera.Area> b(int i10, int i11, float f10, int i12, int i13, int i14, TEFocusSettings.CoordinatesMode coordinatesMode) {
        Rect rectC = c(i10, i11, f10, 180.0f, i12, i13, i14, coordinatesMode);
        if (this.f97436g.size() > 0) {
            this.f97436g.clear();
        }
        this.f97436g.add(new Camera.Area(rectC, 1000));
        return this.f97436g;
    }

    public Rect c(int i10, int i11, float f10, float f11, int i12, int i13, int i14, TEFocusSettings.CoordinatesMode coordinatesMode) {
        int iIntValue = Float.valueOf((f10 * f11) + 0.5f).intValue();
        int i15 = ((int) (((i12 * 2000) * 1.0f) / i10)) - 1000;
        int i16 = ((int) (((i13 * 2000) * 1.0f) / i11)) - 1000;
        if (this.f97434e == 1 && coordinatesMode == TEFocusSettings.CoordinatesMode.VIEW) {
            i15 = -i15;
        }
        int i17 = iIntValue / 2;
        int iF = p.f(i15 - i17, -1000, 1000);
        int iF2 = p.f(i16 - i17, -1000, 1000);
        Rect rect = new Rect();
        RectF rectF = new RectF(iF, iF2, p.e(iF + iIntValue), p.e(iF2 + iIntValue));
        Rect rect2 = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        Rect rect3 = new Rect(-1000, -1000, 1000, 1000);
        if (coordinatesMode == TEFocusSettings.CoordinatesMode.VIEW) {
            p.H(i14, rect3, rect2);
            rect = new Rect(rect2.left - 1000, rect2.top - 1000, rect2.right - 1000, rect2.bottom - 1000);
        } else if (coordinatesMode == TEFocusSettings.CoordinatesMode.ORIGINAL_FRAME) {
            rect = new Rect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        rect.left = p.e(rect.left);
        rect.right = p.e(rect.right);
        rect.top = p.e(rect.top);
        rect.bottom = p.e(rect.bottom);
        return rect;
    }

    public boolean d(Camera.Parameters parameters) {
        return (parameters == null || f97429h.contains(Build.BRAND.toLowerCase()) || parameters.getMaxNumFocusAreas() <= 0) ? false : true;
    }

    public boolean e(Camera.Parameters parameters, String str) {
        if (d(parameters)) {
            return parameters.getSupportedFocusModes().contains(str);
        }
        return false;
    }

    public boolean f(@TECameraSettings.c int i10, Camera.Parameters parameters) {
        return parameters != null && parameters.getMaxNumMeteringAreas() > 0;
    }

    public String g(@TECameraSettings.c int i10, Camera.Parameters parameters, boolean z10) {
        if (parameters == null) {
            return "";
        }
        this.f97434e = i10;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (i10 == 1) {
            if (z10 && supportedFocusModes.contains("continuous-video")) {
                return "continuous-video";
            }
            if (supportedFocusModes.contains("macro")) {
                return "macro";
            }
            if (!supportedFocusModes.contains("auto")) {
                return "";
            }
        } else {
            if (supportedFocusModes.contains("continuous-video")) {
                return "continuous-video";
            }
            if (supportedFocusModes.contains("continuous-picture")) {
                return "continuous-picture";
            }
            if (!supportedFocusModes.contains("auto")) {
                return "";
            }
        }
        return "auto";
    }
}
