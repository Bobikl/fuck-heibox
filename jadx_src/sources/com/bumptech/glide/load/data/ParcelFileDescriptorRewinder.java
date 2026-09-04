package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.n0;
import androidx.annotation.w0;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class ParcelFileDescriptorRewinder implements e<ParcelFileDescriptor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InternalRewinder f40835a;

    @w0(21)
    public static final class InternalRewinder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ParcelFileDescriptor f40836a;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f40836a = parcelFileDescriptor;
        }

        ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f40836a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f40836a;
            } catch (ErrnoException e10) {
                throw new IOException(e10);
            }
        }
    }

    @w0(21)
    public static final class a implements e.a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.e.a
        @n0
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @n0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<ParcelFileDescriptor> b(@n0 ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    @w0(21)
    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f40835a = new InternalRewinder(parcelFileDescriptor);
    }

    public static boolean c() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    @n0
    @w0(21)
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor a() throws IOException {
        return this.f40835a.rewind();
    }
}
