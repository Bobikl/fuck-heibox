package com.tencent.qcloud.core.http;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.taobao.aranger.constant.Constants;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import okhttp3.b0;
import okhttp3.v;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RequestBodySerializer {

    public static final class BaseRequestBodyWrapper extends RequestBodySerializer {
        private final b0 body;

        public BaseRequestBodyWrapper(b0 b0Var) {
            this.body = b0Var;
        }

        @Override // com.tencent.qcloud.core.http.RequestBodySerializer
        public b0 body() {
            return this.body;
        }
    }

    public static RequestBodySerializer bytes(String str, byte[] bArr) {
        return bytes(str, bArr, 0L, -1L);
    }

    public static RequestBodySerializer bytes(String str, byte[] bArr, long j10, long j11) {
        return ((j11 > 0L ? 1 : (j11 == 0L ? 0 : -1)) < 0 ? ((long) bArr.length) - j10 : Math.min(j11, ((long) bArr.length) - j10)) < Constants.MAX_SIZE ? new BaseRequestBodyWrapper(b0.create(parseType(str), bArr)) : new BaseRequestBodyWrapper(StreamingRequestBody.bytes(bArr, str, j10, j11));
    }

    public static RequestBodySerializer file(String str, File file) {
        return file(str, file, 0L, -1L);
    }

    public static RequestBodySerializer file(String str, File file, long j10, long j11) {
        if (TextUtils.isEmpty(str)) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(file.getPath()));
        }
        return new BaseRequestBodyWrapper(StreamingRequestBody.file(file, str, j10, j11));
    }

    public static RequestBodySerializer multiPart(MultipartStreamRequestBody multipartStreamRequestBody) {
        return new BaseRequestBodyWrapper(multipartStreamRequestBody);
    }

    private static v parseType(String str) {
        if (str != null) {
            return v.j(str);
        }
        return null;
    }

    public static RequestBodySerializer stream(String str, File file, InputStream inputStream) {
        return stream(str, file, inputStream, 0L, -1L);
    }

    public static RequestBodySerializer stream(String str, File file, InputStream inputStream, long j10, long j11) {
        return new BaseRequestBodyWrapper(StreamingRequestBody.steam(inputStream, file, str, j10, j11));
    }

    public static RequestBodySerializer string(String str, String str2) {
        return new BaseRequestBodyWrapper(b0.create(parseType(str), str2));
    }

    public static RequestBodySerializer string(String str, ByteString byteString) {
        return new BaseRequestBodyWrapper(b0.create(parseType(str), byteString));
    }

    public static RequestBodySerializer uri(String str, Uri uri, Context context) {
        return uri(str, uri, context, 0L, -1L);
    }

    public static RequestBodySerializer uri(String str, Uri uri, Context context, long j10, long j11) {
        ContentResolver contentResolver = context.getContentResolver();
        if (TextUtils.isEmpty(str)) {
            str = contentResolver.getType(uri);
        }
        return new BaseRequestBodyWrapper(StreamingRequestBody.uri(uri, contentResolver, str, j10, j11));
    }

    public static RequestBodySerializer url(String str, URL url) {
        return url(str, url, 0L, -1L);
    }

    public static RequestBodySerializer url(String str, URL url, long j10, long j11) {
        if (TextUtils.isEmpty(str)) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(url.toString()));
        }
        return new BaseRequestBodyWrapper(StreamingRequestBody.url(url, str, j10, j11));
    }

    public static RequestBodySerializer wrap(b0 b0Var) {
        return new BaseRequestBodyWrapper(b0Var);
    }

    public abstract b0 body();
}
