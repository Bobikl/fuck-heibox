package com.heytap.mcssdk;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.utils.e;
import com.heytap.mcssdk.utils.h;
import com.heytap.mcssdk.utils.i;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.mode.BaseMode;
import java.util.List;

/* JADX INFO: compiled from: PushParseHelper.java */
/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: compiled from: PushParseHelper.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f59874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Intent f59875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ IDataMessageCallBackService f59876d;

        a(Context context, Intent intent, IDataMessageCallBackService iDataMessageCallBackService) {
            this.f59874b = context;
            this.f59875c = intent;
            this.f59876d = iDataMessageCallBackService;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<BaseMode> listB = com.heytap.mcssdk.parser.c.b(this.f59874b, this.f59875c);
            if (listB == null) {
                return;
            }
            for (BaseMode baseMode : listB) {
                if (baseMode != null) {
                    for (com.heytap.mcssdk.processor.c cVar : d.P().U()) {
                        if (cVar != null) {
                            cVar.a(this.f59874b, baseMode, this.f59876d);
                        }
                    }
                }
            }
        }
    }

    public static void a(Context context, Intent intent, IDataMessageCallBackService iDataMessageCallBackService) {
        if (context == null) {
            e.d("context is null , please check param of parseIntent()");
            return;
        }
        if (intent == null) {
            e.d("intent is null , please check param of parseIntent()");
            return;
        }
        if (iDataMessageCallBackService == null) {
            e.d("callback is null , please check param of parseIntent()");
        } else if (i.h(context)) {
            h.a(new a(context, intent, iDataMessageCallBackService));
        } else {
            e.d("push is null ,please check system has push");
        }
    }
}
