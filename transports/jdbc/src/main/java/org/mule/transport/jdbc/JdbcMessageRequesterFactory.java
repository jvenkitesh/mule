/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.transport.jdbc;

import org.mule.api.MuleException;
import org.mule.api.endpoint.InboundEndpoint;
import org.mule.api.transport.MessageRequester;
import org.mule.transport.AbstractMessageRequesterFactory;

/**
 * Creates JdbcMessageDispatchers.
 */
public class JdbcMessageRequesterFactory extends AbstractMessageRequesterFactory
{

    @Override
    public MessageRequester create(InboundEndpoint endpoint) throws MuleException
    {
        return new JdbcMessageRequester(endpoint);
    }

}
