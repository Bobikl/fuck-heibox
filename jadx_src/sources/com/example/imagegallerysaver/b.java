package com.example.imagegallerysaver;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.n0;
import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.d;
import dl.e;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.internal.f0;
import kotlin.text.u;

/* JADX INFO: compiled from: ImageGallerySaverPlugin.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b(\u0010)J \u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002JM\u0010\u0015\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0013`\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J<\u0010\u0018\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0013`\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u0010\u001b\u001a\u00020\f2\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\u0016J\u001c\u0010 \u001a\u00020\f2\b\b\u0001\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u001f\u001a\u00020\u001eH\u0016J\u0012\u0010!\u001a\u00020\f2\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\u0016R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010&¨\u0006*"}, d2 = {"Lcom/example/imagegallerysaver/b;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "", "extension", "name", "Landroid/net/Uri;", ak.av, ak.aF, "Landroid/content/Context;", d.R, "fileUri", "Lkotlin/b2;", "f", "Landroid/graphics/Bitmap;", "bmp", "", "quality", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "e", "(Landroid/graphics/Bitmap;Ljava/lang/Integer;Ljava/lang/String;)Ljava/util/HashMap;", Progress.E, "d", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "onAttachedToEngine", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", "result", "onMethodCall", "onDetachedFromEngine", "Lio/flutter/plugin/common/MethodChannel;", "b", "Lio/flutter/plugin/common/MethodChannel;", "methodChannel", "Landroid/content/Context;", "applicationContext", "<init>", "()V", "image_gallery_saver_release"}, k = 1, mv = {1, 7, 1})
public final class b implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private MethodChannel methodChannel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @e
    private Context applicationContext;

    private final Uri a(String extension, String name) {
        ContentResolver contentResolver;
        if (name == null) {
            name = String.valueOf(System.currentTimeMillis());
        }
        String strC = c(extension);
        boolean z10 = strC != null && u.v2(strC, "video", false, 2, null);
        if (Build.VERSION.SDK_INT < 29) {
            File file = new File(Environment.getExternalStoragePublicDirectory(z10 ? Environment.DIRECTORY_MOVIES : Environment.DIRECTORY_PICTURES).getAbsolutePath());
            if (!file.exists()) {
                file.mkdir();
            }
            if (extension.length() > 0) {
                name = name + lg.a.f131414g + extension;
            }
            return Uri.fromFile(new File(file, name));
        }
        Uri uri = z10 ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", name);
        contentValues.put("relative_path", z10 ? Environment.DIRECTORY_MOVIES : Environment.DIRECTORY_PICTURES);
        if (!TextUtils.isEmpty(strC)) {
            contentValues.put("mime_type", strC);
        }
        Context context = this.applicationContext;
        if (context == null || (contentResolver = context.getContentResolver()) == null) {
            return null;
        }
        return contentResolver.insert(uri, contentValues);
    }

    static /* synthetic */ Uri b(b bVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return bVar.a(str, str2);
    }

    private final String c(String extension) {
        if (TextUtils.isEmpty(extension)) {
            return null;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String lowerCase = extension.toLowerCase(Locale.ROOT);
        f0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return singleton.getMimeTypeFromExtension(lowerCase);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f1  */
    private final HashMap<String, Object> d(String filePath, String name) throws Throwable {
        FileInputStream fileInputStream;
        Uri uri;
        OutputStream outputStream;
        boolean z10;
        OutputStream outputStreamOpenOutputStream;
        OutputStream outputStream2 = null;
        if (filePath == null) {
            return new c(false, null, "parameters error").g();
        }
        Context context = this.applicationContext;
        if (context == null) {
            return new c(false, null, "applicationContext null").g();
        }
        try {
            try {
                File file = new File(filePath);
                if (!file.exists()) {
                    return new c(false, null, filePath + " does not exist").g();
                }
                Uri uriA = a(FilesKt__UtilsKt.Y(file), name);
                if (uriA != null) {
                    try {
                        ContentResolver contentResolver = context.getContentResolver();
                        outputStreamOpenOutputStream = contentResolver != null ? contentResolver.openOutputStream(uriA) : null;
                        if (outputStreamOpenOutputStream != null) {
                            try {
                                fileInputStream = new FileInputStream(file);
                                try {
                                    byte[] bArr = new byte[10240];
                                    while (true) {
                                        int i10 = fileInputStream.read(bArr);
                                        if (i10 <= 0) {
                                            break;
                                        }
                                        outputStreamOpenOutputStream.write(bArr, 0, i10);
                                    }
                                    outputStreamOpenOutputStream.flush();
                                    z10 = true;
                                } catch (IOException e10) {
                                    e = e10;
                                    OutputStream outputStream3 = outputStreamOpenOutputStream;
                                    uri = uriA;
                                    e = e;
                                    outputStream = outputStream3;
                                    try {
                                        new c(false, null, e.toString()).g();
                                        if (outputStream != null) {
                                            outputStream.close();
                                        }
                                        if (fileInputStream != null) {
                                            fileInputStream.close();
                                        }
                                        uriA = uri;
                                        z10 = false;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        outputStream2 = outputStream;
                                        if (outputStream2 != null) {
                                            outputStream2.close();
                                        }
                                        if (fileInputStream != null) {
                                            fileInputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    outputStream2 = outputStreamOpenOutputStream;
                                    if (outputStream2 != null) {
                                        outputStream2.close();
                                    }
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (IOException e11) {
                                e = e11;
                                fileInputStream = null;
                            } catch (Throwable th4) {
                                th = th4;
                                fileInputStream = null;
                            }
                        } else {
                            z10 = false;
                            fileInputStream = null;
                        }
                    } catch (IOException e12) {
                        outputStream = null;
                        fileInputStream = null;
                        uri = uriA;
                        e = e12;
                    }
                } else {
                    z10 = false;
                    outputStreamOpenOutputStream = null;
                    fileInputStream = null;
                }
                if (outputStreamOpenOutputStream != null) {
                    outputStreamOpenOutputStream.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (!z10) {
                    return new c(false, null, "saveFileToGallery fail").g();
                }
                f(context, uriA);
                return new c(String.valueOf(uriA).length() > 0, String.valueOf(uriA), null).g();
            } catch (IOException e13) {
                e = e13;
                uri = null;
                outputStream = null;
                fileInputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00a6: MOVE (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:42:0x00a6 */
    private final HashMap<String, Object> e(Bitmap bmp, Integer quality, String name) throws Throwable {
        OutputStream outputStream;
        Uri uriA;
        OutputStream outputStreamOpenOutputStream;
        boolean z10;
        OutputStream outputStream2 = null;
        if (bmp == null || quality == null) {
            return new c(false, null, "parameters error").g();
        }
        Context context = this.applicationContext;
        if (context == null) {
            return new c(false, null, "applicationContext null").g();
        }
        try {
            try {
                try {
                    uriA = a("jpg", name);
                    if (uriA != null) {
                        try {
                            outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriA);
                            if (outputStreamOpenOutputStream != null) {
                                try {
                                    System.out.println((Object) ("ImageGallerySaverPlugin " + quality));
                                    bmp.compress(Bitmap.CompressFormat.JPEG, quality.intValue(), outputStreamOpenOutputStream);
                                    outputStreamOpenOutputStream.flush();
                                    z10 = true;
                                } catch (IOException e10) {
                                    e = e10;
                                    new c(false, null, e.toString()).g();
                                    if (outputStreamOpenOutputStream != null) {
                                        outputStreamOpenOutputStream.close();
                                    }
                                    bmp.recycle();
                                    z10 = false;
                                }
                            } else {
                                z10 = false;
                            }
                        } catch (IOException e11) {
                            e = e11;
                            outputStreamOpenOutputStream = null;
                        }
                    } else {
                        z10 = false;
                        outputStreamOpenOutputStream = null;
                    }
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.close();
                    }
                    bmp.recycle();
                } catch (Throwable th2) {
                    th = th2;
                    if (outputStream2 != null) {
                        outputStream2.close();
                    }
                    bmp.recycle();
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
                uriA = null;
                outputStreamOpenOutputStream = null;
            }
            if (!z10) {
                return new c(false, null, "saveImageToGallery fail").g();
            }
            f(context, uriA);
            return new c(String.valueOf(uriA).length() > 0, String.valueOf(uriA), null).g();
        } catch (Throwable th3) {
            th = th3;
            outputStream2 = outputStream;
        }
    }

    private final void f(Context context, Uri uri) {
        if (Build.VERSION.SDK_INT < 29) {
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(uri);
            context.sendBroadcast(intent);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@n0 @dl.d FlutterPlugin.FlutterPluginBinding binding) {
        f0.p(binding, "binding");
        this.applicationContext = binding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), "image_gallery_saver");
        this.methodChannel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@n0 @dl.d FlutterPlugin.FlutterPluginBinding binding) {
        f0.p(binding, "binding");
        this.applicationContext = null;
        MethodChannel methodChannel = this.methodChannel;
        if (methodChannel == null) {
            f0.S("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@n0 @dl.d MethodCall call, @n0 @dl.d MethodChannel.Result result) {
        f0.p(call, "call");
        f0.p(result, "result");
        String str = call.method;
        if (f0.g(str, "saveImageToGallery")) {
            byte[] bArr = (byte[]) call.argument("imageBytes");
            result.success(e(BitmapFactory.decodeByteArray(bArr == null ? new byte[0] : bArr, 0, bArr != null ? bArr.length : 0), (Integer) call.argument("quality"), (String) call.argument("name")));
        } else if (f0.g(str, "saveFileToGallery")) {
            result.success(d((String) call.argument("file"), (String) call.argument("name")));
        } else {
            result.notImplemented();
        }
    }
}
