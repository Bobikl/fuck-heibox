package fh;

import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import dl.d;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.u;

/* JADX INFO: compiled from: MethodCallHandlerImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lfh/c;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "", "", ak.av, "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", "result", "Lkotlin/b2;", "onMethodCall", "", "b", "()Z", "isEmulator", "Landroid/content/pm/PackageManager;", "packageManager", "Landroid/view/WindowManager;", "windowManager", "<init>", "(Landroid/content/pm/PackageManager;Landroid/view/WindowManager;)V", "device_info_plus_release"}, k = 1, mv = {1, 7, 1})
public final class c implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final PackageManager f118847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final WindowManager f118848c;

    public c(@d PackageManager packageManager, @d WindowManager windowManager) {
        f0.p(packageManager, "packageManager");
        f0.p(windowManager, "windowManager");
        this.f118847b = packageManager;
        this.f118848c = windowManager;
    }

    private final List<String> a() {
        FeatureInfo[] systemAvailableFeatures = this.f118847b.getSystemAvailableFeatures();
        f0.o(systemAvailableFeatures, "packageManager.systemAvailableFeatures");
        ArrayList arrayList = new ArrayList();
        for (FeatureInfo featureInfo : systemAvailableFeatures) {
            if (!(featureInfo.name == null)) {
                arrayList.add(featureInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList(t.Y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((FeatureInfo) it.next()).name);
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038  */
    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX WARN: Code duplicated, block: B:18:0x006d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0078  */
    /* JADX WARN: Code duplicated, block: B:22:0x0087  */
    /* JADX WARN: Code duplicated, block: B:24:0x0097  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x002c  */
    private final boolean b() {
        String FINGERPRINT;
        String HARDWARE;
        String MODEL;
        String MANUFACTURER;
        String PRODUCT;
        String BRAND = Build.BRAND;
        f0.o(BRAND, "BRAND");
        if (u.v2(BRAND, "generic", false, 2, null)) {
            String DEVICE = Build.DEVICE;
            f0.o(DEVICE, "DEVICE");
            if (!u.v2(DEVICE, "generic", false, 2, null)) {
                FINGERPRINT = Build.FINGERPRINT;
                f0.o(FINGERPRINT, "FINGERPRINT");
                if (!u.v2(FINGERPRINT, "generic", false, 2, null)) {
                    f0.o(FINGERPRINT, "FINGERPRINT");
                    if (!u.v2(FINGERPRINT, "unknown", false, 2, null)) {
                        HARDWARE = Build.HARDWARE;
                        f0.o(HARDWARE, "HARDWARE");
                        if (!StringsKt__StringsKt.W2(HARDWARE, "goldfish", false, 2, null)) {
                            f0.o(HARDWARE, "HARDWARE");
                            if (!StringsKt__StringsKt.W2(HARDWARE, "ranchu", false, 2, null)) {
                                MODEL = Build.MODEL;
                                f0.o(MODEL, "MODEL");
                                if (!StringsKt__StringsKt.W2(MODEL, "google_sdk", false, 2, null)) {
                                    f0.o(MODEL, "MODEL");
                                    if (!StringsKt__StringsKt.W2(MODEL, "Emulator", false, 2, null)) {
                                        f0.o(MODEL, "MODEL");
                                        if (!StringsKt__StringsKt.W2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                            MANUFACTURER = Build.MANUFACTURER;
                                            f0.o(MANUFACTURER, "MANUFACTURER");
                                            if (!StringsKt__StringsKt.W2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                                PRODUCT = Build.PRODUCT;
                                                f0.o(PRODUCT, "PRODUCT");
                                                if (!StringsKt__StringsKt.W2(PRODUCT, "sdk", false, 2, null)) {
                                                    f0.o(PRODUCT, "PRODUCT");
                                                    if (!StringsKt__StringsKt.W2(PRODUCT, "vbox86p", false, 2, null)) {
                                                        f0.o(PRODUCT, "PRODUCT");
                                                        if (!StringsKt__StringsKt.W2(PRODUCT, "emulator", false, 2, null)) {
                                                            f0.o(PRODUCT, "PRODUCT");
                                                            if (StringsKt__StringsKt.W2(PRODUCT, "simulator", false, 2, null)) {
                                                                return false;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            FINGERPRINT = Build.FINGERPRINT;
            f0.o(FINGERPRINT, "FINGERPRINT");
            if (!u.v2(FINGERPRINT, "generic", false, 2, null)) {
                f0.o(FINGERPRINT, "FINGERPRINT");
                if (!u.v2(FINGERPRINT, "unknown", false, 2, null)) {
                    HARDWARE = Build.HARDWARE;
                    f0.o(HARDWARE, "HARDWARE");
                    if (!StringsKt__StringsKt.W2(HARDWARE, "goldfish", false, 2, null)) {
                        f0.o(HARDWARE, "HARDWARE");
                        if (!StringsKt__StringsKt.W2(HARDWARE, "ranchu", false, 2, null)) {
                            MODEL = Build.MODEL;
                            f0.o(MODEL, "MODEL");
                            if (!StringsKt__StringsKt.W2(MODEL, "google_sdk", false, 2, null)) {
                                f0.o(MODEL, "MODEL");
                                if (!StringsKt__StringsKt.W2(MODEL, "Emulator", false, 2, null)) {
                                    f0.o(MODEL, "MODEL");
                                    if (!StringsKt__StringsKt.W2(MODEL, "Android SDK built for x86", false, 2, null)) {
                                        MANUFACTURER = Build.MANUFACTURER;
                                        f0.o(MANUFACTURER, "MANUFACTURER");
                                        if (!StringsKt__StringsKt.W2(MANUFACTURER, "Genymotion", false, 2, null)) {
                                            PRODUCT = Build.PRODUCT;
                                            f0.o(PRODUCT, "PRODUCT");
                                            if (!StringsKt__StringsKt.W2(PRODUCT, "sdk", false, 2, null)) {
                                                f0.o(PRODUCT, "PRODUCT");
                                                if (!StringsKt__StringsKt.W2(PRODUCT, "vbox86p", false, 2, null)) {
                                                    f0.o(PRODUCT, "PRODUCT");
                                                    if (!StringsKt__StringsKt.W2(PRODUCT, "emulator", false, 2, null)) {
                                                        f0.o(PRODUCT, "PRODUCT");
                                                        if (StringsKt__StringsKt.W2(PRODUCT, "simulator", false, 2, null)) {
                                                            return false;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@d MethodCall call, @d MethodChannel.Result result) {
        String serial;
        f0.p(call, "call");
        f0.p(result, "result");
        if (!call.method.equals("getDeviceInfo")) {
            result.notImplemented();
            return;
        }
        HashMap map = new HashMap();
        String BOARD = Build.BOARD;
        f0.o(BOARD, "BOARD");
        map.put("board", BOARD);
        String BOOTLOADER = Build.BOOTLOADER;
        f0.o(BOOTLOADER, "BOOTLOADER");
        map.put("bootloader", BOOTLOADER);
        String BRAND = Build.BRAND;
        f0.o(BRAND, "BRAND");
        map.put("brand", BRAND);
        String DEVICE = Build.DEVICE;
        f0.o(DEVICE, "DEVICE");
        map.put("device", DEVICE);
        String DISPLAY = Build.DISPLAY;
        f0.o(DISPLAY, "DISPLAY");
        map.put("display", DISPLAY);
        String FINGERPRINT = Build.FINGERPRINT;
        f0.o(FINGERPRINT, "FINGERPRINT");
        map.put("fingerprint", FINGERPRINT);
        String HARDWARE = Build.HARDWARE;
        f0.o(HARDWARE, "HARDWARE");
        map.put("hardware", HARDWARE);
        String HOST = Build.HOST;
        f0.o(HOST, "HOST");
        map.put("host", HOST);
        String ID = Build.ID;
        f0.o(ID, "ID");
        map.put("id", ID);
        String MANUFACTURER = Build.MANUFACTURER;
        f0.o(MANUFACTURER, "MANUFACTURER");
        map.put("manufacturer", MANUFACTURER);
        String MODEL = Build.MODEL;
        f0.o(MODEL, "MODEL");
        map.put(Constants.KEY_MODEL, MODEL);
        String PRODUCT = Build.PRODUCT;
        f0.o(PRODUCT, "PRODUCT");
        map.put("product", PRODUCT);
        int i10 = Build.VERSION.SDK_INT;
        String[] SUPPORTED_32_BIT_ABIS = Build.SUPPORTED_32_BIT_ABIS;
        f0.o(SUPPORTED_32_BIT_ABIS, "SUPPORTED_32_BIT_ABIS");
        map.put("supported32BitAbis", CollectionsKt__CollectionsKt.L(Arrays.copyOf(SUPPORTED_32_BIT_ABIS, SUPPORTED_32_BIT_ABIS.length)));
        String[] SUPPORTED_64_BIT_ABIS = Build.SUPPORTED_64_BIT_ABIS;
        f0.o(SUPPORTED_64_BIT_ABIS, "SUPPORTED_64_BIT_ABIS");
        map.put("supported64BitAbis", CollectionsKt__CollectionsKt.L(Arrays.copyOf(SUPPORTED_64_BIT_ABIS, SUPPORTED_64_BIT_ABIS.length)));
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        f0.o(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        map.put("supportedAbis", CollectionsKt__CollectionsKt.L(Arrays.copyOf(SUPPORTED_ABIS, SUPPORTED_ABIS.length)));
        String TAGS = Build.TAGS;
        f0.o(TAGS, "TAGS");
        map.put("tags", TAGS);
        String TYPE = Build.TYPE;
        f0.o(TYPE, "TYPE");
        map.put("type", TYPE);
        map.put("isPhysicalDevice", Boolean.valueOf(!b()));
        map.put("systemFeatures", a());
        HashMap map2 = new HashMap();
        String BASE_OS = Build.VERSION.BASE_OS;
        f0.o(BASE_OS, "BASE_OS");
        map2.put("baseOS", BASE_OS);
        map2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
        String SECURITY_PATCH = Build.VERSION.SECURITY_PATCH;
        f0.o(SECURITY_PATCH, "SECURITY_PATCH");
        map2.put("securityPatch", SECURITY_PATCH);
        String CODENAME = Build.VERSION.CODENAME;
        f0.o(CODENAME, "CODENAME");
        map2.put("codename", CODENAME);
        String INCREMENTAL = Build.VERSION.INCREMENTAL;
        f0.o(INCREMENTAL, "INCREMENTAL");
        map2.put("incremental", INCREMENTAL);
        String RELEASE = Build.VERSION.RELEASE;
        f0.o(RELEASE, "RELEASE");
        map2.put("release", RELEASE);
        map2.put("sdkInt", Integer.valueOf(i10));
        map.put("version", map2);
        Display defaultDisplay = this.f118848c.getDefaultDisplay();
        f0.o(defaultDisplay, "windowManager.defaultDisplay");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        HashMap map3 = new HashMap();
        map3.put("widthPx", Double.valueOf(displayMetrics.widthPixels));
        map3.put("heightPx", Double.valueOf(displayMetrics.heightPixels));
        map3.put("xDpi", Float.valueOf(displayMetrics.xdpi));
        map3.put("yDpi", Float.valueOf(displayMetrics.ydpi));
        map.put("displayMetrics", map3);
        if (i10 >= 26) {
            try {
                serial = Build.getSerial();
            } catch (SecurityException unused) {
                serial = "unknown";
            }
            f0.o(serial, "try {\n                  …UNKNOWN\n                }");
            map.put("serialNumber", serial);
        } else {
            String SERIAL = Build.SERIAL;
            f0.o(SERIAL, "SERIAL");
            map.put("serialNumber", SERIAL);
        }
        result.success(map);
    }
}
