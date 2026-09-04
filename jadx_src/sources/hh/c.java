package hh;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PackageInfoPlugin.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¨\u0006\u001d"}, d2 = {"Lhh/c;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "", ak.aF, "Landroid/content/pm/PackageInfo;", "info", "", "d", "Landroid/content/pm/PackageManager;", "pm", "b", "", "sig", "e", "bytes", ak.av, "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "Lkotlin/b2;", "onAttachedToEngine", "onDetachedFromEngine", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", "result", "onMethodCall", "<init>", "()V", "package_info_plus_release"}, k = 1, mv = {1, 7, 1})
public final class c implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    public static final a f119176d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private static final String f119177e = "dev.fluttercommunity.plus/package_info";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private Context f119178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private MethodChannel f119179c;

    /* JADX INFO: compiled from: PackageInfoPlugin.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lhh/c$a;", "", "", "CHANNEL_NAME", "Ljava/lang/String;", "<init>", "()V", "package_info_plus_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    private final String a(byte[] bytes) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bytes.length * 2];
        int length = bytes.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = bytes[i10] & 255;
            int i12 = i10 * 2;
            cArr2[i12] = cArr[i11 >>> 4];
            cArr2[i12 + 1] = cArr[i11 & 15];
        }
        return new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007d  */
    private final String b(PackageManager pm) {
        boolean z10;
        String strE;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Context context = this.f119178b;
                f0.m(context);
                SigningInfo signingInfo = pm.getPackageInfo(context.getPackageName(), 134217728).signingInfo;
                if (signingInfo == null) {
                    return null;
                }
                if (signingInfo.hasMultipleSigners()) {
                    Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                    f0.o(apkContentsSigners, "signingInfo.apkContentsSigners");
                    byte[] byteArray = ((Signature) ArraysKt___ArraysKt.sc(apkContentsSigners)).toByteArray();
                    f0.o(byteArray, "signingInfo.apkContentsS…ers.first().toByteArray()");
                    strE = e(byteArray);
                } else {
                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    f0.o(signingCertificateHistory, "signingInfo.signingCertificateHistory");
                    byte[] byteArray2 = ((Signature) ArraysKt___ArraysKt.sc(signingCertificateHistory)).toByteArray();
                    f0.o(byteArray2, "signingInfo.signingCerti…ory.first().toByteArray()");
                    strE = e(byteArray2);
                }
            } else {
                Context context2 = this.f119178b;
                f0.m(context2);
                Signature[] signatures = pm.getPackageInfo(context2.getPackageName(), 64).signatures;
                if (signatures != null) {
                    z10 = signatures.length == 0;
                }
                if (z10) {
                    return null;
                }
                f0.o(signatures, "packageInfo.signatures");
                if (ArraysKt___ArraysKt.sc(signatures) == null) {
                    return null;
                }
                f0.o(signatures, "signatures");
                byte[] byteArray3 = ((Signature) ArraysKt___ArraysKt.sc(signatures)).toByteArray();
                f0.o(byteArray3, "signatures.first().toByteArray()");
                strE = e(byteArray3);
            }
            return strE;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private final String c() {
        Context context = this.f119178b;
        f0.m(context);
        PackageManager packageManager = context.getPackageManager();
        Context context2 = this.f119178b;
        f0.m(context2);
        String packageName = context2.getPackageName();
        return Build.VERSION.SDK_INT >= 30 ? packageManager.getInstallSourceInfo(packageName).getInitiatingPackageName() : packageManager.getInstallerPackageName(packageName);
    }

    private final long d(PackageInfo info) {
        return Build.VERSION.SDK_INT >= 28 ? info.getLongVersionCode() : info.versionCode;
    }

    private final String e(byte[] sig) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        messageDigest.update(sig);
        byte[] hashText = messageDigest.digest();
        f0.o(hashText, "hashText");
        return a(hashText);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@d FlutterPlugin.FlutterPluginBinding binding) {
        f0.p(binding, "binding");
        this.f119178b = binding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), f119177e);
        this.f119179c = methodChannel;
        f0.m(methodChannel);
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@d FlutterPlugin.FlutterPluginBinding binding) {
        f0.p(binding, "binding");
        this.f119178b = null;
        MethodChannel methodChannel = this.f119179c;
        f0.m(methodChannel);
        methodChannel.setMethodCallHandler(null);
        this.f119179c = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@d MethodCall call, @d MethodChannel.Result result) {
        f0.p(call, "call");
        f0.p(result, "result");
        try {
            if (!f0.g(call.method, "getAll")) {
                result.notImplemented();
                return;
            }
            Context context = this.f119178b;
            f0.m(context);
            PackageManager packageManager = context.getPackageManager();
            Context context2 = this.f119178b;
            f0.m(context2);
            PackageInfo info = packageManager.getPackageInfo(context2.getPackageName(), 0);
            f0.o(packageManager, "packageManager");
            String strB = b(packageManager);
            String strC = c();
            HashMap map = new HashMap();
            map.put("appName", info.applicationInfo.loadLabel(packageManager).toString());
            Context context3 = this.f119178b;
            f0.m(context3);
            map.put("packageName", context3.getPackageName());
            map.put("version", info.versionName);
            f0.o(info, "info");
            map.put("buildNumber", String.valueOf(d(info)));
            if (strB != null) {
                map.put("buildSignature", strB);
            }
            if (strC != null) {
                map.put("installerStore", strC);
            }
            result.success(map);
        } catch (PackageManager.NameNotFoundException e10) {
            result.error("Name not found", e10.getMessage(), null);
        }
    }
}
