package com.vivo.push.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import androidx.core.view.j1;

/* JADX INFO: compiled from: DefaultNotifyLayoutAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements BaseNotifyLayoutAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Resources f106670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f106671b;

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getNotificationLayout() {
        return this.f106670a.getIdentifier("push_notify", com.google.android.exoplayer2.text.ttml.d.f49813w, this.f106671b);
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getSuitIconId() {
        Resources resources;
        String str;
        String str2;
        if (j.f106674c) {
            resources = this.f106670a;
            str = this.f106671b;
            str2 = "notify_icon_rom30";
        } else if (j.f106673b) {
            resources = this.f106670a;
            str = this.f106671b;
            str2 = "notify_icon_rom20";
        } else {
            resources = this.f106670a;
            str = this.f106671b;
            str2 = "notify_icon";
        }
        return resources.getIdentifier(str2, "id", str);
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getTitleColor() {
        int iIntValue;
        try {
            iIntValue = ((Integer) z.a("com.android.internal.R$color", "vivo_notification_title_text_color")).intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            iIntValue = 0;
        }
        if (iIntValue > 0) {
            return this.f106670a.getColor(iIntValue);
        }
        boolean z10 = j.f106674c;
        if (z10) {
            return -1;
        }
        if (!j.f106673b) {
            return j1.f21601t;
        }
        if (z10) {
            return Color.parseColor("#ff999999");
        }
        return -1;
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final void init(Context context) {
        this.f106671b = context.getPackageName();
        this.f106670a = context.getResources();
    }
}
