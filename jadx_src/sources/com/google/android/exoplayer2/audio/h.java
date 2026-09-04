package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.util.Arrays;

/* JADX INFO: compiled from: AudioCapabilities.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f44129c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f44130d = 48000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f44131e = new h(new int[]{2}, 8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h f44132f = new h(new int[]{2, 5, 6}, 8);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f44133g = {5, 6, 18, 17, 14, 7, 8};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f44134h = "external_surround_sound_enabled";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f44135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f44136b;

    /* JADX INFO: compiled from: AudioCapabilities.java */
    @androidx.annotation.w0(29)
    public static final class a {
        private a() {
        }

        @androidx.annotation.u
        public static int[] a() {
            ImmutableList.a aVarQ = ImmutableList.q();
            for (int i10 : h.f44133g) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i10).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                    aVarQ.a(Integer.valueOf(i10));
                }
            }
            aVarQ.a(2);
            return Ints.B(aVarQ.e());
        }
    }

    public h(@androidx.annotation.p0 int[] iArr, int i10) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f44135a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f44135a = new int[0];
        }
        this.f44136b = i10;
    }

    private static boolean b() {
        if (com.google.android.exoplayer2.util.u0.f51536a >= 17) {
            String str = com.google.android.exoplayer2.util.u0.f51538c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static h c(Context context) {
        return d(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    static h d(Context context, @androidx.annotation.p0 Intent intent) {
        if (b() && Settings.Global.getInt(context.getContentResolver(), f44134h, 0) == 1) {
            return f44132f;
        }
        if (com.google.android.exoplayer2.util.u0.f51536a < 29 || !(com.google.android.exoplayer2.util.u0.L0(context) || com.google.android.exoplayer2.util.u0.F0(context))) {
            return (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f44131e : new h(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return new h(a.a(), 8);
    }

    @androidx.annotation.p0
    static Uri e() {
        if (b()) {
            return Settings.Global.getUriFor(f44134h);
        }
        return null;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Arrays.equals(this.f44135a, hVar.f44135a) && this.f44136b == hVar.f44136b;
    }

    public int f() {
        return this.f44136b;
    }

    public boolean g(int i10) {
        return Arrays.binarySearch(this.f44135a, i10) >= 0;
    }

    public int hashCode() {
        return this.f44136b + (Arrays.hashCode(this.f44135a) * 31);
    }

    public String toString() {
        int i10 = this.f44136b;
        String string = Arrays.toString(this.f44135a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 67);
        sb2.append("AudioCapabilities[maxChannelCount=");
        sb2.append(i10);
        sb2.append(", supportedEncodings=");
        sb2.append(string);
        sb2.append("]");
        return sb2.toString();
    }
}
