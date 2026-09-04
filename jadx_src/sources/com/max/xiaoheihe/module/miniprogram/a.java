package com.max.xiaoheihe.module.miniprogram;

import android.graphics.Bitmap;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.max.hbminiprogram.h;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;

/* JADX INFO: compiled from: MiniProgramHost.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface a extends h {

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.miniprogram.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MiniProgramHost.kt */
    public static final class C0840a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public static void a(@dl.d a aVar) {
        }

        public static boolean b(@dl.d a aVar) {
            return true;
        }

        public static void c(@dl.d a aVar, @e Fragment fragment) {
        }
    }

    void E0(@e WebProtocolObj webProtocolObj);

    @Override // com.max.hbminiprogram.h
    void a();

    int getRequestedOrientation();

    @Override // com.max.hbminiprogram.h
    void j(@e Fragment fragment);

    @Override // com.max.hbminiprogram.h
    boolean p();

    void q(@e WebView webView, @e Bitmap bitmap);

    void setRequestedOrientation(int i10);
}
