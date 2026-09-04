package com.xiaomi.push;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi"})
public class fq extends Notification.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f107139a;

    public fq(Context context) {
        super(context);
        this.f107139a = context;
    }

    public int a(Resources resources, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return resources.getIdentifier(str, str2, str3);
    }

    public final int a(String str) {
        return a(a().getResources(), str, "id", a().getPackageName());
    }

    protected Context a() {
        return this.f107139a;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fq addExtras(Bundle bundle) {
        super.addExtras(bundle);
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fq setCustomContentView(RemoteViews remoteViews) {
        if (Build.VERSION.SDK_INT >= 24) {
            super.setCustomContentView(remoteViews);
        } else {
            super.setContent(remoteViews);
        }
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public fq mo380a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                bk.a((Object) this, "setColor", Integer.valueOf(Color.parseColor(str)));
            } catch (Exception e10) {
                com.xiaomi.channel.commonutils.logger.b.d("fail to set color. " + e10);
            }
        }
        return this;
    }

    public fq a(Map<String, String> map) {
        return this;
    }

    /* JADX INFO: renamed from: a */
    protected void mo378a() {
    }

    @Override // android.app.Notification.Builder
    public Notification build() {
        mo378a();
        return super.build();
    }
}
