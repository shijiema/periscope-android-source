// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package o;

import java.io.InputStream;

public interface uk
{

    public abstract String getKeyStorePassword();

    public abstract InputStream getKeyStoreStream();

    public abstract long getPinCreationTimeInMillis();

    public abstract String[] getPins();
}
