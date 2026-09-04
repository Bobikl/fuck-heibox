package com.xiaomi.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.view.j1;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class fr extends fs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f107140a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private PendingIntent f427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f107141b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private Bitmap f428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107142c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private CharSequence f429c;

    public fr(Context context, int i10, String str) {
        super(context, i10, str);
        this.f107140a = 16777216;
        this.f107141b = 16777216;
        this.f107142c = 16777216;
    }

    private Drawable a(int i10, int i11, int i12, float f10) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, null));
        shapeDrawable.getPaint().setColor(i10);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.setIntrinsicWidth(i11);
        shapeDrawable.setIntrinsicHeight(i12);
        return shapeDrawable;
    }

    private void a(RemoteViews remoteViews, int i10, int i11, int i12, boolean z10) {
        int iA = a(6.0f);
        remoteViews.setViewPadding(i10, iA, 0, iA, 0);
        if (z10) {
            remoteViews.setTextColor(i11, -1);
            remoteViews.setTextColor(i12, -1);
        } else {
            remoteViews.setTextColor(i11, j1.f21601t);
            remoteViews.setTextColor(i12, j1.f21601t);
        }
    }

    @Override // com.xiaomi.push.fs
    /* JADX INFO: renamed from: a */
    public fr setLargeIcon(Bitmap bitmap) {
        if (m388b() && bitmap != null) {
            if (bitmap.getWidth() != 984 || bitmap.getHeight() < 177 || bitmap.getHeight() > 207) {
                com.xiaomi.channel.commonutils.logger.b.m62a("colorful notification bg image resolution error, must [984*177, 984*207]");
            } else {
                this.f428b = bitmap;
            }
        }
        return this;
    }

    public fr a(CharSequence charSequence, PendingIntent pendingIntent) {
        if (m388b()) {
            super.addAction(0, charSequence, pendingIntent);
            this.f429c = charSequence;
            this.f427a = pendingIntent;
        }
        return this;
    }

    @Override // com.xiaomi.push.fq
    /* JADX INFO: renamed from: a */
    public fr mo380a(String str) {
        if (m388b() && !TextUtils.isEmpty(str)) {
            try {
                this.f107141b = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.b.m62a("parse colorful notification button bg color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.fs
    /* JADX INFO: renamed from: a */
    protected String mo385a() {
        return "notification_colorful";
    }

    @Override // com.xiaomi.push.fs, com.xiaomi.push.fq
    /* JADX INFO: renamed from: a */
    public void mo378a() {
        if (!m388b()) {
            m387b();
            return;
        }
        super.mo378a();
        Resources resources = a().getResources();
        String packageName = a().getPackageName();
        int iA = a(resources, "icon", "id", packageName);
        if (((fs) this).f430a == null) {
            a(iA);
        } else {
            m384a().setImageViewBitmap(iA, ((fs) this).f430a);
        }
        int iA2 = a(resources, "title", "id", packageName);
        int iA3 = a(resources, "content", "id", packageName);
        m384a().setTextViewText(iA2, ((fs) this).f432a);
        m384a().setTextViewText(iA3, ((fs) this).f437b);
        if (!TextUtils.isEmpty(this.f429c)) {
            int iA4 = a(resources, "buttonContainer", "id", packageName);
            int iA5 = a(resources, "button", "id", packageName);
            int iA6 = a(resources, "buttonBg", "id", packageName);
            m384a().setViewVisibility(iA4, 0);
            m384a().setTextViewText(iA5, this.f429c);
            m384a().setOnClickPendingIntent(iA4, this.f427a);
            if (this.f107141b != 16777216) {
                int iA7 = a(70.0f);
                int iA8 = a(29.0f);
                m384a().setImageViewBitmap(iA6, com.xiaomi.push.service.al.a(a(this.f107141b, iA7, iA8, iA8 / 2.0f)));
                m384a().setTextColor(iA5, m386a(this.f107141b) ? -1 : j1.f21601t);
            }
        }
        int iA9 = a(resources, WebviewFragment.f94370q4, "id", packageName);
        int iA10 = a(resources, com.google.android.exoplayer2.text.ttml.d.W, "id", packageName);
        if (this.f107140a != 16777216) {
            if (j.a(a()) >= 10) {
                m384a().setImageViewBitmap(iA9, com.xiaomi.push.service.al.a(a(this.f107140a, bb.c.b.Wf, 192, 30.0f)));
            } else {
                m384a().setImageViewBitmap(iA9, com.xiaomi.push.service.al.a(a(this.f107140a, bb.c.b.Wf, 192, 0.0f)));
            }
            a(m384a(), iA10, iA2, iA3, m386a(this.f107140a));
        } else if (this.f428b != null) {
            if (j.a(a()) >= 10) {
                m384a().setImageViewBitmap(iA9, a(this.f428b, 30.0f));
            } else {
                m384a().setImageViewBitmap(iA9, this.f428b);
            }
            Map<String, String> map = ((fs) this).f435a;
            if (map != null && this.f107142c == 16777216) {
                c(map.get("notification_image_text_color"));
            }
            int i10 = this.f107142c;
            a(m384a(), iA10, iA2, iA3, i10 == 16777216 || !m386a(i10));
        } else if (Build.VERSION.SDK_INT >= 24) {
            m384a().setViewVisibility(iA, 8);
            m384a().setViewVisibility(iA9, 8);
            try {
                bk.a((Object) this, "setStyle", C1339r.a(a(), "android.app.Notification$DecoratedCustomViewStyle").getConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.b.m62a("load class DecoratedCustomViewStyle failed");
            }
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("miui.customHeight", true);
        addExtras(bundle);
        setCustomContentView(m384a());
    }

    @Override // com.xiaomi.push.fs
    /* JADX INFO: renamed from: a */
    protected boolean mo379a() {
        if (!j.m520a()) {
            return false;
        }
        Resources resources = a().getResources();
        String packageName = a().getPackageName();
        return (a(resources, "icon", "id", packageName) == 0 || a(resources, "title", "id", packageName) == 0 || a(resources, "content", "id", packageName) == 0) ? false : true;
    }

    public fr b(String str) {
        if (m388b() && !TextUtils.isEmpty(str)) {
            try {
                this.f107140a = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.b.m62a("parse colorful notification bg color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.fs
    protected String b() {
        return "notification_colorful_copy";
    }

    public fr c(String str) {
        if (m388b() && !TextUtils.isEmpty(str)) {
            try {
                this.f107142c = Color.parseColor(str);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.b.m62a("parse colorful notification image text color error");
            }
        }
        return this;
    }
}
