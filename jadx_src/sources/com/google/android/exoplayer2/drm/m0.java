package com.google.android.exoplayer2.drm;

import java.util.UUID;

/* JADX INFO: compiled from: MediaDrmCallback.java */
/* JADX INFO: loaded from: classes7.dex */
public interface m0 {
    byte[] a(UUID uuid, b0.b bVar) throws MediaDrmCallbackException;

    byte[] b(UUID uuid, b0.h hVar) throws MediaDrmCallbackException;
}
