package com.heytap.msp.push.notification;

import android.app.Notification;
import android.app.Notification$BubbleMetadata;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.LocusId;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.annotation.l;
import androidx.annotation.v;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes7.dex */
public class PushNotification {

    public static class Builder extends Notification.Builder {
        private int autoDelete;
        private Icon icon;
        private int iconLevel;
        private int iconRes;
        private int importantLevel;
        private String messageId;
        private String statisticData;

        public Builder(Context context) {
            super(context);
        }

        @w0(api = 26)
        public Builder(Context context, String str) {
            super(context, str);
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder addAction(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            super.addAction(i10, charSequence, pendingIntent);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder addAction(Notification.Action action) {
            super.addAction(action);
            return this;
        }

        public Builder addExtraAutoDelete(int i10) {
            this.autoDelete = i10;
            return this;
        }

        public Builder addExtraImportanceLevel(int i10) {
            this.importantLevel = i10;
            return this;
        }

        public Builder addExtraMessageId(String str) {
            this.messageId = str;
            return this;
        }

        public Builder addExtraStatisticData(String str) {
            this.statisticData = str;
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder addExtras(Bundle bundle) {
            super.addExtras(bundle);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder addPerson(Person person) {
            super.addPerson(person);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder addPerson(String str) {
            super.addPerson(str);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder extend(Notification.Extender extender) {
            super.extend(extender);
            return this;
        }

        public int getAutoDelete() {
            return this.autoDelete;
        }

        public Icon getIcon() {
            return this.icon;
        }

        public int getIconLevel() {
            return this.iconLevel;
        }

        public int getIconRes() {
            return this.iconRes;
        }

        public int getImportantLevel() {
            return this.importantLevel;
        }

        public String getMessageId() {
            return this.messageId;
        }

        public String getStatisticData() {
            return this.statisticData;
        }

        @Override // android.app.Notification.Builder
        public Builder setActions(Notification.Action... actionArr) {
            super.setActions(actionArr);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setAllowSystemGeneratedContextualActions(boolean z10) {
            super.setAllowSystemGeneratedContextualActions(z10);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setAutoCancel(boolean z10) {
            super.setAutoCancel(z10);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setBadgeIconType(int i10) {
            super.setBadgeIconType(i10);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setBubbleMetadata(Notification$BubbleMetadata notification$BubbleMetadata) {
            super.setBubbleMetadata(notification$BubbleMetadata);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setCategory(String str) {
            super.setCategory(str);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setChannelId(String str) {
            super.setChannelId(str);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setChronometerCountDown(boolean z10) {
            super.setChronometerCountDown(z10);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setColor(int i10) {
            super.setColor(i10);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setColorized(boolean z10) {
            super.setColorized(z10);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setContent(RemoteViews remoteViews) {
            super.setContent(remoteViews);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setContentInfo(CharSequence charSequence) {
            super.setContentInfo(charSequence);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setContentIntent(PendingIntent pendingIntent) {
            super.setContentIntent(pendingIntent);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setContentText(CharSequence charSequence) {
            super.setContentText(charSequence);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setContentTitle(CharSequence charSequence) {
            super.setContentTitle(charSequence);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setCustomBigContentView(RemoteViews remoteViews) {
            super.setCustomBigContentView(remoteViews);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setCustomContentView(RemoteViews remoteViews) {
            super.setCustomContentView(remoteViews);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setCustomHeadsUpContentView(RemoteViews remoteViews) {
            super.setCustomHeadsUpContentView(remoteViews);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setDefaults(int i10) {
            super.setDefaults(i10);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setDeleteIntent(PendingIntent pendingIntent) {
            super.setDeleteIntent(pendingIntent);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setExtras(Bundle bundle) {
            super.setExtras(bundle);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setFullScreenIntent(PendingIntent pendingIntent, boolean z10) {
            super.setFullScreenIntent(pendingIntent, z10);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setGroup(String str) {
            super.setGroup(str);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setGroupAlertBehavior(int i10) {
            super.setGroupAlertBehavior(i10);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setGroupSummary(boolean z10) {
            super.setGroupSummary(z10);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setLargeIcon(Bitmap bitmap) {
            super.setLargeIcon(bitmap);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setLargeIcon(Icon icon) {
            super.setLargeIcon(icon);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setLights(@l int i10, int i11, int i12) {
            super.setLights(i10, i11, i12);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setLocalOnly(boolean z10) {
            super.setLocalOnly(z10);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setLocusId(LocusId locusId) {
            super.setLocusId(locusId);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setNumber(int i10) {
            super.setNumber(i10);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setOngoing(boolean z10) {
            super.setOngoing(z10);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setOnlyAlertOnce(boolean z10) {
            super.setOnlyAlertOnce(z10);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setPriority(int i10) {
            super.setPriority(i10);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setProgress(int i10, int i11, boolean z10) {
            super.setProgress(i10, i11, z10);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setPublicVersion(Notification notification) {
            super.setPublicVersion(notification);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setRemoteInputHistory(CharSequence[] charSequenceArr) {
            super.setRemoteInputHistory(charSequenceArr);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setSettingsText(CharSequence charSequence) {
            super.setSettingsText(charSequence);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setShortcutId(String str) {
            super.setShortcutId(str);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setShowWhen(boolean z10) {
            super.setShowWhen(z10);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setSmallIcon(@v int i10) {
            super.setSmallIcon(i10);
            this.iconRes = i10;
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setSmallIcon(@v int i10, int i11) {
            super.setSmallIcon(i10, i11);
            this.iconRes = i10;
            this.iconLevel = i11;
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setSmallIcon(Icon icon) {
            super.setSmallIcon(icon);
            this.icon = icon;
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setSortKey(String str) {
            super.setSortKey(str);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setSound(Uri uri) {
            super.setSound(uri);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setSound(Uri uri, int i10) {
            super.setSound(uri, i10);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setSound(Uri uri, AudioAttributes audioAttributes) {
            super.setSound(uri, audioAttributes);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setStyle(Notification.Style style) {
            super.setStyle(style);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setSubText(CharSequence charSequence) {
            super.setSubText(charSequence);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setTicker(CharSequence charSequence) {
            super.setTicker(charSequence);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setTicker(CharSequence charSequence, RemoteViews remoteViews) {
            super.setTicker(charSequence, remoteViews);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setTimeoutAfter(long j10) {
            super.setTimeoutAfter(j10);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setUsesChronometer(boolean z10) {
            super.setUsesChronometer(z10);
            return this;
        }

        @Override // android.app.Notification.Builder
        @Deprecated
        public Builder setVibrate(long[] jArr) {
            super.setVibrate(jArr);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setVisibility(int i10) {
            super.setVisibility(i10);
            return this;
        }

        @Override // android.app.Notification.Builder
        public Builder setWhen(long j10) {
            super.setWhen(j10);
            return this;
        }
    }
}
