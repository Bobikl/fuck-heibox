package com.alipay.zoloz.android.net;

/* JADX INFO: compiled from: FaceVerifyRpcFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: com.alipay.zoloz.android.net.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FaceVerifyRpcFactory.java */
    public static /* synthetic */ class C0302a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39593a;

        static {
            int[] iArr = new int[FaceVerifyRpcType.values().length];
            f39593a = iArr;
            try {
                iArr[FaceVerifyRpcType.FIN_TECH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39593a[FaceVerifyRpcType.MPAAS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static b a(FaceVerifyRpcType faceVerifyRpcType) {
        try {
            int i10 = C0302a.f39593a[faceVerifyRpcType.ordinal()];
            if (i10 == 1) {
                return (b) Class.forName("com.alipay.zoloz.android.fintech.net.impl.FinTechNetImpl").newInstance();
            }
            if (i10 != 2) {
                return null;
            }
            return new h6.a();
        } catch (Exception unused) {
            return null;
        }
    }
}
