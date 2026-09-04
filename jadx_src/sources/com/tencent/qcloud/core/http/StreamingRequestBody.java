package com.tencent.qcloud.core.http;

import android.content.ContentResolver;
import android.net.Uri;
import com.tencent.qcloud.core.common.QCloudDigistListener;
import com.tencent.qcloud.core.common.QCloudProgressListener;
import com.tencent.qcloud.core.logger.QCloudLogger;
import com.tencent.qcloud.core.util.Base64Utils;
import com.tencent.qcloud.core.util.QCloudUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import okhttp3.b0;
import okhttp3.internal.Util;
import okhttp3.v;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public class StreamingRequestBody extends b0 implements ProgressBody, QCloudDigistListener {
    protected byte[] bytes;
    protected ContentResolver contentResolver;
    protected String contentType;
    protected CountingSink countingSink;
    protected File file;
    protected QCloudProgressListener progressListener;
    protected InputStream stream;
    protected Uri uri;
    protected URL url;
    protected long offset = 0;
    protected long requiredLength = -1;
    protected long contentRawLength = -1;
    private boolean deleteFileWhenComplete = false;

    protected StreamingRequestBody() {
    }

    static StreamingRequestBody bytes(byte[] bArr, String str, long j10, long j11) {
        StreamingRequestBody streamingRequestBody = new StreamingRequestBody();
        streamingRequestBody.bytes = bArr;
        streamingRequestBody.contentType = str;
        if (j10 < 0) {
            j10 = 0;
        }
        streamingRequestBody.offset = j10;
        streamingRequestBody.requiredLength = j11;
        return streamingRequestBody;
    }

    static StreamingRequestBody file(File file, String str) {
        return file(file, str, 0L, Long.MAX_VALUE);
    }

    static StreamingRequestBody file(File file, String str, long j10, long j11) {
        StreamingRequestBody streamingRequestBody = new StreamingRequestBody();
        streamingRequestBody.file = file;
        streamingRequestBody.contentType = str;
        if (j10 < 0) {
            j10 = 0;
        }
        streamingRequestBody.offset = j10;
        streamingRequestBody.requiredLength = j11;
        return streamingRequestBody;
    }

    static StreamingRequestBody steam(InputStream inputStream, File file, String str, long j10, long j11) {
        StreamingRequestBody streamingRequestBody = new StreamingRequestBody();
        streamingRequestBody.stream = inputStream;
        streamingRequestBody.contentType = str;
        streamingRequestBody.file = file;
        if (j10 < 0) {
            j10 = 0;
        }
        streamingRequestBody.offset = j10;
        streamingRequestBody.requiredLength = j11;
        streamingRequestBody.deleteFileWhenComplete = true;
        return streamingRequestBody;
    }

    static StreamingRequestBody uri(Uri uri, ContentResolver contentResolver, String str, long j10, long j11) {
        StreamingRequestBody streamingRequestBody = new StreamingRequestBody();
        streamingRequestBody.uri = uri;
        streamingRequestBody.contentResolver = contentResolver;
        streamingRequestBody.contentType = str;
        if (j10 < 0) {
            j10 = 0;
        }
        streamingRequestBody.offset = j10;
        streamingRequestBody.requiredLength = j11;
        return streamingRequestBody;
    }

    static StreamingRequestBody url(URL url, String str, long j10, long j11) {
        StreamingRequestBody streamingRequestBody = new StreamingRequestBody();
        streamingRequestBody.url = url;
        streamingRequestBody.contentType = str;
        if (j10 < 0) {
            j10 = 0;
        }
        streamingRequestBody.offset = j10;
        streamingRequestBody.requiredLength = j11;
        return streamingRequestBody;
    }

    @Override // okhttp3.b0
    public long contentLength() throws IOException {
        long contentRawLength = getContentRawLength();
        if (contentRawLength <= 0) {
            return Math.max(this.requiredLength, -1L);
        }
        long j10 = this.requiredLength;
        return j10 <= 0 ? Math.max(contentRawLength - this.offset, -1L) : Math.min(contentRawLength - this.offset, j10);
    }

    @Override // okhttp3.b0
    /* JADX INFO: renamed from: contentType */
    public v getContentType() {
        String str = this.contentType;
        if (str != null) {
            return v.j(str);
        }
        return null;
    }

    @Override // com.tencent.qcloud.core.http.ProgressBody
    public long getBytesTransferred() {
        CountingSink countingSink = this.countingSink;
        if (countingSink != null) {
            return countingSink.getTotalTransferred();
        }
        return 0L;
    }

    protected long getContentRawLength() throws IOException {
        if (this.contentRawLength < 0) {
            InputStream inputStream = this.stream;
            if (inputStream != null) {
                this.contentRawLength = inputStream.available();
            } else {
                File file = this.file;
                if (file != null) {
                    this.contentRawLength = file.length();
                } else {
                    byte[] bArr = this.bytes;
                    if (bArr != null) {
                        this.contentRawLength = bArr.length;
                    } else {
                        Uri uri = this.uri;
                        if (uri != null) {
                            this.contentRawLength = QCloudUtils.getUriContentLength2(uri, this.contentResolver);
                        }
                    }
                }
            }
        }
        return this.contentRawLength;
    }

    public QCloudProgressListener getProgressListener() {
        return this.progressListener;
    }

    public InputStream getStream() throws IOException {
        InputStream fileInputStream = null;
        if (this.bytes != null) {
            fileInputStream = new ByteArrayInputStream(this.bytes);
        } else {
            InputStream inputStream = this.stream;
            if (inputStream != null) {
                try {
                    saveInputStreamToTmpFile(inputStream, this.file);
                    InputStream inputStream2 = this.stream;
                    if (inputStream2 != null) {
                        Util.closeQuietly(inputStream2);
                    }
                    this.stream = null;
                    this.offset = 0L;
                    fileInputStream = new FileInputStream(this.file);
                } catch (Throwable th2) {
                    InputStream inputStream3 = this.stream;
                    if (inputStream3 != null) {
                        Util.closeQuietly(inputStream3);
                    }
                    this.stream = null;
                    this.offset = 0L;
                    throw th2;
                }
            } else if (this.file != null) {
                fileInputStream = new FileInputStream(this.file);
            } else {
                URL url = this.url;
                if (url != null) {
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    if (this.offset > 0) {
                        uRLConnectionOpenConnection.setRequestProperty("Range", "bytes=" + this.offset + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.offset + this.requiredLength);
                    }
                    fileInputStream = this.url.openStream();
                } else {
                    Uri uri = this.uri;
                    if (uri != null) {
                        fileInputStream = this.contentResolver.openInputStream(uri);
                    }
                }
            }
        }
        if (this.url == null && fileInputStream != null) {
            long j10 = this.offset;
            if (j10 > 0) {
                long jSkip = fileInputStream.skip(j10);
                if (jSkip < this.offset) {
                    QCloudLogger.w(QCloudHttpClient.HTTP_LOG_TAG, "skip  %d is small than offset %d", Long.valueOf(jSkip), Long.valueOf(this.offset));
                }
            }
        }
        return fileInputStream;
    }

    boolean isLargeData() {
        return (this.file == null && this.stream == null) ? false : true;
    }

    @Override // com.tencent.qcloud.core.common.QCloudDigistListener
    public String onGetMd5() throws IOException {
        try {
            try {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    byte[] bArr = this.bytes;
                    if (bArr != null) {
                        messageDigest.update(bArr, (int) this.offset, (int) contentLength());
                        return Base64Utils.encode(messageDigest.digest());
                    }
                    InputStream stream = getStream();
                    byte[] bArr2 = new byte[8192];
                    long jContentLength = contentLength();
                    while (jContentLength > 0) {
                        int i10 = stream.read(bArr2, 0, ((long) 8192) > jContentLength ? (int) jContentLength : 8192);
                        if (i10 == -1) {
                            break;
                        }
                        messageDigest.update(bArr2, 0, i10);
                        jContentLength -= (long) i10;
                    }
                    String strEncode = Base64Utils.encode(messageDigest.digest());
                    if (stream != null) {
                        Util.closeQuietly(stream);
                    }
                    return strEncode;
                } catch (NoSuchAlgorithmException e10) {
                    throw new IOException("unSupport Md5 algorithm", e10);
                }
            } catch (IOException e11) {
                throw e11;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                Util.closeQuietly((Closeable) null);
            }
            throw th2;
        }
    }

    public void release() {
        File file;
        if (!this.deleteFileWhenComplete || (file = this.file) == null) {
            return;
        }
        file.delete();
    }

    protected void saveInputStreamToTmpFile(InputStream inputStream, File file) throws Throwable {
        int i10;
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[8192];
                long jContentLength = contentLength();
                long j10 = 0;
                if (jContentLength < 0) {
                    jContentLength = Long.MAX_VALUE;
                }
                long j11 = this.offset;
                if (j11 > 0) {
                    inputStream.skip(j11);
                }
                while (j10 < jContentLength && (i10 = inputStream.read(bArr)) != -1) {
                    long j12 = i10;
                    fileOutputStream2.write(bArr, 0, (int) Math.min(j12, jContentLength - j10));
                    j10 += j12;
                }
                fileOutputStream2.flush();
                Util.closeQuietly(fileOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    Util.closeQuietly(fileOutputStream);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.tencent.qcloud.core.http.ProgressBody
    public void setProgressListener(QCloudProgressListener qCloudProgressListener) {
        this.progressListener = qCloudProgressListener;
    }

    @Override // okhttp3.b0
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
                    CountingSink countingSink2 = this.countingSink;
                    if (countingSink2 != null) {
                        Util.closeQuietly(countingSink2);
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
            CountingSink countingSink3 = this.countingSink;
            if (countingSink3 != null) {
                Util.closeQuietly(countingSink3);
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedSource = null;
        }
    }
}
