// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.tls;

import org.spongycastle.crypto.params.AsymmetricKeyParameter;

// Referenced classes of package org.spongycastle.crypto.tls:
//            TlsCredentials

public interface TlsAgreementCredentials
    extends TlsCredentials
{

    public abstract byte[] _mth02CB(AsymmetricKeyParameter asymmetrickeyparameter);
}
