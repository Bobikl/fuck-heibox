package com.tencent.qcloud.core.http;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.tencent.qcloud.core.common.QCloudDigistListener;
import com.tencent.qcloud.core.common.QCloudProgressListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.b0;
import okhttp3.internal.Util;
import okhttp3.v;
import okhttp3.w;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public class MultipartStreamRequestBody extends b0 implements ProgressBody, QCloudDigistListener, ReactiveBody {
    private Map<String, String> bodyParameters = new LinkedHashMap();
    private String fileName;
    w multipartBody;
    private String name;
    StreamingRequestBody streamingRequestBody;

    public static class ExStreamingRequestBody extends StreamingRequestBody {
        protected ExStreamingRequestBody() {
        }

        static StreamingRequestBody bytes(byte[] bArr, String str, long j10, long j11) {
            ExStreamingRequestBody exStreamingRequestBody = new ExStreamingRequestBody();
            exStreamingRequestBody.bytes = bArr;
            exStreamingRequestBody.contentType = str;
            if (j10 < 0) {
                j10 = 0;
            }
            exStreamingRequestBody.offset = j10;
            exStreamingRequestBody.requiredLength = j11;
            return exStreamingRequestBody;
        }

        static StreamingRequestBody file(File file, String str) {
            return file(file, str, 0L, Long.MAX_VALUE);
        }

        static StreamingRequestBody file(File file, String str, long j10, long j11) {
            ExStreamingRequestBody exStreamingRequestBody = new ExStreamingRequestBody();
            exStreamingRequestBody.file = file;
            exStreamingRequestBody.contentType = str;
            if (j10 < 0) {
                j10 = 0;
            }
            exStreamingRequestBody.offset = j10;
            exStreamingRequestBody.requiredLength = j11;
            return exStreamingRequestBody;
        }

        static StreamingRequestBody steam(InputStream inputStream, File file, String str, long j10, long j11) {
            ExStreamingRequestBody exStreamingRequestBody = new ExStreamingRequestBody();
            exStreamingRequestBody.stream = inputStream;
            exStreamingRequestBody.contentType = str;
            exStreamingRequestBody.file = file;
            if (j10 < 0) {
                j10 = 0;
            }
            exStreamingRequestBody.offset = j10;
            exStreamingRequestBody.requiredLength = j11;
            return exStreamingRequestBody;
        }

        static StreamingRequestBody uri(Uri uri, ContentResolver contentResolver, String str, long j10, long j11) {
            ExStreamingRequestBody exStreamingRequestBody = new ExStreamingRequestBody();
            exStreamingRequestBody.uri = uri;
            exStreamingRequestBody.contentResolver = contentResolver;
            exStreamingRequestBody.contentType = str;
            if (j10 < 0) {
                j10 = 0;
            }
            exStreamingRequestBody.offset = j10;
            exStreamingRequestBody.requiredLength = j11;
            return exStreamingRequestBody;
        }

        static StreamingRequestBody url(URL url, String str, long j10, long j11) {
            ExStreamingRequestBody exStreamingRequestBody = new ExStreamingRequestBody();
            exStreamingRequestBody.url = url;
            exStreamingRequestBody.contentType = str;
            if (j10 < 0) {
                j10 = 0;
            }
            exStreamingRequestBody.offset = j10;
            exStreamingRequestBody.requiredLength = j11;
            return exStreamingRequestBody;
        }

        @Override // com.tencent.qcloud.core.http.StreamingRequestBody, okhttp3.b0
        public void writeTo(BufferedSink bufferedSink) throws Throwable {
            BufferedSource bufferedSource;
            InputStream inputStream = null;
            bufferedSourceBuffer = null;
            BufferedSource bufferedSourceBuffer = null;
            try {
                InputStream stream = getStream();
                if (stream != null) {
                    try {
                        bufferedSourceBuffer = Okio.buffer(Okio.source(stream));
                        long jContentLength = contentLength();
                        CountingSink countingSink = new CountingSink(bufferedSink, jContentLength, this.progressListener);
                        this.countingSink = countingSink;
                        BufferedSink bufferedSinkBuffer = Okio.buffer(countingSink);
                        if (jContentLength > 0) {
                            bufferedSinkBuffer.write(bufferedSourceBuffer, jContentLength);
                        } else {
                            bufferedSinkBuffer.writeAll(bufferedSourceBuffer);
                        }
                        bufferedSinkBuffer.flush();
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedSource = bufferedSourceBuffer;
                        inputStream = stream;
                        if (inputStream != null) {
                            Util.closeQuietly(inputStream);
                        }
                        if (bufferedSource != null) {
                            Util.closeQuietly(bufferedSource);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    Util.closeQuietly(stream);
                }
                if (bufferedSourceBuffer != null) {
                    Util.closeQuietly(bufferedSourceBuffer);
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedSource = null;
            }
        }
    }

    public void addMd5() throws IOException {
        try {
            this.bodyParameters.put("Content-MD5", onGetMd5());
        } catch (IOException e10) {
            throw e10;
        }
    }

    @Override // okhttp3.b0
    public long contentLength() throws IOException {
        return this.multipartBody.contentLength();
    }

    @Override // okhttp3.b0
    /* JADX INFO: renamed from: contentType */
    public v getContentType() {
        return this.multipartBody.getContentType();
    }

    @Override // com.tencent.qcloud.core.http.ReactiveBody
    public <T> void end(HttpResult<T> httpResult) throws IOException {
    }

    @Override // com.tencent.qcloud.core.http.ProgressBody
    public long getBytesTransferred() {
        StreamingRequestBody streamingRequestBody = this.streamingRequestBody;
        if (streamingRequestBody != null) {
            return streamingRequestBody.getBytesTransferred();
        }
        return 0L;
    }

    @Override // com.tencent.qcloud.core.common.QCloudDigistListener
    public String onGetMd5() throws IOException {
        StreamingRequestBody streamingRequestBody = this.streamingRequestBody;
        if (streamingRequestBody == null) {
            return null;
        }
        String strOnGetMd5 = streamingRequestBody.onGetMd5();
        this.bodyParameters.put("Content-MD5", strOnGetMd5);
        return strOnGetMd5;
    }

    @Override // com.tencent.qcloud.core.http.ReactiveBody
    public void prepare() {
        w.a aVar = new w.a();
        aVar.g(v.j("multipart/form-data"));
        for (Map.Entry<String, String> entry : this.bodyParameters.entrySet()) {
            aVar.a(entry.getKey(), entry.getValue());
        }
        aVar.b(this.name, this.fileName, this.streamingRequestBody);
        this.multipartBody = aVar.f();
    }

    public void setBodyParameters(Map<String, String> map) {
        if (map != null) {
            this.bodyParameters.putAll(map);
        }
    }

    public void setContent(String str, String str2, String str3, File file, long j10, long j11) {
        if (str2 != null) {
            this.name = str2;
        }
        this.fileName = str3;
        if (TextUtils.isEmpty(str)) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(file.getPath()));
        }
        this.streamingRequestBody = ExStreamingRequestBody.file(file, str, j10, j11);
    }

    public void setContent(String str, String str2, String str3, File file, InputStream inputStream, long j10, long j11) throws IOException {
        if (str2 != null) {
            this.name = str2;
        }
        this.fileName = str3;
        this.streamingRequestBody = ExStreamingRequestBody.steam(inputStream, file, str, j10, j11);
    }

    public void setContent(String str, String str2, String str3, byte[] bArr, long j10, long j11) {
        if (str2 != null) {
            this.name = str2;
        }
        this.fileName = str3;
        this.streamingRequestBody = ExStreamingRequestBody.bytes(bArr, str, j10, j11);
    }

    @Override // com.tencent.qcloud.core.http.ProgressBody
    public void setProgressListener(QCloudProgressListener qCloudProgressListener) {
        StreamingRequestBody streamingRequestBody = this.streamingRequestBody;
        if (streamingRequestBody != null) {
            streamingRequestBody.setProgressListener(qCloudProgressListener);
        }
    }

    public void setSign(String str) {
        if (str != null) {
            this.bodyParameters.put("Signature", str);
        }
    }

    @Override // okhttp3.b0
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        try {
            this.multipartBody.writeTo(bufferedSink);
        } finally {
            CountingSink countingSink = this.streamingRequestBody.countingSink;
            if (countingSink != null) {
                Util.closeQuietly(countingSink);
            }
        }
    }
}
