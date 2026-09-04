package com.max.xiaoheihe.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.ss.bytertc.engine.utils.LogUtil;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: LogInit.java */
/* JADX INFO: loaded from: classes13.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f95719a = 409600;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: LogInit.java */
    public class a implements jj.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // jj.a
        public boolean a(hj.d dVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, 48750, new Class[]{hj.d.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            dVar.f119201b = "Log4a-" + dVar.f119201b;
            return true;
        }
    }

    public static void a(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48749, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        a aVar = new a();
        me.pqpo.librarylog4a.appender.b bVarD = new me.pqpo.librarylog4a.appender.b.a().e(3).c(aVar).d();
        File externalFilesDir = context.getExternalFilesDir(LogUtil.DIR_TAIL);
        if (externalFilesDir == null) {
            externalFilesDir = new File(context.getFilesDir(), LogUtil.DIR_TAIL);
        }
        if (!externalFilesDir.exists()) {
            externalFilesDir.mkdir();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(externalFilesDir.getAbsolutePath());
        String str = File.separator;
        sb2.append(str);
        sb2.append(".logCache");
        hj.c.k(new me.pqpo.librarylog4a.logger.b.a().a(bVarD).a(new me.pqpo.librarylog4a.appender.d.a(context).p(externalFilesDir.getAbsolutePath() + str + new SimpleDateFormat("yyyy_MM_dd_HH_mm", Locale.getDefault()).format(new Date()) + ".txt").o(3).h(aVar).k(sb2.toString()).n(new ij.a()).m(false).l(f95719a).i()).b());
    }
}
