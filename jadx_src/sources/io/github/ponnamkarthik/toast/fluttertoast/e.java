package io.github.ponnamkarthik.toast.fluttertoast;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toast$Callback;
import com.google.android.exoplayer2.source.rtsp.k0;
import com.meituan.robust.Constants;
import com.umeng.analytics.pro.ak;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.view.FlutterMain;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MethodCallHandlerImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lio/github/ponnamkarthik/toast/fluttertoast/e;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", "result", "Lkotlin/b2;", "onMethodCall", "Landroid/content/Context;", "b", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroid/widget/Toast;", ak.aF, "Landroid/widget/Toast;", "mToast", "<init>", "(Landroid/content/Context;)V", "fluttertoast_release"}, k = 1, mv = {1, 7, 1})
public final class e implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Toast mToast;

    /* JADX INFO: compiled from: MethodCallHandlerImpl.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"io/github/ponnamkarthik/toast/fluttertoast/e$a", "Landroid/widget/Toast$Callback;", "Lkotlin/b2;", "onToastHidden", "fluttertoast_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends Toast$Callback {
        a() {
        }

        @Override // android.widget.Toast$Callback
        public void onToastHidden() {
            super.onToastHidden();
            e.this.mToast = null;
        }
    }

    public e(@dl.d Context context) {
        f0.p(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(e this$0) {
        f0.p(this$0, "this$0");
        Toast toast = this$0.mToast;
        if (toast != null) {
            toast.show();
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@dl.d MethodCall call, @dl.d MethodChannel.Result result) {
        int i10;
        Toast toast;
        f0.p(call, "call");
        f0.p(result, "result");
        String str = call.method;
        if (!f0.g(str, "showToast")) {
            if (!f0.g(str, "cancel")) {
                result.notImplemented();
                return;
            }
            Toast toast2 = this.mToast;
            if (toast2 != null) {
                if (toast2 != null) {
                    toast2.cancel();
                }
                this.mToast = null;
            }
            result.success(Boolean.TRUE);
            return;
        }
        String strValueOf = String.valueOf(call.argument("msg"));
        String strValueOf2 = String.valueOf(call.argument(k0.f48801p));
        String strValueOf3 = String.valueOf(call.argument("gravity"));
        Number number = (Number) call.argument("bgcolor");
        Number number2 = (Number) call.argument("textcolor");
        Number number3 = (Number) call.argument(com.google.android.exoplayer2.text.ttml.d.J);
        String str2 = (String) call.argument("fontAsset");
        if (f0.g(strValueOf3, "top")) {
            i10 = 48;
        } else {
            i10 = f0.g(strValueOf3, com.google.android.exoplayer2.text.ttml.d.f49794m0) ? 17 : 80;
        }
        boolean zG = f0.g(strValueOf2, Constants.LONG);
        if (number != null) {
            Object systemService = this.context.getSystemService("layout_inflater");
            f0.n(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.toast_custom, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.text);
            textView.setText(strValueOf);
            Drawable drawable = this.context.getDrawable(R.drawable.corner);
            f0.m(drawable);
            f0.m(drawable);
            drawable.setColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN);
            textView.setBackground(drawable);
            if (number3 != null) {
                textView.setTextSize(number3.floatValue());
            }
            if (number2 != null) {
                textView.setTextColor(number2.intValue());
            }
            Toast toast3 = new Toast(this.context);
            this.mToast = toast3;
            toast3.setDuration(zG ? 1 : 0);
            if (str2 != null) {
                AssetManager assets = this.context.getAssets();
                f0.o(assets, "context.assets");
                String lookupKeyForAsset = FlutterMain.getLookupKeyForAsset(str2);
                f0.o(lookupKeyForAsset, "getLookupKeyForAsset(fontAsset)");
                textView.setTypeface(Typeface.createFromAsset(assets, lookupKeyForAsset));
            }
            Toast toast4 = this.mToast;
            if (toast4 != null) {
                toast4.setView(viewInflate);
            }
        } else {
            Toast toastMakeText = Toast.makeText(this.context, strValueOf, zG ? 1 : 0);
            this.mToast = toastMakeText;
            if (Build.VERSION.SDK_INT < 30) {
                View view = toastMakeText != null ? toastMakeText.getView() : null;
                f0.m(view);
                View viewFindViewById = view.findViewById(android.R.id.message);
                f0.o(viewFindViewById, "mToast?.view!!.findViewById(android.R.id.message)");
                TextView textView2 = (TextView) viewFindViewById;
                if (number3 != null) {
                    textView2.setTextSize(number3.floatValue());
                }
                if (number2 != null) {
                    textView2.setTextColor(number2.intValue());
                }
                if (str2 != null) {
                    AssetManager assets2 = this.context.getAssets();
                    f0.o(assets2, "context.assets");
                    String lookupKeyForAsset2 = FlutterMain.getLookupKeyForAsset(str2);
                    f0.o(lookupKeyForAsset2, "getLookupKeyForAsset(fontAsset)");
                    textView2.setTypeface(Typeface.createFromAsset(assets2, lookupKeyForAsset2));
                }
            }
        }
        try {
            if (i10 == 17) {
                Toast toast5 = this.mToast;
                if (toast5 != null) {
                    toast5.setGravity(i10, 0, 0);
                }
            } else if (i10 != 48) {
                Toast toast6 = this.mToast;
                if (toast6 != null) {
                    toast6.setGravity(i10, 0, 100);
                }
            } else {
                Toast toast7 = this.mToast;
                if (toast7 != null) {
                    toast7.setGravity(i10, 0, 100);
                }
            }
        } catch (Exception unused) {
        }
        Context context = this.context;
        if (context instanceof Activity) {
            f0.n(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).runOnUiThread(new Runnable() { // from class: io.github.ponnamkarthik.toast.fluttertoast.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.c(this.f119511b);
                }
            });
        } else {
            Toast toast8 = this.mToast;
            if (toast8 != null) {
                toast8.show();
            }
        }
        if (Build.VERSION.SDK_INT >= 30 && (toast = this.mToast) != null) {
            toast.addCallback(new a());
        }
        result.success(Boolean.TRUE);
    }
}
