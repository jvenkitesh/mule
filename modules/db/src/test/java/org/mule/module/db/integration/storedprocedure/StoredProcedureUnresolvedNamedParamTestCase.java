/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.db.integration.storedprocedure;

import org.mule.module.db.integration.config.AbstractConfigurationErrorTestCase;

import org.junit.Test;

public class StoredProcedureUnresolvedNamedParamTestCase extends AbstractConfigurationErrorTestCase
{

    @Override
    protected String getConfigFile()
    {
        return "integration/storedprocedure/stored-procedure-unresolved-named-param-config.xml";
    }

    @Test
    public void validatesNamedParameters() throws Exception
    {
        assertConfigurationError("Able to define a query with an unresolved named parameter", "type");
    }
}
