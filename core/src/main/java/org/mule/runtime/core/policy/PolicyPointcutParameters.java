/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.runtime.core.policy;

import org.mule.runtime.api.component.ComponentIdentifier;

/**
 * This class defines a set of parameters related to the execution of a component. In particular to the execution of a source or
 * an operation.
 * 
 * These parameters will later by used during policy lookup in {@link PolicyProvider} to match it against a configured pointcut.
 * 
 * @since 4.0
 */
public class PolicyPointcutParameters {

  private final ComponentIdentifier componentIdentifier;
  private final String flowName;

  /**
   * Creates a new {@link PolicyPointcutParameters}
   *
   * @param flowName name of the flow where the source / operation is defined. Not empty.
   * @param componentIdentifier the component identifier. This is the namespace of the module were it is defined and the source /
   *        operation identifier.
   */
  public PolicyPointcutParameters(String flowName, ComponentIdentifier componentIdentifier) {
    this.flowName = flowName;
    this.componentIdentifier = componentIdentifier;
  }

  /**
   * @return the component identifier. This is the namespace of the module were it is defined and the source / operation
   *         identifier.
   */
  public final ComponentIdentifier getComponentIdentifier() {
    return componentIdentifier;
  }

  /**
   * @return the name of the flow where the source / operation is defined
   */
  public String getFlowName() {
    return flowName;
  }

}
