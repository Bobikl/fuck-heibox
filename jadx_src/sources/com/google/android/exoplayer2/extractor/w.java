package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.util.u0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: GaplessInfoHolder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f46208c = "com.apple.iTunes";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f46209d = "iTunSMPB";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f46210e = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46211a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46212b = -1;

    private boolean b(String str) {
        Matcher matcher = f46210e.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i10 = Integer.parseInt((String) u0.k(matcher.group(1)), 16);
            int i11 = Integer.parseInt((String) u0.k(matcher.group(2)), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f46211a = i10;
            this.f46212b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f46211a == -1 || this.f46212b == -1) ? false : true;
    }

    public boolean c(Metadata metadata) {
        for (int i10 = 0; i10 < metadata.d(); i10++) {
            Metadata.Entry entryC = metadata.c(i10);
            if (entryC instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entryC;
                if (f46209d.equals(commentFrame.f46907d) && b(commentFrame.f46908e)) {
                    return true;
                }
            } else if (entryC instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entryC;
                if (f46208c.equals(internalFrame.f46916c) && f46209d.equals(internalFrame.f46917d) && b(internalFrame.f46918e)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean d(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 <= 0 && i12 <= 0) {
            return false;
        }
        this.f46211a = i11;
        this.f46212b = i12;
        return true;
    }
}
