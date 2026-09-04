package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: DecodeFormatManager.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<BarcodeFormat> f62027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<BarcodeFormat> f62028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<BarcodeFormat> f62029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set<BarcodeFormat> f62030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set<BarcodeFormat> f62031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set<BarcodeFormat> f62032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set<BarcodeFormat> f62033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map<String, Set<BarcodeFormat>> f62034h;

    static {
        EnumSet enumSetOf = EnumSet.of(BarcodeFormat.QR_CODE);
        f62030d = enumSetOf;
        EnumSet enumSetOf2 = EnumSet.of(BarcodeFormat.AZTEC);
        f62031e = enumSetOf2;
        EnumSet enumSetOf3 = EnumSet.of(BarcodeFormat.DATA_MATRIX);
        f62032f = enumSetOf3;
        EnumSet enumSetOf4 = EnumSet.of(BarcodeFormat.PDF_417);
        f62033g = enumSetOf4;
        EnumSet enumSetOf5 = EnumSet.of(BarcodeFormat.CODE_39, BarcodeFormat.CODE_93, BarcodeFormat.CODE_128, BarcodeFormat.ITF, BarcodeFormat.CODABAR);
        f62029c = enumSetOf5;
        EnumSet enumSetOf6 = EnumSet.of(BarcodeFormat.UPC_A, BarcodeFormat.UPC_E, BarcodeFormat.EAN_13, BarcodeFormat.EAN_8);
        f62027a = enumSetOf6;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) enumSetOf6);
        f62028b = enumSetCopyOf;
        enumSetCopyOf.addAll(enumSetOf5);
        HashMap map = new HashMap();
        f62034h = map;
        map.put("ONE_D_MODE", enumSetCopyOf);
        map.put("QR_CODE_MODE", enumSetOf);
        map.put("PRODUCT_MODE", enumSetOf6);
        map.put("AZTEC_MODE", enumSetOf2);
        map.put("DATA_MATRIX_MODE", enumSetOf3);
        map.put("PDF417_MODE", enumSetOf4);
    }
}
