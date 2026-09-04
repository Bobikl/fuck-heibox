package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;

/* JADX INFO: loaded from: classes7.dex */
public class UnrecognizedInputFormatException extends ParserException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f47449d;

    public UnrecognizedInputFormatException(String str, Uri uri) {
        super(str, null, false, 1);
        this.f47449d = uri;
    }
}
