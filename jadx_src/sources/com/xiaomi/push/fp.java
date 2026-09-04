package com.xiaomi.push;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.view.j1;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class fp extends fs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f107136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f107137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f107138c;

    public fp(Context context, String str) {
        super(context, str);
        this.f107136a = 16777216;
    }

    @Override // com.xiaomi.push.fs
    /* JADX INFO: renamed from: a */
    public fp setLargeIcon(Bitmap bitmap) {
        if (m388b() && bitmap != null) {
            if (bitmap.getWidth() != 984 || 184 > bitmap.getHeight() || bitmap.getHeight() > 1678) {
                com.xiaomi.channel.commonutils.logger.b.m62a("colorful notification banner image resolution error, must belong to [984*184, 984*1678]");
            } else {
                this.f107137b = bitmap;
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.fq
    /* JADX INFO: renamed from: a */
    public fp mo380a(String str) {
        if (m388b() && !TextUtils.isEmpty(str)) {
            try {
                this.f107136a = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.b.m62a("parse banner notification image text color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.fs, android.app.Notification.Builder
    /* JADX INFO: renamed from: a */
    public fs setLargeIcon(Bitmap bitmap) {
        return this;
    }

    @Override // com.xiaomi.push.fs
    /* JADX INFO: renamed from: a */
    protected String mo385a() {
        return "notification_banner";
    }

    @Override // com.xiaomi.push.fs, com.xiaomi.push.fq
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void mo378a() {
        if (!m388b() || this.f107137b == null) {
            m387b();
            return;
        }
        super.mo378a();
        Resources resources = a().getResources();
        String packageName = a().getPackageName();
        int iA = a(resources, WebviewFragment.f94370q4, "id", packageName);
        if (j.a(a()) >= 10) {
            m384a().setImageViewBitmap(iA, a(this.f107137b, 30.0f));
        } else {
            m384a().setImageViewBitmap(iA, this.f107137b);
        }
        int iA2 = a(resources, "icon", "id", packageName);
        if (this.f107138c != null) {
            m384a().setImageViewBitmap(iA2, this.f107138c);
        } else {
            a(iA2);
        }
        int iA3 = a(resources, "title", "id", packageName);
        m384a().setTextViewText(iA3, ((fs) this).f432a);
        Map<String, String> map = ((fs) this).f435a;
        if (map != null && this.f107136a == 16777216) {
            mo380a(map.get("notification_image_text_color"));
        }
        RemoteViews remoteViewsM384a = m384a();
        int i10 = this.f107136a;
        remoteViewsM384a.setTextColor(iA3, (i10 == 16777216 || !m386a(i10)) ? -1 : j1.f21601t);
        setCustomContentView(m384a());
        Bundle bundle = new Bundle();
        bundle.putBoolean("miui.customHeight", true);
        addExtras(bundle);
    }

    @Override // com.xiaomi.push.fs
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    protected boolean mo379a() {
        if (!j.m520a()) {
            return false;
        }
        Resources resources = a().getResources();
        String packageName = a().getPackageName();
        return (a(a().getResources(), WebviewFragment.f94370q4, "id", a().getPackageName()) == 0 || a(resources, "icon", "id", packageName) == 0 || a(resources, "title", "id", packageName) == 0 || j.a(a()) < 9) ? false : true;
    }

    public fp b(Bitmap bitmap) {
        if (m388b() && bitmap != null) {
            this.f107138c = bitmap;
        }
        return this;
    }

    @Override // com.xiaomi.push.fs
    protected String b() {
        return null;
    }
}
