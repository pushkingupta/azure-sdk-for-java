/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import rx.Observable;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.WorkflowRunActionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing WorkflowRunActions.
 */
public interface WorkflowRunActions extends HasInner<WorkflowRunActionsInner> {
    /**
     * Lists a workflow run expression trace.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpressionRoot> listExpressionTracesAsync(String resourceGroupName, String workflowName, String runName, String actionName);

    /**
     * Gets a workflow run action.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkflowRunAction> getAsync(String resourceGroupName, String workflowName, String runName, String actionName);

    /**
     * Gets a list of workflow run actions.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkflowRunAction> listAsync(final String resourceGroupName, final String workflowName, final String runName);

}