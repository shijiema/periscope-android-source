// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.hls;


// Referenced classes of package com.google.android.exoplayer.hls:
//            HlsSampleSource

class val.bytesLoaded
    implements Runnable
{

    final HlsSampleSource this$0;
    final long val$bytesLoaded;

    public void run()
    {
        HlsSampleSource.access$100(HlsSampleSource.this).onLoadCanceled(HlsSampleSource.access$000(HlsSampleSource.this), val$bytesLoaded);
    }

    entListener()
    {
        this$0 = final_hlssamplesource;
        val$bytesLoaded = J.this;
        super();
    }
}
