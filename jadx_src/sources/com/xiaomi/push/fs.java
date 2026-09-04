package com.xiaomi.push;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fs extends fq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f107143a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected Bitmap f430a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private RemoteViews f431a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected CharSequence f432a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f433a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ArrayList<Notification.Action> f434a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected Map<String, String> f435a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f107144b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    protected CharSequence f437b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private boolean f438b;

    public fs(Context context, int i10, String str) {
        super(context);
        this.f434a = new ArrayList<>();
        this.f107144b = 0;
        this.f433a = str;
        this.f107143a = i10;
        m381c();
    }

    public fs(Context context, String str) {
        this(context, 0, str);
    }

    private Bitmap a() {
        return com.xiaomi.push.service.al.a(g.m392a(a(), this.f433a));
    }

    private String c() {
        boolean zE = e();
        this.f438b = zE;
        return zE ? b() : mo385a();
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    private void m381c() {
        int iA = a(a().getResources(), c(), com.google.android.exoplayer2.text.ttml.d.f49813w, a().getPackageName());
        if (iA == 0) {
            com.xiaomi.channel.commonutils.logger.b.m62a("create RemoteViews failed, no such layout resource was found");
        } else {
            this.f431a = new RemoteViews(a().getPackageName(), iA);
            this.f436a = mo379a();
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    private boolean m382c() {
        Map<String, String> map = this.f435a;
        return map != null && Boolean.parseBoolean(map.get("custom_builder_set_title"));
    }

    private void d() {
        super.setContentTitle(this.f432a);
        super.setContentText(this.f437b);
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    private boolean m383d() {
        return (TextUtils.isEmpty(b()) || TextUtils.isEmpty(this.f433a)) ? false : true;
    }

    private boolean e() {
        return m383d() && f();
    }

    private boolean f() {
        List<StatusBarNotification> listM720b = com.xiaomi.push.service.aw.a(a(), this.f433a).m720b();
        if (listM720b != null && !listM720b.isEmpty()) {
            for (StatusBarNotification statusBarNotification : listM720b) {
                if (statusBarNotification.getId() == this.f107143a) {
                    Notification notification = statusBarNotification.getNotification();
                    if (notification == null) {
                        return false;
                    }
                    return !notification.extras.getBoolean("mipush.customCopyLayout", true);
                }
            }
        }
        return false;
    }

    protected int a(float f10) {
        return (int) ((f10 * a().getResources().getDisplayMetrics().density) + 0.5f);
    }

    protected Bitmap a(Bitmap bitmap, float f10) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawRoundRect(new RectF(rect), f10, f10, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final RemoteViews m384a() {
        return this.f431a;
    }

    @Override // com.xiaomi.push.fq
    public fq a(Map<String, String> map) {
        this.f435a = map;
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fs addAction(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
        addAction(new Notification.Action(i10, charSequence, pendingIntent));
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fs addAction(Notification.Action action) {
        if (action != null) {
            this.f434a.add(action);
        }
        int i10 = this.f107144b;
        this.f107144b = i10 + 1;
        a(i10, action);
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fs setLargeIcon(Bitmap bitmap) {
        this.f430a = bitmap;
        return this;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fs setContentTitle(CharSequence charSequence) {
        this.f432a = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    protected abstract String mo385a();

    @Override // com.xiaomi.push.fq
    /* JADX INFO: renamed from: a */
    protected void mo378a() {
        super.mo378a();
        Bundle bundle = new Bundle();
        if (m383d()) {
            bundle.putBoolean("mipush.customCopyLayout", this.f438b);
        } else {
            bundle.putBoolean("mipush.customCopyLayout", false);
        }
        bundle.putBoolean("miui.customHeight", false);
        bundle.putBoolean("mipush.customNotification", true);
        bundle.putInt("mipush.customLargeIconId", a("large_icon"));
        if (this.f434a.size() > 0) {
            Notification.Action[] actionArr = new Notification.Action[this.f434a.size()];
            this.f434a.toArray(actionArr);
            bundle.putParcelableArray("mipush.customActions", actionArr);
        }
        if (m382c() || !com.xiaomi.push.service.ax.m722a(a().getContentResolver())) {
            d();
        } else {
            bundle.putCharSequence("mipush.customTitle", this.f432a);
            bundle.putCharSequence("mipush.customContent", this.f437b);
        }
        addExtras(bundle);
    }

    protected void a(int i10) {
        Bitmap bitmapA = a();
        if (bitmapA != null) {
            m384a().setImageViewBitmap(i10, bitmapA);
            return;
        }
        int iB = g.b(a(), this.f433a);
        if (iB != 0) {
            m384a().setImageViewResource(i10, iB);
        }
    }

    protected void a(int i10, Notification.Action action) {
    }

    /* JADX INFO: renamed from: a */
    protected abstract boolean mo379a();

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    protected final boolean m386a(int i10) {
        return ((((double) Color.red(i10)) * 0.299d) + (((double) Color.green(i10)) * 0.587d)) + (((double) Color.blue(i10)) * 0.114d) < 192.0d;
    }

    @Override // android.app.Notification.Builder
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public fs setContentText(CharSequence charSequence) {
        this.f437b = charSequence;
        return this;
    }

    protected abstract String b();

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    protected final void m387b() {
        super.setContentTitle(this.f432a);
        super.setContentText(this.f437b);
        Bitmap bitmap = this.f430a;
        if (bitmap != null) {
            super.setLargeIcon(bitmap);
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    protected final boolean m388b() {
        return this.f436a;
    }
}
