package com.huawei.hms.hmsscankit;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.hmsscankit.api.IRemoteCreator;
import com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator;
import com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate;
import com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate;
import com.huawei.hms.ml.scan.HmsBuildBitmapOption;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanAnalyzerOptions;
import com.huawei.hms.ml.scan.HmsScanFrame;
import com.huawei.hms.ml.scan.HmsScanResult;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.s6;
import com.huawei.hms.scankit.p.u6;
import com.huawei.hms.scankit.p.w3;
import com.huawei.hms.scankit.p.w7;
import com.huawei.hms.scankit.p.x3;
import com.huawei.hms.scankit.p.y3;
import com.huawei.hms.scankit.p.y6;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.UUID;

/* JADX INFO: compiled from: RemoteDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile x3 f61131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile IRemoteDecoderDelegate f61132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile w3 f61133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile IRemoteFrameDecoderDelegate f61134d;

    /* JADX INFO: compiled from: RemoteDecoder.java */
    public class a extends SimpleDateFormat {
        a(String str) {
            super(str);
            setTimeZone(TimeZone.getTimeZone("UTC"));
        }
    }

    public static Bundle a(String str, int i10, int i11, int i12, HmsBuildBitmapOption hmsBuildBitmapOption) {
        Bundle bundle = new Bundle();
        bundle.putInt("contentLength", str == null ? -1 : str.length());
        bundle.putInt("scanType", i10);
        bundle.putInt("reqWidth", i11);
        bundle.putInt("reqHeight", i12);
        bundle.putString("buildBitmapOption", hmsBuildBitmapOption == null ? "null" : hmsBuildBitmapOption.toString());
        bundle.putString("apiName", "BuildBitmap");
        bundle.putLong("callTime", System.currentTimeMillis());
        bundle.putString(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, UUID.randomUUID().toString());
        return bundle;
    }

    static HmsScanResult a(Context context, HmsScanFrame hmsScanFrame, HmsScanAnalyzerOptions hmsScanAnalyzerOptions) {
        HmsScan hmsScan;
        new HmsScanResult(4096, new HmsScan[0]);
        Log.d("Scankit", "use decodeCompatibility");
        if (f61134d == null) {
            Log.d("ScankitRemoteDecoder", "use remote decoder");
            a(context);
        }
        if (f61134d != null) {
            try {
                Bundle bundle = new Bundle();
                w3.c cVarA = null;
                bundle.putParcelable("Screen", new Point(hmsScanFrame.getWidth(), hmsScanFrame.getHeight()));
                bundle.putParcelable("Rect", new Rect(0, 0, hmsScanFrame.getWidth(), hmsScanFrame.getHeight()));
                bundle.putBoolean(DetailRect.SUPPORT_ROLLBACK, g.f61137c);
                bundle.putBoolean(DetailRect.USE_APK, g.f61135a);
                if (f61133c == null) {
                    try {
                        try {
                            f61133c = new w3(bundle, DetailRect.PHOTO_MODE);
                            f61133c.a(FilterGroup.TYPE_SINGLE);
                            cVarA = f61133c.a(false, hmsScanFrame.getHeight() * hmsScanFrame.getWidth());
                        } catch (RuntimeException unused) {
                            o4.b("ScankitRemoteDecoder", "RuntimeException");
                        }
                    } catch (Exception unused2) {
                        o4.b("ScankitRemoteDecoder", "Exception");
                    }
                }
                int iB = hmsScanAnalyzerOptions != null ? w7.b(hmsScanAnalyzerOptions.mode) : 8191;
                s6[] s6VarArrDecode = f61134d.decode(hmsScanFrame.getYuvImage().getYuvData(), hmsScanFrame.getWidth(), hmsScanFrame.getHeight(), 0, iB, ObjectWrapper.wrap(bundle));
                a(s6VarArrDecode);
                if (g.a()) {
                    o4.b("ScankitRemoteDecoder", "iRemoteFrameDecoderDelegate decode rollback");
                    a(context);
                    s6VarArrDecode = f61134d.decode(hmsScanFrame.getYuvImage().getYuvData(), hmsScanFrame.getWidth(), hmsScanFrame.getHeight(), 0, iB, ObjectWrapper.wrap(bundle));
                }
                HmsScan[] hmsScanArrA = y6.a(s6VarArrDecode);
                if (f61133c != null) {
                    f61133c.a(hmsScanArrA, cVarA);
                }
                return (hmsScanArrA.length == 0 || (hmsScan = hmsScanArrA[0]) == null || hmsScan.getOriginalValue() == null || hmsScanArrA[0].getOriginalValue().length() == 0) ? new HmsScanResult(4096, hmsScanArrA) : new HmsScanResult(0, hmsScanArrA);
            } catch (RemoteException unused3) {
                Log.e("Scankit", "RemoteException");
            }
        }
        return new HmsScanResult(4096, new HmsScan[0]);
    }

    static HmsScanResult a(Context context, byte[] bArr, int i10, int i11, HmsScanAnalyzerOptions hmsScanAnalyzerOptions) {
        HmsScanResult hmsScanResult = new HmsScanResult(4096, new HmsScan[0]);
        if (f61132b == null) {
            IRemoteCreator iRemoteCreatorC = g.c(context);
            if (iRemoteCreatorC == null) {
                return hmsScanResult;
            }
            try {
                f61132b = iRemoteCreatorC.newRemoteDecoderDelegate();
            } catch (RemoteException unused) {
                o4.b("ScankitRemoteDecoder", "RemoteException");
            }
        }
        if (f61132b == null) {
            return hmsScanResult;
        }
        try {
            Bundle bundle = new Bundle();
            if (hmsScanAnalyzerOptions != null) {
                bundle.putInt(DetailRect.FORMAT_FLAG, hmsScanAnalyzerOptions.mode);
                bundle.putBoolean(DetailRect.PHOTO_MODE, hmsScanAnalyzerOptions.photoMode);
                bundle.putBoolean(DetailRect.PARSE_RESULT, hmsScanAnalyzerOptions.parseResult);
            }
            bundle.putBoolean(DetailRect.SUPPORT_ROLLBACK, g.f61137c);
            bundle.putBoolean(DetailRect.USE_APK, g.f61135a);
            bundle.putInt(DetailRect.TYPE_TRANS, 3);
            bundle.putString(DetailRect.CP_PACKAGE, y3.b(context));
            bundle.putAll(y3.a(context));
            HmsScanResult hmsScanResultDecodeWithBuffer = f61132b.decodeWithBuffer(bArr, i10, i11, ObjectWrapper.wrap(bundle));
            if (hmsScanResultDecodeWithBuffer != null && hmsScanResultDecodeWithBuffer.getHmsScans() != null) {
                a(hmsScanResultDecodeWithBuffer.getHmsScans());
                if (g.a()) {
                    o4.d("ScankitRemoteDecoder", "iRemoteDecoderDelegate decodeWithBuffer rollback");
                    IRemoteCreator iRemoteCreatorC2 = g.c(context);
                    if (iRemoteCreatorC2 == null) {
                        return hmsScanResult;
                    }
                    try {
                        f61132b = iRemoteCreatorC2.newRemoteDecoderDelegate();
                    } catch (RemoteException unused2) {
                        o4.b("ScankitRemoteDecoder", "RemoteException");
                    }
                    hmsScanResultDecodeWithBuffer = f61132b.decodeWithBuffer(bArr, i10, i11, ObjectWrapper.wrap(bundle));
                }
            }
            return hmsScanResultDecodeWithBuffer != null ? hmsScanResultDecodeWithBuffer : hmsScanResult;
        } catch (RemoteException unused3) {
            o4.b("ScankitRemoteDecoder", "RemoteException");
            return hmsScanResult;
        }
    }

    public static void a(int i10, Bitmap bitmap, Bundle bundle) {
        if (bundle != null) {
            bundle.putInt("result", i10);
            bundle.putInt("outputWidth", bitmap == null ? -1 : bitmap.getWidth());
            bundle.putInt("outputHeight", bitmap != null ? bitmap.getHeight() : -1);
            long j10 = bundle.getLong("callTime");
            bundle.putLong(WiseOpenHianalyticsData.UNION_COSTTIME, System.currentTimeMillis() - j10);
            bundle.putString("callTime", new a("yyyyMMddHHmmss.SSS").format(Long.valueOf(j10)));
            a(bundle);
        }
    }

    static void a(Context context) {
        Object objNewInstance;
        try {
            try {
                context = g.e(context);
            } catch (NoSuchMethodException | InvocationTargetException unused) {
            }
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.hms.scankit.DecoderCreator");
            context.getClassLoader().loadClass("com.huawei.hms.scankit.aiscan.common.BarcodeFormat");
            objNewInstance = clsLoadClass.newInstance();
        } catch (ClassNotFoundException unused2) {
            o4.a("ScankitRemoteDecoder", "ClassNotFoundException");
            objNewInstance = null;
        } catch (IllegalAccessException unused3) {
            o4.a("ScankitRemoteDecoder", "IllegalAccessException");
            objNewInstance = null;
        } catch (InstantiationException unused4) {
            o4.a("ScankitRemoteDecoder", "InstantiationException");
            objNewInstance = null;
        }
        if (objNewInstance instanceof IBinder) {
            try {
                f61134d = IRemoteDecoderCreator.Stub.asInterface((IBinder) objNewInstance).newRemoteFrameDecoderDelegate();
            } catch (Exception unused5) {
                o4.a("ScankitRemoteDecoder", "remoteception");
            }
        }
    }

    private static void a(Bundle bundle) {
        if (DynamicModuleInitializer.getContext() == null) {
            try {
                g.b(AGConnectInstance.getInstance().getContext());
            } catch (ClassNotFoundException unused) {
                o4.b("ScankitRemoteDecoder", "buildBitmapLog ClassNotFoundException");
            } catch (IllegalAccessException unused2) {
                o4.b("ScankitRemoteDecoder", "buildBitmapLog IllegalAccessException");
            } catch (Exception unused3) {
                o4.b("ScankitRemoteDecoder", "buildBitmapLog Exception");
            } catch (NoClassDefFoundError unused4) {
                o4.b("ScankitRemoteDecoder", "buildBitmapLog NoClassDefFoundError");
                return;
            } catch (NoSuchMethodException unused5) {
                o4.b("ScankitRemoteDecoder", "buildBitmapLog NoSuchMethodException");
            } catch (InvocationTargetException unused6) {
                o4.b("ScankitRemoteDecoder", "buildBitmapLog InvocationTargetException");
            }
        }
        if (f61131a == null) {
            try {
                f61131a = new x3();
                f61131a.c(bundle);
            } catch (RuntimeException unused7) {
                o4.b("ScankitRemoteDecoder", "buildBitmapLog RuntimeException");
            } catch (Exception unused8) {
                o4.b("ScankitRemoteDecoder", "buildBitmapLog Exception");
            }
        }
    }

    public static void a(HmsScan[] hmsScanArr) {
        if (hmsScanArr.length == 1 && a(hmsScanArr[0].getCornerPoints())) {
            g.f61136b = true;
        } else {
            g.f61136b = false;
        }
    }

    public static void a(s6[] s6VarArr) {
        if (s6VarArr.length == 1 && a(s6VarArr[0].j())) {
            g.f61136b = true;
        } else {
            g.f61136b = false;
        }
    }

    private static boolean a(Point[] pointArr) {
        if (pointArr == null || pointArr.length == 0) {
            return false;
        }
        for (Point point : pointArr) {
            if (point.x != -2 && point.y != -2) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(u6[] u6VarArr) {
        if (u6VarArr == null || u6VarArr.length == 0) {
            return false;
        }
        for (u6 u6Var : u6VarArr) {
            if (u6Var.b() - (-2.0f) > 1.0E-4d && u6Var.c() - (-2.0f) > 1.0E-4d) {
                return false;
            }
        }
        return true;
    }

    static HmsScan[] a(Context context, Bitmap bitmap, HmsScanAnalyzerOptions hmsScanAnalyzerOptions) {
        return a(context, bitmap, hmsScanAnalyzerOptions, hmsScanAnalyzerOptions.mode);
    }

    static HmsScan[] a(Context context, Bitmap bitmap, HmsScanAnalyzerOptions hmsScanAnalyzerOptions, int i10) {
        HmsScan[] hmsScanArr = new HmsScan[0];
        if (f61132b == null) {
            IRemoteCreator iRemoteCreatorC = g.c(context);
            if (iRemoteCreatorC == null) {
                return hmsScanArr;
            }
            try {
                f61132b = iRemoteCreatorC.newRemoteDecoderDelegate();
            } catch (RemoteException unused) {
                o4.b("ScankitRemoteDecoder", "RemoteException");
            }
        }
        if (f61132b == null) {
            return hmsScanArr;
        }
        try {
            Bundle bundle = new Bundle();
            if (hmsScanAnalyzerOptions != null) {
                bundle.putInt(DetailRect.FORMAT_FLAG, i10);
                bundle.putBoolean(DetailRect.PHOTO_MODE, hmsScanAnalyzerOptions.photoMode);
                bundle.putBoolean(DetailRect.PARSE_RESULT, hmsScanAnalyzerOptions.parseResult);
            }
            bundle.putInt(DetailRect.TYPE_TRANS, 3);
            bundle.putString(DetailRect.CP_PACKAGE, y3.b(context));
            bundle.putBoolean(DetailRect.SUPPORT_ROLLBACK, g.f61137c);
            bundle.putBoolean(DetailRect.USE_APK, g.f61135a);
            bundle.putAll(y3.a(context));
            HmsScan[] hmsScanArrDecodeWithBitmap = f61132b.decodeWithBitmap(ObjectWrapper.wrap(bitmap), ObjectWrapper.wrap(bundle));
            a(hmsScanArrDecodeWithBitmap);
            if (g.a()) {
                o4.d("ScankitRemoteDecoder", "iRemoteDecoderDelegate decodeWithBitmap rollback");
                IRemoteCreator iRemoteCreatorC2 = g.c(context);
                if (iRemoteCreatorC2 == null) {
                    return hmsScanArr;
                }
                try {
                    f61132b = iRemoteCreatorC2.newRemoteDecoderDelegate();
                } catch (RemoteException unused2) {
                    o4.b("ScankitRemoteDecoder", "RemoteException");
                }
                hmsScanArrDecodeWithBitmap = f61132b.decodeWithBitmap(ObjectWrapper.wrap(bitmap), ObjectWrapper.wrap(bundle));
            }
            return hmsScanArrDecodeWithBitmap != null ? hmsScanArrDecodeWithBitmap : hmsScanArr;
        } catch (RemoteException unused3) {
            o4.b("ScankitRemoteDecoder", "RemoteException");
            return hmsScanArr;
        }
    }
}
